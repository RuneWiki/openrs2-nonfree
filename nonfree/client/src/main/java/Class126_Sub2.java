import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class126_Sub2 extends Class126 {

	@OriginalMember(owner = "client!td", name = "h", descriptor = "J")
	private long aLong195 = 0L;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "J")
	private long aLong194 = 0L;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "I")
	private int anInt5800 = 0;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "I")
	private int anInt5799 = 1;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "J")
	private long aLong196 = 0L;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class126_Sub2() {
		this.aLong194 = this.aLong195 = jagmisc.nanoTime();
		if (this.aLong195 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I")
	@Override
	public int method5255(@OriginalArg(0) int arg0) {
		@Pc(10) long local10 = (long) arg0 * 1000000L;
		this.aLong195 += this.method5113();
		if (this.aLong195 < this.aLong194) {
			Static105.method2138((this.aLong194 - this.aLong195) / 1000000L);
			this.aLong196 += this.aLong194 - this.aLong195;
			this.aLong195 += this.aLong194 - this.aLong195;
			this.aLong194 += local10;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			this.aLong194 += local10;
			local30++;
		} while (local30 < 10 && this.aLong195 > this.aLong194);
		if (this.aLong194 < this.aLong195) {
			this.aLong194 = this.aLong195;
		}
		return local30;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	@Override
	public void method5254() {
		this.aLong196 = 0L;
		if (this.aLong195 < this.aLong194) {
			this.aLong195 += this.aLong194 - this.aLong195;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)J")
	@Override
	public long method5252() {
		return this.aLong195;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)J")
	private long method5113() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(13) long local13 = local1 - this.aLong196;
		this.aLong196 = local1;
		if (local13 > -5000000000L && local13 < 5000000000L) {
			this.aLongArray8[this.anInt5800] = local13;
			this.anInt5800 = (this.anInt5800 + 1) % 10;
			if (this.anInt5799 < 1) {
				this.anInt5799++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt5799; local54++) {
			local52 += this.aLongArray8[(this.anInt5800 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt5799;
	}
}

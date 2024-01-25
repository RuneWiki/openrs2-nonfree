import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class129_Sub3 extends Class129 {

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "J")
	private long aLong238 = 0L;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "J")
	private long aLong239 = 0L;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
	private int anInt6388 = 1;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
	private int anInt6389 = 0;

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "J")
	private long aLong240 = 0L;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	public Class129_Sub3() {
		this.aLong239 = this.aLong238 = jagmisc.nanoTime();
		if (this.aLong238 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)J")
	private long method5347() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(13) long local13 = local1 - this.aLong240;
		this.aLong240 = local1;
		if (local13 > -5000000000L && local13 < 5000000000L) {
			this.aLongArray8[this.anInt6389] = local13;
			this.anInt6389 = (this.anInt6389 + 1) % 10;
			if (this.anInt6388 < 1) {
				this.anInt6388++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt6388; local54++) {
			local52 += this.aLongArray8[(this.anInt6389 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt6388;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)J")
	@Override
	public long method5345() {
		return this.aLong238;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I")
	@Override
	public int method5342(@OriginalArg(1) int arg0) {
		this.aLong238 += this.method5347();
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		if (this.aLong239 > this.aLong238) {
			Static270.method5481((this.aLong239 - this.aLong238) / 1000000L);
			this.aLong240 += this.aLong239 - this.aLong238;
			this.aLong238 += this.aLong239 - this.aLong238;
			this.aLong239 += local17;
			return 1;
		}
		@Pc(29) int local29 = 0;
		do {
			local29++;
			this.aLong239 += local17;
		} while (local29 < 10 && this.aLong239 < this.aLong238);
		if (this.aLong239 < this.aLong238) {
			this.aLong239 = this.aLong238;
		}
		return local29;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
	@Override
	public void method5343() {
		if (this.aLong238 < this.aLong239) {
			this.aLong238 += this.aLong239 - this.aLong238;
		}
		this.aLong240 = 0L;
	}
}

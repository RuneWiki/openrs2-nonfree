import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class36_Sub3 extends Class36 {

	@OriginalMember(owner = "client!iea", name = "j", descriptor = "J")
	private long aLong124 = 0L;

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "J")
	private long aLong125 = 0L;

	@OriginalMember(owner = "client!iea", name = "l", descriptor = "[J")
	private final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
	private int anInt4163 = 1;

	@OriginalMember(owner = "client!iea", name = "i", descriptor = "I")
	private int anInt4164 = 0;

	@OriginalMember(owner = "client!iea", name = "m", descriptor = "J")
	private long aLong126 = 0L;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "()V")
	private Class36_Sub3() {
		this.aLong124 = System.nanoTime();
		this.aLong125 = System.nanoTime();
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)J")
	private long method3810() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong126;
		this.aLong126 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray13[this.anInt4164] = local7;
			if (this.anInt4163 < 1) {
				this.anInt4163++;
			}
			this.anInt4164 = (this.anInt4164 + 1) % 10;
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt4163; local54++) {
			local52 += this.aLongArray13[(this.anInt4164 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt4163;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method3807(@OriginalArg(1) long arg0) {
		if (this.aLong124 < this.aLong125) {
			this.aLong126 += this.aLong125 - this.aLong124;
			this.aLong124 += this.aLong125 - this.aLong124;
			this.aLong125 += arg0;
			return 1;
		}
		@Pc(15) int local15 = 0;
		do {
			this.aLong125 += arg0;
			local15++;
		} while (local15 < 10 && this.aLong125 < this.aLong124);
		if (this.aLong124 > this.aLong125) {
			this.aLong125 = this.aLong124;
		}
		return local15;
	}

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "(B)J")
	@Override
	public long method3804() {
		return this.aLong124;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z)J")
	@Override
	protected long method3801() {
		this.aLong124 += this.method3810();
		return this.aLong124 >= this.aLong125 ? 0L : (this.aLong125 - this.aLong124) / 1000000L;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)V")
	@Override
	public void method3803() {
		this.aLong126 = 0L;
		if (this.aLong125 > this.aLong124) {
			this.aLong124 += this.aLong125 - this.aLong124;
		}
	}
}

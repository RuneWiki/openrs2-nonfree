import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class173_Sub1 extends Class173 {

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "J")
	private long aLong151 = 0L;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "J")
	private long aLong152 = 0L;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "J")
	private long aLong153 = 0L;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
	private int anInt5199 = 1;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
	private int anInt5200 = 0;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class173_Sub1() {
		this.aLong152 = System.nanoTime();
		this.aLong151 = System.nanoTime();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)J")
	@Override
	public long method5211() {
		return this.aLong152;
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)J")
	private long method3996() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong153;
		this.aLong153 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray5[this.anInt5200] = local7;
			if (this.anInt5199 < 1) {
				this.anInt5199++;
			}
			this.anInt5200 = (this.anInt5200 + 1) % 10;
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt5199; local53++) {
			local51 += this.aLongArray5[(this.anInt5200 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt5199;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	@Override
	public void method5213() {
		if (this.aLong152 < this.aLong151) {
			this.aLong152 += this.aLong151 - this.aLong152;
		}
		this.aLong153 = 0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I")
	@Override
	public int method5212(@OriginalArg(0) int arg0) {
		@Pc(9) long local9 = (long) arg0 * 1000000L;
		this.aLong152 += this.method3996();
		if (this.aLong151 > this.aLong152) {
			Static20.method1515((this.aLong151 - this.aLong152) / 1000000L);
			this.aLong153 += this.aLong151 - this.aLong152;
			this.aLong152 += this.aLong151 - this.aLong152;
			this.aLong151 += local9;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			local69++;
			this.aLong151 += local9;
		} while (local69 < 10 && this.aLong152 > this.aLong151);
		if (this.aLong152 > this.aLong151) {
			this.aLong151 = this.aLong152;
		}
		return local69;
	}
}

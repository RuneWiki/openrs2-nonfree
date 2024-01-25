import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class89_Sub2 extends Class89 {

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "J")
	private long aLong100 = 0L;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
	private int anInt3130 = 1;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
	private int anInt3131 = 0;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "J")
	private long aLong102 = 0L;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "J")
	private long aLong101 = 0L;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)J")
	private long method2795() {
		@Pc(4) long local4 = Static167.method2929() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong100;
		this.aLong100 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray3[this.anInt3131] = local9;
			this.anInt3131 = (this.anInt3131 + 1) % 10;
			if (this.anInt3130 < 10) {
				this.anInt3130++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt3130; local59++) {
			local52 += this.aLongArray3[(this.anInt3131 + 10 - local59) % 10];
		}
		return local52 / (long) this.anInt3130;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
	@Override
	public void method3424() {
		if (this.aLong101 < this.aLong102) {
			this.aLong101 += this.aLong102 - this.aLong101;
		}
		this.aLong100 = 0L;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I")
	@Override
	public int method3423(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong101 += this.method2795();
		if (this.aLong102 > this.aLong101) {
			Static77.method1653((this.aLong102 - this.aLong101) / 1000000L);
			this.aLong100 += this.aLong102 - this.aLong101;
			this.aLong101 += this.aLong102 - this.aLong101;
			this.aLong102 += local4;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			local69++;
			this.aLong102 += local4;
		} while (local69 < 10 && this.aLong102 < this.aLong101);
		if (this.aLong102 < this.aLong101) {
			this.aLong102 = this.aLong101;
		}
		return local69;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)J")
	@Override
	public long method3425() {
		return this.aLong101;
	}
}

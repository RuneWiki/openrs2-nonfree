import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class69_Sub2 extends Class69 {

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
	private int anInt3468;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
	private int anInt3458 = 0;

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
	private int anInt3466 = 256;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
	private int anInt3465 = 1;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "J")
	private long aLong161 = Static88.method1536();

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class69_Sub2() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray6[local22] = this.aLong161;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	@Override
	public void method2512() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray6[local7] = 0L;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
	@Override
	public int method2514(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt3466;
		this.anInt3466 = 300;
		@Pc(14) int local14 = this.anInt3465;
		this.anInt3465 = 1;
		this.aLong161 = Static88.method1536();
		if (this.aLongArray6[this.anInt3468] == 0L) {
			this.anInt3465 = local14;
			this.anInt3466 = local8;
		} else if (this.aLong161 > this.aLongArray6[this.anInt3468]) {
			this.anInt3466 = (int) ((long) (arg0 * 2560) / (this.aLong161 - this.aLongArray6[this.anInt3468]));
		}
		if (this.anInt3466 < 25) {
			this.anInt3466 = 25;
		}
		if (this.anInt3466 > 256) {
			this.anInt3466 = 256;
			this.anInt3465 = (int) ((long) arg0 - (this.aLong161 - this.aLongArray6[this.anInt3468]) / 10L);
		}
		if (this.anInt3465 > arg0) {
			this.anInt3465 = arg0;
		}
		this.aLongArray6[this.anInt3468] = this.aLong161;
		this.anInt3468 = (this.anInt3468 + 1) % 10;
		@Pc(132) int local132;
		if (this.anInt3465 > 1) {
			for (local132 = 0; local132 < 10; local132++) {
				if (this.aLongArray6[local132] != 0L) {
					this.aLongArray6[local132] += this.anInt3465;
				}
			}
		}
		if (arg1 > this.anInt3465) {
			this.anInt3465 = arg1;
		}
		Static166.method2609((long) this.anInt3465);
		local132 = 0;
		while (this.anInt3458 < 256) {
			this.anInt3458 += this.anInt3466;
			local132++;
		}
		this.anInt3458 &= 0xFF;
		return local132;
	}
}

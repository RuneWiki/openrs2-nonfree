import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class1_Sub8_Sub9 extends Class1_Sub8 {

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
	private int anInt2509 = 2048;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
	private int anInt2516 = 4096;

	@OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
	private int anInt2517 = 2048;

	@OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
	private int anInt2520 = 0;

	@OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
	private int anInt2521 = 8192;

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
	private int anInt2522 = 12288;

	@OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
	private int anInt2515 = 0;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(29) int local29 = Static134.anIntArray308[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static18.anInt439; local31++) {
				@Pc(39) int local39 = Static198.anIntArray749[local31] - 2048;
				@Pc(44) int local44 = this.anInt2509 + local39;
				@Pc(53) int local53 = local44 < -2048 ? local44 + 4096 : local44;
				@Pc(62) int local62 = local53 <= 2048 ? local53 : local53 - 4096;
				@Pc(67) int local67 = this.anInt2515 + local29;
				@Pc(78) int local78 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(87) int local87 = local78 <= 2048 ? local78 : local78 - 4096;
				@Pc(92) int local92 = this.anInt2520 + local39;
				@Pc(103) int local103 = local92 >= -2048 ? local92 : local92 + 4096;
				@Pc(114) int local114 = local103 <= 2048 ? local103 : local103 - 4096;
				@Pc(120) int local120 = local29 + this.anInt2517;
				@Pc(129) int local129 = local120 >= -2048 ? local120 : local120 + 4096;
				@Pc(138) int local138 = local129 > 2048 ? local129 - 4096 : local129;
				local11[local31] = this.method1827(local62, local87) || this.method1825(local114, local138) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
	@Override
	public void method6033() {
		Static9.method2255();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)Z")
	private boolean method1825(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt2522 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static311.anIntArray545[local12 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local22 << 12) / this.anInt2522;
		@Pc(44) int local44 = (local37 << 12) / this.anInt2521;
		@Pc(51) int local51 = local44 * this.anInt2516 >> 12;
		return local51 > arg1 - arg0 && -local51 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2509 = arg1.method1177();
		} else if (arg0 == 1) {
			this.anInt2515 = arg1.method1177();
		} else if (arg0 == 2) {
			this.anInt2520 = arg1.method1177();
		} else if (arg0 == 3) {
			this.anInt2517 = arg1.method1177();
		} else if (arg0 == 4) {
			this.anInt2522 = arg1.method1177();
		} else if (arg0 == 5) {
			this.anInt2516 = arg1.method1177();
		} else if (arg0 == 6) {
			this.anInt2521 = arg1.method1177();
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)Z")
	private boolean method1827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg1 - arg0) * this.anInt2522 >> 12;
		@Pc(23) int local23 = Static311.anIntArray545[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local23 << 12) / this.anInt2522;
		@Pc(42) int local42 = (local35 << 12) / this.anInt2521;
		@Pc(49) int local49 = local42 * this.anInt2516 >> 12;
		return local49 > arg0 + arg1 && arg1 + arg0 > -local49;
	}
}

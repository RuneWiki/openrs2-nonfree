import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class1_Sub3_Sub31 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
	private int anInt7330 = 0;

	@OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
	private int anInt7334 = 2048;

	@OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
	private int anInt7335 = 4096;

	@OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
	private int anInt7331 = 0;

	@OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
	private int anInt7338 = 2048;

	@OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
	private int anInt7339 = 8192;

	@OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
	private int anInt7337 = 12288;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7334 = arg0.method3967();
		} else if (arg1 == 1) {
			this.anInt7331 = arg0.method3967();
		} else if (arg1 == 2) {
			this.anInt7330 = arg0.method3967();
		} else if (arg1 == 3) {
			this.anInt7338 = arg0.method3967();
		} else if (arg1 == 4) {
			this.anInt7337 = arg0.method3967();
		} else if (arg1 == 5) {
			this.anInt7335 = arg0.method3967();
		} else if (arg1 == 6) {
			this.anInt7339 = arg0.method3967();
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(IZI)Z")
	private boolean method6130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt7337 * (arg1 - arg0) >> 12;
		@Pc(22) int local22 = Static274.anIntArray525[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt7337;
		@Pc(44) int local44 = (local29 << 12) / this.anInt7339;
		@Pc(51) int local51 = local44 * this.anInt7335 >> 12;
		return local51 > arg1 + arg0 && arg1 + arg0 > -local51;
	}

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V")
	@Override
	public void method7126() {
		Static52.method1027();
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)Z")
	private boolean method6131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = (arg0 + arg1) * this.anInt7337 >> 12;
		@Pc(28) int local28 = Static274.anIntArray525[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt7337;
		@Pc(42) int local42 = (local35 << 12) / this.anInt7339;
		@Pc(49) int local49 = this.anInt7335 * local42 >> 12;
		return local49 > arg1 - arg0 && arg1 - arg0 > -local49;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(23) int local23 = Static7.anIntArray20[arg0] - 2048;
			for (@Pc(25) int local25 = 0; local25 < Static452.anInt7734; local25++) {
				@Pc(33) int local33 = Static228.anIntArray442[local25] - 2048;
				@Pc(38) int local38 = this.anInt7334 + local33;
				@Pc(49) int local49 = local38 < -2048 ? local38 + 4096 : local38;
				@Pc(60) int local60 = local49 <= 2048 ? local49 : local49 - 4096;
				@Pc(65) int local65 = this.anInt7331 + local23;
				@Pc(74) int local74 = local65 >= -2048 ? local65 : local65 + 4096;
				@Pc(85) int local85 = local74 > 2048 ? local74 - 4096 : local74;
				@Pc(90) int local90 = this.anInt7330 + local33;
				@Pc(101) int local101 = local90 < -2048 ? local90 + 4096 : local90;
				@Pc(112) int local112 = local101 > 2048 ? local101 - 4096 : local101;
				@Pc(117) int local117 = this.anInt7338 + local23;
				@Pc(128) int local128 = local117 >= -2048 ? local117 : local117 + 4096;
				@Pc(137) int local137 = local128 <= 2048 ? local128 : local128 - 4096;
				local13[local25] = this.method6130(local60, local85) || this.method6131(local112, local137) ? 4096 : 0;
			}
		}
		return local13;
	}
}

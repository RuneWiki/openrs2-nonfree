import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!iu", name = "L", descriptor = "I")
	private int anInt3351 = 8192;

	@OriginalMember(owner = "client!iu", name = "J", descriptor = "I")
	private int anInt3349 = 2048;

	@OriginalMember(owner = "client!iu", name = "K", descriptor = "I")
	private int anInt3350 = 4096;

	@OriginalMember(owner = "client!iu", name = "I", descriptor = "I")
	private int anInt3348 = 12288;

	@OriginalMember(owner = "client!iu", name = "T", descriptor = "I")
	private int anInt3358 = 2048;

	@OriginalMember(owner = "client!iu", name = "U", descriptor = "I")
	private int anInt3359 = 0;

	@OriginalMember(owner = "client!iu", name = "Q", descriptor = "I")
	private int anInt3355 = 0;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V")
	@Override
	public void method5864() {
		Static4.method126();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BII)Z")
	private boolean method2880(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt3348 * (arg1 - arg0) >> 12;
		@Pc(22) int local22 = Static108.anIntArray110[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt3348;
		@Pc(36) int local36 = (local29 << 12) / this.anInt3351;
		@Pc(48) int local48 = this.anInt3350 * local36 >> 12;
		return arg1 + arg0 < local48 && -local48 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(IIB)Z")
	private boolean method2882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = (arg0 + arg1) * this.anInt3348 >> 12;
		@Pc(27) int local27 = Static108.anIntArray110[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt3348;
		@Pc(41) int local41 = (local34 << 12) / this.anInt3351;
		@Pc(48) int local48 = this.anInt3350 * local41 >> 12;
		return local48 > arg1 - arg0 && -local48 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(29) int local29 = Static285.anIntArray17[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static410.anInt7198; local31++) {
				@Pc(39) int local39 = Static400.anIntArray525[local31] - 2048;
				@Pc(44) int local44 = local39 + this.anInt3349;
				@Pc(53) int local53 = local44 < -2048 ? local44 + 4096 : local44;
				@Pc(64) int local64 = local53 > 2048 ? local53 - 4096 : local53;
				@Pc(69) int local69 = this.anInt3359 + local29;
				@Pc(78) int local78 = local69 < -2048 ? local69 + 4096 : local69;
				@Pc(87) int local87 = local78 <= 2048 ? local78 : local78 - 4096;
				@Pc(92) int local92 = local39 + this.anInt3355;
				@Pc(103) int local103 = local92 >= -2048 ? local92 : local92 + 4096;
				@Pc(112) int local112 = local103 > 2048 ? local103 - 4096 : local103;
				@Pc(117) int local117 = this.anInt3358 + local29;
				@Pc(126) int local126 = local117 < -2048 ? local117 + 4096 : local117;
				@Pc(135) int local135 = local126 <= 2048 ? local126 : local126 - 4096;
				local11[local31] = this.method2880(local64, local87) || this.method2882(local112, local135) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3349 = arg0.method4498();
		} else if (arg1 == 1) {
			this.anInt3359 = arg0.method4498();
		} else if (arg1 == 2) {
			this.anInt3355 = arg0.method4498();
		} else if (arg1 == 3) {
			this.anInt3358 = arg0.method4498();
		} else if (arg1 == 4) {
			this.anInt3348 = arg0.method4498();
		} else if (arg1 == 5) {
			this.anInt3350 = arg0.method4498();
		} else if (arg1 == 6) {
			this.anInt3351 = arg0.method4498();
		}
	}
}

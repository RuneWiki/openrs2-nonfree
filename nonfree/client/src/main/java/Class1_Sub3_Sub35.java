import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class1_Sub3_Sub35 extends Class1_Sub3 {

	@OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
	private int anInt6209 = 0;

	@OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
	private int anInt6211 = 4096;

	@OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
	private int anInt6212 = 2048;

	@OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
	private int anInt6210 = 8192;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
	private int anInt6207 = 12288;

	@OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
	private int anInt6208 = 2048;

	@OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
	private int anInt6220 = 0;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZII)Z")
	private boolean method5268(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt6207 * (arg1 + arg0) >> 12;
		@Pc(27) int local27 = Static31.anIntArray94[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt6207;
		@Pc(41) int local41 = (local34 << 12) / this.anInt6210;
		@Pc(48) int local48 = local41 * this.anInt6211 >> 12;
		return arg0 - arg1 < local48 && arg0 - arg1 > -local48;
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
	@Override
	public void method5535() {
		Static280.method4876();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt6212 = arg1.method4556();
		} else if (arg0 == 1) {
			this.anInt6220 = arg1.method4556();
		} else if (arg0 == 2) {
			this.anInt6209 = arg1.method4556();
		} else if (arg0 == 3) {
			this.anInt6208 = arg1.method4556();
		} else if (arg0 == 4) {
			this.anInt6207 = arg1.method4556();
		} else if (arg0 == 5) {
			this.anInt6211 = arg1.method4556();
		} else if (arg0 == 6) {
			this.anInt6210 = arg1.method4556();
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(29) int local29 = Static266.anIntArray454[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static153.anInt3378; local31++) {
				@Pc(39) int local39 = Static107.anIntArray234[local31] - 2048;
				@Pc(44) int local44 = local39 + this.anInt6212;
				@Pc(53) int local53 = local44 < -2048 ? local44 + 4096 : local44;
				@Pc(64) int local64 = local53 > 2048 ? local53 - 4096 : local53;
				@Pc(70) int local70 = local29 + this.anInt6220;
				@Pc(81) int local81 = local70 >= -2048 ? local70 : local70 + 4096;
				@Pc(92) int local92 = local81 <= 2048 ? local81 : local81 - 4096;
				@Pc(97) int local97 = this.anInt6209 + local39;
				@Pc(106) int local106 = local97 >= -2048 ? local97 : local97 + 4096;
				@Pc(115) int local115 = local106 > 2048 ? local106 - 4096 : local106;
				@Pc(120) int local120 = local29 + this.anInt6208;
				@Pc(129) int local129 = local120 < -2048 ? local120 + 4096 : local120;
				@Pc(138) int local138 = local129 <= 2048 ? local129 : local129 - 4096;
				local11[local31] = this.method5271(local64, local92) || this.method5268(local138, local115) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIZ)Z")
	private boolean method5271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt6207 * (arg1 - arg0) >> 12;
		@Pc(28) int local28 = Static31.anIntArray94[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt6207;
		@Pc(42) int local42 = (local35 << 12) / this.anInt6210;
		@Pc(49) int local49 = local42 * this.anInt6211 >> 12;
		return local49 > arg1 + arg0 && -local49 < arg0 + arg1;
	}
}

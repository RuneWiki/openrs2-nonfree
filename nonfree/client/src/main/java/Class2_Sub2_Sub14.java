import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ev", name = "I", descriptor = "I")
	private int anInt1705 = 1;

	@OriginalMember(owner = "client!ev", name = "O", descriptor = "I")
	private int anInt1709 = 1;

	static {
		new Class231("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1705 = arg0.method6138();
		} else if (arg1 == 1) {
			this.anInt1709 = arg0.method6138();
		} else if (arg1 == 2) {
			super.aBoolean518 = arg0.method6138() == 1;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(28) int local28 = this.anInt1709 + this.anInt1709 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt1705 + this.anInt1705 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt1709; local53 <= this.anInt1709 + arg0; local53++) {
				@Pc(63) int[][] local63 = this.method6276(0, Static71.anInt1203 & local53);
				@Pc(67) int[][] local67 = new int[3][Static398.anInt6955];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt1705; local89 <= this.anInt1705; local89++) {
					@Pc(95) int local95 = local89 & Static210.anInt3600;
					local71 += local81[local95];
					local69 += local77[local95];
					local73 += local85[local95];
				}
				@Pc(122) int[] local122 = local67[0];
				@Pc(126) int[] local126 = local67[1];
				@Pc(130) int[] local130 = local67[2];
				@Pc(132) int local132 = 0;
				while (Static398.anInt6955 > local132) {
					local122[local132] = local44 * local69 >> 16;
					local126[local132] = local71 * local44 >> 16;
					local130[local132] = local44 * local73 >> 16;
					@Pc(165) int local165 = local132 - this.anInt1705 & Static210.anInt3600;
					local71 -= local81[local165];
					local69 -= local77[local165];
					local73 -= local85[local165];
					local132++;
					@Pc(191) int local191 = this.anInt1705 + local132 & Static210.anInt3600;
					local73 += local85[local191];
					local69 += local77[local191];
					local71 += local81[local191];
				}
				local47[this.anInt1709 + local53 - arg0] = local67;
			}
			@Pc(237) int[] local237 = local16[0];
			@Pc(241) int[] local241 = local16[1];
			@Pc(245) int[] local245 = local16[2];
			for (local71 = 0; local71 < Static398.anInt6955; local71++) {
				local73 = 0;
				@Pc(253) int local253 = 0;
				@Pc(255) int local255 = 0;
				for (@Pc(257) int local257 = 0; local257 < local28; local257++) {
					@Pc(263) int[][] local263 = local47[local257];
					local253 += local263[1][local71];
					local73 += local263[0][local71];
					local255 += local263[2][local71];
				}
				local237[local71] = local73 * local32 >> 16;
				local241[local71] = local32 * local253 >> 16;
				local245[local71] = local255 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(28) int local28 = this.anInt1709 + this.anInt1709 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt1705 + this.anInt1705 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(68) int local68;
			for (@Pc(53) int local53 = arg0 - this.anInt1709; local53 <= this.anInt1709 + arg0; local53++) {
				@Pc(63) int[] local63 = this.method6266(0, local53 & Static71.anInt1203);
				@Pc(66) int[] local66 = new int[Static398.anInt6955];
				local68 = 0;
				for (@Pc(72) int local72 = -this.anInt1705; local72 <= this.anInt1705; local72++) {
					local68 += local63[Static210.anInt3600 & local72];
				}
				@Pc(93) int local93 = 0;
				while (local93 < Static398.anInt6955) {
					local66[local93] = local44 * local68 >> 16;
					local68 -= local63[Static210.anInt3600 & local93 - this.anInt1705];
					local93++;
					local68 += local63[Static210.anInt3600 & this.anInt1705 + local93];
				}
				local47[local53 + this.anInt1709 - arg0] = local66;
			}
			for (@Pc(152) int local152 = 0; local152 < Static398.anInt6955; local152++) {
				@Pc(156) int local156 = 0;
				for (local68 = 0; local68 < local28; local68++) {
					local156 += local47[local68][local152];
				}
				local16[local152] = local32 * local156 >> 16;
			}
		}
		return local16;
	}
}

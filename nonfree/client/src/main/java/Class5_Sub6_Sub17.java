import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class5_Sub6_Sub17 extends Class5_Sub6 {

	@OriginalMember(owner = "client!hca", name = "F", descriptor = "I")
	private int anInt3441 = 1;

	@OriginalMember(owner = "client!hca", name = "H", descriptor = "I")
	private int anInt3443 = 1;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3441 = arg0.method3642();
		} else if (arg1 == 1) {
			this.anInt3443 = arg0.method3642();
		} else if (arg1 == 2) {
			super.aBoolean718 = arg0.method3642() == 1;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(28) int local28 = this.anInt3443 + this.anInt3443 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt3441 + this.anInt3441 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(67) int local67;
			for (@Pc(52) int local52 = arg0 - this.anInt3443; local52 <= this.anInt3443 + arg0; local52++) {
				@Pc(62) int[] local62 = this.method8117(Static442.anInt7781 & local52, 0);
				@Pc(65) int[] local65 = new int[Static421.anInt7443];
				local67 = 0;
				for (@Pc(71) int local71 = -this.anInt3441; local71 <= this.anInt3441; local71++) {
					local67 += local62[local71 & Static575.anInt9380];
				}
				@Pc(88) int local88 = 0;
				while (Static421.anInt7443 > local88) {
					local65[local88] = local44 * local67 >> 16;
					local67 -= local62[Static575.anInt9380 & local88 - this.anInt3441];
					local88++;
					local67 += local62[local88 + this.anInt3441 & Static575.anInt9380];
				}
				local47[local52 + this.anInt3443 - arg0] = local65;
			}
			for (@Pc(152) int local152 = 0; local152 < Static421.anInt7443; local152++) {
				@Pc(156) int local156 = 0;
				for (local67 = 0; local67 < local28; local67++) {
					local156 += local47[local67][local152];
				}
				local16[local152] = local156 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(28) int local28 = this.anInt3443 + this.anInt3443 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt3441 + this.anInt3441 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt3443; local53 <= this.anInt3443 + arg0; local53++) {
				@Pc(63) int[][] local63 = this.method8116(0, Static442.anInt7781 & local53);
				@Pc(67) int[][] local67 = new int[3][Static421.anInt7443];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt3441; local89 <= this.anInt3441; local89++) {
					@Pc(95) int local95 = Static575.anInt9380 & local89;
					local71 += local81[local95];
					local73 += local85[local95];
					local69 += local77[local95];
				}
				@Pc(122) int[] local122 = local67[0];
				@Pc(126) int[] local126 = local67[1];
				@Pc(130) int[] local130 = local67[2];
				@Pc(132) int local132 = 0;
				while (Static421.anInt7443 > local132) {
					local122[local132] = local44 * local69 >> 16;
					local126[local132] = local44 * local71 >> 16;
					local130[local132] = local44 * local73 >> 16;
					@Pc(165) int local165 = local132 - this.anInt3441 & Static575.anInt9380;
					local73 -= local85[local165];
					local69 -= local77[local165];
					local71 -= local81[local165];
					local132++;
					@Pc(191) int local191 = local132 + this.anInt3441 & Static575.anInt9380;
					local71 += local81[local191];
					local69 += local77[local191];
					local73 += local85[local191];
				}
				local47[local53 + this.anInt3443 - arg0] = local67;
			}
			@Pc(236) int[] local236 = local16[0];
			@Pc(240) int[] local240 = local16[1];
			@Pc(244) int[] local244 = local16[2];
			for (local71 = 0; local71 < Static421.anInt7443; local71++) {
				local73 = 0;
				@Pc(252) int local252 = 0;
				@Pc(254) int local254 = 0;
				for (@Pc(256) int local256 = 0; local256 < local28; local256++) {
					@Pc(262) int[][] local262 = local47[local256];
					local254 += local262[2][local71];
					local73 += local262[0][local71];
					local252 += local262[1][local71];
				}
				local236[local71] = local73 * local32 >> 16;
				local240[local71] = local32 * local252 >> 16;
				local244[local71] = local32 * local254 >> 16;
			}
		}
		return local16;
	}
}

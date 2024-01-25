import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class1_Sub4_Sub19 extends Class1_Sub4 {

	@OriginalMember(owner = "client!iv", name = "I", descriptor = "I")
	private int anInt3188 = 1;

	@OriginalMember(owner = "client!iv", name = "K", descriptor = "I")
	private int anInt3190 = 1;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3190 = arg0.method5337();
		} else if (arg1 == 1) {
			this.anInt3188 = arg0.method5337();
		} else if (arg1 == 2) {
			super.aBoolean796 = arg0.method5337() == 1;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(28) int local28 = this.anInt3188 + this.anInt3188 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt3190 + this.anInt3190 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt3188; local53 <= this.anInt3188 + arg0; local53++) {
				@Pc(63) int[][] local63 = this.method5696(Static452.anInt7487 & local53, 0);
				@Pc(67) int[][] local67 = new int[3][Static395.anInt6592];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt3190; local89 <= this.anInt3190; local89++) {
					@Pc(95) int local95 = Static247.anInt4469 & local89;
					local69 += local77[local95];
					local71 += local81[local95];
					local73 += local85[local95];
				}
				@Pc(122) int[] local122 = local67[0];
				@Pc(126) int[] local126 = local67[1];
				@Pc(130) int[] local130 = local67[2];
				@Pc(132) int local132 = 0;
				while (Static395.anInt6592 > local132) {
					local122[local132] = local69 * local44 >> 16;
					local126[local132] = local44 * local71 >> 16;
					local130[local132] = local73 * local44 >> 16;
					@Pc(166) int local166 = Static247.anInt4469 & local132 - this.anInt3190;
					local71 -= local81[local166];
					local73 -= local85[local166];
					local132++;
					local69 -= local77[local166];
					@Pc(192) int local192 = local132 + this.anInt3190 & Static247.anInt4469;
					local73 += local85[local192];
					local69 += local77[local192];
					local71 += local81[local192];
				}
				local47[this.anInt3188 + local53 - arg0] = local67;
			}
			@Pc(238) int[] local238 = local16[0];
			@Pc(242) int[] local242 = local16[1];
			@Pc(246) int[] local246 = local16[2];
			for (local71 = 0; local71 < Static395.anInt6592; local71++) {
				local73 = 0;
				@Pc(254) int local254 = 0;
				@Pc(256) int local256 = 0;
				for (@Pc(258) int local258 = 0; local258 < local28; local258++) {
					@Pc(264) int[][] local264 = local47[local258];
					local73 += local264[0][local71];
					local256 += local264[2][local71];
					local254 += local264[1][local71];
				}
				local238[local71] = local73 * local32 >> 16;
				local242[local71] = local254 * local32 >> 16;
				local246[local71] = local32 * local256 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(29) int local29 = this.anInt3188 + this.anInt3188 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt3190 + this.anInt3190 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(68) int local68;
			for (@Pc(53) int local53 = arg0 - this.anInt3188; local53 <= this.anInt3188 + arg0; local53++) {
				@Pc(63) int[] local63 = this.method5695(Static452.anInt7487 & local53, 0);
				@Pc(66) int[] local66 = new int[Static395.anInt6592];
				local68 = 0;
				for (@Pc(72) int local72 = -this.anInt3190; local72 <= this.anInt3190; local72++) {
					local68 += local63[local72 & Static247.anInt4469];
				}
				@Pc(93) int local93 = 0;
				while (local93 < Static395.anInt6592) {
					local66[local93] = local68 * local45 >> 16;
					local68 -= local63[local93 - this.anInt3190 & Static247.anInt4469];
					local93++;
					local68 += local63[local93 + this.anInt3190 & Static247.anInt4469];
				}
				local48[this.anInt3188 + local53 - arg0] = local66;
			}
			for (@Pc(153) int local153 = 0; local153 < Static395.anInt6592; local153++) {
				@Pc(157) int local157 = 0;
				for (local68 = 0; local68 < local29; local68++) {
					local157 += local48[local68][local153];
				}
				local11[local153] = local33 * local157 >> 16;
			}
		}
		return local11;
	}
}

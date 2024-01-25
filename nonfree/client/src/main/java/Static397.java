import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "F")
	public static float aFloat151;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "[I")
	public static final int[] anIntArray458 = new int[14];

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_110 = new Class194(45, 4);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!gk;ILclient!gk;)V")
	public static void method5159(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(2) Class5_Sub2 arg1) {
		if (arg1.aClass5_Sub2_57 != null) {
			arg1.method6006();
		}
		arg1.aClass5_Sub2_58 = arg0.aClass5_Sub2_58;
		arg1.aClass5_Sub2_57 = arg0;
		arg1.aClass5_Sub2_57.aClass5_Sub2_58 = arg1;
		arg1.aClass5_Sub2_58.aClass5_Sub2_57 = arg1;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BIIIILclient!za;)V")
	public static void method5160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class200 arg4) {
		arg4.ba(arg3, arg1, arg0 + arg3, arg1 - -arg2);
		arg4.method5856(arg1, -16777216, arg0, arg2, arg3);
		if (Static35.anInt4183 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static98.anInt3331 / (float) Static98.anInt3334;
		@Pc(46) int local46 = arg0;
		@Pc(48) int local48 = arg2;
		if (local36 < 1.0F) {
			local48 = (int) (local36 * (float) arg0);
		} else {
			local46 = (int) ((float) arg2 / local36);
		}
		@Pc(75) int local75 = arg1 + (arg2 - local48) / 2;
		@Pc(84) int local84 = arg3 + (arg0 - local46) / 2;
		if (Static382.aClass49_22 == null || Static382.aClass49_22.YA() != arg0 || Static382.aClass49_22.ZA() != arg2) {
			Static98.method2668(Static98.anInt3332, Static98.anInt3331 + Static98.anInt3328, Static98.anInt3334 + Static98.anInt3332, Static98.anInt3328, local84, local75, local46 + local84, local75 - -local48);
			Static98.method2672(arg4);
			Static382.aClass49_22 = arg4.method5855(local84, local75, local46, local48, false);
		}
		Static382.aClass49_22.method5785(local84, local75);
		@Pc(132) int local132 = Static387.anInt6381 * local46 / Static98.anInt3334;
		@Pc(138) int local138 = local48 * Static37.anInt728 / Static98.anInt3331;
		@Pc(146) int local146 = local46 * Static404.anInt6787 / Static98.anInt3334 + local84;
		@Pc(161) int local161 = local75 + local48 - local48 * Static226.anInt3767 / Static98.anInt3331 - local138;
		@Pc(163) int local163 = -1996554240;
		if (Static217.aClass197_2 == Static369.aClass197_4) {
			local163 = -1996488705;
		}
		arg4.P(local146, local161, local132, local138, local163, 1);
		arg4.method5814(local146, local161, local132, local138, local163, 0);
		if (Static320.anInt4977 <= 0) {
			return;
		}
		@Pc(196) int local196;
		if (Static350.anInt5747 > 50) {
			local196 = 500 - Static350.anInt5747 * 5;
		} else {
			local196 = Static350.anInt5747 * 5;
		}
		for (@Pc(207) Class5_Sub8 local207 = (Class5_Sub8) Static98.aClass177_19.method3618(); local207 != null; local207 = (Class5_Sub8) Static98.aClass177_19.method3619()) {
			@Pc(215) Class6 local215 = Static98.aClass28_3.method670(local207.anInt953);
			if (Static396.method5142(local215)) {
				@Pc(244) int local244;
				@Pc(256) int local256;
				if (local207.anInt953 == Static54.anInt944) {
					local244 = local207.anInt948 * local46 / Static98.anInt3334 + local84;
					local256 = local48 * (Static98.anInt3331 - local207.anInt943) / Static98.anInt3331 + local75;
					arg4.method5856(local256 - 2, local196 << 24 | 0xFFFF00, 4, 4, local244 - 2);
				} else if (Static34.anInt675 != -1 && Static34.anInt675 == local215.anInt129) {
					local244 = local207.anInt948 * local46 / Static98.anInt3334 + local84;
					local256 = local48 * (Static98.anInt3331 - local207.anInt943) / Static98.anInt3331 + local75;
					arg4.method5856(local256 - 2, local196 << 24 | 0xFFFF00, 4, 4, local244 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!bs;I)Z")
	public static boolean method5161(@OriginalArg(0) Interface2 arg0) {
		@Pc(12) Class114 local12 = Static398.aClass256_4.method5782(arg0.method6037());
		if (local12.anInt2986 == -1) {
			return true;
		} else {
			@Pc(26) Class59 local26 = Static203.aClass51_4.method1140(local12.anInt2986);
			return local26.anInt1624 == -1 ? true : local26.method1325();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!rha", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray14;

	@OriginalMember(owner = "client!rha", name = "h", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_124 = new Class200(32, -1);

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(B)[Lclient!dj;")
	public static Class74[] method7320() {
		return new Class74[] { Static141.aClass74_6, Static41.aClass74_2, Static228.aClass74_9, Static264.aClass74_11, Static141.aClass74_5, Static329.aClass74_12, Static226.aClass74_4, Static231.aClass74_10, Static585.aClass74_15, Static205.aClass74_8, Static561.aClass74_14, Static37.aClass74_1, Static366.aClass74_13, Static158.aClass74_7 };
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!jc;II)Z")
	public static boolean method7323(@OriginalArg(0) Class3_Sub3_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method4276(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(103) int local103;
		@Pc(107) int local107;
		@Pc(113) int local113;
		if (local8 == 0) {
			if (arg0.method4276(1) != 0) {
				method7323(arg0, arg1);
			}
			local31 = arg0.method4276(6);
			local36 = arg0.method4276(6);
			@Pc(46) boolean local46 = arg0.method4276(1) == 1;
			if (local46) {
				Static586.anIntArray619[Static241.anInt4470++] = arg1;
			}
			if (Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(69) Class12 local69 = Static135.aClass12Array1[arg1];
			@Pc(77) Class4_Sub1_Sub2_Sub1_Sub2 local77 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[arg1] = new Class4_Sub1_Sub2_Sub1_Sub2();
			local77.anInt5759 = arg1;
			if (Static56.aClass3_Sub3Array1[arg1] != null) {
				local77.method5075(Static56.aClass3_Sub3Array1[arg1]);
			}
			local77.method5067(local69.anInt748, true);
			local77.anInt5744 = local69.anInt749;
			local103 = local69.anInt751;
			local107 = local103 >> 28;
			local113 = local103 >> 14 & 0xFF;
			@Pc(117) int local117 = local103 & 0xFF;
			@Pc(126) int local126 = (local113 << 6) + local31 - Static299.anInt5307;
			@Pc(135) int local135 = (local117 << 6) + local36 - Static171.anInt3340;
			local77.aBoolean408 = local69.aBoolean59;
			local77.aByteArray61[0] = Static420.aByteArray80[arg1];
			local77.aByte123 = local77.aByte124 = (byte) local107;
			if (Static486.method7232(local135, local126)) {
				local77.aByte124++;
			}
			local77.method5082(local135, local126);
			local77.aBoolean412 = false;
			Static135.aClass12Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local31 = arg0.method4276(2);
			local36 = Static135.aClass12Array1[arg1].anInt751;
			Static135.aClass12Array1[arg1].anInt751 = (((local36 >> 28) + local31 & 0x3) << 28) + (local36 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(230) int local230;
			@Pc(235) int local235;
			@Pc(243) int local243;
			if (local8 != 2) {
				local31 = arg0.method4276(18);
				local36 = local31 >> 16;
				local230 = local31 >> 8 & 0xFF;
				local235 = local31 & 0xFF;
				local243 = Static135.aClass12Array1[arg1].anInt751;
				local103 = local36 + (local243 >> 28) & 0x3;
				local107 = (local243 >> 14) + local230 & 0xFF;
				local113 = local243 + local235 & 0xFF;
				Static135.aClass12Array1[arg1].anInt751 = (local103 << 28) + (local107 << 14) + local113;
				return false;
			}
			local31 = arg0.method4276(5);
			local36 = local31 >> 3;
			local230 = local31 & 0x7;
			local235 = Static135.aClass12Array1[arg1].anInt751;
			local243 = local36 + (local235 >> 28) & 0x3;
			local103 = local235 >> 14 & 0xFF;
			local107 = local235 & 0xFF;
			if (local230 == 0) {
				local103--;
				local107--;
			}
			if (local230 == 1) {
				local107--;
			}
			if (local230 == 2) {
				local103++;
				local107--;
			}
			if (local230 == 3) {
				local103--;
			}
			if (local230 == 4) {
				local103++;
			}
			if (local230 == 5) {
				local107++;
				local103--;
			}
			if (local230 == 6) {
				local107++;
			}
			if (local230 == 7) {
				local107++;
				local103++;
			}
			Static135.aClass12Array1[arg1].anInt751 = (local103 << 14) + (local243 << 28) + local107;
			return false;
		}
	}
}

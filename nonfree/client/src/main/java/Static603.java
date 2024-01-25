import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Lclient!os;")
	public static Class279 aClass279_2;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray42;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "F")
	public static float aFloat204;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!rda;")
	public static final Class307 aClass307_4 = new Class307(false);

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!rda;")
	public static Class307 aClass307_3 = aClass307_4;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIZI)V")
	public static void method8513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(28) int local28 = local17 << 1;
		@Pc(32) int local32 = local13 << 1;
		@Pc(36) int local36 = arg0 << 1;
		@Pc(45) int local45 = local28 + local13 * (1 - local36);
		@Pc(53) int local53 = local17 - local32 * (local36 - 1);
		@Pc(57) int local57 = local13 << 2;
		@Pc(61) int local61 = local17 << 2;
		@Pc(69) int local69 = local28 * 3;
		@Pc(77) int local77 = ((arg0 << 1) - 3) * local32;
		@Pc(83) int local83 = local61;
		@Pc(89) int local89 = local57 * (arg0 - 1);
		@Pc(106) int local106;
		@Pc(115) int local115;
		if (arg4 >= Static410.anInt7068 && arg4 <= Static281.anInt5188) {
			local106 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg3 + arg2);
			local115 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg3 - arg2);
			Static240.method4038(local106, Static144.anIntArrayArray30[arg4], arg1, local115);
		}
		while (local9 > 0) {
			if (local45 < 0) {
				while (local45 < 0) {
					local53 += local83;
					local45 += local69;
					local83 += local61;
					local7++;
					local69 += local61;
				}
			}
			if (local53 < 0) {
				local53 += local83;
				local45 += local69;
				local83 += local61;
				local69 += local61;
				local7++;
			}
			local53 += -local77;
			local45 += -local89;
			local9--;
			local77 -= local57;
			local89 -= local57;
			local106 = arg4 - local9;
			local115 = arg4 + local9;
			if (Static410.anInt7068 <= local115 && local106 <= Static281.anInt5188) {
				@Pc(234) int local234 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, local7 + arg3);
				@Pc(242) int local242 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg3 - local7);
				if (local106 >= Static410.anInt7068) {
					Static240.method4038(local234, Static144.anIntArrayArray30[local106], arg1, local242);
				}
				if (Static281.anInt5188 >= local115) {
					Static240.method4038(local234, Static144.anIntArrayArray30[local115], arg1, local242);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IJ)V")
	public static void method8514(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static295.anInt5319;
		@Pc(25) int local25;
		@Pc(33) int local33;
		if (local7 != Static173.anInt2835) {
			local25 = local7 - Static173.anInt2835;
			local33 = (int) (arg0 * (long) local25 / 320L);
			if (local25 <= 0) {
				if (local33 == 0) {
					local33 = -1;
				} else if (local25 > local33) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = 1;
			} else if (local33 > local25) {
				local33 = local25;
			}
			Static173.anInt2835 += local33;
		}
		@Pc(84) int local84 = Static351.anInt11027;
		Static680.aFloat210 += Static193.aFloat190 * (float) arg0 / 40.0F * 8.0F;
		if (local84 != Static660.anInt6758) {
			local25 = local84 - Static660.anInt6758;
			local33 = (int) (arg0 * (long) local25 / 320L);
			if (local25 <= 0) {
				if (local33 == 0) {
					local33 = -1;
				} else if (local25 > local33) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = 1;
			} else if (local33 > local25) {
				local33 = local25;
			}
			Static660.anInt6758 += local33;
		}
		Static139.aFloat16 += Static173.aFloat21 * (float) arg0 / 40.0F * 8.0F;
		Static54.method988();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZI)Z")
	public static boolean method8516(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static376.method7670(arg0, arg1) || Static497.method7459(arg1, arg0) || Static245.method4089(arg0, arg1);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIZ)V")
	public static void method8517(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class14_Sub48 local10 = arg1 ? Static71.aClass14_Sub48_1 : Static412.aClass14_Sub48_2;
		if (local10 == null || arg0 < 0 || local10.anInt10291 <= arg0) {
			return;
		}
		@Pc(29) Class155 local29 = local10.aClass155Array1[arg0];
		if (local29.aByte85 != -1) {
			return;
		}
		@Pc(38) String local38 = local29.aString45;
		@Pc(41) Class347 local41 = Static435.method6495();
		@Pc(47) Class14_Sub54 local47 = Static72.method1195(local41.aClass197_2, Static325.aClass251_140);
		local47.aClass14_Sub21_Sub2_2.method7747(Static418.method6276(local38) + 3);
		local47.aClass14_Sub21_Sub2_2.method7747(arg1 ? 1 : 0);
		local47.aClass14_Sub21_Sub2_2.method7751(arg0);
		local47.aClass14_Sub21_Sub2_2.method7690(local38);
		local41.method8308(local47);
	}
}

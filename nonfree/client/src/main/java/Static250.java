import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!it", name = "f", descriptor = "I")
	public static int anInt4790;

	@OriginalMember(owner = "client!it", name = "i", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!it", name = "h", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_96 = new Class200(44, 2);

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIILclient!ha;)V")
	public static void method4180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class13 arg4) {
		if ((Static576.aClass31_37 == null || Static203.aClass31_16 == null || Static100.aClass31_2 == null) && Static497.aClass238_223.method5568(Static18.anInt416) && Static497.aClass238_223.method5568(Static179.anInt3583) && Static497.aClass238_223.method5568(Static395.anInt6811)) {
			@Pc(31) Class139 local31 = Static654.method3455(Static497.aClass238_223, Static179.anInt3583, 0);
			Static203.aClass31_16 = arg4.method8141(local31, true);
			local31.method3459();
			Static255.aClass31_12 = arg4.method8141(local31, true);
			Static576.aClass31_37 = arg4.method8141(Static654.method3455(Static497.aClass238_223, Static18.anInt416, 0), true);
			@Pc(56) Class139 local56 = Static654.method3455(Static497.aClass238_223, Static395.anInt6811, 0);
			Static100.aClass31_2 = arg4.method8141(local56, true);
			local56.method3459();
			Static503.aClass31_34 = arg4.method8141(local56, true);
		}
		if (Static576.aClass31_37 == null || Static203.aClass31_16 == null || Static100.aClass31_2 == null) {
			return;
		}
		@Pc(85) int local85 = (arg1 - Static100.aClass31_2.method8801() * 2) / Static576.aClass31_37.method8801();
		for (@Pc(87) int local87 = 0; local87 < local85; local87++) {
			Static576.aClass31_37.method8793(arg2 + Static100.aClass31_2.method8801() + Static576.aClass31_37.method8801() * local87, -Static576.aClass31_37.method8789() + arg3 + arg0);
		}
		@Pc(126) int local126 = (arg0 - Static100.aClass31_2.method8789() - 20) / Static203.aClass31_16.method8789();
		for (@Pc(128) int local128 = 0; local128 < local126; local128++) {
			Static203.aClass31_16.method8793(arg2, arg3 + Static203.aClass31_16.method8789() * local128 + 20);
			Static255.aClass31_12.method8793(arg1 + arg2 - Static255.aClass31_12.method8801(), local128 * Static203.aClass31_16.method8789() + arg3 + 20);
		}
		Static100.aClass31_2.method8793(arg2, arg0 + arg3 - Static100.aClass31_2.method8789());
		Static503.aClass31_34.method8793(arg1 + arg2 - Static100.aClass31_2.method8801(), arg3 - (-arg0 - -Static100.aClass31_2.method8789()));
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIZIIII)Z")
	public static boolean method4182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) int local8 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray595[0];
		@Pc(13) int local13 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray594[0];
		if (local8 < 0 || Static456.anInt7428 <= local8 || local13 < 0 || Static5.anInt112 <= local13) {
			return false;
		} else if (arg5 >= 0 && Static456.anInt7428 > arg5 && arg7 >= 0 && Static5.anInt112 > arg7) {
			@Pc(73) int local73 = Static79.method1729(Static591.anIntArray693, arg7, arg1, arg2, Static520.aClass175Array1[Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109], Static390.anIntArray444, arg4, arg6, arg0, arg3, local8, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.method6999(), arg5, local13);
			if (local73 < 1) {
				return false;
			}
			Static375.anInt6459 = Static390.anIntArray444[local73 - 1];
			Static583.anInt9512 = Static591.anIntArray693[local73 - 1];
			Static520.aBoolean607 = false;
			Static580.method8047();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IBI)I")
	public static int method4183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local17 << 13 ^ local17;
		@Pc(37) int local37 = Integer.MAX_VALUE & (local23 * 15731 * local23 + 789221) * local23 + 1376312589;
		return local37 >> 19 & 0xFF;
	}
}

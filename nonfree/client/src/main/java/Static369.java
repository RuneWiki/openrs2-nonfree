import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!si", name = "hb", descriptor = "[I")
	public static int[] anIntArray401;

	@OriginalMember(owner = "client!si", name = "ib", descriptor = "Lclient!vc;")
	public static Class254 aClass254_1;

	@OriginalMember(owner = "client!si", name = "kb", descriptor = "Lclient!bu;")
	public static Class32 aClass32_79;

	@OriginalMember(owner = "client!si", name = "P", descriptor = "Lclient!mj;")
	public static Class151 aClass151_1 = new Class151();

	@OriginalMember(owner = "client!si", name = "jb", descriptor = "I")
	public static int anInt6219 = -1;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!pl;)V")
	public static void method4839(@OriginalArg(0) Class191 arg0) {
		if (Static268.anInt5045 >= 65535) {
			return;
		}
		@Pc(6) Class3_Sub8 local6 = arg0.aClass3_Sub8_2;
		Static375.aClass191Array2[Static268.anInt5045] = arg0;
		Static210.aBooleanArray17[Static268.anInt5045] = false;
		Static268.anInt5045++;
		@Pc(21) int local21 = arg0.anInt5456;
		if (arg0.aBoolean473) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt5456;
		if (arg0.aBoolean472) {
			local29 = Static362.anInt6122 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method4395() + Static421.anInt6887 - local6.method4400() >> Static336.anInt5747;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method4395() + local6.method4400() - Static421.anInt6887 >> Static336.anInt5747;
			if (local73 >= Static37.anInt1025) {
				local73 = Static37.anInt1025 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray107[local41++];
				@Pc(105) int local105 = (local6.method4404() + Static421.anInt6887 - local6.method4400() >> Static336.anInt5747) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static405.anInt6684) {
					local113 = Static405.anInt6684 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static24.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static24.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static268.anInt5045;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static24.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static268.anInt5045 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static24.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static268.anInt5045 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static24.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static268.anInt5045 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIII)V")
	public static void method4840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 - arg3 >= Static452.anInt7626 && arg1 + arg3 <= Static82.anInt3956 && Static341.anInt5789 <= arg0 - arg3 && arg3 + arg0 <= Static309.anInt5495) {
			Static295.method4139(arg1, arg3, arg2, arg0);
		} else {
			Static250.method3739(arg3, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)V")
	public static void method4841(@OriginalArg(1) int arg0) {
		Static2.anInt53 = arg0;
		Static167.aClass126_20.method3135();
	}
}

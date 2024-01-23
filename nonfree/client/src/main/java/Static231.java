import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "[Lclient!wl;")
	public static Class4_Sub2_Sub23[] aClass4_Sub2_Sub23Array4 = new Class4_Sub2_Sub23[14];

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILclient!qe;I)V")
	public static void method3629(@OriginalArg(1) int arg0, @OriginalArg(2) Class13_Sub5_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		if ((arg2 & 0x4) != 0) {
			local14 = Static256.aClass4_Sub24_Sub1_3.method3060();
			local18 = Static256.aClass4_Sub24_Sub1_3.method3101();
			arg1.method4209(local18, local14, Static50.anInt1118);
			arg1.anInt5292 = Static50.anInt1118 + 300;
			arg1.anInt5289 = Static256.aClass4_Sub24_Sub1_3.method3101();
		}
		if ((arg2 & 0x10) != 0) {
			local14 = Static256.aClass4_Sub24_Sub1_3.method3109();
			@Pc(49) byte[] local49 = new byte[local14];
			@Pc(54) Class4_Sub24 local54 = new Class4_Sub24(local49);
			Static256.aClass4_Sub24_Sub1_3.method3098(local49, local14);
			Static162.aClass4_Sub24Array1[arg0] = local54;
			arg1.method3497(local54);
		}
		if ((arg2 & 0x400) != 0) {
			local14 = Static256.aClass4_Sub24_Sub1_3.method3060();
			local18 = Static256.aClass4_Sub24_Sub1_3.method3094();
			arg1.method4209(local18, local14, Static50.anInt1118);
		}
		if ((arg2 & 0x40) != 0) {
			arg1.anInt5299 = Static256.aClass4_Sub24_Sub1_3.method3108();
			arg1.anInt5320 = Static256.aClass4_Sub24_Sub1_3.method3096();
		}
		if ((arg2 & 0x800) != 0) {
			arg1.anInt5332 = Static256.aClass4_Sub24_Sub1_3.method3101();
			arg1.anInt5257 = Static256.aClass4_Sub24_Sub1_3.method3101();
			arg1.anInt5286 = Static256.aClass4_Sub24_Sub1_3.method3110();
			arg1.anInt5272 = Static256.aClass4_Sub24_Sub1_3.method3110();
			arg1.anInt5285 = Static256.aClass4_Sub24_Sub1_3.method3074() + Static50.anInt1118;
			arg1.anInt5265 = Static256.aClass4_Sub24_Sub1_3.method3085() + Static50.anInt1118;
			arg1.anInt5284 = Static256.aClass4_Sub24_Sub1_3.method3110();
			arg1.anInt5271 = 1;
			arg1.anInt5316 = 0;
		}
		if ((arg2 & 0x8) != 0) {
			local14 = Static256.aClass4_Sub24_Sub1_3.method3085();
			if (local14 == 65535) {
				local14 = -1;
			}
			local18 = Static256.aClass4_Sub24_Sub1_3.method3094();
			Static13.method240(arg1, local18, local14);
		}
		@Pc(220) int local220;
		if ((arg2 & 0x2) != 0) {
			local14 = Static256.aClass4_Sub24_Sub1_3.method3085();
			@Pc(209) boolean local209 = (local14 & 0x8000) != 0;
			local18 = Static256.aClass4_Sub24_Sub1_3.method3109();
			@Pc(217) int local217 = Static256.aClass4_Sub24_Sub1_3.method3101();
			local220 = Static256.aClass4_Sub24_Sub1_3.anInt3822;
			if (arg1.aString148 != null && arg1.aClass175_2 != null) {
				@Pc(232) long local232 = Static193.method3171(arg1.aString148);
				@Pc(234) boolean local234 = false;
				if (local18 <= 1) {
					if (!local209 && (Static243.aBoolean299 && !Static29.aBoolean47 || Static106.aBoolean122)) {
						local234 = true;
					} else {
						for (@Pc(255) int local255 = 0; local255 < Static15.anInt334; local255++) {
							if (local232 == Static229.aLongArray8[local255]) {
								local234 = true;
								break;
							}
						}
					}
				}
				if (!local234 && Static45.anInt1039 == 0) {
					Static189.aClass4_Sub24_50.anInt3822 = 0;
					Static256.aClass4_Sub24_Sub1_3.method3104(local217, Static189.aClass4_Sub24_50.aByteArray47);
					Static189.aClass4_Sub24_50.anInt3822 = 0;
					@Pc(296) int local296 = -1;
					@Pc(315) String local315;
					if (local209) {
						local14 &= 0x7FFF;
						@Pc(306) Class14 local306 = Static115.method1917(Static189.aClass4_Sub24_50);
						local296 = local306.anInt519;
						local315 = local306.aClass4_Sub2_Sub5_1.method973(Static189.aClass4_Sub24_50);
					} else {
						local315 = Static124.method4092(Static174.method2879(Static173.method2815(Static189.aClass4_Sub24_50)));
					}
					arg1.aString178 = local315.trim();
					arg1.anInt5303 = local14 >> 8;
					arg1.anInt5248 = local14 & 0xFF;
					arg1.anInt5253 = 150;
					if (local18 == 2) {
						Static259.method4047("<img=1>" + arg1.method3494(), local315, null, local296, local209 ? 17 : 1);
					} else if (local18 == 1) {
						Static259.method4047("<img=0>" + arg1.method3494(), local315, null, local296, local209 ? 17 : 1);
					} else {
						Static259.method4047(arg1.method3494(), local315, null, local296, local209 ? 17 : 2);
					}
				}
			}
			Static256.aClass4_Sub24_Sub1_3.anInt3822 = local220 + local217;
		}
		if ((arg2 & 0x200) != 0) {
			local14 = Static256.aClass4_Sub24_Sub1_3.method3101();
			@Pc(423) int[] local423 = new int[local14];
			@Pc(426) int[] local426 = new int[local14];
			@Pc(429) int[] local429 = new int[local14];
			for (@Pc(431) int local431 = 0; local431 < local14; local431++) {
				@Pc(438) int local438 = Static256.aClass4_Sub24_Sub1_3.method3108();
				if (local438 == 65535) {
					local438 = -1;
				}
				local423[local431] = local438;
				local426[local431] = Static256.aClass4_Sub24_Sub1_3.method3110();
				local429[local431] = Static256.aClass4_Sub24_Sub1_3.method3096();
			}
			Static88.method1490(local429, local426, local423, arg1);
		}
		if ((arg2 & 0x1) != 0) {
			arg1.anInt5256 = Static256.aClass4_Sub24_Sub1_3.method3096();
			if (arg1.anInt5256 == 65535) {
				arg1.anInt5256 = -1;
			}
		}
		if ((arg2 & 0x80) != 0) {
			arg1.aString178 = Static256.aClass4_Sub24_Sub1_3.method3111();
			if (arg1.aString178.charAt(0) == '~') {
				arg1.aString178 = arg1.aString178.substring(1);
				Static173.method2811(2, arg1.aString178, arg1.method3494());
			} else if (arg1 == Static72.aClass13_Sub5_Sub1_1) {
				Static173.method2811(2, arg1.aString178, arg1.method3494());
			}
			arg1.anInt5253 = 150;
			arg1.anInt5303 = 0;
			arg1.anInt5248 = 0;
		}
		if ((arg2 & 0x100) == 0) {
			return;
		}
		local14 = Static256.aClass4_Sub24_Sub1_3.method3108();
		@Pc(552) boolean local552 = true;
		if (local14 == 65535) {
			local14 = -1;
		}
		local18 = Static256.aClass4_Sub24_Sub1_3.method3086();
		if (local14 != -1 && arg1.anInt5291 != -1 && Static51.method992(Static32.method639(local14).anInt3877).anInt5807 < Static51.method992(Static32.method639(arg1.anInt5291).anInt3877).anInt5807) {
			local552 = false;
		}
		if (!local552) {
			return;
		}
		arg1.anInt5304 = local18 >> 16;
		arg1.anInt5280 = 1;
		arg1.anInt5325 = Static50.anInt1118 + (local18 & 0xFFFF);
		arg1.anInt5281 = 0;
		arg1.anInt5291 = local14;
		arg1.anInt5279 = 0;
		if (Static50.anInt1118 < arg1.anInt5325) {
			arg1.anInt5279 = -1;
		}
		if (arg1.anInt5291 == -1 || arg1.anInt5325 != Static50.anInt1118) {
			return;
		}
		local220 = Static32.method639(arg1.anInt5291).anInt3877;
		if (local220 != -1) {
			@Pc(648) Class186 local648 = Static51.method992(local220);
			if (local648 != null && local648.anIntArray469 != null) {
				Static229.method3598(arg1 == Static72.aClass13_Sub5_Sub1_1, arg1.anInt5294, local648, arg1.anInt5334, 0);
			}
		}
	}
}

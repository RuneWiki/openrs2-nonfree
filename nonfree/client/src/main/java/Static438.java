import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!qw", name = "N", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_99;

	@OriginalMember(owner = "client!qw", name = "P", descriptor = "Lclient!qj;")
	public static Class272 aClass272_5;

	@OriginalMember(owner = "client!qw", name = "D", descriptor = "I")
	public static int anInt7573 = 0;

	@OriginalMember(owner = "client!qw", name = "J", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_139 = new Class73(74, 7);

	@OriginalMember(owner = "client!qw", name = "O", descriptor = "Z")
	public static boolean aBoolean528 = false;

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(III)Z")
	public static boolean method6233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static422.method6090(arg1, arg0) | (arg0 & 0x70000) != 0 || Static524.method7193(arg0, arg1);
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!pw;III)Lclient!jg;")
	public static Class6_Sub2_Sub10 method6234(@OriginalArg(0) Class261 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0.anInt7215 | arg2 << 10;
		@Pc(24) Class6_Sub2_Sub10 local24 = (Class6_Sub2_Sub10) Static228.aClass94_3.method2647((long) local15 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static466.aClass251_110.method5761(Static466.aClass251_110.method5765(local15));
		if (local36 == null) {
			local15 = arg1 + 65536 << 10 | arg0.anInt7215;
			local24 = (Class6_Sub2_Sub10) Static228.aClass94_3.method2647((long) local15 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static466.aClass251_110.method5761(Static466.aClass251_110.method5765(local15));
			if (local36 == null) {
				local15 = arg0.anInt7215 | 0x3FFFC00;
				local24 = (Class6_Sub2_Sub10) Static228.aClass94_3.method2647((long) local15 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static466.aClass251_110.method5761(Static466.aClass251_110.method5765(local15));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local24 = Static17.method403(local36);
					local24.aClass261_6 = arg0;
					Static228.aClass94_3.method2643((long) local15 << 16, local24);
					return local24;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local24 = Static17.method403(local36);
				local24.aClass261_6 = arg0;
				Static228.aClass94_3.method2643((long) local15 << 16, local24);
				return local24;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local24 = Static17.method403(local36);
			local24.aClass261_6 = arg0;
			Static228.aClass94_3.method2643((long) local15 << 16, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IBIIII)V")
	public static void method6235(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(34) int local34 = arg2 << 1;
		@Pc(43) int local43 = local13 * (1 - local34) + local21;
		@Pc(52) int local52 = local17 - local25 * (local34 - 1);
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = local25 * ((arg2 << 1) - 3);
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = (arg2 - 1) * local56;
		@Pc(106) int local106;
		@Pc(116) int local116;
		if (arg3 >= Static583.anInt9478 && Static415.anInt9494 >= arg3) {
			local106 = Static201.method3634(arg1 + arg0, Static461.anInt7899, Static13.anInt7634);
			local116 = Static201.method3634(arg0 - arg1, Static461.anInt7899, Static13.anInt7634);
			Static208.method3687(local116, arg4, Static454.anIntArrayArray71[arg3], local106);
		}
		while (local9 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local52 += local82;
					local43 += local68;
					local68 += local60;
					local82 += local60;
					local7++;
				}
			}
			if (local52 < 0) {
				local43 += local68;
				local52 += local82;
				local68 += local60;
				local7++;
				local82 += local60;
			}
			local52 += -local76;
			local43 += -local88;
			local88 -= local56;
			local76 -= local56;
			local9--;
			local106 = arg3 - local9;
			local116 = arg3 + local9;
			if (Static583.anInt9478 <= local116 && local106 <= Static415.anInt9494) {
				@Pc(219) int local219 = Static201.method3634(arg0 + local7, Static461.anInt7899, Static13.anInt7634);
				@Pc(230) int local230 = Static201.method3634(arg0 - local7, Static461.anInt7899, Static13.anInt7634);
				if (local106 >= Static583.anInt9478) {
					Static208.method3687(local230, arg4, Static454.anIntArrayArray71[local106], local219);
				}
				if (local116 <= Static415.anInt9494) {
					Static208.method3687(local230, arg4, Static454.anIntArrayArray71[local116], local219);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILjava/lang/String;I[B)I")
	public static int method6236(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = arg1;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				arg2[local15++] = (byte) local23;
			} else if (local23 <= '\u07ff') {
				arg2[local15++] = (byte) (local23 >> 6 | 0xC0);
				arg2[local15++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg2[local15++] = (byte) (local23 >> 12 | 0xE0);
				arg2[local15++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg2[local15++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local15 - arg1;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILclient!qf;)V")
	public static void method6238(@OriginalArg(1) Class6_Sub21_Sub2 arg0) {
		arg0.method6082();
		@Pc(16) int local16 = Static272.anInt5214;
		@Pc(26) Class4_Sub1_Sub1_Sub2 local26 = Static328.aClass4_Sub1_Sub1_Sub2_2 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local16] = new Class4_Sub1_Sub1_Sub2();
		local26.anInt7126 = local16;
		@Pc(34) int local34 = arg0.method6078(30);
		@Pc(39) byte local39 = (byte) (local34 >> 28);
		@Pc(45) int local45 = local34 >> 14 & 0x3FFF;
		@Pc(49) int local49 = local34 & 0x3FFF;
		local26.anIntArray521[0] = local45 - Static39.anInt4952;
		local26.anInt9542 = (local26.anIntArray521[0] << 9) + (local26.method5892() << 8);
		local26.anIntArray522[0] = local49 - Static138.anInt3088;
		local26.anInt9540 = (local26.anIntArray522[0] << 9) + (local26.method5892() << 8);
		Static97.anInt1863 = local26.aByte108 = local39;
		if (Static439.aClass6_Sub21Array1[local16] != null) {
			local26.method5915(Static439.aClass6_Sub21Array1[local16]);
		}
		Static231.anInt4727 = 0;
		Static249.anIntArray372[Static231.anInt4727++] = local16;
		Static294.aByteArray65[local16] = 0;
		Static17.anInt507 = 0;
		for (@Pc(130) int local130 = 1; local130 < 2048; local130++) {
			if (local16 != local130) {
				@Pc(144) int local144 = arg0.method6078(18);
				@Pc(148) int local148 = local144 >> 16;
				@Pc(154) int local154 = local144 >> 8 & 0xFF;
				@Pc(158) int local158 = local144 & 0xFF;
				@Pc(166) Class302 local166 = Static412.aClass302Array1[local130] = new Class302();
				local166.anInt8091 = local158 + (local154 << 14) + (local148 << 28);
				local166.aBoolean575 = false;
				local166.anInt8094 = -1;
				local166.anInt8092 = 0;
				Static86.anIntArray144[Static17.anInt507++] = local130;
				Static294.aByteArray65[local130] = 0;
			}
		}
		arg0.method6076();
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(II)Lclient!rba;")
	public static Class281 method6239(@OriginalArg(1) int arg0) {
		@Pc(18) Class281 local18 = (Class281) Static522.aClass136_101.method3473((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static599.aClass251_130.method5772(arg0, 0);
		local18 = new Class281();
		if (local28 != null) {
			local18.method6300(new Class6_Sub21(local28));
		}
		local18.method6304();
		Static522.aClass136_101.method3482((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "(B)V")
	public static void method6240() {
		Static221.anInt4605 = Static8.aClass327_1.anInt8785 + Static8.aClass327_1.anInt8797 + 2;
		Static572.anInt9366 = Static555.aClass327_13.anInt8797 + Static555.aClass327_13.anInt8785 + 2;
		Static272.aStringArray17 = new String[500];
		for (@Pc(27) int local27 = 0; local27 < Static272.aStringArray17.length; local27++) {
			Static272.aStringArray17[local27] = "";
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IBZILclient!rr;)V")
	public static void method6241(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class292 arg3) {
		@Pc(8) int local8 = arg3.anInt7963;
		if (arg3.aByte93 == 0) {
			arg3.anInt7963 = arg3.anInt7962;
		} else if (arg3.aByte93 == 1) {
			arg3.anInt7963 = arg0 - arg3.anInt7962;
		} else if (arg3.aByte93 == 2) {
			arg3.anInt7963 = arg3.anInt7962 * arg0 >> 14;
		}
		@Pc(47) int local47 = arg3.anInt7912;
		if (arg3.aByte95 == 0) {
			arg3.anInt7912 = arg3.anInt7927;
		} else if (arg3.aByte95 == 1) {
			arg3.anInt7912 = arg2 - arg3.anInt7927;
		} else if (arg3.aByte95 == 2) {
			arg3.anInt7912 = arg3.anInt7927 * arg2 >> 14;
		}
		if (arg3.aByte93 == 4) {
			arg3.anInt7963 = arg3.anInt7915 * arg3.anInt7912 / arg3.anInt7887;
		}
		if (arg3.aByte95 == 4) {
			arg3.anInt7912 = arg3.anInt7963 * arg3.anInt7887 / arg3.anInt7915;
		}
		if (Static226.aBoolean321 && (Static67.method1354(arg3).anInt317 != 0 || arg3.lb == 0)) {
			if (arg3.anInt7912 < 5 && arg3.anInt7963 < 5) {
				arg3.anInt7912 = 5;
				arg3.anInt7963 = 5;
			} else {
				if (arg3.anInt7963 <= 0) {
					arg3.anInt7963 = 5;
				}
				if (arg3.anInt7912 <= 0) {
					arg3.anInt7912 = 5;
				}
			}
		}
		if (arg3.anInt7955 == Static322.anInt5908) {
			Static206.aClass292_4 = arg3;
		}
		if (arg1 && arg3.anObjectArray23 != null && (local8 != arg3.anInt7963 || arg3.anInt7912 != local47)) {
			@Pc(190) Class6_Sub43 local190 = new Class6_Sub43();
			local190.aClass292_12 = arg3;
			local190.anObjectArray34 = arg3.anObjectArray23;
			Static127.aClass361_21.method7833(local190);
		}
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(BLjava/lang/String;)V")
	public static void method6242(@OriginalArg(1) String arg0) {
		if (Static198.aClass234Array1 != null) {
			@Pc(23) Class6_Sub31 local23 = Static114.method2007(Static475.aClass47_124, Static337.aClass324_1);
			local23.aClass6_Sub21_Sub2_2.method6062(Static391.method5746(arg0));
			local23.aClass6_Sub21_Sub2_2.method6022(arg0);
			Static534.method7251(local23);
		}
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "(II)V")
	public static void method6243(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static285.aBooleanArray25[arg0]) {
			Static118.aClass251_30.method5769(arg0);
			Static14.aClass292ArrayArray1[arg0] = null;
			Static131.aClass292ArrayArray2[arg0] = null;
			Static285.aBooleanArray25[arg0] = false;
		}
	}
}

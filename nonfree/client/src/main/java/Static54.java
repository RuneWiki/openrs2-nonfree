import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
	public static int anInt1049 = 0;

	@OriginalMember(owner = "client!ed", name = "J", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray7 = new String[500];

	@OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
	public static int anInt1055 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BZ)Z")
	public static boolean method932(@OriginalArg(1) boolean arg0) {
		@Pc(13) boolean local13 = Static266.method3963();
		if (local13 == arg0) {
			return true;
		}
		if (!arg0) {
			Static266.method3967();
		} else if (!Static266.method3965() || !Static266.method3957() || !Static266.method3956()) {
			arg0 = false;
		}
		Static5.aBoolean1 = arg0;
		Static80.method1224(Static117.aClass117_3);
		if (arg0 == local13) {
			return false;
		} else {
			((Class74_Sub1) Static18.anInterface1_1).method1641();
			return true;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!ph;Lclient!ph;Lclient!ph;Lclient!ph;)V")
	public static void method934(@OriginalArg(1) Class138 arg0, @OriginalArg(2) Class138 arg1, @OriginalArg(3) Class138 arg2, @OriginalArg(4) Class138 arg3) {
		Static62.aClass138_15 = arg3;
		Static68.aClass138_20 = arg1;
		Static242.aClass138_66 = arg2;
		Static249.aClass138_68 = arg0;
		Static313.aClass146ArrayArray1 = new Class146[Static62.aClass138_15.method3352()][];
		Static282.aBooleanArray59 = new boolean[Static62.aClass138_15.method3352()];
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILclient!dm;III)V")
	public static void method935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt971 == -1 && arg2.anIntArray82 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(22) int local22 = Static315.anInt5926 * arg2.anInt975 >> 8;
		if (arg2.anInt969 < arg1) {
			local15 = arg1 - arg2.anInt969;
		} else if (arg1 < arg2.anInt962) {
			local15 = arg2.anInt962 - arg1;
		}
		if (arg2.anInt964 < arg0) {
			local15 += arg0 - arg2.anInt964;
		} else if (arg2.anInt974 > arg0) {
			local15 += arg2.anInt974 - arg0;
		}
		if (arg2.anInt967 == 0 || arg2.anInt967 < local15 - 64 || Static315.anInt5926 == 0 || arg4 != arg2.anInt963) {
			if (arg2.aClass1_Sub4_Sub1_2 != null) {
				Static303.aClass1_Sub4_Sub2_2.method774(arg2.aClass1_Sub4_Sub1_2);
				arg2.aClass1_Sub4_Sub1_2 = null;
			}
			if (arg2.aClass1_Sub4_Sub1_1 != null) {
				Static303.aClass1_Sub4_Sub2_2.method774(arg2.aClass1_Sub4_Sub1_1);
				arg2.aClass1_Sub4_Sub1_1 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(153) int local153 = local22 * (arg2.anInt967 - local15) / arg2.anInt967;
		if (arg2.aClass1_Sub4_Sub1_2 != null) {
			arg2.aClass1_Sub4_Sub1_2.method242(local153);
		} else if (arg2.anInt971 >= 0) {
			@Pc(176) Class184 local176 = Static325.method4369(Static273.aClass138_75, arg2.anInt971, 0);
			if (local176 != null) {
				@Pc(183) Class1_Sub7_Sub1 local183 = local176.method4368().method713(Static298.aClass163_1);
				@Pc(188) Class1_Sub4_Sub1 local188 = Static317.method252(local183, local153);
				local188.method241(-1);
				Static303.aClass1_Sub4_Sub2_2.method775(local188);
				arg2.aClass1_Sub4_Sub1_2 = local188;
			}
		}
		if (arg2.aClass1_Sub4_Sub1_1 != null) {
			arg2.aClass1_Sub4_Sub1_1.method242(local153);
			if (!arg2.aClass1_Sub4_Sub1_1.method4614()) {
				arg2.aClass1_Sub4_Sub1_1 = null;
			}
		} else if (arg2.anIntArray82 != null && (arg2.anInt966 -= arg3) <= 0) {
			@Pc(243) int local243 = (int) (Math.random() * (double) arg2.anIntArray82.length);
			@Pc(251) Class184 local251 = Static325.method4369(Static273.aClass138_75, arg2.anIntArray82[local243], 0);
			if (local251 != null) {
				@Pc(259) Class1_Sub7_Sub1 local259 = local251.method4368().method713(Static298.aClass163_1);
				@Pc(264) Class1_Sub4_Sub1 local264 = Static317.method252(local259, local153);
				local264.method241(0);
				Static303.aClass1_Sub4_Sub2_2.method775(local264);
				arg2.aClass1_Sub4_Sub1_1 = local264;
				arg2.anInt966 = (int) ((double) (arg2.anInt965 - arg2.anInt968) * Math.random()) + arg2.anInt968;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILjava/lang/String;[BII)I")
	public static int method936(@OriginalArg(2) String arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(19) int local19 = arg3;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(34) char local34 = arg0.charAt(local21);
			if (local34 > '\u0000' && local34 < '\u0080' || !(local34 < ' ' || local34 > 'ÿ')) {
				arg1[arg2 + local21] = (byte) local34;
			} else if (local34 == '€') {
				arg1[local21 + arg2] = -128;
			} else if (local34 == '‚') {
				arg1[local21 + arg2] = -126;
			} else if (local34 == 'ƒ') {
				arg1[arg2 + local21] = -125;
			} else if (local34 == '„') {
				arg1[local21 + arg2] = -124;
			} else if (local34 == '…') {
				arg1[arg2 + local21] = -123;
			} else if (local34 == '†') {
				arg1[arg2 + local21] = -122;
			} else if (local34 == '‡') {
				arg1[local21 + arg2] = -121;
			} else if (local34 == 'ˆ') {
				arg1[local21 + arg2] = -120;
			} else if (local34 == '‰') {
				arg1[arg2 + local21] = -119;
			} else if (local34 == 'Š') {
				arg1[arg2 + local21] = -118;
			} else if (local34 == '‹') {
				arg1[local21 + arg2] = -117;
			} else if (local34 == 'Œ') {
				arg1[local21 + arg2] = -116;
			} else if (local34 == 'Ž') {
				arg1[local21 + arg2] = -114;
			} else if (local34 == '‘') {
				arg1[arg2 + local21] = -111;
			} else if (local34 == '’') {
				arg1[local21 + arg2] = -110;
			} else if (local34 == '“') {
				arg1[arg2 + local21] = -109;
			} else if (local34 == '”') {
				arg1[arg2 + local21] = -108;
			} else if (local34 == '•') {
				arg1[arg2 + local21] = -107;
			} else if (local34 == '–') {
				arg1[arg2 + local21] = -106;
			} else if (local34 == '—') {
				arg1[local21 + arg2] = -105;
			} else if (local34 == '˜') {
				arg1[local21 + arg2] = -104;
			} else if (local34 == '™') {
				arg1[local21 + arg2] = -103;
			} else if (local34 == 'š') {
				arg1[local21 + arg2] = -102;
			} else if (local34 == '›') {
				arg1[arg2 + local21] = -101;
			} else if (local34 == 'œ') {
				arg1[local21 + arg2] = -100;
			} else if (local34 == 'ž') {
				arg1[local21 + arg2] = -98;
			} else if (local34 == 'Ÿ') {
				arg1[arg2 + local21] = -97;
			} else {
				arg1[local21 + arg2] = 63;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/String;C)I")
	public static int method938(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			if (arg0.charAt(local25) == arg1) {
				local20++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)Lclient!qb;")
	public static Class1_Sub2 method939(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub2_Sub25();
		} else if (arg0 == 1) {
			return new Class1_Sub2_Sub31();
		} else if (arg0 == 2) {
			return new Class1_Sub2_Sub24();
		} else if (arg0 == 3) {
			return new Class1_Sub2_Sub16();
		} else if (arg0 == 4) {
			return new Class1_Sub2_Sub38();
		} else if (arg0 == 5) {
			return new Class1_Sub2_Sub5();
		} else if (arg0 == 6) {
			return new Class1_Sub2_Sub28();
		} else if (arg0 == 7) {
			return new Class1_Sub2_Sub26();
		} else if (arg0 == 8) {
			return new Class1_Sub2_Sub8();
		} else if (arg0 == 9) {
			return new Class1_Sub2_Sub4();
		} else if (arg0 == 10) {
			return new Class1_Sub2_Sub21();
		} else if (arg0 == 11) {
			return new Class1_Sub2_Sub13();
		} else if (arg0 == 12) {
			return new Class1_Sub2_Sub35();
		} else if (arg0 == 13) {
			return new Class1_Sub2_Sub17();
		} else if (arg0 == 14) {
			return new Class1_Sub2_Sub1();
		} else if (arg0 == 15) {
			return new Class1_Sub2_Sub36();
		} else if (arg0 == 16) {
			return new Class1_Sub2_Sub20();
		} else if (arg0 == 17) {
			return new Class1_Sub2_Sub10();
		} else if (arg0 == 18) {
			return new Class1_Sub2_Sub6_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub2_Sub27();
		} else if (arg0 == 20) {
			return new Class1_Sub2_Sub14();
		} else if (arg0 == 21) {
			return new Class1_Sub2_Sub30();
		} else if (arg0 == 22) {
			return new Class1_Sub2_Sub11();
		} else if (arg0 == 23) {
			return new Class1_Sub2_Sub23();
		} else if (arg0 == 24) {
			return new Class1_Sub2_Sub9();
		} else if (arg0 == 25) {
			return new Class1_Sub2_Sub22();
		} else if (arg0 == 26) {
			return new Class1_Sub2_Sub18();
		} else if (arg0 == 27) {
			return new Class1_Sub2_Sub37();
		} else if (arg0 == 28) {
			return new Class1_Sub2_Sub32();
		} else if (arg0 == 29) {
			return new Class1_Sub2_Sub34();
		} else if (arg0 == 30) {
			return new Class1_Sub2_Sub7();
		} else if (arg0 == 31) {
			return new Class1_Sub2_Sub39();
		} else if (arg0 == 32) {
			return new Class1_Sub2_Sub15();
		} else if (arg0 == 33) {
			return new Class1_Sub2_Sub29();
		} else if (arg0 == 34) {
			return new Class1_Sub2_Sub33();
		} else if (arg0 == 35) {
			return new Class1_Sub2_Sub2();
		} else if (arg0 == 36) {
			return new Class1_Sub2_Sub12();
		} else if (arg0 == 37) {
			return new Class1_Sub2_Sub3();
		} else if (arg0 == 38) {
			return new Class1_Sub2_Sub19();
		} else if (arg0 == 39) {
			return new Class1_Sub2_Sub6();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)V")
	public static void method941() {
		Static261.aClass1_Sub1_Sub3_8 = null;
		Static301.aClass1_Sub1_Sub3_10 = null;
		Static213.aClass1_Sub1_Sub3_6 = null;
		Static29.aClass1_Sub1_Sub3_1 = null;
		Static219.aClass1_Sub1_Sub3_7 = null;
	}
}

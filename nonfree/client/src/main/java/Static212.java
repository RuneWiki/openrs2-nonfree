import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString138 = "Loaded input handler";

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "[I")
	public static int[] anIntArray336 = new int[32];

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
	public static int anInt4177 = 0;

	@OriginalMember(owner = "client!ph", name = "S", descriptor = "Lclient!th;")
	public static Class169 aClass169_115 = new Class169(50);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!sb;)Ljava/lang/String;")
	public static String method3330(@OriginalArg(1) Class1_Sub14 arg0) {
		return Static17.method298(arg0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZILclient!tc;I)V")
	public static void method3338(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class167 arg3, @OriginalArg(5) int arg4) {
		if (Static258.anInt5018 >= 50 || (arg3 == null || arg3.anIntArrayArray40 == null || arg3.anIntArrayArray40.length <= arg2 || arg3.anIntArrayArray40[arg2] == null)) {
			return;
		}
		@Pc(38) int local38 = arg3.anIntArrayArray40[arg2][0];
		@Pc(42) int local42 = local38 & 0x1F;
		@Pc(48) int local48 = local38 >> 5 & 0x7;
		@Pc(52) int local52 = local38 >> 8;
		@Pc(70) int local70;
		if (arg3.anIntArrayArray40[arg2].length > 1) {
			local70 = (int) (Math.random() * (double) arg3.anIntArrayArray40[arg2].length);
			if (local70 > 0) {
				local52 = arg3.anIntArrayArray40[arg2][local70];
			}
		}
		if (local42 == 0) {
			if (arg1) {
				Static81.method1230(local52, 0, 255, local48);
			}
		} else if (Static315.anInt5926 != 0) {
			Static307.anIntArray526[Static258.anInt5018] = local52;
			Static265.anIntArray459[Static258.anInt5018] = local48;
			@Pc(114) int local114 = (arg4 - 64) / 128;
			Static167.anIntArray282[Static258.anInt5018] = 0;
			Static288.aClass184Array1[Static258.anInt5018] = null;
			local70 = (arg0 - 64) / 128;
			Static203.anIntArray329[Static258.anInt5018] = 255;
			Static255.anIntArray449[Static258.anInt5018] = local42 + (local70 << 16) + (local114 << 8);
			Static258.anInt5018++;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method3347(@OriginalArg(0) int arg0) {
		return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(II)I")
	public static int method3350(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local14;
		if (local14 > local23) {
			local25 = local23;
		}
		@Pc(45) double local45 = (double) (arg0 & 0xFF) / 256.0D;
		if (local45 < local25) {
			local25 = local45;
		}
		@Pc(53) double local53 = 0.0D;
		@Pc(55) double local55 = local14;
		if (local14 < local23) {
			local55 = local23;
		}
		if (local45 > local55) {
			local55 = local45;
		}
		@Pc(71) double local71 = 0.0D;
		@Pc(77) double local77 = (local55 + local25) / 2.0D;
		if (local25 != local55) {
			if (local14 == local55) {
				local53 = (local23 - local45) / (-local25 + local55);
			} else if (local23 == local55) {
				local53 = (local45 - local14) / (-local25 + local55) + 2.0D;
			} else if (local55 == local45) {
				local53 = (local14 - local23) / (-local25 + local55) + 4.0D;
			}
			if (local77 < 0.5D) {
				local71 = (local55 - local25) / (local25 + local55);
			}
			if (local77 >= 0.5D) {
				local71 = (local55 - local25) / (2.0D - local55 - local25);
			}
		}
		@Pc(163) int local163 = (int) (local71 * 256.0D);
		if (local163 < 0) {
			local163 = 0;
		} else if (local163 > 255) {
			local163 = 255;
		}
		@Pc(182) int local182 = (int) (local77 * 256.0D);
		if (local182 < 0) {
			local182 = 0;
		} else if (local182 > 255) {
			local182 = 255;
		}
		if (local182 > 243) {
			local163 >>= 0x4;
		} else if (local182 > 217) {
			local163 >>= 0x3;
		} else if (local182 > 192) {
			local163 >>= 0x2;
		} else if (local182 > 179) {
			local163 >>= 0x1;
		}
		local53 /= 6.0D;
		@Pc(242) int local242 = (int) (local53 * 256.0D);
		return (local242 >> 2 << 10) - (-(local163 >> 5 << 7) - (local182 >> 1));
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!gi;BLclient!id;)V")
	public static void method3354(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(2) Class81 arg1) {
		@Pc(5) Class103_Sub2 local5 = arg1.method1798();
		if (local5 == null) {
			return;
		}
		@Pc(17) int local17 = local5.anInt5857;
		if (local5.anInt5857 < local5.anInt5858) {
			local17 = local5.anInt5858;
		}
		@Pc(28) int local28 = arg0.anInt1632;
		@Pc(31) int local31 = arg0.anInt1637;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(50) int local50;
		@Pc(75) int local75;
		if (arg1.aString84 != null) {
			local37 = Static289.aClass1_Sub1_Sub12_4.method4418(arg1.aString84, null, Static70.aStringArray13);
			for (local50 = 0; local50 < local37; local50++) {
				@Pc(57) String local57 = Static70.aStringArray13[local50];
				if (local50 < local37 - 1) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local75 = Static263.aClass133_7.method3267(local57);
				if (local33 < local75) {
					local33 = local75;
				}
			}
			local35 = (local37 - 1) * Static263.aClass133_7.method3268() + Static263.aClass133_7.method3271() / 2;
		}
		local50 = arg0.anInt1632;
		@Pc(111) int local111 = arg0.anInt1637 - local35 / 2;
		@Pc(113) int local113 = -2;
		@Pc(126) int local126 = -2;
		@Pc(128) int local128 = -2;
		@Pc(130) int local130 = -2;
		if (local28 < local17 + Static58.anInt2568) {
			local28 = Static58.anInt2568 + local17;
			local50 = local17 / 2 + Static58.anInt2568 + local17 + local33 / 2 + 5;
		} else if (local28 > Static58.anInt2569 - local17) {
			local28 = Static58.anInt2569 - local17;
			local50 = Static58.anInt2569 - local33 / 2 - local17 / 2 - local17 - 5;
		}
		if (Static58.anInt2567 + local17 > local31) {
			local31 = Static58.anInt2567 + local17;
			local111 = local17 + Static58.anInt2567 + local17 / 2 + Static263.aClass133_7.method3268();
		} else if (local31 > Static58.anInt2566 - local17) {
			local31 = Static58.anInt2566 - local17;
			local111 = Static58.anInt2566 - local35 - local17 - local17 / 2;
		}
		local17 >>= 0x1;
		local75 = (int) (Math.atan2((double) (local28 - arg0.anInt1632), (double) (local31 - arg0.anInt1637)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local5.method4612(local5.anInt5860 << 3, local5.anInt5856 << 3, local17 + (local28 << 4), local17 + (local31 << 4), local75);
		if (arg1.aString84 != null) {
			local113 = local111 - Static263.aClass133_7.method3271() - 3;
			local130 = local37 * Static263.aClass133_7.method3268() + local113;
			local126 = local50 - local33 / 2 - 5;
			local128 = local126 + local33 + 10;
			if (arg1.anInt2210 != 0) {
				Static41.method728(local126, local113, local128 - local126, -local113 + local130, arg1.anInt2210, arg1.anInt2210 >>> 24);
			}
			if (arg1.anInt2197 != 0) {
				Static41.method727(local126, local113, local128 - local126, -local113 + local130, arg1.anInt2197, arg1.anInt2197 >>> 24);
			}
			for (@Pc(367) int local367 = 0; local367 < local37; local367++) {
				@Pc(378) String local378 = Static70.aStringArray13[local367];
				if (local37 - 1 > local367) {
					local378 = local378.substring(0, local378.length() - 4);
				}
				Static263.aClass133_7.method3270(local378, local50, local111, arg1.anInt2208);
				local111 += Static263.aClass133_7.method3268();
			}
		}
		if ((local28 - local17 >= Static152.anInt3132 || Static152.anInt3132 >= local17 + local28 || Static300.anInt5678 <= local31 - local17 || Static300.anInt5678 >= local31 + local17) && (Static152.anInt3132 <= local126 || Static152.anInt3132 >= local128 || local113 >= Static300.anInt5678 || Static300.anInt5678 >= local130)) {
			return;
		}
		if (arg1.aStringArray21[4] != null) {
			Static59.method1004((short) 1012, arg1.aStringArray21[4], -1, 0, arg1.aString85, 0, (long) arg0.anInt1638);
		}
		if (arg1.aStringArray21[3] != null) {
			Static59.method1004((short) 1009, arg1.aStringArray21[3], -1, 0, arg1.aString85, 0, (long) arg0.anInt1638);
		}
		if (arg1.aStringArray21[2] != null) {
			Static59.method1004((short) 1005, arg1.aStringArray21[2], -1, 0, arg1.aString85, 0, (long) arg0.anInt1638);
		}
		if (arg1.aStringArray21[1] != null) {
			Static59.method1004((short) 1011, arg1.aStringArray21[1], -1, 0, arg1.aString85, 0, (long) arg0.anInt1638);
		}
		if (arg1.aStringArray21[0] != null) {
			Static59.method1004((short) 1010, arg1.aStringArray21[0], -1, 0, arg1.aString85, 0, (long) arg0.anInt1638);
		}
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)Z")
	public static boolean method3355() {
		try {
			return Static143.method2286();
		} catch (@Pc(14) IOException local14) {
			Static274.method4065();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(60) String local60 = "T2 - " + Static117.anInt2306 + "," + Static251.anInt4928 + "," + Static258.anInt5017 + " - " + Static127.anInt2543 + "," + (Static290.anInt5497 + Static229.aClass22_Sub3_Sub2_2.anIntArray427[0]) + "," + (Static229.aClass22_Sub3_Sub2_2.anIntArray424[0] + Static118.anInt2409) + " - ";
			for (@Pc(62) int local62 = 0; Static127.anInt2543 > local62 && local62 < 50; local62++) {
				local60 = local60 + Static237.aClass1_Sub14_Sub1_7.aByteArray34[local62] + ",";
			}
			Static195.method3178(local60, local19);
			Static122.method1957();
			return true;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "()V")
	public static void method3360() {
		for (@Pc(1) int local1 = 0; local1 < Static128.anInt2548; local1++) {
			@Pc(8) Class60 local8 = Static203.aClass60Array4[local1];
			Static222.method3502(local8);
			Static203.aClass60Array4[local1] = null;
		}
		Static128.anInt2548 = 0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B[III[I)V")
	public static void method3364(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(24) int local24 = (arg1 + arg2) / 2;
		@Pc(26) int local26 = arg2;
		@Pc(30) int local30 = arg3[local24];
		arg3[local24] = arg3[arg1];
		arg3[arg1] = local30;
		@Pc(44) int local44 = arg0[local24];
		arg0[local24] = arg0[arg1];
		arg0[arg1] = local44;
		for (@Pc(56) int local56 = arg2; local56 < arg1; local56++) {
			if (local30 + (local56 & 0x1) > arg3[local56]) {
				@Pc(81) int local81 = arg3[local56];
				arg3[local56] = arg3[local26];
				arg3[local26] = local81;
				@Pc(95) int local95 = arg0[local56];
				arg0[local56] = arg0[local26];
				arg0[local26++] = local95;
			}
		}
		arg3[arg1] = arg3[local26];
		arg3[local26] = local30;
		arg0[arg1] = arg0[local26];
		arg0[local26] = local44;
		method3364(arg0, local26 - 1, arg2, arg3);
		method3364(arg0, arg1, local26 + 1, arg3);
	}

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "(II)V")
	public static void method3369() {
		Static240.aClass169_51.method4020(5);
	}
}

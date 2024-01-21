import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ld", name = "G", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_34;

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "Lclient!ud;")
	public static Class74 aClass74_3;

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
	public static int anInt1795;

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "Lclient!l;")
	public static Class42 aClass42_2 = new Class42();

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
	public static int anInt1792 = 0;

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "Lclient!kd;")
	public static Class39 aClass39_887 = Static108.method1915(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
	public static int anInt1796 = 0;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
	public static void method1241() {
		if (Static77.anInt1932 != 0) {
			return;
		}
		Static50.aClass39Array13[0] = Static121.aClass39_1429;
		Static66.anIntArray246[0] = 1002;
		Static110.anInt2795 = 1;
		if (Static72.anInt1798 != -1) {
			Static93.anInt2195 = -1;
			Static23.anInt811 = -1;
			Static113.method1972(0, Static29.anInt971, 765, Static3.anInt150, 503, Static72.anInt1798, 0, 0);
			Static92.anInt2167 = Static23.anInt811;
			Static101.anInt2575 = Static93.anInt2195;
			return;
		}
		Static67.method1205();
		Static23.anInt811 = -1;
		Static93.anInt2195 = -1;
		if (Static29.anInt971 > 4 && Static3.anInt150 > 4 && Static29.anInt971 < 516 && Static3.anInt150 < 338) {
			if (Static48.anInt1318 == -1) {
				Static10.method263();
			} else {
				Static113.method1972(4, Static29.anInt971, 516, Static3.anInt150, 338, Static48.anInt1318, 4, 0);
			}
		}
		@Pc(90) boolean local90 = false;
		Static101.anInt2575 = Static93.anInt2195;
		Static93.anInt2195 = -1;
		Static92.anInt2167 = Static23.anInt811;
		Static23.anInt811 = -1;
		if (Static29.anInt971 > 553 && Static3.anInt150 > 205 && Static29.anInt971 < 743 && Static3.anInt150 < 466) {
			if (Static91.anInt2131 != -1) {
				Static113.method1972(205, Static29.anInt971, 743, Static3.anInt150, 466, Static91.anInt2131, 553, 1);
			} else if (Static23.anIntArray117[Static120.anInt3073] != -1) {
				Static113.method1972(205, Static29.anInt971, 743, Static3.anInt150, 466, Static23.anIntArray117[Static120.anInt3073], 553, 1);
			}
		}
		if (Static23.anInt811 != Static22.anInt765) {
			Static22.anInt765 = Static23.anInt811;
			Static35.aBoolean96 = true;
		}
		Static23.anInt811 = -1;
		if (Static93.anInt2195 != Static23.anInt813) {
			Static35.aBoolean96 = true;
			Static23.anInt813 = Static93.anInt2195;
		}
		Static93.anInt2195 = -1;
		if (Static29.anInt971 > 17 && Static3.anInt150 > 357 && Static29.anInt971 < 496 && Static3.anInt150 < 453) {
			if (Static110.anInt2786 != -1) {
				Static113.method1972(357, Static29.anInt971, 496, Static3.anInt150, 453, Static110.anInt2786, 17, 2);
			} else if (Static9.anInt2991 != -1) {
				Static113.method1972(357, Static29.anInt971, 496, Static3.anInt150, 453, Static9.anInt2991, 17, 3);
			} else if (Static3.anInt150 < 434 && Static29.anInt971 < 426) {
				Static90.method1482(Static29.anInt971 - 17, Static3.anInt150 + -357);
			}
		}
		if ((Static110.anInt2786 != -1 || Static9.anInt2991 != -1) && Static16.anInt2469 != Static23.anInt811) {
			Static113.aBoolean226 = true;
			Static16.anInt2469 = Static23.anInt811;
		}
		if ((Static110.anInt2786 != -1 || Static9.anInt2991 != -1) && Static114.anInt2847 != Static93.anInt2195) {
			Static114.anInt2847 = Static93.anInt2195;
			Static113.aBoolean226 = true;
		}
		while (!local90) {
			local90 = true;
			for (@Pc(266) int local266 = 0; local266 < Static110.anInt2795 - 1; local266++) {
				if (Static66.anIntArray246[local266] < 1000 && Static66.anIntArray246[local266 + 1] > 1000) {
					local90 = false;
					@Pc(288) Class39 local288 = Static50.aClass39Array13[local266];
					Static50.aClass39Array13[local266] = Static50.aClass39Array13[local266 + 1];
					Static50.aClass39Array13[local266 + 1] = local288;
					@Pc(306) int local306 = Static66.anIntArray246[local266];
					Static66.anIntArray246[local266] = Static66.anIntArray246[local266 + 1];
					Static66.anIntArray246[local266 + 1] = local306;
					@Pc(324) int local324 = Static100.anIntArray390[local266];
					Static100.anIntArray390[local266] = Static100.anIntArray390[local266 + 1];
					Static100.anIntArray390[local266 + 1] = local324;
					@Pc(342) int local342 = Static67.anIntArray250[local266];
					Static67.anIntArray250[local266] = Static67.anIntArray250[local266 + 1];
					Static67.anIntArray250[local266 + 1] = local342;
					@Pc(360) int local360 = Static12.anIntArray90[local266];
					Static12.anIntArray90[local266] = Static12.anIntArray90[local266 + 1];
					Static12.anIntArray90[local266 + 1] = local360;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!kd;ZILclient!kd;III)V")
	public static void method1242(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class39 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static110.anInt2795 >= 500) {
			return;
		}
		if (arg0.method1175() <= 0) {
			Static50.aClass39Array13[Static110.anInt2795] = arg2;
		} else {
			Static50.aClass39Array13[Static110.anInt2795] = Static30.method601(new Class39[] { arg2, Static116.aClass39_1382, arg0 });
		}
		Static66.anIntArray246[Static110.anInt2795] = arg1;
		Static12.anIntArray90[Static110.anInt2795] = arg5;
		Static100.anIntArray390[Static110.anInt2795] = arg3;
		Static67.anIntArray250[Static110.anInt2795] = arg4;
		Static110.anInt2795++;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1243() {
		Static58.aClass33_21.method1034();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!q;IZLclient!q;I)Lclient!qd;")
	public static Class1_Sub1_Sub13 method1244(@OriginalArg(0) Class62 arg0, @OriginalArg(3) Class62 arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int[] local10 = arg0.method2006(arg2);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local10.length; local14++) {
			@Pc(24) byte[] local24 = arg0.method2000(arg2, local10[local14]);
			if (local24 == null) {
				local12 = false;
			} else {
				@Pc(44) int local44 = (local24[0] & 0xFF) << 8 | local24[1] & 0xFF;
				@Pc(60) byte[] local60 = arg1.method2000(local44, 0);
				if (local60 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class1_Sub1_Sub13(arg0, arg1, arg2, false);
		} catch (@Pc(86) Exception local86) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V")
	public static void method1245() {
		for (@Pc(10) Class1_Sub6 local10 = (Class1_Sub6) Static120.aClass31_69.method1000(); local10 != null; local10 = (Class1_Sub6) Static120.aClass31_69.method1003()) {
			if (local10.aClass1_Sub8_Sub1_1 != null) {
				Static19.aClass1_Sub8_Sub3_1.method1634(local10.aClass1_Sub8_Sub1_1);
				local10.aClass1_Sub8_Sub1_1 = null;
			}
			if (local10.aClass1_Sub8_Sub1_2 != null) {
				Static19.aClass1_Sub8_Sub3_1.method1634(local10.aClass1_Sub8_Sub1_2);
				local10.aClass1_Sub8_Sub1_2 = null;
			}
		}
		Static120.aClass31_69.method995();
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)V")
	public static void method1246() {
		aClass42_2 = null;
		aClass74_3 = null;
		aClass39_887 = null;
		aClass1_Sub1_Sub4_Sub1_34 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/awt/Component;IBLclient!w;I)Lclient!ha;")
	public static Class26 method1247(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class79 arg2, @OriginalArg(4) int arg3) {
		if (Static44.anInt1243 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(44) Class26 local44 = (Class26) Class.forName("Class26_Sub1").getDeclaredConstructor().newInstance();
			local44.anInt2779 = arg1;
			local44.anIntArray421 = new int[(Static18.aBoolean56 ? 2 : 1) * 256];
			local44.method1937(arg0);
			local44.anInt2778 = (arg1 & 0xFFFFFC00) + 1024;
			if (local44.anInt2778 > 16384) {
				local44.anInt2778 = 16384;
			}
			local44.method1928(local44.anInt2778);
			if (Static56.anInt1515 > 0 && Static88.aClass3_1 == null) {
				Static88.aClass3_1 = new Class3();
				arg2.method2087(Static56.anInt1515, Static88.aClass3_1);
			}
			if (Static88.aClass3_1 != null) {
				if (Static88.aClass3_1.aClass26Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static88.aClass3_1.aClass26Array1[arg3] = local44;
			}
			return local44;
		} catch (@Pc(116) Throwable local116) {
			try {
				@Pc(122) Class26_Sub2 local122 = new Class26_Sub2(arg2, arg3);
				local122.anInt2779 = arg1;
				local122.anIntArray421 = new int[(Static18.aBoolean56 ? 2 : 1) * 256];
				local122.method1937(arg0);
				local122.anInt2778 = 16384;
				local122.method1928(local122.anInt2778);
				if (Static56.anInt1515 > 0 && Static88.aClass3_1 == null) {
					Static88.aClass3_1 = new Class3();
					arg2.method2087(Static56.anInt1515, Static88.aClass3_1);
				}
				if (Static88.aClass3_1 != null) {
					if (Static88.aClass3_1.aClass26Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static88.aClass3_1.aClass26Array1[arg3] = local122;
				}
				return local122;
			} catch (@Pc(178) Throwable local178) {
				return new Class26();
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Z")
	public static boolean method1248(@OriginalArg(0) int arg0) {
		if (Static62.aBooleanArray16[arg0]) {
			return true;
		} else if (Static44.aClass62_11.method2005(arg0)) {
			@Pc(23) int local23 = Static44.aClass62_11.method1999(arg0);
			if (local23 == 0) {
				Static62.aBooleanArray16[arg0] = true;
				return true;
			}
			if (Static102.aClass1_Sub1_Sub1ArrayArray1[arg0] == null) {
				Static102.aClass1_Sub1_Sub1ArrayArray1[arg0] = new Class1_Sub1_Sub1[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static102.aClass1_Sub1_Sub1ArrayArray1[arg0][local42] == null) {
					@Pc(55) byte[] local55 = Static44.aClass62_11.method2008(local42, arg0);
					if (local55 != null) {
						Static102.aClass1_Sub1_Sub1ArrayArray1[arg0][local42] = new Class1_Sub1_Sub1();
						Static102.aClass1_Sub1_Sub1ArrayArray1[arg0][local42].anInt72 = local42 + (arg0 << 16);
						if (local55[0] == -1) {
							Static102.aClass1_Sub1_Sub1ArrayArray1[arg0][local42].method40(new Class1_Sub18(local55));
						} else {
							Static102.aClass1_Sub1_Sub1ArrayArray1[arg0][local42].method49(new Class1_Sub18(local55));
						}
					}
				}
			}
			Static62.aBooleanArray16[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}

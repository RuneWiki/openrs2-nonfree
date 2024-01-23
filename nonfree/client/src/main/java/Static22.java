import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "Lclient!hg;")
	public static Class1_Sub2_Sub7_Sub1 aClass1_Sub2_Sub7_Sub1_3;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
	public static int anInt2835 = 0;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray20 = new String[100];

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBIII)V")
	public static void method2180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static189.method3190(arg1, arg2, arg1 + arg3, arg0 + arg2);
		Static189.method3193(arg1, arg2, arg3, arg0, 0);
		if (Static265.anInt5546 < 100) {
			return;
		}
		if (Static119.aClass1_Sub2_Sub4_3 == null || arg3 != Static119.aClass1_Sub2_Sub4_3.anInt1292 || arg0 != Static119.aClass1_Sub2_Sub4_3.anInt1291) {
			@Pc(43) Class1_Sub2_Sub4_Sub1 local43 = new Class1_Sub2_Sub4_Sub1(arg3, arg0);
			Static189.method3199(local43.anIntArray94, arg3, arg0);
			Static207.method3448(0, 0, Static124.anInt3160, arg0, arg3, 0, Static174.anInt3997, 0);
			Static119.aClass1_Sub2_Sub4_3 = local43;
			Static193.aClass73_1.method2864();
		}
		@Pc(65) int local65 = 16711680;
		Static119.aClass1_Sub2_Sub4_3.method888(arg1, arg2);
		if (Static68.anInt1404 == 1) {
			local65 = 16777215;
		}
		@Pc(82) int local82 = arg2 + Static74.anInt2023 * arg0 / Static174.anInt3997;
		@Pc(88) int local88 = arg3 * Static239.anInt5156 / Static124.anInt3160;
		@Pc(97) int local97 = arg1 + arg3 * Static166.anInt3879 / Static124.anInt3160;
		@Pc(103) int local103 = Static148.anInt478 * arg0 / Static174.anInt3997;
		Static189.method3187(local97, local82, local88, local103, local65, 128);
		Static189.method3185(local97, local82, local88, local103, local65);
		if (Static168.anInt3925 <= 0) {
			return;
		}
		@Pc(133) int local133;
		if (Static19.anInt681 > 10) {
			local133 = (20 - Static19.anInt681) * 25;
		} else {
			local133 = Static19.anInt681 * 25;
		}
		for (@Pc(144) Class1_Sub22 local144 = (Class1_Sub22) Static225.aClass3_20.method30(); local144 != null; local144 = (Class1_Sub22) Static225.aClass3_20.method33()) {
			if (local144.anInt4156 == Static94.anInt4236) {
				@Pc(163) int local163 = arg1 + local144.anInt4154 * arg3 / Static124.anInt3160;
				@Pc(173) int local173 = arg2 + local144.anInt4150 * arg0 / Static174.anInt3997;
				Static189.method3187(local163 - 2, local173 - 2, 4, 4, 16776960, local133);
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBI)V")
	public static void method2182(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class1_Sub2_Sub18 local4 = Static13.method232(arg1, 13);
		local4.method3810();
		local4.anInt5009 = arg0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)[Lclient!ke;")
	public static Class1_Sub2_Sub4[] method2183() {
		@Pc(8) Class1_Sub2_Sub4[] local8 = new Class1_Sub2_Sub4[Static75.anInt2041];
		for (@Pc(10) int local10 = 0; local10 < Static75.anInt2041; local10++) {
			@Pc(20) int local20 = Static233.anIntArray438[local10] * Static218.anIntArray382[local10];
			@Pc(24) byte[] local24 = Static11.aByteArrayArray1[local10];
			@Pc(27) int[] local27 = new int[local20];
			for (@Pc(29) int local29 = 0; local29 < local20; local29++) {
				local27[local29] = Static102.anIntArray201[local24[local29] & 0xFF];
			}
			local8[local10] = new Class1_Sub2_Sub4_Sub1(Static24.anInt806, Static240.anInt5164, Static202.anIntArray345[local10], Static79.anIntArray165[local10], Static218.anIntArray382[local10], Static233.anIntArray438[local10], local27);
		}
		Static259.method4155();
		return local8;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!d;B)V")
	public static void method2185(@OriginalArg(0) Class28 arg0) {
		@Pc(3) Class129 local3 = null;
		try {
			@Pc(12) Class145 local12 = arg0.method716("runescape");
			while (local12.anInt5354 == 0) {
				Static30.method587(1L);
			}
			if (local12.anInt5354 == 1) {
				local3 = (Class129) local12.anObject7;
				@Pc(31) Class1_Sub13 local31 = Static153.method2743();
				local3.method3874(local31.anInt2395, 0, local31.aByteArray29);
			}
		} catch (@Pc(41) Exception local41) {
		}
		try {
			if (local3 != null) {
				local3.method3875();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2188(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + Static158.method2804(arg0.charAt(local17)) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ai;ZII)V")
	public static void method2189(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0.anInt443 && arg2 != -1) {
			@Pc(87) Class49 local87 = Static131.method697(arg2);
			@Pc(90) int local90 = local87.anInt2190;
			if (local90 == 1) {
				arg0.anInt431 = 0;
				arg0.anInt399 = arg1;
				arg0.anInt407 = 1;
				arg0.anInt415 = 0;
				arg0.anInt474 = 0;
				Static232.method3865(arg0.anInt479, arg0.anInt427, arg0 == Static83.aClass9_Sub1_Sub1_1, arg0.anInt431, local87);
			}
			if (local90 == 2) {
				arg0.anInt415 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt443 == -1 || Static131.method697(arg2).anInt2189 >= Static131.method697(arg0.anInt443).anInt2189) {
			arg0.anInt399 = arg1;
			arg0.anInt443 = arg2;
			arg0.anInt415 = 0;
			arg0.anInt474 = 0;
			arg0.anInt407 = 1;
			arg0.anInt431 = 0;
			arg0.anInt434 = arg0.anInt453;
			if (arg0.anInt443 == -1) {
				return;
			}
			Static232.method3865(arg0.anInt479, arg0.anInt427, arg0 == Static83.aClass9_Sub1_Sub1_1, arg0.anInt431, Static131.method697(arg0.anInt443));
		}
	}
}

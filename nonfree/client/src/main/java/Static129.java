import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!nc", name = "Gb", descriptor = "I")
	public static int anInt1215;

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "Lclient!db;")
	public static Class19 aClass19_7 = new Class19();

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "Lclient!kh;")
	private static Class60 aClass60_375 = Static200.method3116("Prepared sound engine");

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "Lclient!kh;")
	private static Class60 aClass60_376 = Static200.method3116("Type");

	@OriginalMember(owner = "client!nc", name = "gb", descriptor = "I")
	public static int anInt1190 = 0;

	@OriginalMember(owner = "client!nc", name = "wb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_377 = aClass60_375;

	@OriginalMember(owner = "client!nc", name = "Jb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_378 = aClass60_376;

	@OriginalMember(owner = "client!nc", name = "Qb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_380 = Static200.method3116("Invalid username or password)3");

	@OriginalMember(owner = "client!nc", name = "Nb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_379 = aClass60_380;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public static int method886(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Lclient!md;")
	public static Class1_Sub1_Sub13 method887(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub13 local10 = (Class1_Sub1_Sub13) Static52.aClass39_9.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static90.aClass7_16.method3242(4, arg0);
		local10 = new Class1_Sub1_Sub13();
		if (local22 != null) {
			local10.method2025(arg0, new Class1_Sub9(local22));
		}
		Static52.aClass39_9.method1152((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)I")
	public static int method888(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local12 * arg0;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "(B)V")
	public static void method898() {
		@Pc(13) int local13 = Static138.anInt3087 - (int) ((double) Static147.aClass6_13.anInt251 / Static82.aDouble2);
		@Pc(22) int local22 = Static138.anInt3087 + (int) ((double) Static147.aClass6_13.anInt251 / Static82.aDouble2);
		if (local13 < 0) {
			Static32.anInt816 = -1;
			Static138.anInt3087 = (int) ((double) Static147.aClass6_13.anInt251 / Static82.aDouble2);
			Static188.anInt4036 = -1;
		}
		if (Static211.anInt3462 < local22) {
			Static188.anInt4036 = -1;
			Static32.anInt816 = -1;
			Static138.anInt3087 = Static211.anInt3462 - (int) ((double) Static147.aClass6_13.anInt251 / Static82.aDouble2);
		}
		@Pc(64) int local64 = Static1.anInt42 - (int) ((double) Static147.aClass6_13.anInt221 / Static82.aDouble2);
		@Pc(73) int local73 = Static1.anInt42 + (int) ((double) Static147.aClass6_13.anInt221 / Static82.aDouble2);
		if (local64 < 0) {
			Static188.anInt4036 = -1;
			Static32.anInt816 = -1;
			Static1.anInt42 = (int) ((double) Static147.aClass6_13.anInt221 / Static82.aDouble2);
		}
		if (Static30.anInt724 < local73) {
			Static32.anInt816 = -1;
			Static1.anInt42 = Static30.anInt724 - (int) ((double) Static147.aClass6_13.anInt221 / Static82.aDouble2);
			Static188.anInt4036 = -1;
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(ZI)V")
	public static void method922(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static199.method3112(arg0)) {
			return;
		}
		@Pc(18) Class6[] local18 = Static82.aClass6ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class6 local26 = local18[local20];
			if (local26.anObjectArray27 != null) {
				@Pc(33) Class1_Sub8 local33 = new Class1_Sub8();
				local33.anObjectArray29 = local26.anObjectArray27;
				local33.aClass6_5 = local26;
				Static205.method3192(2000000, local33);
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "(II)I")
	public static int method928(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!nc;)V")
	public static void method933(@OriginalArg(1) Class1_Sub9 arg0) {
		if (Static80.aClass66_1 != null) {
			try {
				Static80.aClass66_1.method2030(0L);
				Static80.aClass66_1.method2037(arg0.aByteArray20, 24, arg0.anInt1192);
			} catch (@Pc(23) Exception local23) {
			}
		}
		arg0.anInt1192 += 24;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(IB)V")
	public static void method938(@OriginalArg(0) int arg0) {
		Static21.anInt499 += arg0 * 128;
		@Pc(31) int local31;
		if (Static21.anInt499 > Static186.anIntArray517.length) {
			Static21.anInt499 -= Static186.anIntArray517.length;
			local31 = (int) (Math.random() * 12.0D);
			Static131.method2193(Static67.aClass73_Sub1Array1[local31]);
		}
		local31 = 0;
		@Pc(42) int local42 = arg0 * 128;
		@Pc(48) int local48 = (256 - arg0) * 128;
		@Pc(75) int local75;
		for (@Pc(50) int local50 = 0; local50 < local48; local50++) {
			local75 = Static89.anIntArray243[local31 + local42] - Static186.anIntArray517[Static186.anIntArray517.length - 1 & local31 - -Static21.anInt499] * arg0 / 6;
			if (local75 < 0) {
				local75 = 0;
			}
			Static89.anIntArray243[local31++] = local75;
		}
		@Pc(100) int local100;
		@Pc(107) int local107;
		for (local75 = 256 - arg0; local75 < 256; local75++) {
			@Pc(98) int local98 = local75 * 128;
			for (local100 = 0; local100 < 128; local100++) {
				local107 = (int) (Math.random() * 100.0D);
				if (local107 < 50 && local100 > 10 && local100 < 118) {
					Static89.anIntArray243[local98 + local100] = 255;
				} else {
					Static89.anIntArray243[local98 + local100] = 0;
				}
			}
		}
		if (Static208.anInt4446 > 0) {
			Static208.anInt4446 -= arg0 * 4;
		}
		if (Static18.anInt464 > 0) {
			Static18.anInt464 -= arg0 * 4;
		}
		if (Static18.anInt464 == 0 && Static208.anInt4446 == 0) {
			local100 = (int) ((double) (2000 / arg0) * Math.random());
			if (local100 == 1) {
				Static208.anInt4446 = 1024;
			}
			if (local100 == 0) {
				Static18.anInt464 = 1024;
			}
		}
		for (local100 = 0; local100 < 256 - arg0; local100++) {
			Static45.anIntArray142[local100] = Static45.anIntArray142[local100 + arg0];
		}
		for (local107 = 256 - arg0; local107 < 256; local107++) {
			Static45.anIntArray142[local107] = (int) (Math.sin((double) Static206.anInt4378 / 14.0D) * 16.0D + Math.sin((double) Static206.anInt4378 / 15.0D) * 14.0D + Math.sin((double) Static206.anInt4378 / 16.0D) * 12.0D);
			Static206.anInt4378++;
		}
		Static193.anInt4129 += arg0;
		@Pc(280) int local280 = (arg0 + (Static42.anInt910 & 0x1)) / 2;
		if (local280 <= 0) {
			return;
		}
		@Pc(300) int local300;
		@Pc(293) int local293;
		for (@Pc(284) int local284 = 0; local284 < Static193.anInt4129 * 100; local284++) {
			local293 = (int) (Math.random() * 128.0D) + 128;
			local300 = (int) (Math.random() * 124.0D) + 2;
			Static89.anIntArray243[local300 + (local293 << 7)] = 192;
		}
		Static193.anInt4129 = 0;
		@Pc(326) int local326;
		@Pc(329) int local329;
		for (local300 = 0; local300 < 256; local300++) {
			local293 = 0;
			local326 = local300 * 128;
			for (local329 = -local280; local329 < 128; local329++) {
				if (local329 + local280 < 128) {
					local293 += Static89.anIntArray243[local329 + local326 + local280];
				}
				if (local329 - local280 - 1 >= 0) {
					local293 -= Static89.anIntArray243[local326 + local329 - local280 - 1];
				}
				if (local329 >= 0) {
					Static101.anIntArray476[local326 + local329] = local293 / (local280 * 2 + 1);
				}
			}
		}
		for (local293 = 0; local293 < 128; local293++) {
			local326 = 0;
			for (local329 = -local280; local329 < 256; local329++) {
				@Pc(412) int local412 = local329 * 128;
				if (local329 + local280 < 256) {
					local326 += Static101.anIntArray476[local280 * 128 + local412 + local293];
				}
				if (local329 - local280 - 1 >= 0) {
					local326 -= Static101.anIntArray476[local412 + local293 - (local280 + 1) * 128];
				}
				if (local329 >= 0) {
					Static89.anIntArray243[local293 + local412] = local326 / (local280 * 2 + 1);
				}
			}
		}
	}
}

import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "Lclient!c;")
	public static Class10 aClass10_54;

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "[Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1[] aClass2_Sub3_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Lclient!ai;")
	public static Class6 aClass6_409 = null;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
	public static int[] anIntArray94 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	public static int anInt1442 = 0;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "Lclient!ai;")
	public static Class6 aClass6_410 = Static38.method685(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!ai;")
	public static Class6 aClass6_411 = Static38.method685("(U");

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "[I")
	public static int[] anIntArray95 = new int[4000];

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "Lclient!ai;")
	private static Class6 aClass6_413 = Static38.method685("Error connecting to server)3");

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_412 = aClass6_413;

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "Lclient!ai;")
	public static Class6 aClass6_414 = Static38.method685(":assist:");

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "Lclient!ai;")
	public static Class6 aClass6_415 = Static38.method685("mn");

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!k;BZ)V")
	public static void method935(@OriginalArg(0) Class43 arg0, @OriginalArg(2) boolean arg1) {
		if (Static16.aClass43_1 != null) {
			try {
				Static16.aClass43_1.method1236();
			} catch (@Pc(17) Exception local17) {
			}
			Static16.aClass43_1 = null;
		}
		Static16.aClass43_1 = arg0;
		Static90.method2635(arg1);
		Static88.aClass2_Sub13_3 = null;
		Static25.aClass2_Sub13_1.anInt2154 = 0;
		Static59.anInt1515 = 0;
		Static139.aClass2_Sub3_Sub18_1 = null;
		while (true) {
			@Pc(38) Class2_Sub3_Sub18 local38 = (Class2_Sub3_Sub18) Static153.aClass16_11.method478();
			if (local38 == null) {
				while (true) {
					local38 = (Class2_Sub3_Sub18) Static85.aClass16_5.method478();
					if (local38 == null) {
						if (Static111.aByte5 != 0) {
							try {
								@Pc(95) Class2_Sub13 local95 = new Class2_Sub13(4);
								local95.method1416(4);
								local95.method1416(Static111.aByte5);
								local95.method1428(0);
								Static16.aClass43_1.method1241(4, local95.aByteArray14);
							} catch (@Pc(118) IOException local118) {
								try {
									Static16.aClass43_1.method1236();
								} catch (@Pc(123) Exception local123) {
								}
								Static16.aClass43_1 = null;
								anInt1442++;
							}
						}
						Static103.anInt2519 = 0;
						Static87.aLong128 = Static70.method1106();
						return;
					}
					Static36.aClass60_2.method1871(local38);
					Static86.aClass16_6.method480(local38, local38.aLong241);
					Static166.anInt3915--;
					Static89.anInt2267++;
				}
			}
			Static158.aClass16_12.method480(local38, local38.aLong241);
			Static77.anInt1912++;
			Static161.anInt3790--;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIBII)V")
	public static void method936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static113.anInt2749 == 1) {
			Static81.aClass2_Sub3_Sub2_Sub1Array3[Static73.anInt1792 / 100].method280(Static17.anInt2418 - 8, Static83.anInt2045 - 8);
		}
		if (Static113.anInt2749 == 2) {
			Static81.aClass2_Sub3_Sub2_Sub1Array3[Static73.anInt1792 / 100 + 4].method280(Static17.anInt2418 - 8, Static83.anInt2045 - 8);
		}
		Static10.method159();
		if (!Static110.aBoolean108) {
			return;
		}
		@Pc(53) int local53 = arg1 + 512 - 5;
		@Pc(55) int local55 = 16776960;
		@Pc(59) int local59 = arg3 + 20;
		Static120.aClass2_Sub3_Sub2_Sub4_Sub1_6.method2511(Static58.method956(new Class6[] { Static10.aClass6_92, Static106.method2806(Static129.anInt4161) }), local53, local59, 16776960, -1);
		@Pc(81) Runtime local81 = Runtime.getRuntime();
		@Pc(91) int local91 = (int) ((local81.totalMemory() - local81.freeMemory()) / 1024L);
		@Pc(92) int local92 = local59 + 15;
		if (local91 > 32768 && Static113.aBoolean112) {
			local55 = 16711680;
		}
		if (local91 > 65536 && !Static113.aBoolean112) {
			local55 = 16711680;
		}
		Static120.aClass2_Sub3_Sub2_Sub4_Sub1_6.method2511(Static58.method956(new Class6[] { Static139.aClass6_948, Static106.method2806(local91), Static38.aClass6_293 }), local53, local92, local55, -1);
		local59 = local92 + 15;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
	public static void method937() {
		aClass6_410 = null;
		aClass6_413 = null;
		aClass6_415 = null;
		anIntArray95 = null;
		aClass2_Sub3_Sub2_Sub1Array2 = null;
		anIntArray94 = null;
		aClass6_414 = null;
		aClass6_409 = null;
		aClass6_412 = null;
		aClass6_411 = null;
		aClass10_54 = null;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZLclient!ih;Ljava/awt/Component;)Lclient!wg;")
	public static Class41 method938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class36 arg2, @OriginalArg(4) Component arg3) {
		if (Static50.anInt1375 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(37) Class41 local37 = (Class41) Class.forName("Class41_Sub1").getDeclaredConstructor().newInstance();
			local37.anIntArray174 = new int[(Static23.aBoolean20 ? 2 : 1) * 256];
			local37.anInt2316 = arg1;
			local37.method1514(arg3);
			local37.anInt2307 = (-1024 & arg1) + 1024;
			if (local37.anInt2307 > 16384) {
				local37.anInt2307 = 16384;
			}
			local37.method1517(local37.anInt2307);
			if (Static61.anInt1524 > 0 && Static17.aClass14_2 == null) {
				Static17.aClass14_2 = new Class14();
				Static17.aClass14_2.aClass36_1 = arg2;
				arg2.method1109(Static61.anInt1524, Static17.aClass14_2);
			}
			if (Static17.aClass14_2 != null) {
				if (Static17.aClass14_2.aClass41Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static17.aClass14_2.aClass41Array1[arg0] = local37;
			}
			return local37;
		} catch (@Pc(109) Throwable local109) {
			try {
				@Pc(115) Class41_Sub2 local115 = new Class41_Sub2(arg2, arg0);
				local115.anInt2316 = arg1;
				local115.anIntArray174 = new int[(Static23.aBoolean20 ? 2 : 1) * 256];
				local115.method1514(arg3);
				local115.anInt2307 = 16384;
				local115.method1517(local115.anInt2307);
				if (Static61.anInt1524 > 0 && Static17.aClass14_2 == null) {
					Static17.aClass14_2 = new Class14();
					Static17.aClass14_2.aClass36_1 = arg2;
					arg2.method1109(Static61.anInt1524, Static17.aClass14_2);
				}
				if (Static17.aClass14_2 != null) {
					if (Static17.aClass14_2.aClass41Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static17.aClass14_2.aClass41Array1[arg0] = local115;
				}
				return local115;
			} catch (@Pc(177) Throwable local177) {
				return new Class41();
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!c;Lclient!ph;BLclient!c;Lclient!c;)Z")
	public static boolean method939(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class2_Sub10_Sub3 arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) Class10 arg3) {
		Static95.aClass10_77 = arg0;
		Static29.aClass10_28 = arg2;
		Static89.aClass2_Sub10_Sub3_1 = arg1;
		Static165.aClass10_134 = arg3;
		return true;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "[Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "Lclient!nf;")
	public static Class4_Sub1_Sub2_Sub4_Sub1 aClass4_Sub1_Sub2_Sub4_Sub1_3;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Lclient!ec;")
	public static Class22 aClass22_313 = Static60.method1113("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!ec;")
	public static Class22 aClass22_314 = Static60.method1113("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!ec;")
	private static Class22 aClass22_315 = Static60.method1113("Checking for updates )2 ");

	@OriginalMember(owner = "client!he", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_316 = Static60.method1113("ams");

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_317 = Static60.method1113("Registrierter Benutzer");

	@OriginalMember(owner = "client!he", name = "j", descriptor = "Lclient!ec;")
	private static Class22 aClass22_318 = Static60.method1113("This computers address has been blocked");

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!ec;")
	public static Class22 aClass22_319 = aClass22_315;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "Lclient!ec;")
	public static Class22 aClass22_320 = aClass22_318;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	public static int anInt1290 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!he", name = "s", descriptor = "I")
	public static int anInt1293 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	public static void method888(@OriginalArg(1) int arg0) {
		if (Static112.anInt2775 == arg0) {
			return;
		}
		if (Static112.anInt2775 == 0) {
			Static78.method1303();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static110.anInt2733 = 0;
			Static34.anInt857 = 0;
			Static44.anInt1212 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static66.aClass6_3 != null) {
			Static66.aClass6_3.method136();
			Static66.aClass6_3 = null;
		}
		if (Static112.anInt2775 == 25) {
			Static45.anInt1249 = 1;
			Static32.anInt820 = 1;
			Static99.anInt2586 = 0;
			Static32.anInt819 = 0;
			Static129.anInt3052 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static93.method1623(Static59.aClass20_Sub1_43, Static26.aClass20_Sub1_25, Static89.aCanvas1);
		} else {
			Static19.method375();
		}
		Static112.anInt2775 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(JI)V")
	public static void method889(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static60.method1116(arg0 - 1L);
			Static60.method1116(1L);
		} else {
			Static60.method1116(arg0);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z[B)V")
	public static void method890(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class4_Sub11 local10 = new Class4_Sub11(arg0);
		local10.anInt1099 = arg0.length - 2;
		Static76.anInt2020 = local10.method718();
		Static105.anIntArray297 = new int[Static76.anInt2020];
		Static57.anIntArray171 = new int[Static76.anInt2020];
		Static30.anIntArray77 = new int[Static76.anInt2020];
		Static124.aByteArrayArray9 = new byte[Static76.anInt2020][];
		Static61.anIntArray175 = new int[Static76.anInt2020];
		local10.anInt1099 = arg0.length - Static76.anInt2020 * 8 - 7;
		Static129.anInt3064 = local10.method718();
		Static106.anInt2687 = local10.method718();
		@Pc(61) int local61 = (local10.method719() & 0xFF) + 1;
		for (@Pc(63) int local63 = 0; local63 < Static76.anInt2020; local63++) {
			Static57.anIntArray171[local63] = local10.method718();
		}
		for (@Pc(81) int local81 = 0; local81 < Static76.anInt2020; local81++) {
			Static61.anIntArray175[local81] = local10.method718();
		}
		for (@Pc(95) int local95 = 0; local95 < Static76.anInt2020; local95++) {
			Static105.anIntArray297[local95] = local10.method718();
		}
		for (@Pc(113) int local113 = 0; local113 < Static76.anInt2020; local113++) {
			Static30.anIntArray77[local113] = local10.method718();
		}
		local10.anInt1099 = arg0.length - Static76.anInt2020 * 8 - (local61 + -1) * 3 - 7;
		Static27.anIntArray75 = new int[local61];
		for (@Pc(148) int local148 = 1; local148 < local61; local148++) {
			Static27.anIntArray75[local148] = local10.method704();
			if (Static27.anIntArray75[local148] == 0) {
				Static27.anIntArray75[local148] = 1;
			}
		}
		local10.anInt1099 = 0;
		for (@Pc(177) int local177 = 0; local177 < Static76.anInt2020; local177++) {
			@Pc(183) int local183 = Static105.anIntArray297[local177];
			@Pc(187) int local187 = Static30.anIntArray77[local177];
			@Pc(191) int local191 = local183 * local187;
			@Pc(194) byte[] local194 = new byte[local191];
			Static124.aByteArrayArray9[local177] = local194;
			@Pc(202) int local202 = local10.method719();
			@Pc(206) int local206;
			if (local202 == 0) {
				for (local206 = 0; local206 < local191; local206++) {
					local194[local206] = local10.method731();
				}
			} else if (local202 == 1) {
				for (local206 = 0; local206 < local183; local206++) {
					for (@Pc(233) int local233 = 0; local233 < local187; local233++) {
						local194[local206 + local183 * local233] = local10.method731();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B[Lclient!f;I)V")
	public static void method891(@OriginalArg(1) Class4_Sub7[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(19) Class4_Sub7 local19 = arg0[local13];
			if (local19 != null) {
				if (local19.anInt743 == 0) {
					if (local19.aClass4_Sub7Array1 != null) {
						method891(local19.aClass4_Sub7Array1, arg1);
					}
					@Pc(43) Class4_Sub21 local43 = (Class4_Sub21) Static90.aClass81_11.method2010((long) local19.anInt738);
					if (local43 != null) {
						Static130.method2006(local43.anInt2939, arg1);
					}
				}
				@Pc(59) Class4_Sub3 local59;
				if (arg1 == 0 && local19.anObjectArray5 != null) {
					local59 = new Class4_Sub3();
					local59.anObjectArray1 = local19.anObjectArray5;
					local59.aClass4_Sub7_3 = local19;
					Static133.method2036(local59);
				}
				if (arg1 == 1 && local19.anObjectArray14 != null) {
					if (local19.anInt784 >= 0) {
						@Pc(86) Class4_Sub7 local86 = Static106.method1749(local19.anInt738);
						if (local86 == null || local86.aClass4_Sub7Array1 == null || local86.aClass4_Sub7Array1.length <= local19.anInt784 || local86.aClass4_Sub7Array1[local19.anInt784] != local19) {
							continue;
						}
					}
					local59 = new Class4_Sub3();
					local59.anObjectArray1 = local19.anObjectArray14;
					local59.aClass4_Sub7_3 = local19;
					Static133.method2036(local59);
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method892() {
		aClass22_320 = null;
		aClass22_316 = null;
		aClass22_313 = null;
		aClass22_318 = null;
		aClass4_Sub1_Sub2_Sub3Array3 = null;
		aClass22_317 = null;
		aClass22_314 = null;
		aClass22_319 = null;
		aClass4_Sub1_Sub2_Sub4_Sub1_3 = null;
		aClass22_315 = null;
		aShortArrayArray1 = null;
	}
}

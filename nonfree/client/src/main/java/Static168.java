import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
	public static int anInt4089;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1420 = Static170.method3101("glow2:");

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1419 = aClass28_1420;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1421 = Static170.method3101("Neuer Benutzer");

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1423 = Static170.method3101("Loaded config");

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1422 = aClass28_1423;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1424 = Static170.method3101(" from your ignore list first)3");

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
	public static int anInt4083 = -1;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1425 = aClass28_1424;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1426 = aClass28_1420;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Z")
	public static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1427 = Static170.method3101("<col=00ff00>");

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1428 = Static170.method3101(":trade:");

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "J")
	public static long aLong138 = 0L;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!gf;III)V")
	public static void method3095(@OriginalArg(1) Class33 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static110.method2233();
		Static147.method1773(arg3, arg1, arg3 + arg0.anInt1457, arg1 - -arg0.anInt1515);
		if (Static16.anInt490 == 2 || Static16.anInt490 == 5) {
			Static147.method1781(arg3, arg1, arg0.anIntArray263, arg0.anIntArray265);
		} else {
			@Pc(33) int local33 = 464 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 / 32;
			@Pc(40) int local40 = Static139.anInt3673 + Static170.anInt4092 & 0x7FF;
			@Pc(47) int local47 = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 / 32 + 48;
			Static4.aClass3_Sub2_Sub2_Sub4_1.method988(arg3, arg1, arg0.anInt1457, arg0.anInt1515, local47, local33, local40, Static51.anInt1446 + 256, arg0.anIntArray263, arg0.anIntArray265);
			@Pc(81) int local81;
			@Pc(94) int local94;
			for (@Pc(67) int local67 = 0; local67 < Static80.anInt3610; local67++) {
				local81 = Static133.anIntArray581[local67] * 4 + 2 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 / 32;
				local94 = Static43.anIntArray229[local67] * 4 + 2 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 / 32;
				Static121.method2434(arg0, local94, arg1, Static162.aClass3_Sub2_Sub2_Sub4Array9[local67], arg3, local81);
			}
			@Pc(135) int local135;
			@Pc(146) int local146;
			for (local81 = 0; local81 < 104; local81++) {
				for (local94 = 0; local94 < 104; local94++) {
					@Pc(122) Class23 local122 = Static26.aClass23ArrayArrayArray1[Static171.anInt4109][local81][local94];
					if (local122 != null) {
						local135 = local81 * 4 + 2 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 / 32;
						local146 = local94 * 4 + 2 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 / 32;
						Static121.method2434(arg0, local146, arg1, Static146.aClass3_Sub2_Sub2_Sub4Array7[0], arg3, local135);
					}
				}
			}
			@Pc(225) int local225;
			for (local94 = 0; local94 < Static69.anInt2115; local94++) {
				@Pc(177) Class3_Sub2_Sub1_Sub2_Sub2 local177 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[Static117.anIntArray523[local94]];
				if (local177 != null && local177.method1436()) {
					@Pc(186) Class3_Sub2_Sub7 local186 = local177.aClass3_Sub2_Sub7_1;
					if (local186 != null && local186.anIntArray242 != null) {
						local186 = local186.method1118();
					}
					if (local186 != null && local186.aBoolean70 && local186.aBoolean69) {
						local146 = local177.anInt1800 / 32 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 / 32;
						local225 = local177.anInt1792 / 32 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 / 32;
						Static121.method2434(arg0, local225, arg1, Static146.aClass3_Sub2_Sub2_Sub4Array7[1], arg3, local146);
					}
				}
			}
			@Pc(248) Class3_Sub2_Sub1_Sub2_Sub1 local248;
			for (@Pc(241) int local241 = 0; local241 < Static112.anInt2872; local241++) {
				local248 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[Static126.anIntArray557[local241]];
				if (local248 != null && local248.method1436()) {
					local146 = local248.anInt1800 / 32 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 / 32;
					local225 = local248.anInt1792 / 32 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 / 32;
					@Pc(280) long local280 = local248.aClass28_296.method924();
					@Pc(282) boolean local282 = false;
					for (@Pc(284) int local284 = 0; local284 < Static66.anInt2068; local284++) {
						if (Static26.aLongArray4[local284] == local280 && Static114.anIntArray509[local284] != 0) {
							local282 = true;
							break;
						}
					}
					@Pc(311) boolean local311 = false;
					if (Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt880 != 0 && local248.anInt880 != 0 && Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt880 == local248.anInt880) {
						local311 = true;
					}
					if (local282) {
						Static121.method2434(arg0, local225, arg1, Static146.aClass3_Sub2_Sub2_Sub4Array7[3], arg3, local146);
					} else if (local311) {
						Static121.method2434(arg0, local225, arg1, Static146.aClass3_Sub2_Sub2_Sub4Array7[4], arg3, local146);
					} else {
						Static121.method2434(arg0, local225, arg1, Static146.aClass3_Sub2_Sub2_Sub4Array7[2], arg3, local146);
					}
				}
			}
			if (Static82.anInt2391 != 0 && Static14.anInt481 % 20 < 10) {
				if (Static82.anInt2391 == 1 && Static22.anInt590 >= 0 && Static22.anInt590 < Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1.length) {
					@Pc(398) Class3_Sub2_Sub1_Sub2_Sub2 local398 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[Static22.anInt590];
					if (local398 != null) {
						local146 = local398.anInt1800 / 32 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 / 32;
						local225 = local398.anInt1792 / 32 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 / 32;
						Static125.method2487(local225, local146, arg3, arg1, arg0, Static75.aClass3_Sub2_Sub2_Sub4Array1[1]);
					}
				}
				if (Static82.anInt2391 == 2) {
					local146 = (Static84.anInt2468 - Static29.anInt907) * 4 + 2 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 / 32;
					local135 = (Static145.anInt3634 - Static111.anInt2843) * 4 + 2 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 / 32;
					Static125.method2487(local146, local135, arg3, arg1, arg0, Static75.aClass3_Sub2_Sub2_Sub4Array1[1]);
				}
				if (Static82.anInt2391 == 10 && Static71.anInt2137 >= 0 && Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1.length > Static71.anInt2137) {
					local248 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[Static71.anInt2137];
					if (local248 != null) {
						local225 = local248.anInt1792 / 32 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 / 32;
						local146 = local248.anInt1800 / 32 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 / 32;
						Static125.method2487(local225, local146, arg3, arg1, arg0, Static75.aClass3_Sub2_Sub2_Sub4Array1[1]);
					}
				}
			}
			if (Static21.anInt574 != 0) {
				local135 = Static21.anInt574 * 4 + 2 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 / 32;
				local146 = Static41.anInt1106 * 4 + 2 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 / 32;
				Static121.method2434(arg0, local146, arg1, Static75.aClass3_Sub2_Sub2_Sub4Array1[0], arg3, local135);
			}
			Static147.method1775(arg3 + arg0.anInt1457 / 2 - 1, arg0.anInt1515 / 2 + arg1 + -1, 3, 3, 16777215);
		}
		Static118.aBooleanArray13[arg2] = true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public static void method3096() {
		aClass28_1421 = null;
		aClass28_1428 = null;
		aClass28_1425 = null;
		aClass28_1423 = null;
		aClass28_1420 = null;
		aClass28_1427 = null;
		aClass28_1424 = null;
		aClass28_1422 = null;
		aClass28_1419 = null;
		aClass28_1426 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)Z")
	public static boolean method3098(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B[Lclient!eh;)[Lclient!eh;")
	public static Class28[] method3099(@OriginalArg(1) Class28[] arg0) {
		@Pc(6) Class28[] local6 = new Class28[5];
		for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
			local6[local13] = Static4.method96(new Class28[] { Static146.method2793(local13), Static46.aClass28_404 });
			if (arg0 != null && arg0[local13] != null) {
				local6[local13] = Static4.method96(new Class28[] { local6[local13], arg0[local13] });
			}
		}
		return local6;
	}
}

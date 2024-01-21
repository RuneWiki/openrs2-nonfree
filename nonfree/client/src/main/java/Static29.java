import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!ca;")
	public static Class14 aClass14_3;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Ljava/lang/Object;")
	public static Object anObject3 = new Object();

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!kb;")
	public static Class46 aClass46_169 = Static65.method1172("sl_flags");

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!ag;")
	public static Class3_Sub4_Sub1 aClass3_Sub4_Sub1_1 = new Class3_Sub4_Sub1(5000);

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Lclient!kb;")
	public static Class46 aClass46_170 = Static65.method1172("Passwort: ");

	@OriginalMember(owner = "client!d", name = "j", descriptor = "I")
	public static int anInt697 = 0;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "I")
	public static int anInt698 = -1;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!kb;")
	private static Class46 aClass46_172 = Static65.method1172("Please reload this page)3");

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!kb;")
	public static Class46 aClass46_171 = aClass46_172;

	@OriginalMember(owner = "client!d", name = "n", descriptor = "Lclient!kb;")
	public static Class46 aClass46_173 = Static65.method1172("Spieler");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method487() {
		aClass46_170 = null;
		aClass46_171 = null;
		aClass14_3 = null;
		aClass46_173 = null;
		anObject3 = null;
		aClass46_172 = null;
		aClass46_169 = null;
		aClass3_Sub4_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!eg;")
	public static Class3_Sub2_Sub4 method488(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub2_Sub4 local10 = (Class3_Sub2_Sub4) Static170.aClass57_29.method1719((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static100.method1651(arg0, Static179.aClass44_35, Static169.aClass44_30);
		if (local10 != null) {
			Static170.aClass57_29.method1717(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZZ)V")
	public static void method489(@OriginalArg(0) boolean arg0) {
		for (@Pc(8) int local8 = 0; local8 < Static174.anInt3804; local8++) {
			@Pc(16) Class3_Sub2_Sub1_Sub1_Sub2 local16 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[Static42.anIntArray106[local8]];
			@Pc(24) int local24 = (Static42.anIntArray106[local8] << 14) + 536870912;
			if (local16 != null && local16.method1161() && arg0 == local16.aClass3_Sub2_Sub16_1.aBoolean165 && local16.aClass3_Sub2_Sub16_1.method2740()) {
				@Pc(57) int local57 = local16.anInt1700 >> 7;
				@Pc(62) int local62 = local16.anInt1711 >> 7;
				if (local57 >= 0 && local57 < 104 && local62 >= 0 && local62 < 104) {
					if (local16.anInt1712 == 1 && (local16.anInt1700 & 0x7F) == 64 && (local16.anInt1711 & 0x7F) == 64) {
						if (Static42.anInt1175 == Static155.anIntArrayArray36[local57][local62]) {
							continue;
						}
						Static155.anIntArrayArray36[local57][local62] = Static42.anInt1175;
					}
					if (!local16.aClass3_Sub2_Sub16_1.aBoolean164) {
						local24 += Integer.MIN_VALUE;
					}
					local16.anInt1696 = Static168.method2689(local16.anInt1712 * 64 + local16.anInt1711 - 64, local16.anInt1700 - -((local16.anInt1712 + -1) * 64), Static99.anInt2422);
					Static154.aClass62_1.method2005(Static99.anInt2422, local16.anInt1700, local16.anInt1711, local16.anInt1696, local16.anInt1712 * 64 + 60 - 64, local16, local16.anInt1736, local24, local16.aBoolean65);
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(JI)V")
	public static void method490(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static52.anInt1391 >= 100 && Static101.anInt2435 != 1 || Static52.anInt1391 >= 200) {
			Static168.method2686(0, Static38.aClass46_298, Static33.aClass46_246);
			return;
		}
		@Pc(33) Class46 local33 = Static116.method1961(arg0).method1371();
		for (@Pc(40) int local40 = 0; local40 < Static52.anInt1391; local40++) {
			if (Static133.aLongArray2[local40] == arg0) {
				Static168.method2686(0, Static38.aClass46_298, Static178.method2860(new Class46[] { local33, Static84.aClass46_706 }));
				return;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static25.anInt3983; local71++) {
			if (Static146.aLongArray3[local71] == arg0) {
				Static168.method2686(0, Static38.aClass46_298, Static178.method2860(new Class46[] { Static161.aClass46_1297, local33, Static35.aClass46_276 }));
				return;
			}
		}
		if (local33.method1351(Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.aClass46_233)) {
			Static168.method2686(0, Static38.aClass46_298, Static4.aClass46_1338);
			return;
		}
		Static158.aClass46Array23[Static52.anInt1391] = local33;
		Static133.aLongArray2[Static52.anInt1391] = arg0;
		Static99.anIntArray246[Static52.anInt1391] = 0;
		Static180.anIntArray441[Static52.anInt1391] = 0;
		Static16.anInt418 = Static178.anInt3928;
		Static52.anInt1391++;
		Static133.aClass3_Sub4_Sub1_3.method233(147);
		Static133.aClass3_Sub4_Sub1_3.method201(arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!hb;")
	private static Class27 aClass27_715 = Static87.method1648("Cancel");

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!hb;")
	public static Class27 aClass27_711 = aClass27_715;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!fc;")
	public static Class21 aClass21_18 = new Class21(64);

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!hb;")
	public static Class27 aClass27_712 = Static87.method1648("titlebox");

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!hb;")
	private static Class27 aClass27_713 = Static87.method1648("Malformed login packet)3");

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!hb;")
	public static Class27 aClass27_714 = Static87.method1648("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Lclient!hb;")
	public static Class27 aClass27_716 = aClass27_713;

	@OriginalMember(owner = "client!l", name = "z", descriptor = "I")
	public static int anInt1464 = 1;

	@OriginalMember(owner = "client!l", name = "G", descriptor = "Lclient!hb;")
	private static Class27 aClass27_719 = Static87.method1648("Add friend");

	@OriginalMember(owner = "client!l", name = "A", descriptor = "Lclient!hb;")
	public static Class27 aClass27_717 = aClass27_719;

	@OriginalMember(owner = "client!l", name = "E", descriptor = "[[I")
	public static int[][] anIntArrayArray40 = new int[104][104];

	@OriginalMember(owner = "client!l", name = "F", descriptor = "Lclient!hb;")
	public static Class27 aClass27_718 = Static87.method1648("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	public static void method1071() {
		aClass27_712 = null;
		aClass27_714 = null;
		aClass27_716 = null;
		aClass27_717 = null;
		aClass21_18 = null;
		aClass27_719 = null;
		aClass27_718 = null;
		aClass27_713 = null;
		anIntArrayArray40 = null;
		aClass27_711 = null;
		aClass27_715 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z")
	public static boolean method1073(@OriginalArg(1) int arg0) {
		if (!Static80.method1535(arg0)) {
			return false;
		}
		@Pc(15) Class3_Sub3_Sub6[] local15 = Static96.aClass3_Sub3_Sub6ArrayArray5[arg0];
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
			@Pc(25) Class3_Sub3_Sub6 local25 = local15[local19];
			if (local25 != null && local25.anInt1608 == 6) {
				@Pc(53) int local53;
				if (local25.anInt1575 != -1 || local25.anInt1592 != -1) {
					@Pc(48) boolean local48 = Static89.method1691(local25);
					if (local48) {
						local53 = local25.anInt1592;
					} else {
						local53 = local25.anInt1575;
					}
					if (local53 != -1) {
						@Pc(65) Class3_Sub3_Sub14 local65 = Static16.method298(local53);
						local25.anInt1621 += Static39.anInt989;
						label50: while (true) {
							do {
								do {
									if (local65.anIntArray383[local25.anInt1598] >= local25.anInt1621) {
										break label50;
									}
									local17 = true;
									local25.anInt1621 -= local65.anIntArray383[local25.anInt1598];
									local25.anInt1598++;
								} while (local65.anIntArray382.length > local25.anInt1598);
								local25.anInt1598 -= local65.anInt2609;
							} while (local25.anInt1598 >= 0 && local65.anIntArray382.length > local25.anInt1598);
							local25.anInt1598 = 0;
						}
					}
				}
				if (local25.anInt1589 != 0) {
					local17 = true;
					@Pc(145) int local145 = local25.anInt1589 >> 16;
					@Pc(149) int local149 = local145 * Static39.anInt989;
					local25.anInt1613 = local149 + local25.anInt1613 & 0x7FF;
					local53 = local25.anInt1589 << 16 >> 16;
					local53 *= Static39.anInt989;
					local25.anInt1606 = local25.anInt1606 + local53 & 0x7FF;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
	public static void method1074() {
		@Pc(1) Object local1 = Static13.anObject3;
		synchronized (Static13.anObject3) {
			if (Static33.anInt813 == 0) {
				Static88.aClass32_4.method952(5, new Class19());
			}
			Static33.anInt813 = 600;
		}
	}
}

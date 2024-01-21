import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "Lclient!mb;")
	public static Class42 aClass42_6;

	@OriginalMember(owner = "client!ad", name = "S", descriptor = "Lclient!mb;")
	public static Class42 aClass42_7;

	@OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
	public static int anInt187;

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "Lclient!v;")
	private static Class62 aClass62_78 = Static45.method753(" is already on your ignore list");

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "Lclient!v;")
	public static Class62 aClass62_77 = aClass62_78;

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "Lclient!v;")
	public static Class62 aClass62_79 = Static45.method753("Schrifts\u001c1tze geladen)3");

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
	public static int anInt182 = 0;

	@OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
	public static int anInt185 = 0;

	@OriginalMember(owner = "client!ad", name = "X", descriptor = "Z")
	public static volatile boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
	public static int anInt186 = -1;

	@OriginalMember(owner = "client!ad", name = "cb", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
	public static void method159() {
		aClass62_77 = null;
		aClass42_7 = null;
		aClass62_79 = null;
		aClass42_6 = null;
		aClass62_78 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)Lclient!bc;")
	public static Class3_Sub1_Sub2 method160(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub2 local10 = (Class3_Sub1_Sub2) Static54.aClass34_33.method764((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static46.aClass42_34.method1504(10, arg0);
		local10 = new Class3_Sub1_Sub2();
		local10.anInt288 = arg0;
		if (local20 != null) {
			local10.method213(new Class3_Sub8(local20));
		}
		local10.method217();
		if (local10.anInt280 != -1) {
			local10.method211(method160(local10.anInt298), method160(local10.anInt280));
		}
		if (!Static69.aBoolean111 && local10.aBoolean14) {
			local10.aClass62_116 = Static29.aClass62_395;
			local10.aClass62Array4 = null;
			local10.aClass62Array3 = null;
			local10.anInt304 = 0;
		}
		Static54.aClass34_33.method765((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
	public static void method161() {
		while (true) {
			if (Static10.aClass3_Sub8_Sub1_5.method1820(Static63.anInt2386) >= 11) {
				@Pc(14) int local14 = Static10.aClass3_Sub8_Sub1_5.method1822(11);
				if (local14 != 2047) {
					if (Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local14] == null) {
						Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local14] = new Class3_Sub1_Sub3_Sub1_Sub1();
						if (Static75.aClass3_Sub8Array1[local14] != null) {
							Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local14].method756(Static75.aClass3_Sub8Array1[local14]);
						}
					}
					Static6.anIntArray21[Static91.anInt2431++] = local14;
					@Pc(53) Class3_Sub1_Sub3_Sub1_Sub1 local53 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local14];
					local53.anInt1875 = Static12.anInt451;
					local53.anInt1849 = Static20.anIntArray54[Static10.aClass3_Sub8_Sub1_5.method1822(3)];
					@Pc(69) int local69 = Static10.aClass3_Sub8_Sub1_5.method1822(5);
					@Pc(74) int local74 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
					@Pc(79) int local79 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
					if (local69 > 15) {
						local69 -= 32;
					}
					if (local79 == 1) {
						Static98.anIntArray283[Static90.anInt2427++] = local14;
					}
					@Pc(101) int local101 = Static10.aClass3_Sub8_Sub1_5.method1822(5);
					if (local101 > 15) {
						local101 -= 32;
					}
					local53.method1150(local69 + Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0] - -local101, local74 == 1);
					continue;
				}
			}
			Static10.aClass3_Sub8_Sub1_5.method1823();
			return;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!fe;B)Z")
	public static boolean method162(@OriginalArg(0) Class3_Sub1_Sub6 arg0) {
		if (arg0.anIntArray66 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray66.length; local17++) {
			@Pc(24) int local24 = Static99.method1654(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray67[local17];
			if (arg0.anIntArray66[local17] == 2) {
				if (local24 >= local29) {
					return false;
				}
			} else if (arg0.anIntArray66[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray66[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local24 != local29) {
				return false;
			}
		}
		return true;
	}
}

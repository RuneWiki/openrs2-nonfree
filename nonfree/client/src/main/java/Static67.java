import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "Lclient!ke;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!c;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "Lclient!ac;")
	public static Class3 aClass3_16;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Lclient!kc;")
	public static Class36 aClass36_825 = Static14.method2017("Fallen lassen");

	@OriginalMember(owner = "client!na", name = "e", descriptor = "Lclient!gd;")
	public static Class22 aClass22_25 = new Class22(50);

	@OriginalMember(owner = "client!na", name = "j", descriptor = "Lclient!kc;")
	public static Class36 aClass36_826 = Static14.method2017("(U3");

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Lclient!kc;")
	public static Class36 aClass36_827 = Static14.method2017("backleft1");

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method1160() {
		aClass3_16 = null;
		aClass27_1 = null;
		aClass22_25 = null;
		aClass11_1 = null;
		aClass36_826 = null;
		aClass36_825 = null;
		aClass36_827 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!wd;Lclient!kc;)I")
	public static int method1161(@OriginalArg(1) Class2_Sub12 arg0, @OriginalArg(2) Class36 arg1) {
		@Pc(11) int local11 = arg0.anInt1939;
		arg0.method1375(arg1.anInt1442);
		arg0.anInt1939 += Static79.aClass18_1.method490(0, arg1.aByteArray9, arg0.anInt1939, arg1.anInt1442, arg0.aByteArray20);
		return arg0.anInt1939 - local11;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public static void method1162() {
		Static74.anInt1988++;
		Static91.method1656(true);
		Static40.method1551(true);
		Static91.method1656(false);
		Static40.method1551(false);
		Static74.method1420();
		Static94.method1763();
		@Pc(35) int local35;
		@Pc(33) int local33;
		if (!Static88.aBoolean100) {
			local33 = Static14.anInt2903 + Static25.anInt633 & 0x7FF;
			local35 = Static100.anInt2618;
			if (Static13.anInt307 / 256 > local35) {
				local35 = Static13.anInt307 / 256;
			}
			if (Static99.aBooleanArray12[4] && Static68.anIntArray218[4] + 128 > local35) {
				local35 = Static68.anIntArray218[4] + 128;
			}
			Static11.method229(Static51.anInt2604, local33, local35, local35 * 3 + 600, Static96.anInt2561, Static56.method1044(Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149, Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204, Static92.anInt2412) - 50);
		}
		if (Static88.aBoolean100) {
			local35 = Static57.method1049();
		} else {
			local35 = Static80.method1491();
		}
		@Pc(97) int local97 = Static111.anInt2875;
		local33 = Static105.anInt2735;
		@Pc(101) int local101 = Static59.anInt1588;
		@Pc(103) int local103 = Static96.anInt2559;
		@Pc(105) int local105 = Static51.anInt2603;
		for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
			if (Static99.aBooleanArray12[local107]) {
				@Pc(149) int local149 = (int) ((double) -Static24.anIntArray43[local107] + Math.random() * (double) (Static24.anIntArray43[local107] * 2 + 1) + Math.sin((double) Static16.anIntArray26[local107] / 100.0D * (double) Static66.anIntArray215[local107]) * (double) Static68.anIntArray218[local107]);
				if (local107 == 3) {
					Static51.anInt2603 = local149 + Static51.anInt2603 & 0x7FF;
				}
				if (local107 == 1) {
					Static111.anInt2875 += local149;
				}
				if (local107 == 0) {
					Static105.anInt2735 += local149;
				}
				if (local107 == 4) {
					Static96.anInt2559 += local149;
					if (Static96.anInt2559 < 128) {
						Static96.anInt2559 = 128;
					}
					if (Static96.anInt2559 > 383) {
						Static96.anInt2559 = 383;
					}
				}
				if (local107 == 2) {
					Static59.anInt1588 += local149;
				}
			}
		}
		Static8.method181();
		Static30.anInt868 = Static64.anInt1640 - 4;
		Static30.anInt867 = Static115.anInt1789 - 4;
		Static30.anInt870 = 0;
		Static30.aBoolean46 = true;
		Static54.method1587();
		Static85.aClass61_1.method1707(Static105.anInt2735, Static111.anInt2875, Static59.anInt1588, Static96.anInt2559, Static51.anInt2603, local35);
		Static85.aClass61_1.method1727();
		Static103.method1908();
		Static50.method962();
		((Class62) Static87.anInterface3_1).method1817(Static100.anInt2609);
		Static22.method485();
		if (Static94.aBoolean110 && Static74.method1431() == 0) {
			Static94.aBoolean110 = false;
		}
		if (Static94.aBoolean110) {
			Static8.method181();
			Static54.method1587();
			Static89.method1643(false, null, Static14.aClass36_1421);
		}
		Static73.method1296();
		Static105.anInt2735 = local33;
		Static51.anInt2603 = local105;
		Static96.anInt2559 = local103;
		Static111.anInt2875 = local97;
		Static59.anInt1588 = local101;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!ed;)I")
	public static int method1163(@OriginalArg(1) Class2_Sub1_Sub6 arg0) {
		@Pc(23) Class2_Sub7 local23 = (Class2_Sub7) Static113.aClass31_8.method905(((long) arg0.anInt680 << 32) + ((long) arg0.anInt710));
		return local23 == null ? arg0.anInt659 : local23.anInt956;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I")
	public static int method1164(@OriginalArg(1) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}
}

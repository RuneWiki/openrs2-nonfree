import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!gd", name = "ab", descriptor = "Lclient!oa;")
	public static Class62 aClass62_3;

	@OriginalMember(owner = "client!gd", name = "Q", descriptor = "Lclient!ld;")
	public static Class47 aClass47_13 = new Class47(30);

	@OriginalMember(owner = "client!gd", name = "S", descriptor = "Lclient!dd;")
	private static Class13 aClass13_619 = Static161.method2971("OFF");

	@OriginalMember(owner = "client!gd", name = "U", descriptor = "Lclient!dd;")
	public static Class13 aClass13_620 = aClass13_619;

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
	public static int anInt1836 = 0;

	@OriginalMember(owner = "client!gd", name = "fb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_623 = Static161.method2971("FULL");

	@OriginalMember(owner = "client!gd", name = "cb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_621 = aClass13_623;

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "[Lclient!dd;")
	public static Class13[] aClass13Array15 = new Class13[500];

	@OriginalMember(owner = "client!gd", name = "eb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_622 = Static161.method2971("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!gd", name = "gb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_624 = aClass13_622;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	public static void method1368() {
		@Pc(5) Object local5 = Static85.anObject4;
		synchronized (Static85.anObject4) {
			if (Static62.anInt2604 == 0) {
				Static163.aClass16_5.method982(new Class67(), 5);
			}
			Static62.anInt2604 = 600;
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(III)V")
	public static void method1369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class1_Sub2_Sub18 local11 = Static26.method805(arg1);
		@Pc(14) int local14 = local11.anInt3782;
		@Pc(17) int local17 = local11.anInt3783;
		@Pc(20) int local20 = local11.anInt3781;
		@Pc(27) int local27 = Class1_Sub2_Sub2_Sub7.anIntArray388[local17 - local14];
		if (arg0 < 0 || local27 < arg0) {
			arg0 = 0;
		}
		local27 <<= local14;
		Static103.anIntArray266[local20] = local27 & arg0 << local14 | ~local27 & Static103.anIntArray266[local20];
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
	public static void method1370() {
		aClass62_3 = null;
		aClass13_624 = null;
		aClass13_621 = null;
		aClass47_13 = null;
		aClass13Array15 = null;
		aClass13_622 = null;
		aClass13_620 = null;
		aClass13_619 = null;
		aClass13_623 = null;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)Z")
	public static boolean method1371(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!kd;BI)V")
	public static void method1372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub2_Sub2_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (arg2 == Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1 || Static53.anInt1722 >= 400) {
			return;
		}
		@Pc(62) Class13 local62;
		if (arg2.anInt2624 == 0) {
			local62 = Static57.method1349(new Class13[] { arg2.aClass13_847, Static34.method957(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2615, arg2.anInt2615), Static178.aClass13_1383, Static20.aClass13_281, Static3.method75(arg2.anInt2615), Static30.aClass13_359 });
		} else {
			local62 = Static57.method1349(new Class13[] { arg2.aClass13_847, Static178.aClass13_1383, Static25.aClass13_304, Static3.method75(arg2.anInt2624), Static30.aClass13_359 });
		}
		@Pc(130) int local130;
		if (Static116.anInt3103 == 1) {
			Static12.method462(arg1, Static57.method1349(new Class13[] { Static141.aClass13_1202, Static120.aClass13_1052, local62 }), Static57.aClass13_608, (short) 34, arg3, (long) arg0);
		} else if (!Static118.aBoolean233) {
			for (local130 = 7; local130 >= 0; local130--) {
				if (Static21.aClass13Array4[local130] != null) {
					@Pc(144) short local144 = 0;
					if (Static21.aClass13Array4[local130].method894(Static112.aClass13_1017)) {
						if (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2615 < arg2.anInt2615) {
							local144 = 2000;
						}
						if (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2629 != 0 && arg2.anInt2629 != 0) {
							if (arg2.anInt2629 == Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2629) {
								local144 = 2000;
							} else {
								local144 = 0;
							}
						}
					} else if (Static77.aBooleanArray30[local130]) {
						local144 = 2000;
					}
					@Pc(198) short local198 = Static64.aShortArray19[local130];
					@Pc(203) short local203 = (short) (local198 + local144);
					Static12.method462(arg1, Static57.method1349(new Class13[] { Static103.aClass13_950, local62 }), Static21.aClass13Array4[local130], local203, arg3, (long) arg0);
				}
			}
		} else if ((Static111.anInt3019 & 0x8) == 8) {
			Static12.method462(arg1, Static57.method1349(new Class13[] { Static147.aClass13_1236, Static120.aClass13_1052, local62 }), Static113.aClass13_1022, (short) 23, arg3, (long) arg0);
		}
		for (local130 = 0; local130 < Static53.anInt1722; local130++) {
			if (Static147.aShortArray41[local130] == 4) {
				Static164.aClass13Array27[local130] = Static57.method1349(new Class13[] { Static103.aClass13_950, local62 });
				return;
			}
		}
	}
}

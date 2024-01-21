import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1848 = Static193.method3027("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1846 = aClass70_1848;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "[I")
	public static final int[] anIntArray327 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1847 = Static193.method3027("mapdots");

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Lclient!dh;")
	public static Class3_Sub3_Sub7 method2945() {
		if (Static41.aClass3_Sub3_Sub7_1 == null) {
			Static41.aClass3_Sub3_Sub7_1 = new Class3_Sub3_Sub7();
		}
		return Static41.aClass3_Sub3_Sub7_1;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!oc;Lclient!ke;Lclient!oc;Lclient!ke;B)Lclient!v;")
	public static Class3_Sub3_Sub2_Sub4_Sub1 method2946(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) Class52 arg3) {
		@Pc(13) int local13 = arg3.method1560(arg2);
		@Pc(19) int local19 = arg3.method1554(arg0, local13);
		return Static107.method2401(arg1, local13, arg3, local19);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V")
	public static void method2947(@OriginalArg(1) int arg0) {
		Static151.method2218();
		Static180.method2796();
		@Pc(14) int local14 = Static85.method1229(arg0).anInt769;
		if (local14 == 0) {
			return;
		}
		@Pc(24) int local24 = Static16.anIntArray27[arg0];
		if (local14 == 1) {
			Static205.anInt4177 = local24;
			if (Static205.anInt4177 == 1) {
				Static177.method2774(0.9F);
			}
			if (Static205.anInt4177 == 2) {
				Static177.method2774(0.8F);
			}
			if (Static205.anInt4177 == 3) {
				Static177.method2774(0.7F);
			}
			if (Static205.anInt4177 == 4) {
				Static177.method2774(0.6F);
			}
			Static90.method1300();
		}
		if (local14 == 3) {
			@Pc(62) short local62 = 0;
			if (local24 == 0) {
				local62 = 255;
			}
			if (local24 == 1) {
				local62 = 192;
			}
			if (local24 == 2) {
				local62 = 128;
			}
			if (local24 == 3) {
				local62 = 64;
			}
			if (local24 == 4) {
				local62 = 0;
			}
			if (Static8.anInt186 != local62) {
				if (Static8.anInt186 == 0 && Static141.anInt2849 != -1) {
					Static209.method3300(Static10.aClass52_Sub1_2, local62, Static141.anInt2849);
					Static80.aBoolean91 = false;
				} else if (local62 == 0) {
					Static111.method1606();
					Static80.aBoolean91 = false;
				} else {
					Static209.method3304(local62);
				}
				Static8.anInt186 = local62;
			}
		}
		if (local14 == 6) {
			Static37.anInt3225 = local24;
		}
		if (local14 == 5) {
			Static75.anInt1476 = local24;
		}
		if (local14 == 10) {
			if (local24 == 0) {
				Static42.anInt879 = 127;
			}
			if (local24 == 1) {
				Static42.anInt879 = 96;
			}
			if (local24 == 2) {
				Static42.anInt879 = 64;
			}
			if (local24 == 3) {
				Static42.anInt879 = 32;
			}
			if (local24 == 4) {
				Static42.anInt879 = 0;
			}
		}
		if (local14 == 9) {
			Static132.anInt2573 = local24;
		}
		if (local14 != 4) {
			return;
		}
		if (local24 == 0) {
			Static153.anInt3166 = 127;
		}
		if (local24 == 1) {
			Static153.anInt3166 = 96;
		}
		if (local24 == 2) {
			Static153.anInt3166 = 64;
		}
		if (local24 == 3) {
			Static153.anInt3166 = 32;
		}
		if (local24 == 4) {
			Static153.anInt3166 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ke;I)V")
	public static void method2948(@OriginalArg(0) Class52 arg0) {
		Static195.aClass52_38 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)I")
	public static int method2949(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static170.method829(arg0 - 1, arg1 + -1) + Static170.method829(arg0 - 1, arg1 + 1) + Static170.method829(arg0 + 1, arg1 - 1) + Static170.method829(arg0 - -1, arg1 + 1);
		@Pc(76) int local76 = Static170.method829(arg0, arg1 - 1) + Static170.method829(arg0, arg1 + 1) + Static170.method829(arg0 - 1, arg1) + Static170.method829(arg0 + 1, arg1);
		@Pc(81) int local81 = Static170.method829(arg0, arg1);
		return local76 / 8 + local42 / 16 + local81 / 4;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z[B)Lclient!v;")
	public static Class3_Sub3_Sub2_Sub4_Sub1 method2951(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) Class3_Sub3_Sub2_Sub4_Sub1 local18 = new Class3_Sub3_Sub2_Sub4_Sub1(arg0, Static176.anIntArray295, Static160.anIntArray245, Static163.anIntArray250, Static172.anIntArray284, Static63.anIntArray75, Static204.aByteArrayArray9);
			Static161.method2418();
			return local18;
		}
	}
}

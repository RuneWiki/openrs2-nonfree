import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "Lclient!ig;")
	public static Class39 aClass39_46;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1464 = Static49.method1293("<col=ff0000>");

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "[Lclient!rf;")
	public static Class70[] aClass70Array22 = new Class70[100];

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1465 = Static49.method1293("<col=ff9040>");

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	public static int anInt4358 = -1;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1466 = Static49.method1293("welle:");

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
	public static void method3344() {
		aClass39_46 = null;
		aClass70_1464 = null;
		aClass70_1465 = null;
		aClass70_1466 = null;
		aClass70Array22 = null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIILclient!nh;)V")
	public static void method3345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub13 arg3) {
		if (Static162.anInt4331 >= 400) {
			return;
		}
		if (arg3.anIntArray318 != null) {
			arg3 = arg3.method2427();
		}
		if (arg3 == null || !arg3.aBoolean128) {
			return;
		}
		@Pc(33) Class70 local33 = arg3.aClass70_1091;
		if (arg3.anInt3252 != 0) {
			local33 = Static160.method3210(new Class70[] { local33, Static172.method3412(arg3.anInt3252, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt1293), Static139.aClass70_1241, Static21.aClass70_207, Static34.method873(arg3.anInt3252), Static20.aClass70_191 });
		}
		if (Static58.anInt1876 == 1) {
			Static58.method1422((short) 20, (long) arg2, arg0, arg1, Static170.aClass70_1480, Static160.method3210(new Class70[] { Static111.aClass70_1012, Static127.aClass70_1147, local33 }));
		} else if (!Static167.aBoolean170) {
			@Pc(116) Class70[] local116 = arg3.aClass70Array17;
			if (Static18.aBoolean18) {
				local116 = Static174.method3425(local116);
			}
			@Pc(126) int local126;
			if (local116 != null) {
				for (local126 = 4; local126 >= 0; local126--) {
					if (local116[local126] != null && !local116[local126].method2905(Static104.aClass70_952)) {
						@Pc(145) byte local145 = 0;
						if (local126 == 0) {
							local145 = 50;
						}
						if (local126 == 1) {
							local145 = 9;
						}
						if (local126 == 2) {
							local145 = 15;
						}
						if (local126 == 3) {
							local145 = 46;
						}
						if (local126 == 4) {
							local145 = 17;
						}
						Static58.method1422(local145, (long) arg2, arg0, arg1, local116[local126], Static160.method3210(new Class70[] { Static74.aClass70_723, local33 }));
					}
				}
			}
			if (local116 != null) {
				for (local126 = 4; local126 >= 0; local126--) {
					if (local116[local126] != null && local116[local126].method2905(Static104.aClass70_952)) {
						@Pc(225) short local225 = 0;
						if (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt1293 < arg3.anInt3252) {
							local225 = 2000;
						}
						@Pc(238) short local238 = 0;
						if (local126 == 0) {
							local238 = 50;
						}
						if (local126 == 1) {
							local238 = 9;
						}
						if (local126 == 2) {
							local238 = 15;
						}
						if (local126 == 3) {
							local238 = 46;
						}
						if (local126 == 4) {
							local238 = 17;
						}
						if (local238 != 0) {
							local238 += local225;
						}
						Static58.method1422(local238, (long) arg2, arg0, arg1, local116[local126], Static160.method3210(new Class70[] { Static74.aClass70_723, local33 }));
					}
				}
			}
			Static58.method1422((short) 1006, (long) arg2, arg0, arg1, Static150.aClass70_1348, Static160.method3210(new Class70[] { Static74.aClass70_723, local33 }));
		} else if ((Static104.anInt2954 & 0x2) == 2) {
			Static58.method1422((short) 19, (long) arg2, arg0, arg1, Static161.aClass70_1436, Static160.method3210(new Class70[] { Static5.aClass70_59, Static127.aClass70_1147, local33 }));
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
	public static void method3346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static44.anInt1474; local7++) {
			if (Static19.anIntArray32[local7] + Static99.anIntArray437[local7] > arg0 && Static99.anIntArray437[local7] < arg0 + arg3 && Static146.anIntArray363[local7] + Static92.anIntArray254[local7] > arg1 && Static92.anIntArray254[local7] < arg1 + arg2) {
				Static161.aBooleanArray18[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ig;B)Z")
	public static boolean method3347(@OriginalArg(0) Class39 arg0) {
		if (Static125.aBoolean134) {
			if (Static20.method439(arg0) != 0) {
				return false;
			}
			if (arg0.anInt2342 == 0) {
				return false;
			}
		}
		return arg0.aBoolean83;
	}
}

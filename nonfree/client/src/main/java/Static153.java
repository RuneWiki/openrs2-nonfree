import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!td", name = "vb", descriptor = "I")
	public static int anInt3782;

	@OriginalMember(owner = "client!td", name = "Cb", descriptor = "Lclient!w;")
	public static Class2_Sub9_Sub4 aClass2_Sub9_Sub4_2;

	@OriginalMember(owner = "client!td", name = "bb", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1301 = Static146.method2172("<col=40ff00>");

	@OriginalMember(owner = "client!td", name = "Db", descriptor = "I")
	public static int anInt3788 = 0;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(ZI)Z")
	public static boolean method2608(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
	public static void method2610() {
		aClass2_Sub9_Sub4_2 = null;
		aClass77_1301 = null;
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V")
	public static void method2616() {
		Static74.aClass2_Sub18_Sub1_1.method2407();
		@Pc(11) int local11 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static74.aClass2_Sub18_Sub1_1.method2405(2);
		if (local19 == 0) {
			Static6.anIntArray25[Static174.anInt4449++] = 2047;
			return;
		}
		@Pc(41) int local41;
		@Pc(51) int local51;
		if (local19 == 1) {
			local41 = Static74.aClass2_Sub18_Sub1_1.method2405(3);
			Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.method2911(local41, false);
			local51 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
			if (local51 == 1) {
				Static6.anIntArray25[Static174.anInt4449++] = 2047;
			}
			return;
		}
		@Pc(93) int local93;
		if (local19 == 2) {
			local41 = Static74.aClass2_Sub18_Sub1_1.method2405(3);
			Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.method2911(local41, true);
			local51 = Static74.aClass2_Sub18_Sub1_1.method2405(3);
			Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.method2911(local51, true);
			local93 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
			if (local93 == 1) {
				Static6.anIntArray25[Static174.anInt4449++] = 2047;
			}
		} else if (local19 == 3) {
			local41 = Static74.aClass2_Sub18_Sub1_1.method2405(7);
			local51 = Static74.aClass2_Sub18_Sub1_1.method2405(7);
			Static54.anInt1472 = Static74.aClass2_Sub18_Sub1_1.method2405(2);
			local93 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
			if (local93 == 1) {
				Static6.anIntArray25[Static174.anInt4449++] = 2047;
			}
			@Pc(153) int local153 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
			Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.method2913(local41, local153 == 1, local51);
		}
	}
}

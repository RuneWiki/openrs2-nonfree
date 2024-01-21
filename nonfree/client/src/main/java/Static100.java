import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!dd;")
	public static Class15 aClass15_4;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "[I")
	public static int[] anIntArray315;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
	public static int anInt2518 = 2;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Lclient!id;")
	public static Class34 aClass34_1250 = Static9.method266("p11_full");

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!qd;")
	public static Class63 aClass63_19 = new Class63(64);

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!te;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Lclient!id;")
	public static Class34 aClass34_1251 = Static9.method266(":");

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "Lclient!id;")
	public static Class34 aClass34_1252 = Static9.method266("sl_back");

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Z")
	public static boolean aBoolean133 = false;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "[I")
	public static int[] anIntArray316 = new int[50];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)Lclient!b;")
	public static Class1_Sub1_Sub4 method1666(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub4 local12 = (Class1_Sub1_Sub4) Static43.aClass63_9.method1663((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static120.aClass35_31.method1573(16, arg0);
		local12 = new Class1_Sub1_Sub4();
		if (local22 != null) {
			local12.method232(new Class1_Sub19(local22));
		}
		Static43.aClass63_9.method1659(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method1667() {
		aClass34_1250 = null;
		aClass63_19 = null;
		aClass15_4 = null;
		anIntArray316 = null;
		aClass34_1251 = null;
		aClass34_1252 = null;
		anIntArray315 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method1668() {
		@Pc(10) int local10 = Static51.aClass1_Sub19_Sub1_4.method2096(8);
		@Pc(19) int local19;
		if (Static40.anInt1154 > local10) {
			for (local19 = local10; local19 < Static40.anInt1154; local19++) {
				Static120.anIntArray354[Static92.anInt2405++] = Static102.anIntArray321[local19];
			}
		}
		if (Static40.anInt1154 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static40.anInt1154 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(66) int local66 = Static102.anIntArray321[local19];
			@Pc(70) Class1_Sub1_Sub1_Sub1_Sub1 local70 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local66];
			@Pc(75) int local75 = Static51.aClass1_Sub19_Sub1_4.method2096(1);
			if (local75 == 0) {
				Static102.anIntArray321[Static40.anInt1154++] = local66;
				local70.anInt1435 = Static73.anInt1947;
			} else {
				@Pc(98) int local98 = Static51.aClass1_Sub19_Sub1_4.method2096(2);
				if (local98 == 0) {
					Static102.anIntArray321[Static40.anInt1154++] = local66;
					local70.anInt1435 = Static73.anInt1947;
					Static17.anIntArray65[Static32.anInt1453++] = local66;
				} else {
					@Pc(145) int local145;
					@Pc(155) int local155;
					if (local98 == 1) {
						Static102.anIntArray321[Static40.anInt1154++] = local66;
						local70.anInt1435 = Static73.anInt1947;
						local145 = Static51.aClass1_Sub19_Sub1_4.method2096(3);
						local70.method895(local145, false);
						local155 = Static51.aClass1_Sub19_Sub1_4.method2096(1);
						if (local155 == 1) {
							Static17.anIntArray65[Static32.anInt1453++] = local66;
						}
					} else if (local98 == 2) {
						Static102.anIntArray321[Static40.anInt1154++] = local66;
						local70.anInt1435 = Static73.anInt1947;
						local145 = Static51.aClass1_Sub19_Sub1_4.method2096(3);
						local70.method895(local145, true);
						local155 = Static51.aClass1_Sub19_Sub1_4.method2096(3);
						local70.method895(local155, true);
						@Pc(207) int local207 = Static51.aClass1_Sub19_Sub1_4.method2096(1);
						if (local207 == 1) {
							Static17.anIntArray65[Static32.anInt1453++] = local66;
						}
					} else if (local98 == 3) {
						Static120.anIntArray354[Static92.anInt2405++] = local66;
					}
				}
			}
		}
	}
}

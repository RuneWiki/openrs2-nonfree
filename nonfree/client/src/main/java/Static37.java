import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!hd", name = "D", descriptor = "Lclient!cc;")
	public static Class11_Sub1 aClass11_Sub1_10;

	@OriginalMember(owner = "client!hd", name = "E", descriptor = "[I")
	public static int[] anIntArray223;

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "[I")
	public static int[] anIntArray224;

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_4;

	@OriginalMember(owner = "client!hd", name = "R", descriptor = "[Lclient!jc;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!hd", name = "T", descriptor = "Lclient!k;")
	public static Class2_Sub1_Sub4_Sub6_Sub1 aClass2_Sub1_Sub4_Sub6_Sub1_1;

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "Lclient!lc;")
	public static Class31 aClass31_504 = Static56.method1206("yellow:");

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
	public static int anInt1409 = -1;

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "[I")
	public static int[] anIntArray226 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "Lclient!lc;")
	public static Class31 aClass31_505 = Static56.method1206("Off");

	@OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
	public static int anInt1412 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[Lclient!lc;)Lclient!lc;")
	public static Class31 method974(@OriginalArg(1) Class31[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static13.method381(arg0, arg0.length);
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
	public static void method975() {
		Static96.aClass17_92.method782();
		Static55.aClass17_70.method782();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!cc;I)V")
	public static void method976(@OriginalArg(0) Class11_Sub1 arg0) {
		@Pc(11) Class2_Sub5 local11 = new Class2_Sub5();
		local11.anInt797 = 2;
		local11.aClass11_Sub1_4 = arg0;
		@Pc(19) Class36 local19 = Static77.aClass36_7;
		synchronized (Static77.aClass36_7) {
			Static77.aClass36_7.method1362(local11);
		}
		Static50.method349();
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
	public static void method977() {
		for (@Pc(13) Class2_Sub3 local13 = (Class2_Sub3) Static62.aClass36_5.method1365(); local13 != null; local13 = (Class2_Sub3) Static62.aClass36_5.method1361()) {
			if (local13.anInt360 == -1) {
				local13.anInt371 = 0;
				Static64.method415(local13);
			} else {
				local13.method1695();
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	public static void method978() {
		Static75.aBoolean117 = true;
		Static95.method1603();
		@Pc(36) boolean local36;
		if (Static54.anInt1802 != -1) {
			local36 = Static4.method91(1, 0, -1, 190, 0, Static54.anInt1802, 261, 0);
			if (!local36) {
				Static92.aBoolean81 = true;
			}
		} else if (Static41.anIntArray245[Static31.anInt1279] != -1) {
			local36 = Static4.method91(1, 0, -1, 190, 0, Static41.anIntArray245[Static31.anInt1279], 261, 0);
			if (!local36) {
				Static92.aBoolean81 = true;
			}
		}
		if (Static105.aBoolean154 && Static64.anInt601 == 1) {
			Static17.method530();
		}
		Static3.method88(Static18.aGraphics1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method979() {
		aClass2_Sub1_Sub4_Sub6_Sub1_1 = null;
		anIntArray224 = null;
		aClass25Array1 = null;
		aClass2_Sub1_Sub3_Sub2_4 = null;
		anIntArray223 = null;
		anIntArray226 = null;
		aClass31_505 = null;
		aClass31_504 = null;
		aClass11_Sub1_10 = null;
	}
}

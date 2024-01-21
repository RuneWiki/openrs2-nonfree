import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	public static int anInt1471;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!mf;")
	public static Class56_Sub1 aClass56_Sub1_11;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_8;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!fc;")
	private static Class25 aClass25_680 = Static78.method1313("This computers address has been blocked");

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "[Lclient!fc;")
	public static Class25[] aClass25Array7 = new Class25[1000];

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Lclient!qc;")
	public static Class66 aClass66_10 = new Class66(32);

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
	public static int anInt1469 = 0;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!fc;")
	public static Class25 aClass25_681 = aClass25_680;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Lclient!fc;")
	private static Class25 aClass25_685 = Static78.method1313("red:");

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "Lclient!fc;")
	public static Class25 aClass25_682 = aClass25_685;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	public static int anInt1470 = -1;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!fc;")
	public static Class25 aClass25_683 = aClass25_685;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!fc;")
	public static Class25 aClass25_684 = Static78.method1313("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)I")
	public static int method1136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class1_Sub1 local10 = (Class1_Sub1) aClass66_10.method1650((long) arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray9.length) {
			return local10.anIntArray9[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public static void method1137(@OriginalArg(1) int arg0) {
		Static33.method740();
		@Pc(12) int local12 = Static77.method1289(arg0).anInt938;
		if (local12 == 0) {
			return;
		}
		@Pc(24) int local24 = Static95.anIntArray385[arg0];
		if (local12 == 1) {
			if (local24 == 1) {
				Static36.method836(0.9D);
				((Class54) Static36.anInterface3_1).method1226(0.9D);
			}
			if (local24 == 2) {
				Static36.method836(0.8D);
				((Class54) Static36.anInterface3_1).method1226(0.8D);
			}
			if (local24 == 3) {
				Static36.method836(0.7D);
				((Class54) Static36.anInterface3_1).method1226(0.7D);
			}
			if (local24 == 4) {
				Static36.method836(0.6D);
				((Class54) Static36.anInterface3_1).method1226(0.6D);
			}
			Static109.method1748();
			Static60.aBoolean54 = true;
		}
		if (local12 == 3) {
			@Pc(82) short local82 = 0;
			if (local24 == 0) {
				local82 = 255;
			}
			if (local24 == 1) {
				local82 = 192;
			}
			if (local24 == 2) {
				local82 = 128;
			}
			if (local24 == 3) {
				local82 = 64;
			}
			if (local24 == 4) {
				local82 = 0;
			}
			if (local82 != Static33.anInt909) {
				if (Static33.anInt909 == 0 && Static47.anInt1203 != -1) {
					Static64.method1129(Static47.anInt1203, 0, Static49.aClass56_Sub1_10, local82);
					Static8.aBoolean5 = false;
				} else if (local82 == 0) {
					Static76.method1237();
					Static8.aBoolean5 = false;
				} else {
					Static6.method100(local82);
				}
				Static33.anInt909 = local82;
			}
		}
		if (local12 == 4) {
			if (local24 == 0) {
				Static39.anInt1104 = 127;
			}
			if (local24 == 1) {
				Static39.anInt1104 = 96;
			}
			if (local24 == 2) {
				Static39.anInt1104 = 64;
			}
			if (local24 == 3) {
				Static39.anInt1104 = 32;
			}
			if (local24 == 4) {
				Static39.anInt1104 = 0;
			}
		}
		if (local12 == 10) {
			if (local24 == 0) {
				Static21.anInt601 = 127;
			}
			if (local24 == 1) {
				Static21.anInt601 = 96;
			}
			if (local24 == 2) {
				Static21.anInt601 = 64;
			}
			if (local24 == 3) {
				Static21.anInt601 = 32;
			}
			if (local24 == 4) {
				Static21.anInt601 = 0;
			}
		}
		if (local12 == 9) {
			Static71.anInt1492 = local24;
		}
		if (local12 == 5) {
			Static78.anInt1705 = local24;
		}
		if (local12 == 8) {
			Static65.anInt1449 = local24;
			Static110.aBoolean113 = true;
		}
		if (local12 == 6) {
			Static27.anInt744 = local24;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public static void method1138() {
		aClass25Array7 = null;
		aClass25_685 = null;
		aClass56_Sub1_11 = null;
		aClass25_684 = null;
		aClass25_682 = null;
		aClass25_681 = null;
		aClass25_683 = null;
		aClass66_10 = null;
		aClass25_680 = null;
		aClass1_Sub2_Sub2_Sub4_8 = null;
	}
}

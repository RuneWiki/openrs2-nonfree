import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "Lclient!pa;")
	public static Class47 aClass47_32;

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
	public static int anInt2711;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "[Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array45;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "Lclient!o;")
	public static Class46 aClass46_29 = new Class46();

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
	public static int anInt2709 = 0;

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1426 = Static23.method501("Hidden");

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1423 = aClass42_1426;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1424 = Static23.method501("(U5");

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
	public static int anInt2710 = 0;

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1425 = Static23.method501("Your account has been disabled)3");

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1427 = aClass42_1425;

	@OriginalMember(owner = "client!wb", name = "O", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1428 = Static23.method501("scrollen:");

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1429 = Static23.method501("Verbindung mit Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	public static void method1829(@OriginalArg(0) int arg0) {
		Static82.method1507();
		@Pc(16) int local16 = Static57.method1824(arg0).anInt2514;
		if (local16 == 0) {
			return;
		}
		@Pc(26) int local26 = Static51.anIntArray200[arg0];
		if (local16 == 1) {
			if (local26 == 1) {
				Static41.method685(0.9D);
				((Class11) Static41.anInterface4_1).method270(0.9D);
			}
			if (local26 == 2) {
				Static41.method685(0.8D);
				((Class11) Static41.anInterface4_1).method270(0.8D);
			}
			if (local26 == 3) {
				Static41.method685(0.7D);
				((Class11) Static41.anInterface4_1).method270(0.7D);
			}
			if (local26 == 4) {
				Static41.method685(0.6D);
				((Class11) Static41.anInterface4_1).method270(0.6D);
			}
			Static50.method1215();
			Static91.aBoolean134 = true;
		}
		if (local16 == 3) {
			@Pc(86) short local86 = 0;
			if (local26 == 0) {
				local86 = 255;
			}
			if (local26 == 1) {
				local86 = 192;
			}
			if (local26 == 2) {
				local86 = 128;
			}
			if (local26 == 3) {
				local86 = 64;
			}
			if (local26 == 4) {
				local86 = 0;
			}
			if (local86 != Static20.anInt655) {
				if (Static20.anInt655 == 0 && Static108.anInt2750 != -1) {
					Static97.method1706(Static108.anInt2750, 0, Static7.aClass33_Sub1_2, local86);
					Static58.anInt1434 = 0;
				} else if (local86 == 0) {
					Static97.method1703();
					Static58.anInt1434 = 0;
				} else {
					Static68.method1172(local86);
				}
				Static20.anInt655 = local86;
			}
		}
		if (local16 == 8) {
			Static28.aBoolean41 = true;
			Static21.anInt665 = local26;
		}
		if (local16 == 9) {
			Static17.anInt587 = local26;
		}
		if (local16 == 4) {
			if (local26 == 0) {
				Static62.anInt1488 = 127;
			}
			if (local26 == 1) {
				Static62.anInt1488 = 96;
			}
			if (local26 == 2) {
				Static62.anInt1488 = 64;
			}
			if (local26 == 3) {
				Static62.anInt1488 = 32;
			}
			if (local26 == 4) {
				Static62.anInt1488 = 0;
			}
		}
		if (local16 == 5) {
			Static64.anInt1564 = local26;
		}
		if (local16 == 6) {
			Static24.anInt720 = local26;
		}
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public static void method1830() {
		if (Static73.aClass62_1 != null) {
			@Pc(12) Class62 local12 = Static73.aClass62_1;
			synchronized (Static73.aClass62_1) {
				Static73.aClass62_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)Z")
	public static boolean method1831(@OriginalArg(0) int arg0) {
		if (Static87.aBooleanArray16[arg0]) {
			return true;
		} else if (Static101.aClass33_30.method1315(arg0)) {
			@Pc(25) int local25 = Static101.aClass33_30.method1299(arg0);
			if (local25 == 0) {
				Static87.aBooleanArray16[arg0] = true;
				return true;
			}
			if (Static61.aClass1_Sub1_Sub12ArrayArray1[arg0] == null) {
				Static61.aClass1_Sub1_Sub12ArrayArray1[arg0] = new Class1_Sub1_Sub12[local25];
			}
			for (@Pc(47) int local47 = 0; local47 < local25; local47++) {
				if (Static61.aClass1_Sub1_Sub12ArrayArray1[arg0][local47] == null) {
					@Pc(63) byte[] local63 = Static101.aClass33_30.method1305(local47, arg0);
					if (local63 != null) {
						Static61.aClass1_Sub1_Sub12ArrayArray1[arg0][local47] = new Class1_Sub1_Sub12();
						Static61.aClass1_Sub1_Sub12ArrayArray1[arg0][local47].method1504(new Class1_Sub8(local63));
					}
				}
			}
			Static87.aBooleanArray16[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
	public static void method1832() {
		aClass42_1426 = null;
		aClass42_1427 = null;
		aClass46_29 = null;
		aClass42_1424 = null;
		aClass42_1423 = null;
		aClass42_1429 = null;
		aClass42_1425 = null;
		aClass42_1428 = null;
		aClass1_Sub1_Sub1_Sub1Array45 = null;
		aClass47_32 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[Lclient!mc;Z)Lclient!mc;")
	public static Class42 method1833(@OriginalArg(0) int arg0, @OriginalArg(2) Class42[] arg1) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			if (arg1[local7] == null) {
				arg1[local7] = Static12.aClass42_216;
			}
			local5 += arg1[local7].anInt1468;
		}
		@Pc(37) byte[] local37 = new byte[local5];
		@Pc(39) int local39 = 0;
		@Pc(48) Class42 local48;
		for (@Pc(41) int local41 = 0; local41 < arg0; local41++) {
			local48 = arg1[local41];
			Static114.method777(local48.aByteArray17, 0, local37, local39, local48.anInt1468);
			local39 += local48.anInt1468;
		}
		local48 = new Class42();
		local48.aByteArray17 = local37;
		local48.anInt1468 = local5;
		return local48;
	}
}

import java.awt.Font;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!k", name = "bb", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!k", name = "F", descriptor = "[I")
	public static int[] anIntArray199 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!k", name = "G", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!k", name = "M", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!k", name = "R", descriptor = "Lclient!qf;")
	private static Class60 aClass60_788 = Static59.method1195("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!k", name = "cb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_791 = Static59.method1195("From");

	@OriginalMember(owner = "client!k", name = "T", descriptor = "Lclient!qf;")
	public static Class60 aClass60_789 = aClass60_791;

	@OriginalMember(owner = "client!k", name = "Z", descriptor = "Lclient!qf;")
	public static Class60 aClass60_790 = aClass60_788;

	@OriginalMember(owner = "client!k", name = "eb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_792 = Static59.method1195("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!k", name = "gb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_794 = Static59.method1195("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!k", name = "fb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_793 = aClass60_794;

	@OriginalMember(owner = "client!k", name = "jb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_797 = Static59.method1195("button near the top of that page)3");

	@OriginalMember(owner = "client!k", name = "hb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_795 = aClass60_797;

	@OriginalMember(owner = "client!k", name = "ib", descriptor = "Lclient!qf;")
	public static Class60 aClass60_796 = Static59.method1195("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)V")
	public static void method1155(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub15 local8 = Static68.method1390(arg2, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray14 != null) {
			Static12.method335(local8.anObjectArray14, local8, 0, 0, null, arg0);
		}
		@Pc(25) boolean local25 = true;
		if (local8.anInt2293 > 0) {
			local25 = Static22.method570(local8);
		}
		if (!local25 || !Static77.method1569(arg0 - 1, Static33.method751(local8))) {
			return;
		}
		if (arg0 == 1) {
			Static81.aClass3_Sub12_Sub1_2.method1980(225);
			Static81.aClass3_Sub12_Sub1_2.method1966(arg2);
			Static81.aClass3_Sub12_Sub1_2.method1922(arg1);
		}
		if (arg0 == 2) {
			Static81.aClass3_Sub12_Sub1_2.method1980(163);
			Static81.aClass3_Sub12_Sub1_2.method1966(arg2);
			Static81.aClass3_Sub12_Sub1_2.method1922(arg1);
		}
		if (arg0 == 3) {
			Static81.aClass3_Sub12_Sub1_2.method1980(79);
			Static81.aClass3_Sub12_Sub1_2.method1966(arg2);
			Static81.aClass3_Sub12_Sub1_2.method1922(arg1);
		}
		if (arg0 == 4) {
			Static81.aClass3_Sub12_Sub1_2.method1980(147);
			Static81.aClass3_Sub12_Sub1_2.method1966(arg2);
			Static81.aClass3_Sub12_Sub1_2.method1922(arg1);
		}
		if (arg0 == 5) {
			Static81.aClass3_Sub12_Sub1_2.method1980(74);
			Static81.aClass3_Sub12_Sub1_2.method1966(arg2);
			Static81.aClass3_Sub12_Sub1_2.method1922(arg1);
		}
		if (arg0 == 6) {
			Static81.aClass3_Sub12_Sub1_2.method1980(122);
			Static81.aClass3_Sub12_Sub1_2.method1966(arg2);
			Static81.aClass3_Sub12_Sub1_2.method1922(arg1);
		}
		if (arg0 == 7) {
			Static81.aClass3_Sub12_Sub1_2.method1980(42);
			Static81.aClass3_Sub12_Sub1_2.method1966(arg2);
			Static81.aClass3_Sub12_Sub1_2.method1922(arg1);
		}
		if (arg0 == 8) {
			Static81.aClass3_Sub12_Sub1_2.method1980(255);
			Static81.aClass3_Sub12_Sub1_2.method1966(arg2);
			Static81.aClass3_Sub12_Sub1_2.method1922(arg1);
		}
		if (arg0 == 9) {
			Static81.aClass3_Sub12_Sub1_2.method1980(159);
			Static81.aClass3_Sub12_Sub1_2.method1966(arg2);
			Static81.aClass3_Sub12_Sub1_2.method1922(arg1);
		}
		if (arg0 == 10) {
			Static81.aClass3_Sub12_Sub1_2.method1980(121);
			Static81.aClass3_Sub12_Sub1_2.method1966(arg2);
			Static81.aClass3_Sub12_Sub1_2.method1922(arg1);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZI)I")
	public static int method1156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V")
	public static void method1157() {
		if (!Static72.aBoolean85) {
			return;
		}
		@Pc(11) Class3_Sub15 local11 = Static68.method1390(Static45.anInt1433, Static103.anInt2999);
		if (local11 != null && local11.anObjectArray4 != null) {
			Static12.method335(local11.anObjectArray4, local11, 0, 0, null, 0);
		}
		Static72.aBoolean85 = false;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(B)V")
	public static void method1159() {
		if (Static22.anInt872 < 2 && Static73.anInt2349 == 0 && !Static72.aBoolean85) {
			return;
		}
		@Pc(42) Class60 local42;
		if (Static73.anInt2349 == 1 && Static22.anInt872 < 2) {
			local42 = Static60.method1211(new Class60[] { Static8.aClass60_131, Static84.aClass60_1113, Static124.aClass60_1361, Static85.aClass60_1134 });
		} else if (Static72.aBoolean85 && Static22.anInt872 < 2) {
			local42 = Static60.method1211(new Class60[] { Static73.aClass60_998, Static84.aClass60_1113, Static96.aClass60_1181, Static85.aClass60_1134 });
		} else {
			local42 = Static68.aClass60Array12[Static22.anInt872 - 1];
		}
		if (Static22.anInt872 > 2) {
			local42 = Static60.method1211(new Class60[] { local42, Static45.aClass60_631, Static65.method1341(Static22.anInt872 - 2), Static39.aClass60_563 });
		}
		Static123.aClass3_Sub1_Sub2_Sub2_4.method838(local42, Static34.anInt1183 / 1000);
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V")
	public static void method1160() {
		anIntArray199 = null;
		aClass60_796 = null;
		aClass60_789 = null;
		aClass60_791 = null;
		aFont1 = null;
		aClass60_788 = null;
		aClass60_793 = null;
		aClass60_795 = null;
		aClass60_790 = null;
		aCRC32_2 = null;
		aClass60_792 = null;
		aClass60_797 = null;
		aClass60_794 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BII)Lclient!qf;")
	public static Class60 method1162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg0 - arg1;
		if (local3 < -9) {
			return Static66.aClass60_896;
		} else if (local3 < -6) {
			return Static81.aClass60_1079;
		} else if (local3 < -3) {
			return Static41.aClass60_600;
		} else if (local3 < 0) {
			return Static38.aClass60_517;
		} else if (local3 > 9) {
			return Static96.aClass60_1184;
		} else if (local3 > 6) {
			return Static39.aClass60_548;
		} else if (local3 > 3) {
			return Static31.aClass60_425;
		} else if (local3 > 0) {
			return Static55.aClass60_782;
		} else {
			return Static72.aClass60_976;
		}
	}
}

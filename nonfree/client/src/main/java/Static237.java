import java.awt.Rectangle;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!om", name = "K", descriptor = "I")
	public static int anInt5067;

	@OriginalMember(owner = "client!om", name = "Y", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_120 = new Class140("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!om", name = "ab", descriptor = "Lclient!lh;")
	public static final Class2_Sub24 aClass2_Sub24_1 = new Class2_Sub24(0, 0);

	@OriginalMember(owner = "client!om", name = "bb", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_168 = new Class221(56, 2);

	@OriginalMember(owner = "client!om", name = "cb", descriptor = "I")
	public static int anInt5080 = 0;

	@OriginalMember(owner = "client!om", name = "db", descriptor = "Z")
	public static boolean aBoolean443 = false;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Z")
	public static boolean method4310(@OriginalArg(0) int arg0) {
		if (arg0 == 45 || arg0 == 48 || arg0 == 4 || arg0 == 3 || arg0 == 1010) {
			return true;
		} else {
			return arg0 == 2 || arg0 == 1002;
		}
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V")
	public static void method4311() {
		Static225.anInt4918 = 0;
		Static103.aClass180_24.method4917();
		Static258.aBoolean470 = false;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(III)V")
	public static void method4313(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static41.aClass107_41 = new Class107(arg1);
		Static84.aClass107_9 = new Class107(arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZIII)I")
	public static int method4314(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class2_Sub21 local10 = Static238.method4329(arg0, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray247.length; local23++) {
				if (local10.anIntArray245[local23] == arg2) {
					local21 += local10.anIntArray247[local23];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(II)Z")
	public static boolean method4315(@OriginalArg(0) int arg0) {
		@Pc(12) Class120_Sub1 local12 = Static190.method5232(arg0);
		if (local12 == null) {
			return false;
		} else if (Static293.anInt5826 == 3) {
			@Pc(43) String local43 = "";
			if (Static260.anInt5453 != 0) {
				local43 = ":" + (local12.anInt5093 + 7000);
			}
			@Pc(58) String local58 = "";
			if (Static71.aString12 != null) {
				local58 = "/p=" + Static71.aString12;
			}
			@Pc(107) String local107 = "http://" + local12.aString47 + local43 + "/l=" + Static239.anInt2803 + "/a=" + Static206.anInt4520 + local58 + "/j" + (Static334.aBoolean580 ? "1" : "0") + ",o" + (Static327.aBoolean566 ? "1" : "0") + ",a2";
			try {
				Static2.aClient1.getAppletContext().showDocument(new URL(local107), "_self");
				return true;
			} catch (@Pc(117) Exception local117) {
				return false;
			}
		} else {
			Static90.aString19 = local12.aString47;
			Static122.anInt2591 = local12.anInt5093;
			if (Static260.anInt5453 != 0) {
				Static248.anInt5205 = Static122.anInt2591 + 50000;
				Static238.anInt5092 = Static122.anInt2591 + 40000;
				Static295.anInt5861 = Static238.anInt5092;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V")
	public static void method4317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static236.anInt928; local7++) {
			@Pc(20) Rectangle local20 = Class58.aRectangleArray2[local7];
			if (local20.x + local20.width > arg0 && arg0 + arg2 > local20.x && arg3 < local20.height + local20.y && local20.y < arg1 + arg3) {
				Static269.aBooleanArray29[local7] = true;
			}
		}
	}
}

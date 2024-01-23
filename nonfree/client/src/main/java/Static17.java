import java.awt.Frame;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
	public static int anInt328;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
	public static int anInt332;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
	public static int anInt336;

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
	public static int anInt338;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "Z")
	public static boolean aBoolean31 = false;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
	public static int anInt330 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method291(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (!arg1) {
			try {
				Static325.method4166(Static274.aClass176_4.anApplet1, "loggedout");
			} catch (@Pc(16) Throwable local16) {
			}
			try {
				Static153.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static153.anApplet_Sub1_1.getCodeBase(), arg0), "_top");
			} catch (@Pc(28) Exception local28) {
			}
			return;
		}
		if (Static283.aBoolean393 && Static208.aBoolean292) {
			try {
				Static325.method4167(new Object[] { (new URL(Static153.anApplet_Sub1_1.getCodeBase(), arg0)).toString() }, Static274.aClass176_4.anApplet1, "openjs");
				return;
			} catch (@Pc(57) Throwable local57) {
			}
		}
		try {
			Static153.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static153.anApplet_Sub1_1.getCodeBase(), arg0), "_blank");
		} catch (@Pc(69) Exception local69) {
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lclient!vo;")
	public static Class3_Sub4_Sub23 method292() {
		if (Static228.aClass115_4 == null) {
			return null;
		}
		for (@Pc(18) Class3_Sub4_Sub23 local18 = (Class3_Sub4_Sub23) Static37.aClass17_1.method413(); local18 != null; local18 = (Class3_Sub4_Sub23) Static37.aClass17_1.method413()) {
			@Pc(25) Class40 local25 = Static96.method1438(local18.anInt5971);
			if (local25 != null && local25.aBoolean86 && local25.method978()) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!rg;III)V")
	public static void method294(@OriginalArg(0) Class151 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static191.aClass151_10 != null || Static118.aBoolean169 || (arg0 == null || Static40.method4959(arg0) == null)) {
			return;
		}
		Static191.aClass151_10 = arg0;
		Static168.aClass151_6 = Static40.method4959(arg0);
		Static152.anInt2868 = arg2;
		Static39.anInt682 = arg1;
		Static248.anInt4999 = 0;
		Static255.aBoolean363 = false;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!rn;)V")
	public static void method297(@OriginalArg(1) Class155 arg0) {
		Static67.aClass155_33 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ua;IIIII)Ljava/awt/Frame;")
	public static Frame method298(@OriginalArg(0) Class176 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0.method4504()) {
			return null;
		}
		@Pc(23) Class165[] local23 = Static3.method47(arg0);
		if (local23 == null) {
			return null;
		}
		@Pc(30) boolean local30 = false;
		for (@Pc(32) int local32 = 0; local32 < local23.length; local32++) {
			if (arg3 == local23[local32].anInt5349 && arg1 == local23[local32].anInt5350 && (!local30 || arg2 < local23[local32].anInt5352)) {
				arg2 = local23[local32].anInt5352;
				local30 = true;
			}
		}
		if (!local30) {
			return null;
		}
		@Pc(104) Class178 local104 = arg0.method4518(arg1, arg3, arg2);
		while (local104.anInt5649 == 0) {
			Static150.method2552(10L);
		}
		@Pc(127) Frame local127 = (Frame) local104.anObject6;
		if (local127 == null) {
			return null;
		} else if (local104.anInt5649 == 2) {
			Static252.method4275(local127, arg0);
			return null;
		} else {
			return local127;
		}
	}
}

import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!tp", name = "M", descriptor = "I")
	public static int anInt6245;

	@OriginalMember(owner = "client!tp", name = "N", descriptor = "[S")
	public static short[] aShortArray112;

	@OriginalMember(owner = "client!tp", name = "Q", descriptor = "I")
	public static int anInt6247;

	@OriginalMember(owner = "client!tp", name = "L", descriptor = "I")
	public static int anInt6244 = 0;

	@OriginalMember(owner = "client!tp", name = "O", descriptor = "S")
	public static short aShort80 = 32767;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!tq;I)V")
	public static void method5226(@OriginalArg(1) Class4_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (Static153.aClass149_3 == null) {
			return;
		}
		try {
			Static153.aClass149_3.method3960(0L);
			Static153.aClass149_3.method3956(24, arg0.aByteArray42, arg1);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(ZI)Z")
	public static boolean method5227(@OriginalArg(0) boolean arg0) {
		@Pc(13) boolean local13 = Static164.aClass92_7.method4461();
		if (arg0 == local13) {
			return true;
		}
		if (!arg0) {
			Static164.aClass92_7.method4454();
		} else if (!Static164.aClass92_7.method4469()) {
			arg0 = false;
		}
		if (arg0 == local13) {
			return false;
		} else {
			Static64.aBoolean107 = arg0;
			Static290.method4960(Static212.aClass120_3);
			return true;
		}
	}

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "(I)V")
	public static void method5229() {
		Static189.aClass154_65.method4219();
	}

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "(II)Z")
	public static boolean method5230(@OriginalArg(1) int arg0) {
		@Pc(7) Class83_Sub1 local7 = Static108.method2007(arg0);
		if (local7 == null) {
			return false;
		} else if (Static172.anInt3803 == 3) {
			@Pc(36) String local36 = "";
			if (Static306.anInt6192 != 0) {
				local36 = ":" + (local7.anInt3250 + 7000);
			}
			@Pc(51) String local51 = "";
			if (Static153.aString115 != null) {
				local51 = "/p=" + Static153.aString115;
			}
			@Pc(105) String local105 = "http://" + local7.aString112 + local36 + "/l=" + Static253.anInt5246 + "/a=" + Static145.anInt3255 + local51 + "/j" + (Static27.aBoolean27 ? "1" : "0") + ",o" + (Static304.aBoolean538 ? "1" : "0") + ",a2";
			try {
				Static78.aClient1.getAppletContext().showDocument(new URL(local105), "_self");
				return true;
			} catch (@Pc(115) Exception local115) {
				return false;
			}
		} else {
			Static124.aString117 = local7.aString112;
			Static320.anInt6328 = local7.anInt3250;
			if (Static306.anInt6192 != 0) {
				Static73.anInt1645 = Static320.anInt6328 + 50000;
				Static120.anInt2720 = Static320.anInt6328 + 40000;
				Static47.anInt1066 = Static120.anInt2720;
			}
			return true;
		}
	}
}

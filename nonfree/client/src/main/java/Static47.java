import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!ls;")
	public static Class6_Sub5_Sub3 aClass6_Sub5_Sub3_7;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIZ)V")
	public static void method5147(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) Class6_Sub17 local12 = Static85.method1523(arg0, arg1);
		if (local12 != null) {
			local12.method5977();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)Z")
	public static boolean method5150(@OriginalArg(1) int arg0) {
		@Pc(7) Class184_Sub1 local7 = Static243.method3753(arg0);
		if (local7 == null) {
			return false;
		} else if (Static143.anInt2575 == 3) {
			@Pc(40) String local40 = "";
			if (Static194.aClass207_8 != Static449.aClass207_11) {
				local40 = ":" + (local7.anInt4776 + 7000);
			}
			@Pc(56) String local56 = "";
			if (Static300.aString70 != null) {
				local56 = "/p=" + Static300.aString70;
			}
			@Pc(105) String local105 = "http://" + local7.aString40 + local40 + "/l=" + Static382.anInt6289 + "/a=" + Static441.anInt7213 + local56 + "/j" + (Static89.aBoolean121 ? "1" : "0") + ",o" + (Static70.aBoolean130 ? "1" : "0") + ",a2";
			try {
				Static160.aClient1.getAppletContext().showDocument(new URL(local105), "_self");
				return true;
			} catch (@Pc(123) Exception local123) {
				return false;
			}
		} else {
			Static367.aString66 = local7.aString40;
			Static53.anInt1053 = local7.anInt4776;
			if (Static449.aClass207_11 != Static194.aClass207_8) {
				Static178.anInt1113 = Static53.anInt1053 + 40000;
				Static358.anInt6021 = Static53.anInt1053 + 50000;
				Static384.anInt6347 = Static178.anInt1113;
			}
			return true;
		}
	}
}

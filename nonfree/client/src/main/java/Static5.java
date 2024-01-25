import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Z")
	public static boolean method138(@OriginalArg(1) int arg0) {
		@Pc(12) Class23_Sub1 local12 = Static450.method6078(arg0);
		if (local12 == null) {
			return false;
		} else if (Static197.anInt3816 == 3) {
			@Pc(43) String local43 = "";
			if (Static343.aClass269_11 != Static293.aClass269_10) {
				local43 = ":" + (local12.anInt3274 + 7000);
			}
			@Pc(59) String local59 = "";
			if (Static438.aString70 != null) {
				local59 = "/p=" + Static438.aString70;
			}
			@Pc(108) String local108 = "http://" + local12.aString21 + local43 + "/l=" + Static272.anInt7537 + "/a=" + Static160.anInt3171 + local59 + "/j" + (Static187.aBoolean588 ? "1" : "0") + ",o" + (Static41.aBoolean94 ? "1" : "0") + ",a2";
			try {
				Static405.aClient1.getAppletContext().showDocument(new URL(local108), "_self");
				return true;
			} catch (@Pc(118) Exception local118) {
				return false;
			}
		} else {
			Static373.aString7 = local12.aString21;
			Static62.anInt1710 = local12.anInt3274;
			if (Static293.aClass269_10 != Static343.aClass269_11) {
				Static133.anInt2586 = Static62.anInt1710 + 50000;
				Static276.anInt5074 = Static62.anInt1710 + 40000;
				Static219.anInt4190 = Static276.anInt5074;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method141() {
		Static16.method240((long) Static164.anInt3206, Static387.aClass26_9);
		if (Static108.anInt2264 != -1) {
			Static416.method5643(Static108.anInt2264);
		}
		for (@Pc(18) int local18 = 0; local18 < Static66.anInt1689; local18++) {
			if (Static10.aBooleanArray5[local18]) {
				Static378.aBooleanArray47[local18] = true;
			}
			Static16.aBooleanArray6[local18] = Static10.aBooleanArray5[local18];
			Static10.aBooleanArray5[local18] = false;
		}
		Static143.anInt7609 = Static164.anInt3206;
		if (Static387.aClass26_9.method2261()) {
			Static382.aBoolean578 = true;
		}
		if (Static108.anInt2264 != -1) {
			Static66.anInt1689 = 0;
			Static337.method4763();
		}
		Static387.aClass26_9.va();
		Static278.method4105(Static231.anInt4398);
		Static305.anInt1351 = 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)B")
	public static byte method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}

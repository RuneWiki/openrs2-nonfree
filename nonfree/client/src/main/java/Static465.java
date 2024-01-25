import java.awt.Canvas;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!za", name = "e", descriptor = "Lclient!nj;")
	public static Class181 aClass181_49 = new Class181();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IZLjava/lang/String;)Z")
	public static boolean method5967(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (Static307.anInt5537 != 3) {
			Static163.aClass263_3 = new Class263();
			Static163.aClass263_3.anInt7387 = arg0;
			Static163.aClass263_3.aString71 = arg1;
			if (Static429.aClass129_8 != Static112.aClass129_4) {
				Static163.aClass263_3.anInt7388 = Static163.aClass263_3.anInt7387 + 40000;
				Static163.aClass263_3.anInt7390 = Static163.aClass263_3.anInt7387 + 50000;
			}
			return true;
		}
		@Pc(38) String local38 = "";
		if (Static112.aClass129_4 != Static429.aClass129_8) {
			local38 = ":" + (arg0 + 7000);
		}
		@Pc(53) String local53 = "";
		if (Static222.aString34 != null) {
			local53 = "/p=" + Static222.aString34;
		}
		@Pc(106) String local106 = "http://" + arg1 + local38 + "/l=" + Static80.anInt6195 + "/a=" + Static451.anInt7181 + local53 + "/j" + (Static303.aBoolean325 ? "1" : "0") + ",o" + (Static326.aBoolean409 ? "1" : "0") + ",a2";
		try {
			Static94.aClient2.getAppletContext().showDocument(new URL(local106), "_self");
			return true;
		} catch (@Pc(116) Exception local116) {
			return false;
		}
	}

	@OriginalMember(owner = "client!za", name = "g", descriptor = "(I)V")
	public static void method5985() {
		if (!Static11.aBoolean7) {
			return;
		}
		@Pc(15) Class93 local15 = Static34.method566(Static238.anInt4001, Static329.anInt5889);
		if (local15 != null && local15.anObjectArray8 != null) {
			@Pc(24) Class2_Sub18 local24 = new Class2_Sub18();
			local24.anObjectArray33 = local15.anObjectArray8;
			local24.aClass93_10 = local15;
			Static76.method1143(local24);
		}
		Static236.anInt3995 = -1;
		Static435.anInt7328 = -1;
		Static11.aBoolean7 = false;
		if (local15 != null) {
			Static383.method5263(local15);
		}
	}

	@OriginalMember(owner = "client!za", name = "i", descriptor = "(I)V")
	public static void method5995() {
		@Pc(5) int local5 = 0;
		if (Static434.aClass165_Sub1_1.method3390(Static404.anInt2752)) {
			local5 = 55;
		}
		if (!Static434.aClass165_Sub1_1.aBoolean297) {
			local5 |= 0x40;
		}
		Static413.method5672(local5);
		Static249.aClass39_2.method750(local5);
		Static413.aClass271_2.method6200(local5);
		Static227.aClass54_2.method1130(local5);
		Static399.aClass100_2.method2195(local5);
		Static380.method5248(local5);
		Static206.method2909(local5);
		Static433.method5874(local5);
		Static299.method4282(local5);
		Static61.method978();
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!l;Ljava/awt/Canvas;IIILclient!pb;)Lclient!za;")
	public static synchronized Class75 method6008(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class194 arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			if (!Static404.aBooleanArray9[local14]) {
				local7 = local14;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(55) Class75 local55;
		if (arg3 == 0) {
			local55 = Static243.method3376(arg0, arg1, local7);
		} else if (arg3 == 1) {
			local55 = Static132.method2117(arg2, arg4, local7, arg0, arg1);
		} else if (arg3 == 2) {
			local55 = Static321.method4565(arg0, arg1, arg4, local7);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static404.aBooleanArray9[local7] = true;
		return local55;
	}
}

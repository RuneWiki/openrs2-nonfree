import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "Ljava/lang/String;")
	public static final String aString211 = "purple:";

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
	public static int anInt5716 = 104;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Z")
	public static boolean method5082(@OriginalArg(1) int arg0) {
		@Pc(14) Class6_Sub1 local14 = Static105.method2287(arg0);
		if (local14 == null) {
			return false;
		} else if (Static12.anInt244 == 3) {
			@Pc(48) String local48 = "";
			if (Static322.anInt6208 != 0) {
				local48 = ":" + (local14.anInt4518 + 7000);
			}
			@Pc(66) String local66 = "";
			if (Static323.aString38 != null) {
				local66 = "/p=" + Static323.aString38;
			}
			@Pc(115) String local115 = "http://" + local14.aString168 + local48 + "/l=" + Static201.anInt4054 + "/a=" + Static74.anInt5346 + local66 + "/j" + (Static76.aBoolean124 ? "1" : "0") + ",o" + (Static237.aBoolean305 ? "1" : "0") + ",a2";
			try {
				Static353.aClient1.getAppletContext().showDocument(new URL(local115), "_self");
				return true;
			} catch (@Pc(125) Exception local125) {
				return false;
			}
		} else {
			Static296.anInt5689 = local14.anInt4518;
			Static46.aString46 = local14.aString168;
			if (Static322.anInt6208 != 0) {
				Static273.anInt5185 = Static296.anInt5689 + 50000;
				Static165.anInt5083 = Static296.anInt5689 + 40000;
				Static109.anInt2429 = Static165.anInt5083;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
	public static void method5083() {
		Static181.method3500();
		Static190.aClass67_3 = null;
		Static2.aClass67_1 = null;
		Static262.aClass46_7 = null;
		Static162.aClass188ArrayArray1 = null;
		Static181.aClass67_2 = null;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ap;Z)V")
	public static void method5084(@OriginalArg(0) Class15 arg0) {
		Static85.anInt2078 = 3;
		Static184.method3541(true);
		Static95.anInt2209 = 0;
		Static109.anInt2428 = 2;
		Static217.anInt4358 = 0;
		Static325.anInt6256 = 0;
		Static53.aBoolean87 = true;
		Static232.anInt2218 = 1;
		Static282.anInt5377 = 127;
		Static106.anInt2354 = 0;
		Static185.aBoolean242 = true;
		Static323.aBoolean52 = true;
		Static153.aBoolean212 = true;
		Static27.aBoolean30 = true;
		Static29.aBoolean312 = true;
		Static9.aBoolean10 = true;
		Static78.anInt1894 = 127;
		Static281.aBoolean353 = true;
		Static134.aBoolean191 = true;
		Static181.aBoolean239 = true;
		Static345.anInt6584 = 255;
		if (Static127.anInt2786 < 96) {
			Static252.method4374(0);
		} else {
			Static252.method4374(2);
		}
		Static99.aBoolean157 = true;
		Static61.aBoolean94 = false;
		Static267.aBoolean340 = true;
		Static203.anInt6246 = 2;
		Static333.anInt6446 = 2;
		Static153.anInt3264 = Static203.anInt6252 == 1 ? 2 : 4;
		Static228.anInt4497 = 0;
		Static198.aBoolean251 = false;
		Static205.anInt4107 = 0;
		Static32.aBoolean39 = false;
		@Pc(88) Class110 local88 = null;
		try {
			@Pc(92) Class205 local92 = arg0.method277();
			while (local92.anInt6370 == 0) {
				Static15.method5425(1L);
			}
			if (local92.anInt6370 == 1) {
				local88 = (Class110) local92.anObject7;
				@Pc(116) byte[] local116 = new byte[(int) local88.method3081()];
				@Pc(131) int local131;
				for (@Pc(118) int local118 = 0; local118 < local116.length; local118 += local131) {
					local131 = local88.method3082(local118, local116, local116.length - local118);
					if (local131 == -1) {
						throw new IOException("EOF");
					}
				}
				Static13.method2364(new Class14_Sub4(local116));
			}
		} catch (@Pc(155) Exception local155) {
		}
		try {
			if (local88 != null) {
				local88.method3079();
			}
		} catch (@Pc(162) Exception local162) {
		}
	}
}

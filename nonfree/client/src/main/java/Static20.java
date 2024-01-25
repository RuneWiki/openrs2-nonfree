import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!cq;")
	public static Class8 aClass8_2;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!cl;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray3;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public static void method355() {
		if (Static51.anInt1261 == 0) {
			return;
		}
		try {
			if (++Static5.anInt50 > 2000) {
				if (Static81.aClass202_3 != null) {
					Static81.aClass202_3.method5477();
					Static81.aClass202_3 = null;
				}
				if (Static17.anInt339 >= 1) {
					Static51.anInt1261 = 0;
					Static3.anInt37 = -5;
					return;
				}
				Static51.anInt1261 = 1;
				if (Static214.anInt4553 == Static29.anInt544) {
					Static29.anInt544 = Static149.anInt3069;
				} else {
					Static29.anInt544 = Static214.anInt4553;
				}
				Static17.anInt339++;
				Static5.anInt50 = 0;
			}
			if (Static51.anInt1261 == 1) {
				Static319.aClass193_5 = Static197.aClass215_5.method5673(Static29.anInt544, Static351.aString149);
				Static51.anInt1261 = 2;
			}
			@Pc(115) int local115;
			if (Static51.anInt1261 == 2) {
				if (Static319.aClass193_5.anInt5986 == 2) {
					throw new IOException();
				}
				if (Static319.aClass193_5.anInt5986 != 1) {
					return;
				}
				Static81.aClass202_3 = new Class202((Socket) Static319.aClass193_5.anObject7, Static197.aClass215_5);
				Static319.aClass193_5 = null;
				Static81.aClass202_3.method5480(Static305.aClass1_Sub21_Sub2_3.anInt6611, Static305.aClass1_Sub21_Sub2_3.aByteArray82);
				if (Static205.aClass125_1 != null) {
					Static205.aClass125_1.method5316();
				}
				if (Static310.aClass125_2 != null) {
					Static310.aClass125_2.method5316();
				}
				local115 = Static81.aClass202_3.method5478();
				if (Static205.aClass125_1 != null) {
					Static205.aClass125_1.method5316();
				}
				if (Static310.aClass125_2 != null) {
					Static310.aClass125_2.method5316();
				}
				if (local115 != 21) {
					Static51.anInt1261 = 0;
					Static3.anInt37 = local115;
					Static81.aClass202_3.method5477();
					Static81.aClass202_3 = null;
					return;
				}
				Static51.anInt1261 = 3;
			}
			if (Static51.anInt1261 == 3) {
				if (Static81.aClass202_3.method5473() < 1) {
					return;
				}
				Static126.aStringArray25 = new String[Static81.aClass202_3.method5478()];
				Static51.anInt1261 = 4;
			}
			if (Static51.anInt1261 == 4 && Static81.aClass202_3.method5473() >= Static126.aStringArray25.length * 8) {
				Static142.aClass1_Sub21_Sub2_1.anInt6611 = 0;
				Static81.aClass202_3.method5476(0, Static142.aClass1_Sub21_Sub2_1.aByteArray82, Static126.aStringArray25.length * 8);
				for (local115 = 0; local115 < Static126.aStringArray25.length; local115++) {
					Static126.aStringArray25[local115] = Static32.method512(Static142.aClass1_Sub21_Sub2_1.method5704());
				}
				Static51.anInt1261 = 0;
				Static3.anInt37 = 21;
				Static81.aClass202_3.method5477();
				Static81.aClass202_3 = null;
			}
		} catch (@Pc(217) IOException local217) {
			if (Static81.aClass202_3 != null) {
				Static81.aClass202_3.method5477();
				Static81.aClass202_3 = null;
			}
			if (Static17.anInt339 < 1) {
				if (Static29.anInt544 == Static214.anInt4553) {
					Static29.anInt544 = Static149.anInt3069;
				} else {
					Static29.anInt544 = Static214.anInt4553;
				}
				Static17.anInt339++;
				Static51.anInt1261 = 1;
				Static5.anInt50 = 0;
			} else {
				Static51.anInt1261 = 0;
				Static3.anInt37 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method357() {
		Static344.aClass8Array15 = null;
		Static189.aClass8Array14 = null;
		Static233.aClass29_2 = null;
		Static180.aClass8Array8 = null;
		Static352.aClass8Array16 = null;
		Static54.aClass8Array3 = null;
		Static211.aClass8Array11 = null;
		Static188.aClass8Array9 = null;
		Static304.aClass8Array13 = null;
		Static28.aClass8Array2 = null;
		Static294.aClass29_4 = null;
		Static83.aClass8Array5 = null;
		Static173.aClass8Array7 = null;
		aClass8_2 = null;
		Static286.aClass29_3 = null;
		Static214.aClass8Array12 = null;
		Static19.aClass8Array1 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)Lclient!or;")
	public static Class1_Sub2_Sub12 method358(@OriginalArg(1) int arg0) {
		@Pc(17) Class1_Sub2_Sub12 local17 = (Class1_Sub2_Sub12) Static288.aClass88_11.method1652((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(30) byte[] local30;
		if (arg0 < 32768) {
			local30 = Static344.aClass134_147.method3009(arg0, 0);
		} else {
			local30 = Static71.aClass134_31.method3009(arg0 & 0x7FFF, 0);
		}
		local17 = new Class1_Sub2_Sub12();
		if (local30 != null) {
			local17.method4093(new Class1_Sub21(local30));
		}
		if (arg0 >= 32768) {
			local17.method4089();
		}
		Static288.aClass88_11.method1651((long) arg0, local17);
		return local17;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	public static void method359() {
		Static60.method1146();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static313.aClass17Array1[local8].method333();
		}
		Static329.method5542();
		Static14.method208();
		System.gc();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)V")
	public static void method360(@OriginalArg(0) int arg0) {
		Static112.method1810();
		Static19.method327();
		Static257.method4570(true, arg0);
		Static66.method1208(Static125.aClass134_55, Static217.aClass105_5, Static77.aClass134_33);
		Static220.method4066(Static217.aClass105_5, Static125.aClass134_55);
		Static103.method1626(Static19.aClass8Array1);
		Static206.method3702();
		Static74.method1295();
		if (Static261.anInt5376 == 10) {
			Static173.method3108(false);
		} else if (Static261.anInt5376 == 30) {
			Static16.method298(25);
		} else if (Static261.anInt5376 == 5) {
			Static120.method1952(Static217.aClass105_5, Static125.aClass134_55);
			return;
		}
	}
}

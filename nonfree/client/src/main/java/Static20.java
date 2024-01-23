import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "Lclient!se;")
	public static Class122 aClass122_1;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString29 = "Loaded interfaces";

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
	public static volatile int anInt716 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)I")
	public static int method396() {
		return Static202.aBoolean219 && Static124.aBooleanArray7[81] && Static230.anInt5417 > 2 ? Static170.anIntArray299[Static230.anInt5417 - 2] : Static170.anIntArray299[Static230.anInt5417 - 1];
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ql;I)V")
	public static void method400(@OriginalArg(0) Class1_Sub13 arg0) {
		if (arg0.aByteArray29.length - arg0.anInt2395 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method1772();
		if (local19 < 0 || local19 > 11) {
			return;
		}
		@Pc(34) byte local34;
		if (local19 == 11) {
			local34 = 33;
		} else if (local19 == 10) {
			local34 = 32;
		} else if (local19 == 9) {
			local34 = 31;
		} else if (local19 == 8) {
			local34 = 30;
		} else if (local19 == 7) {
			local34 = 29;
		} else if (local19 == 6) {
			local34 = 28;
		} else if (local19 == 5) {
			local34 = 28;
		} else if (local19 == 4) {
			local34 = 24;
		} else if (local19 == 3) {
			local34 = 23;
		} else if (local19 == 2) {
			local34 = 22;
		} else if (local19 == 1) {
			local34 = 23;
		} else {
			local34 = 19;
		}
		if (local34 > arg0.aByteArray29.length - arg0.anInt2395) {
			return;
		}
		Static148.anInt398 = arg0.method1772();
		if (Static148.anInt398 < 1) {
			Static148.anInt398 = 1;
		} else if (Static148.anInt398 > 4) {
			Static148.anInt398 = 4;
		}
		Static262.method4182(arg0.method1772() == 1);
		Static3.aBoolean3 = arg0.method1772() == 1;
		Static249.aBoolean270 = arg0.method1772() == 1;
		Static132.aBoolean175 = arg0.method1772() == 1;
		Static109.aBoolean156 = arg0.method1772() == 1;
		Static210.aBoolean226 = arg0.method1772() == 1;
		Static140.aBoolean181 = arg0.method1772() == 1;
		Static19.aBoolean37 = arg0.method1772() == 1;
		Static153.anInt3692 = arg0.method1772();
		if (Static153.anInt3692 > 2) {
			Static153.anInt3692 = 2;
		}
		if (local19 < 2) {
			Static183.aBoolean263 = arg0.method1772() == 1;
			arg0.method1772();
		} else {
			Static183.aBoolean263 = arg0.method1772() == 1;
		}
		Static63.aBoolean96 = arg0.method1772() == 1;
		Static174.aBoolean197 = arg0.method1772() == 1;
		Static182.anInt4168 = arg0.method1772();
		if (Static182.anInt4168 > 2) {
			Static182.anInt4168 = 2;
		}
		Static44.anInt1342 = Static182.anInt4168;
		Static69.aBoolean106 = arg0.method1772() == 1;
		Static237.anInt5140 = arg0.method1772();
		if (Static237.anInt5140 > 127) {
			Static237.anInt5140 = 127;
		}
		Static106.anInt2847 = arg0.method1772();
		Static47.anInt1385 = arg0.method1772();
		if (Static47.anInt1385 > 127) {
			Static47.anInt1385 = 127;
		}
		if (local19 >= 1) {
			Static26.anInt701 = arg0.method1764();
			Static66.anInt1836 = arg0.method1764();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method1772();
		}
		if (local19 >= 4) {
			@Pc(377) int local377 = arg0.method1772();
			if (Static169.anInt3959 < 96) {
				local377 = 0;
			}
			Static163.method2836(local377);
		}
		if (local19 >= 5) {
			Static164.anInt3852 = arg0.method1802();
		}
		if (local19 >= 6) {
			Static57.anInt1587 = arg0.method1772();
		}
		if (local19 >= 7) {
			Static87.aBoolean135 = arg0.method1772() == 1;
		}
		if (local19 >= 8) {
			Static138.aBoolean180 = arg0.method1772() == 1;
		}
		if (local19 >= 9) {
			Static216.anInt4750 = arg0.method1772();
		}
		if (local19 >= 10) {
			Static25.aBoolean44 = arg0.method1772() != 0;
		}
		if (local19 >= 11) {
			Static188.aBoolean205 = arg0.method1772() != 0;
		}
	}
}

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ak", name = "F", descriptor = "Lclient!mu;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
	public static int anInt240 = -60;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLclient!za;)V")
	public static void method190(@OriginalArg(1) Class200 arg0) {
		if (Static345.aClass177_32.method3620() == 0) {
			return;
		}
		@Pc(20) Class5_Sub32 local20;
		if (Static146.anInt2644 == 0) {
			for (local20 = (Class5_Sub32) Static345.aClass177_32.method3618(); local20 != null; local20 = (Class5_Sub32) Static345.aClass177_32.method3619()) {
				Static306.aClass67_3.method1451(local20.anInt5471, arg0, local20.anInt5472, arg0, false, local20.anInt5478, false, local20.aBoolean378 ? Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1 : null, local20.anInt5474, Static138.aClass23_2, local20.anInt5470);
				local20.method6003();
			}
			Static251.method3223();
			return;
		}
		if (Static424.aClass200_10 == null) {
			@Pc(68) Canvas local68 = new Canvas();
			local68.setSize(36, 32);
			Static424.aClass200_10 = Static464.method5875(Static71.anInterface8_138, local68, 0, Static7.aClass93_1, 0);
			Static207.aClass23_3 = Static424.aClass200_10.method5837(Static215.method2844(Static425.anInt7119, Static281.aClass243_250), Static470.method4679(Static344.aClass243_196, Static425.anInt7119));
		}
		for (local20 = (Class5_Sub32) Static345.aClass177_32.method3618(); local20 != null; local20 = (Class5_Sub32) Static345.aClass177_32.method3619()) {
			Static306.aClass67_3.method1451(local20.anInt5471, Static424.aClass200_10, local20.anInt5472, arg0, false, local20.anInt5478, false, local20.aBoolean378 ? Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1 : null, local20.anInt5474, Static207.aClass23_3, local20.anInt5470);
			local20.method6003();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method193(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static43.method4106(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static43.method4106(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(64) StringBuffer local64 = new StringBuffer(local49);
		for (@Pc(73) int local73 = local11; local73 < local14; local73++) {
			@Pc(79) char local79 = arg0.charAt(local73);
			if (Static151.method5966(local79)) {
				@Pc(87) char local87 = Static248.method3195(local79);
				if (local87 != '\u0000') {
					local64.append(local87);
				}
			}
		}
		if (local64.length() == 0) {
			return null;
		} else {
			return local64.toString();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!aa;")
	public static Class2_Sub1 method194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class258 local7 = Static319.aClass258ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class122 local14 = local7.aClass122_3; local14 != null; local14 = local14.aClass122_1) {
			@Pc(18) Class2_Sub1 local18 = local14.aClass2_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort107 == arg1 && local18.aShort106 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)V")
	public static void method197() {
		Static72.method1076();
		Static289.method3592(Static216.aClass1_Sub1_1.aBoolean305);
		Static80.aClass191_1 = Static334.method4156(Static7.aClass93_1, 22050, 0, Static246.aCanvas2);
		Static80.aClass191_1.method5001(Static293.aClass5_Sub22_Sub1_2);
		Static152.aClass191_2 = Static334.method4156(Static7.aClass93_1, 2048, 1, Static246.aCanvas2);
		Static152.aClass191_2.method5001(Static119.aClass5_Sub22_Sub3_3);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public static void method201(@OriginalArg(0) String arg0) {
		if (Static349.aClass124Array1 != null) {
			Static288.method3576(Static441.aClass194_118);
			Static281.aClass5_Sub15_Sub2_13.method5583(Static21.method357(arg0));
			Static281.aClass5_Sub15_Sub2_13.method5545(arg0);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!li", name = "rb", descriptor = "[I")
	public static final int[] anIntArray508 = new int[32];

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V")
	public static void method4761(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static190.anInt4314 <= arg1 - arg0 && Static145.anInt2941 >= arg0 + arg1 && arg2 - arg0 >= Static269.anInt5577 && arg0 + arg2 <= Static81.anInt1788) {
			Static9.method6179(arg1, arg2, arg3, arg0);
		} else {
			Static243.method4208(arg0, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IJ)V")
	public static void method4762(@OriginalArg(1) long arg0) {
		if (Static279.aClass290ArrayArrayArray7 != null) {
			if (Static305.anInt5998 == 1 || Static305.anInt5998 == 5) {
				Static127.method2252(arg0);
			} else if (Static305.anInt5998 == 4) {
				Static291.method4915(arg0);
			}
		}
		Static353.method5566((long) Static223.anInt4829, Static121.aClass5_7);
		if (Static422.anInt8667 != -1) {
			Static323.method5179(Static422.anInt8667);
		}
		for (@Pc(48) int local48 = 0; local48 < Static489.anInt8712; local48++) {
			if (Static125.aBooleanArray12[local48]) {
				Static302.aBooleanArray29[local48] = true;
			}
			Static280.aBooleanArray28[local48] = Static125.aBooleanArray12[local48];
			Static125.aBooleanArray12[local48] = false;
		}
		Static441.anInt8034 = Static223.anInt4829;
		if (Static121.aClass5_7.method7462()) {
			Static199.aBoolean327 = true;
		}
		if (Static422.anInt8667 != -1) {
			Static489.anInt8712 = 0;
			Static356.method5586();
		}
		Static121.aClass5_7.F();
		Static319.method5146(Static121.aClass5_7);
		@Pc(95) int local95 = Static56.method1147();
		if (local95 == -1) {
			local95 = Static7.anInt488;
		}
		if (local95 == -1) {
			local95 = Static395.anInt7316;
		}
		Static234.method4162(local95);
		Static464.method6918(Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811, Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100, Static276.anInt5695, Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813);
		Static276.anInt5695 = 0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method4763(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}

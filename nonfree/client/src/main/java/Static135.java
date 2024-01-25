import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
	public static int anInt3198;

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_47 = new Class6(25, 0);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([Lclient!ha;B)V")
	public static void method2902(@OriginalArg(0) Class12[] arg0) {
		Static47.anInt1414 = arg0.length;
		Static420.anIntArray577 = new int[Static47.anInt1414 + 10];
		Static274.aClass12Array17 = new Class12[Static47.anInt1414 + 10];
		Static555.method5096(arg0, 0, Static274.aClass12Array17, 0, Static47.anInt1414);
		for (@Pc(29) int local29 = 0; local29 < Static47.anInt1414; local29++) {
			Static420.anIntArray577[local29] = Static274.aClass12Array17[local29].ma();
		}
		for (@Pc(43) int local43 = Static47.anInt1414; local43 < Static274.aClass12Array17.length; local43++) {
			Static420.anIntArray577[local43] = 12;
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	public static void method2903() {
		Static197.method3653(Static89.aClass1_Sub28_Sub1_1.aBoolean332);
		Static165.aClass1_Sub12_Sub4_1 = new Class1_Sub12_Sub4();
		Static165.aClass1_Sub12_Sub4_1.method6537();
		Static426.aClass39_7 = Static213.method3840(0, Static78.aCanvas7, 22050, Static91.aClass182_2);
		Static426.aClass39_7.method5061(Static165.aClass1_Sub12_Sub4_1);
		Static117.method2661(Static42.aClass160_8, Static517.aClass160_100, Static165.aClass1_Sub12_Sub4_1, Static51.aClass160_93);
		Static404.aClass39_9 = Static213.method3840(1, Static78.aCanvas7, 2048, Static91.aClass182_2);
		Static445.aClass1_Sub12_Sub3_2 = new Class1_Sub12_Sub3();
		Static404.aClass39_9.method5061(Static445.aClass1_Sub12_Sub3_2);
		Static224.aClass42_1 = new Class42(22050, Static77.anInt2079);
		Static229.anInt4562 = Static45.aClass160_10.method4199("scape main");
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BII)Z")
	public static boolean method2904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)V")
	public static void method2905(@OriginalArg(0) boolean arg0) {
		Static443.method6413();
		if (!Static442.method6767(Static51.anInt7926)) {
			return;
		}
		Static288.anInt5629++;
		if (Static288.anInt5629 < 50 && !arg0) {
			return;
		}
		Static288.anInt5629 = 0;
		if (!Static5.aBoolean5 && Static453.aClass154_1 != null) {
			Static444.method6416(Static438.aClass186_36);
			try {
				Static453.aClass154_1.method4023(Static192.aClass1_Sub13_Sub2_1.anInt3400, Static192.aClass1_Sub13_Sub2_1.aByteArray45);
				Static192.aClass1_Sub13_Sub2_1.anInt3400 = 0;
			} catch (@Pc(57) IOException local57) {
				Static5.aBoolean5 = true;
			}
		}
		Static443.method6413();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBIIILclient!te;)Lclient!rp;")
	public static Class20_Sub3_Sub1 method2906(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class9_Sub3 arg4) {
		if (arg4.aBoolean513 || Static183.method3500(arg0) && Static183.method3500(arg3)) {
			return new Class20_Sub3_Sub1(arg4, 3553, arg2, arg1, arg0, arg3, true);
		} else if (arg4.aBoolean515) {
			return new Class20_Sub3_Sub1(arg4, 34037, arg2, arg1, arg0, arg3, true);
		} else {
			return new Class20_Sub3_Sub1(arg4, arg2, arg1, arg0, arg3, Static117.method2662(arg0), Static117.method2662(arg3), true);
		}
	}
}

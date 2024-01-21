import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!hc", name = "hb", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_10;

	@OriginalMember(owner = "client!hc", name = "N", descriptor = "[I")
	public static final int[] anIntArray138 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
	public static int anInt1507 = 0;

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_511 = Static161.method2452("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!hc", name = "Z", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_512 = Static161.method2452("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!hc", name = "gb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_513 = Static161.method2452("3D)2Softwarebibliothek gestartet)3");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1140(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static19.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static82.aClass37_1);
		arg0.addFocusListener(Static82.aClass37_1);
	}

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)V")
	public static void method1141() {
		Static10.aClass5_Sub6_Sub1_1.method3088();
		@Pc(9) int local9 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
		if (local9 == 0) {
			return;
		}
		@Pc(21) int local21 = Static10.aClass5_Sub6_Sub1_1.method3090(2);
		if (local21 == 0) {
			Static188.anIntArray395[Static17.anInt347++] = 2047;
			return;
		}
		@Pc(42) int local42;
		@Pc(52) int local52;
		if (local21 == 1) {
			local42 = Static10.aClass5_Sub6_Sub1_1.method3090(3);
			Static210.aClass1_Sub2_Sub2_2.method1743(local42, false);
			local52 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
			if (local52 == 1) {
				Static188.anIntArray395[Static17.anInt347++] = 2047;
			}
			return;
		}
		@Pc(96) int local96;
		if (local21 == 2) {
			local42 = Static10.aClass5_Sub6_Sub1_1.method3090(3);
			Static210.aClass1_Sub2_Sub2_2.method1743(local42, true);
			local52 = Static10.aClass5_Sub6_Sub1_1.method3090(3);
			Static210.aClass1_Sub2_Sub2_2.method1743(local52, true);
			local96 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
			if (local96 == 1) {
				Static188.anIntArray395[Static17.anInt347++] = 2047;
			}
		} else if (local21 == 3) {
			local42 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
			local52 = Static10.aClass5_Sub6_Sub1_1.method3090(7);
			local96 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
			if (local96 == 1) {
				Static188.anIntArray395[Static17.anInt347++] = 2047;
			}
			Static111.anInt2327 = Static10.aClass5_Sub6_Sub1_1.method3090(2);
			@Pc(149) int local149 = Static10.aClass5_Sub6_Sub1_1.method3090(7);
			Static210.aClass1_Sub2_Sub2_2.method1744(local52, local42 == 1, local149);
		}
	}

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)[Lclient!jc;")
	public static Class47[] method1142() {
		@Pc(8) Class47[] local8 = new Class47[Static99.anInt2138];
		for (@Pc(10) int local10 = 0; local10 < Static99.anInt2138; local10++) {
			local8[local10] = new Class47_Sub1(Static58.anInt1319, Static140.anInt2921, Static146.anIntArray320[local10], Static5.anIntArray10[local10], Static153.anIntArray337[local10], Static210.anIntArray84[local10], Static191.aByteArrayArray9[local10], Static3.anIntArray9);
		}
		Static85.method1452();
		return local8;
	}
}

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!wba", name = "f", descriptor = "Lclient!pn;")
	public static final Class271 aClass271_15 = new Class271(3);

	@OriginalMember(owner = "client!wba", name = "h", descriptor = "Z")
	public static boolean aBoolean708 = false;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILclient!r;)V")
	public static void method7724(@OriginalArg(1) Class78 arg0) {
		if (Static251.aClass111_22.method2545() == 0) {
			return;
		}
		@Pc(29) Class1_Sub50 local29;
		if (Static286.anInt5239 == 0) {
			for (local29 = (Class1_Sub50) Static251.aClass111_22.method2547(); local29 != null; local29 = (Class1_Sub50) Static251.aClass111_22.method2554()) {
				Static230.aClass225_1.method4864(local29.anInt9374, false, local29.anInt9376, false, local29.anInt9372, local29.aBoolean698 ? Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1 : null, arg0, Static442.aClass96_12, local29.anInt9375, arg0, local29.anInt9373);
				local29.method7908();
			}
			Static506.method7088();
			return;
		}
		if (Static500.aClass78_134 == null) {
			@Pc(76) Canvas local76 = new Canvas();
			local76.setSize(36, 32);
			Static500.aClass78_134 = Static439.method6788(0, 0, local76, Static302.anInterface9_12, Static461.aClass308_163);
			Static10.aClass96_1 = Static500.aClass78_134.method6837(Static337.method5009(Static456.anInt7982, Static77.aClass308_183), Static604.method6020(Static121.aClass308_48, Static456.anInt7982));
		}
		for (local29 = (Class1_Sub50) Static251.aClass111_22.method2547(); local29 != null; local29 = (Class1_Sub50) Static251.aClass111_22.method2554()) {
			Static230.aClass225_1.method4864(local29.anInt9374, false, local29.anInt9376, false, local29.anInt9372, local29.aBoolean698 ? Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1 : null, arg0, Static10.aClass96_1, local29.anInt9375, Static500.aClass78_134, local29.anInt9373);
			local29.method7908();
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "([Lclient!vv;II)V")
	public static void method7725(@OriginalArg(0) Class11_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class11_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt8899;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt8899 < local27 + (local29 & 0x1)) {
				@Pc(44) Class11_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method7725(arg0, arg1, local10 - 1);
		method7725(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!hb;BIIB)V")
	public static void method7726(@OriginalArg(0) Class11_Sub1_Sub1_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray455[0];
		@Pc(15) int local15 = arg0.anIntArray454[0];
		if (local10 < 0 || Static458.anInt9736 <= local10 || local15 < 0 || local15 >= Static378.anInt6747 || (arg2 < 0 || Static458.anInt9736 <= arg2 || arg1 < 0 || arg1 >= Static378.anInt6747)) {
			return;
		}
		@Pc(72) int local72 = Static317.method7566(arg0.method6058(), -4, local15, Static375.anIntArray392, 0, local10, 0, 0, Static590.aClass240Array1[arg0.aByte113], arg1, true, Static184.anIntArray181, 0, arg2);
		if (local72 >= 1 && local72 <= 3) {
			for (@Pc(91) int local91 = 0; local91 < local72 - 1; local91++) {
				arg0.method2953((byte) 2, Static375.anIntArray392[local91], Static184.anIntArray181[local91]);
			}
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILclient!in;)Ljava/lang/String;")
	public static String method7727(@OriginalArg(1) Class160 arg0) {
		if (Static67.method1098(arg0).method574() == 0) {
			return null;
		} else if (arg0.aString43 == null || arg0.aString43.trim().length() == 0) {
			return Static506.aBoolean659 ? "Hidden-use" : null;
		} else {
			return arg0.aString43;
		}
	}
}

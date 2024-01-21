import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!vc", name = "Wb", descriptor = "I")
	public static int anInt3121;

	@OriginalMember(owner = "client!vc", name = "Zb", descriptor = "Lclient!s;")
	public static Class4_Sub16 aClass4_Sub16_6;

	@OriginalMember(owner = "client!vc", name = "dc", descriptor = "[I")
	public static int[] anIntArray359;

	@OriginalMember(owner = "client!vc", name = "kc", descriptor = "Lclient!ea;")
	public static Class20_Sub1 aClass20_Sub1_19;

	@OriginalMember(owner = "client!vc", name = "nc", descriptor = "[Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4[] aClass4_Sub2_Sub3_Sub4Array8;

	@OriginalMember(owner = "client!vc", name = "Vb", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[50][];

	@OriginalMember(owner = "client!vc", name = "Xb", descriptor = "I")
	public static int anInt3122 = 0;

	@OriginalMember(owner = "client!vc", name = "Yb", descriptor = "[I")
	public static int[] anIntArray358 = new int[500];

	@OriginalMember(owner = "client!vc", name = "fc", descriptor = "I")
	public static int anInt3127 = 0;

	@OriginalMember(owner = "client!vc", name = "gc", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1750 = Static28.method504("Invalid username or password)3");

	@OriginalMember(owner = "client!vc", name = "ic", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1751 = aClass39_1750;

	@OriginalMember(owner = "client!vc", name = "jc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1752 = Static28.method504("rect_debug=");

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!pd;Lclient!pd;B)I")
	public static int method2173(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1) {
		@Pc(10) int local10 = 0;
		if (arg0.method487(Static6.aClass39_180, Static98.aClass39_583)) {
			local10++;
		}
		if (arg1.method487(Static6.aClass39_180, Static62.aClass39_861)) {
			local10++;
		}
		if (arg1.method487(Static6.aClass39_180, Static121.aClass39_1609)) {
			local10++;
		}
		if (arg1.method487(Static6.aClass39_180, Static111.aClass39_1465)) {
			local10++;
		}
		if (arg1.method487(Static6.aClass39_180, Static58.aClass39_833)) {
			local10++;
		}
		if (arg1.method487(Static6.aClass39_180, Static127.aClass39_1754)) {
			local10++;
		}
		arg1.method487(Static6.aClass39_180, Static10.aClass39_232);
		arg1.method487(Static6.aClass39_180, Static35.aClass39_456);
		arg1.method487(Static6.aClass39_180, Static130.aClass39_1788);
		arg1.method487(Static6.aClass39_180, Static14.aClass39_251);
		arg1.method487(Static6.aClass39_180, Static82.aClass39_1045);
		return local10;
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
	public static void method2174() {
		anIntArray358 = null;
		aClass39_1752 = null;
		anIntArray359 = null;
		aClass39_1750 = null;
		aClass4_Sub16_6 = null;
		aClass20_Sub1_19 = null;
		aClass4_Sub2_Sub3_Sub4Array8 = null;
		aByteArrayArray9 = null;
		aClass39_1751 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!fe;ILjava/lang/Object;)V")
	public static void method2175(@OriginalArg(0) Class29 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg0.anEventQueue1.peekEvent() != null; local16++) {
			method2177(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IJ)V")
	public static void method2177(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static112.method1975(arg0 - 1L);
			Static112.method1975(1L);
		} else {
			Static112.method1975(arg0);
		}
	}
}

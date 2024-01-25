import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
	public static int anInt8;

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_1 = new Class126(3, 4);

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "Lclient!mo;")
	public static final Class239 aClass239_1 = new Class239("", 19);

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILclient!ir;B)V")
	public static void method20(@OriginalArg(0) int arg0, @OriginalArg(1) Class182 arg1) {
		if (Static262.aBoolean401) {
			Static262.aBoolean401 = false;
			arg0 = 0;
		}
		if (Static390.aClass182_1 != null && Static390.aClass182_1.method4137(arg1)) {
			return;
		}
		Static390.aClass182_1 = arg1;
		Static352.aLong163 = Static131.method2268();
		Static56.anInt1424 = arg0;
		Static151.anInt2843 = arg0;
		if (Static151.anInt2843 != 0) {
			Static77.aFloat66 = Static363.aFloat151;
			Static567.aFloat191 = Static623.aFloat188;
			Static101.aFloat69 = Static530.aFloat189;
			Static406.aClass106_4 = Static56.aClass106_1;
			Static617.anInt9568 = Static256.anInt4826;
			Static305.anInt5571 = Static637.anInt9833;
			Static257.anInt4846 = Static142.anInt5232;
			Static227.aFloat85 = Static587.aFloat192;
			Static447.aFloat176 = Static406.aFloat156;
			Static383.aFloat154 = Static102.aFloat70;
			return;
		}
		Static643.method8442();
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(III)Z")
	public static boolean method22(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static403.method5756(arg0, arg1) | (arg0 & 0x800) != 0 || Static179.method2975(arg0, arg1);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IILclient!fca;)V")
	public static void method23(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (Static30.aClass251_7 == null) {
			return;
		}
		try {
			Static30.aClass251_7.method5751(0L);
			Static30.aClass251_7.method5750(arg0, 24, arg1.aByteArray59);
		} catch (@Pc(20) Exception local20) {
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)V")
	public static void method24() {
		if (Static12.aClass124_1 != null) {
			Static12.aClass124_1.method2775();
		}
		if (Static359.aThread3 == null) {
			return;
		}
		while (true) {
			try {
				Static359.aThread3.join();
				return;
			} catch (@Pc(22) InterruptedException local22) {
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!pr;")
	public static Class284 method25(@OriginalArg(1) Component arg0) {
		return new Class284_Sub1(arg0);
	}
}

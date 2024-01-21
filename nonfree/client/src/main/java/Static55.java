import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_2;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "[I")
	public static int[] anIntArray163 = new int[200];

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Lclient!he;")
	public static Class26 aClass26_826 = Static6.method100("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "Lclient!sf;")
	public static Class66 aClass66_15 = new Class66(100);

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "Lclient!he;")
	public static Class26 aClass26_827 = Static6.method100(")3runescape)3com");

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
	public static int anInt1650 = 0;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "Lclient!he;")
	public static Class26 aClass26_831 = Static6.method100("");

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "Lclient!he;")
	public static Class26 aClass26_828 = aClass26_831;

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "[I")
	public static int[] anIntArray165 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "Lclient!he;")
	public static Class26 aClass26_829 = aClass26_831;

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "Lclient!he;")
	public static Class26 aClass26_830 = aClass26_831;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "Lclient!he;")
	public static Class26 aClass26_832 = aClass26_831;

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "Lclient!he;")
	public static Class26 aClass26_833 = aClass26_831;

	@OriginalMember(owner = "client!jd", name = "I", descriptor = "Z")
	public static boolean aBoolean88 = true;

	@OriginalMember(owner = "client!jd", name = "J", descriptor = "Lclient!he;")
	public static Class26 aClass26_834 = aClass26_831;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method1103(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ef;I)V")
	public static void method1105(@OriginalArg(0) Class16 arg0) {
		Static5.aClass16_149 = arg0;
		Static132.anInt3271 = Static5.aClass16_149.method561(16);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLclient!he;)I")
	public static int method1106(@OriginalArg(1) Class26 arg0) {
		if (Static27.anInt978 == 1) {
			return 7;
		} else if (arg0.method822(Static6.aClass26_86)) {
			return 1;
		} else if (arg0.method822(Static24.aClass26_442)) {
			return 1;
		} else if (arg0.method822(Static126.aClass26_1741)) {
			return 2;
		} else if (arg0.method822(Static16.aClass26_250)) {
			return 2;
		} else if (arg0.method822(Static74.aClass26_1057)) {
			return 3;
		} else if (arg0.method822(Static99.aClass26_1483)) {
			return 4;
		} else if (arg0.method822(Static46.aClass26_732)) {
			return 4;
		} else if (arg0.method822(Static32.aClass26_514)) {
			return 5;
		} else if (arg0.method822(Static93.aClass26_1339)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZII)Lclient!he;")
	public static Class26 method1107(@OriginalArg(1) int arg0) {
		return Static124.method2187(true, arg0);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method1108() {
		anIntArray165 = null;
		aClass26_832 = null;
		aClass26_830 = null;
		aClass66_15 = null;
		aClass26_827 = null;
		aClass3_Sub1_Sub4_Sub3_2 = null;
		Class34.anIntArray164 = null;
		aClass26_833 = null;
		aClass26_834 = null;
		aClass26_826 = null;
		aClass26_831 = null;
		aClass26_829 = null;
		aClass26_828 = null;
		anIntArray163 = null;
	}
}

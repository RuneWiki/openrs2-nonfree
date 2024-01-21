import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "[Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3[] aClass5_Sub2_Sub1_Sub3Array35;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Lclient!jf;")
	public static Class26_Sub1 aClass26_Sub1_19;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!r;")
	private static Class61 aClass61_954 = Static129.method2060("level)2");

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Lclient!r;")
	private static Class61 aClass61_957 = Static129.method2060("M");

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!r;")
	public static Class61 aClass61_955 = aClass61_957;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!r;")
	public static Class61 aClass61_956 = aClass61_957;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "Lclient!r;")
	public static Class61 aClass61_958 = aClass61_954;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!r;")
	public static Class61 aClass61_959 = Static129.method2060("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!ge;")
	public static Class29 aClass29_27 = new Class29(64);

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!r;")
	private static Class61 aClass61_961 = Static129.method2060("Loaded wordpack");

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "Lclient!r;")
	public static Class61 aClass61_960 = aClass61_961;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "Lclient!r;")
	public static Class61 aClass61_962 = Static129.method2060("null");

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "[I")
	public static int[] anIntArray362 = new int[100];

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "[I")
	public static int[] anIntArray363 = new int[50];

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	public static void method1905() {
		aClass29_27 = null;
		anIntArray363 = null;
		aClass61_962 = null;
		aClass61_957 = null;
		anIntArray362 = null;
		aClass61_954 = null;
		aClass61_956 = null;
		aClass61_955 = null;
		aClass61_958 = null;
		aClass26_Sub1_19 = null;
		aClass61_961 = null;
		aClass61_959 = null;
		aClass61_960 = null;
		aClass5_Sub2_Sub1_Sub3Array35 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/Object;ILclient!vf;)V")
	public static void method1906(@OriginalArg(0) Object arg0, @OriginalArg(2) Class80 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg1.anEventQueue1.peekEvent() != null; local16++) {
			Static118.method1893(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public static void method1907() {
		Static21.aClass29_6.method765();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ff;Lclient!ff;I)I")
	public static int method1908(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method1042(Static112.aClass61_882, Static113.aClass61_888)) {
			local5++;
		}
		if (arg0.method1042(Static112.aClass61_882, Static109.aClass61_841)) {
			local5++;
		}
		if (arg0.method1042(Static112.aClass61_882, Static8.aClass61_77)) {
			local5++;
		}
		if (arg0.method1042(Static112.aClass61_882, Static103.aClass61_805)) {
			local5++;
		}
		if (arg0.method1042(Static112.aClass61_882, Static26.aClass61_180)) {
			local5++;
		}
		if (arg0.method1042(Static112.aClass61_882, Static57.aClass61_445)) {
			local5++;
		}
		arg0.method1042(Static112.aClass61_882, Static77.aClass61_588);
		arg0.method1042(Static112.aClass61_882, Static133.aClass61_1095);
		arg0.method1042(Static112.aClass61_882, Static96.aClass61_744);
		arg0.method1042(Static112.aClass61_882, Static117.aClass61_933);
		arg0.method1042(Static112.aClass61_882, Static108.aClass61_33);
		return local5;
	}
}

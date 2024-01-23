import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "Lclient!hc;")
	public static Class51 aClass51_70;

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "Lclient!hc;")
	public static Class51 aClass51_71;

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "[I")
	public static int[] anIntArray382;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Lclient!lc;")
	public static Class79 aClass79_32 = new Class79(64);

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "Lclient!lc;")
	public static Class79 aClass79_33 = new Class79(50);

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString338 = "slide:";

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method3556(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static240.aClass147_1);
		arg0.removeFocusListener(Static240.aClass147_1);
		Static12.anInt503 = -1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ql;B)Ljava/lang/String;")
	public static String method3558(@OriginalArg(0) Class1_Sub13 arg0) {
		return Static76.method1502(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIJ[I)Ljava/lang/String;")
	public static String method3559(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (Static91.anInterface2_1 != null) {
			@Pc(17) String local17 = Static91.anInterface2_1.method1255(arg0, arg1, arg2);
			if (local17 != null) {
				return local17;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
	public static void method3560() {
		Static182.aClass79_28.method2489();
	}
}

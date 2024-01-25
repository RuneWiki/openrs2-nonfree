import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static154 {

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "[I")
	public static int[] anIntArray135;

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString84 = null;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[200];

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_115 = new Class123(38, 6);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method2855(@OriginalArg(0) Class31 arg0) {
		if (Static582.aBoolean697) {
			Static454.method6253(arg0);
		} else {
			Static515.method6938(arg0);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	public static void method2856(@OriginalArg(0) int arg0) {
		Static190.anInt4120 = arg0;
	}
}

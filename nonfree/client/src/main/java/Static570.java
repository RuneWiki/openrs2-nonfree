import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static570 {

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "Lclient!wia;")
	public static Class386 aClass386_121;

	@OriginalMember(owner = "client!tfa", name = "j", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_121 = new Class100(73, 8);

	@OriginalMember(owner = "client!tfa", name = "o", descriptor = "[I")
	public static final int[] anIntArray711 = new int[13];

	@OriginalMember(owner = "client!tfa", name = "q", descriptor = "I")
	public static int anInt9823 = 0;

	@OriginalMember(owner = "client!tfa", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[200];

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "(II)Z")
	public static boolean method8182(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method8184(@OriginalArg(0) Class137 arg0) {
		if (Static575.aBoolean699) {
			Static493.method7316(arg0);
		} else {
			Static311.method4971(arg0);
		}
	}
}

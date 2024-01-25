import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static124 {

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!bo;")
	public static Class30 aClass30_3;

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
	public static int anInt2297;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "[Lclient!kg;")
	public static final Class116[] aClass116Array1 = new Class116[6];

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
	public static int anInt2296 = -1;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "[S")
	public static final short[] aShortArray50 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "[I")
	public static final int[] anIntArray164 = new int[13];

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_47 = new Class117("Hidden", "Versteckt", "Caché", "Oculto");

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!ms;I)V")
	public static void method1907(@OriginalArg(1) int arg0, @OriginalArg(2) Class137 arg1, @OriginalArg(3) int arg2) {
		if (Static45.aClass137_4 != null || Static38.aBoolean40 || (arg1 == null || Static32.method458(arg1) == null)) {
			return;
		}
		Static45.aClass137_4 = arg1;
		Static42.aClass137_3 = Static32.method458(arg1);
		Static131.aBoolean156 = false;
		Static226.anInt4573 = 0;
		Static91.anInt1787 = arg2;
		Static325.anInt1278 = arg0;
	}
}

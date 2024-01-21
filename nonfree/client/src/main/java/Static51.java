import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "[Lclient!kh;")
	public static final Class52_Sub1[] aClass52_Sub1Array1 = new Class52_Sub1[256];

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_500 = Static193.method3027(" weitere Optionen");

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_503 = Static193.method3027("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "Lclient!oc;")
	public static Class70 aClass70_501 = aClass70_503;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_502 = Static193.method3027("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIB)V")
	public static void method787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(17) Class3_Sub7 local17 = (Class3_Sub7) Static145.aClass40_10.method1029((long) arg2);
		if (local17 == null) {
			local17 = new Class3_Sub7();
			Static145.aClass40_10.method1027(local17, (long) arg2);
		}
		if (arg0 >= local17.anIntArray61.length) {
			@Pc(43) int[] local43 = new int[arg0 + 1];
			@Pc(48) int[] local48 = new int[arg0 + 1];
			for (@Pc(50) int local50 = 0; local50 < local17.anIntArray61.length; local50++) {
				local43[local50] = local17.anIntArray61[local50];
				local48[local50] = local17.anIntArray62[local50];
			}
			for (@Pc(76) int local76 = local17.anIntArray61.length; local76 < arg0; local76++) {
				local43[local76] = -1;
				local48[local76] = 0;
			}
			local17.anIntArray62 = local48;
			local17.anIntArray61 = local43;
		}
		local17.anIntArray61[arg0] = arg3;
		local17.anIntArray62[arg0] = arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!ue;")
	public static Class85 aClass85_1;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!am;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray78;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_68 = new Class205(43, 3);

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
	public static int anInt3026 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIB)V")
	public static void method2841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class119 local14 = Static252.aClass119ArrayArray1[arg0][arg1];
		Static67.method1055(local14 == null ? Static79.aClass119_6 : local14, 5000);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I")
	public static int method2842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(11) int local11 = 255 - local7;
		@Pc(37) int local37 = ((arg1 & 0xFF00) * local7 & 0xFF0000 | local7 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return ((local11 * (arg0 & 0xFF00) & 0xFF0000 | local11 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local37;
	}
}

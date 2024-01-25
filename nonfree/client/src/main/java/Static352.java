import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "Lclient!he;")
	public static Class100 aClass100_71;

	@OriginalMember(owner = "client!ru", name = "t", descriptor = "Lclient!wg;")
	public static Class2 aClass2_2;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "[I")
	public static final int[] anIntArray404 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ru", name = "o", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_123 = new Class92(37, 0);

	@OriginalMember(owner = "client!ru", name = "v", descriptor = "Lclient!um;")
	public static final Class244 aClass244_39 = new Class244();

	@OriginalMember(owner = "client!ru", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[100];

	@OriginalMember(owner = "client!ru", name = "x", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_326 = new Class123(32, 8);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IBI)V")
	public static void method5247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class219 local9 = Static418.aClass219ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static132.anInt2821 = local9.anInt6306;
			Static214.anInt3919 = local9.anInt6305;
			Static214.anInt3920 = local9.anInt6313;
		}
		Static232.method3568();
	}
}

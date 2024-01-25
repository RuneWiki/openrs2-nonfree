import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!et", name = "o", descriptor = "I")
	public static int anInt1814;

	@OriginalMember(owner = "client!et", name = "f", descriptor = "[I")
	public static final int[] anIntArray86 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!et", name = "j", descriptor = "Lclient!la;")
	public static final Class136 aClass136_50 = new Class136(73, 7);

	@OriginalMember(owner = "client!et", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[8];

	@OriginalMember(owner = "client!et", name = "p", descriptor = "[I")
	public static final int[] anIntArray89 = new int[8];

	@OriginalMember(owner = "client!et", name = "q", descriptor = "I")
	public static int anInt1815 = 0;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BII)V")
	public static void method1682(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class57 local9 = Static76.aClass57ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static18.anInt306 = local9.anInt1586;
			Static246.anInt4232 = local9.anInt1589;
			Static372.anInt6318 = local9.anInt1581;
		}
		Static296.method4218();
	}
}

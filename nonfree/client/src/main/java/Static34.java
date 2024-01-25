import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	public static int anInt599;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "Lclient!tq;")
	public static Class191 aClass191_20;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[I")
	public static int[] anIntArray42;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!c", name = "o", descriptor = "I")
	public static int anInt601 = 0;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)Lclient!le;")
	public static Class117 method802() {
		try {
			return (Class117) Class.forName("Class117_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V")
	public static void method804(@OriginalArg(0) int arg0) {
		if (Static265.method5886(arg0)) {
			Static118.method4597(Static265.aClass146ArrayArray41[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method805() {
		@Pc(1) Class119 local1 = Static282.aClass119_171;
		synchronized (Static282.aClass119_171) {
			Static282.aClass119_171.method3304();
		}
		local1 = Static296.aClass119_182;
		synchronized (Static296.aClass119_182) {
			Static296.aClass119_182.method3304();
		}
		local1 = Static290.aClass119_174;
		synchronized (Static290.aClass119_174) {
			Static290.aClass119_174.method3304();
		}
	}
}

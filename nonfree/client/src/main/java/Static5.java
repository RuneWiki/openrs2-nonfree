import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "p", descriptor = "I")
	public static int anInt190;

	@OriginalMember(owner = "client!af", name = "w", descriptor = "I")
	public static int anInt194;

	@OriginalMember(owner = "client!af", name = "z", descriptor = "Lclient!pl;")
	public static Class162 aClass162_1;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "Lclient!lf;")
	public static Class121 aClass121_1 = null;

	@OriginalMember(owner = "client!af", name = "x", descriptor = "Lclient!dq;")
	public static final Class38 aClass38_1 = new Class38(16);

	@OriginalMember(owner = "client!af", name = "y", descriptor = "[I")
	public static final int[] anIntArray20 = new int[13];

	@OriginalMember(owner = "client!af", name = "A", descriptor = "[I")
	public static final int[] anIntArray21 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	public static void method272(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static85.anInt1913 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
	public static void method273() {
		Static29.aClass21_28.method851();
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
	public static void method274() {
		@Pc(5) Class21 local5 = Static10.aClass21_10;
		synchronized (Static10.aClass21_10) {
			Static10.aClass21_10.method844(5);
		}
	}
}

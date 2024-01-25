import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
	public static int anInt4790;

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
	public static int anInt4791;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_107 = new Class205(83, 5);

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "[I")
	public static final int[] anIntArray924 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_108 = new Class205(87, 12);

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "Z")
	public static boolean aBoolean359 = true;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V")
	public static void method4212(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub10_Sub2 local14 = Static217.method3611(arg0, 14);
		local14.method859();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)Z")
	public static boolean method4219() {
		return Static17.aClass117_1 != Static141.aClass117_7 || Static303.anInt5133 >= 2;
	}
}

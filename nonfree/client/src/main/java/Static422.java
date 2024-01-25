import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray53;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
	public static int anInt7721;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
	public static int anInt7718 = -1;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "[I")
	public static final int[] anIntArray469 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "[I")
	public static final int[] anIntArray470 = new int[3];

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!k;B)V")
	public static void method6626(@OriginalArg(0) Class6_Sub2_Sub12 arg0) {
		arg0.method8754();
		@Pc(10) boolean local10 = false;
		for (@Pc(23) Class6_Sub2_Sub12 local23 = (Class6_Sub2_Sub12) Static603.aClass286_12.method7242(); local23 != null; local23 = (Class6_Sub2_Sub12) Static603.aClass286_12.method7241()) {
			if (Static144.method2331(arg0.method4847(), local23.method4847())) {
				local10 = true;
				Static380.method1535(local23, arg0);
				break;
			}
		}
		if (!local10) {
			Static603.aClass286_12.method7239(arg0);
		}
	}
}

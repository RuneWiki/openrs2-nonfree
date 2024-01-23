import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!de", name = "K", descriptor = "[I")
	public static int[] anIntArray97;

	@OriginalMember(owner = "client!de", name = "M", descriptor = "[[Lclient!tk;")
	public static Class1_Sub32[][] aClass1_Sub32ArrayArray1;

	@OriginalMember(owner = "client!de", name = "L", descriptor = "I")
	public static int anInt1074 = 0;

	@OriginalMember(owner = "client!de", name = "N", descriptor = "I")
	public static int anInt1075 = 0;

	@OriginalMember(owner = "client!de", name = "O", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(II)V")
	public static void method887(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub33 local6 = (Class1_Sub33) Static160.aClass70_9.method2075((long) arg0);
		if (local6 != null) {
			local6.method4441();
		}
	}
}

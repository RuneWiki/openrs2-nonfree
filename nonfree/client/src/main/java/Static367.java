import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static367 {

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "[Lclient!kv;")
	public static Class154[] aClass154Array1;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "[I")
	public static final int[] anIntArray476 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "[I")
	public static final int[] anIntArray477 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
	public static final int anInt6054 = 205;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "[I")
	public static final int[] anIntArray478 = new int[64];

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "[Lclient!wg;")
	public static final Class8_Sub3_Sub1_Sub2[] aClass8_Sub3_Sub1_Sub2Array1 = new Class8_Sub3_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_225 = new Class56(22, -2);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!tf;I)V")
	public static void method4860(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub9_Sub2 arg1) {
		Static273.aBoolean338 = false;
		Static176.anInt3194 = 0;
		Static127.method1768(arg1);
		Static423.method5697(arg1);
		if (Static273.aBoolean338) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt6207) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt6207 + " psize:" + arg0);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "[I")
	public static int[] anIntArray395;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Lclient!paa;")
	public static Class261 aClass261_7 = null;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
	public static int anInt5497 = 0;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_57 = new Class32(4);

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "[I")
	public static final int[] anIntArray394 = new int[14];

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	public static void method4709() {
		Static491.aClass61_27 = null;
		Static121.aClass61_4 = null;
		Static167.aClass61_5 = null;
		Static375.aClass61_18 = null;
		Static553.aClass61_33 = null;
		Static140.aClass61Array4 = null;
		Static264.aClass61_17 = null;
		Static169.aClass61_6 = null;
		Static613.aClass61_34 = null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
	public static void method4710(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static45.method738(arg0.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method4713(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static653.method5398(arg0, 0, local6, 0, arg1);
		return local6;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "F")
	public static float aFloat43;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "[I")
	public static int[] anIntArray369;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "[I")
	public static int[] anIntArray370;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	public static int anInt4264;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
	public static int anInt4265 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public static void method3117(@OriginalArg(0) int arg0) {
		Static180.method2911(Static180.anInt3946, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static180.method2903(-50.0F, -60.0F, -50.0F);
		Static180.method2905(Static180.anInt3944, 0, false);
		Static180.method2910();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[B)Z")
	public static boolean method3118(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(arg0);
		@Pc(12) int local12 = local8.method2199();
		if (local12 != 1) {
			return false;
		}
		@Pc(34) boolean local34 = local8.method2199() == 1;
		if (local34) {
			Static102.method722(local8);
		}
		Static280.method4270(local8);
		return true;
	}
}

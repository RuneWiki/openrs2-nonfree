import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!nn", name = "B", descriptor = "Lclient!qn;")
	public static Class211 aClass211_65;

	@OriginalMember(owner = "client!nn", name = "A", descriptor = "[I")
	public static final int[] anIntArray365 = new int[1];

	@OriginalMember(owner = "client!nn", name = "C", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_161 = new Class56(18, -1);

	@OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
	public static int anInt4434 = -1;

	@OriginalMember(owner = "client!nn", name = "G", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_162 = new Class56(15, 7);

	@OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
	public static int anInt4436 = 0;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BII)Z")
	public static boolean method3533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x10000) != 0 | Static454.method6024(arg0, arg1) || Static184.method2547(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static107.method1597(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(III)V")
	public static void method3534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub2_Sub17 local13 = Static34.method1709(12, arg0);
		local13.method5529();
		local13.anInt6873 = arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
	public static int anInt3278;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "Lclient!ua;")
	public static Class292 aClass292_2;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_45 = new Class45(24, -2);

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "[I")
	public static final int[] anIntArray244 = new int[14];

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Z")
	public static boolean aBoolean267 = false;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "[I")
	public static int[] anIntArray245 = new int[2];

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z")
	public static boolean method2947(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II[B)[B")
	public static byte[] method2949(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static554.method3498(arg1, 0, local6, 0, arg0);
		return local6;
	}
}

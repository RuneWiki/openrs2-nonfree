import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!tj;")
	public static Class193 aClass193_54;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!tj;")
	public static Class193 aClass193_55;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_164 = new Class159("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!je", name = "d", descriptor = "I")
	public static int anInt3273 = 0;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray83 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!je", name = "g", descriptor = "I")
	public static int anInt3274 = 0;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "I")
	public static int anInt3275 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([BB)[B")
	public static byte[] method2978(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static359.method761(arg0, 0, local9, 0, local6);
		return local9;
	}
}

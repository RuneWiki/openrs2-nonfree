import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "Lclient!vc;")
	public static Class253 aClass253_1;

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "[I")
	public static int[] anIntArray24;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
	public static int anInt628;

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
	public static int anInt629;

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "[I")
	public static int[] anIntArray25;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "Z")
	public static boolean aBoolean34 = false;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "[Lclient!iq;")
	public static final Interface3[] anInterface3Array1 = new Interface3[128];

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIB)I")
	public static int method608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)V")
	public static void method610(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(8, arg0);
		local8.method1006();
	}
}

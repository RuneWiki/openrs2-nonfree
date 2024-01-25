import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!pba", name = "G", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!pba", name = "F", descriptor = "Z")
	public static boolean aBoolean605 = true;

	@OriginalMember(owner = "client!pba", name = "H", descriptor = "I")
	public static int anInt8139 = 0;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(II)I")
	public static int method7280(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIILclient!pe;II)V")
	public static void method7281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class278 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1 || arg4 < 1 || Static222.anInt4533 - 2 < arg3 || arg4 > Static668.anInt11370 - 2) {
			return;
		}
		if (Static193.aClass291ArrayArrayArray2 == null) {
			return;
		}
		@Pc(42) Interface23 local42 = Static223.aClass29_Sub1_1.method7867(arg1, arg0, arg4, arg3);
		if (local42 == null) {
			return;
		}
		if (local42 instanceof Class15_Sub3_Sub3_Sub2) {
			((Class15_Sub3_Sub3_Sub2) local42).method3535(arg2);
			return;
		}
		if (local42 instanceof Class15_Sub3_Sub5_Sub1) {
			((Class15_Sub3_Sub5_Sub1) local42).method6315(arg2);
			return;
		}
		if (local42 instanceof Class15_Sub3_Sub4_Sub1) {
			((Class15_Sub3_Sub4_Sub1) local42).method3285(arg2);
			return;
		}
		if (local42 instanceof Class15_Sub3_Sub1_Sub2) {
			((Class15_Sub3_Sub1_Sub2) local42).method8415(arg2);
			return;
		}
	}
}

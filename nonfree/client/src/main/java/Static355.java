import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
	public static int anInt6598 = 64;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "[Lclient!cm;")
	public static final Class58_Sub1[] aClass58_Sub1Array2 = new Class58_Sub1[34];

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "[I")
	public static final int[] anIntArray463 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "[I")
	public static final int[] anIntArray464 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)Z")
	public static boolean method5330(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIII)V")
	public static void method5331(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(10, arg2);
		local8.method3256();
		local8.anInt3734 = arg1;
		local8.anInt3740 = arg0;
		local8.anInt3739 = arg3;
	}
}

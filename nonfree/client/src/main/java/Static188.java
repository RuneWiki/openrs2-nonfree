import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	public static int anInt3907;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "[I")
	public static final int[] anIntArray463 = new int[256];

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
	public static void method3644(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static155.method2947(arg0.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method3647() {
		Static13.aClass140_10.method3819();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!ke;II)V")
	public static void method3648(@OriginalArg(1) Class5_Sub3_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt4977 == arg1 && arg1 != -1) {
			@Pc(83) Class121 local83 = Static133.method2520(arg1);
			@Pc(86) int local86 = local83.anInt3780;
			if (local86 == 1) {
				arg0.anInt4936 = arg2;
				arg0.anInt4922 = 0;
				arg0.anInt4957 = 0;
				arg0.anInt4950 = 0;
				arg0.anInt4965 = 1;
				Static131.method2490(Static130.aClass5_Sub3_Sub3_Sub1_1 == arg0, local83, arg0.anInt4950, arg0.anInt5047, arg0.anInt5050);
			}
			if (local86 == 2) {
				arg0.anInt4922 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt4977 == -1 || Static133.method2520(arg1).anInt3772 >= Static133.method2520(arg0.anInt4977).anInt3772) {
			arg0.anInt4977 = arg1;
			arg0.anInt4965 = 1;
			arg0.anInt4984 = arg0.anInt4985;
			arg0.anInt4922 = 0;
			arg0.anInt4957 = 0;
			arg0.anInt4950 = 0;
			arg0.anInt4936 = arg2;
			if (arg0.anInt4977 != -1) {
				Static131.method2490(Static130.aClass5_Sub3_Sub3_Sub1_1 == arg0, Static133.method2520(arg0.anInt4977), arg0.anInt4950, arg0.anInt5047, arg0.anInt5050);
			}
		}
	}
}

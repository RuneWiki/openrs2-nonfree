import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
	public static int anInt1424;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "[Lclient!bl;")
	public static final Class36[] aClass36Array1 = new Class36[6];

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "[I")
	public static final int[] anIntArray120 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "[Lclient!fda;")
	public static Class105[] aClass105Array1 = new Class105[50];

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIBI)V")
	public static void method1115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(arg0, 9);
		local8.method662();
		local8.anInt823 = arg2;
		local8.anInt817 = arg1;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[Ljava/lang/Object;ZI[J)V")
	public static void method1116(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(22) int local22 = (arg2 + arg0) / 2;
		@Pc(24) int local24 = arg0;
		@Pc(28) long local28 = arg3[local22];
		arg3[local22] = arg3[arg2];
		arg3[arg2] = local28;
		@Pc(42) Object local42 = arg1[local22];
		arg1[local22] = arg1[arg2];
		arg1[arg2] = local42;
		@Pc(60) int local60 = local28 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg0; local62 < arg2; local62++) {
			if (local28 + (long) (local60 & local62) > arg3[local62]) {
				@Pc(79) long local79 = arg3[local62];
				arg3[local62] = arg3[local24];
				arg3[local24] = local79;
				@Pc(93) Object local93 = arg1[local62];
				arg1[local62] = arg1[local24];
				arg1[local24++] = local93;
			}
		}
		arg3[arg2] = arg3[local24];
		arg3[local24] = local28;
		arg1[arg2] = arg1[local24];
		arg1[local24] = local42;
		method1116(arg0, arg1, local24 - 1, arg3);
		method1116(local24 + 1, arg1, arg2, arg3);
	}
}

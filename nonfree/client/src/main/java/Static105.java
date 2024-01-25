import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dga", name = "p", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!dga", name = "s", descriptor = "Lclient!vj;")
	public static final Class378 aClass378_5 = new Class378(64);

	@OriginalMember(owner = "client!dga", name = "t", descriptor = "[I")
	public static final int[] anIntArray504 = new int[25];

	@OriginalMember(owner = "client!dga", name = "n", descriptor = "Z")
	public static boolean aBoolean665 = false;

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(IZ)V")
	public static void method8317(@OriginalArg(0) int arg0) {
		if (Static318.anIntArray311 == null || Static318.anIntArray311.length < arg0) {
			Static318.anIntArray311 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IBIIIII)I")
	public static int method8319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg0 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(21) int local21 = arg3;
			arg3 = arg4;
			arg4 = local21;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1 + 7 - arg3 - arg2;
		} else if (local3 == 2) {
			return 7 + 1 - arg1 - arg4;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIII)V")
	public static void method8321(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class14_Sub2_Sub9 local11 = Static499.method7527((long) arg0, 9);
		local11.method4004();
		local11.anInt4592 = arg2;
		local11.anInt4595 = arg1;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZZZILclient!ha;)Lclient!da;")
	public static Class68 method8322(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class144 arg3) {
		@Pc(16) Class272 local16 = Static613.method8648(arg3, arg1, arg2, arg0);
		return local16 == null ? null : local16.aClass68_7;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IBZ)V")
	public static void method8323(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class14_Sub14 local8 = Static495.method7455(arg0, arg1);
		if (local8 != null) {
			local8.method9513();
		}
	}
}

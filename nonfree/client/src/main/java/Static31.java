import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
	public static int anInt593;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "[I")
	public static final int[] anIntArray53 = new int[3];

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!pm;IIILclient!za;)V")
	public static void method461(@OriginalArg(1) Class192 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class163 arg4) {
		@Pc(11) Class165 local11 = Static70.aClass97_1.method2130(arg0.anInt5328);
		if (local11.anInt4279 == -1) {
			return;
		}
		if (arg0.aBoolean393) {
			@Pc(29) int local29 = arg2 + arg0.anInt5335;
			arg2 = local29 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(41) Class13 local41 = local11.method3504(arg2, arg0.aBoolean399, arg4);
		if (local41 == null) {
			return;
		}
		@Pc(47) int local47 = arg0.anInt5321;
		@Pc(50) int local50 = arg0.anInt5355;
		if ((arg2 & 0x1) == 1) {
			local47 = arg0.anInt5355;
			local50 = arg0.anInt5321;
		}
		@Pc(64) int local64 = local41.RA();
		@Pc(67) int local67 = local41.Q();
		if (local11.aBoolean305) {
			local64 = local47 * 4;
			local67 = local50 * 4;
		}
		if (local11.anInt4273 == 0) {
			local41.method5665(arg1, arg3 - (local50 - 1) * 4, local64, local67);
		} else {
			local41.ya(arg1, arg3 - (local50 - 1) * 4, local64, local67, 0, local11.anInt4273 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ql;)V")
	public static void method463(@OriginalArg(1) Class21_Sub6 arg0) {
		arg0.aClass3_1 = null;
		@Pc(12) int local12 = arg0.aClass21_Sub7Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass21_Sub7Array1[local14].aBoolean436 = false;
		}
		@Pc(32) Class93[] local32 = Class7_Sub1.aClass93Array1;
		synchronized (Class7_Sub1.aClass93Array1) {
			if (Class7_Sub1.aClass93Array1.length > local12 && Static309.anIntArray435[local12] < 200) {
				Class7_Sub1.aClass93Array1[local12].method2079(arg0);
				@Pc(55) int local55 = Static309.anIntArray435[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
	public static void method465() {
		Static352.method4678(Static289.anInt4757);
	}
}

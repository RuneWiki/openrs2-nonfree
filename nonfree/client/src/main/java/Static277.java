import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!oh;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	public static int anInt5091;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "[Lclient!oh;")
	public static Class57[] aClass57Array5;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	public static int anInt5089 = 128;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V")
	public static void method4240(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub5_Sub21 local16 = Static278.method4266(2, arg0);
		local16.method4064();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)J")
	public static long method4241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass124_1 == null ? 0L : local7.aClass124_1.aLong143;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method4242() {
		if (Static28.aBoolean56) {
			return;
		}
		if (Static240.aBoolean404) {
			Static148.aFloat64 = (int) Static148.aFloat64 - 65 & 0xFFFFFF80;
		} else {
			Static273.aFloat91 += (-Static273.aFloat91 - 24.0F) / 2.0F;
		}
		Static28.aBoolean56 = true;
		Static167.aBoolean68 = true;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([I[JZII)V")
	public static void method4244(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(22) int local22 = (arg2 + arg3) / 2;
		@Pc(24) int local24 = arg2;
		@Pc(28) long local28 = arg1[local22];
		arg1[local22] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(42) int local42 = arg0[local22];
		arg0[local22] = arg0[arg3];
		arg0[arg3] = local42;
		for (@Pc(54) int local54 = arg2; local54 < arg3; local54++) {
			if (arg1[local54] < (long) (local54 & 0x1) + local28) {
				@Pc(72) long local72 = arg1[local54];
				arg1[local54] = arg1[local24];
				arg1[local24] = local72;
				@Pc(86) int local86 = arg0[local54];
				arg0[local54] = arg0[local24];
				arg0[local24++] = local86;
			}
		}
		arg1[arg3] = arg1[local24];
		arg1[local24] = local28;
		arg0[arg3] = arg0[local24];
		arg0[local24] = local42;
		method4244(arg0, arg1, arg2, local24 - 1);
		method4244(arg0, arg1, local24 + 1, arg3);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V")
	public static void method4245(@OriginalArg(1) int arg0) {
		if (!Static19.method322(arg0)) {
			return;
		}
		@Pc(14) Class157[] local14 = Static176.aClass157ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(28) Class157 local28 = local14[local16];
			if (local28 != null) {
				local28.anInt4714 = 0;
				local28.anInt4724 = 1;
				local28.anInt4732 = 0;
			}
		}
	}
}

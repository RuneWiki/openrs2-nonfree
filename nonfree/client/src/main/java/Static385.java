import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!th", name = "E", descriptor = "Z")
	public static boolean aBoolean406 = false;

	@OriginalMember(owner = "client!th", name = "N", descriptor = "I")
	public static int anInt6209 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([J[Ljava/lang/Object;III)V")
	public static void method4934(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg2 + arg3) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) long local24 = arg0[local18];
		arg0[local18] = arg0[arg2];
		arg0[arg2] = local24;
		@Pc(38) Object local38 = arg1[local18];
		arg1[local18] = arg1[arg2];
		arg1[arg2] = local38;
		@Pc(56) int local56 = local24 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg3; local58 < arg2; local58++) {
			if (arg0[local58] < local24 + (long) (local58 & local56)) {
				@Pc(80) long local80 = arg0[local58];
				arg0[local58] = arg0[local20];
				arg0[local20] = local80;
				@Pc(94) Object local94 = arg1[local58];
				arg1[local58] = arg1[local20];
				arg1[local20++] = local94;
			}
		}
		arg0[arg2] = arg0[local20];
		arg0[local20] = local24;
		arg1[arg2] = arg1[local20];
		arg1[local20] = local38;
		method4934(arg0, arg1, local20 - 1, arg3);
		method4934(arg0, arg1, arg2, local20 + 1);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!vi;BIIB)V")
	public static void method4935(@OriginalArg(0) Class26_Sub2_Sub4_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray603[0];
		@Pc(15) int local15 = arg0.anIntArray604[0];
		if (local10 < 0 || local10 >= Static333.anInt3375 || local15 < 0 || Static102.anInt2086 <= local15 || (arg1 < 0 || arg1 >= Static333.anInt3375 || arg2 < 0 || Static102.anInt2086 <= arg2)) {
			return;
		}
		@Pc(66) int local66 = Static46.method607(arg0.method5512(), local10, Static100.anIntArray134, 0, arg2, Static230.anIntArray348, -4, true, 0, 0, Static179.aClass70Array3[arg0.aByte102], local15, 0, arg1);
		if (local66 >= 1 && local66 <= 3) {
			for (@Pc(86) int local86 = 0; local86 < local66 - 1; local86++) {
				arg0.method5524(Static100.anIntArray134[local86], (byte) 2, Static230.anIntArray348[local86]);
			}
		}
	}
}

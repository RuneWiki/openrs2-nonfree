import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Lclient!ck;")
	public static Class56 aClass56_3;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "Lclient!bv;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Z")
	public static boolean aBoolean258 = false;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Z")
	public static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "[I")
	public static final int[] anIntArray305 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
	public static int anInt3278 = 0;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZIB)V")
	public static void method3009(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static64.anInt1206 = arg1;
		Static140.anInt3152 = 3;
		Static132.method2774(Static191.aClass300_9.aString89, Static191.aClass300_9.anInt7993);
		if (arg0) {
			Static108.method2316("", false, "");
		} else {
			Static282.method4470();
			Static108.method2316(Static40.aString12, false, Static240.aString58);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method3010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class100 local7 = Static309.aClass100ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class35 local13 = local7.aClass35_2; local13 != null; local13 = local13.aClass35_1) {
			@Pc(17) Class10_Sub1 local17 = local13.aClass10_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort116 == arg1 && local17.aShort117 == arg2) {
				Static182.method3381(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIB[B[BII)V")
	public static void method3012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(18) int local18 = -arg0; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg3++;
				arg4[local26] += arg5[arg7++];
				@Pc(38) int local38 = arg3++;
				arg4[local38] += arg5[arg7++];
				@Pc(50) int local50 = arg3++;
				arg4[local50] += arg5[arg7++];
				@Pc(62) int local62 = arg3++;
				arg4[local62] += arg5[arg7++];
			}
			for (@Pc(80) int local80 = local15; local80 < 0; local80++) {
				local26 = arg3++;
				arg4[local26] += arg5[arg7++];
			}
			arg3 += arg6;
			arg7 += arg2;
		}
	}
}

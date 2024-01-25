import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "Lclient!qw;")
	public static Class3_Sub38 aClass3_Sub38_2;

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "Lclient!la;")
	public static final Class136 aClass136_160 = new Class136(71, 6);

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "Z")
	public static boolean aBoolean409 = false;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIILjava/lang/String;Lclient!i;Lclient!ga;ILclient!ba;Lclient!ju;III)V")
	public static void method4832(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class14 arg3, @OriginalArg(5) Class82 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class18 arg6, @OriginalArg(8) Class124 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(15) int local15;
		if (Static27.anInt490 == 4) {
			local15 = (int) Static19.aFloat6 & 0x3FFF;
		} else {
			local15 = Static139.anInt2475 + (int) Static19.aFloat6 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg4.anInt2192 / 2, arg4.anInt2216 / 2) + 10;
		@Pc(42) int local42 = arg10 * arg10 + arg1 * arg1;
		if (local34 * local34 < local42) {
			return;
		}
		@Pc(52) int local52 = Class65.anIntArray88[local15];
		@Pc(56) int local56 = Class65.anIntArray87[local15];
		if (Static27.anInt490 != 4) {
			local52 = local52 * 256 / (Static197.anInt3551 + 256);
			local56 = local56 * 256 / (Static197.anInt3551 + 256);
		}
		@Pc(88) int local88 = arg10 * local52 + arg1 * local56 >> 15;
		@Pc(99) int local99 = local56 * arg10 - local52 * arg1 >> 15;
		@Pc(106) int local106 = arg7.method3097(null, arg2, 100);
		@Pc(114) int local114 = arg7.method3091(arg2, null);
		@Pc(120) int local120 = local88 - local106 / 2;
		if (-arg4.anInt2192 <= local120 && local120 <= arg4.anInt2192 && -arg4.anInt2216 <= local99 && arg4.anInt2216 >= local99) {
			arg6.method5175(50, arg9, arg2, arg3, 0, arg8 + local120 + arg4.anInt2192 / 2, 0, null, local106, null, arg0, arg4.anInt2216 / 2 + arg0 - local99 - arg5 - local114, arg8);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Lclient!ew;")
	public static Class3_Sub3_Sub8 method4833(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub3_Sub8 local12 = (Class3_Sub3_Sub8) Static248.aClass85_6.method2040((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static317.aClass250_79.method5806(arg0, 0);
		if (local22 == null || local22.length <= 1) {
			return null;
		} else {
			local12 = Static360.method5046(local22);
			Static248.aClass85_6.method2039(local12, (long) arg0);
			return local12;
		}
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V")
	public static void method4834() {
		Static96.aClass140_16.method3488();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "[B")
	public static final byte[] aByteArray31 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
	public static int anInt2862 = -1;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!vp;III)V")
	public static void method2669(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static279.aClass309_6 != null || Static25.aBoolean94 || (arg0 == null || Static226.method3961(arg0) == null)) {
			return;
		}
		Static279.aClass309_6 = arg0;
		Static395.aClass309_9 = Static226.method3961(arg0);
		Static120.anInt2882 = arg2;
		Static106.anInt2480 = arg1;
		Static184.anInt3931 = 0;
		Static102.aBoolean173 = false;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method2670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class206 local7 = Static313.aClass206ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class168 local13 = local7.aClass168_2; local13 != null; local13 = local13.aClass168_1) {
			@Pc(17) Class47_Sub2 local17 = local13.aClass47_Sub2_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort115 == arg1 && local17.aShort117 == arg2) {
				Static211.method3827(local17);
				return;
			}
		}
	}
}

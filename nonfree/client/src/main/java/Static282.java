import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!nk;")
	public static Class121 aClass121_125;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
	public static int anInt5096;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
	public static int anInt5092 = 0;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "Lclient!qj;")
	public static Class148 aClass148_13 = new Class148(64);

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "Z")
	public static boolean aBoolean348 = false;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString302 = " has logged in.";

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "[I")
	public static int[] anIntArray456 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(JI)V")
	public static void method4345(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static131.method2238(arg0 - 1L);
			Static131.method2238(1L);
		} else {
			Static131.method2238(arg0);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZIILclient!tb;II)Lclient!pa;")
	public static Class1_Sub2_Sub1 method4347(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class167 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = arg2 + (arg1 ? 65536 : 0) + (arg5 << 17) + (arg4 << 19);
		@Pc(33) long local33 = (long) arg0 * 3147483667L + (long) local22 * 3849834839L;
		@Pc(41) Class1_Sub2_Sub1 local41 = (Class1_Sub2_Sub1) Static226.aClass187_114.method4527(local33);
		if (local41 != null) {
			return local41;
		}
		Static215.aBoolean275 = false;
		local41 = Static66.method3664(arg1, arg2, arg4, arg0, false, false, arg3, arg5);
		if (local41 != null && !Static215.aBoolean275) {
			Static226.aClass187_114.method4524(local33, local41);
		}
		return local41;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)V")
	public static void method4348(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static109.aFloat131 = 3.0F;
		} else if (arg0 == 50) {
			Static109.aFloat131 = 4.0F;
		} else if (arg0 == 75) {
			Static109.aFloat131 = 6.0F;
		} else if (arg0 == 100) {
			Static109.aFloat131 = 8.0F;
		} else if (arg0 == 200) {
			Static109.aFloat131 = 16.0F;
		}
		Static132.anInt3684 = -1;
		Static132.anInt3684 = -1;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V")
	public static void method4349(@OriginalArg(1) int arg0) {
		if (Static182.anInt3489 == arg0) {
			@Pc(21) Interface4 local21 = Static94.anInterface4Array3[arg0];
			local21.method4406(Static73.anInt1540);
		}
	}
}

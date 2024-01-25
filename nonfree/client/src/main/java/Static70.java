import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cea", name = "H", descriptor = "I")
	public static int anInt1336;

	@OriginalMember(owner = "client!cea", name = "K", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!cea", name = "P", descriptor = "[I")
	public static int[] anIntArray71;

	@OriginalMember(owner = "client!cea", name = "F", descriptor = "Z")
	public static boolean aBoolean70 = true;

	@OriginalMember(owner = "client!cea", name = "M", descriptor = "Lclient!cw;")
	public static final Class59 aClass59_5 = new Class59();

	@OriginalMember(owner = "client!cea", name = "Q", descriptor = "I")
	public static int anInt1340 = 0;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)V")
	public static void method1231(@OriginalArg(1) int arg0) {
		Static560.aLong44 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIII)I")
	public static int method1233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static90.aByteArrayArrayArray2[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static90.aByteArrayArrayArray2[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZIIII[Lclient!sha;)V")
	public static void method1235(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class321[] arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg4.length; local7++) {
			@Pc(18) Class321 local18 = arg4[local7];
			if (local18 != null && arg2 == local18.anInt9033) {
				Static49.method967(arg0, local18, arg1, arg3);
				Static505.method7218(local18, arg3, arg1);
				if (local18.anInt9075 - local18.anInt9103 < local18.anInt9102) {
					local18.anInt9102 = local18.anInt9075 - local18.anInt9103;
				}
				if (local18.anInt9102 < 0) {
					local18.anInt9102 = 0;
				}
				if (local18.anInt9067 > local18.anInt9024 - local18.anInt9077) {
					local18.anInt9067 = local18.anInt9024 - local18.anInt9077;
				}
				if (local18.anInt9067 < 0) {
					local18.anInt9067 = 0;
				}
				if (local18.anInt9105 == 0) {
					Static351.method5107(local18, arg0);
				}
			}
		}
	}
}

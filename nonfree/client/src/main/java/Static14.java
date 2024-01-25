import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!al", name = "t", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!al", name = "F", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!al", name = "H", descriptor = "[I")
	public static final int[] anIntArray25 = new int[2];

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method216(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!ur;I)V")
	public static void method219(@OriginalArg(0) Class322 arg0) {
		Static278.aClass322_5 = arg0;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Lclient!ch;")
	public static Class6_Sub1_Sub5 method220() {
		@Pc(13) Class6_Sub1_Sub5 local13 = (Class6_Sub1_Sub5) Static433.aClass144_13.method3116();
		if (local13 != null) {
			local13.method7849();
			local13.method7852();
			return local13;
		}
		do {
			local13 = (Class6_Sub1_Sub5) Static19.aClass144_7.method3116();
			if (local13 == null) {
				return null;
			}
			if (local13.method772() > Static137.method2058()) {
				return null;
			}
			local13.method7849();
			local13.method7852();
		} while ((Long.MIN_VALUE & local13.aLong250) == 0L);
		return local13;
	}
}

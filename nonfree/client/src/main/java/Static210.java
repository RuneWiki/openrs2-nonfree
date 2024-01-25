import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!gha", name = "m", descriptor = "[I")
	public static final int[] anIntArray191 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!gha", name = "n", descriptor = "Z")
	public static boolean aBoolean295 = false;

	@OriginalMember(owner = "client!gha", name = "k", descriptor = "I")
	public static int anInt3647 = 1;

	@OriginalMember(owner = "client!gha", name = "o", descriptor = "Z")
	public static boolean aBoolean296 = false;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IILclient!dr;)Z")
	public static boolean method3118(@OriginalArg(1) int arg0, @OriginalArg(2) Class79 arg1) {
		Static512.aClass181_11.method6360(arg1.anIntArray116[arg0], arg1.anIntArray118[arg0], arg1.anIntArray117[arg0], Static193.anIntArray174);
		@Pc(30) int local30 = Static193.anIntArray174[2];
		if (local30 < 50) {
			return false;
		} else {
			arg1.aShortArray38[arg0] = (short) (Static74.anInt1138 + Static432.anInt7597 * Static193.anIntArray174[0] / local30);
			arg1.aShortArray36[arg0] = (short) (Static58.anInt920 + Static193.anIntArray174[1] * Static372.anInt6367 / local30);
			arg1.aShortArray37[arg0] = (short) local30;
			return true;
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method3120(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		} else if (arg0 && arg1 >= 0) {
			@Pc(53) int local53 = 2;
			@Pc(57) int local57 = arg1 / 10;
			while (local57 != 0) {
				local57 /= 10;
				local53++;
			}
			@Pc(69) char[] local69 = new char[local53];
			local69[0] = '+';
			for (@Pc(77) int local77 = local53 - 1; local77 > 0; local77--) {
				@Pc(83) int local83 = arg1;
				arg1 /= 10;
				@Pc(94) int local94 = local83 - arg1 * 10;
				if (local94 >= 10) {
					local69[local77] = (char) (local94 + 87);
				} else {
					local69[local77] = (char) (local94 + 48);
				}
			}
			return new String(local69);
		} else {
			return Integer.toString(arg1, 10);
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IB)V")
	public static void method3121(@OriginalArg(0) int arg0) {
		@Pc(17) Class3_Sub4_Sub2 local17 = Static502.method7211(8, (long) arg0);
		local17.method627();
	}
}

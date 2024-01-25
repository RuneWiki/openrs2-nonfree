import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!rl", name = "M", descriptor = "Lclient!l;")
	public static Class17 aClass17_45;

	@OriginalMember(owner = "client!rl", name = "G", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!rl", name = "L", descriptor = "Z")
	public static boolean aBoolean419 = false;

	@OriginalMember(owner = "client!rl", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!rl", name = "Q", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_134 = new Class265(90, 8);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIII)V")
	public static void method4765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static12.aClass79_Sub1_1.anInt4920 != 0 && arg1 != 0 && Static66.anInt133 < 50 && arg0 != -1) {
			Static62.aClass218Array1[Static66.anInt133++] = new Class218((byte) 1, arg0, arg1, arg2, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIZIIIII)Z")
	public static boolean method4766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray525[0];
		@Pc(18) int local18 = Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray524[0];
		if (local13 < 0 || Static229.anInt4427 <= local13 || local18 < 0 || local18 >= Static379.anInt6422) {
			return false;
		} else if (arg7 >= 0 && Static229.anInt4427 > arg7 && arg5 >= 0 && arg5 < Static379.anInt6422) {
			@Pc(77) int local77 = Static343.method4718(arg2, Static411.anIntArray583, Static375.aClass3_Sub2_Sub1_Sub2_7.method4935(), Static194.aClass70Array1[Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89], arg6, arg1, local13, arg0, arg5, arg4, arg3, arg7, Static77.anIntArray145, local18);
			if (local77 < 1) {
				return false;
			}
			Static66.anInt134 = Static77.anIntArray145[local77 - 1];
			Static220.anInt4265 = Static411.anIntArray583[local77 - 1];
			Static11.aBoolean11 = false;
			Static141.method2387();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method4767(@OriginalArg(1) String arg0) {
		@Pc(12) long local12 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local12 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local12 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local12 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local12 += local27 + 27 - 48;
			}
			if (local12 >= 177917621779460413L) {
				break;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}
}

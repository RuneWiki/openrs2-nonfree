import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!re", name = "s", descriptor = "[I")
	public static int[] anIntArray384;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "[Lclient!dc;")
	public static final Class46[] aClass46Array2 = new Class46[14];

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)I")
	public static int method4748(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIB)Z")
	public static boolean method4750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIIILclient!it;Lclient!it;)V")
	public static void method4752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Class4_Sub2_Sub2 arg5, @OriginalArg(9) Class4_Sub2_Sub2 arg6) {
		@Pc(7) int local7 = arg5.method5125();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class76 local20 = (Class76) Static190.aClass129_30.method3023((long) local7);
		if (local20 == null) {
			@Pc(27) Class89[] local27 = Static456.method1762(Static351.aClass188_97, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static387.aClass26_9.method2230(local27[0]);
			Static190.aClass129_30.method3029(local20, (long) local7);
		}
		Static1.method1(arg6.anInt7111, arg3 >> 1, 0, arg6.aByte92, arg6.anInt7117, arg6.method5118() * 64, arg4 >> 1);
		@Pc(73) int local73 = Static413.anIntArray483[0] + arg1 - 18;
		@Pc(81) int local81 = local73 + arg2 / 4 * 18;
		@Pc(97) int local97 = arg0 + Static413.anIntArray483[1] - 70;
		@Pc(105) int local105 = local97 + arg2 % 4 * 18;
		local20.method6088(local81, local105);
		if (arg6 == arg5) {
			Static387.aClass26_9.method2278(local81 - 1, 18, local105 - 1, -256, 18);
		}
		@Pc(127) Class38_Sub7 local127 = Static285.method4203();
		local127.anInt5071 = local105 + 16;
		local127.anInt5069 = local81;
		local127.anInt5068 = local81 + 16;
		local127.aClass4_Sub2_Sub2_1 = arg5;
		local127.anInt5070 = local105;
		Static334.aClass184_5.method4207(local127);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIBLclient!em;)V")
	public static void method4753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class68 arg2) {
		Static404.aClass68ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BIILjava/lang/Object;)[B")
	public static byte[] method4755(@OriginalArg(2) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return Static446.method6045(arg0, local18);
		} else if (arg1 instanceof Class142) {
			@Pc(30) Class142 local30 = (Class142) arg1;
			return local30.method3345(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}

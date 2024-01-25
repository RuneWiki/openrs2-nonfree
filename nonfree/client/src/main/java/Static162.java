import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "Lclient!ug;")
	public static Class243 aClass243_1;

	@OriginalMember(owner = "client!hv", name = "v", descriptor = "I")
	public static int anInt2742;

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_68 = new Class211(89, 6);

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([[B[II[BI[[BI[I)I")
	public static int method2263(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg6[arg4];
		@Pc(16) int local16 = local9 + arg1[arg4];
		@Pc(20) int local20 = arg6[arg2];
		@Pc(26) int local26 = arg1[arg2] + local20;
		@Pc(28) int local28 = local9;
		if (local20 > local9) {
			local28 = local20;
		}
		@Pc(35) int local35 = local16;
		if (local26 < local16) {
			local35 = local26;
		}
		@Pc(50) int local50 = arg3[arg4] & 0xFF;
		if ((arg3[arg2] & 0xFF) < local50) {
			local50 = arg3[arg2] & 0xFF;
		}
		@Pc(67) byte[] local67 = arg0[arg4];
		@Pc(71) byte[] local71 = arg5[arg2];
		@Pc(81) int local81 = local28 - local9;
		@Pc(86) int local86 = local28 - local20;
		for (@Pc(88) int local88 = local28; local88 < local35; local88++) {
			@Pc(100) int local100 = local71[local86++] + local67[local81++];
			if (local50 > local100) {
				local50 = local100;
			}
		}
		return -local50;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZI)V")
	public static void method2264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static29.method451(Static456.aClass102_220);
		Static456.aClass2_Sub13_Sub2_2.method3543(arg0);
		Static456.aClass2_Sub13_Sub2_2.method3577(arg1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)V")
	public static void method2268(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static142.anInt2523 != -1) {
				Static184.method2531(Static142.anInt2523);
			}
			for (@Pc(23) Class2_Sub21 local23 = (Class2_Sub21) Static418.aClass72_44.method1655(); local23 != null; local23 = (Class2_Sub21) Static418.aClass72_44.method1649()) {
				if (!local23.method5702()) {
					local23 = (Class2_Sub21) Static418.aClass72_44.method1655();
					if (local23 == null) {
						break;
					}
				}
				Static74.method1091(local23, false, true);
			}
			Static142.anInt2523 = -1;
			Static418.aClass72_44 = new Class72(8);
			Static139.method2048();
			Static142.anInt2523 = Static354.anInt6054;
			Static129.method1930(false);
			Static204.method2721();
			Static191.method2566(Static142.anInt2523);
		}
		Static137.aBoolean469 = true;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!gk;ZZIIILclient!gk;)I")
	public static int method2270(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class65_Sub1 arg5) {
		@Pc(10) int local10 = Static248.method3154(arg2, arg5, arg3, arg0);
		if (local10 != 0) {
			return arg2 ? -local10 : local10;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(36) int local36 = Static248.method3154(arg1, arg5, arg4, arg0);
			return arg1 ? -local36 : local36;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "I")
	private static int anInt819;

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "Z")
	private static boolean aBoolean59;

	@OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
	private static int anInt820;

	@OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
	private static int anInt821;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "J")
	public static long aLong29 = -1L;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)I")
	public static int method694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return ((arg1 >> 2 & 0x3F) << 10) + ((arg2 >> 5 << 7) + (arg0 >> 1));
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
	public static void method698(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = arg1;
		@Pc(15) int local15 = -arg1;
		Static160.method2840(arg2, arg0 + arg1, arg0 - arg1, Static129.anIntArrayArray46[arg3]);
		@Pc(30) int local30 = -1;
		while (local5 < local7) {
			local30 += 2;
			local5++;
			local15 += local30;
			if (local15 >= 0) {
				local7--;
				local15 -= local7 << 1;
				@Pc(55) int[] local55 = Static129.anIntArrayArray46[local7 + arg3];
				@Pc(62) int[] local62 = Static129.anIntArrayArray46[arg3 - local7];
				@Pc(67) int local67 = arg0 + local5;
				@Pc(71) int local71 = arg0 - local5;
				Static160.method2840(arg2, local67, local71, local55);
				Static160.method2840(arg2, local67, local71, local62);
			}
			@Pc(87) int local87 = arg0 + local7;
			@Pc(91) int local91 = arg0 - local7;
			@Pc(97) int[] local97 = Static129.anIntArrayArray46[local5 + arg3];
			@Pc(104) int[] local104 = Static129.anIntArrayArray46[arg3 - local5];
			Static160.method2840(arg2, local87, local91, local97);
			Static160.method2840(arg2, local87, local91, local104);
		}
	}

	@OriginalMember(owner = "client!ii", name = "providesignlink", descriptor = "(Lclient!ne;)V")
	private static void method702(@OriginalArg(0) Class139 arg0) {
		Static182.aClass139_5 = arg0;
		Static14.aClass139_1 = arg0;
	}
}

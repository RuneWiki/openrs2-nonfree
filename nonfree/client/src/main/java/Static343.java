import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	public static int anInt6178 = 0;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_110 = new Class36(36, 3);

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "[I")
	public static final int[] anIntArray539 = new int[13];

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	public static void method4795() {
		Static235.aClass69_41.method1593();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)Z")
	public static boolean method4796(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static287.method4005(arg1, arg0) | (arg1 & 0x10000) != 0 || Static141.method2011(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static105.method1658(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II[BIIBI[BI)V")
	public static void method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(22) int local22 = -arg5; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg0++;
				arg2[local30] = (byte) (arg2[local30] - arg6[arg4++]);
				@Pc(43) int local43 = arg0++;
				arg2[local43] = (byte) (arg2[local43] - arg6[arg4++]);
				@Pc(56) int local56 = arg0++;
				arg2[local56] = (byte) (arg2[local56] - arg6[arg4++]);
				@Pc(69) int local69 = arg0++;
				arg2[local69] = (byte) (arg2[local69] - arg6[arg4++]);
			}
			for (@Pc(88) int local88 = local15; local88 < 0; local88++) {
				local30 = arg0++;
				arg2[local30] = (byte) (arg2[local30] - arg6[arg4++]);
			}
			arg4 += arg7;
			arg0 += arg1;
		}
	}
}

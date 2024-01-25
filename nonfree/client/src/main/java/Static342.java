import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "Lclient!sh;")
	public static Class211 aClass211_149;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_148 = new Class211(84, 7);

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "[[B")
	public static final byte[][] aByteArrayArray19 = new byte[50][];

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II[I[II)V")
	public static void method4853(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg3 + arg0) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) int local25 = arg2[local19];
		arg2[local19] = arg2[arg3];
		arg2[arg3] = local25;
		@Pc(39) int local39 = arg1[local19];
		arg1[local19] = arg1[arg3];
		arg1[arg3] = local39;
		for (@Pc(51) int local51 = arg0; local51 < arg3; local51++) {
			if (arg2[local51] < (local51 & 0x1) + local25) {
				@Pc(66) int local66 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21] = local66;
				@Pc(80) int local80 = arg1[local51];
				arg1[local51] = arg1[local21];
				arg1[local21++] = local80;
			}
		}
		arg2[arg3] = arg2[local21];
		arg2[local21] = local25;
		arg1[arg3] = arg1[local21];
		arg1[local21] = local39;
		method4853(arg0, arg1, arg2, local21 - 1);
		method4853(local21 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZC)Z")
	public static boolean method4854(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static170.method2510(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static336.aCharArray5;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (local31 == arg0) {
					return true;
				}
			}
			@Pc(47) char[] local47 = Static328.aCharArray4;
			for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
				@Pc(55) char local55 = local47[local49];
				if (arg0 == local55) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII)V")
	public static void method4855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6;
		if (arg3 <= arg2) {
			for (local6 = arg3; local6 < arg2; local6++) {
				Static369.anIntArrayArray35[local6][arg0] = arg1;
			}
		} else {
			for (local6 = arg2; local6 < arg3; local6++) {
				Static369.anIntArrayArray35[local6][arg0] = arg1;
			}
		}
	}
}

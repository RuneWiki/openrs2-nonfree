import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II[[B[I[BI[[B[I)I")
	public static int method457(@OriginalArg(1) int arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg6[arg4];
		@Pc(15) int local15 = arg2[arg4] + local9;
		@Pc(19) int local19 = arg6[arg0];
		@Pc(38) int local38 = local19 + arg2[arg0];
		@Pc(40) int local40 = local9;
		if (local9 < local19) {
			local40 = local19;
		}
		@Pc(51) int local51 = local15;
		if (local38 < local15) {
			local51 = local38;
		}
		@Pc(66) int local66 = arg3[arg4] & 0xFF;
		if ((arg3[arg0] & 0xFF) < local66) {
			local66 = arg3[arg0] & 0xFF;
		}
		@Pc(87) byte[] local87 = arg1[arg4];
		@Pc(91) byte[] local91 = arg5[arg0];
		@Pc(96) int local96 = local40 - local9;
		@Pc(101) int local101 = local40 - local19;
		for (@Pc(103) int local103 = local40; local103 < local51; local103++) {
			@Pc(116) int local116 = local87[local96++] + local91[local101++];
			if (local116 < local66) {
				local66 = local116;
			}
		}
		return -local66;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII[BI[BII)V")
	public static void method458(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(18) int local18 = -(arg1 >> 2);
		@Pc(23) int local23 = -(arg1 & 0x3);
		for (@Pc(26) int local26 = -arg6; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local18; local30 < 0; local30++) {
				local34 = arg7++;
				arg5[local34] = (byte) (arg5[local34] - arg3[arg0++]);
				@Pc(47) int local47 = arg7++;
				arg5[local47] = (byte) (arg5[local47] - arg3[arg0++]);
				@Pc(60) int local60 = arg7++;
				arg5[local60] = (byte) (arg5[local60] - arg3[arg0++]);
				@Pc(73) int local73 = arg7++;
				arg5[local73] = (byte) (arg5[local73] - arg3[arg0++]);
			}
			for (@Pc(89) int local89 = local23; local89 < 0; local89++) {
				local34 = arg7++;
				arg5[local34] = (byte) (arg5[local34] - arg3[arg0++]);
			}
			arg0 += arg4;
			arg7 += arg2;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!ht;B)V")
	public static void method460(@OriginalArg(0) Class112 arg0) {
		Static219.aClass112_1 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
	public static void method462() {
		if (Static267.anInt4535 <= 0) {
			Static223.aString46 = "";
			return;
		}
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static231.aStringArray52.length; local11++) {
			if (Static231.aStringArray52[local11].startsWith("--> ")) {
				local9++;
				if (Static267.anInt4535 == local9) {
					Static223.aString46 = Static231.aStringArray52[local11].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!ok;IIIBZI)V")
	public static void method463(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static20.anInt2216 = arg2;
		Static286.aBoolean251 = false;
		Static415.anInt6610 = 2;
		Static195.anInt3458 = arg1;
		Static351.anInt5638 = 1;
		Static455.anInt6328 = 0;
		Static126.aClass178_41 = arg0;
	}
}

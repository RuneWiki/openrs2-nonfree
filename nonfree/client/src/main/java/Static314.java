import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
	public static int anInt5377;

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "[I")
	public static final int[] anIntArray319 = new int[3];

	@OriginalMember(owner = "client!kt", name = "n", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_135 = new Class381(15, 8);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!aba;Z)V")
	public static void method4822(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort104; local2 <= arg0.aShort103; local2++) {
			for (@Pc(6) int local6 = arg0.aShort105; local6 <= arg0.aShort102; local6++) {
				@Pc(16) Class128 local16 = Static283.aClass128ArrayArrayArray1[arg0.aByte139][local2][local6];
				if (local16 != null) {
					@Pc(21) Class299 local21 = local16.aClass299_2;
					@Pc(23) Class299 local23 = null;
					while (local21 != null) {
						if (local21.aClass4_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass299_2 = local21.aClass299_3;
							} else {
								local23.aClass299_3 = local21.aClass299_3;
							}
							local21.method6761();
							break;
						}
						local23 = local21;
						local21 = local21.aClass299_3;
					}
				}
			}
		}
		if (!arg1) {
			Static370.method5508(arg0);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z[I[[B[BI[II[[B)I")
	public static int method4823(@OriginalArg(1) int[] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg4[arg5];
		@Pc(15) int local15 = local9 + arg0[arg5];
		@Pc(19) int local19 = arg4[arg3];
		@Pc(25) int local25 = arg0[arg3] + local19;
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local25 < local15) {
			local38 = local25;
		}
		@Pc(49) int local49 = arg2[arg5] & 0xFF;
		if (local49 > (arg2[arg3] & 0xFF)) {
			local49 = arg2[arg3] & 0xFF;
		}
		@Pc(66) byte[] local66 = arg6[arg5];
		@Pc(70) byte[] local70 = arg1[arg3];
		@Pc(81) int local81 = local27 - local9;
		@Pc(85) int local85 = local27 - local19;
		for (@Pc(87) int local87 = local27; local87 < local38; local87++) {
			@Pc(101) int local101 = local70[local85++] + local66[local81++];
			if (local49 > local101) {
				local49 = local101;
			}
		}
		return -local49;
	}
}

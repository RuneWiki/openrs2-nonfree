import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "Lclient!tr;")
	public static final Class237 aClass237_15 = new Class237(4, 18);

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIFIILclient!hj;[BFFIFFZ)V")
	public static void method5219(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(6) Class103 arg3, @OriginalArg(7) byte[] arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float arg6, @OriginalArg(11) float arg7, @OriginalArg(12) float arg8) {
		@Pc(10) float[] local10 = new float[16384];
		@Pc(20) int local20;
		@Pc(50) int local50;
		for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
			local20 = arg0;
			arg3.method5329(arg5 / (float) 128, arg6 / (float) 16, arg2 * 127.0F, 0, local10, arg8 / (float) 128, arg1);
			arg8 *= 2.0F;
			for (local50 = 0; local50 < 16384; local50++) {
				arg4[local20] = (byte) ((float) arg4[local20] + local10[local50]);
				local20++;
			}
			arg6 *= 2.0F;
			arg2 *= arg7;
			arg5 *= 2.0F;
		}
		local20 = arg0;
		for (local50 = 0; local50 < 16384; local50++) {
			arg4[local20] -= -127;
			local20++;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public static void method5220() {
		@Pc(7) int local7 = Static155.anInt2952;
		@Pc(9) int[] local9 = Static381.anIntArray619;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class31_Sub2_Sub1_Sub1 local19 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static383.method5182(local19.method5989(), local19);
			}
		}
	}
}

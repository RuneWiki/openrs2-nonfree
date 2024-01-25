import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "Lclient!og;")
	public static Class9_Sub1_Sub1_Sub2_Sub2 aClass9_Sub1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "[I")
	public static int[] anIntArray354;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "Lclient!kj;")
	public static final Class187 aClass187_7 = new Class187(6, 7);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I[[B[B[I[III[[B)I")
	public static int method3889(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg4[arg0];
		@Pc(15) int local15 = arg3[arg0] + local9;
		@Pc(19) int local19 = arg4[arg5];
		@Pc(25) int local25 = local19 + arg3[arg5];
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local25 < local15) {
			local34 = local25;
		}
		@Pc(50) int local50 = arg2[arg0] & 0xFF;
		if (local50 > (arg2[arg5] & 0xFF)) {
			local50 = arg2[arg5] & 0xFF;
		}
		@Pc(67) byte[] local67 = arg6[arg0];
		@Pc(71) byte[] local71 = arg1[arg5];
		@Pc(76) int local76 = local27 - local9;
		@Pc(81) int local81 = local27 - local19;
		for (@Pc(83) int local83 = local27; local83 < local34; local83++) {
			@Pc(96) int local96 = local67[local76++] + local71[local81++];
			if (local96 < local50) {
				local50 = local96;
			}
		}
		return -local50;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
	public static void method3890(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static554.aClass63ArrayArrayArray4 = Static492.aClass63ArrayArrayArray3;
			Static29.aClass139Array6 = Static168.aClass139Array22;
		} else {
			Static554.aClass63ArrayArrayArray4 = Static106.aClass63ArrayArrayArray1;
			Static29.aClass139Array6 = Static374.aClass139Array17;
		}
		Static499.anInt7950 = Static554.aClass63ArrayArrayArray4.length;
	}
}

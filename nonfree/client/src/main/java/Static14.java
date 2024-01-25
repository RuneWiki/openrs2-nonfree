import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ap", name = "E", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_12 = new Class107(104, -1);

	@OriginalMember(owner = "client!ap", name = "H", descriptor = "I")
	public static int anInt406 = 0;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "(I)V")
	public static void method384() {
		@Pc(9) int local9 = (int) ((double) Static195.anInt3537 * 34.46D);
		local9 <<= 0x0;
		if (Static415.aClass39_11.method4559()) {
			local9 += 128;
		}
		Static415.aClass39_11.ia(50, local9);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ)I")
	public static int method385(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II[BIBIII[B)V")
	public static void method386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg0++;
				arg7[local28] = (byte) (arg7[local28] - arg2[arg1++]);
				@Pc(41) int local41 = arg0++;
				arg7[local41] = (byte) (arg7[local41] - arg2[arg1++]);
				@Pc(54) int local54 = arg0++;
				arg7[local54] = (byte) (arg7[local54] - arg2[arg1++]);
				@Pc(67) int local67 = arg0++;
				arg7[local67] = (byte) (arg7[local67] - arg2[arg1++]);
			}
			for (@Pc(83) int local83 = local15; local83 < 0; local83++) {
				local28 = arg0++;
				arg7[local28] = (byte) (arg7[local28] - arg2[arg1++]);
			}
			arg1 += arg5;
			arg0 += arg6;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!vq", name = "M", descriptor = "I")
	public static int anInt9822;

	@OriginalMember(owner = "client!vq", name = "R", descriptor = "I")
	public static int anInt9827;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IZII[BII[BI)V")
	public static void method8209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg5++;
				arg3[local31] = (byte) (arg3[local31] - arg6[arg2++]);
				@Pc(44) int local44 = arg5++;
				arg3[local44] = (byte) (arg3[local44] - arg6[arg2++]);
				@Pc(57) int local57 = arg5++;
				arg3[local57] = (byte) (arg3[local57] - arg6[arg2++]);
				@Pc(70) int local70 = arg5++;
				arg3[local70] = (byte) (arg3[local70] - arg6[arg2++]);
			}
			for (@Pc(89) int local89 = local15; local89 < 0; local89++) {
				local31 = arg5++;
				arg3[local31] = (byte) (arg3[local31] - arg6[arg2++]);
			}
			arg5 += arg0;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V")
	public static void method8210() {
		@Pc(9) int[] local9 = new int[Static72.aClass225_2.anInt5618];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static72.aClass225_2.anInt5618; local13++) {
			@Pc(20) Class34 local20 = Static72.aClass225_2.method4789(local13);
			if (local20.anInt859 >= 0 || local20.anInt901 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static210.anIntArray230 = new int[local11];
		for (@Pc(56) int local56 = 0; local56 < local11; local56++) {
			Static210.anIntArray230[local56] = local9[local56];
		}
	}
}

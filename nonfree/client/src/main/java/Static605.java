import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "[I")
	public static int[] anIntArray578;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_158 = new Class337(69, -2);

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "[I")
	public static final int[] anIntArray579 = new int[32];

	@OriginalMember(owner = "client!vn", name = "B", descriptor = "I")
	public static final int anInt10103 = 1400;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III[BIIBI[B)V")
	public static void method8634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg0++;
				arg7[local31] = (byte) (arg7[local31] - arg3[arg6++]);
				@Pc(44) int local44 = arg0++;
				arg7[local44] = (byte) (arg7[local44] - arg3[arg6++]);
				@Pc(57) int local57 = arg0++;
				arg7[local57] = (byte) (arg7[local57] - arg3[arg6++]);
				@Pc(70) int local70 = arg0++;
				arg7[local70] = (byte) (arg7[local70] - arg3[arg6++]);
			}
			for (@Pc(86) int local86 = local15; local86 < 0; local86++) {
				local31 = arg0++;
				arg7[local31] = (byte) (arg7[local31] - arg3[arg6++]);
			}
			arg6 += arg1;
			arg0 += arg2;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!ofa;B)Lclient!hc;")
	public static Class119 method8635(@OriginalArg(0) Class5_Sub22 arg0) {
		@Pc(10) Class245 local10 = Static116.method4813()[arg0.method5966()];
		@Pc(17) Class183 local17 = Static1.method7584()[arg0.method5966()];
		@Pc(21) int local21 = arg0.method5956();
		@Pc(25) int local25 = arg0.method5956();
		@Pc(29) int local29 = arg0.method5968();
		@Pc(33) int local33 = arg0.method5968();
		@Pc(37) int local37 = arg0.method5956();
		@Pc(41) int local41 = arg0.method5913();
		@Pc(52) int local52 = arg0.method5913();
		return new Class119(local10, local17, local21, local25, local29, local33, local37, local41, local52);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!me", name = "A", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!me", name = "D", descriptor = "I")
	public static int anInt6053;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "Lclient!sa;")
	public static Class309_Sub1 aClass309_Sub1_1;

	@OriginalMember(owner = "client!me", name = "F", descriptor = "I")
	public static int anInt6054;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "[[[Lclient!ds;")
	public static Class84[][][] aClass84ArrayArrayArray5;

	@OriginalMember(owner = "client!me", name = "G", descriptor = "I")
	public static int anInt6055 = 0;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I[B[BIIIIII)V")
	public static void method5238(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg5 >> 2);
		@Pc(20) int local20 = -(arg5 & 0x3);
		for (@Pc(23) int local23 = -arg3; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg6++;
				arg2[local31] = (byte) (arg2[local31] - arg1[arg0++]);
				@Pc(44) int local44 = arg6++;
				arg2[local44] = (byte) (arg2[local44] - arg1[arg0++]);
				@Pc(57) int local57 = arg6++;
				arg2[local57] = (byte) (arg2[local57] - arg1[arg0++]);
				@Pc(70) int local70 = arg6++;
				arg2[local70] = (byte) (arg2[local70] - arg1[arg0++]);
			}
			for (@Pc(89) int local89 = local20; local89 < 0; local89++) {
				local31 = arg6++;
				arg2[local31] = (byte) (arg2[local31] - arg1[arg0++]);
			}
			arg6 += arg4;
			arg0 += arg7;
		}
	}
}

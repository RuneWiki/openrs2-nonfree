import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!el", name = "q", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!el", name = "r", descriptor = "I")
	public static int anInt2905;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_59 = new Class200(77, 6);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static146.aClass62Array1[Static608.anInt10054++] = new Class62(4, arg5, arg0, arg2, arg2, arg0, arg6, arg1, arg1, arg6, arg4, arg4, arg3, arg3);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([B[BIIIIIII)V")
	public static void method2480(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(31) int local31 = -arg2; local31 < 0; local31++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local10; local35 < 0; local35++) {
				local39 = arg4++;
				arg0[local39] = (byte) (arg0[local39] - arg1[arg5++]);
				@Pc(52) int local52 = arg4++;
				arg0[local52] = (byte) (arg0[local52] - arg1[arg5++]);
				@Pc(65) int local65 = arg4++;
				arg0[local65] = (byte) (arg0[local65] - arg1[arg5++]);
				@Pc(78) int local78 = arg4++;
				arg0[local78] = (byte) (arg0[local78] - arg1[arg5++]);
			}
			for (@Pc(94) int local94 = local15; local94 < 0; local94++) {
				local39 = arg4++;
				arg0[local39] = (byte) (arg0[local39] - arg1[arg5++]);
			}
			arg4 += arg3;
			arg5 += arg6;
		}
	}
}

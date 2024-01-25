import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!r", name = "U", descriptor = "Lclient!tk;")
	public static Class237 aClass237_4;

	@OriginalMember(owner = "client!r", name = "V", descriptor = "Lclient!c;")
	public static Class34 aClass34_4;

	@OriginalMember(owner = "client!r", name = "K", descriptor = "Lclient!s;")
	public static final Class217 aClass217_129 = new Class217(42, 8);

	@OriginalMember(owner = "client!r", name = "T", descriptor = "Z")
	public static boolean aBoolean374 = false;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIBII[B[B)V")
	public static void method4608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(23) int local23 = -arg2; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg5++;
				arg6[local31] = (byte) (arg6[local31] - arg7[arg1++]);
				@Pc(44) int local44 = arg5++;
				arg6[local44] = (byte) (arg6[local44] - arg7[arg1++]);
				@Pc(57) int local57 = arg5++;
				arg6[local57] = (byte) (arg6[local57] - arg7[arg1++]);
				@Pc(70) int local70 = arg5++;
				arg6[local70] = (byte) (arg6[local70] - arg7[arg1++]);
			}
			for (@Pc(89) int local89 = local15; local89 < 0; local89++) {
				local31 = arg5++;
				arg6[local31] = (byte) (arg6[local31] - arg7[arg1++]);
			}
			arg5 += arg0;
			arg1 += arg3;
		}
	}
}

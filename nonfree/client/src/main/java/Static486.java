import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "Lclient!ip;")
	public static Class170 aClass170_45;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([BIIII[BIIZ)V")
	public static void method7097(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(20) int local20 = -(arg4 & 0x3);
		for (@Pc(23) int local23 = -arg7; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg1++;
				arg5[local31] = (byte) (arg5[local31] - arg0[arg6++]);
				@Pc(44) int local44 = arg1++;
				arg5[local44] = (byte) (arg5[local44] - arg0[arg6++]);
				@Pc(57) int local57 = arg1++;
				arg5[local57] = (byte) (arg5[local57] - arg0[arg6++]);
				@Pc(70) int local70 = arg1++;
				arg5[local70] = (byte) (arg5[local70] - arg0[arg6++]);
			}
			for (@Pc(89) int local89 = local20; local89 < 0; local89++) {
				local31 = arg1++;
				arg5[local31] = (byte) (arg5[local31] - arg0[arg6++]);
			}
			arg6 += arg2;
			arg1 += arg3;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!sf;ZZ)V")
	public static void method7099(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean762 = arg1;
		if (Static362.aBoolean459) {
			Static472.aClass345Array1[Static472.aClass345Array1.length - 1].method7948(arg0);
		} else {
			Static534.method8659(arg0, Static507.aClass5_Sub3Array5);
		}
	}
}

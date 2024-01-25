import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!sja", name = "z", descriptor = "I")
	public static int anInt8716;

	@OriginalMember(owner = "client!sja", name = "l", descriptor = "I")
	public static int anInt8722 = -1;

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(IIBI[BI[BII)V")
	public static void method7501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(20) int local20 = -(arg1 & 0x3);
		for (@Pc(23) int local23 = -arg2; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg4++;
				arg5[local31] = (byte) (arg5[local31] - arg3[arg6++]);
				@Pc(44) int local44 = arg4++;
				arg5[local44] = (byte) (arg5[local44] - arg3[arg6++]);
				@Pc(57) int local57 = arg4++;
				arg5[local57] = (byte) (arg5[local57] - arg3[arg6++]);
				@Pc(70) int local70 = arg4++;
				arg5[local70] = (byte) (arg5[local70] - arg3[arg6++]);
			}
			for (@Pc(88) int local88 = local20; local88 < 0; local88++) {
				local31 = arg4++;
				arg5[local31] = (byte) (arg5[local31] - arg3[arg6++]);
			}
			arg4 += arg7;
			arg6 += arg0;
		}
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method7502(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < Static645.anInt10557; local21++) {
			if (arg0.equalsIgnoreCase(Static167.aStringArray13[local21])) {
				return local21;
			}
		}
		return -1;
	}
}

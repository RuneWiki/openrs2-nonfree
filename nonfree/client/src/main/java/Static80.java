import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cs", name = "P", descriptor = "Ljava/awt/Image;")
	public static Image anImage10;

	@OriginalMember(owner = "client!cs", name = "G", descriptor = "Lclient!pea;")
	public static final Class251 aClass251_11 = new Class251(1);

	@OriginalMember(owner = "client!cs", name = "O", descriptor = "I")
	public static int anInt9237 = -1;

	@OriginalMember(owner = "client!cs", name = "Q", descriptor = "[Lclient!wc;")
	public static final Class8_Sub5_Sub21[] aClass8_Sub5_Sub21Array11 = new Class8_Sub5_Sub21[14];

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)I")
	public static int method7555(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static50.anIntArray69[arg1 & 0x3] : Static642.anIntArray626[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIII[B[BII)V")
	public static void method7556(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(18) int local18 = -(arg2 >> 2);
		@Pc(23) int local23 = -(arg2 & 0x3);
		for (@Pc(26) int local26 = -arg7; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local18; local30 < 0; local30++) {
				local34 = arg0++;
				arg5[local34] = (byte) (arg5[local34] - arg4[arg3++]);
				@Pc(47) int local47 = arg0++;
				arg5[local47] = (byte) (arg5[local47] - arg4[arg3++]);
				@Pc(60) int local60 = arg0++;
				arg5[local60] = (byte) (arg5[local60] - arg4[arg3++]);
				@Pc(73) int local73 = arg0++;
				arg5[local73] = (byte) (arg5[local73] - arg4[arg3++]);
			}
			for (@Pc(89) int local89 = local23; local89 < 0; local89++) {
				local34 = arg0++;
				arg5[local34] = (byte) (arg5[local34] - arg4[arg3++]);
			}
			arg0 += arg6;
			arg3 += arg1;
		}
	}
}

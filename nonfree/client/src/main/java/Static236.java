import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
	public static int anInt3726;

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
	public static int anInt3729;

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "[I")
	public static int[] anIntArray290;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "Lclient!ug;")
	public static Class43 aClass43_18;

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
	public static final int anInt3730 = 1407;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIIII[BI[B)V")
	public static void method3348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(18) int local18 = -arg6; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg4++;
				arg5[local26] = (byte) (arg5[local26] - arg7[arg2++]);
				@Pc(39) int local39 = arg4++;
				arg5[local39] = (byte) (arg5[local39] - arg7[arg2++]);
				@Pc(52) int local52 = arg4++;
				arg5[local52] = (byte) (arg5[local52] - arg7[arg2++]);
				@Pc(65) int local65 = arg4++;
				arg5[local65] = (byte) (arg5[local65] - arg7[arg2++]);
			}
			for (@Pc(83) int local83 = local15; local83 < 0; local83++) {
				local26 = arg4++;
				arg5[local26] = (byte) (arg5[local26] - arg7[arg2++]);
			}
			arg4 += arg3;
			arg2 += arg0;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IILclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class145 method3350(@OriginalArg(1) int arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) Canvas arg2) {
		return new Class145_Sub3(arg2, arg1, arg0);
	}
}

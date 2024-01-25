import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "I")
	public static int anInt9004;

	@OriginalMember(owner = "client!so", name = "g", descriptor = "I")
	public static int anInt9008;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_87 = new Class305(63, -1);

	@OriginalMember(owner = "client!so", name = "e", descriptor = "Z")
	public static boolean aBoolean771 = false;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V")
	public static void method7643(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub3_Sub17 local9 = Static358.method5408(10, (long) arg0);
		local9.method7288();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!uaa;ZI)V")
	public static void method7644(@OriginalArg(0) Class345 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt9580 == 0 ? arg0.anInt9649 : arg0.anInt9580;
		@Pc(27) int local27 = arg0.anInt9593 == 0 ? arg0.anInt9606 : arg0.anInt9593;
		Static535.method7516(arg0.anInt9664, arg1, local27, Static648.aClass345ArrayArray2[arg0.anInt9664 >> 16], local15);
		if (arg0.aClass345Array1 != null) {
			Static535.method7516(arg0.anInt9664, arg1, local27, arg0.aClass345Array1, local15);
		}
		@Pc(60) Class5_Sub39 local60 = (Class5_Sub39) Static452.aClass300_33.method7188((long) arg0.anInt9664);
		if (local60 != null) {
			Static672.method8993(arg1, local27, local15, local60.anInt6238);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIII[BI[BI)V")
	public static void method7645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg2; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg7++;
				arg4[local26] = (byte) (arg4[local26] - arg6[arg5++]);
				@Pc(39) int local39 = arg7++;
				arg4[local39] = (byte) (arg4[local39] - arg6[arg5++]);
				@Pc(52) int local52 = arg7++;
				arg4[local52] = (byte) (arg4[local52] - arg6[arg5++]);
				@Pc(65) int local65 = arg7++;
				arg4[local65] = (byte) (arg4[local65] - arg6[arg5++]);
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local26 = arg7++;
				arg4[local26] = (byte) (arg4[local26] - arg6[arg5++]);
			}
			arg5 += arg0;
			arg7 += arg1;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "Z")
	public static boolean aBoolean93 = false;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_33 = new Class123(54, 7);

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
	public static int anInt1122 = -1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII[BII[B)V")
	public static void method1053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(14) int local14 = -(arg5 >> 2);
		@Pc(19) int local19 = -(arg5 & 0x3);
		for (@Pc(22) int local22 = -arg6; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg1++;
				arg4[local30] += arg7[arg0++];
				@Pc(42) int local42 = arg1++;
				arg4[local42] += arg7[arg0++];
				@Pc(54) int local54 = arg1++;
				arg4[local54] += arg7[arg0++];
				@Pc(66) int local66 = arg1++;
				arg4[local66] += arg7[arg0++];
			}
			for (@Pc(81) int local81 = local19; local81 < 0; local81++) {
				local30 = arg1++;
				arg4[local30] += arg7[arg0++];
			}
			arg1 += arg2;
			arg0 += arg3;
		}
	}
}

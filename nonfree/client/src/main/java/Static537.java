import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!um", name = "c", descriptor = "[Lclient!f;")
	public static Class88[] aClass88Array14;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "Lclient!qp;")
	public static Class283 aClass283_3;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_94 = new Class344(35, -1);

	@OriginalMember(owner = "client!um", name = "k", descriptor = "I")
	public static int anInt9803 = -1;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!vo;B)V")
	public static void method7532(@OriginalArg(0) Class348 arg0) {
		Static411.anInt7971 = arg0.method7966("hitmarks");
		Static534.anInt9773 = arg0.method7966("hitbar_default");
		Static448.anInt9591 = arg0.method7966("timerbar_default");
		Static448.anInt9592 = arg0.method7966("headicons_pk");
		Static87.anInt2291 = arg0.method7966("headicons_prayer");
		Static327.anInt8399 = arg0.method7966("hint_headicons");
		Static423.anInt8144 = arg0.method7966("hint_mapmarkers");
		Static21.anInt959 = arg0.method7966("mapflag");
		Static506.anInt9463 = arg0.method7966("cross");
		Static386.anInt7581 = arg0.method7966("mapdots");
		Static587.anInt10510 = arg0.method7966("scrollbar");
		Static523.anInt9611 = arg0.method7966("name_icons");
		Static74.anInt1894 = arg0.method7966("floorshadows");
		Static37.anInt1235 = arg0.method7966("compass");
		Static101.anInt2437 = arg0.method7966("otherlevel");
		Static55.anInt1464 = arg0.method7966("hint_mapedge");
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([BI[BIIBIII)V")
	public static void method7534(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = -(arg4 >> 2);
		@Pc(19) int local19 = -(arg4 & 0x3);
		for (@Pc(22) int local22 = -arg3; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg1++;
				arg2[local30] = (byte) (arg2[local30] - arg0[arg6++]);
				@Pc(43) int local43 = arg1++;
				arg2[local43] = (byte) (arg2[local43] - arg0[arg6++]);
				@Pc(56) int local56 = arg1++;
				arg2[local56] = (byte) (arg2[local56] - arg0[arg6++]);
				@Pc(69) int local69 = arg1++;
				arg2[local69] = (byte) (arg2[local69] - arg0[arg6++]);
			}
			for (@Pc(85) int local85 = local19; local85 < 0; local85++) {
				local30 = arg1++;
				arg2[local30] = (byte) (arg2[local30] - arg0[arg6++]);
			}
			arg1 += arg7;
			arg6 += arg5;
		}
	}
}

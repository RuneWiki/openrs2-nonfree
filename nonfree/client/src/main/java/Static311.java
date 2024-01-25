import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
	public static int anInt6207;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "[I")
	public static final int[] anIntArray367 = new int[25];

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Z")
	public static boolean aBoolean525 = false;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "S")
	public static short aShort85 = 256;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!ha;IIIII)V")
	public static void method5255(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((Static166.aClass5_22 == null || Static644.aClass5_39 == null || Static333.aClass5_27 == null) && Static150.aClass181_34.method5040(Static191.anInt4463) && Static150.aClass181_34.method5040(Static546.anInt9224) && Static150.aClass181_34.method5040(Static141.anInt3583)) {
			@Pc(27) Class28 local27 = Static649.method613(Static150.aClass181_34, Static546.anInt9224, 0);
			Static644.aClass5_39 = arg1.method6161(local27, true);
			local27.method608();
			Static548.aClass5_37 = arg1.method6161(local27, true);
			Static166.aClass5_22 = arg1.method6161(Static649.method613(Static150.aClass181_34, Static191.anInt4463, 0), true);
			@Pc(52) Class28 local52 = Static649.method613(Static150.aClass181_34, Static141.anInt3583, 0);
			Static333.aClass5_27 = arg1.method6161(local52, true);
			local52.method608();
			Static185.aClass5_24 = arg1.method6161(local52, true);
		}
		if (Static166.aClass5_22 == null || Static644.aClass5_39 == null || Static333.aClass5_27 == null) {
			return;
		}
		@Pc(85) int local85 = (arg4 - Static333.aClass5_27.method7588() * 2) / Static166.aClass5_22.method7588();
		for (@Pc(87) int local87 = 0; local87 < local85; local87++) {
			Static166.aClass5_22.method7577(arg3 + Static333.aClass5_27.method7588() + Static166.aClass5_22.method7588() * local87, arg2 + (arg0 - Static166.aClass5_22.method7580()));
		}
		@Pc(125) int local125 = (arg2 - Static333.aClass5_27.method7580() - 20) / Static644.aClass5_39.method7580();
		for (@Pc(127) int local127 = 0; local127 < local125; local127++) {
			Static644.aClass5_39.method7577(arg3, arg0 + local127 * Static644.aClass5_39.method7580() + 20);
			Static548.aClass5_37.method7577(arg4 + arg3 - Static548.aClass5_37.method7588(), Static644.aClass5_39.method7580() * local127 + arg0 + 20);
		}
		Static333.aClass5_27.method7577(arg3, arg0 + arg2 - Static333.aClass5_27.method7580());
		Static185.aClass5_24.method7577(arg3 + arg4 - Static333.aClass5_27.method7588(), -Static333.aClass5_27.method7580() + arg0 - -arg2);
	}
}

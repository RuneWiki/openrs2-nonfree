import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "F")
	public static float aFloat151;

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
	public static int anInt7901;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_254 = new Class194(106, -1);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!ha;IIILclient!ts;)V")
	public static void method6842(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class330 arg4) {
		@Pc(14) Class64 local14 = Static383.aClass233_150.method5863(arg4.anInt9201);
		if (local14.anInt1735 == -1) {
			return;
		}
		if (arg4.aBoolean688) {
			@Pc(31) int local31 = arg2 + arg4.anInt9210;
			arg2 = local31 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(43) Class103 local43 = local14.method1482(arg4.aBoolean681, arg2, arg1);
		if (local43 == null) {
			return;
		}
		@Pc(49) int local49 = arg4.anInt9221;
		@Pc(52) int local52 = arg4.anInt9193;
		if ((arg2 & 0x1) == 1) {
			local52 = arg4.anInt9221;
			local49 = arg4.anInt9193;
		}
		@Pc(66) int local66 = local43.method7454();
		@Pc(69) int local69 = local43.method7451();
		if (local14.aBoolean124) {
			local66 = local49 * 4;
			local69 = local52 * 4;
		}
		if (local14.anInt1736 == 0) {
			local43.method7449(arg3, arg0 + 4 - local52 * 4, local66, local69);
		} else {
			local43.method7461(arg3, arg0 + 4 - local52 * 4, local66, local69, 0, local14.anInt1736 | 0xFF000000, 1);
		}
	}
}

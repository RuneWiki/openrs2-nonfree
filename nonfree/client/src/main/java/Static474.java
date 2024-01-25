import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
	public static int anInt7947;

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
	public static int anInt7949;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZZ)Z")
	public static boolean method6919(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!ha;IIIILclient!qfa;)V")
	public static void method6924(@OriginalArg(0) Class126 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class283 arg4) {
		@Pc(11) Class77 local11 = Static39.aClass56_3.method1173(arg4.anInt7804);
		if (local11.anInt1582 == -1) {
			return;
		}
		if (arg4.aBoolean643) {
			@Pc(25) int local25 = arg3 + arg4.anInt7817;
			arg3 = local25 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(43) Class44 local43 = local11.method1477(arg4.aBoolean644, arg0, arg3);
		if (local43 == null) {
			return;
		}
		@Pc(49) int local49 = arg4.anInt7838;
		@Pc(52) int local52 = arg4.anInt7822;
		if ((arg3 & 0x1) == 1) {
			local52 = arg4.anInt7838;
			local49 = arg4.anInt7822;
		}
		@Pc(68) int local68 = local43.method5313();
		@Pc(71) int local71 = local43.method5325();
		if (local11.aBoolean125) {
			local68 = local49 * 4;
			local71 = local52 * 4;
		}
		if (local11.anInt1586 == 0) {
			local43.method5329(arg1, arg2 - (local52 - 1) * 4, local68, local71);
		} else {
			local43.method5310(arg1, arg2 + 4 - local52 * 4, local68, local71, 0, local11.anInt1586 | 0xFF000000, 1);
		}
	}
}

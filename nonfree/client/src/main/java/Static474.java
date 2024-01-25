import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
	public static int anInt8290;

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "Lclient!la;")
	public static Class196 aClass196_98;

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
	public static int anInt8295;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
	public static int anInt8293 = 0;

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
	public static int anInt8296 = 0;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public static void method7123() {
		if (Static582.aClass310_23 != null) {
			Static101.aClass59_1 = new Class59();
			Static101.aClass59_1.method1963(Static582.aClass310_23, Static582.aClass310_23.aClass43_64.method1598(Static325.anInt6083), Static624.aLong266, Static582.aClass310_23.anInt8983);
			Static264.aThread3 = new Thread(Static101.aClass59_1, "");
			Static264.aThread3.start();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
	public static void method7125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static556.method8018(8, arg1);
		local8.method3608();
		local8.anInt4064 = arg2;
		local8.anInt4062 = arg0;
		local8.anInt4065 = arg3;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIII)Z")
	public static boolean method7126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface2 local9 = (Interface2) Static126.method2496(arg0, arg2, arg1);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static420.method6591(local9) & true;
		}
		local9 = (Interface2) Static572.method8142(arg0, arg2, arg1, as.class);
		if (local9 != null) {
			local11 &= Static420.method6591(local9);
		}
		local9 = (Interface2) Static625.method8735(arg0, arg2, arg1);
		if (local9 != null) {
			local11 &= Static420.method6591(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIIIZII)V")
	public static void method7127(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg5 < 512 || arg4 < 512 || Static634.anInt10129 * 512 - 1024 < arg5 || arg4 > Static638.anInt10172 * 512 - 1024) {
			Static312.anIntArray311[0] = Static312.anIntArray311[1] = -1;
			return;
		}
		@Pc(49) int local49 = Static192.method3263(arg4, arg5, arg0) - arg1;
		if (Static219.aBoolean285) {
			Static34.method1253(true);
		} else {
			Static250.aClass39_4.method7244(arg2, 0, 0);
			Static323.aClass5_9.method7504(Static250.aClass39_4);
		}
		if (Static279.aBoolean329) {
			Static323.aClass5_9.HA(arg5, local49, arg4, Static401.anInt7417, Static312.anIntArray311);
		} else {
			Static323.aClass5_9.da(arg5, local49, arg4, Static312.anIntArray311);
		}
		if (Static219.aBoolean285) {
			Static227.method3763();
		} else {
			Static250.aClass39_4.method7244(-arg2, 0, 0);
			Static323.aClass5_9.method7504(Static250.aClass39_4);
		}
	}
}

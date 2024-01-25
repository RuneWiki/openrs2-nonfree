import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!uaa", name = "p", descriptor = "I")
	public static int anInt8287 = 0;

	@OriginalMember(owner = "client!uaa", name = "t", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_254 = new Class272(22, -2);

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IJII)V")
	public static void method6956(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = (int) arg1 >> 14 & 0x1F;
		@Pc(21) int local21 = (int) arg1 >> 20 & 0x3;
		@Pc(28) int local28 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local14 != 10 && local14 != 11 && local14 != 22) {
			Static436.method6152(arg2, local21, local14, 0, true, 0, arg0, 0);
			return;
		}
		@Pc(44) Class23 local44 = Static476.aClass69_5.method2181(local28);
		@Pc(58) int local58;
		@Pc(55) int local55;
		if (local21 == 0 || local21 == 2) {
			local58 = local44.anInt739;
			local55 = local44.anInt744;
		} else {
			local55 = local44.anInt739;
			local58 = local44.anInt744;
		}
		@Pc(69) int local69 = local44.anInt740;
		if (local21 != 0) {
			local69 = (local69 << local21 & 0xF) + (local69 >> 4 - local21);
		}
		Static436.method6152(arg2, 0, 0, local55, true, local69, arg0, local58);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(III)Z")
	public static boolean method6964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static70.method7721(arg1, arg0) | Static386.method5701(arg0, arg1) | Static596.method7818(arg0, arg1)) & Static579.method7688(arg0, arg1);
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(Z)V")
	public static void method6965() {
		Static455.method6316();
		Static312.aClass55_1 = null;
		Static448.aClass55_4 = null;
		Static447.aClass55_3 = null;
		Static370.aClass217ArrayArray1 = null;
		Static131.aClass43_5 = null;
	}
}

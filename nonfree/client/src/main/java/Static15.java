import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
	public static int anInt366;

	@OriginalMember(owner = "client!ar", name = "U", descriptor = "[Lclient!jd;")
	public static Class13[] aClass13Array3;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 13)
	public static String method393(@OriginalArg(1) long arg0) {
		Class244.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Class244.aCalendar2.get(7);
		@Pc(24) int local24 = Class244.aCalendar2.get(5);
		@Pc(28) int local28 = Class244.aCalendar2.get(2);
		@Pc(32) int local32 = Class244.aCalendar2.get(1);
		@Pc(36) int local36 = Class244.aCalendar2.get(11);
		@Pc(40) int local40 = Class244.aCalendar2.get(12);
		@Pc(44) int local44 = Class244.aCalendar2.get(13);
		return Class12.aStringArray58[local13 - 1] + ", " + local24 / 10 + local24 % 10 + "-" + Class2_Sub2_Sub1.aStringArray1[local28] + "-" + local32 + " " + local36 / 10 + local36 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(IIB)V", line = 40)
	public static void method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class2_Sub10.anInt1761 = arg0 - Static321.anInt6043;
		Class163.anInt4321 = arg1 - Static321.anInt6045;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!ct;IILclient!wm;Z)V", line = 70)
	public static void method395(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class19 arg4) {
		@Pc(9) Class146 local9 = Static297.aClass104_2.method2710(arg1.anInt1315);
		if (local9.anInt3747 == -1) {
			return;
		}
		if (arg1.aBoolean115) {
			@Pc(27) int local27 = arg0 + arg1.anInt1308;
			arg0 = local27 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(39) Class13 local39 = local9.method3712(arg1.aBoolean118, arg0, arg4);
		if (local39 == null) {
			return;
		}
		@Pc(45) int local45 = arg1.anInt1354;
		@Pc(48) int local48 = arg1.anInt1326;
		if ((arg0 & 0x1) == 1) {
			local45 = arg1.anInt1326;
			local48 = arg1.anInt1354;
		}
		@Pc(62) int local62 = local39.method6400();
		@Pc(65) int local65 = local39.method6385();
		if (local9.aBoolean243) {
			local65 = local48 * 4;
			local62 = local45 * 4;
		}
		if (local9.anInt3748 == 0) {
			local39.method6389(arg3, arg2 - (local48 - 1) * 4, local62, local65);
		} else {
			local39.method6396(arg3, arg2 + 4 - local48 * 4, local62, local65, 1, local9.anInt3748 | 0xFF000000, 1);
		}
	}
}

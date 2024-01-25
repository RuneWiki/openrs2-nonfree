import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!qr", name = "Oc", descriptor = "I")
	public static int anInt5403;

	@OriginalMember(owner = "client!qr", name = "Gc", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method4715(@OriginalArg(1) long arg0) {
		Static342.aCalendar2.setTime(new Date(arg0));
		@Pc(20) int local20 = Static342.aCalendar2.get(7);
		@Pc(24) int local24 = Static342.aCalendar2.get(5);
		@Pc(28) int local28 = Static342.aCalendar2.get(2);
		@Pc(32) int local32 = Static342.aCalendar2.get(1);
		@Pc(36) int local36 = Static342.aCalendar2.get(11);
		@Pc(40) int local40 = Static342.aCalendar2.get(12);
		@Pc(44) int local44 = Static342.aCalendar2.get(13);
		return Static242.aStringArray30[local20 - 1] + ", " + local24 / 10 + local24 % 10 + "-" + Static89.aStringArray10[local28] + "-" + local32 + " " + local36 / 10 + local36 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "(II)V")
	public static void method4718(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(arg0, 14);
		local8.method412();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILclient!es;IIILclient!es;III)V")
	public static void method4719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12_Sub1_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class12_Sub1_Sub2 arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg2.method4701();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class5 local20 = (Class5) Static69.aClass154_5.method3751((long) local7);
		if (local20 == null) {
			@Pc(27) Class224[] local27 = Static404.method5314(Static119.aClass71_25, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static304.aClass82_4.method4514(local27[0]);
			Static69.aClass154_5.method3745((long) local7, local20);
		}
		Static357.method861(arg5.aByte74, arg5.anInt6328, arg6 >> 1, 0, arg5.anInt6317, arg4 >> 1, arg5.method4706() * 64);
		@Pc(73) int local73 = Static136.anIntArray287[0] + arg0 - 18;
		@Pc(83) int local83 = Static136.anIntArray287[1] + arg3 - 16 - 54;
		@Pc(96) int local96 = local73 + arg1 / 4 * 18;
		@Pc(104) int local104 = local83 + arg1 % 4 * 18;
		local20.method5004(local96, local104);
		if (arg2 == arg5) {
			Static304.aClass82_4.method4525(18, 18, local104 - 1, -256, local96 - 1);
		}
		@Pc(126) Class22_Sub3 local126 = Static46.method912();
		local126.anInt1104 = local96 + 16;
		local126.anInt1101 = local96;
		local126.anInt1102 = local104 + 16;
		local126.aClass12_Sub1_Sub2_1 = arg2;
		local126.anInt1103 = local104;
		Static183.aClass56_4.method1253(local126);
	}
}

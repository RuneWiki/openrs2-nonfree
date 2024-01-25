import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
	public static int anInt7240 = -1;

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
	public static int anInt7241 = 1;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIILclient!lg;Lclient!lg;)V")
	public static void method6438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class60_Sub1_Sub5 arg3, @OriginalArg(4) Class60_Sub1_Sub5 arg4) {
		@Pc(4) Class243 local4 = Static565.method7969(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass60_Sub1_Sub5_1 = arg3;
		local4.aClass60_Sub1_Sub5_2 = arg4;
		@Pc(22) int local22 = Static555.aClass96Array3 == Static216.aClass96Array1 ? 1 : 0;
		if (!arg3.method7919()) {
			arg3.aClass60_Sub1_23 = Static535.aClass60_Sub1Array3[local22];
			Static535.aClass60_Sub1Array3[local22] = arg3;
		} else if (arg3.method7918()) {
			arg3.aClass60_Sub1_23 = Static265.aClass60_Sub1Array4[local22];
			Static265.aClass60_Sub1Array4[local22] = arg3;
		} else {
			arg3.aClass60_Sub1_23 = Static403.aClass60_Sub1Array5[local22];
			Static403.aClass60_Sub1Array5[local22] = arg3;
			Static429.aBoolean549 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7919()) {
			if (arg4.method7918()) {
				arg4.aClass60_Sub1_23 = Static265.aClass60_Sub1Array4[local22];
				Static265.aClass60_Sub1Array4[local22] = arg4;
				return;
			}
			arg4.aClass60_Sub1_23 = Static403.aClass60_Sub1Array5[local22];
			Static403.aClass60_Sub1Array5[local22] = arg4;
			Static429.aBoolean549 = true;
			return;
		}
		arg4.aClass60_Sub1_23 = Static535.aClass60_Sub1Array3[local22];
		Static535.aClass60_Sub1Array3[local22] = arg4;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)V")
	public static void method6439() {
		@Pc(5) int local5 = 0;
		if (Static687.aClass6_Sub44_33.aClass7_Sub4_1.method648() == 1) {
			local5 = 55;
		}
		if (Static687.aClass6_Sub44_33.aClass7_Sub2_1.method236() == 0) {
			local5 |= 0x40;
		}
		Static14.method196(local5);
		Static290.aClass163_5.method4125((byte) -6, local5);
		Static149.aClass244_1.method5957(local5);
		Static221.aClass164_1.method4154(local5);
		Static655.aClass172_2.method4451(local5);
		Static290.method8797(local5);
		Static209.method3838(local5);
		Static536.method7654(local5);
		Static457.method6977(local5);
		Static41.method532();
	}
}

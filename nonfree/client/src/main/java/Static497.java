import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(B)V")
	public static void method7167() {
		Static510.aClass67_17.xa(((float) Static713.aClass3_Sub55_31.aClass15_Sub14_1.method5959() * 0.1F + 0.7F) * 1.1523438F);
		Static510.aClass67_17.ZA(Static463.anInt8122, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static510.aClass67_17.L(Static486.anInt8433, -1, 0);
		Static510.aClass67_17.method7639(Static67.aClass77_3);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IBC)I")
	public static int method7168(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(18) char local18 = Character.toLowerCase(arg1);
			local7 = (local18 << 4) + 1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIII)I")
	public static int method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}
}

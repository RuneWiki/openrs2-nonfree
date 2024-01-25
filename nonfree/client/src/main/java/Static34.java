import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!b", name = "r", descriptor = "Lclient!m;")
	public static final Class235 aClass235_3 = new Class235(50);

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)I")
	public static int method514(@OriginalArg(1) int arg0) {
		@Pc(22) byte local22;
		if (arg0 > 12000) {
			Static6.method104();
			local22 = 4;
		} else if (arg0 > 5000) {
			local22 = 3;
			Static67.method820();
		} else if (arg0 > 2000) {
			local22 = 2;
			Static413.method6147();
		} else {
			Static209.method3106();
			local22 = 1;
		}
		if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() != 2) {
			Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.lb, 2);
			Static718.method9389(2, false);
		}
		Static328.method4885();
		return local22;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZI)Z")
	public static boolean method515(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static213.method3324(arg0, arg1) || Static486.method7076(arg1, arg0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
	public static void method517(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static470.anInt8264 == 1) {
			Static2.method9131(Static356.aClass3_Sub4_Sub5_1, arg0, arg1);
		} else if (Static470.anInt8264 == 2) {
			if (Static178.aBoolean264) {
				Static165.method2652(Static143.method2382() + arg1, arg0 + Static448.method6652());
			} else {
				Static165.method2652(arg1, arg0);
			}
		}
		Static356.aClass3_Sub4_Sub5_1 = null;
		Static470.anInt8264 = 0;
	}
}

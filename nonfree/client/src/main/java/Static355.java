import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "Lclient!ha;")
	public static Class101 aClass101_8;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V")
	public static void method6354() throws IOException {
		if (Static395.aClass207_2 == null || Static544.anInt9515 <= 0) {
			return;
		}
		Static296.aClass2_Sub8_5.anInt5725 = 0;
		while (true) {
			@Pc(17) Class2_Sub52 local17 = (Class2_Sub52) Static283.aClass271_28.method7177();
			if (local17 == null || Static296.aClass2_Sub8_5.lb.length - Static296.aClass2_Sub8_5.anInt5725 < local17.anInt10944) {
				Static395.aClass207_2.method5434(Static296.aClass2_Sub8_5.lb, Static296.aClass2_Sub8_5.anInt5725);
				Static585.anInt10191 += Static296.aClass2_Sub8_5.anInt5725;
				Static312.anInt5632 = 0;
				break;
			}
			Static296.aClass2_Sub8_5.method5160(local17.aClass2_Sub8_Sub2_2.lb, local17.anInt10944, 0);
			Static544.anInt9515 -= local17.anInt10944;
			local17.method9825();
			local17.aClass2_Sub8_Sub2_2.method5199();
			local17.method9355();
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZ)I")
	public static int method6356(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}

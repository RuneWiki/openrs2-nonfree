import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
	public static int anInt3629;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	public static int anInt3622 = 0;

	@OriginalMember(owner = "client!gh", name = "B", descriptor = "Lclient!dda;")
	public static final Class66 aClass66_3 = new Class66();

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)V")
	public static void method3106() {
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub25_2, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub25_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub7_1, 1);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub7_2, 1);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub29_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub11_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub16_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub9_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub19_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub3_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub18_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub26_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub28_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub30_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub20_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub20_2, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub5_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub21_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub12_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub27_1, 0);
		Static662.method8298();
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub24_1, 2);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub1_1, 1);
		Static523.method7451();
		Static538.method6234();
		Static169.aBoolean257 = true;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZI)Z")
	public static boolean method3107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static597.method8214(arg1, arg0) || Static381.method5735(arg1, arg0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)I")
	public static int method3108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = 0;
		while (arg0 > 0) {
			local14 = arg1 & 0x1 | local14 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local14;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I")
	public static int method3109(@OriginalArg(0) int arg0) {
		@Pc(7) Class67 local7 = Static488.aClass67_12;
		@Pc(9) boolean local9 = false;
		if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() != 0) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(100, 100);
			local7 = Static494.method7146(0, (Interface2) null, 0, local21, (Class221) null);
			local9 = true;
		}
		@Pc(38) long local38 = Static626.method8479();
		for (@Pc(40) int local40 = 0; local40 < 10000; local40++) {
			local7.method7708();
		}
		@Pc(72) int local72 = (int) (Static626.method8479() - local38);
		if (arg0 < 65) {
			return -101;
		}
		local7.method7696(0, 100, 100, 0, -16777216);
		if (local9) {
			local7.method7681();
		}
		return local72;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)I")
	public static int method3110(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}

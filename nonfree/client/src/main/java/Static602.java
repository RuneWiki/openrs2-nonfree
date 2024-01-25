import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "[I")
	public static final int[] anIntArray607 = new int[64];

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)Lclient!ts;")
	public static Class3_Sub48 method8212() {
		@Pc(7) Class150 local7 = null;
		@Pc(13) Class3_Sub48 local13 = new Class3_Sub48(Static648.aClass62_16, 0);
		try {
			@Pc(19) Class376 local19 = Static379.aClass228_6.method5935("");
			while (local19.anInt10510 == 0) {
				Static500.method7308(1L);
			}
			if (local19.anInt10510 == 1) {
				local7 = (Class150) local19.anObject19;
				@Pc(41) byte[] local41 = new byte[(int) local7.method4654()];
				@Pc(56) int local56;
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43 += local56) {
					local56 = local7.method4658(local41.length - local43, local43, local41);
					if (local56 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class3_Sub48(new Class3_Sub15(local41), Static648.aClass62_16, 0);
			}
		} catch (@Pc(89) Exception local89) {
		}
		try {
			if (local7 != null) {
				local7.method4653();
			}
		} catch (@Pc(104) Exception local104) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method8214(@OriginalArg(0) Class33 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static349.aBoolean590) {
			local7 = Static477.method7033();
			local9 = Static10.method114();
		}
		arg0.KA(local7, local9, Static114.anInt2970 + local7, local9 + 350);
		arg0.aa(local7, local9, Static114.anInt2970, 350, Static149.anInt3689 << 24 | 0x332277, 1);
		Static241.method4616(local9 + 350, local9, local7 + Static114.anInt2970, local7);
		@Pc(55) int local55 = 350 / Static120.anInt3091;
		@Pc(72) int local72;
		if (Static30.anInt576 > 0) {
			@Pc(62) int local62 = 342 - Static120.anInt3091;
			local72 = local62 * local55 / (Static30.anInt576 + local55 - 1);
			@Pc(74) int local74 = 4;
			if (Static30.anInt576 > 1) {
				local74 = (local62 - local72) * (Static30.anInt576 + -1 + -Static558.anInt9506) / (Static30.anInt576 - 1) + 4;
			}
			arg0.aa(local7 + Static114.anInt2970 - 16, local74 + local9, 12, local72, Static149.anInt3689 << 24 | 0x332277, 2);
			for (@Pc(116) int local116 = Static558.anInt9506; local116 < Static558.anInt9506 + local55 && local116 < Static30.anInt576; local116++) {
				@Pc(125) String[] local125 = Static107.method2685('\b', Static457.aStringArray34[local116]);
				@Pc(132) int local132 = (Static114.anInt2970 - 24) / local125.length;
				for (@Pc(134) int local134 = 0; local134 < local125.length; local134++) {
					@Pc(142) int local142 = local132 * local134 + 8;
					arg0.KA(local142 + local7, local9, local132 + local142 + local7 - 8, local9 + 350);
					Static528.aClass25_7.method5838(-1, -16777216, Static90.method2287(local125[local134]), local142 + local7, -Static424.aClass315_16.anInt9180 + -2 + -Static313.anInt6367 + 350 + local9 + -(Static120.anInt3091 * (-Static558.anInt9506 + local116)));
				}
			}
		}
		Static641.aClass25_14.method5856(Static114.anInt2970 + local7 - 25, "Build: 636", -16777216, local9 + 330, -1);
		arg0.KA(local7, local9, Static114.anInt2970 + local7, local9 + 350);
		arg0.method6162(Static114.anInt2970, local9 + 350 - Static313.anInt6367, -1, local7);
		Static16.aClass25_1.method5838(-1, -16777216, "--> " + Static90.method2287(Static197.aString45), local7 + 10, -Static224.aClass315_11.anInt9180 + local9 + 350 - 1);
		if (!Static386.aBoolean722) {
			return;
		}
		local72 = -1;
		if (Static251.anInt5580 % 30 > 15) {
			local72 = 16777215;
		}
		arg0.method6208(Static224.aClass315_11.method7572("--> " + Static90.method2287(Static197.aString45).substring(0, Static230.anInt5186)) + local7 + 10, -Static224.aClass315_11.anInt9180 + 350 + local9 + -11, local72, 12);
	}
}

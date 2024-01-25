import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "Z")
	public static boolean aBoolean592;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "Lclient!ha;")
	public static Class57 aClass57_11;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "Lclient!ef;")
	public static final Class102 aClass102_50 = new Class102();

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "[I")
	public static final int[] anIntArray469 = new int[14];

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLclient!haa;[[B)V")
	public static void method6721(@OriginalArg(1) Class153_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20 = arg1.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(28) byte[] local28 = arg1[local22];
			if (local28 != null) {
				@Pc(35) Class5_Sub23 local35 = new Class5_Sub23(local28);
				local41 = Static672.anIntArray621[local22] >> 8;
				@Pc(47) int local47 = Static672.anIntArray621[local22] & 0xFF;
				@Pc(54) int local54 = local41 * 64 - Static622.anInt10188;
				@Pc(61) int local61 = local47 * 64 - Static668.anInt10683;
				Static62.method873();
				arg0.method3014(local61, Static670.aClass88Array1, Static668.anInt10683, local54, (byte) -65, local35, Static622.anInt10188);
				arg0.method3030(local35, aClass57_11, local61, local54, local17);
				if (!arg0.aBoolean274 && local41 == Static128.anInt6986 / 8 && Static353.anInt6205 / 8 == local47 && local17[0] != -1) {
					Static86.aClass311_1 = Static162.aClass181_1.method3885(local17[2], local17[3], local17[1], local17[0], Static112.aClass321_1);
					Static581.anInt9735 = local17[4];
				}
			}
		}
		for (@Pc(140) int local140 = 0; local140 < local20; local140++) {
			@Pc(152) int local152 = (Static672.anIntArray621[local140] >> 8) * 64 - Static622.anInt10188;
			local41 = (Static672.anIntArray621[local140] & 0xFF) * 64 - Static668.anInt10683;
			@Pc(167) byte[] local167 = arg1[local140];
			if (local167 == null && Static353.anInt6205 < 800) {
				Static62.method873();
				arg0.method3019(local41, local152);
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!wia;Lclient!sa;B)Lclient!tia;")
	public static Class5_Sub50 method6722(@OriginalArg(0) Class387 arg0, @OriginalArg(1) Class313 arg1) {
		@Pc(16) Class5_Sub50 local16 = Static313.method4765();
		local16.aClass387_108 = arg0;
		local16.anInt9624 = arg0.anInt10659;
		if (local16.anInt9624 == -1) {
			local16.aClass5_Sub23_Sub2_2 = new Class5_Sub23_Sub2(260);
		} else if (local16.anInt9624 == -2) {
			local16.aClass5_Sub23_Sub2_2 = new Class5_Sub23_Sub2(10000);
		} else if (local16.anInt9624 <= 18) {
			local16.aClass5_Sub23_Sub2_2 = new Class5_Sub23_Sub2(20);
		} else if (local16.anInt9624 > 98) {
			local16.aClass5_Sub23_Sub2_2 = new Class5_Sub23_Sub2(260);
		} else {
			local16.aClass5_Sub23_Sub2_2 = new Class5_Sub23_Sub2(100);
		}
		local16.aClass5_Sub23_Sub2_2.method8551(arg1);
		local16.aClass5_Sub23_Sub2_2.method8547(local16.aClass387_108.method9175());
		local16.anInt9621 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method6724(@OriginalArg(0) Class57 arg0) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		if (Static40.aBoolean61) {
			local15 = Static169.method2467();
			local17 = Static375.method5510();
		}
		Static474.method6911(Static498.anInt8306, local17 + Static507.anInt8693, local15 + Static327.anInt5831, arg0, Static42.anInt1723);
		Static533.aClass80_10.method8780(-1, Static582.aClass335_25.method8349(Static323.anInt5795), Static507.anInt8693 + local17 + 14, -10660793, local15 + Static327.anInt5831 - -3);
		@Pc(66) int local66 = Static205.aClass107_1.method4079() + local15;
		@Pc(72) int local72 = local17 + Static205.aClass107_1.method4072();
		@Pc(76) int local76;
		@Pc(93) int local93;
		if (Static320.aBoolean437) {
			local76 = 0;
			for (@Pc(81) Class5_Sub5_Sub18 local81 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2890(); local81 != null; local81 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2894()) {
				local93 = Static507.anInt8693 + local17 + local76 * 16 + 31;
				if (local81.anInt7610 == 1) {
					Static476.method6935(Static42.anInt1723, Static327.anInt5831 + local15, Static498.anInt8306, -256, local72, -1, local66, (Class5_Sub5_Sub19) local81.aClass149_8.aClass5_Sub5_24.aClass5_Sub5_66, local93, arg0, local17 + Static507.anInt8693);
				} else {
					Static394.method5768(Static42.anInt1723, local93, Static507.anInt8693 + local17, -1, local66, local72, local81, Static327.anInt5831 + local15, arg0, Static498.anInt8306, -256);
				}
				local76++;
			}
			if (Static604.aClass5_Sub5_Sub18_1 != null) {
				Static474.method6911(Static493.anInt8236, Static422.anInt7304, Static652.anInt10541, arg0, Static101.anInt1607);
				local76 = 0;
				Static533.aClass80_10.method8780(-1, Static604.aClass5_Sub5_Sub18_1.aString102, Static422.anInt7304 + 14, -10660793, Static652.anInt10541 + 3);
				for (@Pc(184) Class5_Sub5_Sub19 local184 = (Class5_Sub5_Sub19) Static604.aClass5_Sub5_Sub18_1.aClass149_8.method2890(); local184 != null; local184 = (Class5_Sub5_Sub19) Static604.aClass5_Sub5_Sub18_1.aClass149_8.method2894()) {
					@Pc(196) int local196 = Static422.anInt7304 + local76 * 16 + 31;
					Static476.method6935(Static101.anInt1607, Static652.anInt10541, Static493.anInt8236, -256, local72, -1, local66, local184, local196, arg0, Static422.anInt7304);
					local76++;
				}
				Static61.method869(Static493.anInt8236, Static422.anInt7304, Static101.anInt1607, Static652.anInt10541);
			}
		} else {
			local76 = 0;
			for (@Pc(237) Class5_Sub5_Sub19 local237 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1916(); local237 != null; local237 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1915()) {
				local93 = (Static481.anInt8130 - local76 - 1) * 16 + local17 + Static507.anInt8693 + 31;
				local76++;
				Static476.method6935(Static42.anInt1723, local15 + Static327.anInt5831, Static498.anInt8306, -256, local72, -1, local66, local237, local93, arg0, Static507.anInt8693 + local17);
			}
		}
		Static61.method869(Static498.anInt8306, Static507.anInt8693 + local17, Static42.anInt1723, Static327.anInt5831 + local15);
	}
}

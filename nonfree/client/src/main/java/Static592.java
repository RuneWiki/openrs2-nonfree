import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!ur", name = "p", descriptor = "I")
	public static volatile int anInt9857 = -1;

	@OriginalMember(owner = "client!ur", name = "u", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_210 = new Class200(81, 6);

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)V")
	public static void method8362() {
		Static301.aClass301Array1 = new Class301[50];
		Static110.anInt2383 = 0;
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)I")
	public static int method8363() {
		if (Static221.anInt4143 == 0) {
			Static316.aClass208_2.method4867(new Class223("jaclib"));
			if (Static316.aClass208_2.method4863().method6364() != 100) {
				return 1;
			}
			if (!((Class223) Static316.aClass208_2.method4863()).method5313()) {
				Static509.aClient1.method1716();
			}
			Static221.anInt4143 = 1;
		}
		@Pc(247) int local247;
		@Pc(270) int local270;
		@Pc(286) int local286;
		@Pc(292) int local292;
		if (Static221.anInt4143 == 1) {
			Static46.aClass208Array3 = Static316.method4869();
			Static316.aClass208_1.method4867(new Class229(Static546.aClass238_245));
			Static316.aClass208_3.method4867(new Class223("jaggl"));
			Static316.aClass208_4.method4867(new Class223("jagdx"));
			Static316.aClass208_5.method4867(new Class223("jagmisc"));
			Static316.aClass208_6.method4867(new Class223("sw3d"));
			Static316.aClass208_7.method4867(new Class223("hw3d"));
			Static316.aClass208_8.method4867(new Class223("jagtheora"));
			Static316.aClass208_9.method4867(new Class229(Static98.aClass238_299));
			Static316.aClass208_10.method4867(new Class229(Static213.aClass238_102));
			Static316.aClass208_11.method4867(new Class229(Static215.aClass238_103));
			Static316.aClass208_12.method4867(new Class229(Static425.aClass238_197));
			Static316.aClass208_13.method4867(new Class229(Static120.aClass238_57));
			Static316.aClass208_14.method4867(new Class229(Static26.aClass238_15));
			Static316.aClass208_15.method4867(new Class229(Static444.aClass238_206));
			Static316.aClass208_16.method4867(new Class229(Static556.aClass238_253));
			Static316.aClass208_17.method4867(new Class229(Static258.aClass238_119));
			Static316.aClass208_18.method4867(new Class229(Static367.aClass238_170));
			Static316.aClass208_19.method4867(new Class229(Static332.aClass238_154));
			Static316.aClass208_20.method4867(new Class229(Static388.aClass238_178));
			Static316.aClass208_21.method4867(new Class229(Static305.aClass238_141));
			Static316.aClass208_22.method4867(new Class229(Static562.aClass238_256));
			Static316.aClass208_23.method4867(new Class136(Static143.aClass238_70, "huffman"));
			Static316.aClass208_24.method4867(new Class229(Static493.aClass238_222));
			Static316.aClass208_25.method4867(new Class229(Static222.aClass238_106));
			Static316.aClass208_26.method4867(new Class229(Static419.aClass238_210));
			Static316.aClass208_27.method4867(new Class275(Static178.aClass238_289, "details"));
			for (local247 = 0; local247 < Static46.aClass208Array3.length; local247++) {
				if (Static46.aClass208Array3[local247].method4863() == null) {
					throw new RuntimeException();
				}
			}
			local270 = 0;
			@Pc(272) Class208[] local272 = Static46.aClass208Array3;
			for (@Pc(274) int local274 = 0; local274 < local272.length; local274++) {
				@Pc(280) Class208 local280 = local272[local274];
				local286 = local280.method4861();
				local292 = local280.method4863().method6364();
				local270 += local292 * local286 / 100;
			}
			Static221.anInt4143 = 2;
			Static179.anInt3587 = local270;
		}
		if (Static46.aClass208Array3 == null) {
			return 100;
		}
		local247 = 0;
		local270 = 0;
		@Pc(323) boolean local323 = true;
		@Pc(325) Class208[] local325 = Static46.aClass208Array3;
		for (@Pc(327) int local327 = 0; local327 < local325.length; local327++) {
			@Pc(333) Class208 local333 = local325[local327];
			local292 = local333.method4861();
			@Pc(343) int local343 = local333.method4863().method6364();
			if (local343 < 100) {
				local323 = false;
			}
			local270 += local292 * local343 / 100;
			local247 += local292;
		}
		if (local323) {
			if (!((Class223) Static316.aClass208_5.method4863()).method5313()) {
				Static509.aClient1.method1706();
			}
			if (!((Class223) Static316.aClass208_8.method4863()).method5313()) {
				Static31.aBoolean67 = Static509.aClient1.method1713();
			}
			Static46.aClass208Array3 = null;
		}
		local247 -= Static179.anInt3587;
		local270 -= Static179.anInt3587;
		local286 = local247 > 0 ? local270 * 100 / local247 : 100;
		if (!local323 && local286 > 99) {
			local286 = 99;
		}
		return local286;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)I")
	public static int method8365(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static186.method3193(arg0 + 45365, arg1 + 91923, 4) + (Static186.method3193(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Static186.method3193(arg0, arg1, 1) + -128 >> 2) - 128;
		local47 = (int) ((double) local47 * 0.3D) + 35;
		if (local47 < 10) {
			local47 = 10;
		} else if (local47 > 60) {
			local47 = 60;
		}
		return local47;
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)V")
	public static void method8366() {
		if (Static454.anInt7416 == 3) {
			Static213.method3541(4);
		} else if (Static454.anInt7416 == 7) {
			Static213.method3541(8);
		} else if (Static454.anInt7416 == 10) {
			Static213.method3541(11);
			return;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!of", name = "U", descriptor = "I")
	public static int anInt2826;

	@OriginalMember(owner = "client!of", name = "lb", descriptor = "Lclient!f;")
	public static Class13 aClass13_22;

	@OriginalMember(owner = "client!of", name = "T", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1590 = Static122.method531("logo");

	@OriginalMember(owner = "client!of", name = "jb", descriptor = "[I")
	public static int[] anIntArray305 = new int[128];

	@OriginalMember(owner = "client!of", name = "kb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1591 = Static122.method531("Einloggen");

	@OriginalMember(owner = "client!of", name = "nb", descriptor = "I")
	public static int anInt2841 = 0;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
	public static void method2089() {
		aClass73_1591 = null;
		aClass13_22 = null;
		anIntArray305 = null;
		aClass73_1590 = null;
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "(I)V")
	public static void method2091() {
		@Pc(10) int local10 = Static159.aClass3_Sub12_Sub1_4.method1403(8);
		@Pc(19) int local19;
		if (Static6.anInt158 > local10) {
			for (local19 = local10; local19 < Static6.anInt158; local19++) {
				Static149.anIntArray364[Static2.anInt13++] = Static47.anIntArray184[local19];
			}
		}
		if (Static6.anInt158 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static6.anInt158 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(57) int local57 = Static47.anIntArray184[local19];
			@Pc(61) Class3_Sub1_Sub4_Sub7_Sub1 local61 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local57];
			@Pc(66) int local66 = Static159.aClass3_Sub12_Sub1_4.method1403(1);
			if (local66 == 0) {
				Static47.anIntArray184[Static6.anInt158++] = local57;
				local61.anInt3177 = Static44.anInt1024;
			} else {
				@Pc(89) int local89 = Static159.aClass3_Sub12_Sub1_4.method1403(2);
				if (local89 == 0) {
					Static47.anIntArray184[Static6.anInt158++] = local57;
					local61.anInt3177 = Static44.anInt1024;
					Static2.anIntArray1[Static181.anInt3975++] = local57;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local89 == 1) {
						Static47.anIntArray184[Static6.anInt158++] = local57;
						local61.anInt3177 = Static44.anInt1024;
						local134 = Static159.aClass3_Sub12_Sub1_4.method1403(3);
						local61.method2272(false, local134);
						local144 = Static159.aClass3_Sub12_Sub1_4.method1403(1);
						if (local144 == 1) {
							Static2.anIntArray1[Static181.anInt3975++] = local57;
						}
					} else if (local89 == 2) {
						Static47.anIntArray184[Static6.anInt158++] = local57;
						local61.anInt3177 = Static44.anInt1024;
						local134 = Static159.aClass3_Sub12_Sub1_4.method1403(3);
						local61.method2272(true, local134);
						local144 = Static159.aClass3_Sub12_Sub1_4.method1403(3);
						local61.method2272(true, local144);
						@Pc(200) int local200 = Static159.aClass3_Sub12_Sub1_4.method1403(1);
						if (local200 == 1) {
							Static2.anIntArray1[Static181.anInt3975++] = local57;
						}
					} else if (local89 == 3) {
						Static149.anIntArray364[Static2.anInt13++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!kf;B)V")
	public static void method2093(@OriginalArg(0) Class3_Sub1_Sub3_Sub3 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static37.anIntArray92.length; local3++) {
			Static37.anIntArray92[local3] = 0;
		}
		@Pc(36) int local36;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local36 = (int) ((double) 256 * Math.random() * 128.0D);
			Static37.anIntArray92[local36] = (int) (Math.random() * 256.0D);
		}
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(73) int local73;
		for (local36 = 0; local36 < 20; local36++) {
			for (local60 = 1; local60 < 255; local60++) {
				for (local64 = 1; local64 < 127; local64++) {
					local73 = local64 + (local60 << 7);
					Static84.anIntArray192[local73] = (Static37.anIntArray92[local73 + 128] + Static37.anIntArray92[local73 - 128] + Static37.anIntArray92[local73 + -1] + Static37.anIntArray92[local73 + 1]) / 4;
				}
			}
			@Pc(115) int[] local115 = Static37.anIntArray92;
			Static37.anIntArray92 = Static84.anIntArray192;
			Static84.anIntArray192 = local115;
		}
		if (arg0 == null) {
			return;
		}
		local60 = 0;
		for (local64 = 0; local64 < arg0.anInt1914; local64++) {
			for (local73 = 0; local73 < arg0.anInt1917; local73++) {
				if (arg0.aByteArray17[local60++] != 0) {
					@Pc(153) int local153 = arg0.anInt1918 + local73 + 16;
					@Pc(160) int local160 = arg0.anInt1919 + local64 + 16;
					@Pc(167) int local167 = local153 + (local160 << 7);
					Static37.anIntArray92[local167] = 0;
				}
			}
		}
	}
}

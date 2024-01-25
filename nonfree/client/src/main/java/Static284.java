import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Lclient!sea;")
	public static Class308 aClass308_177;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!oh;")
	public static final Class252 aClass252_17 = new Class252(0, 1);

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!em;")
	public static Class83 aClass83_193 = null;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!r;)V")
	public static void method7242(@OriginalArg(1) Class78 arg0) {
		arg0.da(0, 0, Static349.anInt6422, 350);
		arg0.J(0, 0, Static349.anInt6422, 350, Static166.anInt7795 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static72.anInt1404;
		@Pc(36) int local36;
		if (Static296.anInt5348 > 0) {
			local36 = 346 - Static72.anInt1404 - 4;
			@Pc(47) int local47 = local36 * local27 / (local27 + Static296.anInt5348 - 1);
			@Pc(49) int local49 = 4;
			if (Static296.anInt5348 > 1) {
				local49 = (Static296.anInt5348 - Static232.anInt4308 - 1) * (-local47 + local36) / (Static296.anInt5348 - 1) + 4;
			}
			arg0.J(Static349.anInt6422 - 16, local49, 12, local47, Static166.anInt7795 << 24 | 0x332277, 2);
			for (@Pc(85) int local85 = Static232.anInt4308; local27 + Static232.anInt4308 > local85 && Static296.anInt5348 > local85; local85++) {
				@Pc(94) String[] local94 = Static95.method1438(Static425.aStringArray26[local85], '\b');
				@Pc(103) int local103 = (Static349.anInt6422 - 8 - 16) / local94.length;
				for (@Pc(105) int local105 = 0; local105 < local94.length; local105++) {
					@Pc(113) int local113 = local103 * local105 + 8;
					arg0.da(local113, 0, local113 + local103 - 8, 350);
					Static339.aClass96_9.method7257(Static389.method5593(local94[local105]), local113, -1, 350 - Static72.anInt1404 * (local85 - Static232.anInt4308) - Static552.aClass352_20.anInt9302 - Static9.anInt273 - 2, -16777216);
				}
			}
		}
		Static442.aClass96_12.method7244("Build: 626", Static349.anInt6422 - 25, -1, 330, -16777216);
		arg0.da(0, 0, Static349.anInt6422, 350);
		arg0.method6806(Static349.anInt6422, 350 - Static9.anInt273, 0, -1);
		Static62.aClass96_4.method7257("--> " + Static389.method5593(Static366.aString75), 10, -1, 350 - Static88.aClass352_7.anInt9302 - 1, -16777216);
		if (!Static13.aBoolean9) {
			return;
		}
		local36 = -1;
		if (Static518.anInt9331 % 30 > 15) {
			local36 = 16777215;
		}
		arg0.method6803(Static88.aClass352_7.method7572("--> " + Static389.method5593(Static366.aString75).substring(0, Static305.anInt5674)) + 10, 12, 339 - Static88.aClass352_7.anInt9302, local36);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZLclient!bca;)V")
	public static void method7247(@OriginalArg(1) Class11_Sub2 arg0) {
		arg0.aClass11_Sub1_1 = null;
		@Pc(17) int local17 = arg0.aClass11_Sub4Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			arg0.aClass11_Sub4Array1[local19].aBoolean195 = false;
		}
		@Pc(37) Class196[] local37 = Class1_Sub1_Sub34.aClass196Array1;
		synchronized (Class1_Sub1_Sub34.aClass196Array1) {
			if (Class1_Sub1_Sub34.aClass196Array1.length > local17 && Static4.anIntArray591[local17] < 200) {
				Class1_Sub1_Sub34.aClass196Array1[local17].method4032(arg0);
				@Pc(58) int local58 = Static4.anIntArray591[local17]++;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public static void method7254() {
		Static95.aClass207_6.method4398();
	}
}

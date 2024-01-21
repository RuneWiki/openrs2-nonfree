import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!fc", name = "gb", descriptor = "[I")
	public static final int[] anIntArray132 = new int[5];

	@OriginalMember(owner = "client!fc", name = "lb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_931 = Static118.method2249("<img=1>");

	@OriginalMember(owner = "client!fc", name = "ub", descriptor = "I")
	public static final int anInt1486 = 0;

	@OriginalMember(owner = "client!fc", name = "wb", descriptor = "[I")
	public static final int[] anIntArray133 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)V")
	public static void method972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 128 || arg0 < 128 || arg1 > 13056 || arg0 > 13056) {
			Static93.anInt2335 = -1;
			Static141.anInt3425 = -1;
			return;
		}
		@Pc(33) int local33 = Static171.method2896(arg1, Static207.anInt4425, arg0) - arg2;
		@Pc(37) int local37 = local33 - Static97.anInt2437;
		@Pc(41) int local41 = arg0 - Static160.anInt2779;
		@Pc(45) int local45 = arg1 - Static78.anInt1919;
		@Pc(49) int local49 = Class1_Sub2_Sub5_Sub2.anIntArray138[Static34.anInt999];
		@Pc(53) int local53 = Class1_Sub2_Sub5_Sub2.anIntArray142[Static34.anInt999];
		@Pc(57) int local57 = Class1_Sub2_Sub5_Sub2.anIntArray138[Static126.anInt3116];
		@Pc(61) int local61 = Class1_Sub2_Sub5_Sub2.anIntArray142[Static126.anInt3116];
		@Pc(71) int local71 = local61 * local45 + local41 * local57 >> 16;
		@Pc(81) int local81 = local41 * local61 - local45 * local57 >> 16;
		@Pc(83) int local83 = local71;
		@Pc(93) int local93 = local53 * local37 - local49 * local81 >> 16;
		@Pc(103) int local103 = local53 * local81 + local49 * local37 >> 16;
		if (local103 < 50) {
			Static93.anInt2335 = -1;
			Static141.anInt3425 = -1;
		} else {
			Static93.anInt2335 = (local93 << 9) / local103 + 167;
			Static141.anInt3425 = (local83 << 9) / local103 + 256;
		}
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)V")
	public static void method974() {
		Static20.anInt624 = 0;
		Static95.anInt2376 = 0;
		Static200.method3234();
		Static193.method3166();
		Static35.method669();
		@Pc(24) int local24;
		for (@Pc(19) int local19 = 0; local19 < Static20.anInt624; local19++) {
			local24 = Static142.anIntArray392[local19];
			if (Static106.aClass6_Sub4_Sub2Array1[local24].anInt3975 != Static174.anInt3887) {
				Static106.aClass6_Sub4_Sub2Array1[local24].aClass1_Sub2_Sub11_1 = null;
				Static106.aClass6_Sub4_Sub2Array1[local24] = null;
			}
		}
		if (Static62.anInt1604 != Static1.aClass1_Sub14_Sub1_43.anInt2306) {
			throw new RuntimeException("gnp1 pos:" + Static1.aClass1_Sub14_Sub1_43.anInt2306 + " psize:" + Static62.anInt1604);
		}
		for (local24 = 0; local24 < Static22.anInt659; local24++) {
			if (Static106.aClass6_Sub4_Sub2Array1[Static72.anIntArray197[local24]] == null) {
				throw new RuntimeException("gnp2 pos:" + local24 + " size:" + Static22.anInt659);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
	public static void method976() {
		try {
			if (Static180.aClass79_6 == null) {
				Static180.aClass79_6 = new Class79(Static153.aClass14_3, Static109.method2004(new Class65[] { Static108.aClass65_1553, Static118.method2250(Static107.anInt2630), Static1.aClass65_2605 }).method2458());
			} else {
				@Pc(7) byte[] local7 = Static180.aClass79_6.method2764();
				if (local7 != null) {
					@Pc(14) Class1_Sub14 local14 = new Class1_Sub14(local7);
					Static84.anInt2050 = local14.method1753();
					Static195.aClass3Array1 = new Class3[Static84.anInt2050];
					for (@Pc(23) int local23 = 0; local23 < Static84.anInt2050; local23++) {
						@Pc(33) Class3 local33 = Static195.aClass3Array1[local23] = new Class3();
						@Pc(37) int local37 = local14.method1753();
						local33.aBoolean4 = (local37 & 0x8000) != 0;
						local33.anInt93 = local37 & 0x7FFF;
						local33.aClass65_57 = local14.method1706();
						local33.anInt91 = local14.method1729();
						local33.anInt92 = local23;
						local33.anInt89 = Static27.method487(local14.method1753());
					}
					Static188.method3127(0, Static184.anIntArray462, Static195.aClass3Array1.length - 1, Static77.anIntArray217, Static195.aClass3Array1);
					Static206.aBoolean184 = true;
					Static180.aClass79_6 = null;
				}
			}
		} catch (@Pc(123) Exception local123) {
			local123.printStackTrace();
			Static180.aClass79_6 = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)V")
	public static void method977() {
		Static200.anInt4299 = 0;
		Static42.anInt1110 = -1;
		Static16.anInt446 = 2;
		Static70.aBoolean78 = false;
		Static191.anInt4167 = 1;
		Static163.anInt3686 = -1;
		Static62.aClass60_14 = null;
	}
}

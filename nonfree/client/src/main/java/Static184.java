import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!it", name = "w", descriptor = "[[Lclient!fi;")
	public static Class76[][] aClass76ArrayArray2;

	@OriginalMember(owner = "client!it", name = "p", descriptor = "[Lclient!dv;")
	public static final Class55[] aClass55Array1 = new Class55[16];

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!fi;)Ljava/lang/String;")
	public static String method2504(@OriginalArg(1) Class76 arg0) {
		if (Static55.method885(arg0).method5384() == 0) {
			return null;
		} else if (arg0.aString18 == null || arg0.aString18.trim().length() == 0) {
			return Static97.aBoolean113 ? "Hidden-use" : null;
		} else {
			return arg0.aString18;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method2505(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(9) int local9 = arg0.method5542();
		Static39.aClass147Array1 = new Class147[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static39.aClass147Array1[local14] = new Class147();
			Static39.aClass147Array1[local14].anInt3855 = arg0.method5542();
			Static39.aClass147Array1[local14].aString43 = arg0.method5601();
		}
		Static436.anInt5879 = arg0.method5542();
		Static136.anInt7479 = arg0.method5542();
		Static283.anInt4397 = arg0.method5542();
		Static398.aClass50_Sub1Array2 = new Class50_Sub1[Static136.anInt7479 + 1 - Static436.anInt5879];
		for (@Pc(70) int local70 = 0; local70 < Static283.anInt4397; local70++) {
			@Pc(76) int local76 = arg0.method5542();
			@Pc(84) Class50_Sub1 local84 = Static398.aClass50_Sub1Array2[local76] = new Class50_Sub1();
			local84.anInt1380 = arg0.method5539();
			local84.anInt1376 = arg0.method5603();
			local84.anInt1389 = Static436.anInt5879 + local76;
			local84.aString7 = arg0.method5601();
			local84.aString6 = arg0.method5601();
		}
		Static166.anInt2869 = arg0.method5603();
		Static125.aBoolean156 = true;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
	public static void method2506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class5_Sub2_Sub9 local12 = Static72.method1073(7, arg1);
		local12.method3026();
		local12.anInt3818 = arg0;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!um;BLclient!um;)I")
	public static int method2513(@OriginalArg(0) Class243 arg0, @OriginalArg(2) Class243 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method5463(Static425.anInt7119)) {
			local5++;
		}
		if (arg1.method5463(Static147.anInt2653)) {
			local5++;
		}
		if (arg1.method5463(Static54.anInt951)) {
			local5++;
		}
		if (arg0.method5463(Static425.anInt7119)) {
			local5++;
		}
		if (arg0.method5463(Static147.anInt2653)) {
			local5++;
		}
		if (arg0.method5463(Static54.anInt951)) {
			local5++;
		}
		return local5;
	}
}

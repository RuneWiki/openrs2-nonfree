import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ha", name = "bb", descriptor = "I")
	public static int anInt3474;

	@OriginalMember(owner = "client!ha", name = "jb", descriptor = "[Lclient!ig;")
	public static Class12[] aClass12Array11;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_58 = new Class231("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)I")
	public static int method3082() {
		return 16;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIJ)V")
	public static void method3084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(21) int local21 = (int) arg2 >> 20 & 0x3;
		@Pc(28) int local28 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static367.method5800(0, true, 0, local10, arg1, arg0, 0, local21);
			return;
		}
		@Pc(44) Class118 local44 = Static113.aClass127_2.method2820(local28);
		@Pc(57) int local57;
		@Pc(60) int local60;
		if (local21 == 0 || local21 == 2) {
			local57 = local44.anInt2997;
			local60 = local44.anInt3025;
		} else {
			local60 = local44.anInt2997;
			local57 = local44.anInt3025;
		}
		@Pc(71) int local71 = local44.anInt3000;
		if (local21 != 0) {
			local71 = (local71 << local21 & 0xF) + (local71 >> 4 - local21);
		}
		Static367.method5800(local57, true, local60, 0, arg1, arg0, local71, 0);
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(Z)V")
	public static void method3102() {
		if (Static336.anInt5655 <= 0) {
			Static427.aString67 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static183.aStringArray40.length; local14++) {
			if (Static183.aStringArray40[local14].startsWith("--> ")) {
				local12++;
				if (Static336.anInt5655 == local12) {
					Static427.aString67 = Static183.aStringArray40[local14].substring(4);
					break;
				}
			}
		}
	}
}

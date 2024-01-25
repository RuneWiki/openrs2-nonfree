import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ns", name = "A", descriptor = "I")
	public static int anInt5516;

	@OriginalMember(owner = "client!ns", name = "D", descriptor = "Lclient!ua;")
	public static Class241 aClass241_12;

	@OriginalMember(owner = "client!ns", name = "E", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_130 = new Class119("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZ)V")
	public static void method4340(@OriginalArg(0) int arg0) {
		Static32.anInt526 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ns;Z)Z")
	public static boolean method4344(@OriginalArg(0) Class25_Sub5 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static94.aClass157Array1 == Static343.aClass157Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method4343();
		if (arg0.aShort97 < 0 || arg0.aShort94 < 0 || arg0.aShort96 >= Static37.anInt666 || arg0.aShort95 >= Static408.anInt6716) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort97; local34 <= arg0.aShort96; local34++) {
			for (local38 = arg0.aShort94; local38 <= arg0.aShort95; local38++) {
				@Pc(45) Class169 local45 = Static175.method2473(arg0.aByte94, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort97) {
						local49++;
					}
					if (local34 < arg0.aShort96) {
						local49 += 4;
					}
					if (local38 > arg0.aShort94) {
						local49 += 8;
					}
					if (local38 < arg0.aShort95) {
						local49 += 2;
					}
					@Pc(74) Class27 local74 = Static133.method2053(local49, arg0);
					@Pc(77) Class27 local77 = local45.aClass27_3;
					if (local77 == null) {
						local45.aClass27_3 = local74;
					} else {
						while (local77.aClass27_1 != null) {
							local77 = local77.aClass27_1;
						}
						local77.aClass27_1 = local74;
					}
					local45.aByte80 = (byte) (local45.aByte80 | local49);
					if (local6 && (Static47.anIntArrayArray10[local34][local38] & 0xFF000000) != 0) {
						local8 = Static47.anIntArrayArray10[local34][local38];
						local10 = Static142.aShortArrayArray4[local34][local38];
						local12 = Static438.aByteArrayArray19[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort97; local38 <= arg0.aShort96; local38++) {
				for (@Pc(150) int local150 = arg0.aShort94; local150 <= arg0.aShort95; local150++) {
					if ((Static47.anIntArrayArray10[local38][local150] & 0xFF000000) == 0) {
						Static47.anIntArrayArray10[local38][local150] = local8;
						Static142.aShortArrayArray4[local38][local150] = local10;
						Static438.aByteArrayArray19[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static372.aClass25_Sub5Array2[Static131.anInt2379++] = arg0;
		}
		return true;
	}
}

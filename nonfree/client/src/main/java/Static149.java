import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "Lclient!bu;")
	public static Class32 aClass32_43;

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
	public static int anInt3020 = -50;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!nu;Z)Z")
	public static boolean method2419(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static444.aClass159Array3 == Static85.aClass159Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method3493();
		if (arg0.aShort71 < 0 || arg0.aShort73 < 0 || arg0.aShort72 >= Static405.anInt6684 || arg0.aShort70 >= Static37.anInt1025) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort71; local34 <= arg0.aShort72; local34++) {
			for (local38 = arg0.aShort73; local38 <= arg0.aShort70; local38++) {
				@Pc(45) Class118 local45 = Static450.method5835(arg0.aByte77, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort71) {
						local49++;
					}
					if (local34 < arg0.aShort72) {
						local49 += 4;
					}
					if (local38 > arg0.aShort73) {
						local49 += 8;
					}
					if (local38 < arg0.aShort70) {
						local49 += 2;
					}
					@Pc(74) Class179 local74 = Static96.method1700(local49, arg0);
					@Pc(77) Class179 local77 = local45.aClass179_2;
					if (local77 == null) {
						local45.aClass179_2 = local74;
					} else {
						while (local77.aClass179_3 != null) {
							local77 = local77.aClass179_3;
						}
						local77.aClass179_3 = local74;
					}
					local45.aByte62 = (byte) (local45.aByte62 | local49);
					if (local6 && (Static305.anIntArrayArray37[local34][local38] & 0xFF000000) != 0) {
						local8 = Static305.anIntArrayArray37[local34][local38];
						local10 = Static267.aByteArrayArray12[local34][local38];
						local12 = Static419.aByteArrayArray22[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort71; local38 <= arg0.aShort72; local38++) {
				for (@Pc(150) int local150 = arg0.aShort73; local150 <= arg0.aShort70; local150++) {
					if ((Static305.anIntArrayArray37[local38][local150] & 0xFF000000) == 0) {
						Static305.anIntArrayArray37[local38][local150] = local8;
						Static267.aByteArrayArray12[local38][local150] = local10;
						Static419.aByteArrayArray22[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static434.aClass7_Sub2Array3[Static232.anInt4417++] = arg0;
		}
		return true;
	}
}

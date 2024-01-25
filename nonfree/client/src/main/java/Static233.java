import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!np", name = "f", descriptor = "Lclient!g;")
	public static Class83 aClass83_83;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[128][128];

	@OriginalMember(owner = "client!np", name = "d", descriptor = "Z")
	public static boolean aBoolean335 = false;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "S")
	public static short aShort61 = 256;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "I")
	public static int anInt4642 = 0;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!mt;Z)Z")
	public static boolean method4185(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static128.aClass149Array1 == Static248.aClass149Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5898();
		if (arg0.aShort95 < 0 || arg0.aShort96 < 0 || arg0.aShort97 >= Static176.anInt3742 || arg0.aShort94 >= Static285.anInt5263) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort95; local34 <= arg0.aShort97; local34++) {
			for (local38 = arg0.aShort96; local38 <= arg0.aShort94; local38++) {
				@Pc(45) Class188 local45 = Static226.method4116(arg0.aByte73, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort95) {
						local49++;
					}
					if (local34 < arg0.aShort97) {
						local49 += 4;
					}
					if (local38 > arg0.aShort96) {
						local49 += 8;
					}
					if (local38 < arg0.aShort94) {
						local49 += 2;
					}
					@Pc(74) Class168 local74 = Static259.method4455(local49, arg0);
					@Pc(77) Class168 local77 = local45.aClass168_2;
					if (local77 == null) {
						local45.aClass168_2 = local74;
					} else {
						while (local77.aClass168_1 != null) {
							local77 = local77.aClass168_1;
						}
						local77.aClass168_1 = local74;
					}
					local45.aByte47 = (byte) (local45.aByte47 | local49);
					if (local6 && (Static199.anIntArrayArray19[local34][local38] & 0xFF000000) != 0) {
						local8 = Static199.anIntArrayArray19[local34][local38];
						local10 = Static102.aByteArrayArray8[local34][local38];
						local12 = Static139.aByteArrayArray11[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort95; local38 <= arg0.aShort97; local38++) {
				for (@Pc(150) int local150 = arg0.aShort96; local150 <= arg0.aShort94; local150++) {
					if ((Static199.anIntArrayArray19[local38][local150] & 0xFF000000) == 0) {
						Static199.anIntArrayArray19[local38][local150] = local8;
						Static102.aByteArrayArray8[local38][local150] = local10;
						Static139.aByteArrayArray11[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static313.aClass1_Sub2Array3[Static94.anInt2018++] = arg0;
		}
		return true;
	}
}

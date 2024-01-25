import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!gn;Z)Z")
	public static boolean method6237(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static296.aClass7Array11 == Static207.aClass7Array7;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7800();
		if (arg0.aShort124 < 0 || arg0.aShort123 < 0 || arg0.aShort126 >= Static501.anInt9458 || arg0.aShort125 >= Static420.anInt7323) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort124; local34 <= arg0.aShort126; local34++) {
			for (local38 = arg0.aShort123; local38 <= arg0.aShort125; local38++) {
				@Pc(45) Class64 local45 = Static442.method6845(arg0.aByte108, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort124) {
						local49++;
					}
					if (local34 < arg0.aShort126) {
						local49 += 4;
					}
					if (local38 > arg0.aShort123) {
						local49 += 8;
					}
					if (local38 < arg0.aShort125) {
						local49 += 2;
					}
					@Pc(74) Class232 local74 = Static277.method4869(local49, arg0);
					@Pc(77) Class232 local77 = local45.aClass232_2;
					if (local77 == null) {
						local45.aClass232_2 = local74;
					} else {
						while (local77.aClass232_3 != null) {
							local77 = local77.aClass232_3;
						}
						local77.aClass232_3 = local74;
					}
					local45.aByte32 = (byte) (local45.aByte32 | local49);
					if (local6 && (Static523.anIntArrayArray120[local34][local38] & 0xFF000000) != 0) {
						local8 = Static523.anIntArrayArray120[local34][local38];
						local10 = Static200.aShortArrayArray3[local34][local38];
						local12 = Static278.aByteArrayArray16[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort124; local38 <= arg0.aShort126; local38++) {
				for (@Pc(150) int local150 = arg0.aShort123; local150 <= arg0.aShort125; local150++) {
					if ((Static523.anIntArrayArray120[local38][local150] & 0xFF000000) == 0) {
						Static523.anIntArrayArray120[local38][local150] = local8;
						Static200.aShortArrayArray3[local38][local150] = local10;
						Static278.aByteArrayArray16[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static227.aClass20_Sub1Array3[Static316.anInt6013++] = arg0;
		}
		return true;
	}
}

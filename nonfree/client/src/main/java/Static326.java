import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_201 = new Class221("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_146 = new Class77(51, -2);

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!tq;Z)Z")
	public static boolean method5033(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static17.aClass33Array1 == Static345.aClass33Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5457();
		if (arg0.aShort97 < 0 || arg0.aShort94 < 0 || arg0.aShort96 >= Static166.anInt2967 || arg0.aShort95 >= Static244.anInt1024) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort97; local34 <= arg0.aShort96; local34++) {
			for (local38 = arg0.aShort94; local38 <= arg0.aShort95; local38++) {
				@Pc(45) Class227 local45 = Static115.method2162(arg0.aByte74, local34, local38);
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
					@Pc(74) Class164 local74 = Static290.method4422(arg0, local49);
					@Pc(77) Class164 local77 = local45.aClass164_25;
					if (local77 == null) {
						local45.aClass164_25 = local74;
					} else {
						while (local77.aClass164_19 != null) {
							local77 = local77.aClass164_19;
						}
						local77.aClass164_19 = local74;
					}
					local45.aByte64 = (byte) (local45.aByte64 | local49);
					if (local6 && (Static298.anIntArrayArray46[local34][local38] & 0xFF000000) != 0) {
						local8 = Static298.anIntArrayArray46[local34][local38];
						local10 = Static57.aByteArrayArray14[local34][local38];
						local12 = Static354.aByteArrayArray20[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort97; local38 <= arg0.aShort96; local38++) {
				for (@Pc(150) int local150 = arg0.aShort94; local150 <= arg0.aShort95; local150++) {
					if ((Static298.anIntArrayArray46[local38][local150] & 0xFF000000) == 0) {
						Static298.anIntArrayArray46[local38][local150] = local8;
						Static57.aByteArrayArray14[local38][local150] = local10;
						Static354.aByteArrayArray20[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static258.aClass12_Sub1Array3[Static278.anInt1555++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method5042(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < Static244.anInt1014; local18++) {
			if (arg0.equalsIgnoreCase(Static340.aStringArray38[local18])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static267.aClass12_Sub1_Sub2_Sub2_1.aString51);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ms;B)Lclient!ms;")
	public static Class155 method5046(@OriginalArg(0) Class155 arg0) {
		@Pc(11) Class155 local11 = Static41.method886(arg0);
		if (local11 == null) {
			local11 = arg0.aClass155_25;
		}
		return local11;
	}
}

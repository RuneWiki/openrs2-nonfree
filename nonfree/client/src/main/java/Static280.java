import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!lda", name = "f", descriptor = "Lclient!rh;")
	public static Class275 aClass275_93 = new Class275();

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!hc;Z)Z")
	public static boolean method3996(@OriginalArg(0) Class29_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static285.aClass60Array8 == Static127.aClass60Array7;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7547();
		if (arg0.aShort122 < 0 || arg0.aShort121 < 0 || arg0.aShort124 >= Static80.anInt1391 || arg0.aShort123 >= Static164.anInt2881) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort122; local36 <= arg0.aShort124; local36++) {
			for (local40 = arg0.aShort121; local40 <= arg0.aShort123; local40++) {
				@Pc(47) Class9 local47 = Static157.method2295(arg0.aByte103, local36, local40);
				if (local47 != null) {
					@Pc(51) int local51 = 0;
					if (local36 > arg0.aShort122) {
						local51++;
					}
					if (local36 < arg0.aShort124) {
						local51 += 4;
					}
					if (local40 > arg0.aShort121) {
						local51 += 8;
					}
					if (local40 < arg0.aShort123) {
						local51 += 2;
					}
					@Pc(76) Class66 local76 = Static348.method7111(local51, arg0);
					@Pc(79) Class66 local79 = local47.aClass66_1;
					if (local79 == null) {
						local47.aClass66_1 = local76;
					} else {
						while (local79.aClass66_2 != null) {
							local79 = local79.aClass66_2;
						}
						local79.aClass66_2 = local76;
					}
					local47.aByte7 = (byte) (local47.aByte7 | local51);
					if (local6 && (Static284.anIntArrayArray56[local36][local40] & 0xFF000000) != 0) {
						local8 = Static284.anIntArrayArray56[local36][local40];
						local10 = Static24.aShortArrayArray11[local36][local40];
						local12 = Static151.aByteArrayArray8[local36][local40];
					}
					if (local47.aClass29_Sub3_1 != null && local47.aClass29_Sub3_1.aShort69 > local33) {
						local33 = local47.aClass29_Sub3_1.aShort69;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort122; local40 <= arg0.aShort124; local40++) {
				for (@Pc(164) int local164 = arg0.aShort121; local164 <= arg0.aShort123; local164++) {
					if ((Static284.anIntArrayArray56[local40][local164] & 0xFF000000) == 0) {
						Static284.anIntArrayArray56[local40][local164] = local8;
						Static24.aShortArrayArray11[local40][local164] = local10;
						Static151.aByteArrayArray8[local40][local164] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static187.aClass29_Sub2Array3[Static402.anInt7079++] = arg0;
		}
		if (arg1) {
			arg0.anInt9223 -= local33;
		}
		return true;
	}
}

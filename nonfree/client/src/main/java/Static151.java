import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_62 = new Class55("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
	public static final int anInt2825 = -1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZB)V")
	public static void method2278(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static267.anInt4536 = 3;
		Static233.anInt5382 = arg0;
		Static410.method5160(Static26.aClass124_1.aString37, Static26.aClass124_1.anInt3453);
		if (arg1) {
			Static451.method5736("", "");
		} else {
			Static173.method2510();
			Static451.method5736(Static189.aString54, Static133.aString26);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ma;Lclient!ya;Lclient!go;IIIIII)V")
	public static void method2281(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class95 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(12) Class20 local12 = Static106.aClass62_3.method1481(arg6);
		if (local12 == null || !local12.aBoolean9 || !local12.method228(Static224.aClass239_7)) {
			return;
		}
		@Pc(32) int local32;
		if (local12.anIntArray29 != null) {
			@Pc(30) int[] local30 = new int[local12.anIntArray29.length];
			@Pc(44) int local44;
			for (local32 = 0; local32 < local30.length / 2; local32++) {
				if (Static9.anInt60 == 4) {
					local44 = (int) Static97.aFloat52 & 0x3FFF;
				} else {
					local44 = Static436.anInt7298 + (int) Static97.aFloat52 & 0x3FFF;
				}
				@Pc(57) int local57 = Class22_Sub7.anIntArray411[local44];
				@Pc(61) int local61 = Class22_Sub7.anIntArray410[local44];
				if (Static9.anInt60 != 4) {
					local57 = local57 * 256 / (Static3.anInt11 + 256);
					local61 = local61 * 256 / (Static3.anInt11 + 256);
				}
				local30[local32 * 2] = ((arg4 + local12.anIntArray29[local32 * 2 + 1] * 4) * local57 + local61 * (arg5 + local12.anIntArray29[local32 * 2] * 4) >> 15) + arg7 + arg2.anInt2595 / 2;
				local30[local32 * 2 + 1] = arg2.anInt2638 / 2 + arg3 - (local61 * (arg4 + local12.anIntArray29[local32 * 2 + 1] * 4) - (local12.anIntArray29[local32 * 2] * 4 + arg5) * local57 >> 15);
			}
			Static241.method3276(arg1, local30, local12.anInt288, arg2.anIntArray213, arg2.anIntArray217);
			for (local44 = 0; local44 < local30.length / 2 - 1; local44++) {
				arg1.method5339(local30[local44 * 2], local30[local44 * 2 + 1], local30[local44 * 2 + 2], local30[(local44 + 1) * 2 + 1], local12.anInt299, arg0, arg7, arg3);
			}
			arg1.method5339(local30[local30.length - 2], local30[local30.length - 1], local30[0], local30[1], local12.anInt299, arg0, arg7, arg3);
		}
		@Pc(272) Class11 local272 = null;
		if (local12.anInt295 != -1) {
			local272 = local12.method220(arg1, false);
			if (local272 != null) {
				Static299.method3997(arg3, arg5, arg0, local272, arg7, arg2, arg4);
			}
		}
		if (local12.aString2 == null) {
			return;
		}
		local32 = 0;
		if (local272 != null) {
			local32 = local272.ma();
		}
		@Pc(305) Class63 local305 = Static359.aClass63_11;
		@Pc(307) Class57 local307 = Static189.aClass57_14;
		if (local12.anInt287 == 1) {
			local305 = Static259.aClass63_7;
			local307 = Static112.aClass57_6;
		}
		if (local12.anInt287 == 2) {
			local305 = Static305.aClass63_15;
			local307 = Static35.aClass57_13;
		}
		Static145.method2629(local12.aString2, arg2, arg0, local32, arg7, local307, arg4, arg5, local305, local12.anInt296, arg3);
	}
}

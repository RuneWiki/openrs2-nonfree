import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "[I")
	public static final int[] anIntArray194 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZLjava/lang/String;BLjava/lang/String;)V")
	public static void method3273(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static422.aString169 = arg2;
		Static544.aString215 = arg1;
		Static482.aBoolean630 = arg0;
		if (!Static482.aBoolean630 && Static274.anInt5755 != 3 && (Static544.aString215.equals("") || Static422.aString169.equals(""))) {
			Static582.method8145(3);
			return;
		}
		Static24.aBoolean94 = false;
		if (Static274.anInt5755 != 1) {
			Static473.anInt8998 = -1;
			Static452.anInt8608 = 0;
		}
		Static582.method8145(-3);
		Static533.anInt9770 = 0;
		Static124.anInt2828 = 0;
		Static575.anInt10384 = 1;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)Z")
	public static boolean method3275() {
		@Pc(7) boolean local7 = true;
		if (Static148.aClass103_1 == null) {
			if (Static159.aClass348_38.method7960(Static73.anInt1886)) {
				Static148.aClass103_1 = Static598.method2449(Static159.aClass348_38, Static73.anInt1886);
			} else {
				local7 = false;
			}
		}
		if (Static466.aClass103_3 == null) {
			if (Static159.aClass348_38.method7960(Static402.anInt7836)) {
				Static466.aClass103_3 = Static598.method2449(Static159.aClass348_38, Static402.anInt7836);
			} else {
				local7 = false;
			}
		}
		if (Static174.aClass103_2 == null) {
			if (Static159.aClass348_38.method7960(Static188.anInt3896)) {
				Static174.aClass103_2 = Static598.method2449(Static159.aClass348_38, Static188.anInt3896);
			} else {
				local7 = false;
			}
		}
		if (Static576.aClass198_13 == null) {
			if (Static478.aClass348_114.method7960(Static228.anInt4840)) {
				Static576.aClass198_13 = Static165.method2735(Static478.aClass348_114, Static228.anInt4840);
			} else {
				local7 = false;
			}
		}
		if (Static253.aClass103Array1 == null) {
			if (Static159.aClass348_38.method7960(Static228.anInt4840)) {
				Static253.aClass103Array1 = Static598.method2450(Static159.aClass348_38, Static228.anInt4840);
			} else {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method3276(@OriginalArg(0) Class7 arg0) {
		arg0.da(0, 0, Static123.anInt9150, 350);
		arg0.J(0, 0, Static123.anInt9150, 350, Static54.anInt1437 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static81.anInt10012;
		@Pc(39) int local39;
		if (Static506.anInt9457 > 0) {
			local39 = 346 - Static81.anInt10012 - 4;
			@Pc(49) int local49 = local39 * local27 / (Static506.anInt9457 + local27 - 1);
			@Pc(51) int local51 = 4;
			if (Static506.anInt9457 > 1) {
				local51 = (Static506.anInt9457 - Static85.anInt2259 - 1) * (-local49 + local39) / (Static506.anInt9457 - 1) + 4;
			}
			arg0.J(Static123.anInt9150 - 16, local51, 12, local49, Static54.anInt1437 << 24 | 0x332277, 2);
			for (@Pc(89) int local89 = Static85.anInt2259; local27 + Static85.anInt2259 > local89 && local89 < Static506.anInt9457; local89++) {
				@Pc(98) String[] local98 = Static297.method4750(Static404.aStringArray31[local89], '\b');
				@Pc(107) int local107 = (Static123.anInt9150 - 8 - 16) / local98.length;
				for (@Pc(109) int local109 = 0; local109 < local98.length; local109++) {
					@Pc(117) int local117 = local109 * local107 + 8;
					arg0.da(local117, 0, local107 + local117 - 8, 350);
					Static127.aClass45_1.method4843(local117, Static530.method3328(local98[local109]), -16777216, -1, 350 - Static279.anInt5796 - Static478.aClass198_11.anInt6045 - Static81.anInt10012 * (local89 + -Static85.anInt2259) - 2);
				}
			}
		}
		Static464.aClass45_9.method4853(-1, 330, Static123.anInt9150 - 25, -16777216, "Build: 624");
		arg0.da(0, 0, Static123.anInt9150, 350);
		arg0.method7809(350 - Static279.anInt5796, Static123.anInt9150, -1, 0);
		Static306.aClass45_4.method4843(10, "--> " + Static530.method3328(Static437.aString173), -16777216, -1, 349 - Static503.aClass198_12.anInt6045);
		if (!Static164.aBoolean245) {
			return;
		}
		local39 = -1;
		if (Static306.anInt6122 % 30 > 15) {
			local39 = 16777215;
		}
		arg0.method7789(339 - Static503.aClass198_12.anInt6045, Static503.aClass198_12.method4769("--> " + Static530.method3328(Static437.aString173).substring(0, Static50.anInt1334)) + 10, 12, local39);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ba;I[BIIFIFFIFFI)V")
	public static void method3277(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(5) float arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5, @OriginalArg(10) float arg6, @OriginalArg(11) float arg7) {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			Static580.method5876(arg3, arg4, arg2, arg1, arg0, arg6, arg5, arg7, local12);
			arg1 += 16384;
		}
	}
}

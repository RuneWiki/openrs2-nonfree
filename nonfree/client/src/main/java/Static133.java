import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_76 = new Class363(62, -1);

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
	public static int anInt2820 = 0;

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "Lclient!ks;")
	public static final Class2_Sub15_Sub2 aClass2_Sub15_Sub2_1 = new Class2_Sub15_Sub2(7500);

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
	public static void method2288() {
		if (Static109.anInt2235 == 0) {
			return;
		}
		try {
			if (++Static317.anInt5928 > 2000) {
				if (Static57.aClass116_1 != null) {
					Static57.aClass116_1.method2483();
					Static57.aClass116_1 = null;
				}
				if (Static508.anInt8480 >= 2) {
					Static109.anInt2235 = 0;
					Static257.anInt4784 = -5;
					return;
				}
				Static59.aClass170_1.method3783();
				Static109.anInt2235 = 1;
				Static508.anInt8480++;
				Static317.anInt5928 = 0;
			}
			if (Static109.anInt2235 == 1) {
				Static321.aClass347_2 = Static59.aClass170_1.method3780(Static356.aClass287_5);
				Static109.anInt2235 = 2;
			}
			if (Static109.anInt2235 == 2) {
				if (Static321.aClass347_2.anInt9172 == 2) {
					throw new IOException();
				}
				if (Static321.aClass347_2.anInt9172 != 1) {
					return;
				}
				Static57.aClass116_1 = Static30.method547((Socket) Static321.aClass347_2.anObject49);
				Static321.aClass347_2 = null;
				Static550.method7463();
				Static109.anInt2235 = 4;
			}
			if (Static109.anInt2235 == 4) {
				if (!Static57.aClass116_1.method2480(1)) {
					return;
				}
				Static57.aClass116_1.method2476(0, aClass2_Sub15_Sub2_1.aByteArray62, 1);
				@Pc(117) int local117 = aClass2_Sub15_Sub2_1.aByteArray62[0] & 0xFF;
				if (local117 != 21) {
					Static109.anInt2235 = 0;
					Static257.anInt4784 = local117;
					Static57.aClass116_1.method2483();
					Static57.aClass116_1 = null;
					return;
				}
				Static109.anInt2235 = 5;
			}
			if (Static109.anInt2235 == 5) {
				if (!Static57.aClass116_1.method2480(1)) {
					return;
				}
				Static57.aClass116_1.method2476(0, aClass2_Sub15_Sub2_1.aByteArray62, 1);
				Static109.anInt2235 = 6;
				Static36.aStringArray14 = new String[aClass2_Sub15_Sub2_1.aByteArray62[0] & 0xFF];
			}
			if (Static109.anInt2235 == 6 && Static57.aClass116_1.method2480(Static36.aStringArray14.length * 8)) {
				aClass2_Sub15_Sub2_1.anInt5241 = 0;
				Static57.aClass116_1.method2476(0, aClass2_Sub15_Sub2_1.aByteArray62, Static36.aStringArray14.length * 8);
				for (@Pc(197) int local197 = 0; local197 < Static36.aStringArray14.length; local197++) {
					Static36.aStringArray14[local197] = Static268.method7982(aClass2_Sub15_Sub2_1.method4351());
				}
				Static257.anInt4784 = 21;
				Static109.anInt2235 = 0;
				Static57.aClass116_1.method2483();
				Static57.aClass116_1 = null;
			}
		} catch (@Pc(223) IOException local223) {
			if (Static57.aClass116_1 != null) {
				Static57.aClass116_1.method2483();
				Static57.aClass116_1 = null;
			}
			if (Static508.anInt8480 >= 2) {
				Static109.anInt2235 = 0;
				Static257.anInt4784 = -4;
			} else {
				Static59.aClass170_1.method3783();
				Static508.anInt8480++;
				Static109.anInt2235 = 1;
				Static317.anInt5928 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(29) int local29 = Static56.aShort20 + (Static168.aShort35 - Static56.aShort20) * local7 / 100;
		@Pc(35) int local35 = arg0 * local29 >> 8;
		@Pc(42) int local42 = 16384 - arg2 & 0x3FFF;
		@Pc(49) int local49 = 16384 - arg4 & 0x3FFF;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = local35;
		if (local42 != 0) {
			local58 = Class363.anIntArray697[local42] * -local35 >> 14;
			local60 = local35 * Class363.anIntArray698[local42] >> 14;
		}
		if (local49 != 0) {
			local56 = local60 * Class363.anIntArray697[local49] >> 14;
			local60 = local60 * Class363.anIntArray698[local49] >> 14;
		}
		Static177.anInt3712 = arg4;
		Static548.anInt8906 = arg6 - local58;
		Static90.anInt1932 = arg3 - local56;
		Static7.anInt337 = arg1 - local60;
		Static323.anInt6015 = arg2;
		Static443.anInt7768 = 0;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIZ)I")
	public static int method2290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg1 > 0) {
			local15 = arg0 & 0x1 | local15 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local15;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!me", name = "w", descriptor = "Lclient!i;")
	public static Class41 aClass41_1281 = Static184.method2923("<col=c0ff00>");

	@OriginalMember(owner = "client!me", name = "x", descriptor = "S")
	public static short aShort65 = 1;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "Lclient!i;")
	public static Class41 aClass41_1282 = Static184.method2923("<col=ff9040>");

	@OriginalMember(owner = "client!me", name = "B", descriptor = "I")
	public static int anInt4789 = 2;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public static void method3317() {
		@Pc(5) int local5 = Static49.aClass2_Sub2_Sub4_3.method788(Static23.aClass41_137);
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < Static179.anInt4150; local7++) {
			local15 = Static49.aClass2_Sub2_Sub4_3.method788(Static68.method1244(local7));
			if (local15 > local5) {
				local5 = local15;
			}
		}
		local5 += 8;
		Static210.anInt4696 = local5;
		Static94.aBoolean123 = true;
		Static43.anInt1299 = Static179.anInt4150 * 15 + 22;
		local15 = Static179.anInt4150 * 15 + 21;
		@Pc(60) int local60 = Static154.anInt3614;
		if (local15 + local60 > Static130.anInt3906) {
			local60 = Static130.anInt3906 - local15;
		}
		if (local60 < 0) {
			local60 = 0;
		}
		@Pc(83) int local83 = Static200.anInt4491 - local5 / 2;
		if (local5 + local83 > Static197.anInt4442) {
			local83 = Static197.anInt4442 - local5;
		}
		Static208.anInt4650 = local60;
		if (local83 < 0) {
			local83 = 0;
		}
		Static75.anInt3784 = local83;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
	public static void method3318() {
		@Pc(5) int local5 = Static35.anInt926 >> 7;
		Static183.anInt1324 &= 0x7FF;
		@Pc(17) int local17 = Static207.anInt4612 >> 7;
		@Pc(19) int local19 = 0;
		if (Static57.anInt1618 < 128) {
			Static57.anInt1618 = 128;
		}
		if (Static57.anInt1618 > 383) {
			Static57.anInt1618 = 383;
		}
		@Pc(43) int local43 = Static212.method3261(Static35.anInt926, Static207.anInt4612, Static134.anInt3147);
		@Pc(65) int local65;
		if (local5 > 3 && local17 > 3 && local5 < 100 && local17 < 100) {
			for (local65 = local5 - 4; local65 <= local5 + 4; local65++) {
				for (@Pc(71) int local71 = local17 - 4; local71 <= local17 + 4; local71++) {
					@Pc(75) int local75 = Static134.anInt3147;
					if (local75 < 3 && (Static102.aByteArrayArrayArray7[1][local65][local71] & 0x2) == 2) {
						local75++;
					}
					@Pc(102) int local102 = local43 - Static56.anIntArrayArrayArray7[local75][local65][local71];
					if (local19 < local102) {
						local19 = local102;
					}
				}
			}
		}
		local65 = local19 * 192;
		if (local65 > 98048) {
			local65 = 98048;
		}
		if (local65 < 32768) {
			local65 = 32768;
		}
		if (Static63.anInt1695 < local65) {
			Static63.anInt1695 += (local65 - Static63.anInt1695) / 24;
		} else if (local65 < Static63.anInt1695) {
			Static63.anInt1695 += (local65 - Static63.anInt1695) / 80;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)V")
	public static void method3319(@OriginalArg(0) int arg0) {
		if (Static27.anIntArray230 == null || Static27.anIntArray230.length < arg0) {
			Static27.anIntArray230 = new int[arg0];
		}
	}
}

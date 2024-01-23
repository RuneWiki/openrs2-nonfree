import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
	public static int anInt5233;

	@OriginalMember(owner = "client!sl", name = "A", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!sl", name = "u", descriptor = "Z")
	public static boolean aBoolean323 = false;

	@OriginalMember(owner = "client!sl", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString372 = "Hidden";

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)V")
	public static void method3962() {
		Static219.aClass89_34.method2265();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V")
	public static void method3964(@OriginalArg(1) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static303.anInt6017 += arg0 * 128;
		@Pc(43) int local43;
		if (Static107.anIntArray183.length < Static303.anInt6017) {
			Static303.anInt6017 -= Static107.anIntArray183.length;
			local43 = (int) (Math.random() * 12.0D);
			Static7.method243(Static48.aClass46_Sub1Array1[local43]);
		}
		local43 = 0;
		@Pc(57) int local57 = (256 - arg0) * 128;
		@Pc(61) int local61 = arg0 * 128;
		@Pc(68) int local68;
		@Pc(98) int local98;
		for (local68 = 0; local68 < local57; local68++) {
			local98 = Static188.anIntArray362[local43 + local61] - Static107.anIntArray183[Static107.anIntArray183.length - 1 & local43 + Static303.anInt6017] * arg0 / 6;
			if (local98 < 0) {
				local98 = 0;
			}
			Static188.anIntArray362[local43++] = local98;
		}
		@Pc(129) int local129;
		@Pc(139) int local139;
		for (local68 = 256 - arg0; local68 < 256; local68++) {
			local98 = local68 * 128;
			for (local129 = 0; local129 < 128; local129++) {
				local139 = (int) (Math.random() * 100.0D);
				if (local139 < 50 && local129 > 10 && local129 < 118) {
					Static188.anIntArray362[local129 + local98] = 255;
				} else {
					Static188.anIntArray362[local129 + local98] = 0;
				}
			}
		}
		for (local68 = 0; local68 < 256 - arg0; local68++) {
			Static40.anIntArray125[local68] = Static40.anIntArray125[arg0 + local68];
		}
		for (local68 = 256 - arg0; local68 < 256; local68++) {
			Static40.anIntArray125[local68] = (int) (Math.sin((double) Static63.anInt1370 / 14.0D) * 16.0D + Math.sin((double) Static63.anInt1370 / 15.0D) * 14.0D + Math.sin((double) Static63.anInt1370 / 16.0D) * 12.0D);
			Static63.anInt1370++;
		}
		Static184.anInt4054 += arg0;
		local68 = ((Static133.anInt3061 & 0x1) + arg0) / 2;
		if (local68 <= 0) {
			return;
		}
		for (local98 = 0; local98 < Static184.anInt4054; local98++) {
			local139 = (int) (Math.random() * 128.0D) + 128;
			local129 = (int) (Math.random() * 124.0D) + 2;
			Static188.anIntArray362[local129 + (local139 << 7)] = 192;
		}
		Static184.anInt4054 = 0;
		@Pc(301) int local301;
		for (local98 = 0; local98 < 256; local98++) {
			local129 = 0;
			local139 = local98 * 128;
			for (local301 = -local68; local301 < 128; local301++) {
				if (local301 + local68 < 128) {
					local129 += Static188.anIntArray362[local68 + local301 + local139];
				}
				if (local301 - local68 - 1 >= 0) {
					local129 -= Static188.anIntArray362[local301 + local139 - local68 - 1];
				}
				if (local301 >= 0) {
					Static109.anIntArray240[local301 + local139] = local129 / (local68 * 2 + 1);
				}
			}
		}
		for (local98 = 0; local98 < 128; local98++) {
			local129 = 0;
			for (local139 = -local68; local139 < 256; local139++) {
				local301 = local139 * 128;
				if (local139 + local68 < 256) {
					local129 += Static109.anIntArray240[local68 * 128 + local98 + local301];
				}
				if (local139 - local68 - 1 >= 0) {
					local129 -= Static109.anIntArray240[local301 + local98 - local68 * 128 - 128];
				}
				if (local139 >= 0) {
					Static188.anIntArray362[local98 + local301] = local129 / (local68 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BIII)I")
	public static int method3965(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg1 - 1 & arg0;
		@Pc(18) int local18 = arg0 / arg1;
		@Pc(24) int local24 = arg2 & arg1 - 1;
		@Pc(28) int local28 = arg2 / arg1;
		@Pc(33) int local33 = Static96.method1627(local28, local18);
		@Pc(40) int local40 = Static96.method1627(local28, local18 + 1);
		@Pc(49) int local49 = Static96.method1627(local28 + 1, local18);
		@Pc(58) int local58 = Static96.method1627(local28 + 1, local18 + 1);
		@Pc(65) int local65 = Static277.method4189(arg1, local33, local14, local40);
		@Pc(72) int local72 = Static277.method4189(arg1, local49, local14, local58);
		return Static277.method4189(arg1, local65, local24, local72);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method3966(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(38) int local38 = 2;
		for (@Pc(42) int local42 = arg0 / 10; local42 != 0; local42 /= 10) {
			local38++;
		}
		@Pc(57) char[] local57 = new char[local38];
		local57[0] = '+';
		for (@Pc(65) int local65 = local38 - 1; local65 > 0; local65--) {
			@Pc(69) int local69 = arg0;
			arg0 /= 10;
			@Pc(80) int local80 = local69 - arg0 * 10;
			if (local80 >= 10) {
				local57[local65] = (char) (local80 + 87);
			} else {
				local57[local65] = (char) (local80 + 48);
			}
		}
		return new String(local57);
	}
}

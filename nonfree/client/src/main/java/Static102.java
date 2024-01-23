import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "Lclient!nk;")
	public static Class121 aClass121_50;

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
	public static int anInt2059;

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
	public static int anInt2065;

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "Lclient!nk;")
	public static Class121 aClass121_51;

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "Lclient!vh;")
	public static Class187 aClass187_60 = new Class187(50);

	@OriginalMember(owner = "client!hd", name = "R", descriptor = "Z")
	public static boolean aBoolean113 = true;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZIII)V")
	public static void method1859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static112.anInt2332 = arg2;
		Static268.anInt4883 = arg0;
		Static139.anInt2808 = arg3;
		Static71.anInt1521 = arg1;
		Static155.anInt3076 = arg4;
		if (Static155.anInt3076 >= 100) {
			@Pc(27) int local27 = Static139.anInt2808 * 128 + 64;
			@Pc(33) int local33 = Static268.anInt4883 * 128 + 64;
			@Pc(42) int local42 = Static69.method4275(local33, Static65.anInt1300, local27) - Static112.anInt2332;
			@Pc(47) int local47 = local42 - Static306.anInt5420;
			@Pc(52) int local52 = local27 - Static94.anInt3434;
			@Pc(57) int local57 = local33 - Static233.anInt4252;
			@Pc(68) int local68 = (int) Math.sqrt((double) (local57 * local57 + local52 * local52));
			Static277.anInt4987 = (int) (Math.atan2((double) local47, (double) local68) * 325.949D) & 0x7FF;
			Static93.anInt1895 = (int) (-325.949D * Math.atan2((double) local52, (double) local57)) & 0x7FF;
			if (Static277.anInt4987 < 128) {
				Static277.anInt4987 = 128;
			}
			if (Static277.anInt4987 > 383) {
				Static277.anInt4987 = 383;
			}
		}
		Static167.anInt3292 = 2;
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
	public static void method1860() {
		for (@Pc(11) int local11 = 0; local11 < Static85.anInt1689; local11++) {
			@Pc(18) int local18 = Static104.anIntArray178[local11];
			@Pc(22) Class15_Sub5_Sub1 local22 = Static83.aClass15_Sub5_Sub1Array1[local18];
			if (local22 != null) {
				Static237.method3674(local22, local22.aClass99_1.anInt3050);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B[BII)I")
	public static int method1862(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = arg2; local5 < arg1; local5++) {
			local3 = local3 >>> 8 ^ Class1_Sub2_Sub9.anIntArray266[(local3 ^ arg0[local5]) & 0xFF];
		}
		return ~local3;
	}
}

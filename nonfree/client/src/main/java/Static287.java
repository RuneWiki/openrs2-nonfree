import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "Lclient!cc;")
	public static Class22 aClass22_11;

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "Lclient!qd;")
	public static Class137 aClass137_3;

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "Lclient!bh;")
	public static Class15 aClass15_3;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Lclient!dh;")
	public static Class33 aClass33_20 = new Class33(64);

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public static int anInt2513 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "[I")
	public static int[] anIntArray237 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method1964() {
		aClass33_20 = null;
		aClass15_3 = null;
		aClass22_11 = null;
		anIntArray237 = null;
		aClass137_3 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = arg4 - 334;
		if (local3 < 0) {
			local3 = 0;
		} else if (local3 > 100) {
			local3 = 100;
		}
		@Pc(31) int local31 = (Static132.aShort15 - Static176.aShort12) * local3 / 100 + Static176.aShort12;
		@Pc(37) int local37 = local31 * arg2 >> 8;
		@Pc(44) int local44 = 2048 - arg6 & 0x7FF;
		@Pc(51) int local51 = 2048 - arg3 & 0x7FF;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = local37;
		@Pc(62) int local62;
		@Pc(66) int local66;
		if (local44 != 0) {
			local62 = Class131.anIntArray355[local44];
			local66 = Class131.anIntArray353[local44];
			local53 = local62 * -local37 >> 16;
			local55 = local37 * local66 >> 16;
		}
		@Pc(81) int local81 = 0;
		if (local51 != 0) {
			local62 = Class131.anIntArray355[local51];
			local66 = Class131.anIntArray353[local51];
			local81 = local62 * local55 >> 16;
			local55 = local66 * local55 >> 16;
		}
		Static160.anInt3185 = arg0 - local53;
		Static299.anInt5560 = arg6;
		Static211.anInt4210 = arg5 - local55;
		Static149.anInt3032 = arg1 - local81;
		Static279.anInt5259 = arg3;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZB)V")
	public static void method1968(@OriginalArg(1) byte arg0) {
		if (Static275.aByteArrayArrayArray18 == null) {
			Static275.aByteArrayArrayArray18 = new byte[4][104][104];
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			for (@Pc(27) int local27 = 0; local27 < 104; local27++) {
				for (@Pc(32) int local32 = 0; local32 < 104; local32++) {
					Static275.aByteArrayArrayArray18[local20][local27][local32] = arg0;
				}
			}
		}
	}
}

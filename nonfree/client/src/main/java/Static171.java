import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ta", name = "R", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[5];

	@OriginalMember(owner = "client!ta", name = "T", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1154 = Static158.method3034("Drop");

	@OriginalMember(owner = "client!ta", name = "S", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1153 = aClass60_1154;

	@OriginalMember(owner = "client!ta", name = "X", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1155 = Static158.method3034("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ta", name = "Z", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!ta", name = "bb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1156 = Static158.method3034("Konfig geladen)3");

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)V")
	public static void method3180(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class67 local11 = Static70.aClass67ArrayArrayArray1[Static62.anInt1923][arg1][arg0];
		if (local11 == null) {
			Static55.method1327(Static62.anInt1923, arg1, arg0);
			return;
		}
		@Pc(20) int local20 = -99999999;
		@Pc(22) Class2_Sub1_Sub1_Sub7 local22 = null;
		@Pc(27) Class2_Sub1_Sub1_Sub7 local27;
		for (local27 = (Class2_Sub1_Sub1_Sub7) local11.method2848(); local27 != null; local27 = (Class2_Sub1_Sub1_Sub7) local11.method2851()) {
			@Pc(33) Class2_Sub1_Sub8 local33 = Static88.method2046(local27.anInt4182);
			@Pc(36) int local36 = local33.anInt1564;
			if (local33.anInt1535 == 1) {
				local36 *= local27.anInt4187 + 1;
			}
			if (local20 < local36) {
				local20 = local36;
				local22 = local27;
			}
		}
		if (local22 == null) {
			Static55.method1327(Static62.anInt1923, arg1, arg0);
			return;
		}
		local11.method2845(local22);
		@Pc(85) long local85 = (long) ((arg0 << 7) + arg1 + 1610612736);
		@Pc(87) Class2_Sub1_Sub1_Sub7 local87 = null;
		@Pc(89) Class2_Sub1_Sub1_Sub7 local89 = null;
		for (local27 = (Class2_Sub1_Sub1_Sub7) local11.method2848(); local27 != null; local27 = (Class2_Sub1_Sub1_Sub7) local11.method2851()) {
			if (local27.anInt4182 != local22.anInt4182) {
				if (local87 == null) {
					local87 = local27;
				}
				if (local87.anInt4182 != local27.anInt4182 && local89 == null) {
					local89 = local27;
				}
			}
		}
		Static191.method3498(Static62.anInt1923, arg1, arg0, Static182.method3393(Static62.anInt1923, arg1 * 128 + 64, arg0 * 128 + 64), local22, local85, local87, local89);
	}

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "(I)V")
	public static void method3181() {
		Static7.aClass2_Sub3_Sub1_43.method244(45);
		for (@Pc(18) Class2_Sub20 local18 = (Class2_Sub20) Static156.aClass51_11.method2465(); local18 != null; local18 = (Class2_Sub20) Static156.aClass51_11.method2462()) {
			if (local18.anInt3989 == 0) {
				Static12.method312(local18, true);
			}
		}
		if (Static164.aClass72_10 != null) {
			Static39.method900(Static164.aClass72_10);
			Static164.aClass72_10 = null;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIII)V")
	public static void method3183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = 2048 - arg1 & 0x7FF;
		@Pc(16) int local16 = 2048 - arg3 & 0x7FF;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg4;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(43) int local43;
		if (local16 != 0) {
			local28 = Class2_Sub1_Sub7_Sub1.anIntArray133[local16];
			local32 = Class2_Sub1_Sub7_Sub1.anIntArray129[local16];
			local43 = local32 * 0 - arg4 * local28 >> 16;
			local22 = local28 * 0 + local32 * arg4 >> 16;
			local20 = local43;
		}
		if (local10 != 0) {
			local32 = Class2_Sub1_Sub7_Sub1.anIntArray129[local10];
			local28 = Class2_Sub1_Sub7_Sub1.anIntArray133[local10];
			local43 = local22 * local28 + local32 * 0 >> 16;
			local22 = local22 * local32 - local28 * 0 >> 16;
			local18 = local43;
		}
		Static158.anInt4007 = arg1;
		Static172.anInt4190 = arg0 - local20;
		Static161.anInt4013 = arg5 - local18;
		Static19.anInt3094 = arg3;
		Static166.anInt4103 = arg2 - local22;
	}
}

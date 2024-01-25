import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!qv", name = "G", descriptor = "Z")
	public static boolean aBoolean600 = false;

	@OriginalMember(owner = "client!qv", name = "K", descriptor = "[I")
	public static int[] anIntArray493 = new int[4];

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IFFF)F")
	public static float method6554(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg1 + (arg2 - arg1) * arg0;
	}

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "(I)V")
	public static void method6555() {
		@Pc(9) int[] local9 = new int[Static338.aClass29_1.anInt1147];
		@Pc(11) int local11 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static338.aClass29_1.anInt1147; local18++) {
			@Pc(25) Class236 local25 = Static338.aClass29_1.method977(local18);
			if (local25.anInt6803 >= 0 || local25.anInt6812 >= 0) {
				local9[local11++] = local18;
			}
		}
		Static337.anIntArray359 = new int[local11];
		for (@Pc(49) int local49 = 0; local49 < local11; local49++) {
			Static337.anIntArray359[local49] = local9[local49];
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6556(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				local15++;
			} else if (local23 > '\u07ff') {
				local15 += 3;
			} else {
				local15 += 2;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BI)Z")
	public static boolean method6557(@OriginalArg(1) int arg0) {
		return arg0 == 0;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!wv;)[Lclient!dm;")
	public static Class77[] method6558(@OriginalArg(1) Class366 arg0) {
		if (!arg0.method8276()) {
			return new Class77[0];
		}
		@Pc(16) Class316 local16 = arg0.method8284();
		while (local16.anInt9478 == 0) {
			Static214.method3478(10L);
		}
		if (local16.anInt9478 == 2) {
			return new Class77[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject136;
		@Pc(43) Class77[] local43 = new Class77[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(51) Class77 local51 = new Class77();
			local43[local45] = local51;
			local51.anInt2399 = local37[local45 << 2];
			local51.anInt2396 = local37[(local45 << 2) + 1];
			local51.anInt2402 = local37[(local45 << 2) + 2];
			local51.anInt2400 = local37[(local45 << 2) + 3];
		}
		return local43;
	}

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "(B)V")
	public static void method6559() {
		Static470.anIntArray518 = Static72.method1556(0.4F);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Lclient!lc;")
	public static Class98 aClass98_109;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "Lclient!lc;")
	public static Class98 aClass98_110;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "Z")
	public static boolean aBoolean244 = false;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "I")
	public static int anInt3783 = 0;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString123 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!of", name = "r", descriptor = "I")
	public static int anInt3790 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static68.anInt1263 + arg0 * Static84.anInt1703 >> 16;
		@Pc(19) int local19 = arg3 * Static84.anInt1703 - arg0 * Static68.anInt1263 >> 16;
		@Pc(29) int local29 = arg1 * Static275.anInt5147 + local19 * Static54.anInt1076 >> 16;
		@Pc(39) int local39 = arg1 * Static54.anInt1076 - local19 * Static275.anInt5147 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static275.anInt5147 + local19 * Static54.anInt1076 >> 16;
		@Pc(76) int local76 = arg2 * Static54.anInt1076 - local19 * Static275.anInt5147 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static61.anInt1159 && local87 < Static61.anInt1159) {
			return false;
		} else if (local50 > Static60.anInt1151 && local87 > Static60.anInt1151) {
			return false;
		} else if (local56 < Static93.anInt1922 && local93 < Static93.anInt1922) {
			return false;
		} else {
			return local56 <= Static26.anInt481 || local93 <= Static26.anInt481;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	public static void method3011() {
		aString123 = null;
		aClass98_109 = null;
		aClass98_110 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3012(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static154.method2468(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
	public static void method3013() {
		Static158.aClass33_27.method843();
		Static215.aClass33_31.method843();
		Static6.aClass33_2.method843();
		Static40.aClass33_5.method843();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!g;I)V")
	public static void method3014(@OriginalArg(0) Class12_Sub3 arg0) {
		if (arg0.anInt4137 == Static104.anInt2226 || arg0.anInt4178 == -1 || arg0.anInt4119 != 0 || arg0.anInt4120 + 1 > Static296.method1376(arg0.anInt4178).anIntArray392[arg0.anInt4170]) {
			@Pc(35) int local35 = arg0.anInt4137 - arg0.anInt4193;
			@Pc(40) int local40 = Static104.anInt2226 - arg0.anInt4193;
			@Pc(51) int local51 = arg0.anInt4128 * 128 + arg0.method3375() * 64;
			@Pc(62) int local62 = arg0.anInt4160 * 128 + arg0.method3375() * 64;
			@Pc(73) int local73 = arg0.anInt4116 * 128 + arg0.method3375() * 64;
			@Pc(85) int local85 = arg0.anInt4145 * 128 + arg0.method3375() * 64;
			arg0.anInt4113 = (local85 * local40 + local62 * (local35 - local40)) / local35;
			arg0.anInt4141 = (local40 * local73 + (local35 - local40) * local51) / local35;
		}
		arg0.anInt4164 = 0;
		if (arg0.anInt4172 == 0) {
			arg0.anInt4136 = 1024;
		}
		if (arg0.anInt4172 == 1) {
			arg0.anInt4136 = 1536;
		}
		if (arg0.anInt4172 == 2) {
			arg0.anInt4136 = 0;
		}
		if (arg0.anInt4172 == 3) {
			arg0.anInt4136 = 512;
		}
		arg0.anInt4121 = arg0.anInt4136;
	}
}

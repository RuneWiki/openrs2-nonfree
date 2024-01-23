import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	public static int anInt5738;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "[I")
	public static int[] anIntArray562;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString203 = "green:";

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)I")
	public static int method4523(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(33) int local33 = local19 | local19 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return arg0 & ~local45;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIBI)V")
	public static void method4524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static25.method486(Static275.anIntArrayArray37[arg1], arg3 - arg0, arg3 - -arg0, arg2);
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = -arg0;
		@Pc(26) int local26 = arg0;
		@Pc(28) int local28 = -1;
		while (local21 < local26) {
			local28 += 2;
			local21++;
			local24 += local28;
			if (local24 >= 0) {
				local26--;
				local24 -= local26 << 1;
				@Pc(53) int[] local53 = Static275.anIntArrayArray37[arg1 - local26];
				@Pc(59) int[] local59 = Static275.anIntArrayArray37[local26 + arg1];
				@Pc(64) int local64 = arg3 + local21;
				@Pc(68) int local68 = arg3 - local21;
				Static25.method486(local59, local68, local64, arg2);
				Static25.method486(local53, local68, local64, arg2);
			}
			@Pc(84) int local84 = local26 + arg3;
			@Pc(89) int local89 = arg3 - local26;
			@Pc(95) int[] local95 = Static275.anIntArrayArray37[arg1 + local21];
			@Pc(102) int[] local102 = Static275.anIntArrayArray37[arg1 - local21];
			Static25.method486(local95, local89, local84, arg2);
			Static25.method486(local102, local89, local84, arg2);
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public static void method4526() {
		Static262.aClass56ArrayArray1 = new Class56[Static152.aClass42_42.method1275()][];
		Static275.aBooleanArray20 = new boolean[Static152.aClass42_42.method1275()];
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method4527(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = arg0.length();
		@Pc(16) byte local16 = 2;
		@Pc(19) char[] local19 = new char[local14];
		for (@Pc(21) int local21 = 0; local21 < local14; local21++) {
			@Pc(28) char local28 = arg0.charAt(local21);
			if (local16 == 0) {
				local28 = Character.toLowerCase(local28);
			} else if (local16 == 2 || Character.isUpperCase(local28)) {
				local28 = Static26.method3694(local28);
			}
			if (Character.isLetter(local28)) {
				local16 = 0;
			} else if (local28 == '.' || local28 == '?' || local28 == '!') {
				local16 = 2;
			} else if (!Character.isSpaceChar(local28)) {
				local16 = 1;
			} else if (local16 != 2) {
				local16 = 1;
			}
			local19[local21] = local28;
		}
		return new String(local19);
	}
}

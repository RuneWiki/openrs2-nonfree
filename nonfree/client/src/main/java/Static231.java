import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!us;")
	public static final Class234 aClass234_85 = new Class234(100, -2);

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
	public static int anInt4140 = 0;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "J")
	public static long aLong158 = -1L;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "[I")
	public static final int[] anIntArray440 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "[I")
	public static final int[] anIntArray441 = new int[2048];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method3842(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static272.method4271(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static272.method4271(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(66) StringBuffer local66 = new StringBuffer(local49);
		for (@Pc(68) int local68 = local11; local68 < local14; local68++) {
			@Pc(74) char local74 = arg0.charAt(local68);
			if (Static310.method4768(local74)) {
				@Pc(82) char local82 = Static96.method1616(local74);
				if (local82 != '\u0000') {
					local66.append(local82);
				}
			}
		}
		if (local66.length() == 0) {
			return null;
		} else {
			return local66.toString();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public static void method3844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static340.aClass63_3 == Static121.aClass63_2) {
			if (!Static165.method2523(false, -2, 1, 0, arg0, 0, arg1, 1)) {
				Static165.method2523(false, -3, 1, 0, arg0, 0, arg1, 1);
			}
		} else if (!Static165.method2523(false, -3, 1, 0, arg0, 0, arg1, 1)) {
			Static165.method2523(false, -2, 1, 0, arg0, 0, arg1, 1);
		}
	}
}

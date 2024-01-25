import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
	public static int anInt2590;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public static int anInt2592;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "Lclient!tj;")
	public static Class193 aClass193_38;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "[B")
	public static final byte[] aByteArray43 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "[I")
	public static int[] anIntArray229 = new int[2];

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "[I")
	public static final int[] anIntArray230 = new int[] { 0, 0, 0, 0, -1, 1, 3, 0, 0, 0, 0, 0, -2, 4, 7, 0, 0, 0, 5, 0, 2, 0, 0, -2, 8, -1, 0, 10, 0, 0, 0, 12, 0, 0, 0, 3, 0, 0, 8, -1, 0, 0, 0, 6, 0, 0, 0, 0, 0, 8, -1, 0, 0, 0, 0, 6, 2, 0, 0, 6, 8, 6, 3, 0, 8, 28, -2, 14, -1, -1, 8, 1, 12, 5, 0, 0, 0, 5, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 11, 8, 0, 0, 0, -1, 6, 0, 14, 0, 9, 0, 0, 1, 0, 0, -2, 3, 3, -1, 0, -1, 12, 2, 0, 12, 0, -1, 0, -1, 8, 0, 0, 6, 0, 0, 6, 0, 0, 0, 0, 0, 7, 0, 0, 0, 4, -1, 0, 0, 0, -1, 0, 0, 0, 0, 7, 0, 2, 0, -2, -1, 0, 0, 0, 0, 0, 7, 8, 0, 0, 0, 5, 0, 0, 0, 0, 4, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1, 17, 0, 0, 0, 0, 0, 0, 0, 8, -1, 2, 6, 0, -2, -2, 0, 6, 0, -1, 0, -1, 10, 0, 0, 6, 0, 0, -2, 20, 10, 2, 6, 0, 0, 0, 0, 0, 15, 0, -2, 0, -1, 0, 0, -2, 0, 3, -2, 15, 0, 1, 0, 0, 0, 12, -2, 0, 0, 0, 8, 3, 0, 6, 0, 10, 0, 0, 0, 0, 2, 0, 3, 0, 0, 0, 0, 0, 0, 3 };

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
	public static int anInt2595 = 0;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "Lclient!br;")
	public static Class21 aClass21_5 = null;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)I")
	public static int method2297(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)I")
	public static int method2298(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(61) char local61;
			if (local17 == '\u0000') {
				local61 = arg1.charAt(local13++);
			} else {
				local61 = local17;
			}
			@Pc(71) char local71;
			if (local19 == '\u0000') {
				local71 = arg0.charAt(local15++);
			} else {
				local71 = local19;
			}
			local17 = Static281.method4797(local61);
			local19 = Static281.method4797(local71);
			local61 = Static125.method2594(arg2, local61);
			local71 = Static125.method2594(arg2, local71);
			if (local71 != local61 && Character.toUpperCase(local61) != Character.toUpperCase(local71)) {
				local61 = Character.toLowerCase(local61);
				local71 = Character.toLowerCase(local71);
				if (local71 != local61) {
					return Static194.method3662(arg2, local61) - Static194.method3662(arg2, local71);
				}
			}
		}
		@Pc(129) int local129 = Math.min(local8, local11);
		for (@Pc(139) int local139 = 0; local139 < local129; local139++) {
			if (arg2 == 2) {
				local13 = local8 - local139 - 1;
				local15 = local11 - local139 - 1;
			} else {
				local15 = local139;
				local13 = local139;
			}
			@Pc(170) char local170 = arg1.charAt(local13);
			@Pc(174) char local174 = arg0.charAt(local15);
			if (local170 != local174 && Character.toUpperCase(local170) != Character.toUpperCase(local174)) {
				local170 = Character.toLowerCase(local170);
				local174 = Character.toLowerCase(local174);
				if (local170 != local174) {
					return Static194.method3662(arg2, local170) - Static194.method3662(arg2, local174);
				}
			}
		}
		@Pc(222) int local222 = local8 - local11;
		if (local222 != 0) {
			return local222;
		}
		for (@Pc(231) int local231 = 0; local231 < local129; local231++) {
			@Pc(237) char local237 = arg1.charAt(local231);
			@Pc(241) char local241 = arg0.charAt(local231);
			if (local241 != local237) {
				return Static194.method3662(arg2, local237) - Static194.method3662(arg2, local241);
			}
		}
		return 0;
	}
}

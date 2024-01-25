import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "Lclient!ka;")
	public static Class3_Sub7_Sub13 aClass3_Sub7_Sub13_6;

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "[I")
	public static int[] anIntArray530;

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
	public static int anInt6364;

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
	public static int anInt6367;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
	public static int anInt6368;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
	public static int anInt6365 = -1;

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "[Lclient!md;")
	public static final Class131[] aClass131Array5 = new Class131[14];

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5393(@OriginalArg(0) String arg0) {
		for (@Pc(19) int local19 = 0; local19 < Static137.aStringArray12.length; local19++) {
			if (Static137.aStringArray12[local19].equalsIgnoreCase(arg0)) {
				return local19;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIZ)V")
	public static void method5395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(19) int local19 = arg0 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(46) int local46 = Static302.aShort91 + local19 * (Static46.aShort5 - Static302.aShort91) / 100;
		if (local46 < Static165.aShort37) {
			local46 = Static165.aShort37;
		} else if (Static144.aShort36 < local46) {
			local46 = Static144.aShort36;
		}
		@Pc(72) int local72 = arg0 * 512 * local46 / (arg3 * 334);
		@Pc(109) int local109;
		@Pc(116) int local116;
		@Pc(84) short local84;
		if (local72 < Static178.aShort49) {
			local84 = Static178.aShort49;
			local46 = arg3 * local84 * 334 / (arg0 * 512);
			if (local46 > Static144.aShort36) {
				local46 = Static144.aShort36;
				local109 = arg0 * local46 * 512 / (local84 * 334);
				local116 = (arg3 - local109) / 2;
				if (arg4) {
					Static212.aClass122_2.method4734();
					Static212.aClass122_2.method4801(arg0, arg1, arg2, local116, -16777216);
					Static212.aClass122_2.method4801(arg0, arg1 + arg3 - local116, arg2, local116, -16777216);
				}
				arg1 += local116;
				arg3 -= local116 * 2;
			}
		} else if (Static56.aShort6 < local72) {
			local84 = Static56.aShort6;
			local46 = local84 * arg3 * 334 / (arg0 * 512);
			if (Static165.aShort37 > local46) {
				local46 = Static165.aShort37;
				local109 = arg3 * local84 * 334 / (local46 * 512);
				local116 = (arg0 - local109) / 2;
				if (arg4) {
					Static212.aClass122_2.method4734();
					Static212.aClass122_2.method4801(local116, arg1, arg2, arg3, -16777216);
					Static212.aClass122_2.method4801(local116, arg1, arg0 + arg2 - local116, arg3, -16777216);
				}
				arg0 -= local116 * 2;
				arg2 += local116;
			}
		}
		Static227.anInt4634 = arg2;
		Static305.anInt6003 = (short) arg3;
		Static20.anInt552 = arg0 * local46 / 334;
		Static349.anInt6771 = (short) arg0;
		Static247.anInt4892 = arg1;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIII)I")
	public static int method5396(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(11) int local11 = arg1;
			arg1 = arg0;
			arg0 = local11;
		}
		@Pc(23) int local23 = arg5 & 0x3;
		if (local23 == 0) {
			return arg4;
		} else if (local23 == 1) {
			return arg2;
		} else if (local23 == 2) {
			return 7 + 1 - arg4 - arg1;
		} else {
			return 1 + 7 - arg0 - arg2;
		}
	}
}

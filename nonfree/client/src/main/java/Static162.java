import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static162 {

	@OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
	public static int anInt3141;

	@OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
	public static int anInt3144;

	@OriginalMember(owner = "client!gg", name = "O", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!gg", name = "I", descriptor = "Lclient!em;")
	public static final Class83 aClass83_72 = new Class83(18, 0);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!gi;)I")
	public static int method2688(@OriginalArg(1) Class118 arg0) {
		if (arg0 == Static569.aClass118_4) {
			return 7681;
		} else if (Static31.aClass118_1 == arg0) {
			return 8448;
		} else if (Static585.aClass118_5 == arg0) {
			return 34165;
		} else if (arg0 == Static327.aClass118_2) {
			return 260;
		} else if (Static528.aClass118_3 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!fc;I)Z")
	public static boolean method2689(@OriginalArg(0) Class93 arg0) {
		return Static215.aClass93_2 == arg0 || Static440.aClass93_7 == arg0 || Static403.aClass93_5 == arg0 || arg0 == Static466.aClass93_8;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)I")
	public static int method2690(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}

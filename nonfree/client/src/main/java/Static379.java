import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static379 {

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
	public static int anInt5638;

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "[S")
	private static final short[] aShortArray74 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "[S")
	private static final short[] aShortArray75 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "[S")
	private static final short[] aShortArray76 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "[[S")
	public static final short[][] aShortArrayArray13 = new short[][] { aShortArray74, aShortArray75, aShortArray76 };

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "Z")
	public static boolean aBoolean423 = false;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "S")
	public static short aShort89 = 32767;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Z")
	public static boolean method4946() {
		if (Static656.anInt10356 == 3) {
			return Static618.anInt9708 == 0 && Static87.anInt1778 == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Z")
	public static boolean method4949(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}

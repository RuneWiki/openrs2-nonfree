import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public static int anInt1159;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "[S")
	public static final short[] aShortArray29 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "[S")
	private static final short[] aShortArray30 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "[S")
	private static final short[] aShortArray31 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { aShortArray30, aShortArray29, aShortArray31 };

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)Z")
	public static boolean method983() {
		if (Static12.aBoolean9) {
			try {
				Static653.method5177(Static7.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}
}

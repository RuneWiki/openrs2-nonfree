import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
	public static int anInt8698;

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "[S")
	public static final short[] aShortArray108 = new short[] { 17, 8, 3, 60, 21, 57, 47, 58 };

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)Z")
	public static boolean method7192() {
		if (Static247.aBoolean402) {
			try {
				Static646.method1435("showVideoAd", Static152.anApplet1);
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}
}

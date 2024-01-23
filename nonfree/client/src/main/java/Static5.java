import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Z")
	public static boolean method40(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && Static136.aBooleanArray9.length > arg0 ? Static136.aBooleanArray9[arg0] : false;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Z")
	public static boolean method41() {
		if (Static282.aBoolean65) {
			try {
				Static304.method1290(Static199.aClass17_3.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(20) Throwable local20) {
			}
		}
		return false;
	}
}

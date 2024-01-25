import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static588 {

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "(I)V")
	public static void method8386() {
		Static35.anInt964 = -1;
		Static51.anInt1226 = 0;
		Static659.anInt10975 = -1;
	}

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "(I)Z")
	public static boolean method8387() {
		return Static160.method2605("jaclib") ? Static160.method2605("hw3d") : false;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(III)Z")
	public static boolean method8388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static410.method6056(arg1, arg0) | (arg0 & 0x70000) != 0 || Static70.method1361(arg1, arg0);
	}

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "(II)I")
	public static int method8390(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}

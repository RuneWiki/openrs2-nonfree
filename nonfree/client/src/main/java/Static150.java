import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
	public static int anInt3121;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "[Lclient!rc;")
	public static final Class3_Sub3_Sub15[] aClass3_Sub3_Sub15Array2 = new Class3_Sub3_Sub15[14];

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Z")
	public static boolean method2783() {
		if (Static437.aBoolean572) {
			try {
				if ((Boolean) Static605.method6792("showingVideoAd", Static533.anApplet4)) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)I")
	public static int method2784() {
		@Pc(11) Class10 local11 = Static220.aClass10_20;
		synchronized (Static220.aClass10_20) {
			return Static220.aClass10_20.method252();
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
	public static void method2785() {
		Static593.method7791();
		Static66.method1526();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILclient!om;)Lclient!caa;")
	public static Class3_Sub12 method2787(@OriginalArg(0) int arg0, @OriginalArg(2) Class246 arg1) {
		@Pc(13) byte[] local13 = arg1.method5679(arg0);
		return local13 == null ? null : new Class3_Sub12(local13);
	}
}

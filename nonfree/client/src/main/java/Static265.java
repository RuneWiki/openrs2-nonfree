import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_53 = new Class303(19, 2);

	@OriginalMember(owner = "client!k", name = "r", descriptor = "I")
	public static int anInt4662 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Lclient!wp;")
	public static Class361 method4040(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static380.aClass361ArrayArray2[local12] == null || Static380.aClass361ArrayArray2[local12][local16] == null) {
			@Pc(30) boolean local30 = Static293.method3974(local12);
			if (!local30) {
				return null;
			}
		}
		return Static380.aClass361ArrayArray2[local12][local16];
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!rb;Z)V")
	public static void method4043(@OriginalArg(0) Class41_Sub2 arg0) {
		if (Static74.aBoolean149) {
			Static12.aClass187Array2[Static12.aClass187Array2.length - 1].method4394(arg0);
		} else {
			Static434.method6088(arg0, Static485.aClass3_Sub10Array5);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Z")
	public static boolean method4044() {
		if (Static63.aBoolean115) {
			try {
				Static600.method2617("showVideoAd", Static31.anApplet1);
				return true;
			} catch (@Pc(13) Throwable local13) {
			}
		}
		return false;
	}
}

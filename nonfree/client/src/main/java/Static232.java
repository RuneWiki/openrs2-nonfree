import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static232 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILclient!gaa;I)V")
	public static void method4481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class108 arg2) {
		if (Static233.aClass108_7 != null || Static433.aBoolean672 || (arg2 == null || Static536.method7620(arg2) == null)) {
			return;
		}
		Static233.aClass108_7 = arg2;
		Static326.aClass108_8 = Static536.method7620(arg2);
		Static60.aBoolean100 = false;
		Static77.anInt3994 = arg0;
		Static28.anInt483 = arg1;
		Static196.anInt4619 = 0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBI)Z")
	public static boolean method4482(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)Z")
	public static boolean method4483(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}

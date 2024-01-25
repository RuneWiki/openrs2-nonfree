import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static230 {

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(BIZ)V")
	public static void method3482(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		Static184.anInt3253 = arg0;
		Static404.anInt7074 = 3;
		Static249.method3697(Static553.aClass227_5.anInt5547, Static553.aClass227_5.aString53);
		if (arg1) {
			Static199.method3213(false, "", "");
		} else {
			Static220.method3412();
			Static199.method3213(false, Static245.aString41, Static368.aString61);
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)Z")
	public static boolean method3483(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}
}

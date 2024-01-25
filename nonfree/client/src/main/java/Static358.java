import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static358 {

	@OriginalMember(owner = "client!ol", name = "y", descriptor = "Lclient!qk;")
	public static Class246 aClass246_3;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)Z")
	public static boolean method5520() {
		return Static257.anInt5147 > 0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILclient!oh;)I")
	public static int method5521(@OriginalArg(1) int arg0, @OriginalArg(2) Class220 arg1) {
		if (!Static68.method1303(arg1).method1958(arg0) && arg1.anObjectArray30 == null) {
			return -1;
		} else if (arg1.anIntArray494 == null || arg0 >= arg1.anIntArray494.length) {
			return -1;
		} else {
			return arg1.anIntArray494[arg0];
		}
	}
}

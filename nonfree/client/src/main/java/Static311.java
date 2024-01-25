import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!uu;")
	public static Class343 aClass343_155;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_177 = new Class194(0, -2);

	@OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
	public static int[] anIntArray331 = null;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method5225() {
		Static471.aBoolean575 = false;
		Static647.method8677();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
	public static boolean method5226(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method5227() {
		if (Static369.aClass302_1 != null) {
			Static369.aClass302_1.method7395();
		}
		if (Static188.aThread3 == null) {
			return;
		}
		while (true) {
			try {
				Static188.aThread3.join();
				return;
			} catch (@Pc(19) InterruptedException local19) {
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)Z")
	public static boolean method5228(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}

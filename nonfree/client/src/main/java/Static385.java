import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "Lclient!iga;")
	public static final Class159 aClass159_10 = new Class159(4, -1);

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
	public static void method5485() {
		Static403.aClass362_34 = new Class362();
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)Z")
	public static boolean method5486() {
		try {
			@Pc(7) Class374 local7 = new Class374();
			@Pc(17) byte[] local17 = local7.method8740(Static280.aByteArray50);
			Static377.method5355(local17);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIB)Z")
	public static boolean method5488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static301.method4340(arg1, arg0) & (Static76.method1319(arg0, arg1) | (arg0 & 0x2000) != 0 | Static214.method3114(arg1, arg0));
	}
}

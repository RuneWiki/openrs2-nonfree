import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)Lclient!vn;")
	public static Class83 method6703() {
		try {
			return (Class83) Class.forName("Class83_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIZII)V")
	public static void method6704(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static293.method3974(arg0)) {
			Static385.method5694(arg1, arg2, arg3, -1, Static380.aClass361ArrayArray2[arg0]);
		}
	}
}

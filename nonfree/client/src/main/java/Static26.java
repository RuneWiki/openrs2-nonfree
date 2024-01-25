import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!av", name = "s", descriptor = "Lclient!in;")
	public static Class157 aClass157_19;

	@OriginalMember(owner = "client!av", name = "t", descriptor = "I")
	public static int anInt540;

	@OriginalMember(owner = "client!av", name = "x", descriptor = "I")
	public static int anInt543;

	@OriginalMember(owner = "client!av", name = "z", descriptor = "J")
	public static long aLong14;

	@OriginalMember(owner = "client!av", name = "B", descriptor = "I")
	public static int anInt546;

	@OriginalMember(owner = "client!av", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString7 = null;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "(I)V")
	public static void method656() {
		for (@Pc(10) Class2_Sub26 local10 = (Class2_Sub26) Static224.aClass99_38.method3060(); local10 != null; local10 = (Class2_Sub26) Static224.aClass99_38.method3058()) {
			Static415.method6712(local10.anInt5281);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BII)V")
	public static void method659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static80.method2326(arg0)) {
			Static472.method7442(Static631.aClass24ArrayArray2[arg0], arg1);
		}
	}
}

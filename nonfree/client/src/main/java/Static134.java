import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!eo", name = "F", descriptor = "Lclient!hga;")
	public static Class138 aClass138_1;

	@OriginalMember(owner = "client!eo", name = "Q", descriptor = "I")
	public static int anInt2742;

	@OriginalMember(owner = "client!eo", name = "D", descriptor = "Z")
	public static boolean aBoolean181 = false;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2553(@OriginalArg(0) String arg0) {
		return Static187.method3216(10, arg0);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/io/File;B)[B")
	public static byte[] method2554(@OriginalArg(0) File arg0) {
		return Static167.method2939((int) arg0.length(), arg0);
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)Lclient!ai;")
	public static Class14 method2555() {
		try {
			return new Class14_Sub1();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class14) Class.forName("Class14_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class14_Sub2();
			}
		}
	}
}

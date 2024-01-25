import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "Lclient!la;")
	public static Class207 aClass207_76;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method5487(@OriginalArg(1) String arg0) {
		if (Class273.aString81.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class273.aString81.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class273.aString81.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(III)V")
	public static void method5488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub5_Sub21 local12 = Static101.method1629(14, arg0);
		local12.method8958();
		local12.anInt10530 = arg1;
	}
}

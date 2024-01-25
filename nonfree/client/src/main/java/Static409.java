import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "Lclient!wh;")
	public static Class78 aClass78_3;

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "Lclient!eq;")
	public static final Class99 aClass99_56 = new Class99(8);

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/io/File;ZZ)V")
	public static void method6628(@OriginalArg(0) File arg0) {
		if (Static50.anObject8 == null) {
			Static381.method6297();
		}
		try {
			@Pc(15) Class local15 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(36) Method local36 = local15.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local36.invoke(Static50.anObject8, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(56) Exception local56) {
			System.out.println("HeapDump error:");
			local56.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)[Lclient!sd;")
	public static Class309[] method6629() {
		return new Class309[] { Static65.aClass309_14, Static348.aClass309_8, Static5.aClass309_1 };
	}
}

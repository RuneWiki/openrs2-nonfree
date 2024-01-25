import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "[Lclient!wl;")
	public static Class359[] aClass359Array1;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "Lclient!mf;")
	public static final Class222 aClass222_25 = new Class222(50);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/io/File;ZZ)V")
	public static void method3289(@OriginalArg(0) File arg0) {
		if (Static442.anObject18 == null) {
			Static391.method5401();
		}
		try {
			@Pc(15) Class local15 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(36) Method local36 = local15.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local36.invoke(Static442.anObject18, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(56) Exception local56) {
			System.out.println("HeapDump error:");
			local56.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(JZ)V")
	public static void method3291(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)Z")
	public static boolean method3294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static65.method1177(arg1, arg0) & Static565.method7759(arg1, arg0);
	}
}

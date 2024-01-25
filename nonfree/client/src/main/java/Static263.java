import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "Lclient!bs;")
	public static final Class40 aClass40_7 = new Class40();

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
	public static void method4022() {
		@Pc(5) Class6 local5 = Static475.aClass6_58;
		synchronized (Static475.aClass6_58) {
			Static475.aClass6_58.method102();
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILjava/io/File;Z)V")
	public static void method4023(@OriginalArg(1) File arg0) {
		if (Static371.anObject13 == null) {
			Static148.method2832();
		}
		try {
			@Pc(10) Class local10 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(31) Method local31 = local10.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local31.invoke(Static371.anObject13, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(56) Exception local56) {
			System.out.println("HeapDump error:");
			local56.printStackTrace();
		}
	}
}

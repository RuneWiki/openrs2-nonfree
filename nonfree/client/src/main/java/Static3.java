import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
	public static int anInt140;

	@OriginalMember(owner = "client!ab", name = "L", descriptor = "Lclient!iv;")
	public static final Class162 aClass162_1 = new Class162(14, 4);

	@OriginalMember(owner = "client!ab", name = "N", descriptor = "Lclient!cr;")
	public static final Class54 aClass54_1 = new Class54();

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZILjava/io/File;)V")
	public static void method116(@OriginalArg(2) File arg0) {
		if (Static9.anObject1 == null) {
			Static95.method2112();
		}
		try {
			@Pc(10) Class local10 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(31) Method local31 = local10.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local31.invoke(Static9.anObject1, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(51) Exception local51) {
			System.out.println("HeapDump error:");
			local51.printStackTrace();
		}
	}
}

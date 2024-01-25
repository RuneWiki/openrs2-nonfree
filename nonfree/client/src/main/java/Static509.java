import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray39;

	@OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
	public static int anInt8222;

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_127 = new Class218(61, -1);

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
	public static int anInt8221 = 0;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IZLjava/io/File;)V")
	public static void method7201(@OriginalArg(2) File arg0) {
		if (Static82.anObject3 == null) {
			Static677.method9373();
		}
		try {
			@Pc(18) Class local18 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(39) Method local39 = local18.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local39.invoke(Static82.anObject3, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(59) Exception local59) {
			System.out.println("HeapDump error:");
			local59.printStackTrace();
		}
	}
}

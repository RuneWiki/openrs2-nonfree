import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!nw", name = "z", descriptor = "Ljava/lang/Class;")
	private static Class aClass39;

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "[I")
	public static final int[] anIntArray373 = new int[1];

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZBLjava/io/File;)V")
	public static void method6294(@OriginalArg(2) File arg0) {
		if (Static413.anObject16 == null) {
			Static292.method4843();
		}
		try {
			@Pc(22) Class local22 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(48) Method local48 = local22.getDeclaredMethod("dumpHeap", aClass39 == null ? (aClass39 = Class259.a("java.lang.String")) : aClass39, Boolean.TYPE);
			local48.invoke(Static413.anObject16, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(68) Exception local68) {
			System.out.println("HeapDump error:");
			local68.printStackTrace();
		}
	}
}

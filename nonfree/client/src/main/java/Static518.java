import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!rm", name = "J", descriptor = "I")
	public static int anInt8630;

	@OriginalMember(owner = "client!rm", name = "M", descriptor = "I")
	public static int anInt8632;

	@OriginalMember(owner = "client!rm", name = "O", descriptor = "I")
	public static int anInt8634;

	@OriginalMember(owner = "client!rm", name = "G", descriptor = "I")
	public static int anInt8627 = 0;

	@OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
	public static int anInt8629 = 0;

	@OriginalMember(owner = "client!rm", name = "K", descriptor = "I")
	public static int anInt8631 = -1;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/io/File;IZ)V")
	public static void method7339(@OriginalArg(0) File arg0) {
		if (Static120.anObject6 == null) {
			Static356.method5360();
		}
		try {
			@Pc(10) Class local10 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(31) Method local31 = local10.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local31.invoke(Static120.anObject6, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(51) Exception local51) {
			System.out.println("HeapDump error:");
			local51.printStackTrace();
		}
	}
}

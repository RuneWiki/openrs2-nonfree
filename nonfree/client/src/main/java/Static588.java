import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
	public static int anInt9639;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
	public static final int[] anIntArray531 = new int[2];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/io/File;Z)V")
	public static void method8005(@OriginalArg(1) File arg0) {
		if (Static536.anObject18 == null) {
			Static25.method352();
		}
		try {
			@Pc(10) Class local10 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(31) Method local31 = local10.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local31.invoke(Static536.anObject18, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(51) Exception local51) {
			System.out.println("HeapDump error:");
			local51.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBI)Z")
	public static boolean method8006(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}

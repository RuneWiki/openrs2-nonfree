import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!pja", name = "u", descriptor = "I")
	public static int anInt8000;

	// $FF: synthetic field
	@OriginalMember(owner = "client!pja", name = "s", descriptor = "Ljava/lang/Class;")
	private static Class aClass21;

	@OriginalMember(owner = "client!pja", name = "q", descriptor = "Lclient!sja;")
	public static final Class342 aClass342_61 = new Class342();

	@OriginalMember(owner = "client!pja", name = "f", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_29 = new Class320(40);

	@OriginalMember(owner = "client!pja", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(ZLjava/io/File;B)V")
	public static void method6844(@OriginalArg(1) File arg0) {
		if (Static276.anObject9 == null) {
			Static507.method6903();
		}
		try {
			@Pc(14) Class local14 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(48) Method local48 = local14.getDeclaredMethod("dumpHeap", aClass21 == null ? (aClass21 = Class291.a("java.lang.String")) : aClass21, Boolean.TYPE);
			local48.invoke(Static276.anObject9, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(68) Exception local68) {
			System.out.println("HeapDump error:");
			local68.printStackTrace();
		}
	}
}

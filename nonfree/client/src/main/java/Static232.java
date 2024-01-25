import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "Lclient!vj;")
	public static Class367 aClass367_1;

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "Lclient!fh;")
	public static final Class114 aClass114_23 = new Class114();

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_85 = new Class200(102, 16);

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!av;)V")
	public static void method3730(@OriginalArg(0) Class25 arg0) {
		Static141.aClass25_2 = arg0;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZLjava/io/File;I)V")
	public static void method3731(@OriginalArg(1) File arg0) {
		if (Static155.anObject5 == null) {
			Static462.method6525();
		}
		try {
			@Pc(10) Class local10 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(31) Method local31 = local10.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local31.invoke(Static155.anObject5, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(56) Exception local56) {
			System.out.println("HeapDump error:");
			local56.printStackTrace();
		}
	}
}

import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bha", name = "d", descriptor = "Lclient!hp;")
	public static Class112 aClass112_1;

	@OriginalMember(owner = "client!bha", name = "g", descriptor = "[Lclient!mea;")
	public static Class230[] aClass230Array1;

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_17 = new Class100(8, -1);

	@OriginalMember(owner = "client!bha", name = "e", descriptor = "Lclient!dt;")
	public static final Class77 aClass77_1 = new Class77("game3", "Game 3", 2);

	@OriginalMember(owner = "client!bha", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean92 = true;

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(III)I")
	public static int method932(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg0 > arg1) {
			local13 = arg1;
			arg1 = arg0;
			arg0 = local13;
		}
		while (arg0 != 0) {
			local13 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local13;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(BLjava/io/File;Z)V")
	public static void method933(@OriginalArg(1) File arg0) {
		if (Static314.anObject14 == null) {
			Static630.method8819();
		}
		try {
			@Pc(10) Class local10 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(31) Method local31 = local10.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local31.invoke(Static314.anObject14, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(58) Exception local58) {
			System.out.println("HeapDump error:");
			local58.printStackTrace();
		}
	}
}

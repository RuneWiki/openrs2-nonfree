import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V")
	public static void method5359() {
		Static465.method6989();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static204.aClass48Array1[local8].method1636();
		}
		Static551.method7733();
		Static593.method8194();
		Static505.method7310();
		System.gc();
		Static171.aClass16_5.ya();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZLjava/io/File;Z)V")
	public static void method5360(@OriginalArg(1) File arg0) {
		if (Static635.anObject24 == null) {
			Static466.method7019();
		}
		try {
			@Pc(14) Class local14 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(35) Method local35 = local14.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local35.invoke(Static635.anObject24, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(55) Exception local55) {
			System.out.println("HeapDump error:");
			local55.printStackTrace();
		}
	}
}

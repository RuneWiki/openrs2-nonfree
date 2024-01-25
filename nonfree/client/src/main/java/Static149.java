import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
	public static void method2364() {
		for (@Pc(7) int local7 = 0; local7 < Static277.anInt5443; local7++) {
			@Pc(13) Class224 local13 = Static280.aClass224Array1[local7];
			if (local13.aByte78 == 3) {
				if (local13.aClass6_Sub3_Sub3_1 == null) {
					local13.anInt6904 = Integer.MIN_VALUE;
				} else {
					Static196.aClass6_Sub3_Sub1_1.method270(local13.aClass6_Sub3_Sub3_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/io/File;IZ)V")
	public static void method2367(@OriginalArg(0) File arg0) {
		if (Static110.anObject1 == null) {
			Static186.method3359();
		}
		try {
			@Pc(10) Class local10 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(35) Method local35 = local10.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local35.invoke(Static110.anObject1, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(55) Exception local55) {
			System.out.println("HeapDump error:");
			local55.printStackTrace();
		}
	}
}

import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!gba", name = "E", descriptor = "Lclient!gl;")
	public static Class49_Sub1 aClass49_Sub1_2;

	@OriginalMember(owner = "client!gba", name = "G", descriptor = "I")
	public static int anInt3474;

	@OriginalMember(owner = "client!gba", name = "t", descriptor = "Lclient!tb;")
	public static final Class313 aClass313_20 = new Class313(4);

	@OriginalMember(owner = "client!gba", name = "H", descriptor = "[I")
	public static final int[] anIntArray195 = new int[2048];

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "([BI)Z")
	public static boolean method2870(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub15 local8 = new Class2_Sub15(arg0);
		@Pc(12) int local12 = local8.method4325();
		if (local12 != 2) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method4325() == 1;
		if (local28) {
			Static241.method3718(local8);
		}
		Static200.method3288(local8);
		return true;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!qi;I)V")
	public static void method2871(@OriginalArg(0) Class6_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(11) Class2_Sub39 local11 = (Class2_Sub39) Static175.aClass162_19.method3519((long) arg0.lb);
		if (local11 == null) {
			Static276.method3101(arg0, null, 0, null, arg0.anIntArray510[0], arg0.anIntArray509[0], arg0.aByte112);
		} else {
			local11.method6368();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZLjava/io/File;)V")
	public static void method2874(@OriginalArg(2) File arg0) {
		if (Static149.anObject19 == null) {
			Static129.method2162();
		}
		try {
			@Pc(14) Class local14 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(35) Method local35 = local14.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local35.invoke(Static149.anObject19, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(55) Exception local55) {
			System.out.println("HeapDump error:");
			local55.printStackTrace();
		}
	}
}

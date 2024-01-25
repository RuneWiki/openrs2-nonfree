import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static663 {

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "Lclient!pm;")
	public static Class291 aClass291_4;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ut", name = "v", descriptor = "Ljava/lang/Class;")
	private static Class aClass24;

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
	public static int anInt10562 = -1;

	@OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
	public static int anInt10567 = 0;

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "I")
	public static int anInt10568 = 0;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(III)Z")
	public static boolean method8834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method8836(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (arg1.length() > 320 || !Static137.method2243()) {
			return;
		}
		Static532.aClass400_2.method9229();
		Static276.method4225();
		Static715.aString107 = arg1;
		Static321.aString95 = arg0;
		Static638.method8657(5);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/io/File;ZB)V")
	public static void method8839(@OriginalArg(0) File arg0) {
		if (Static381.anObject19 == null) {
			Static454.method6740();
		}
		try {
			@Pc(14) Class local14 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(40) Method local40 = local14.getDeclaredMethod("dumpHeap", aClass24 == null ? (aClass24 = Class3_Sub54.a("java.lang.String")) : aClass24, Boolean.TYPE);
			local40.invoke(Static381.anObject19, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(60) Exception local60) {
			System.out.println("HeapDump error:");
			local60.printStackTrace();
		}
	}
}

import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!qaa", name = "j", descriptor = "I")
	public static int anInt7992;

	@OriginalMember(owner = "client!qaa", name = "g", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_72 = new Class344(1, 18);

	@OriginalMember(owner = "client!qaa", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!qaa", name = "n", descriptor = "I")
	public static int anInt7995 = 0;

	@OriginalMember(owner = "client!qaa", name = "p", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_73 = new Class344(42, -1);

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static292.anInt5983 <= arg8 && arg8 <= Static61.anInt1627 && Static292.anInt5983 <= arg7 && Static61.anInt1627 >= arg7 && arg1 >= Static292.anInt5983 && arg1 <= Static61.anInt1627 && Static292.anInt5983 <= arg6 && arg6 <= Static61.anInt1627 && arg4 >= Static289.anInt5872 && arg4 <= Static160.anInt3347 && arg3 >= Static289.anInt5872 && Static160.anInt3347 >= arg3 && Static289.anInt5872 <= arg5 && Static160.anInt3347 >= arg5 && Static289.anInt5872 <= arg0 && Static160.anInt3347 >= arg0) {
			Static366.method5525(arg3, arg8, arg0, arg6, arg1, arg2, arg5, arg7, arg4);
		} else {
			Static529.method7482(arg5, arg1, arg2, arg3, arg6, arg0, arg8, arg4, arg7);
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Ljava/io/File;ZI)V")
	public static void method6253(@OriginalArg(0) File arg0) {
		if (Static450.anObject119 == null) {
			Static97.method1899();
		}
		try {
			@Pc(10) Class local10 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(31) Method local31 = local10.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local31.invoke(Static450.anObject119, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(59) Exception local59) {
			System.out.println("HeapDump error:");
			local59.printStackTrace();
		}
	}
}

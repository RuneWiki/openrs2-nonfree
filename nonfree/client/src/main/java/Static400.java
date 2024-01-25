import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "[I")
	public static int[] anIntArray575;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
	public static int anInt6932;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
	public static int anInt6934;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "[I")
	public static final int[] anIntArray574 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Z")
	public static boolean aBoolean448 = false;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
	public static final int[] anIntArray576 = new int[1000];

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_176 = new Class131(38, 8);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIBI)V")
	public static void method5423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 - arg4 >= Static83.anInt7380 && Static221.anInt4001 >= arg4 + arg0 && Static305.anInt5429 <= arg3 - arg4 && Static212.anInt452 >= arg4 + arg3) {
			Static209.method6070(arg3, arg4, arg5, arg0, arg2, arg1);
		} else {
			Static402.method5427(arg2, arg1, arg0, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	public static void method5425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(arg1, 12);
		local8.method202();
		local8.anInt214 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	public static void method5426() {
		Static235.method3483();
		Static33.aClass78_1 = null;
		Static269.aClass109_9 = null;
		Static150.aClass33ArrayArray1 = null;
		Static256.aClass78_3 = null;
		Static441.aClass78_4 = null;
	}
}

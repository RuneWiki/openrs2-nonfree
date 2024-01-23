import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	public static int anInt3155;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	public static int anInt3159;

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "[I")
	public static int[] anIntArray332;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "Lclient!ob;")
	public static Class70 aClass70_11 = new Class70(32);

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "Lclient!i;")
	private static Class41 aClass41_864 = Static184.method2923("Error connecting to server)3");

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_865 = aClass41_864;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	public static int anInt3160 = -1;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
	public static int anInt3164 = 0;

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "Lclient!i;")
	private static Class41 aClass41_867 = Static184.method2923("Loading sprites )2 ");

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "Lclient!i;")
	public static Class41 aClass41_866 = aClass41_867;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)V")
	public static void method2163(@OriginalArg(1) int arg0) {
		@Pc(1) Class11 local1 = Static39.aClass11_1;
		synchronized (Static39.aClass11_1) {
			Static168.anInt3891 = arg0;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class8 local3 = new Class8();
		local3.anInt404 = arg2 / 128;
		local3.anInt395 = arg3 / 128;
		local3.anInt388 = arg4 / 128;
		local3.anInt400 = arg5 / 128;
		local3.anInt391 = arg1;
		local3.anInt386 = arg2;
		local3.anInt394 = arg3;
		local3.anInt392 = arg4;
		local3.anInt405 = arg5;
		local3.anInt390 = arg6;
		local3.anInt397 = arg7;
		Static56.aClass8ArrayArray1[arg0][Static56.anIntArray158[arg0]++] = local3;
	}
}

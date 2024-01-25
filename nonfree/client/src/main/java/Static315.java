import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
	public static int anInt6453;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
	public static int anInt6454;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
	public static int anInt6455;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
	public static int anInt6452 = 0;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "[I")
	public static final int[] anIntArray616 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	public static int anInt6456 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method5745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class14_Sub16 local7 = new Class14_Sub16();
		local7.anInt2332 = arg11;
		local7.anInt2340 = arg6;
		local7.anInt2342 = arg9;
		local7.anInt2331 = arg5;
		local7.anInt2341 = arg4;
		local7.anInt2345 = arg3;
		local7.anInt2336 = arg7;
		local7.anInt2337 = arg8;
		local7.anInt2330 = arg1;
		local7.anInt2335 = arg10;
		local7.anInt2343 = arg2;
		local7.anInt2333 = arg0;
		Static316.aClass18_17.method451(local7);
	}
}

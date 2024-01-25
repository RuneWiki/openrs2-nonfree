import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
	public static int anInt3821;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "Z")
	public static boolean aBoolean295 = false;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
	public static final int anInt3825 = -1;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBI)Z")
	public static boolean method3264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(JJ)J")
	public static long method3267(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIZIIIII)V")
	public static void method3268(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static227.aClass3_Sub15_11.aClass17_Sub3_4.method741() != 0 && arg2 != 0 && Static228.anInt2286 < 50 && arg3 != -1) {
			Static631.aClass303Array2[Static228.anInt2286++] = new Class303((byte) 2, arg3, arg2, arg1, arg4, arg0, arg5, (Class23_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIII)V")
	public static void method3269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg0, 8);
		local9.method1712();
		local9.anInt1790 = arg1;
		local9.anInt1782 = arg3;
		local9.anInt1789 = arg2;
	}
}

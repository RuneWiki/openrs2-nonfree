import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "Lclient!eca;")
	public static Class83 aClass83_6;

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_110 = new Class100(36, 7);

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "[I")
	public static int[] anIntArray664 = new int[1];

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
	public static int anInt9043 = 0;

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
	public static int anInt9044 = 0;

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
	public static int anInt9045 = 0;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBII)V")
	public static void method7479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class14_Sub3_Sub9 local14 = Static142.method2219((long) arg1, 9);
		local14.method2817();
		local14.anInt3419 = arg2;
		local14.anInt3413 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIIII)V")
	public static void method7480(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (anInt9045 <= arg2 - arg0 && arg0 + arg2 <= Static575.anInt9879 && arg4 - arg0 >= Static468.anInt355 && arg0 + arg4 <= Static370.anInt10475) {
			Static333.method5216(arg1, arg0, arg4, arg5, arg2, arg3);
		} else {
			Static82.method1537(arg1, arg4, arg3, arg5, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Z")
	public static boolean method7481(@OriginalArg(1) int arg0) {
		return arg0 == 30 || arg0 == 6 || arg0 == 1004 || arg0 == 5 || arg0 == 3;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIB)Z")
	public static boolean method7483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!pa", name = "K", descriptor = "Lclient!am;")
	public static Class11 aClass11_98;

	@OriginalMember(owner = "client!pa", name = "Q", descriptor = "[[[Lclient!e;")
	public static Class57[][][] aClass57ArrayArrayArray2;

	@OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
	public static int anInt4924 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z[[BBLclient!bl;IILclient!bl;Lclient!vm;[[B[[BI[[I[[B)V")
	public static void method4083(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class26 arg5, @OriginalArg(7) Class92 arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[][] arg10, @OriginalArg(12) byte[][] arg11) {
		if (Static6.anInt1971 == 0 && !Static68.aBoolean122) {
			Static207.method3645(arg8, arg2, arg5, arg9, arg3, arg6, arg11, arg1, arg0, arg10, arg4, arg7);
		} else {
			Static127.method2532(arg9, arg7, arg4, arg1, arg0, arg10, arg6, arg2, arg3, arg8, arg5, arg11);
		}
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
	public static void method4088() {
		@Pc(3) Class204[] local3 = Class63.aClass204Array6;
		synchronized (Class63.aClass204Array6) {
			for (@Pc(13) int local13 = 0; local13 < Class63.aClass204Array6.length; local13++) {
				Class63.aClass204Array6[local13] = new Class204();
				Static162.anIntArray314[local13] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIBII)V")
	public static void method4092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg2, 8);
		local8.method2031();
		local8.anInt2405 = arg0;
		local8.anInt2410 = arg3;
		local8.anInt2403 = arg1;
	}
}

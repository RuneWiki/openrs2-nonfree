import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
	public static int anInt2357;

	@OriginalMember(owner = "client!ds", name = "S", descriptor = "I")
	public static int anInt2368 = -1;

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(Z)V")
	public static void method2230() {
		Static256.method4279(11);
		Static420.method6587();
		System.gc();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method2231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static262.aClass3_Sub27_12.aClass21_Sub14_4.method5405() != 0 && arg4 != 0 && Static393.anInt7276 < 50 && arg5 != -1) {
			Static508.aClass371Array1[Static393.anInt7276++] = new Class371((byte) 1, arg5, arg4, arg3, arg2, arg1, arg0, null);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)I")
	public static int method2232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) double local15 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(30) double local30 = local22 + (local15 - local22) * Math.random();
		return (int) (Math.pow(2.0D, local30) + 0.5D);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)I")
	public static int method2233(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)I")
	public static int method2234(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(42) int local42 = local28 | local28 >>> 16;
		return local42 + 1;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZILclient!la;Ljava/awt/Canvas;Lclient!d;)Lclient!ha;")
	public static Class5 method2235(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class196 arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) Interface7 arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg3 != null) {
			@Pc(12) Dimension local12 = arg3.getSize();
			local5 = local12.width;
			local7 = local12.height;
		}
		return Static198.method7566(local5, arg0, arg3, arg2, local7, arg4, arg1);
	}
}

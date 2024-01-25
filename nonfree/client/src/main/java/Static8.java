import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
	public static int anInt5857;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "[I")
	public static final int[] anIntArray493 = new int[500];

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "[I")
	public static final int[] anIntArray494 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
	public static int anInt5866 = 0;

	@OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
	public static int anInt5875 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
	public static void method5005() {
		Static48.method1289();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIII)V")
	public static void method5007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1003) {
			Static196.method3776(10, arg2, arg0);
		} else if (arg1 == 1007) {
			Static196.method3776(11, arg2, arg0);
		} else if (arg1 == 1006) {
			Static196.method3776(12, arg2, arg0);
		} else if (arg1 == 1008) {
			Static196.method3776(13, arg2, arg0);
		} else if (arg1 == 1004) {
			Static196.method3776(14, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)I")
	public static int method5011(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIII)V")
	public static void method5018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static47.anInt1510; local5++) {
			@Pc(13) Rectangle local13 = Class1_Sub4_Sub13.aRectangleArray5[local5];
			if (arg3 < local13.x + local13.width && local13.x < arg1 + arg3 && local13.y + local13.height > arg2 && arg0 + arg2 > local13.y) {
				Static223.aBooleanArray28[local5] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lclient!gm;")
	public static Class1_Sub4_Sub11 method5022(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub4_Sub11 local10 = (Class1_Sub4_Sub11) Static118.aClass92_4.method2606((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(23) byte[] local23;
		if (arg0 < 32768) {
			local23 = Static227.aClass216_77.method5648(1, arg0);
		} else {
			local23 = Static146.aClass216_52.method5648(1, arg0 & 0x7FFF);
		}
		local10 = new Class1_Sub4_Sub11();
		if (local23 != null) {
			local10.method2088(new Class1_Sub8(local23));
		}
		if (arg0 >= 32768) {
			local10.method2087();
		}
		Static118.aClass92_4.method2601((long) arg0, local10);
		return local10;
	}
}

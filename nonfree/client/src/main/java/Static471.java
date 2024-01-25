import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!pw", name = "o", descriptor = "Lclient!gj;")
	public static Class143 aClass143_144;

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray108 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!pw", name = "n", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_202 = new Class126(96, 7);

	@OriginalMember(owner = "client!pw", name = "p", descriptor = "Z")
	public static boolean aBoolean734 = false;

	@OriginalMember(owner = "client!pw", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString127 = null;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)I")
	public static int method8498(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "([BIII)[B")
	public static byte[] method8500(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static689.method8055(arg0, arg1, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) Class3_Sub49 local7 = null;
		for (@Pc(12) Class3_Sub49 local12 = (Class3_Sub49) Static462.aClass193_48.method4457(); local12 != null; local12 = (Class3_Sub49) Static462.aClass193_48.method4459()) {
			if (local12.anInt8927 == arg2 && arg5 == local12.anInt8929 && local12.anInt8924 == arg3 && local12.anInt8928 == arg4) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub49();
			local7.anInt8929 = arg5;
			local7.anInt8924 = arg3;
			local7.anInt8927 = arg2;
			local7.anInt8928 = arg4;
			if (arg5 >= 0 && arg3 >= 0 && arg5 < Static251.anInt4680 && Static406.anInt6924 > arg3) {
				Static573.method7743(local7);
			}
			Static462.aClass193_48.method4462(local7);
		}
		local7.anInt8934 = arg6;
		local7.anInt8922 = arg1;
		local7.aBoolean664 = true;
		local7.aBoolean665 = false;
		local7.anInt8925 = arg0;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIB)V")
	public static void method8502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static47.anInt1250; local3++) {
			@Pc(17) Rectangle local17 = Class84_Sub2.aRectangleArray2[local3];
			if (local17.x + local17.width > arg0 && arg2 + arg0 > local17.x && local17.y + local17.height > arg1 && local17.y < arg1 + arg3) {
				Static119.aBooleanArray10[local3] = true;
			}
		}
		Static120.method2177(arg0, arg2 + arg0, arg1, arg3 + arg1);
	}
}

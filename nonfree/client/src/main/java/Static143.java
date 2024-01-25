import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ev", name = "E", descriptor = "[I")
	public static int[] anIntArray129;

	@OriginalMember(owner = "client!ev", name = "G", descriptor = "[I")
	public static final int[] anIntArray130 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!ev", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString27 = null;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method2824(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!oi;II)V")
	public static void method2825(@OriginalArg(0) Class9_Sub4_Sub2_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static384.anInt7234 < arg0.anInt4316) {
			Static306.method5161(arg0);
		} else if (arg0.anInt4351 >= Static384.anInt7234) {
			Static513.method7353(arg0);
		} else {
			Static571.method7991(false, arg0);
			local9 = Static623.anInt10492;
			local7 = Static511.anInt8817;
		}
		if (arg0.anInt10360 < 512 || arg0.anInt10357 < 512 || arg0.anInt10360 >= Static306.anInt6176 * 512 - 512 || arg0.anInt10357 >= Static108.anInt2930 * 512 - 512) {
			arg0.anInt4306 = -1;
			arg0.anIntArray189 = null;
			arg0.anInt4294 = -1;
			local7 = -1;
			local9 = 0;
			arg0.anInt4351 = 0;
			arg0.anInt4341 = -1;
			arg0.anInt4316 = 0;
			arg0.anInt10360 = arg0.anIntArray197[0] * 512 + arg0.method3620() * 256;
			arg0.anInt10357 = arg0.anIntArray198[0] * 512 + arg0.method3620() * 256;
			arg0.method3617();
		}
		if (arg0 == Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 && (arg0.anInt10360 < 6144 || arg0.anInt10357 < 6144 || arg0.anInt10360 >= (Static306.anInt6176 - 12) * 512 || (Static108.anInt2930 - 12) * 512 <= arg0.anInt10357)) {
			arg0.anIntArray189 = null;
			arg0.anInt4351 = 0;
			local7 = -1;
			arg0.anInt4341 = -1;
			arg0.anInt4306 = -1;
			arg0.anInt4294 = -1;
			local9 = 0;
			arg0.anInt4316 = 0;
			arg0.anInt10360 = arg0.anIntArray197[0] * 512 + arg0.method3620() * 256;
			arg0.anInt10357 = arg0.anIntArray198[0] * 512 + arg0.method3620() * 256;
			arg0.method3617();
		}
		@Pc(218) int local218 = Static203.method3700(arg0);
		Static196.method3568(arg0);
		Static539.method7624(local9, arg0, local7, local218);
		Static497.method7193(local7, arg0);
		Static579.method8039(arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!gfa", name = "i", descriptor = "Ljava/lang/Object;")
	public static Object anObject15;

	@OriginalMember(owner = "client!gfa", name = "h", descriptor = "[S")
	private static final short[] aShortArray72 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "[S")
	private static final short[] aShortArray70 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!gfa", name = "d", descriptor = "[S")
	private static final short[] aShortArray69 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!gfa", name = "g", descriptor = "[S")
	private static final short[] aShortArray71 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "[[S")
	public static final short[][] aShortArrayArray14 = new short[][] { aShortArray72, aShortArray70, aShortArray69, aShortArray71 };

	@OriginalMember(owner = "client!gfa", name = "f", descriptor = "Lclient!lj;")
	public static final Class210 aClass210_4 = new Class210(6, 0, 4, 2);

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
	public static void method3184() {
		@Pc(5) int local5 = 0;
		if (Static189.aClass4_Sub2_Sub1_1 != null) {
			local5 = Static189.aClass4_Sub2_Sub1_1.method7657(Static403.anInt6994);
		}
		@Pc(36) int local36;
		@Pc(43) int local43;
		if (local5 == 2) {
			local36 = Static376.anInt6720 > 800 ? 800 : Static376.anInt6720;
			local43 = Static86.anInt2256 > 600 ? 600 : Static86.anInt2256;
			Static191.anInt5908 = (Static376.anInt6720 - local36) / 2;
			Static2.anInt29 = local36;
			Static19.anInt390 = local43;
			Static249.anInt4946 = 0;
		} else if (local5 == 1) {
			local36 = Static376.anInt6720 <= 1024 ? Static376.anInt6720 : 1024;
			local43 = Static86.anInt2256 > 768 ? 768 : Static86.anInt2256;
			Static191.anInt5908 = (Static376.anInt6720 - local36) / 2;
			Static2.anInt29 = local36;
			Static19.anInt390 = local43;
			Static249.anInt4946 = 0;
		} else {
			Static249.anInt4946 = 0;
			Static191.anInt5908 = 0;
			Static2.anInt29 = Static376.anInt6720;
			Static19.anInt390 = Static86.anInt2256;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IB)Z")
	public static boolean method3185(@OriginalArg(0) int arg0) {
		if (arg0 == 8 || arg0 == 20 || arg0 == 18 || arg0 == 44 || arg0 == 51) {
			return true;
		} else {
			return arg0 == 25 || arg0 == 1012;
		}
	}
}

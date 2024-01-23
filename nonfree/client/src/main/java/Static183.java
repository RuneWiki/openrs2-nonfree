import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "[I")
	public static int[] anIntArray357;

	@OriginalMember(owner = "client!ne", name = "V", descriptor = "[[Lclient!ua;")
	public static Class1_Sub28[][] aClass1_Sub28ArrayArray2;

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "Lclient!th;")
	public static Class168 aClass168_134;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "Lclient!ji;")
	public static Class1_Sub14_Sub1 aClass1_Sub14_Sub1_3 = new Class1_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
	public static int anInt4047 = 0;

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "Z")
	public static boolean aBoolean256 = false;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)Z")
	public static boolean method2969() {
		return Static9.anInt285 == 0 ? Static2.aClass1_Sub10_Sub3_1.method3166() : true;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIII)I")
	public static int method2970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(13) int local13 = arg4;
			arg4 = arg1;
			arg1 = local13;
		}
		@Pc(21) int local21 = arg0 & 0x3;
		if (local21 == 0) {
			return arg2;
		} else if (local21 == 1) {
			return 1 + 7 - arg4 - arg5;
		} else if (local21 == 2) {
			return 7 + 1 - arg2 - arg1;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(II)V")
	public static void method2973(@OriginalArg(0) int arg0) {
		@Pc(6) Class185 local6 = Static253.aClass185_1;
		synchronized (Static253.aClass185_1) {
			Static245.anInt5017 = arg0;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)I")
	public static int method2976(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static303.aByteArrayArrayArray19[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static303.aByteArrayArrayArray19[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}

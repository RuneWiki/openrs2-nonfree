import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!g", name = "B", descriptor = "I")
	public static int anInt3180;

	@OriginalMember(owner = "client!g", name = "x", descriptor = "Lclient!pk;")
	public static final Class258 aClass258_2 = new Class258("WTWIP", 3);

	@OriginalMember(owner = "client!g", name = "D", descriptor = "Z")
	public static boolean aBoolean255 = true;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)I")
	public static int method2593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static521.aByteArrayArrayArray45[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static521.aByteArrayArrayArray45[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2594(@OriginalArg(1) String arg0) {
		return Static547.method5858(arg0, 10);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I")
	public static int method2595(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(IIII)I")
	public static int method2596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return 4095 - arg0;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)V")
	public static void method2597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static386.anInt6800 = arg0;
		Static551.anInt8941 = arg1;
		Static171.anInt9265 = arg5;
		Static177.anInt3716 = arg2;
		Static89.anInt8690 = arg3;
		Static350.anInt6285 = arg4;
	}
}

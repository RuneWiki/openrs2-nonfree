import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!ms", name = "T", descriptor = "[I")
	public static final int[] anIntArray314 = new int[1000];

	@OriginalMember(owner = "client!ms", name = "ad", descriptor = "I")
	public static int anInt4121 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZ)V")
	public static void method3603(@OriginalArg(0) int arg0) {
		Static247.anInt4961 = 3;
		Static31.anInt550 = arg0;
		Static124.anInt2296 = -1;
		Static292.anInt5791 = 100;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
	public static void method3610(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static330.aClass26_57 = new Class26(arg1);
		Static313.aClass26_56 = new Class26(arg0);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)I")
	public static int method3613(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(IZ)I")
	public static int method3616(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 & 0x3F;
		@Pc(20) int local20 = arg0 >> 6 & 0x3;
		if (local14 == 18) {
			if (local20 == 0) {
				return 1;
			}
			if (local20 == 1) {
				return 2;
			}
			if (local20 == 2) {
				return 4;
			}
			if (local20 == 3) {
				return 8;
			}
		} else if (local14 == 19 || local14 == 21) {
			if (local20 == 0) {
				return 16;
			}
			if (local20 == 1) {
				return 32;
			}
			if (local20 == 2) {
				return 64;
			}
			if (local20 == 3) {
				return 128;
			}
		}
		return 0;
	}
}

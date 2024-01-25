import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Lclient!sj;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString12 = null;

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_27 = new Class156(44, 3);

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIII)I")
	public static int method1334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IBI)I")
	public static int method1336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = 0;
		while (arg0 > 0) {
			local13 = local13 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local13;
	}
}

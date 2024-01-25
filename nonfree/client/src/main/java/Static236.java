import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!lr", name = "K", descriptor = "Lclient!qq;")
	public static Class198 aClass198_3;

	@OriginalMember(owner = "client!lr", name = "D", descriptor = "Z")
	public static boolean aBoolean323 = false;

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "Lclient!si;")
	public static final Class217 aClass217_17 = new Class217(11, 2);

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)I")
	public static int method3282(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZIII)I")
	public static int method3283(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg2 & 0x3;
		if (local8 == 0) {
			return arg1;
		} else if (local8 == 1) {
			return arg0;
		} else if (local8 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IBI)I")
	public static int method3286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(21) int local21 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local21;
		}
		return arg1;
	}
}

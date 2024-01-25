import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!op", name = "c", descriptor = "I")
	public static int anInt6771 = 0;

	@OriginalMember(owner = "client!op", name = "f", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_129 = new Class319(40, 3);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIIII)I")
	public static int method5567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(18) int local18 = arg5 & 0x3;
		if (local18 == 0) {
			return arg2;
		} else if (local18 == 1) {
			return 1 + 7 - arg3 - arg0;
		} else if (local18 == 2) {
			return 7 + 1 - arg2 - arg4;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!fv;Z)I")
	public static int method5568(@OriginalArg(0) Class108 arg0) {
		if (arg0 == Static240.aClass108_5) {
			return 7681;
		} else if (arg0 == Static9.aClass108_2) {
			return 8448;
		} else if (Static6.aClass108_7 == arg0) {
			return 34165;
		} else if (Static466.aClass108_4 == arg0) {
			return 260;
		} else if (arg0 == Static379.aClass108_8) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public static void method5569() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static510.aBooleanArray29[local3] = true;
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)Z")
	public static boolean method5570() {
		return Static135.anInt2684 > 0;
	}
}

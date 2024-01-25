import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "I")
	public static final int anInt6210 = -1;

	@OriginalMember(owner = "client!aw", name = "s", descriptor = "[Lclient!tp;")
	public static final Class14_Sub44[] aClass14_Sub44Array2 = new Class14_Sub44[1024];

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIII)I")
	public static int method5484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static446.aByteArrayArrayArray12[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static446.aByteArrayArrayArray12[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(III)I")
	public static int method5492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		if (arg0 > arg1) {
			local10 = arg1;
			arg1 = arg0;
			arg0 = local10;
		}
		while (arg0 != 0) {
			local10 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local10;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "(B)Lclient!er;")
	public static Class102 method5495() {
		try {
			return (Class102) Class.forName("iba").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}
}

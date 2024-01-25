import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
	public static int anInt7949;

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "[I")
	public static int[] anIntArray671;

	@OriginalMember(owner = "client!qca", name = "j", descriptor = "Lclient!gb;")
	public static Class3_Sub26 aClass3_Sub26_1;

	@OriginalMember(owner = "client!qca", name = "k", descriptor = "I")
	public static int anInt7955;

	@OriginalMember(owner = "client!qca", name = "i", descriptor = "[I")
	public static final int[] anIntArray672 = new int[1000];

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIIIII)I")
	public static int method6973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(14) int local14 = arg4;
			arg4 = arg0;
			arg0 = local14;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return 1 + 7 - arg4 - arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg0 - arg5;
		} else {
			return arg3;
		}
	}
}

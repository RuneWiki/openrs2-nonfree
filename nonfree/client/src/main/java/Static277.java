import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
	public static int anInt5771;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "Lclient!vo;")
	public static Class348 aClass348_62;

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "Lclient!vn;")
	public static final Class347 aClass347_7 = new Class347();

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
	public static int anInt5776 = 0;

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
	public static int anInt5777 = 0;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZIIIIII)I")
	public static int method4465(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(10) int local10 = arg0;
			arg0 = arg3;
			arg3 = local10;
		}
		@Pc(18) int local18 = arg1 & 0x3;
		if (local18 == 0) {
			return arg5;
		} else if (local18 == 1) {
			return 7 + 1 - arg4 - arg0;
		} else if (local18 == 2) {
			return 7 + 1 - arg5 - arg3;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIBIZII)V")
	public static void method4467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static455.aClass4_Sub35_Sub1_1.anInt9916 != 0 && arg1 != 0 && Static399.anInt7806 < 50 && arg2 != -1) {
			Static256.aClass185Array1[Static399.anInt7806++] = new Class185((byte) 2, arg2, arg1, arg3, arg4, arg0, arg5, null);
		}
	}
}

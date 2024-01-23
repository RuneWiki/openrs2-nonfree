import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!n;")
	public static Class4_Sub2_Sub4_Sub2 aClass4_Sub2_Sub4_Sub2_9;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
	public static int anInt5430 = -1;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString180 = "Loaded interfaces";

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	public static int anInt5435 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!cg;I)V")
	public static void method4323(@OriginalArg(0) Class22 arg0) {
		Static22.aClass22_11 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIII)I")
	public static int method4324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(13) int local13 = arg0;
			arg0 = arg1;
			arg1 = local13;
		}
		if (local3 == 0) {
			return arg3;
		} else if (local3 == 1) {
			return 7 + 1 - arg5 - arg0;
		} else if (local3 == 2) {
			return 7 + 1 - arg3 - arg1;
		} else {
			return arg5;
		}
	}
}

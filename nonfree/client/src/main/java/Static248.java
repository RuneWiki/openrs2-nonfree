import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
	public static int anInt4664;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_39 = new Class5(8);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIII)I")
	public static int method3801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(12) int local12 = arg5;
			arg5 = arg4;
			arg4 = local12;
		}
		if (local3 == 0) {
			return arg3;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 1 + 7 - arg5 - arg3;
		} else {
			return 7 + 1 - arg1 - arg4;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!bt;)Ljava/lang/String;")
	public static String method3803(@OriginalArg(1) Class3_Sub2 arg0) {
		return Static273.method4053(arg0);
	}
}

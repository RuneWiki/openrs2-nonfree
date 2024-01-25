import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static310 {

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	public static int anInt5521;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Lclient!lb;")
	public static Class221 aClass221_89;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "Lclient!cea;")
	public static Class47 aClass47_4;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
	public static int anInt5522 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
	public static int anInt5524 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!lb;)V")
	public static void method4681(@OriginalArg(1) Class221 arg0) {
		Static492.aClass221_129 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)I")
	public static int method4683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static6.aByteArrayArrayArray1[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static6.aByteArrayArrayArray1[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}

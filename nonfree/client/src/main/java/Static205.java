import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static205 {

	@OriginalMember(owner = "client!n", name = "j", descriptor = "I")
	public static int anInt4108;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Lclient!gh;")
	public static Class76 aClass76_6;

	@OriginalMember(owner = "client!n", name = "t", descriptor = "I")
	public static int anInt4115;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	public static int anInt4107 = 0;

	@OriginalMember(owner = "client!n", name = "q", descriptor = "Z")
	public static boolean aBoolean255 = false;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	public static int anInt4113 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)I")
	public static int method3782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static108.aByteArrayArrayArray5[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static108.aByteArrayArrayArray5[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(CB)Z")
	public static boolean method3783(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}

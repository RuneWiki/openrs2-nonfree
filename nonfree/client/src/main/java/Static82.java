import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static82 {

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "Lclient!za;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
	public static int anInt1523 = -1;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
	public static int anInt1525 = 0;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZI)I")
	public static int method1188(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BII)I")
	public static int method1189(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static450.anIntArray637[arg0 & 0x3] : Static286.anIntArray406[arg0 & 0x3];
	}
}

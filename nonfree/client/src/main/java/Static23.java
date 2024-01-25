import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static23 {

	@OriginalMember(owner = "client!at", name = "p", descriptor = "Lclient!re;")
	public static Class5 aClass5_3;

	@OriginalMember(owner = "client!at", name = "t", descriptor = "I")
	public static int anInt9183;

	@OriginalMember(owner = "client!at", name = "o", descriptor = "I")
	public static int anInt9179 = 0;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)Lclient!ao;")
	public static Class17 method7566(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static2.aFloat123 == 3.0D) {
				return Static22.aClass17_46;
			}
			if ((double) Static2.aFloat123 == 4.0D) {
				return Static443.aClass17_38;
			}
			if ((double) Static2.aFloat123 == 6.0D) {
				return Static88.aClass17_5;
			}
			if ((double) Static2.aFloat123 >= 8.0D) {
				return Static407.aClass17_35;
			}
		} else if (arg0 == 1) {
			if ((double) Static2.aFloat123 == 3.0D) {
				return Static88.aClass17_5;
			}
			if ((double) Static2.aFloat123 == 4.0D) {
				return Static407.aClass17_35;
			}
			if ((double) Static2.aFloat123 == 6.0D) {
				return Static168.aClass17_43;
			}
			if ((double) Static2.aFloat123 >= 8.0D) {
				return Static287.aClass17_27;
			}
		} else if (arg0 == 2) {
			if ((double) Static2.aFloat123 == 3.0D) {
				return Static168.aClass17_43;
			}
			if ((double) Static2.aFloat123 == 4.0D) {
				return Static287.aClass17_27;
			}
			if ((double) Static2.aFloat123 == 6.0D) {
				return Static20.aClass17_1;
			}
			if ((double) Static2.aFloat123 >= 8.0D) {
				return Static310.aClass17_44;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)I")
	public static int method7568(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}

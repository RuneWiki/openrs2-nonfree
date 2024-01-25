import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static319 {

	@OriginalMember(owner = "client!l", name = "z", descriptor = "Lclient!vv;")
	public static Class376 aClass376_5;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_83 = new Class100(11, 3);

	@OriginalMember(owner = "client!l", name = "B", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_104 = new Class44(92, -2);

	@OriginalMember(owner = "client!l", name = "E", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_105 = new Class44(106, 4);

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(III)Z")
	public static boolean method5060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static679.method9324(arg0, arg1) || Static385.method5715(arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lclient!gj;")
	public static Class124 method5061(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static498.aFloat216 == 3.0D) {
				return Static222.aClass124_6;
			}
			if ((double) Static498.aFloat216 == 4.0D) {
				return Static177.aClass124_4;
			}
			if ((double) Static498.aFloat216 == 6.0D) {
				return Static218.aClass124_5;
			}
			if ((double) Static498.aFloat216 >= 8.0D) {
				return Static104.aClass124_1;
			}
		} else if (arg0 == 1) {
			if ((double) Static498.aFloat216 == 3.0D) {
				return Static218.aClass124_5;
			}
			if ((double) Static498.aFloat216 == 4.0D) {
				return Static104.aClass124_1;
			}
			if ((double) Static498.aFloat216 == 6.0D) {
				return Static125.aClass124_3;
			}
			if ((double) Static498.aFloat216 >= 8.0D) {
				return Static115.aClass124_2;
			}
		} else if (arg0 == 2) {
			if ((double) Static498.aFloat216 == 3.0D) {
				return Static125.aClass124_3;
			}
			if ((double) Static498.aFloat216 == 4.0D) {
				return Static115.aClass124_2;
			}
			if ((double) Static498.aFloat216 == 6.0D) {
				return Static358.aClass124_7;
			}
			if ((double) Static498.aFloat216 >= 8.0D) {
				return Static625.aClass124_8;
			}
		}
		return null;
	}
}

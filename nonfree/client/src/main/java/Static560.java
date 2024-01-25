import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static560 {

	@OriginalMember(owner = "client!vm", name = "X", descriptor = "[Lclient!ej;")
	public static final Class3_Sub7_Sub6[] aClass3_Sub7_Sub6Array4 = new Class3_Sub7_Sub6[14];

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZC)Z")
	public static boolean method7563(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)Lclient!fg;")
	public static Class96 method7565(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static44.aFloat204 == 3.0D) {
				return Static26.aClass96_1;
			}
			if ((double) Static44.aFloat204 == 4.0D) {
				return Static584.aClass96_8;
			}
			if ((double) Static44.aFloat204 == 6.0D) {
				return Static449.aClass96_6;
			}
			if ((double) Static44.aFloat204 >= 8.0D) {
				return Static147.aClass96_2;
			}
		} else if (arg0 == 1) {
			if ((double) Static44.aFloat204 == 3.0D) {
				return Static449.aClass96_6;
			}
			if ((double) Static44.aFloat204 == 4.0D) {
				return Static147.aClass96_2;
			}
			if ((double) Static44.aFloat204 == 6.0D) {
				return Static319.aClass96_5;
			}
			if ((double) Static44.aFloat204 >= 8.0D) {
				return Static181.aClass96_3;
			}
		} else if (arg0 == 2) {
			if ((double) Static44.aFloat204 == 3.0D) {
				return Static319.aClass96_5;
			}
			if ((double) Static44.aFloat204 == 4.0D) {
				return Static181.aClass96_3;
			}
			if ((double) Static44.aFloat204 == 6.0D) {
				return Static510.aClass96_7;
			}
			if ((double) Static44.aFloat204 >= 8.0D) {
				return Static316.aClass96_4;
			}
		}
		return null;
	}
}

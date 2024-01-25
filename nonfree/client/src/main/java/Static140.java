import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!em", name = "f", descriptor = "I")
	public static int anInt2660 = -1;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "I")
	public static int anInt2665 = 100;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(CI)Z")
	public static boolean method2209(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(33) char[] local33 = Static571.aCharArray5;
			for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
				@Pc(41) char local41 = local33[local35];
				if (local41 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Z")
	public static boolean method2210(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)Lclient!gaa;")
	public static Class14_Sub3_Sub9 method2211() {
		@Pc(8) Class14_Sub3_Sub9 local8 = (Class14_Sub3_Sub9) Static196.aClass73_3.method1826();
		if (local8 != null) {
			local8.method9315();
			local8.method9253();
			return local8;
		}
		do {
			local8 = (Class14_Sub3_Sub9) Static23.aClass73_1.method1826();
			if (local8 == null) {
				return null;
			}
			if (local8.method2819() > Static521.method7499()) {
				return null;
			}
			local8.method9315();
			local8.method9253();
		} while ((Long.MIN_VALUE & local8.aLong302) == 0L);
		return local8;
	}
}

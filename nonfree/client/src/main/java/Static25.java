import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Lclient!ct;")
	public static Class2_Sub10_Sub2 method467() {
		@Pc(13) Class2_Sub10_Sub2 local13 = (Class2_Sub10_Sub2) Static238.aClass87_13.method2353();
		if (local13 != null) {
			local13.method5617();
			local13.method5572();
			return local13;
		}
		do {
			local13 = (Class2_Sub10_Sub2) Static189.aClass87_15.method2353();
			if (local13 == null) {
				return null;
			}
			if (local13.method866() > Static39.method699()) {
				return null;
			}
			local13.method5617();
			local13.method5572();
		} while ((local13.aLong206 & Long.MIN_VALUE) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)I")
	public static int method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}
}

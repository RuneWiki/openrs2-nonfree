import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "Lclient!tm;")
	public static Class3_Sub2_Sub4 aClass3_Sub2_Sub4_1;

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_1 = new Class198(4);

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "Ljava/lang/String;")
	public static final String aString2 = "wave:";

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
	public static int anInt29 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Lclient!lq;")
	public static Class5_Sub1 method11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class45 local7 = Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass5_Sub1_1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!rr;Lclient!rr;BZ)I")
	public static int method13(@OriginalArg(0) int arg0, @OriginalArg(1) Class58_Sub1 arg1, @OriginalArg(2) Class58_Sub1 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local9 = arg1.anInt5525;
			local12 = arg2.anInt5525;
			if (!arg3) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg0 == 2) {
			return Static344.method5614(arg2.method4642().aString231, Static344.anInt6698, arg1.method4642().aString231);
		} else if (arg0 == 3) {
			if (arg1.aString196.equals("-")) {
				if (arg2.aString196.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString196.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static344.method5614(arg2.aString196, Static344.anInt6698, arg1.aString196);
			}
		} else if (arg0 == 4) {
			if (arg1.method4634()) {
				return arg2.method4634() ? 0 : 1;
			} else if (arg2.method4634()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg1.method4633()) {
				return arg2.method4633() ? 0 : 1;
			} else if (arg2.method4633()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg1.method4636()) {
				return arg2.method4636() ? 0 : 1;
			} else if (arg2.method4636()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg1.method4635()) {
				return arg2.method4635() ? 0 : 1;
			} else if (arg2.method4635()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local9 = arg1.anInt5534;
			local12 = arg2.anInt5534;
			if (arg3) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg1.anInt5541 - arg2.anInt5541;
		}
	}
}

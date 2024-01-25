import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "I")
	public static int anInt86;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_2 = new Class160(125, 3);

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_3 = new Class160(101, 1);

	@OriginalMember(owner = "client!af", name = "b", descriptor = "[Lclient!gja;")
	public static final Class136[] aClass136Array1 = new Class136[8];

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZILclient!id;ILclient!id;)I")
	public static int method107(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class169_Sub1 arg2, @OriginalArg(4) Class169_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg1 == 1) {
			local11 = arg3.anInt4665;
			local14 = arg2.anInt4665;
			if (!arg0) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return Static480.method7251(arg2.method4088().aString31, Static26.anInt352, arg3.method4088().aString31);
		} else if (arg1 == 3) {
			if (arg3.aString56.equals("-")) {
				if (arg2.aString56.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString56.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static480.method7251(arg2.aString56, Static26.anInt352, arg3.aString56);
			}
		} else if (arg1 == 4) {
			if (arg3.method4079()) {
				return arg2.method4079() ? 0 : 1;
			} else if (arg2.method4079()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg3.method4082()) {
				return arg2.method4082() ? 0 : 1;
			} else if (arg2.method4082()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg3.method4084()) {
				return arg2.method4084() ? 0 : 1;
			} else if (arg2.method4084()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg3.method4083()) {
				return arg2.method4083() ? 0 : 1;
			} else if (arg2.method4083()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local11 = arg3.anInt4673;
			local14 = arg2.anInt4673;
			if (arg0) {
				if (local11 == 1000) {
					local11 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg3.anInt4675 - arg2.anInt4675;
		}
	}
}

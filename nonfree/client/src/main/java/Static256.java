import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ps", name = "x", descriptor = "Lclient!al;")
	public static final Class11 aClass11_110 = new Class11(4);

	@OriginalMember(owner = "client!ps", name = "D", descriptor = "[I")
	public static final int[] anIntArray443 = new int[5];

	@OriginalMember(owner = "client!ps", name = "G", descriptor = "I")
	public static int anInt4894 = 99;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZIBLclient!oh;Lclient!oh;)I")
	public static int method4407(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub1 arg2, @OriginalArg(4) Class6_Sub1 arg3) {
		@Pc(14) int local14;
		if (arg1 == 1) {
			@Pc(11) int local11 = arg3.anInt4508;
			local14 = arg2.anInt4508;
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
			return Static340.method5826(Static201.anInt4054, arg2.method4043().aString242, arg3.method4043().aString242);
		} else if (arg1 == 3) {
			if (arg3.aString167.equals("-")) {
				if (arg2.aString167.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString167.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static340.method5826(Static201.anInt4054, arg2.aString167, arg3.aString167);
			}
		} else if (arg1 == 4) {
			if (arg3.method4040()) {
				return arg2.method4040() ? 0 : 1;
			} else if (arg2.method4040()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg3.method4035()) {
				return arg2.method4035() ? 0 : 1;
			} else if (arg2.method4035()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg3.method4036()) {
				return arg2.method4036() ? 0 : 1;
			} else if (arg2.method4036()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg3.method4037()) {
				return arg2.method4037() ? 0 : 1;
			} else if (arg2.method4037()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local14 = arg3.anInt4517;
			@Pc(204) int local204 = arg2.anInt4517;
			if (arg0) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local204 == 1000) {
					local204 = -1;
				}
			} else {
				if (local204 == -1) {
					local204 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local14 - local204;
		} else {
			return arg3.anInt4518 - arg2.anInt4518;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V")
	public static void method4409() {
		@Pc(5) Class11 local5 = Static190.aClass11_84;
		synchronized (Static190.aClass11_84) {
			Static190.aClass11_84.method215(5);
		}
		local5 = Static328.aClass11_139;
		synchronized (Static328.aClass11_139) {
			Static328.aClass11_139.method215(5);
		}
		@Pc(38) Class139 local38 = Static92.aClass139_1;
		synchronized (Static92.aClass139_1) {
			Static92.aClass139_1.method3706();
		}
	}
}

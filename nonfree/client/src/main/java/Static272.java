import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "[[Lclient!ab;")
	public static Class3[][] aClass3ArrayArray1;

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
	public static int anInt5116;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_150 = new Class208(26, 4);

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "J")
	public static volatile long aLong157 = 0L;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public static void method4576() {
		Static291.method4805(false);
		if (Static314.anInt5740 >= 0 && Static314.anInt5740 != 0) {
			Static364.method5791(Static314.anInt5740);
			Static314.anInt5740 = -1;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLclient!pi;Lclient!pi;II)I")
	public static int method4578(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class35_Sub1 arg1, @OriginalArg(2) Class35_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg3 == 1) {
			local11 = arg1.anInt5022;
			local14 = arg2.anInt5022;
			if (!arg0) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg3 == 2) {
			return Static127.method2224(Static200.anInt4144, arg2.method4510().aString53, arg1.method4510().aString53);
		} else if (arg3 == 3) {
			if (arg1.aString47.equals("-")) {
				if (arg2.aString47.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString47.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static127.method2224(Static200.anInt4144, arg2.aString47, arg1.aString47);
			}
		} else if (arg3 == 4) {
			if (arg1.method4501()) {
				return arg2.method4501() ? 0 : 1;
			} else if (arg2.method4501()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg1.method4506()) {
				return arg2.method4506() ? 0 : 1;
			} else if (arg2.method4506()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg1.method4505()) {
				return arg2.method4505() ? 0 : 1;
			} else if (arg2.method4505()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg1.method4507()) {
				return arg2.method4507() ? 0 : 1;
			} else if (arg2.method4507()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local11 = arg1.anInt5027;
			local14 = arg2.anInt5027;
			if (arg0) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
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
			return arg1.anInt5032 - arg2.anInt5032;
		}
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
	public static void method4579() {
		Static113.aClass41_69.method825();
		Static46.aClass41_63.method825();
		Static384.aClass41_74.method825();
		Static246.aClass41_37.method825();
		Static113.aClass41_70.method825();
	}
}

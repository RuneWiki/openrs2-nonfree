import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "Lclient!go;")
	public static final Class97 aClass97_8 = new Class97(6, 0, 4, 2);

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_161 = new Class214(30, 2);

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
	public static int anInt4203 = 0;

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_25 = new Class254();

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
	public static int anInt4204 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!id;Lclient!id;ZII)I")
	public static int method3380(@OriginalArg(0) Class114_Sub1 arg0, @OriginalArg(1) Class114_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg3 == 1) {
			local9 = arg1.anInt2758;
			local12 = arg0.anInt2758;
			if (!arg2) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg3 == 2) {
			return Static306.method3997(Static188.anInt3028, arg0.method2297().aString8, arg1.method2297().aString8);
		} else if (arg3 == 3) {
			if (arg1.aString24.equals("-")) {
				if (arg0.aString24.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString24.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static306.method3997(Static188.anInt3028, arg0.aString24, arg1.aString24);
			}
		} else if (arg3 == 4) {
			if (arg1.method2291()) {
				return arg0.method2291() ? 0 : 1;
			} else if (arg0.method2291()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg1.method2292()) {
				return arg0.method2292() ? 0 : 1;
			} else if (arg0.method2292()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg1.method2295()) {
				return arg0.method2295() ? 0 : 1;
			} else if (arg0.method2295()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg1.method2293()) {
				return arg0.method2293() ? 0 : 1;
			} else if (arg0.method2293()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local9 = arg1.anInt2761;
			local12 = arg0.anInt2761;
			if (arg2) {
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
			return arg1.anInt2760 - arg0.anInt2760;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIII)I")
	public static int method3381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(12) int local12 = arg1;
			arg1 = arg2;
			arg2 = local12;
		}
		@Pc(25) int local25 = arg0 & 0x3;
		if (local25 == 0) {
			return arg5;
		} else if (local25 == 1) {
			return 7 + 1 - arg4 - arg1;
		} else if (local25 == 2) {
			return 1 + 7 - arg2 - arg5;
		} else {
			return arg4;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_55 = new Class296(79, 16);

	@OriginalMember(owner = "client!bv", name = "r", descriptor = "[I")
	public static final int[] anIntArray129 = new int[1];

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "F")
	public static float aFloat13 = 1024.0F;

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[8];

	@OriginalMember(owner = "client!bv", name = "u", descriptor = "Lclient!nc;")
	public static final Class201 aClass201_2 = new Class201(16);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!taa;Lclient!taa;IIZ)I")
	public static int method964(@OriginalArg(0) Class185_Sub1 arg0, @OriginalArg(1) Class185_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg2 == 1) {
			local11 = arg0.anInt7763;
			local14 = arg1.anInt7763;
			if (!arg3) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg2 == 2) {
			return Static343.method5197(arg1.method6470().aString46, Static179.anInt3168, arg0.method6470().aString46);
		} else if (arg2 == 3) {
			if (arg0.aString71.equals("-")) {
				if (arg1.aString71.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString71.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static343.method5197(arg1.aString71, Static179.anInt3168, arg0.aString71);
			}
		} else if (arg2 == 4) {
			if (arg0.method6467()) {
				return arg1.method6467() ? 0 : 1;
			} else if (arg1.method6467()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg0.method6463()) {
				return arg1.method6463() ? 0 : 1;
			} else if (arg1.method6463()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg0.method6466()) {
				return arg1.method6466() ? 0 : 1;
			} else if (arg1.method6466()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg0.method6468()) {
				return arg1.method6468() ? 0 : 1;
			} else if (arg1.method6468()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local11 = arg0.anInt7771;
			local14 = arg1.anInt7771;
			if (arg3) {
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
			return arg0.anInt7769 - arg1.anInt7769;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIII)V")
	public static void method969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg3) {
			Static276.method7421(arg2, arg0, arg1, arg4);
		} else if (Static358.anInt8908 <= arg4 - arg0 && Static216.anInt4203 >= arg0 + arg4 && arg1 - arg3 >= Static99.anInt1988 && arg1 + arg3 <= Static205.anInt4042) {
			Static389.method5893(arg2, arg0, arg3, arg4, arg1);
		} else {
			Static389.method5887(arg3, arg0, arg1, arg2, arg4);
		}
	}
}

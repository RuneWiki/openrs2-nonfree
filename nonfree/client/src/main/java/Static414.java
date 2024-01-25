import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!va", name = "f", descriptor = "I")
	public static int anInt7039;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "I")
	public static int anInt7038 = 0;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_141 = new Class92(18, 8);

	@OriginalMember(owner = "client!va", name = "l", descriptor = "[I")
	public static final int[] anIntArray487 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)Lclient!gm;")
	public static Class91 method5818() {
		try {
			return (Class91) Class.forName("Class91_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(20) Throwable local20) {
			return null;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[B)Lclient!vg;")
	public static Class6_Sub2_Sub17 method5821(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class6_Sub2_Sub17 local9 = new Class6_Sub2_Sub17();
		@Pc(14) Class6_Sub1 local14 = new Class6_Sub1(arg0);
		local14.anInt7898 = local14.aByteArray96.length - 2;
		@Pc(25) int local25 = local14.method6485();
		@Pc(36) int local36 = local14.aByteArray96.length - local25 - 12 - 2;
		local14.anInt7898 = local36;
		@Pc(43) int local43 = local14.method6442();
		local9.anInt7491 = local14.method6485();
		local9.anInt7493 = local14.method6485();
		local9.anInt7492 = local14.method6485();
		local9.anInt7490 = local14.method6485();
		@Pc(67) int local67 = local14.method6433();
		@Pc(78) int local78;
		@Pc(84) int local84;
		if (local67 > 0) {
			local9.aClass74Array1 = new Class74[local67];
			for (local78 = 0; local78 < local67; local78++) {
				local84 = local14.method6485();
				@Pc(91) Class74 local91 = new Class74(Static52.method1203(local84));
				local9.aClass74Array1[local78] = local91;
				while (local84-- > 0) {
					@Pc(102) int local102 = local14.method6442();
					@Pc(106) int local106 = local14.method6442();
					local91.method1890((long) local102, new Class6_Sub39(local106));
				}
			}
		}
		local14.anInt7898 = 0;
		local9.aString68 = local14.method6450();
		local9.aStringArray47 = new String[local43];
		local9.anIntArray514 = new int[local43];
		local9.anIntArray513 = new int[local43];
		local78 = 0;
		while (local36 > local14.anInt7898) {
			local84 = local14.method6485();
			if (local84 == 3) {
				local9.aStringArray47[local78] = local14.method6473().intern();
			} else if (local84 >= 100 || local84 == 21 || local84 == 38 || local84 == 39) {
				local9.anIntArray513[local78] = local14.method6433();
			} else {
				local9.anIntArray513[local78] = local14.method6442();
			}
			local9.anIntArray514[local78++] = local84;
		}
		return local9;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BIZIIII)V")
	public static void method5832(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static430.anInt7677 = arg5;
		Static90.anInt2074 = arg3;
		Static294.anInt5207 = arg2;
		Static315.anInt5489 = arg0;
		Static84.anInt2036 = arg4;
		if (arg1 && Static90.anInt2074 >= 100) {
			Static229.anInt4187 = Static315.anInt5489 * 128 + 64;
			Static157.anInt3220 = Static294.anInt5207 * 128 + 64;
			Static367.anInt6653 = Static221.method3331(Static388.anInt6870, Static229.anInt4187, Static157.anInt3220) - Static84.anInt2036;
		}
		Static429.anInt7656 = 2;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIBIII)V")
	public static void method5833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(5) Class17[] local5 = Static122.aClass17Array1;
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(12) Class17 local12 = local5[local7];
			if (local12 != null && local12.anInt532 == 2) {
				Static100.method1821(local12.anInt533, arg1 >> 1, arg3 >> 1, local12.anInt538, local12.anInt540 * 2, local12.anInt535);
				if (Static247.anIntArray317[0] > -1 && Static66.anInt1741 % 20 < 10) {
					Static227.aClass87Array13[local12.anInt537].method6567(Static247.anIntArray317[0] + arg2 - 12, arg0 + Static247.anIntArray317[1] + -28);
				}
			}
		}
	}
}

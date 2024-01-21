import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!pf;")
	public static Class68 aClass68_3;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_4;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Lclient!tg;")
	public static Class81 aClass81_991 = Static120.method2057(")3");

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!tg;")
	private static Class81 aClass81_992 = Static120.method2057("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!tg;")
	private static Class81 aClass81_993 = Static120.method2057("Connecting to update server");

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Lclient!tg;")
	public static Class81 aClass81_994 = Static120.method2057("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	public static int anInt2756 = 0;

	@OriginalMember(owner = "client!p", name = "h", descriptor = "I")
	public static int anInt2757 = 0;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!tg;")
	public static Class81 aClass81_995 = aClass81_993;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!tg;")
	public static Class81 aClass81_996 = aClass81_992;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static19.anIntArrayArrayArray1[arg0][local16][local20] == -Static90.anInt1989) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static116.anIntArrayArrayArray4[arg0][arg1][arg3] + arg5;
			if (!Static112.method1963(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static112.method1963(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static112.method1963(local20, local156, local182)) {
				return false;
			} else if (Static112.method1963(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static112.method1974(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static112.method1963(local16 + 1, Static116.anIntArrayArrayArray4[arg0][arg1][arg3] + arg5, local20 + 1) && Static112.method1963(local16 + 128 - 1, Static116.anIntArrayArrayArray4[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static112.method1963(local16 + 128 - 1, Static116.anIntArrayArrayArray4[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static112.method1963(local16 + 1, Static116.anIntArrayArrayArray4[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([BZZ)Ljava/lang/Object;")
	public static Object method2158(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static10.aBoolean7) {
			try {
				@Pc(25) Class69 local25 = (Class69) Class.forName("Class69_Sub1").getDeclaredConstructor().newInstance();
				local25.method2240(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static10.aBoolean7 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Z")
	public static boolean method2159(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method2160() {
		aClass68_3 = null;
		aClass81_992 = null;
		aClass81_993 = null;
		aClass81_991 = null;
		aClass81_994 = null;
		aClass1_Sub2_Sub2_Sub4_4 = null;
		aClass81_996 = null;
		aClass81_995 = null;
	}
}

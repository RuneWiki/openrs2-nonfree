import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_25 = new Class16();

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "[S")
	public static short[] aShortArray51 = new short[256];

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2277(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local19 > local16 && Static284.method4732(arg0.charAt(local16))) {
			local16++;
		}
		while (local19 > local16 && Static284.method4732(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(50) int local50 = local19 - local16;
		if (local50 < 1 || local50 > 12) {
			return null;
		}
		@Pc(65) StringBuffer local65 = new StringBuffer(local50);
		for (@Pc(67) int local67 = local16; local67 < local19; local67++) {
			@Pc(73) char local73 = arg0.charAt(local67);
			if (Static250.method4392(local73)) {
				@Pc(81) char local81 = Static274.method4648(local73);
				if (local81 != '\u0000') {
					local65.append(local81);
				}
			}
		}
		if (local65.length() == 0) {
			return null;
		} else {
			return local65.toString();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
	public static void method2278() {
		Static64.method942();
		Static325.method1031();
		Static219.method3925();
		Static173.method2818();
		Static216.method4855();
		Static190.method3475();
		Static85.method1233();
		Static144.method2187();
		Static35.method513();
		method2280();
		Static245.method5578();
		Static117.method1778();
		Static64.method940();
		Static25.method5359();
		Static186.method3218();
		Static267.method4626();
		Static16.method218();
		Static224.method5304();
		Static294.method4880();
		Static43.method656();
		Static75.method1147();
		Static91.method1487();
		Static91.method1488();
		Static108.aClass26_17.method329(5);
		Static156.aClass26_26.method329(5);
		Static100.aClass26_15.method329(5);
		Static131.aClass26_20.method329(5);
		Static93.aClass26_12.method329(5);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ai;IZLjava/lang/String;)V")
	public static void method2279(@OriginalArg(0) Class9 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(24) int local24 = Static332.aClass114_8.method2476(null, 250, arg2);
		@Pc(33) int local33 = Static332.aClass114_8.method2474(250, null, arg2) * 13;
		Static107.aClass129_4.method4945(6, 6, local24 + 4 + 4, local33 + 8, -16777216, 0);
		Static107.aClass129_4.method5015(6, 6, local24 + 4 + 4, local33 + 4 + 4, -1, 0);
		arg0.method3574(-1, 0, local24, -1, 1, 10, arg2, local33, 1, 0, 0, null, 10, null, null);
		Static168.method2724(local33 + 4 + 4, 6, 6, local24 + 4 + 4);
		if (arg1) {
			Static107.aClass129_4.method5009();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	private static void method2280() {
		@Pc(5) Class26 local5 = Static91.aClass26_16;
		synchronized (Static91.aClass26_16) {
			Static91.aClass26_16.method329(5);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ep;Lclient!ms;IBILclient!k;Ljava/lang/String;ILclient!ai;III)V")
	public static void method2281(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class114 arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class9 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(17) int local17;
		if (Static81.anInt1498 == 4) {
			local17 = (int) Static246.aFloat51 & 0x3FFF;
		} else {
			local17 = Static303.anInt4931 + (int) Static246.aFloat51 & 0x3FFF;
		}
		@Pc(36) int local36 = Math.max(arg1.anInt4060 / 2, arg1.anInt4110 / 2) + 10;
		@Pc(44) int local44 = arg6 * arg6 + arg3 * arg3;
		if (local36 * local36 < local44) {
			return;
		}
		@Pc(58) int local58 = Class140.anIntArray330[local17];
		@Pc(62) int local62 = Class140.anIntArray329[local17];
		if (Static81.anInt1498 != 4) {
			local58 = local58 * 256 / (Static231.anInt5050 + 256);
			local62 = local62 * 256 / (Static231.anInt5050 + 256);
		}
		@Pc(91) int local91 = arg3 * local62 + local58 * arg6 >> 15;
		@Pc(102) int local102 = arg6 * local62 - arg3 * local58 >> 15;
		@Pc(109) int local109 = arg4.method2476(null, 100, arg5);
		@Pc(115) int local115 = local91 - local109 / 2;
		@Pc(123) int local123 = arg4.method2477(arg5, null);
		if (-arg1.anInt4060 <= local115 && local115 <= arg1.anInt4060 && local102 >= -arg1.anInt4110 && local102 <= arg1.anInt4110) {
			arg7.method3574(0, arg2, local109, arg9, 0, arg1.anInt4110 / 2 + arg2 - local123 - local102 - arg10, arg5, 50, 1, 0, arg8, null, local115 + arg8 + arg1.anInt4060 / 2, arg0, null);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method2282(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static173.anInt3430 > 0) {
			local18 = Static294.aByteArrayArray43[--Static173.anInt3430];
			Static294.aByteArrayArray43[Static173.anInt3430] = null;
			return local18;
		} else if (arg0 == 5000 && Static168.anInt3339 > 0) {
			local18 = Static197.aByteArrayArray30[--Static168.anInt3339];
			Static197.aByteArrayArray30[Static168.anInt3339] = null;
			return local18;
		} else if (arg0 == 30000 && Static354.anInt6719 > 0) {
			@Pc(67) byte[] local67 = Static70.aByteArrayArray10[--Static354.anInt6719];
			Static70.aByteArrayArray10[Static354.anInt6719] = null;
			return local67;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Z")
	public static boolean method2284() {
		return Static13.anInt245 > 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Lclient!qn;")
	public static Class211 aClass211_33;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	public static int anInt2196;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_39 = new Class146(75, -1);

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Lclient!ub;")
	public static final Class244 aClass244_10 = new Class244();

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public static void method1758() {
		@Pc(7) Class70 local7 = null;
		try {
			@Pc(13) Class45 local13 = Static24.aClass196_1.method3908("2", true);
			while (local13.anInt1129 == 0) {
				Static435.method5777(1L);
			}
			if (local13.anInt1129 == 1) {
				local7 = (Class70) local13.anObject5;
				@Pc(41) Class4_Sub9 local41 = new Class4_Sub9(Static275.anInt4595 * 6 + 3);
				local41.method4999(1);
				local41.method5029(Static275.anInt4595);
				for (@Pc(51) int local51 = 0; local51 < Static83.anIntArray416.length; local51++) {
					if (Static269.aBooleanArray22[local51]) {
						local41.method5029(local51);
						local41.method5047(Static83.anIntArray416[local51]);
					}
				}
				local7.method1441(local41.aByteArray81, local41.anInt6207, 0);
			}
		} catch (@Pc(82) Exception local82) {
		}
		try {
			if (local7 != null) {
				local7.method1443();
			}
		} catch (@Pc(89) Exception local89) {
		}
		Static398.aLong191 = Static266.method3498();
		Static247.aBoolean303 = false;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(JIIZZ)Ljava/lang/String;")
	public static String method1759(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg0 < 0L) {
			local25 = true;
			arg0 = -arg0;
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(26);
		@Pc(48) int local48;
		@Pc(53) int local53;
		if (arg2 > 0) {
			for (local48 = 0; local48 < arg2; local48++) {
				local53 = (int) arg0;
				arg0 /= 10L;
				local41.append((char) (local53 + 48 - (int) arg0 * 10));
			}
			local41.append(local7);
		}
		local48 = 0;
		while (true) {
			local53 = (int) arg0;
			arg0 /= 10L;
			local41.append((char) (local53 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local25) {
					local41.append('-');
				}
				return local41.reverse().toString();
			}
			if (arg3) {
				local48++;
				if (local48 % 3 == 0) {
					local41.append(local9);
				}
			}
		}
	}
}

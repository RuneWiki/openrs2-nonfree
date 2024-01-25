import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!es", name = "G", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!es", name = "ab", descriptor = "Lclient!t;")
	public static Class189 aClass189_2;

	@OriginalMember(owner = "client!es", name = "eb", descriptor = "I")
	public static int anInt2124;

	@OriginalMember(owner = "client!es", name = "ib", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!es", name = "f", descriptor = "I")
	public static int anInt2116 = 0;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Lclient!ak;")
	public static Class4_Sub3 method1991() {
		if (Static54.aClass116_40 == null || Static128.aClass37_1 == null) {
			return null;
		}
		for (@Pc(23) Class4_Sub3 local23 = (Class4_Sub3) Static128.aClass37_1.method1018(); local23 != null; local23 = (Class4_Sub3) Static128.aClass37_1.method1018()) {
			@Pc(32) Class136 local32 = Static11.method223(local23.anInt210);
			if (local32 != null && local32.aBoolean328 && local32.method3851()) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IC)Z")
	public static boolean method1992(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
	public static void method1994(@OriginalArg(1) int arg0) {
		Static30.anInt719 = arg0;
		@Pc(7) Class198 local7 = Static349.aClass198_243;
		synchronized (Static349.aClass198_243) {
			Static349.aClass198_243.method5213();
		}
		local7 = Static325.aClass198_228;
		synchronized (Static325.aClass198_228) {
			Static325.aClass198_228.method5213();
		}
		local7 = Static265.aClass198_192;
		synchronized (Static265.aClass198_192) {
			Static265.aClass198_192.method5213();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(JZIIZ)Ljava/lang/String;")
	public static String method1996(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg3 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(24) boolean local24 = false;
		if (arg0 < 0L) {
			arg0 = -arg0;
			local24 = true;
		}
		@Pc(40) StringBuffer local40 = new StringBuffer(26);
		@Pc(47) int local47;
		@Pc(52) int local52;
		if (arg2 > 0) {
			for (local47 = 0; local47 < arg2; local47++) {
				local52 = (int) arg0;
				arg0 /= 10L;
				local40.append((char) (local52 + 48 - (int) arg0 * 10));
			}
			local40.append(local7);
		}
		local47 = 0;
		while (true) {
			local52 = (int) arg0;
			arg0 /= 10L;
			local40.append((char) (local52 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local24) {
					local40.append('-');
				}
				return local40.reverse().toString();
			}
			if (arg1) {
				local47++;
				if (local47 % 3 == 0) {
					local40.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BLclient!lf;)Lclient!vg;")
	public static Class26_Sub4 method1998(@OriginalArg(1) Class4_Sub11 arg0) {
		return new Class26_Sub4(arg0.method3447(), arg0.method3447(), arg0.method3447(), arg0.method3447(), arg0.method3442(), arg0.method3442(), arg0.method3440());
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
	public static int anInt738;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Lclient!pk;")
	public static Class132 aClass132_11;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Lclient!wk;")
	public static Class43_Sub2 aClass43_Sub2_2 = null;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString31 = "";

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "S")
	public static short aShort3 = 320;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
	public static int anInt746 = 0;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BIIIIII)I")
	public static int method509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(12) int local12 = arg0;
			arg0 = arg4;
			arg4 = local12;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg5;
		} else if (local3 == 2) {
			return 7 + 1 - arg1 - arg0;
		} else {
			return 1 + 7 - arg4 - arg5;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBI)V")
	public static void method510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class8_Sub1_Sub6 local16 = Static181.method2779(6, arg0);
		local16.method931();
		local16.anInt1284 = arg1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method511() {
		Static156.aClass61_26.method1378();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(CI)Z")
	public static boolean method512(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method513(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local7 *= 37L;
			@Pc(28) char local28 = arg0.charAt(local17);
			if (local28 >= 'A' && local28 <= 'Z') {
				local7 += local28 + 1 - 65;
			} else if (local28 >= 'a' && local28 <= 'z') {
				local7 += local28 + 1 - 97;
			} else if (local28 >= '0' && local28 <= '9') {
				local7 += local28 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)I")
	public static int method514(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class8_Sub23 local12 = (Class8_Sub23) Static188.aClass129_20.method3043((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < local12.anIntArray268.length; local26++) {
				if (arg1 == local12.anIntArray270[local26]) {
					local24 += local12.anIntArray268[local26];
				}
			}
			return local24;
		}
	}
}

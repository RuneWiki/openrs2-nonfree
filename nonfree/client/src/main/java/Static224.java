import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!qg", name = "M", descriptor = "B")
	public static byte aByte16;

	@OriginalMember(owner = "client!qg", name = "R", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)V")
	public static void method3523(@OriginalArg(0) int arg0) {
		@Pc(19) Class4_Sub2_Sub15 local19 = Static131.method1210(arg0, 11);
		local19.method2875();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BIIJZ)Ljava/lang/String;")
	public static String method3524(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(9) char local9 = ',';
		@Pc(11) char local11 = '.';
		if (arg1 == 0) {
			local9 = '.';
			local11 = ',';
		}
		@Pc(22) boolean local22 = false;
		if (arg1 == 2) {
			local11 = ' ';
		}
		if (arg2 < 0L) {
			arg2 = -arg2;
			local22 = true;
		}
		@Pc(49) StringBuffer local49 = new StringBuffer(26);
		@Pc(56) int local56;
		@Pc(66) int local66;
		if (arg0 > 0) {
			for (local56 = 0; local56 < arg0; local56++) {
				local66 = (int) arg2;
				arg2 /= 10L;
				local49.append((char) (local66 + 48 - (int) arg2 * 10));
			}
			local49.append(local9);
		}
		local56 = 0;
		while (true) {
			local66 = (int) arg2;
			arg2 /= 10L;
			local49.append((char) (local66 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local22) {
					local49.append('-');
				}
				return local49.reverse().toString();
			}
			if (arg3) {
				local56++;
				if (local56 % 3 == 0) {
					local49.append(local11);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IJZ)V")
	public static void method3525(@OriginalArg(1) long arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0L) {
			return;
		}
		if (Static15.anInt334 >= 100) {
			Static173.method2811(0, Static156.aString111, "");
			return;
		}
		@Pc(23) String local23 = Static94.method1558(arg0);
		@Pc(25) int local25;
		for (local25 = 0; local25 < Static15.anInt334; local25++) {
			if (Static229.aLongArray8[local25] == arg0) {
				Static173.method2811(0, local23 + Static276.aString182, "");
				return;
			}
		}
		for (local25 = 0; local25 < Static149.anInt2911; local25++) {
			if (arg0 == Static262.aLongArray9[local25]) {
				Static173.method2811(0, Static23.aString22 + local23 + Static111.aString82, "");
				return;
			}
		}
		if (local23.equals(Static72.aClass13_Sub5_Sub1_1.aString148)) {
			Static173.method2811(0, Static65.aString190, "");
			return;
		}
		Static229.aLongArray8[Static15.anInt334] = arg0;
		aStringArray29[Static15.anInt334] = Static155.method2537(arg0);
		Static151.aBooleanArray23[Static15.anInt334++] = arg1;
		Static279.anInt5479 = Static131.anInt1441;
		Static175.aClass4_Sub24_Sub1_1.method3123(138);
		Static175.aClass4_Sub24_Sub1_1.method3079(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)V")
	public static void method3526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class75 local3 = new Class75();
		local3.anInt2350 = arg1 / 128;
		local3.anInt2335 = arg2 / 128;
		local3.anInt2337 = arg3 / 128;
		local3.anInt2329 = arg4 / 128;
		local3.anInt2340 = arg0;
		local3.anInt2336 = arg1;
		local3.anInt2352 = arg2;
		local3.anInt2346 = arg3;
		local3.anInt2339 = arg4;
		local3.anInt2347 = arg5;
		local3.anInt2345 = arg6;
		Static309.aClass75Array2[Static287.anInt5606++] = local3;
	}
}

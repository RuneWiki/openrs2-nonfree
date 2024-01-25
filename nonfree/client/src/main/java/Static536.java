import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
	public static int anInt9797;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_139 = new Class90(10, 6);

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "Lclient!kga;")
	public static final Class178 aClass178_4 = new Class178("WIP", 2);

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
	public static int anInt9796 = 2;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII[B)Z")
	public static boolean method7528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class4_Sub13 local12 = new Class4_Sub13(arg4);
		@Pc(14) int local14 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local12.method7022();
			if (local23 == 0) {
				return local7;
			}
			local14 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(69) int local69;
				@Pc(105) Class233 local105;
				do {
					@Pc(74) int local74;
					@Pc(79) int local79;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local12.method7019();
										if (local42 == 0) {
											continue label70;
										}
										local12.method7004();
									}
									local42 = local12.method7019();
									if (local42 == 0) {
										continue label70;
									}
									local34 += local42 - 1;
									@Pc(57) int local57 = local34 & 0x3F;
									@Pc(63) int local63 = local34 >> 6 & 0x3F;
									local69 = local12.method7004() >> 2;
									local74 = local63 + arg0;
									local79 = local57 + arg2;
								} while (local74 <= 0);
							} while (local79 <= 0);
						} while (arg3 - 1 <= local74);
					} while (arg1 - 1 <= local79);
					local105 = Static103.aClass298_1.method6822(local14);
				} while (local69 == 22 && !Static455.aClass4_Sub35_Sub1_1.aBoolean667 && local105.anInt6681 == 0 && local105.anInt6692 != 1 && !local105.aBoolean456);
				if (!local105.method5285()) {
					local7 = false;
					Static106.anInt2491++;
				}
				local36 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIC)C")
	public static char method7529(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
	public static void method7530() {
		if (Static154.aClass7_9 != null) {
			Static154.aClass7_9.method7792();
			Static154.aClass7_9 = null;
			Static411.aClass45_7 = null;
		}
	}
}

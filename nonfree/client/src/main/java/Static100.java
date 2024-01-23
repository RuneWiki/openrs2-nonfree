import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "Lclient!ej;")
	public static Class31 aClass31_4;

	@OriginalMember(owner = "client!ke", name = "E", descriptor = "Lclient!i;")
	private static Class41 aClass41_720 = Static184.method2923("Unable to find ");

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
	public static int anInt2439 = -1;

	@OriginalMember(owner = "client!ke", name = "I", descriptor = "[I")
	public static int[] anIntArray245 = new int[128];

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "Lclient!i;")
	private static Class41 aClass41_721 = Static184.method2923("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
	public static int anInt2441 = 0;

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "Lclient!i;")
	public static Class41 aClass41_722 = aClass41_720;

	@OriginalMember(owner = "client!ke", name = "O", descriptor = "Lclient!i;")
	public static Class41 aClass41_723 = aClass41_721;

	@OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
	public static volatile int anInt2446 = 0;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
	public static void method1723() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IJ)V")
	public static void method1724(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < Static131.anInt2996; local20++) {
			if (Static101.aLongArray7[local20] == arg0) {
				Static131.anInt2996--;
				for (@Pc(38) int local38 = local20; local38 < Static131.anInt2996; local38++) {
					Static21.aClass41Array71[local38] = Static21.aClass41Array71[local38 + 1];
					Static145.anIntArray341[local38] = Static145.anIntArray341[local38 + 1];
					Static151.aClass41Array51[local38] = Static151.aClass41Array51[local38 + 1];
					Static101.aLongArray7[local38] = Static101.aLongArray7[local38 + 1];
					Static42.anIntArray11[local38] = Static42.anIntArray11[local38 + 1];
					Static54.aBooleanArray5[local38] = Static54.aBooleanArray5[local38 + 1];
				}
				Static18.anInt491 = Static60.anInt4782;
				Static131.aClass2_Sub3_Sub1_2.method221(121);
				Static131.aClass2_Sub3_Sub1_2.method190(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
	public static void method1726() {
		try {
			if (Static114.aClass3_1 == null) {
				Static114.aClass3_1 = new Class3(Static111.aClass83_2, Static149.method2324(new Class41[] { Static186.aClass41_1129, Static152.method2471(Static111.anInt2675), Static45.aClass41_388 }).method1395());
			} else {
				@Pc(7) byte[] local7 = Static114.aClass3_1.method53();
				if (local7 != null) {
					@Pc(14) Class2_Sub3 local14 = new Class2_Sub3(local7);
					Static91.anInt2267 = local14.method163();
					Static178.aClass37Array1 = new Class37[Static91.anInt2267];
					for (@Pc(23) int local23 = 0; local23 < Static91.anInt2267; local23++) {
						@Pc(33) Class37 local33 = Static178.aClass37Array1[local23] = new Class37();
						@Pc(37) int local37 = local14.method163();
						local33.anInt1671 = local37 & 0x7FFF;
						local33.aBoolean91 = (local37 & 0x8000) != 0;
						local33.aClass41_482 = local14.method160();
						local33.anInt1667 = local14.method196();
						local33.anInt1669 = local23;
						local33.anInt1670 = Static69.method1266(local14.method163());
					}
					Static150.method2346(0, Static178.aClass37Array1, Static178.aClass37Array1.length - 1);
					Static185.aBoolean264 = true;
					Static114.aClass3_1 = null;
				}
			}
		} catch (@Pc(129) Exception local129) {
			local129.printStackTrace();
			Static114.aClass3_1 = null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIZIII)V")
	public static void method1728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 1 || arg2 < 1 || arg6 > 102 || arg2 > 102) {
			return;
		}
		@Pc(37) int local37;
		if (Static217.aBoolean290 && (Static102.aByteArrayArrayArray7[0][arg6][arg2] & 0x2) == 0) {
			local37 = arg0;
			if ((Static102.aByteArrayArrayArray7[arg0][arg6][arg2] & 0x8) != 0) {
				local37 = 0;
			}
			if (Static142.anInt3258 != local37) {
				return;
			}
		}
		local37 = arg0;
		if (arg0 < 3 && (Static102.aByteArrayArrayArray7[1][arg6][arg2] & 0x2) == 2) {
			local37 = arg0 + 1;
		}
		Static133.method2111(Static149.aClass42Array1[arg0], arg6, local37, arg1, arg0, arg2);
		if (arg4 >= 0) {
			Static198.method3079(false, arg0, arg5, arg3, false, arg4, local37, Static149.aClass42Array1[arg0], arg2, arg6);
			return;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)Z")
	public static boolean method1729(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}

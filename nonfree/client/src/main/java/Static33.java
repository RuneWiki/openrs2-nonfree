import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	public static int anInt850 = 0;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!sc;")
	private static Class66 aClass66_498 = Static106.method1849("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!sc;")
	public static Class66 aClass66_494 = aClass66_498;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!sc;")
	public static Class66 aClass66_495 = Static106.method1849("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "Lclient!sc;")
	private static Class66 aClass66_499 = Static106.method1849("red:");

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Lclient!sc;")
	public static Class66 aClass66_496 = aClass66_499;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!sc;")
	public static Class66 aClass66_497 = Static106.method1849("(U1");

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "[I")
	public static int[] anIntArray114 = new int[500];

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
	public static int anInt854 = 0;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "Lclient!sc;")
	public static Class66 aClass66_500 = aClass66_499;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZIIZLclient!sf;I)V")
	public static void method627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class5 arg2, @OriginalArg(6) int arg3) {
		Static39.anInt988 = arg3;
		Static15.aClass5_93 = arg2;
		Static20.anInt622 = 1;
		Static23.anInt684 = arg0;
		Static103.anInt2540 = arg1;
		Static16.anInt490 = 2;
		Static3.aBoolean3 = false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public static void method628() {
		anIntArray114 = null;
		aClass66_497 = null;
		aClass66_500 = null;
		aClass66_499 = null;
		aClass66_494 = null;
		aClass66_496 = null;
		aClass66_498 = null;
		aClass66_495 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method629() {
		Static20.aClass61_5 = new Class61();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([IIII[I[Lclient!ad;)V")
	public static void method630(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class4[] arg4) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(16) int local16 = arg2 + 1;
		@Pc(23) int local23 = (arg1 + arg2) / 2;
		@Pc(27) Class4 local27 = arg4[local23];
		@Pc(31) int local31 = arg1 - 1;
		arg4[local23] = arg4[arg1];
		arg4[arg1] = local27;
		while (local16 > local31) {
			@Pc(45) boolean local45 = true;
			@Pc(48) int local48;
			@Pc(67) int local67;
			@Pc(70) int local70;
			do {
				local16--;
				for (local48 = 0; local48 < 4; local48++) {
					if (arg0[local48] == 2) {
						local67 = arg4[local16].anInt110;
						local70 = local27.anInt110;
					} else if (arg0[local48] == 1) {
						local67 = arg4[local16].anInt119;
						local70 = local27.anInt119;
						if (local67 == -1 && arg3[local48] == 1) {
							local67 = 2001;
						}
						if (local70 == -1 && arg3[local48] == 1) {
							local70 = 2001;
						}
					} else if (arg0[local48] == 3) {
						local70 = local27.aBoolean4 ? 1 : 0;
						local67 = arg4[local16].aBoolean4 ? 1 : 0;
					} else {
						local67 = arg4[local16].anInt116;
						local70 = local27.anInt116;
					}
					if (local70 != local67) {
						if ((arg3[local48] != 1 || local67 <= local70) && (arg3[local48] != 0 || local70 <= local67)) {
							local45 = false;
						}
						break;
					}
					if (local48 == 3) {
						local45 = false;
					}
				}
			} while (local45);
			local45 = true;
			do {
				local31++;
				for (local48 = 0; local48 < 4; local48++) {
					if (arg0[local48] == 2) {
						local70 = local27.anInt110;
						local67 = arg4[local31].anInt110;
					} else if (arg0[local48] == 1) {
						local67 = arg4[local31].anInt119;
						local70 = local27.anInt119;
						if (local70 == -1 && arg3[local48] == 1) {
							local70 = 2001;
						}
						if (local67 == -1 && arg3[local48] == 1) {
							local67 = 2001;
						}
					} else if (arg0[local48] == 3) {
						local70 = local27.aBoolean4 ? 1 : 0;
						local67 = arg4[local31].aBoolean4 ? 1 : 0;
					} else {
						local67 = arg4[local31].anInt116;
						local70 = local27.anInt116;
					}
					if (local70 != local67) {
						if ((arg3[local48] != 1 || local67 >= local70) && (arg3[local48] != 0 || local70 >= local67)) {
							local45 = false;
						}
						break;
					}
					if (local48 == 3) {
						local45 = false;
					}
				}
			} while (local45);
			if (local31 < local16) {
				@Pc(336) Class4 local336 = arg4[local31];
				arg4[local31] = arg4[local16];
				arg4[local16] = local336;
			}
		}
		method630(arg0, arg1, local16, arg3, arg4);
		method630(arg0, local16 + 1, arg2, arg3, arg4);
	}
}

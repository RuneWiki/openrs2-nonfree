import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "Lclient!af;")
	public static Class7 aClass7_2;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	public static int anInt980;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Lclient!jb;")
	public static Class25 aClass25_5;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Lclient!ha;")
	public static Class25_Sub1 aClass25_Sub1_4;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "[I")
	public static int[] anIntArray124;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "[I")
	public static int[] anIntArray122 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "Lclient!qf;")
	private static Class60 aClass60_377 = Static59.method1195("Password: ");

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Lclient!qf;")
	public static Class60 aClass60_375 = aClass60_377;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "[I")
	public static int[] anIntArray123 = new int[200];

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	public static int anInt984 = 0;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_376 = Static59.method1195("k");

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "Lclient!qf;")
	public static Class60 aClass60_378 = Static59.method1195("Cabbage");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public static void method645() {
		for (@Pc(3) int local3 = 0; local3 < Static74.anInt2399; local3++) {
			@Pc(9) int local9 = Static46.anIntArray170[local3];
			@Pc(13) Class3_Sub1_Sub1_Sub3_Sub1 local13 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local9];
			@Pc(17) int local17 = Static79.aClass3_Sub12_Sub1_1.method1936();
			if ((local17 & 0x2) != 0) {
				local17 += Static79.aClass3_Sub12_Sub1_1.method1936() << 8;
			}
			Static63.method1968(local9, local13, local17);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!jb;)V")
	public static void method647(@OriginalArg(1) Class25 arg0) {
		Static89.aClass25_27 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method648() {
		aClass7_2 = null;
		aClass60_377 = null;
		aClass25_5 = null;
		aClass60_375 = null;
		anIntArray123 = null;
		aClass60_378 = null;
		anIntArray122 = null;
		anIntArray124 = null;
		aClass25_Sub1_4 = null;
		aClass60_376 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)I")
	public static int method650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 2) {
			@Pc(25) int local25 = method650(arg0 >> 1, arg1 * arg1);
			if ((arg0 & 0x1) != 0) {
				local25 *= arg1;
			}
			return local25;
		} else if (arg0 == 1) {
			return arg1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static21.method563(arg1)) {
			Static129.method2295(arg4, arg6, arg5, arg0, Static120.aClass3_Sub15ArrayArray1[arg1], arg2, arg7, 0, 0, -1, arg3);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!mf;I)Z")
	public static boolean method652(@OriginalArg(0) Class3_Sub15 arg0) {
		if (arg0.anIntArray228 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray228.length; local12++) {
			@Pc(19) int local19 = Static122.method476(local12, arg0);
			@Pc(24) int local24 = arg0.anIntArray229[local12];
			if (arg0.anIntArray228[local12] == 2) {
				if (local24 <= local19) {
					return false;
				}
			} else if (arg0.anIntArray228[local12] == 3) {
				if (local24 >= local19) {
					return false;
				}
			} else if (arg0.anIntArray228[local12] == 4) {
				if (local19 == local24) {
					return false;
				}
			} else if (local19 != local24) {
				return false;
			}
		}
		return true;
	}
}

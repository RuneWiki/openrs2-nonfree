import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!df", name = "v", descriptor = "Lclient!pb;")
	public static Class60 aClass60_3;

	@OriginalMember(owner = "client!df", name = "w", descriptor = "I")
	public static int anInt1053;

	@OriginalMember(owner = "client!df", name = "o", descriptor = "Lclient!wd;")
	private static Class80 aClass80_344 = Static2.method59("Enter amount:");

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!wd;")
	public static Class80 aClass80_343 = aClass80_344;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!df", name = "q", descriptor = "Lclient!wd;")
	public static Class80 aClass80_345 = Static2.method59("Weiter");

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Lclient!wd;")
	private static Class80 aClass80_346 = Static2.method59("Continue");

	@OriginalMember(owner = "client!df", name = "s", descriptor = "Lclient!wd;")
	private static Class80 aClass80_347 = Static2.method59("Remove");

	@OriginalMember(owner = "client!df", name = "t", descriptor = "Lclient!wd;")
	public static Class80 aClass80_348 = Static2.method59("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!df", name = "u", descriptor = "Lclient!wd;")
	public static Class80 aClass80_349 = Static2.method59("http:)4)4");

	@OriginalMember(owner = "client!df", name = "x", descriptor = "Lclient!wd;")
	public static Class80 aClass80_350 = aClass80_347;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "Lclient!wd;")
	public static Class80 aClass80_351 = aClass80_346;

	@OriginalMember(owner = "client!df", name = "z", descriptor = "Lclient!wd;")
	public static Class80 aClass80_352 = Static2.method59("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!df", name = "A", descriptor = "Lclient!wd;")
	private static Class80 aClass80_353 = Static2.method59("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!df", name = "B", descriptor = "Lclient!wd;")
	public static Class80 aClass80_354 = aClass80_353;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII)V")
	public static void method560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg3 & 0x7FF;
		@Pc(16) int local16 = 2048 - arg2 & 0x7FF;
		@Pc(18) int local18 = arg0;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(46) int local46;
		if (local10 != 0) {
			local31 = Class2_Sub1_Sub9_Sub2.anIntArray202[local10];
			local35 = Class2_Sub1_Sub9_Sub2.anIntArray198[local10];
			local46 = local35 * 0 - local31 * arg0 >> 16;
			local18 = local31 * 0 + arg0 * local35 >> 16;
			local22 = local46;
		}
		if (local16 != 0) {
			local35 = Class2_Sub1_Sub9_Sub2.anIntArray198[local16];
			local31 = Class2_Sub1_Sub9_Sub2.anIntArray202[local16];
			local46 = local35 * 0 + local31 * local18 >> 16;
			local18 = local18 * local35 - local31 * 0 >> 16;
			local20 = local46;
		}
		Static80.anInt2025 = arg2;
		Static42.anInt1257 = arg5 - local18;
		Static107.anInt2863 = arg1 - local22;
		Static53.anInt1647 = arg4 - local20;
		Static82.anInt3082 = arg3;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!va;ILclient!va;)Lclient!va;")
	public static Class2_Sub1_Sub17 method561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub17 arg2, @OriginalArg(4) Class2_Sub1_Sub17 arg3) {
		@Pc(32) Class2_Sub1_Sub17 local32 = Static112.method1855(0, arg0, arg2, 0, Static51.aClass2_Sub1_Sub17ArrayArray1[arg3.anInt3022 >> 16], arg3.anInt3024, 0, arg3.anInt3022, 0, arg3.anInt3020, arg1);
		if (local32 == null) {
			if (arg3.aClass2_Sub1_Sub17Array2 != null) {
				local32 = Static112.method1855(0, arg0, arg2, 0, arg3.aClass2_Sub1_Sub17Array2, arg3.anInt3024, 0, arg3.anInt3022, 0, arg3.anInt3020, arg1);
			}
			return local32;
		} else {
			return local32;
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method563() {
		aClass80_349 = null;
		aClass80_352 = null;
		aClass80_347 = null;
		aClass80_353 = null;
		aClass80_350 = null;
		aClass80_345 = null;
		aClass80_343 = null;
		aClass80_346 = null;
		aClass80_351 = null;
		aClass60_3 = null;
		aCalendar1 = null;
		aClass80_344 = null;
		aClass80_354 = null;
		aClass80_348 = null;
	}
}

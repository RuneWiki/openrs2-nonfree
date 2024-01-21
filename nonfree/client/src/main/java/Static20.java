import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!db", name = "L", descriptor = "Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_3;

	@OriginalMember(owner = "client!db", name = "ab", descriptor = "Lclient!da;")
	public static Class15 aClass15_14;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "I")
	public static int anInt622 = 0;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "I")
	public static int anInt625 = 0;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "Lclient!wb;")
	public static Class65 aClass65_293 = Static24.method441("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	public static int anInt628 = 0;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	public static int anInt629 = 0;

	@OriginalMember(owner = "client!db", name = "S", descriptor = "Lclient!wb;")
	private static Class65 aClass65_294 = Static24.method441("Please use a different world)3");

	@OriginalMember(owner = "client!db", name = "T", descriptor = "Lclient!wb;")
	public static Class65 aClass65_295 = aClass65_294;

	@OriginalMember(owner = "client!db", name = "V", descriptor = "[I")
	public static int[] anIntArray86 = new int[2000];

	@OriginalMember(owner = "client!db", name = "W", descriptor = "Lclient!wb;")
	public static Class65 aClass65_296 = Static24.method441("redstone1");

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
	public static int anInt637 = 0;

	@OriginalMember(owner = "client!db", name = "db", descriptor = "Lclient!wb;")
	public static Class65 aClass65_297 = Static24.method441("gleiten:");

	@OriginalMember(owner = "client!db", name = "eb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_298 = Static24.method441("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)Lclient!sd;")
	public static Class2_Sub1_Sub15 method402(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub15 local10 = (Class2_Sub1_Sub15) Static42.aClass21_14.method744((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static27.aClass33_9.method1150(arg0, 13);
		local10 = new Class2_Sub1_Sub15();
		local10.anInt2682 = arg0;
		if (local26 != null) {
			local10.method1653(new Class2_Sub8(local26));
		}
		Static42.aClass21_14.method745((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
	public static void method403() {
		aClass65_293 = null;
		aClass65_294 = null;
		anIntArray86 = null;
		aClass2_Sub1_Sub4_Sub2_3 = null;
		aClass65_297 = null;
		aClass65_295 = null;
		aClass65_296 = null;
		aClass15_14 = null;
		aClass65_298 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V")
	public static void method404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
			Static17.anInt575 = -1;
			Static98.anInt2759 = -1;
			return;
		}
		@Pc(37) int local37 = Static25.method447(Static62.anInt1879, arg1, arg0) - arg2;
		@Pc(41) int local41 = arg1 - Static51.anInt1481;
		@Pc(45) int local45 = local37 - Static26.anInt2923;
		@Pc(49) int local49 = Static86.anIntArray363[Static9.anInt318];
		@Pc(53) int local53 = Static86.anIntArray354[Static9.anInt318];
		@Pc(61) int local61 = arg0 - Static87.anInt2520;
		@Pc(65) int local65 = Static86.anIntArray363[Static97.anInt2699];
		@Pc(69) int local69 = Static86.anIntArray354[Static97.anInt2699];
		@Pc(79) int local79 = local41 * local69 + local61 * local65 >> 16;
		@Pc(89) int local89 = local41 * local65 - local69 * local61 >> 16;
		@Pc(91) int local91 = local79;
		@Pc(102) int local102 = local45 * local49 - local53 * local89 >> 16;
		@Pc(112) int local112 = local53 * local45 + local49 * local89 >> 16;
		if (local112 < 50) {
			Static98.anInt2759 = -1;
			Static17.anInt575 = -1;
		} else {
			Static98.anInt2759 = (local91 << 9) / local112 + 256;
			Static17.anInt575 = (local102 << 9) / local112 + 167;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(III)Lclient!wb;")
	public static Class65 method405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return Static41.aClass65_571;
		} else if (local7 < -6) {
			return Static19.aClass65_854;
		} else if (local7 < -3) {
			return Static79.aClass65_1034;
		} else if (local7 < 0) {
			return Static101.aClass65_1250;
		} else if (local7 > 9) {
			return Static47.aClass65_621;
		} else if (local7 > 6) {
			return Static23.aClass65_318;
		} else if (local7 > 3) {
			return Static41.aClass65_573;
		} else if (local7 > 0) {
			return Static32.aClass65_457;
		} else {
			return Static98.aClass65_1234;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)I")
	public static int method406() {
		return Static53.anInt1943++;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V")
	public static void method407() {
		Static19.aClass8_3.method838();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static4.aLongArray1[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static63.aLongArray9[local22] = 0L;
		}
		Static32.anInt1057 = 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!hd", name = "tb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_556 = Static24.method441(" Millionen");

	@OriginalMember(owner = "client!hd", name = "ub", descriptor = "Lclient!wb;")
	private static Class65 aClass65_557 = Static24.method441("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!hd", name = "Kb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_566 = Static24.method441("Enter amount:");

	@OriginalMember(owner = "client!hd", name = "wb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_558 = aClass65_566;

	@OriginalMember(owner = "client!hd", name = "xb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_559 = Static24.method441("Side panel redrawn");

	@OriginalMember(owner = "client!hd", name = "zb", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!hd", name = "Ab", descriptor = "Lclient!wb;")
	public static Class65 aClass65_560 = Static24.method441("System)2Update in: ");

	@OriginalMember(owner = "client!hd", name = "Eb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_563 = Static24.method441("New User");

	@OriginalMember(owner = "client!hd", name = "Bb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_561 = aClass65_563;

	@OriginalMember(owner = "client!hd", name = "Db", descriptor = "Lclient!wb;")
	public static Class65 aClass65_562 = Static24.method441("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!hd", name = "Fb", descriptor = "I")
	public static int anInt1296 = 0;

	@OriginalMember(owner = "client!hd", name = "Gb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_564 = aClass65_557;

	@OriginalMember(owner = "client!hd", name = "Ib", descriptor = "Lclient!wb;")
	public static Class65 aClass65_565 = Static24.method441("::errortest");

	@OriginalMember(owner = "client!hd", name = "Lb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_567 = Static24.method441(" x");

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)I")
	public static int method784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static12.method265(arg0 + 45365, 4, arg1 + 91923) + (Static12.method265(arg0 + 10294, 2, arg1 + 37821) + -128 >> 1) + (Static12.method265(arg0, 1, arg1) - 128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V")
	public static void method785() {
		aClass65_567 = null;
		aClass65_562 = null;
		aClass65_561 = null;
		aClass65_557 = null;
		aClass65_563 = null;
		aClass65_558 = null;
		aClass65_556 = null;
		aClass65_564 = null;
		aClass65_566 = null;
		aClass65_560 = null;
		aClass65_565 = null;
		aClass65_559 = null;
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(B)V")
	public static void method786() {
		Static19.aClass8_3.method834();
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			Static4.aLongArray1[local18] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static63.aLongArray9[local30] = 0L;
		}
		Static32.anInt1057 = 0;
	}
}

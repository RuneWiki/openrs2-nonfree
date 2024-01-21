import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ve", name = "X", descriptor = "Lclient!df;")
	public static Class16 aClass16_76;

	@OriginalMember(owner = "client!ve", name = "V", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1417 = Static59.method1195(" x ");

	@OriginalMember(owner = "client!ve", name = "bb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1418 = Static59.method1195("headicons_hint");

	@OriginalMember(owner = "client!ve", name = "mc", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1427 = Static59.method1195("Enter name of friend to add to list");

	@OriginalMember(owner = "client!ve", name = "fb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1419 = aClass60_1427;

	@OriginalMember(owner = "client!ve", name = "kb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1420 = Static59.method1195("Aus");

	@OriginalMember(owner = "client!ve", name = "nb", descriptor = "Lclient!eb;")
	public static Class17 aClass17_55 = new Class17(64);

	@OriginalMember(owner = "client!ve", name = "yb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1421 = Static59.method1195("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!ve", name = "Nb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1422 = Static59.method1195("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!ve", name = "Tb", descriptor = "[Lclient!qf;")
	public static Class60[] aClass60Array23 = new Class60[100];

	@OriginalMember(owner = "client!ve", name = "Ub", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1423 = Static59.method1195("Welt");

	@OriginalMember(owner = "client!ve", name = "Wb", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!ve", name = "Zb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1424 = Static59.method1195("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!ve", name = "kc", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1426 = Static59.method1195("Benutzen");

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IJ)V")
	public static void method2277(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if ((long) 0 == arg0 % 10L) {
			Static33.method754(arg0 - 1L);
			Static33.method754(1L);
		} else {
			Static33.method754(arg0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
	public static void method2278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) long local16 = (long) ((arg0 << 16) + arg1);
		@Pc(22) Class3_Sub1_Sub4 local22 = (Class3_Sub1_Sub4) Static64.aClass82_7.method2305(local16);
		if (local22 != null) {
			Static128.aClass43_2.method1389(local22);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIB)I")
	public static int method2279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 179) {
			arg2 /= 2;
		}
		if (arg0 > 192) {
			arg2 /= 2;
		}
		if (arg0 > 217) {
			arg2 /= 2;
		}
		if (arg0 > 243) {
			arg2 /= 2;
		}
		return (arg1 / 4 << 10) + (arg2 / 32 << 7) + arg0 / 2;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
	public static void method2283() {
		aClass60_1419 = null;
		aClass60_1426 = null;
		aClass60_1421 = null;
		aClass60_1427 = null;
		aClass60_1417 = null;
		aClass17_55 = null;
		aClass60_1420 = null;
		aClass60_1418 = null;
		aClass60_1423 = null;
		aClass60Array23 = null;
		aClass60_1422 = null;
		aClass60_1424 = null;
		aClass16_76 = null;
	}
}

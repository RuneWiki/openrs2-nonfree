import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	public static int anInt1624;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "Lclient!qf;")
	private static Class60 aClass60_724 = Static59.method1195("Loaded input handler");

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Lclient!qf;")
	private static Class60 aClass60_725 = Static59.method1195("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!j", name = "s", descriptor = "Lclient!qf;")
	private static Class60 aClass60_728 = Static59.method1195("Click to continue");

	@OriginalMember(owner = "client!j", name = "l", descriptor = "Lclient!qf;")
	public static Class60 aClass60_726 = aClass60_728;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_727 = aClass60_724;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "Lclient!qf;")
	public static Class60 aClass60_729 = Static59.method1195("Von:");

	@OriginalMember(owner = "client!j", name = "u", descriptor = "Lclient!qf;")
	public static Class60 aClass60_730 = Static59.method1195("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!j", name = "B", descriptor = "Lclient!qf;")
	public static Class60 aClass60_731 = aClass60_725;

	@OriginalMember(owner = "client!j", name = "C", descriptor = "Lclient!qf;")
	public static Class60 aClass60_732 = Static59.method1195("backvmid2");

	@OriginalMember(owner = "client!j", name = "G", descriptor = "Lclient!qf;")
	public static Class60 aClass60_733 = Static59.method1195("backhmid2");

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method1072() {
		aClass60_724 = null;
		aClass60_726 = null;
		aClass60_725 = null;
		aClass60_732 = null;
		aClass60_727 = null;
		aClass60_728 = null;
		aClass60_731 = null;
		aClass60_729 = null;
		aClass60_733 = null;
		aClass60_730 = null;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public static void method1073() {
		for (@Pc(16) Class3_Sub7 local16 = (Class3_Sub7) Static80.aClass5_18.method92(); local16 != null; local16 = (Class3_Sub7) Static80.aClass5_18.method90()) {
			if (local16.anInt799 == -1) {
				local16.anInt790 = 0;
				Static111.method2067(local16);
			} else {
				local16.method2264();
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIB)I")
	public static int method1074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class3_Sub13 local17 = (Class3_Sub13) Static16.aClass82_1.method2305((long) arg0);
		if (local17 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local17.anIntArray214.length) {
			return local17.anIntArray214[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)V")
	public static void method1075(@OriginalArg(0) int arg0) {
		if (arg0 == Static39.anInt1303) {
			return;
		}
		if (Static39.anInt1303 == 0) {
			Static101.method1992();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static30.anInt1040 = 0;
			Static34.anInt1182 = 0;
			Static119.anInt3238 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static42.aClass47_2 != null) {
			Static42.aClass47_2.method1564();
			Static42.aClass47_2 = null;
		}
		if (Static39.anInt1303 == 25 || Static39.anInt1303 == 40) {
			Static53.method1131();
			Static40.method1886();
		}
		if (Static39.anInt1303 == 25) {
			Static79.anInt2485 = 0;
			Static74.anInt2405 = 1;
			Static21.anInt869 = 0;
			Static93.anInt2678 = 0;
			Static38.anInt1282 = 1;
		}
		if (arg0 == 35) {
			Static78.method1572();
			Static127.method1722();
			if (Static30.aClass16_27 == null) {
				Static30.aClass16_27 = Static42.method971(Static2.aCanvas1, 765, 503);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static30.aClass16_27 = null;
			Static78.method1572();
			Static98.method1831(Static2.aCanvas1, Static113.aClass25_Sub1_18, Static64.aClass25_Sub1_9);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static30.aClass16_27 = null;
			Static127.method1722();
			Static36.method795(Static113.aClass25_Sub1_18, Static2.aCanvas1);
		}
		Static39.anInt1303 = arg0;
		Static33.aBoolean35 = true;
	}
}

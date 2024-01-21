import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!de", name = "o", descriptor = "[I")
	public static int[] anIntArray49 = new int[4000];

	@OriginalMember(owner = "client!de", name = "t", descriptor = "Lclient!oa;")
	private static Class56 aClass56_350 = Static33.method650("To create a new account you need to");

	@OriginalMember(owner = "client!de", name = "s", descriptor = "Lclient!oa;")
	public static Class56 aClass56_349 = aClass56_350;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "I")
	public static int anInt703 = 255;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "Lclient!oa;")
	public static Class56 aClass56_351 = Static33.method650("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!de", name = "x", descriptor = "I")
	public static int anInt705 = 0;

	@OriginalMember(owner = "client!de", name = "z", descriptor = "I")
	public static int anInt707 = 0;

	@OriginalMember(owner = "client!de", name = "A", descriptor = "Lclient!oa;")
	public static Class56 aClass56_352 = Static33.method650("::fpsoff");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!id;I)V")
	public static void method494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub1_Sub2 arg2) {
		if (arg2 == null) {
			return;
		}
		@Pc(12) int local12 = Static18.anInt493 + Static22.anInt686 & 0x7FF;
		@Pc(20) int local20 = arg0 * arg0 + arg1 * arg1;
		if (local20 > 6400) {
			return;
		}
		@Pc(28) int local28 = Class3_Sub1_Sub1_Sub3.anIntArray116[local12];
		@Pc(36) int local36 = local28 * 256 / (Static62.anInt1804 + 256);
		@Pc(48) int local48 = Class3_Sub1_Sub1_Sub3.anIntArray115[local12];
		@Pc(56) int local56 = local48 * 256 / (Static62.anInt1804 + 256);
		@Pc(66) int local66 = arg1 * local56 + arg0 * local36 >> 16;
		@Pc(76) int local76 = local56 * arg0 - arg1 * local36 >> 16;
		if (local20 > 2500) {
			arg2.method951(Static40.aClass3_Sub1_Sub1_Sub4_26, local66 + 98 - arg2.anInt1482 / 2, -4 + 83 + -local76 + -(arg2.anInt1486 / 2));
		} else {
			arg2.method967(local66 + 4 + 94 - arg2.anInt1482 / 2, -(arg2.anInt1486 / 2) + -4 + -local76 + 83);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public static void method495() {
		aClass56_352 = null;
		anIntArray49 = null;
		aClass56_350 = null;
		aClass56_349 = null;
		aCalendar1 = null;
		aClass56_351 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	public static void method497() {
		Static16.aClass33_1.method1517();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static111.aLongArray33[local6] = 0L;
		}
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			Static103.aLongArray29[local18] = 0L;
		}
		Static16.anInt468 = 0;
	}
}

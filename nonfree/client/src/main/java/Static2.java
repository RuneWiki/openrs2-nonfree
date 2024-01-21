import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!fc;")
	public static Class25 aClass25_26 = Static78.method1313("Aus");

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!fc;")
	private static Class25 aClass25_27 = Static78.method1313("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	public static int anInt29 = -1;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	public static int anInt30 = 0;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_28 = Static78.method1313("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Lclient!fc;")
	private static Class25 aClass25_29 = Static78.method1313("Message");

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "Lclient!fc;")
	private static Class25 aClass25_33 = Static78.method1313("Loading )2 please wait)3");

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_30 = aClass25_33;

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_31 = Static78.method1313(")1p");

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
	public static int anInt37 = 0;

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Lclient!fc;")
	public static Class25 aClass25_32 = aClass25_27;

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "Lclient!fc;")
	public static Class25 aClass25_34 = aClass25_29;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)I")
	public static int method24() {
		return Static66.anInt1459++;
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
	public static void method25() {
		@Pc(1) Class42 local1 = Static31.aClass42_1;
		synchronized (Static31.aClass42_1) {
			Static42.anInt1139 = Static32.anInt895;
			Static10.anInt264 = Static40.anInt1115;
			Static111.anInt2597 = Static6.anInt118;
			Static11.anInt277 = Static114.anInt2644;
			Static30.anInt815 = Static114.anInt2640;
			Static23.anInt675 = Static47.anInt1213;
			Static40.aLong79 = Static111.aLong156;
			Static114.anInt2644 = 0;
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
	public static void method27() {
		aClass25_28 = null;
		aClass25_30 = null;
		aBooleanArray1 = null;
		aClass25_31 = null;
		aClass25_27 = null;
		aClass25_34 = null;
		aClass25_26 = null;
		aClass25_29 = null;
		aClass25_32 = null;
		aClass25_33 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
	public static int method30(@OriginalArg(1) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 <= 0 || local6 >= 256) {
			local6 = -1;
		}
		return local6;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)I")
	public static int method31(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub1 local12 = (Class1_Sub1) Static67.aClass66_10.method1650((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local12.anIntArray11.length; local31++) {
				if (local12.anIntArray9[local31] == arg1) {
					local29 += local12.anIntArray11[local31];
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "(I)V")
	public static void method32() {
		Static22.aClass63_4.method1513();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!oc;IBLclient!fc;ZLclient!fc;I)V")
	public static void method34(@OriginalArg(0) Class56 arg0, @OriginalArg(3) Class25 arg1, @OriginalArg(5) Class25 arg2) {
		@Pc(13) int local13 = arg0.method1278(arg1);
		@Pc(19) int local19 = arg0.method1264(arg2, local13);
		Static16.method379(arg0, 255, local13, local19);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ob;B)[I")
	public static int[] method35(@OriginalArg(0) Class1_Sub2_Sub14 arg0) {
		@Pc(10) int local10 = arg0.anInt1937 >> 16;
		if (!Static57.method1727(local10)) {
			return null;
		}
		@Pc(21) int local21 = arg0.anInt1959;
		@Pc(24) int local24 = arg0.anInt1917;
		@Pc(32) int local32 = arg0.anInt1905;
		while (local32 != -1) {
			@Pc(42) Class1_Sub2_Sub14 local42 = Static56.aClass1_Sub2_Sub14ArrayArray1[local10][local32 & 0xFFFF];
			local32 = local42.anInt1905;
			local21 += local42.anInt1959 - local42.anInt1949;
			local24 += local42.anInt1917 - local42.anInt1957;
		}
		return new int[] { local21, local24 };
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIIIIII)I")
	public static int method36(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(10) int local10 = arg3;
			arg3 = arg5;
			arg5 = local10;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 1 + 7 - arg3 - arg4;
		} else if (local3 == 2) {
			return 7 + 1 - arg0 - arg5;
		} else {
			return arg4;
		}
	}
}

import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!hf", name = "fb", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_28;

	@OriginalMember(owner = "client!hf", name = "mb", descriptor = "[I")
	public static int[] anIntArray195;

	@OriginalMember(owner = "client!hf", name = "nb", descriptor = "Lclient!bc;")
	public static Class6 aClass6_12;

	@OriginalMember(owner = "client!hf", name = "sb", descriptor = "Lclient!q;")
	public static Class62 aClass62_13;

	@OriginalMember(owner = "client!hf", name = "C", descriptor = "Lclient!kd;")
	public static Class39 aClass39_665 = Static108.method1915("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!hf", name = "D", descriptor = "Lclient!kd;")
	public static Class39 aClass39_666 = Static108.method1915("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
	public static final int anInt1395 = 20;

	@OriginalMember(owner = "client!hf", name = "F", descriptor = "Lclient!kd;")
	public static Class39 aClass39_667 = Static108.method1915("Classic");

	@OriginalMember(owner = "client!hf", name = "G", descriptor = "[I")
	public static int[] anIntArray192 = new int[32768];

	@OriginalMember(owner = "client!hf", name = "R", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!hf", name = "hb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3 = new byte[4][104][104];

	@OriginalMember(owner = "client!hf", name = "ib", descriptor = "[I")
	public static int[] anIntArray194 = new int[4000];

	@OriginalMember(owner = "client!hf", name = "jb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6 = new int[4][105][105];

	@OriginalMember(owner = "client!hf", name = "rb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_672 = Static108.method1915(" has logged out)3");

	@OriginalMember(owner = "client!hf", name = "kb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_668 = aClass39_672;

	@OriginalMember(owner = "client!hf", name = "lb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_669 = Static108.method1915("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!hf", name = "ob", descriptor = "Lclient!kd;")
	public static Class39 aClass39_670 = Static108.method1915("Hidden)2");

	@OriginalMember(owner = "client!hf", name = "pb", descriptor = "I")
	public static int anInt1408 = 0;

	@OriginalMember(owner = "client!hf", name = "qb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_671 = Static108.method1915(" weitere Optionen");

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IJ)V")
	public static void method880(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static12.anInt502 >= 100 && Static104.anInt2641 != 1 || Static12.anInt502 >= 200) {
			Static66.method1189(Static8.aClass39_147, Static23.aClass39_399, 0);
			return;
		}
		@Pc(36) Class39 local36 = Static75.method1290(arg0).method1153();
		for (@Pc(38) int local38 = 0; local38 < Static12.anInt502; local38++) {
			if (Static45.aLongArray3[local38] == arg0) {
				Static66.method1189(Static8.aClass39_147, Static30.method601(new Class39[] { local36, Static67.aClass39_855 }), 0);
				return;
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Static108.anInt2750; local73++) {
			if (arg0 == Static88.aLongArray4[local73]) {
				Static66.method1189(Static8.aClass39_147, Static30.method601(new Class39[] { Static79.aClass39_1222, local36, Static11.aClass39_223 }), 0);
				return;
			}
		}
		if (local36.method1159(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass39_1234)) {
			return;
		}
		Static117.aClass39Array29[Static12.anInt502] = local36;
		Static45.aLongArray3[Static12.anInt502] = arg0;
		Static14.anIntArray93[Static12.anInt502] = 0;
		Static88.anIntArray322[Static12.anInt502] = 0;
		Static35.aBoolean96 = true;
		Static96.anInt2282 = Static45.anInt1256 + 1;
		Static12.anInt502++;
		Static103.aClass1_Sub18_Sub1_5.method2203(42);
		Static103.aClass1_Sub18_Sub1_5.method2179(arg0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public static void method881() {
		for (@Pc(8) int local8 = 0; local8 < Static94.anInt2224; local8++) {
			@Pc(14) int local14 = Static117.anIntArray460[local8];
			@Pc(18) Class1_Sub1_Sub2_Sub1_Sub2 local18 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = Static79.aClass1_Sub18_Sub1_3.method2169();
			if ((local22 & 0x20) != 0) {
				local22 += Static79.aClass1_Sub18_Sub1_3.method2169() << 8;
			}
			Static39.method698(local14, local18, local22);
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public static void method882() {
		aClass39_671 = null;
		aClass1_Sub1_Sub4_Sub1_28 = null;
		aClass62_13 = null;
		aClass39_665 = null;
		aByteArrayArrayArray3 = null;
		anIntArray192 = null;
		anIntArray194 = null;
		aClass39_672 = null;
		anIntArrayArrayArray6 = null;
		anIntArray195 = null;
		aClass39_670 = null;
		aClass39_669 = null;
		aClass39_667 = null;
		aClass6_12 = null;
		aClass39_668 = null;
		aClass39_666 = null;
		aCalendar1 = null;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)I")
	public static int method883() {
		return Static16.anInt2473++;
	}
}

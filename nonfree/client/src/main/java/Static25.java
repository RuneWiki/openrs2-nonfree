import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "J")
	public static long aLong47;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
	public static int anInt791;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
	public static int anInt792;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!sa;")
	public static Class67 aClass67_8 = new Class67(64);

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "Lclient!mb;")
	public static Class45 aClass45_378 = Static63.method1251("gr-Un:");

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "Lclient!mb;")
	public static Class45 aClass45_379 = Static63.method1251("::qa_op_test");

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!mb;")
	private static Class45 aClass45_380 = Static63.method1251("Attack");

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "Lclient!mb;")
	public static Class45 aClass45_381 = Static63.method1251("leuchten2:");

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_382 = Static63.method1251("Verbindung mit");

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "Lclient!mb;")
	private static Class45 aClass45_383 = Static63.method1251("On");

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "Lclient!mb;")
	public static Class45 aClass45_384 = aClass45_383;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_385 = Static63.method1251("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!mb;")
	public static Class45 aClass45_386 = Static63.method1251("scrollbar");

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "Lclient!mb;")
	public static Class45 aClass45_387 = aClass45_380;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZI)V")
	public static void method556(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static107.anInt2807 != 0 && arg0 != -1) {
			Static61.method1224(Static77.aClass29_Sub1_33, arg0, Static107.anInt2807, 0);
			Static61.aBoolean88 = true;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public static void method557() {
		@Pc(11) Class52 local11 = Static89.aClass52_1;
		synchronized (Static89.aClass52_1) {
			Static53.anInt2374 = Static111.anInt2907;
			@Pc(19) int local19;
			if (Static32.anInt937 < 0) {
				for (local19 = 0; local19 < 112; local19++) {
					Static7.aBooleanArray1[local19] = false;
				}
				Static32.anInt937 = Static5.anInt114;
			} else {
				while (Static32.anInt937 != Static5.anInt114) {
					local19 = Static88.anIntArray365[Static5.anInt114];
					Static5.anInt114 = Static5.anInt114 + 1 & 0x7F;
					if (local19 < 0) {
						Static7.aBooleanArray1[~local19] = false;
					} else {
						Static7.aBooleanArray1[local19] = true;
					}
				}
			}
			Static111.anInt2907 = Static73.anInt2174;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public static void method558() {
		aClass45_378 = null;
		aClass45_381 = null;
		aClass45_382 = null;
		aClass45_387 = null;
		aClass45_384 = null;
		aClass45_385 = null;
		aClass45_386 = null;
		aClass45_380 = null;
		aClass45_383 = null;
		aClass67_8 = null;
		aClass45_379 = null;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
	public static void method559() {
		Static70.aClass5_Sub9_Sub1_3.method1462();
		@Pc(16) int local16 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
		if (local16 == 0) {
			return;
		}
		@Pc(27) int local27 = Static70.aClass5_Sub9_Sub1_3.method1456(2);
		if (local27 == 0) {
			Static104.anIntArray425[Static79.anInt2240++] = 2047;
			return;
		}
		@Pc(50) int local50;
		@Pc(60) int local60;
		if (local27 == 1) {
			local50 = Static70.aClass5_Sub9_Sub1_3.method1456(3);
			Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.method1619(false, local50);
			local60 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
			if (local60 == 1) {
				Static104.anIntArray425[Static79.anInt2240++] = 2047;
			}
			return;
		}
		@Pc(102) int local102;
		if (local27 == 2) {
			local50 = Static70.aClass5_Sub9_Sub1_3.method1456(3);
			Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.method1619(true, local50);
			local60 = Static70.aClass5_Sub9_Sub1_3.method1456(3);
			Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.method1619(true, local60);
			local102 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
			if (local102 == 1) {
				Static104.anIntArray425[Static79.anInt2240++] = 2047;
			}
		} else if (local27 == 3) {
			local50 = Static70.aClass5_Sub9_Sub1_3.method1456(7);
			local60 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
			Static8.anInt262 = Static70.aClass5_Sub9_Sub1_3.method1456(2);
			local102 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
			if (local102 == 1) {
				Static104.anIntArray425[Static79.anInt2240++] = 2047;
			}
			@Pc(153) int local153 = Static70.aClass5_Sub9_Sub1_3.method1456(7);
			Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.method1622(local50, local153, local60 == 1);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(JB)V")
	public static void method560(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static104.anInt2772; local19++) {
			if (arg0 == Static23.aLongArray1[local19]) {
				Static72.aBoolean99 = true;
				Static104.anInt2772--;
				for (@Pc(39) int local39 = local19; local39 < Static104.anInt2772; local39++) {
					Static21.aClass45Array7[local39] = Static21.aClass45Array7[local39 + 1];
					Static56.anIntArray257[local39] = Static56.anIntArray257[local39 + 1];
					Static23.aLongArray1[local39] = Static23.aLongArray1[local39 + 1];
					Static9.anIntArray41[local39] = Static9.anIntArray41[local39 + 1];
				}
				Static108.anInt2827 = Static3.anInt94 + 1;
				Static64.aClass5_Sub9_Sub1_2.method1466(162);
				Static64.aClass5_Sub9_Sub1_2.method1454(arg0);
				return;
			}
		}
	}
}

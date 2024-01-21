import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
	public static int anInt1367;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
	public static int anInt1368;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 aClass5_Sub1_Sub10_Sub1_12;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "Lclient!fc;")
	public static Class24_Sub1 aClass24_Sub1_13;

	@OriginalMember(owner = "client!ib", name = "N", descriptor = "Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3 aClass5_Sub1_Sub10_Sub3_25;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!vc;")
	private static Class71 aClass71_706 = Static38.method736("Loading config )2 ");

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "[B")
	public static byte[] aByteArray9 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "Lclient!vc;")
	public static Class71 aClass71_707 = aClass71_706;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "Lclient!qa;")
	public static Class54 aClass54_23 = new Class54(500);

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "Lclient!qa;")
	public static Class54 aClass54_24 = new Class54(128);

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public static int anInt1375 = 0;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	public static int anInt1377 = 0;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "Lclient!vc;")
	public static Class71 aClass71_708 = Static38.method736("blaugr-Un:");

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "Lclient!vc;")
	public static Class71 aClass71_709 = null;

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
	public static int anInt1378 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method923() {
		if (Static66.anInt1647 != 0 || Static66.anInt1652 != 1) {
			return;
		}
		@Pc(24) int local24 = Static30.anInt800 - 25 - 550;
		@Pc(30) int local30 = Static32.anInt847 - 5 - 4;
		if (local24 < 0 || local30 < 0 || local24 >= 146 || local30 >= 151) {
			return;
		}
		local24 -= 73;
		local30 -= 75;
		@Pc(52) int local52 = Static88.anInt2060 + Static101.anInt2378 & 0x7FF;
		@Pc(56) int local56 = Class5_Sub1_Sub10_Sub2.anIntArray240[local52];
		@Pc(60) int local60 = Class5_Sub1_Sub10_Sub2.anIntArray241[local52];
		@Pc(68) int local68 = local56 * (Static66.anInt1651 + 256) >> 8;
		@Pc(76) int local76 = (Static66.anInt1651 + 256) * local60 >> 8;
		@Pc(86) int local86 = local68 * local24 + local30 * local76 >> 11;
		@Pc(94) int local94 = Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474 + local86 >> 7;
		@Pc(105) int local105 = local30 * local68 - local76 * local24 >> 11;
		@Pc(113) int local113 = Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452 - local105 >> 7;
		@Pc(133) boolean local133 = Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local94, 0, 1, 0, true, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local113, 0, 0);
		if (!local133) {
			return;
		}
		Static61.aClass5_Sub11_Sub1_8.method1545(local24);
		Static61.aClass5_Sub11_Sub1_8.method1545(local30);
		Static61.aClass5_Sub11_Sub1_8.method1501(Static88.anInt2060);
		Static61.aClass5_Sub11_Sub1_8.method1545(57);
		Static61.aClass5_Sub11_Sub1_8.method1545(Static101.anInt2378);
		Static61.aClass5_Sub11_Sub1_8.method1545(Static66.anInt1651);
		Static61.aClass5_Sub11_Sub1_8.method1545(89);
		Static61.aClass5_Sub11_Sub1_8.method1501(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474);
		Static61.aClass5_Sub11_Sub1_8.method1501(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452);
		Static61.aClass5_Sub11_Sub1_8.method1545(Static19.anInt640);
		Static61.aClass5_Sub11_Sub1_8.method1545(63);
		return;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IJ)V")
	public static void method924(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static68.anInt1685; local14++) {
			if (arg0 == Static57.aLongArray6[local14]) {
				Static68.anInt1685--;
				Static28.aBoolean33 = true;
				for (@Pc(39) int local39 = local14; local39 < Static68.anInt1685; local39++) {
					Static81.aClass71Array13[local39] = Static81.aClass71Array13[local39 + 1];
					Static70.anIntArray216[local39] = Static70.anIntArray216[local39 + 1];
					Static57.aLongArray6[local39] = Static57.aLongArray6[local39 + 1];
					Static82.anIntArray247[local39] = Static82.anIntArray247[local39 + 1];
				}
				Static8.anInt282 = Static95.anInt2285 + 1;
				Static61.aClass5_Sub11_Sub1_8.method1553(186);
				Static61.aClass5_Sub11_Sub1_8.method1548(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)Z")
	public static boolean method926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && Static42.anInt1082 == arg1) {
			return true;
		} else if (arg0 == 1 && arg1 == Static73.anInt1838) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && Static111.anInt972 == arg1;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public static void method928() {
		for (@Pc(7) int local7 = 0; local7 < Static57.anInt1493; local7++) {
			@Pc(13) int local13 = Static72.anIntArray224[local7];
			@Pc(17) Class5_Sub1_Sub1_Sub3_Sub2 local17 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local13];
			@Pc(21) int local21 = Static86.aClass5_Sub11_Sub1_12.method1546();
			if ((local21 & 0x20) != 0) {
				local21 += Static86.aClass5_Sub11_Sub1_12.method1546() << 8;
			}
			Static99.method1615(local17, local13, local21);
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public static void method935() {
		aClass54_23 = null;
		aClass24_Sub1_13 = null;
		aClass71_707 = null;
		aClass71_706 = null;
		aByteArray9 = null;
		aClass5_Sub1_Sub10_Sub3_25 = null;
		anIntArray157 = null;
		aClass71_708 = null;
		aClass71_709 = null;
		aClass5_Sub1_Sub10_Sub1_12 = null;
		aClass54_24 = null;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	public static void method936() {
		Static71.aClass54_27.method1402();
		aClass54_23.method1402();
		Static109.aClass54_37.method1402();
		Static98.aClass54_33.method1402();
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
	public static void method937() {
		Static71.aClass7_54.method699();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method939(@OriginalArg(1) KeyEvent arg0) {
		@Pc(11) int local11 = arg0.getKeyChar();
		if (local11 <= 0 || local11 >= 256) {
			local11 = -1;
		}
		return local11;
	}
}

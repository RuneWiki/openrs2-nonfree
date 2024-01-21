import java.awt.Component;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public static int anInt1230;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "I")
	public static int anInt1234;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "Lclient!qd;")
	public static Class54_Sub1 aClass54_Sub1_22;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "I")
	public static int anInt1229 = 0;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "Lclient!hb;")
	public static Class27 aClass27_599 = Static87.method1648("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!hb;")
	public static Class27 aClass27_600 = Static87.method1648("@cr2@");

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	public static int anInt1232 = 0;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "Lclient!hb;")
	private static Class27 aClass27_602 = Static87.method1648("Walk here");

	@OriginalMember(owner = "client!i", name = "i", descriptor = "Lclient!hb;")
	public static Class27 aClass27_601 = aClass27_602;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "I")
	public static int anInt1235 = 0;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
	public static int[] anIntArray203 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!i", name = "t", descriptor = "Lclient!hb;")
	public static Class27 aClass27_603 = Static87.method1648(",Zffentlicher Chat");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method892() {
		anIntArray203 = null;
		aClass27_599 = null;
		aClass27_602 = null;
		aClass27_600 = null;
		aClass54_Sub1_22 = null;
		aClass27_601 = null;
		aClass27_603 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLjava/awt/Component;Lclient!jb;)V")
	public static void method893(@OriginalArg(1) Component arg0, @OriginalArg(2) Class32 arg1) {
		try {
			@Pc(8) Class9_Sub1 local8 = (Class9_Sub1) Class.forName("Class9_Sub1_Sub2").getDeclaredConstructor().newInstance();
			local8.method1877(arg1, 2048);
			Static13.aClass9_3 = local8;
		} catch (@Pc(22) Throwable local22) {
			try {
				Static13.aClass9_3 = new Class9_Sub1_Sub1(arg1, arg0);
			} catch (@Pc(30) Throwable local30) {
				if (Static49.aString2.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static13.aClass9_3 = new Class9_Sub2();
						return;
					} catch (@Pc(44) Throwable local44) {
					}
				}
				Static13.aClass9_3 = new Class9(8000);
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!wd;B)Lclient!hb;")
	public static Class27 method894(@OriginalArg(1) Class3_Sub11 arg0) {
		try {
			@Pc(15) Class27 local15 = new Class27();
			local15.anInt963 = arg0.method1469();
			if (local15.anInt963 > 32767) {
				local15.anInt963 = 32767;
			}
			local15.aByteArray9 = new byte[local15.anInt963];
			arg0.anInt2060 += Static31.aClass41_1.method1193(0, arg0.aByteArray17, local15.aByteArray9, local15.anInt963, arg0.anInt2060);
			return local15;
		} catch (@Pc(56) Exception local56) {
			return Static52.aClass27_682;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method895(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) int local2 = arg0.getKeyChar();
		if (local2 <= 0 || local2 >= 256) {
			local2 = -1;
		}
		return local2;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZZ)V")
	public static void method896(@OriginalArg(0) boolean arg0) {
		if (Static25.aClass20_13 == null) {
			return;
		}
		try {
			@Pc(16) Class3_Sub11 local16 = new Class3_Sub11(4);
			local16.method1443(arg0 ? 2 : 3);
			local16.method1427(0);
			Static25.aClass20_13.method651(4, local16.aByteArray17);
		} catch (@Pc(37) IOException local37) {
			try {
				Static25.aClass20_13.method656();
			} catch (@Pc(42) Exception local42) {
			}
			Static98.anInt2574++;
			Static25.aClass20_13 = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!qd;II)V")
	public static void method897(@OriginalArg(0) Class54_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static47.aClass3_Sub11_3 == null) {
			Static93.method1748(255, null, 0, 255, (byte) 0, true);
			Static66.aClass54_Sub1Array1[arg1] = arg0;
		} else {
			Static47.aClass3_Sub11_3.anInt2060 = arg1 * 4 + 5;
			@Pc(16) int local16 = Static47.aClass3_Sub11_3.method1444();
			arg0.method1626(local16);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIZ)Lclient!hb;")
	public static Class27 method898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 < -9) {
			return Static79.aClass27_407;
		} else if (local13 < -6) {
			return Static105.aClass27_1328;
		} else if (local13 < -3) {
			return Static47.aClass27_625;
		} else if (local13 < 0) {
			return Static66.aClass27_833;
		} else if (local13 > 9) {
			return Static92.aClass27_1211;
		} else if (local13 > 6) {
			return Static106.aClass27_421;
		} else if (local13 > 3) {
			return Static13.aClass27_378;
		} else if (local13 > 0) {
			return Static81.aClass27_1044;
		} else {
			return Static85.aClass27_1086;
		}
	}
}

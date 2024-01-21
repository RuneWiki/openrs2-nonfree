import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!ja;")
	public static Class31 aClass31_4 = new Class31(4096);

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
	public static int anInt1836 = 0;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!kc;")
	public static Class36 aClass36_887 = Static14.method2017("Texturen geladen)3");

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!kc;")
	public static Class36 aClass36_888 = Static14.method2017("Hierhin gehen");

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "Lclient!kc;")
	public static Class36 aClass36_889 = Static14.method2017("Ignorieren");

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "Lclient!kc;")
	public static Class36 aClass36_890 = null;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "Lclient!kc;")
	public static Class36 aClass36_891 = Static14.method2017("Mitteilung");

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "Lclient!kc;")
	private static Class36 aClass36_895 = Static14.method2017("Login server offline)3");

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "Lclient!kc;")
	public static Class36 aClass36_892 = aClass36_895;

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "Lclient!kc;")
	public static Class36 aClass36_893 = Static14.method2017("backvmid2");

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
	public static int anInt1839 = 0;

	@OriginalMember(owner = "client!ob", name = "I", descriptor = "Lclient!kc;")
	public static Class36 aClass36_894 = Static14.method2017("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
	public static int anInt1843 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method1290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static33.method328(arg0)) {
			Static27.method569(arg1, 0, arg6, arg5, 0, Static42.aClass2_Sub1_Sub6ArrayArray1[arg0], arg2, -1, arg4, arg3, arg7);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZ)Lclient!kc;")
	public static Class36 method1291(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(17) int local17 = arg0 / 10;
		@Pc(19) int local19 = 1;
		while (local17 != 0) {
			local19++;
			local17 /= 10;
		}
		@Pc(33) int local33 = local19;
		if (arg0 < 0 || arg1) {
			local33 = local19 + 1;
		}
		@Pc(44) byte[] local44 = new byte[local33];
		if (arg0 < 0) {
			local44[0] = 45;
		} else if (arg1) {
			local44[0] = 43;
		}
		for (@Pc(60) int local60 = 0; local60 < local19; local60++) {
			@Pc(66) int local66 = arg0 % 10;
			if (local66 < 0) {
				local66 = -local66;
			}
			arg0 /= 10;
			if (local66 > 9) {
				local66 += 39;
			}
			local44[local33 - local60 - 1] = (byte) (local66 + 48);
		}
		@Pc(104) Class36 local104 = new Class36();
		local104.anInt1442 = local33;
		local104.aByteArray9 = local44;
		return local104;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)Lclient!kc;")
	public static Class36 method1294(@OriginalArg(0) int arg0) {
		return Static49.method949(new Class36[] { Static57.method1055(arg0 >> 24 & 0xFF), Static89.aClass36_1087, Static57.method1055(arg0 >> 16 & 0xFF), Static89.aClass36_1087, Static57.method1055(arg0 >> 8 & 0xFF), Static89.aClass36_1087, Static57.method1055(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
	public static void method1296() {
		try {
			@Pc(7) Graphics local7 = Static107.aCanvas1.getGraphics();
			Static19.aClass14_38.method1470(4, local7, 4);
		} catch (@Pc(15) Exception local15) {
			Static107.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)V")
	public static void method1299(@OriginalArg(1) int arg0) {
		Static8.method180();
		@Pc(12) int local12 = Static36.method733(arg0).anInt2564;
		if (local12 == 0) {
			return;
		}
		@Pc(27) int local27 = Static4.anIntArray14[arg0];
		if (local12 == 1) {
			if (local27 == 1) {
				Static87.method1602(0.9D);
				((Class62) Static87.anInterface3_1).method1818(0.9D);
			}
			if (local27 == 2) {
				Static87.method1602(0.8D);
				((Class62) Static87.anInterface3_1).method1818(0.8D);
			}
			if (local27 == 3) {
				Static87.method1602(0.7D);
				((Class62) Static87.anInterface3_1).method1818(0.7D);
			}
			if (local27 == 4) {
				Static87.method1602(0.6D);
				((Class62) Static87.anInterface3_1).method1818(0.6D);
			}
			Static26.method539();
			Static108.aBoolean131 = true;
		}
		if (local12 == 3) {
			@Pc(89) short local89 = 0;
			if (local27 == 0) {
				local89 = 255;
			}
			if (local27 == 1) {
				local89 = 192;
			}
			if (local27 == 2) {
				local89 = 128;
			}
			if (local27 == 3) {
				local89 = 64;
			}
			if (local27 == 4) {
				local89 = 0;
			}
			if (local89 != Static78.anInt2039) {
				if (Static78.anInt2039 == 0 && Static22.anInt579 != -1) {
					Static113.method2046(Static111.aClass3_Sub1_14, Static22.anInt579, 0, local89);
					Static118.anInt3000 = 0;
				} else if (local89 == 0) {
					Static113.method2038();
					Static118.anInt3000 = 0;
				} else {
					Static43.method830(local89);
				}
				Static78.anInt2039 = local89;
			}
		}
		if (local12 == 6) {
			Static82.anInt2067 = local27;
		}
		if (local12 == 9) {
			Static100.anInt2623 = local27;
		}
		if (local12 == 10) {
			if (local27 == 0) {
				Static42.anInt1116 = 127;
			}
			if (local27 == 1) {
				Static42.anInt1116 = 96;
			}
			if (local27 == 2) {
				Static42.anInt1116 = 64;
			}
			if (local27 == 3) {
				Static42.anInt1116 = 32;
			}
			if (local27 == 4) {
				Static42.anInt1116 = 0;
			}
		}
		if (local12 == 8) {
			Static115.aBoolean77 = true;
			Static40.anInt2199 = local27;
		}
		if (local12 == 5) {
			Static100.anInt2614 = local27;
		}
		if (local12 != 4) {
			return;
		}
		if (local27 == 0) {
			Static51.anInt2599 = 127;
		}
		if (local27 == 1) {
			Static51.anInt2599 = 96;
		}
		if (local27 == 2) {
			Static51.anInt2599 = 64;
		}
		if (local27 == 3) {
			Static51.anInt2599 = 32;
		}
		if (local27 == 4) {
			Static51.anInt2599 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	public static void method1301() {
		aClass36_890 = null;
		aClass36_895 = null;
		aClass36_888 = null;
		aClass36_893 = null;
		aClass31_4 = null;
		aClass36_894 = null;
		aClass36_891 = null;
		aClass36_887 = null;
		aClass36_892 = null;
		aClass36_889 = null;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
	public static void method1302() {
		if (Static80.aClass51_4 != null) {
			Static80.aClass51_4.method1483();
		}
	}
}

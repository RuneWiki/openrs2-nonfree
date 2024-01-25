import java.applet.Applet;
import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!kba", name = "j", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
	public static int anInt4925;

	@OriginalMember(owner = "client!kba", name = "n", descriptor = "I")
	public static int anInt4926;

	@OriginalMember(owner = "client!kba", name = "o", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "Lclient!ra;")
	public static final Class280 aClass280_6 = new Class280();

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
	public static int anInt4924 = 0;

	@OriginalMember(owner = "client!kba", name = "l", descriptor = "[I")
	public static final int[] anIntArray371 = new int[13];

	@OriginalMember(owner = "client!kba", name = "m", descriptor = "[I")
	public static final int[] anIntArray372 = new int[2048];

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZB)V")
	public static void method4258(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static468.anInt8036 != -1) {
				Static438.method6243(Static468.anInt8036);
			}
			for (@Pc(15) Class6_Sub11 local15 = (Class6_Sub11) Static224.aClass128_23.method3265(); local15 != null; local15 = (Class6_Sub11) Static224.aClass128_23.method3273()) {
				if (!local15.method7803()) {
					local15 = (Class6_Sub11) Static224.aClass128_23.method3265();
					if (local15 == null) {
						break;
					}
				}
				Static145.method2815(false, true, local15);
			}
			Static468.anInt8036 = -1;
			Static224.aClass128_23 = new Class128(8);
			Static163.method2979();
			Static468.anInt8036 = Static112.anInt2175;
			Static396.method7542(false);
			Static415.method7746();
			Static446.method6318(Static468.anInt8036);
		}
		Static301.aBoolean392 = true;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4259(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class6_Sub41 local7 = null;
		for (@Pc(12) Class6_Sub41 local12 = (Class6_Sub41) Static413.aClass361_53.method7838(); local12 != null; local12 = (Class6_Sub41) Static413.aClass361_53.method7845()) {
			if (arg4 == local12.anInt8202 && local12.anInt8201 == arg6 && arg5 == local12.anInt8205 && local12.anInt8210 == arg0) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class6_Sub41();
			local7.anInt8202 = arg4;
			local7.anInt8201 = arg6;
			local7.anInt8205 = arg5;
			local7.anInt8210 = arg0;
			if (arg6 >= 0 && arg5 >= 0 && arg6 < Static473.anInt8075 && Static165.anInt6749 > arg5) {
				Static306.method4839(local7);
			}
			Static413.aClass361_53.method7833(local7);
		}
		local7.anInt8211 = 0;
		local7.anInt8207 = arg2;
		local7.anInt8200 = arg1;
		local7.anInt8199 = arg3;
		local7.anInt8203 = -1;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!pp;B)V")
	public static void method4260(@OriginalArg(0) Class4_Sub1_Sub1_Sub2 arg0) {
		@Pc(19) Class6_Sub16 local19 = (Class6_Sub16) Static156.aClass128_12.method3263((long) arg0.anInt7126);
		if (local19 == null) {
			Static588.method1990(null, arg0.anIntArray521[0], null, arg0.aByte108, arg0, arg0.anIntArray522[0], 0);
		} else {
			local19.method2013();
		}
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V")
	public static void method4262() {
		if (Static333.aClass178Array1 == null) {
			Static333.aClass178Array1 = Static262.method4395();
			Static164.aClass178_1 = Static333.aClass178Array1[0];
			Static152.aLong215 = Static8.method201();
		}
		if (Static509.aClass236_6 == null) {
			Static168.method3167();
		}
		@Pc(25) Class178 local25 = Static164.aClass178_1;
		@Pc(35) int local35 = Static355.method6094();
		if (local25 == Static164.aClass178_1) {
			Static37.aString22 = Static164.aClass178_1.aClass156_62.method4065(Static25.anInt769);
			if (Static164.aClass178_1.aBoolean361) {
				Static254.anInt8571 = Static164.aClass178_1.anInt5101 + local35 * (Static164.aClass178_1.anInt5104 - Static164.aClass178_1.anInt5101) / 100;
			}
			if (Static164.aClass178_1.aBoolean362) {
				Static37.aString22 = Static37.aString22 + Static254.anInt8571 + "%";
			}
		} else if (Static164.aClass178_1 == Static262.aClass178_23) {
			Static509.aClass236_6 = null;
			Static449.method6350(3);
		} else {
			Static37.aString22 = local25.aClass156_63.method4065(Static25.anInt769);
			Static254.anInt8571 = local25.anInt5104;
			if (Static164.aClass178_1.aBoolean362) {
				Static37.aString22 = Static37.aString22 + local25.anInt5104 + "%";
			}
			if (Static164.aClass178_1.aBoolean361 || local25.aBoolean361) {
				Static152.aLong215 = Static8.method201();
			}
		}
		if (Static509.aClass236_6 == null) {
			return;
		}
		Static509.aClass236_6.method5506(Static152.aLong215, Static37.aString22, Static164.aClass178_1, Static254.anInt8571);
		if (Static294.anInterface12Array1 == null) {
			return;
		}
		for (@Pc(134) int local134 = Static107.anInt2063 + 1; local134 < Static294.anInterface12Array1.length; local134++) {
			if (Static294.anInterface12Array1[local134].method5733() >= 100 && Static107.anInt2063 == local134 - 1 && Static557.anInt9206 >= 1 && Static509.aClass236_6.method5516()) {
				try {
					Static294.anInterface12Array1[local134].method5729();
				} catch (@Pc(168) Exception local168) {
					Static294.anInterface12Array1 = null;
					return;
				}
				Static509.aClass236_6.method5507(Static294.anInterface12Array1[local134]);
				Static107.anInt2063++;
				if (Static294.anInterface12Array1.length - 1 <= Static107.anInt2063 && Static294.anInterface12Array1.length > 1) {
					Static107.anInt2063 = Static391.aClass21_1.method856() ? 0 : -1;
				}
			}
		}
		return;
	}
}

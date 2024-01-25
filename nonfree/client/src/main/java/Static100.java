import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
	public static int anInt2069;

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_47 = new Class205(24, -1);

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_32 = new Class32("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
	public static int anInt2067 = 0;

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_34 = new Class11(72, -1);

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_33 = new Class32("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
	public static int anInt2068 = 0;

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "[I")
	public static final int[] anIntArray438 = new int[5];

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
	public static void method1945() {
		if (Static349.anInt4698 == 0) {
			return;
		}
		try {
			if (++anInt2067 > 2000) {
				if (Static88.aClass221_1 != null) {
					Static88.aClass221_1.method4801();
					Static88.aClass221_1 = null;
				}
				if (Static93.anInt1906 >= 1) {
					Static106.anInt2303 = -5;
					Static349.anInt4698 = 0;
					return;
				}
				if (Static167.anInt5329 == Static255.anInt4505) {
					Static167.anInt5329 = Static41.anInt831;
				} else {
					Static167.anInt5329 = Static255.anInt4505;
				}
				Static93.anInt1906++;
				Static349.anInt4698 = 1;
				anInt2067 = 0;
			}
			if (Static349.anInt4698 == 1) {
				Static35.aClass182_1 = Static359.aClass111_5.method2798(Static167.anInt5329, Static61.aString15);
				Static349.anInt4698 = 2;
			}
			@Pc(112) int local112;
			if (Static349.anInt4698 == 2) {
				if (Static35.aClass182_1.anInt4498 == 2) {
					throw new IOException();
				}
				if (Static35.aClass182_1.anInt4498 != 1) {
					return;
				}
				Static88.aClass221_1 = new Class221((Socket) Static35.aClass182_1.anObject6, Static359.aClass111_5);
				Static35.aClass182_1 = null;
				Static88.aClass221_1.method4796(Static372.aClass2_Sub16_Sub2_4.aByteArray112, Static372.aClass2_Sub16_Sub2_4.anInt6145);
				if (Static269.aClass85_2 != null) {
					Static269.aClass85_2.method4224();
				}
				if (Static156.aClass85_1 != null) {
					Static156.aClass85_1.method4224();
				}
				local112 = Static88.aClass221_1.method4794();
				if (Static269.aClass85_2 != null) {
					Static269.aClass85_2.method4224();
				}
				if (Static156.aClass85_1 != null) {
					Static156.aClass85_1.method4224();
				}
				if (local112 != 21) {
					Static349.anInt4698 = 0;
					Static106.anInt2303 = local112;
					Static88.aClass221_1.method4801();
					Static88.aClass221_1 = null;
					return;
				}
				Static349.anInt4698 = 3;
			}
			if (Static349.anInt4698 == 3) {
				if (Static88.aClass221_1.method4795() < 1) {
					return;
				}
				Static337.aStringArray147 = new String[Static88.aClass221_1.method4794()];
				Static349.anInt4698 = 4;
			}
			if (Static349.anInt4698 == 4 && Static88.aClass221_1.method4795() >= Static337.aStringArray147.length * 8) {
				Static218.aClass2_Sub16_Sub2_3.anInt6145 = 0;
				Static88.aClass221_1.method4800(0, Static337.aStringArray147.length * 8, Static218.aClass2_Sub16_Sub2_3.aByteArray112);
				for (local112 = 0; local112 < Static337.aStringArray147.length; local112++) {
					Static337.aStringArray147[local112] = Static292.method4422(Static218.aClass2_Sub16_Sub2_3.method5348());
				}
				Static106.anInt2303 = 21;
				Static349.anInt4698 = 0;
				Static88.aClass221_1.method4801();
				Static88.aClass221_1 = null;
			}
		} catch (@Pc(210) IOException local210) {
			if (Static88.aClass221_1 != null) {
				Static88.aClass221_1.method4801();
				Static88.aClass221_1 = null;
			}
			if (Static93.anInt1906 < 1) {
				if (Static167.anInt5329 == Static255.anInt4505) {
					Static167.anInt5329 = Static41.anInt831;
				} else {
					Static167.anInt5329 = Static255.anInt4505;
				}
				Static93.anInt1906++;
				anInt2067 = 0;
				Static349.anInt4698 = 1;
			} else {
				Static106.anInt2303 = -4;
				Static349.anInt4698 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V")
	public static void method1947() {
		Static301.aClass160_50.method3595();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!am;Lclient!ae;ILclient!kg;IILclient!oj;IBIILjava/lang/String;)V")
	public static void method1948(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class136 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class165 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) String arg10) {
		@Pc(11) int local11;
		if (Static79.anInt4624 == 4) {
			local11 = (int) Static127.aFloat41 & 0x3FFF;
		} else {
			local11 = Static190.anInt3567 + (int) Static127.aFloat41 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg1.anInt101 / 2, arg1.anInt113 / 2) + 10;
		@Pc(40) int local40 = arg4 * arg4 + arg5 * arg5;
		if (local32 * local32 < local40) {
			return;
		}
		@Pc(54) int local54 = Class177.anIntArray843[local11];
		@Pc(58) int local58 = Class177.anIntArray844[local11];
		if (Static79.anInt4624 != 4) {
			local54 = local54 * 256 / (Static30.anInt643 + 256);
			local58 = local58 * 256 / (Static30.anInt643 + 256);
		}
		@Pc(89) int local89 = arg5 * local58 + local54 * arg4 >> 15;
		@Pc(99) int local99 = local58 * arg4 - local54 * arg5 >> 15;
		@Pc(106) int local106 = arg3.method3121(null, arg10, 100);
		@Pc(114) int local114 = arg3.method3122(arg10, null);
		@Pc(120) int local120 = local89 - local106 / 2;
		if (local120 >= -arg1.anInt101 && local120 <= arg1.anInt101 && local99 >= -arg1.anInt113 && arg1.anInt113 >= local99) {
			arg0.method5047(50, null, arg9, arg8, arg1.anInt113 / 2 + arg8 - local114 - arg2 - local99, 0, arg10, arg6, 0, local106, null, 1, 0, local120 + arg7 + arg1.anInt101 / 2, arg7);
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method1949(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V")
	public static void method1950() {
		if (Static388.aBoolean471) {
			Static242.aClass18_20 = null;
			Static388.aBoolean471 = false;
			Static290.aClass18_22 = null;
		}
	}
}

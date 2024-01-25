import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_65 = new Class92(38, -1);

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "[I")
	public static final int[] anIntArray237 = new int[5];

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
	public static int anInt3724 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ss;III[Z)Z")
	public static boolean method3059(@OriginalArg(0) Class6_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static55.aClass86Array1 != Static288.aClass86Array3) {
			@Pc(11) int local11 = Static87.aClass86Array2[arg1].method6590(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class86 local18 = Static87.aClass86Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method6590(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method6586(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method6583(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBI)I")
	public static int method3060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(43) int local43 = Static19.method496(arg1 - 1, arg0 + -1) + Static19.method496(arg1 + 1, arg0 + -1) + Static19.method496(arg1 - 1, arg0 + 1) + Static19.method496(arg1 - -1, arg0 + 1);
		@Pc(79) int local79 = Static19.method496(arg1 - 1, arg0) + Static19.method496(arg1 + 1, arg0) + Static19.method496(arg1, arg0 - 1) + Static19.method496(arg1, arg0 + 1);
		@Pc(84) int local84 = Static19.method496(arg1, arg0);
		return local84 / 4 + local79 / 8 + local43 / 16;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public static void method3061() {
		Static292.aClass74_22.method1888();
		Static386.aClass74_27.method1888();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
	public static void method3063() {
		if (Static326.anInt5607 < 102) {
			Static326.anInt5607 += 6;
		}
		if (Static43.anInt1190 != 0) {
			Static161.anInt3241 -= Static43.anInt1190 * 5;
			if (Static161.anInt3241 >= Static20.anInt657) {
				Static161.anInt3241 = Static20.anInt657 - 1;
			}
			if (Static161.anInt3241 < 0) {
				Static161.anInt3241 = 0;
			}
			Static43.anInt1190 = 0;
		}
		for (@Pc(42) int local42 = 0; local42 < Static207.anInt3852; local42++) {
			@Pc(50) int local50 = Static196.aClass40Array1[local42].method2681();
			@Pc(56) char local56 = Static196.aClass40Array1[local42].method2682();
			if (local50 == 84) {
				Static451.method6579();
			} else if (Static54.aClass187_1.method4602(82) && local50 == 66) {
				if (Static221.aClipboard1 != null) {
					@Pc(77) String local77 = "";
					for (@Pc(82) int local82 = Static406.aStringArray46.length - 1; local82 >= 0; local82--) {
						if (Static406.aStringArray46[local82] != null && Static406.aStringArray46[local82].length() > 0) {
							local77 = local77 + Static406.aStringArray46[local82] + '\n';
						}
					}
					Static221.aClipboard1.setContents(new StringSelection(local77), null);
				}
			} else if (Static54.aClass187_1.method4602(82) && local50 == 67) {
				if (Static221.aClipboard1 != null) {
					@Pc(135) Transferable local135 = Static221.aClipboard1.getContents(null);
					if (local135 != null) {
						try {
							@Pc(142) String local142 = (String) local135.getTransferData(DataFlavor.stringFlavor);
							if (local142 != null) {
								@Pc(149) String[] local149 = Static142.method2449(local142, '\n');
								if (local149.length > 1) {
									for (@Pc(155) int local155 = 0; local155 < local149.length; local155++) {
										Static67.aString10 = local149[local155];
										Static451.method6579();
									}
								} else {
									Static67.aString10 = Static67.aString10 + local142;
								}
							}
						} catch (@Pc(185) Exception local185) {
						}
					}
				}
			} else if (local50 == 85 && Static9.anInt359 > 0) {
				Static67.aString10 = Static67.aString10.substring(0, Static9.anInt359 - 1) + Static67.aString10.substring(Static9.anInt359);
				Static9.anInt359--;
			} else if (local50 == 101 && Static9.anInt359 < Static67.aString10.length()) {
				Static67.aString10 = Static67.aString10.substring(0, Static9.anInt359) + Static67.aString10.substring(Static9.anInt359 + 1);
			} else if (local50 == 96 && Static9.anInt359 > 0) {
				Static9.anInt359--;
			} else if (local50 == 97 && Static9.anInt359 < Static67.aString10.length()) {
				Static9.anInt359++;
			} else if (local50 == 102) {
				Static9.anInt359 = 0;
			} else if (local50 == 103) {
				Static9.anInt359 = Static67.aString10.length();
			} else if (local50 == 104 && Static406.aStringArray46.length > Static97.anInt2208) {
				Static97.anInt2208++;
				Static350.method5230();
				Static9.anInt359 = Static67.aString10.length();
			} else if (local50 == 105 && Static97.anInt2208 > 0) {
				Static97.anInt2208--;
				Static350.method5230();
				Static9.anInt359 = Static67.aString10.length();
			} else if (Static300.method4423(local56) || local56 == ':' || local56 == ',' || local56 == ' ' || local56 == '_' || local56 == '-' || local56 == '+' || local56 == '[' || local56 == ']') {
				Static67.aString10 = Static67.aString10.substring(0, Static9.anInt359) + Static196.aClass40Array1[local42].method2682() + Static67.aString10.substring(Static9.anInt359);
				Static9.anInt359++;
			}
		}
		Static207.anInt3852 = 0;
		Static206.method3172();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)I")
	public static int method3065(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
	public static void method3066() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static412.aBooleanArray26[local7] = false;
		}
		Static47.anInt1240 = Static66.anInt1741;
		Static24.anInt790 = Static157.anInt3220;
		Static303.anInt5377 = Static260.anInt4728;
		Static405.anInt7262 = 0;
		Static429.anInt7656 = 5;
		Static332.anInt5780 = Static328.anInt5668;
		Static318.anInt5514 = Static229.anInt4187;
		Static53.anInt1471 = -1;
		Static413.anInt7423 = 0;
		Static181.anInt3578 = -1;
		Static178.anInt7772 = Static367.anInt6653;
	}
}

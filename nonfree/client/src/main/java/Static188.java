import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Lclient!qo;")
	public static final Class267 aClass267_3 = new Class267();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V")
	public static void method3614(@OriginalArg(0) int arg0) {
		Static493.anIntArray777 = new int[arg0];
		Static484.anIntArray773 = new int[arg0];
		Static429.anIntArray567 = new int[arg0];
		Static564.anIntArray823 = new int[arg0];
		Static9.anIntArray43 = new int[arg0];
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
	public static void method3615(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub4_Sub6 local8 = Static68.method1408(14, arg0);
		local8.method3828();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB)Z")
	public static boolean method3617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static499.method7468(arg0, arg1) | Static238.method4200(arg0, arg1) | Static263.method4528(arg0, arg1)) & Static235.method4124(arg1, arg0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method3618() {
		if (Static136.anInt2884 != 0) {
			Static63.anInt1505 -= Static136.anInt2884 * 5;
			if (Static211.anInt9770 <= Static63.anInt1505) {
				Static63.anInt1505 = Static211.anInt9770 - 1;
			}
			Static136.anInt2884 = 0;
			if (Static63.anInt1505 < 0) {
				Static63.anInt1505 = 0;
			}
		}
		if (Static352.anInt6780 < 102) {
			Static352.anInt6780 += 6;
		}
		for (@Pc(45) int local45 = 0; local45 < Static244.anInt4935; local45++) {
			@Pc(51) Interface13 local51 = Static353.anInterface13Array1[local45];
			@Pc(55) int local55 = local51.method7433();
			@Pc(59) char local59 = local51.method7432();
			@Pc(63) int local63 = local51.method7434();
			if (local55 == 84) {
				Static440.method6727(false);
			}
			if (local55 == 80) {
				Static440.method6727(true);
			} else if (local55 == 66 && (local63 & 0x4) != 0) {
				if (Static64.aClipboard1 != null) {
					@Pc(88) String local88 = "";
					for (@Pc(93) int local93 = Static301.aStringArray32.length - 1; local93 >= 0; local93--) {
						if (Static301.aStringArray32[local93] != null && Static301.aStringArray32[local93].length() > 0) {
							local88 = local88 + Static301.aStringArray32[local93] + '\n';
						}
					}
					Static64.aClipboard1.setContents(new StringSelection(local88), null);
				}
			} else if (local55 == 67 && (local63 & 0x4) != 0) {
				if (Static64.aClipboard1 != null) {
					@Pc(346) Transferable local346 = Static64.aClipboard1.getContents(null);
					if (local346 != null) {
						try {
							@Pc(353) String local353 = (String) local346.getTransferData(DataFlavor.stringFlavor);
							if (local353 != null) {
								@Pc(360) String[] local360 = Static288.method4721(local353, '\n');
								if (local360.length <= 1) {
									Static466.aString103 = Static466.aString103 + local353;
								} else {
									for (@Pc(379) int local379 = 0; local379 < local360.length; local379++) {
										Static466.aString103 = local360[local379];
										Static440.method6727(false);
									}
								}
							}
						} catch (@Pc(399) Exception local399) {
						}
					}
				}
			} else if (local55 == 85 && Static43.anInt1259 > 0) {
				Static466.aString103 = Static466.aString103.substring(0, Static43.anInt1259 - 1) + Static466.aString103.substring(Static43.anInt1259);
				Static43.anInt1259--;
			} else if (local55 == 101 && Static43.anInt1259 < Static466.aString103.length()) {
				Static466.aString103 = Static466.aString103.substring(0, Static43.anInt1259) + Static466.aString103.substring(Static43.anInt1259 + 1);
			} else if (local55 == 96 && Static43.anInt1259 > 0) {
				Static43.anInt1259--;
			} else if (local55 == 97 && Static43.anInt1259 < Static466.aString103.length()) {
				Static43.anInt1259++;
			} else if (local55 == 102) {
				Static43.anInt1259 = 0;
			} else if (local55 == 103) {
				Static43.anInt1259 = Static466.aString103.length();
			} else if (local55 == 104 && Static301.aStringArray32.length > Static342.anInt6342) {
				Static342.anInt6342++;
				Static438.method6670();
				Static43.anInt1259 = Static466.aString103.length();
			} else if (local55 == 105 && Static342.anInt6342 > 0) {
				Static342.anInt6342--;
				Static438.method6670();
				Static43.anInt1259 = Static466.aString103.length();
			} else if (Static21.method862(local59) || local59 == ':' || local59 == ',' || local59 == ' ' || local59 == '_' || local59 == '-' || local59 == '+' || local59 == '[' || local59 == ']') {
				Static466.aString103 = Static466.aString103.substring(0, Static43.anInt1259) + Static353.anInterface13Array1[local45].method7432() + Static466.aString103.substring(Static43.anInt1259);
				Static43.anInt1259++;
			}
		}
		Static549.anInt9381 = 0;
		Static244.anInt4935 = 0;
		Static101.method2148();
	}
}

import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public static int anInt4565;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
	public static int anInt4568 = 0;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!gw;ILjava/lang/String;)I")
	public static int method3984(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt3400;
		@Pc(10) byte[] local10 = Static124.method4369(arg1);
		arg0.method3046(local10.length);
		arg0.anInt3400 += Static434.aClass283_1.method6932(0, local10.length, arg0.anInt3400, local10, arg0.aByteArray45);
		return arg0.anInt3400 - local6;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	public static void method3985() {
		if (Static366.anInt7092 < 102) {
			Static366.anInt7092 += 6;
		}
		if (Static430.anInt7441 != 0) {
			Static57.anInt1566 -= Static430.anInt7441 * 5;
			if (Static57.anInt1566 >= Static35.anInt1296) {
				Static57.anInt1566 = Static35.anInt1296 - 1;
			}
			Static430.anInt7441 = 0;
			if (Static57.anInt1566 < 0) {
				Static57.anInt1566 = 0;
			}
		}
		for (@Pc(46) int local46 = 0; local46 < Static11.anInt130; local46++) {
			@Pc(51) Interface2 local51 = Static193.anInterface2Array2[local46];
			@Pc(55) int local55 = local51.method7099();
			@Pc(59) char local59 = local51.method7096();
			@Pc(63) int local63 = local51.method7100();
			if (local55 == 84) {
				Static102.method2276(false);
			}
			if (local55 == 80) {
				Static102.method2276(true);
			} else if (local55 == 66 && (local63 & 0x4) != 0) {
				if (Static542.aClipboard1 != null) {
					@Pc(355) String local355 = "";
					for (@Pc(360) int local360 = Static300.aStringArray26.length - 1; local360 >= 0; local360--) {
						if (Static300.aStringArray26[local360] != null && Static300.aStringArray26[local360].length() > 0) {
							local355 = local355 + Static300.aStringArray26[local360] + '\n';
						}
					}
					Static542.aClipboard1.setContents(new StringSelection(local355), null);
				}
			} else if (local55 == 67 && (local63 & 0x4) != 0) {
				if (Static542.aClipboard1 != null) {
					@Pc(103) Transferable local103 = Static542.aClipboard1.getContents(null);
					if (local103 != null) {
						try {
							@Pc(110) String local110 = (String) local103.getTransferData(DataFlavor.stringFlavor);
							if (local110 != null) {
								@Pc(117) String[] local117 = Static12.method678('\n', local110);
								if (local117.length <= 1) {
									Static457.aString65 = Static457.aString65 + local110;
								} else {
									for (@Pc(135) int local135 = 0; local135 < local117.length; local135++) {
										Static457.aString65 = local117[local135];
										Static102.method2276(false);
									}
								}
							}
						} catch (@Pc(154) Exception local154) {
						}
					}
				}
			} else if (local55 == 85 && Static488.anInt8330 > 0) {
				Static457.aString65 = Static457.aString65.substring(0, Static488.anInt8330 - 1) + Static457.aString65.substring(Static488.anInt8330);
				Static488.anInt8330--;
			} else if (local55 == 101 && Static488.anInt8330 < Static457.aString65.length()) {
				Static457.aString65 = Static457.aString65.substring(0, Static488.anInt8330) + Static457.aString65.substring(Static488.anInt8330 + 1);
			} else if (local55 == 96 && Static488.anInt8330 > 0) {
				Static488.anInt8330--;
			} else if (local55 == 97 && Static488.anInt8330 < Static457.aString65.length()) {
				Static488.anInt8330++;
			} else if (local55 == 102) {
				Static488.anInt8330 = 0;
			} else if (local55 == 103) {
				Static488.anInt8330 = Static457.aString65.length();
			} else if (local55 == 104 && Static300.aStringArray26.length > Static3.anInt53) {
				Static3.anInt53++;
				Static383.method7590();
				Static488.anInt8330 = Static457.aString65.length();
			} else if (local55 == 105 && Static3.anInt53 > 0) {
				Static3.anInt53--;
				Static383.method7590();
				Static488.anInt8330 = Static457.aString65.length();
			} else if (Static340.method5511(local59) || local59 == ':' || local59 == ',' || local59 == ' ' || local59 == '_' || local59 == '-' || local59 == '+' || local59 == '[' || local59 == ']') {
				Static457.aString65 = Static457.aString65.substring(0, Static488.anInt8330) + Static193.anInterface2Array2[local46].method7096() + Static457.aString65.substring(Static488.anInt8330);
				Static488.anInt8330++;
			}
		}
		Static11.anInt130 = 0;
		Static278.method4744();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)V")
	public static void method3986(@OriginalArg(1) int arg0) {
		Static116.anInt2817 = arg0;
		Static527.anInt8941 = 100;
		Static173.anInt3748 = 3;
		Static388.anInt6745 = -1;
	}
}

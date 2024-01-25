import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wh", name = "V", descriptor = "Lclient!o;")
	public static Class85 aClass85_25;

	@OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
	public static int anInt7187;

	@OriginalMember(owner = "client!wh", name = "U", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_117 = new Class142("K", "T", "K", "K");

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
	public static void method5816() {
		if (Static426.anInt6829 != 0) {
			Static156.anInt2547 -= Static426.anInt6829 * 5;
			if (Static156.anInt2547 >= Static180.anInt3219) {
				Static156.anInt2547 = Static180.anInt3219 - 1;
			}
			Static426.anInt6829 = 0;
			if (Static156.anInt2547 < 0) {
				Static156.anInt2547 = 0;
			}
		}
		if (Static173.anInt2851 < 102) {
			Static173.anInt2851 += 6;
		}
		for (@Pc(40) int local40 = 0; local40 < Static141.anInt6097; local40++) {
			@Pc(51) Interface13 local51 = Static340.anInterface13Array1[local40];
			@Pc(55) int local55 = local51.method4455();
			@Pc(59) char local59 = local51.method4458();
			@Pc(63) int local63 = local51.method4454();
			if (local55 == 84) {
				Static155.method2066(false);
			}
			if (local55 == 80) {
				Static155.method2066(true);
			} else if (local55 == 66 && (local63 & 0x4) != 0) {
				if (Static361.aClipboard1 != null) {
					@Pc(93) String local93 = "";
					for (@Pc(98) int local98 = Static253.aStringArray34.length - 1; local98 >= 0; local98--) {
						if (Static253.aStringArray34[local98] != null && Static253.aStringArray34[local98].length() > 0) {
							local93 = local93 + Static253.aStringArray34[local98] + '\n';
						}
					}
					Static361.aClipboard1.setContents(new StringSelection(local93), null);
				}
			} else if (local55 == 67 && (local63 & 0x4) != 0) {
				if (Static361.aClipboard1 != null) {
					@Pc(357) Transferable local357 = Static361.aClipboard1.getContents(null);
					if (local357 != null) {
						try {
							@Pc(364) String local364 = (String) local357.getTransferData(DataFlavor.stringFlavor);
							if (local364 != null) {
								@Pc(371) String[] local371 = Static354.method4612('\n', local364);
								if (local371.length <= 1) {
									Static2.aString1 = Static2.aString1 + local364;
								} else {
									for (@Pc(390) int local390 = 0; local390 < local371.length; local390++) {
										Static2.aString1 = local371[local390];
										Static155.method2066(false);
									}
								}
							}
						} catch (@Pc(410) Exception local410) {
						}
					}
				}
			} else if (local55 == 85 && Static247.anInt4420 > 0) {
				Static2.aString1 = Static2.aString1.substring(0, Static247.anInt4420 - 1) + Static2.aString1.substring(Static247.anInt4420);
				Static247.anInt4420--;
			} else if (local55 == 101 && Static247.anInt4420 < Static2.aString1.length()) {
				Static2.aString1 = Static2.aString1.substring(0, Static247.anInt4420) + Static2.aString1.substring(Static247.anInt4420 + 1);
			} else if (local55 == 96 && Static247.anInt4420 > 0) {
				Static247.anInt4420--;
			} else if (local55 == 97 && Static247.anInt4420 < Static2.aString1.length()) {
				Static247.anInt4420++;
			} else if (local55 == 102) {
				Static247.anInt4420 = 0;
			} else if (local55 == 103) {
				Static247.anInt4420 = Static2.aString1.length();
			} else if (local55 == 104 && Static253.aStringArray34.length > Static229.anInt4148) {
				Static229.anInt4148++;
				Static89.method1062();
				Static247.anInt4420 = Static2.aString1.length();
			} else if (local55 == 105 && Static229.anInt4148 > 0) {
				Static229.anInt4148--;
				Static89.method1062();
				Static247.anInt4420 = Static2.aString1.length();
			} else if (Static328.method4317(local59) || local59 == ':' || local59 == ',' || local59 == ' ' || local59 == '_' || local59 == '-' || local59 == '+' || local59 == '[' || local59 == ']') {
				Static2.aString1 = Static2.aString1.substring(0, Static247.anInt4420) + Static340.anInterface13Array1[local40].method4458() + Static2.aString1.substring(Static247.anInt4420);
				Static247.anInt4420++;
			}
		}
		Static141.anInt6097 = 0;
		Static186.method2688();
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)J")
	public static long method5817() {
		return Static78.aClass20_3.method3404();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLclient!hm;)V")
	public static void method5818(@OriginalArg(1) Class107 arg0) {
		if (!Static290.aBoolean449) {
			return;
		}
		if (arg0.anObjectArray24 != null) {
			@Pc(18) Class107 local18 = Static220.method3163(Static403.anInt6355, Static276.anInt4734);
			if (local18 != null) {
				@Pc(24) Class1_Sub11 local24 = new Class1_Sub11();
				local24.anObjectArray2 = arg0.anObjectArray24;
				local24.aClass107_2 = arg0;
				local24.aClass107_3 = local18;
				Static198.method2834(local24);
			}
		}
		Static178.method2589(Static79.aClass242_20);
		Static426.aClass1_Sub19_Sub2_2.method2912(arg0.anInt2660);
		Static426.aClass1_Sub19_Sub2_2.method2889(Static2.anInt29);
		Static426.aClass1_Sub19_Sub2_2.method2887(Static276.anInt4734);
		Static426.aClass1_Sub19_Sub2_2.method2926(arg0.anInt2643);
		Static426.aClass1_Sub19_Sub2_2.method2889(Static403.anInt6355);
		Static426.aClass1_Sub19_Sub2_2.method2930(arg0.anInt2631);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZII)Z")
	public static boolean method5819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}
}

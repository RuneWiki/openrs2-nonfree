import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
	public static int anInt8309 = 0;

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "[Lclient!mq;")
	public static final Class12_Sub2_Sub1_Sub4_Sub1[] aClass12_Sub2_Sub1_Sub4_Sub1Array1 = new Class12_Sub2_Sub1_Sub4_Sub1[2048];

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "[I")
	public static final int[] anIntArray555 = new int[2048];

	@OriginalMember(owner = "client!ts", name = "u", descriptor = "Z")
	public static final boolean aBoolean702 = false;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	public static void method6722() {
		if (Static240.anInt9590 < 102) {
			Static240.anInt9590 += 6;
		}
		@Pc(23) int local23;
		if (Static61.anInt1123 != -1 && Static362.method5133() > Static417.aLong249) {
			for (local23 = Static61.anInt1123; local23 < Static31.aStringArray5.length; local23++) {
				if (Static31.aStringArray5[local23].startsWith("pause")) {
					@Pc(33) int local33 = 5;
					try {
						local33 = Integer.parseInt(Static31.aStringArray5[local23].substring(6));
					} catch (@Pc(42) Exception local42) {
					}
					Static144.method1990("Pausing for " + local33 + " seconds...");
					Static61.anInt1123 = local23 + 1;
					Static417.aLong249 = Static362.method5133() + (long) (local33 * 1000);
					return;
				}
				Static280.aString57 = Static31.aStringArray5[local23];
				Static431.method5689(false);
			}
			Static61.anInt1123 = -1;
		}
		if (Static157.anInt2491 != 0) {
			Static533.anInt8769 -= Static157.anInt2491 * 5;
			if (Static77.anInt1385 <= Static533.anInt8769) {
				Static533.anInt8769 = Static77.anInt1385 - 1;
			}
			Static157.anInt2491 = 0;
			if (Static533.anInt8769 < 0) {
				Static533.anInt8769 = 0;
			}
		}
		for (local23 = 0; local23 < Static69.anInt5062; local23++) {
			@Pc(117) Interface24 local117 = Static344.anInterface24Array2[local23];
			@Pc(121) int local121 = local117.method7253();
			@Pc(125) char local125 = local117.method7251();
			@Pc(129) int local129 = local117.method7252();
			if (local121 == 84) {
				Static431.method5689(false);
			}
			if (local121 == 80) {
				Static431.method5689(true);
			} else if (local121 == 66 && (local129 & 0x4) != 0) {
				if (Static588.aClipboard1 != null) {
					@Pc(417) String local417 = "";
					for (@Pc(422) int local422 = Static311.aStringArray28.length - 1; local422 >= 0; local422--) {
						if (Static311.aStringArray28[local422] != null && Static311.aStringArray28[local422].length() > 0) {
							local417 = local417 + Static311.aStringArray28[local422] + '\n';
						}
					}
					Static588.aClipboard1.setContents(new StringSelection(local417), null);
				}
			} else if (local121 == 67 && (local129 & 0x4) != 0) {
				if (Static588.aClipboard1 != null) {
					@Pc(390) Transferable local390 = Static588.aClipboard1.getContents(null);
					if (local390 != null) {
						try {
							@Pc(397) String local397 = (String) local390.getTransferData(DataFlavor.stringFlavor);
							if (local397 != null) {
								@Pc(406) String[] local406 = Static439.method5762(local397, '\n');
								Static443.method5796(local406);
							}
						} catch (@Pc(411) Exception local411) {
						}
					}
				}
			} else if (local121 == 85 && Static27.anInt452 > 0) {
				Static280.aString57 = Static280.aString57.substring(0, Static27.anInt452 - 1) + Static280.aString57.substring(Static27.anInt452);
				Static27.anInt452--;
			} else if (local121 == 101 && Static27.anInt452 < Static280.aString57.length()) {
				Static280.aString57 = Static280.aString57.substring(0, Static27.anInt452) + Static280.aString57.substring(Static27.anInt452 + 1);
			} else if (local121 == 96 && Static27.anInt452 > 0) {
				Static27.anInt452--;
			} else if (local121 == 97 && Static27.anInt452 < Static280.aString57.length()) {
				Static27.anInt452++;
			} else if (local121 == 102) {
				Static27.anInt452 = 0;
			} else if (local121 == 103) {
				Static27.anInt452 = Static280.aString57.length();
			} else if (local121 == 104 && Static306.anInt5072 < Static311.aStringArray28.length) {
				Static306.anInt5072++;
				Static549.method7177();
				Static27.anInt452 = Static280.aString57.length();
			} else if (local121 == 105 && Static306.anInt5072 > 0) {
				Static306.anInt5072--;
				Static549.method7177();
				Static27.anInt452 = Static280.aString57.length();
			} else if (Static581.method7526(local125) || local125 == '\' || local125 == '/' || local125 == '.' || local125 == ':' || local125 == ',' || local125 == ' ' || local125 == '_' || local125 == '-' || local125 == '+' || local125 == '[' || local125 == ']') {
				Static280.aString57 = Static280.aString57.substring(0, Static27.anInt452) + Static344.anInterface24Array2[local23].method7251() + Static280.aString57.substring(Static27.anInt452);
				Static27.anInt452++;
			}
		}
		Static69.anInt5062 = 0;
		Static136.anInt2219 = 0;
		Static549.method7175();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method6723(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static225.anInt3293; local19++) {
			if (arg0.equalsIgnoreCase(Static78.aStringArray9[local19])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static493.aStringArray36[local19])) {
				return true;
			}
		}
		return false;
	}
}

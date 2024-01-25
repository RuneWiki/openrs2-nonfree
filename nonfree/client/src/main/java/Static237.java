import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
	public static int anInt5148;

	@OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
	public static int anInt5154 = -1;

	@OriginalMember(owner = "client!iea", name = "n", descriptor = "Z")
	public static boolean aBoolean378 = false;

	@OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
	public static int anInt5159 = 100;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(BI)Lclient!sh;")
	public static Class313 method4454(@OriginalArg(1) int arg0) {
		@Pc(15) Class313[] local15 = Static323.method5593();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class313 local23 = local15[local17];
			if (arg0 == local23.anInt9428) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V")
	public static void method4456() {
		for (@Pc(10) Class2_Sub37 local10 = (Class2_Sub37) Static270.aClass341_41.method8524(); local10 != null; local10 = (Class2_Sub37) Static270.aClass341_41.method8519()) {
			if (local10.anInt6984 > 0) {
				local10.anInt6984--;
			}
			if (local10.anInt6984 != 0) {
				if (local10.anInt6985 > 0) {
					local10.anInt6985--;
				}
				if (local10.anInt6985 == 0 && local10.anInt6994 >= 1 && local10.anInt6987 >= 1 && local10.anInt6994 <= Static47.anInt1794 - 2 && local10.anInt6987 <= Static209.anInt4742 - 2 && (local10.anInt6996 < 0 || Static327.method5623(local10.anInt6986, local10.anInt6996))) {
					Static501.method7740(local10.anInt6994, local10.anInt6993, -1, local10.anInt6996, local10.anInt6986, local10.anInt6987, local10.anInt6989, local10.anInt6988);
					local10.anInt6985 = -1;
					if (local10.anInt6996 == local10.anInt6991 && local10.anInt6991 == -1) {
						local10.method9253();
					} else if (local10.anInt6991 == local10.anInt6996 && local10.anInt6989 == local10.anInt6983 && local10.anInt6986 == local10.anInt6992) {
						local10.method9253();
					}
				}
			} else if (local10.anInt6991 < 0 || Static327.method5623(local10.anInt6992, local10.anInt6991)) {
				Static501.method7740(local10.anInt6994, local10.anInt6993, -1, local10.anInt6991, local10.anInt6992, local10.anInt6987, local10.anInt6983, local10.anInt6988);
				local10.method9253();
			}
		}
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)V")
	public static void method4457() {
		if (Static50.anInt1859 < 102) {
			Static50.anInt1859 += 6;
		}
		@Pc(27) int local27;
		if (Static369.anInt7335 != -1 && Static277.method5091() > Static108.aLong69) {
			for (local27 = Static369.anInt7335; local27 < Static172.aStringArray17.length; local27++) {
				if (Static172.aStringArray17[local27].startsWith("pause")) {
					@Pc(46) int local46 = 5;
					try {
						local46 = Integer.parseInt(Static172.aStringArray17[local27].substring(6));
					} catch (@Pc(55) Exception local55) {
					}
					Static300.method2224("Pausing for " + local46 + " seconds...");
					Static369.anInt7335 = local27 + 1;
					Static108.aLong69 = (long) (local46 * 1000) + Static277.method5091();
					return;
				}
				Static152.aString36 = Static172.aStringArray17[local27];
				Static487.method7986(false);
			}
			Static369.anInt7335 = -1;
		}
		if (Static341.anInt6870 != 0) {
			Static602.anInt10571 -= Static341.anInt6870 * 5;
			if (Static410.anInt7746 <= Static602.anInt10571) {
				Static602.anInt10571 = Static410.anInt7746 - 1;
			}
			Static341.anInt6870 = 0;
			if (Static602.anInt10571 < 0) {
				Static602.anInt10571 = 0;
			}
		}
		for (local27 = 0; local27 < Static266.anInt5672; local27++) {
			@Pc(129) Interface16 local129 = Static332.anInterface16Array1[local27];
			@Pc(133) int local133 = local129.method4435();
			@Pc(137) char local137 = local129.method4433();
			@Pc(141) int local141 = local129.method4431();
			if (local133 == 84) {
				Static487.method7986(false);
			}
			if (local133 == 80) {
				Static487.method7986(true);
			} else if (local133 == 66 && (local141 & 0x4) != 0) {
				if (Static574.aClipboard1 != null) {
					@Pc(165) String local165 = "";
					for (@Pc(170) int local170 = Static19.aStringArray1.length - 1; local170 >= 0; local170--) {
						if (Static19.aStringArray1[local170] != null && Static19.aStringArray1[local170].length() > 0) {
							local165 = local165 + Static19.aStringArray1[local170] + '\n';
						}
					}
					Static574.aClipboard1.setContents(new StringSelection(local165), null);
				}
			} else if (local133 == 67 && (local141 & 0x4) != 0) {
				if (Static574.aClipboard1 != null) {
					@Pc(439) Transferable local439 = Static574.aClipboard1.getContents(null);
					if (local439 != null) {
						try {
							@Pc(446) String local446 = (String) local439.getTransferData(DataFlavor.stringFlavor);
							if (local446 != null) {
								@Pc(453) String[] local453 = Static62.method1946('\n', local446);
								Static374.method6269(local453);
							}
						} catch (@Pc(458) Exception local458) {
						}
					}
				}
			} else if (local133 == 85 && Static511.anInt9363 > 0) {
				Static152.aString36 = Static152.aString36.substring(0, Static511.anInt9363 - 1) + Static152.aString36.substring(Static511.anInt9363);
				Static511.anInt9363--;
			} else if (local133 == 101 && Static511.anInt9363 < Static152.aString36.length()) {
				Static152.aString36 = Static152.aString36.substring(0, Static511.anInt9363) + Static152.aString36.substring(Static511.anInt9363 + 1);
			} else if (local133 == 96 && Static511.anInt9363 > 0) {
				Static511.anInt9363--;
			} else if (local133 == 97 && Static511.anInt9363 < Static152.aString36.length()) {
				Static511.anInt9363++;
			} else if (local133 == 102) {
				Static511.anInt9363 = 0;
			} else if (local133 == 103) {
				Static511.anInt9363 = Static152.aString36.length();
			} else if (local133 == 104 && Static568.anInt10191 < Static19.aStringArray1.length) {
				Static568.anInt10191++;
				Static1.method6136();
				Static511.anInt9363 = Static152.aString36.length();
			} else if (local133 == 105 && Static568.anInt10191 > 0) {
				Static568.anInt10191--;
				Static1.method6136();
				Static511.anInt9363 = Static152.aString36.length();
			} else if (Static149.method3404(local137) || local137 == '\\' || local137 == '/' || local137 == '.' || local137 == ':' || local137 == ',' || local137 == ' ' || local137 == '_' || local137 == '-' || local137 == '+' || local137 == '[' || local137 == ']') {
				Static152.aString36 = Static152.aString36.substring(0, Static511.anInt9363) + Static332.anInterface16Array1[local27].method4433() + Static152.aString36.substring(Static511.anInt9363);
				Static511.anInt9363++;
			}
		}
		Static266.anInt5672 = 0;
		Static558.anInt9991 = 0;
		Static132.method3031();
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!ga;[Lclient!ab;)V")
	public static void method4459(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class2_Sub1[] arg1) {
		@Pc(6) int local6;
		if (Static286.aBoolean451) {
			local6 = arg0.method8608(arg1);
			Static194.aClass20_5.method7245(local6, arg1);
		}
		if (Static103.aClass65Array3 == Static9.aClass65Array1) {
			@Pc(28) int local28;
			if (arg0 instanceof Class3_Sub1_Sub3) {
				local6 = ((Class3_Sub1_Sub3) arg0).aShort118;
				local28 = ((Class3_Sub1_Sub3) arg0).aShort120;
			} else {
				local6 = arg0.anInt10303 >> Static151.anInt3896;
				local28 = arg0.anInt10310 >> Static151.anInt3896;
			}
			Static194.aClass20_5.EA(Static40.aClass65Array2[0].method7999(arg0.anInt10303, arg0.anInt10310), Static299.method5336(local6, local28), Static578.method6998(local6, local28), Static478.method7485(local6, local28));
		}
		@Pc(64) Class3_Sub4 local64 = arg0.method8610(Static194.aClass20_5);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean706) {
			@Pc(72) Class3_Sub3[] local72 = local64.aClass3_Sub3Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class3_Sub3 local79 = local72[local74];
				if (local79.aBoolean411) {
					Static113.method2842(local79.anInt5420 - local79.anInt5418, local79.anInt5421 + local79.anInt5418, local79.anInt5417 - local79.anInt5418, local79.anInt5419 + local79.anInt5418);
				}
			}
		}
		if (local64.aBoolean419) {
			local64.aClass3_Sub1_15 = arg0;
			if (Static218.aBoolean365) {
				@Pc(119) Class182 local119 = Static292.aClass182_1;
				synchronized (Static292.aClass182_1) {
					Static292.aClass182_1.method5401(local64);
					return;
				}
			}
			Static292.aClass182_1.method5401(local64);
			return;
		}
		Static211.method4175(local64);
	}
}

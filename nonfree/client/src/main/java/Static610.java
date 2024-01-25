import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "Lclient!kr;")
	public static Class20 aClass20_35;

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "Lclient!sp;")
	public static Class310 aClass310_2;

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!kg;")
	public static final Class188 aClass188_9 = new Class188("", 10);

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "Lclient!jw;")
	public static final Class184 aClass184_12 = new Class184(9, 2);

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(I)V")
	public static void method8342() {
		if (Static436.anInt7762 < 102) {
			Static436.anInt7762 += 6;
		}
		@Pc(29) int local29;
		if (Static366.anInt6577 != -1 && Static438.method6517() > Static505.aLong234) {
			for (local29 = Static366.anInt6577; local29 < Static7.aStringArray2.length; local29++) {
				if (Static7.aStringArray2[local29].startsWith("pause")) {
					@Pc(48) int local48 = 5;
					try {
						local48 = Integer.parseInt(Static7.aStringArray2[local29].substring(6));
					} catch (@Pc(57) Exception local57) {
					}
					Static576.method8008("Pausing for " + local48 + " seconds...");
					Static366.anInt6577 = local29 + 1;
					Static505.aLong234 = Static438.method6517() + (long) (local48 * 1000);
					return;
				}
				Static216.aString49 = Static7.aStringArray2[local29];
				Static66.method1256(false);
			}
			Static366.anInt6577 = -1;
		}
		if (Static597.anInt9839 != 0) {
			Static195.anInt9449 -= Static597.anInt9839 * 5;
			if (Static195.anInt9449 >= Static534.anInt8920) {
				Static195.anInt9449 = Static534.anInt8920 - 1;
			}
			if (Static195.anInt9449 < 0) {
				Static195.anInt9449 = 0;
			}
			Static597.anInt9839 = 0;
		}
		for (local29 = 0; local29 < Static470.anInt8064; local29++) {
			@Pc(123) Interface16 local123 = Static15.anInterface16Array1[local29];
			@Pc(127) int local127 = local123.method4735();
			@Pc(131) char local131 = local123.method4737();
			@Pc(135) int local135 = local123.method4739();
			if (local127 == 84) {
				Static66.method1256(false);
			}
			if (local127 == 80) {
				Static66.method1256(true);
			} else if (local127 == 66 && (local135 & 0x4) != 0) {
				if (Static199.aClipboard1 != null) {
					@Pc(160) String local160 = "";
					for (@Pc(165) int local165 = Static177.aStringArray9.length - 1; local165 >= 0; local165--) {
						if (Static177.aStringArray9[local165] != null && Static177.aStringArray9[local165].length() > 0) {
							local160 = local160 + Static177.aStringArray9[local165] + '\n';
						}
					}
					Static199.aClipboard1.setContents(new StringSelection(local160), null);
				}
			} else if (local127 == 67 && (local135 & 0x4) != 0) {
				if (Static199.aClipboard1 != null) {
					@Pc(435) Transferable local435 = Static199.aClipboard1.getContents(null);
					if (local435 != null) {
						try {
							@Pc(442) String local442 = (String) local435.getTransferData(DataFlavor.stringFlavor);
							if (local442 != null) {
								@Pc(449) String[] local449 = Static218.method3754('\n', local442);
								Static429.method6434(local449);
							}
						} catch (@Pc(454) Exception local454) {
						}
					}
				}
			} else if (local127 == 85 && Static209.anInt4374 > 0) {
				Static216.aString49 = Static216.aString49.substring(0, Static209.anInt4374 - 1) + Static216.aString49.substring(Static209.anInt4374);
				Static209.anInt4374--;
			} else if (local127 == 101 && Static209.anInt4374 < Static216.aString49.length()) {
				Static216.aString49 = Static216.aString49.substring(0, Static209.anInt4374) + Static216.aString49.substring(Static209.anInt4374 + 1);
			} else if (local127 == 96 && Static209.anInt4374 > 0) {
				Static209.anInt4374--;
			} else if (local127 == 97 && Static209.anInt4374 < Static216.aString49.length()) {
				Static209.anInt4374++;
			} else if (local127 == 102) {
				Static209.anInt4374 = 0;
			} else if (local127 == 103) {
				Static209.anInt4374 = Static216.aString49.length();
			} else if (local127 == 104 && Static50.anInt1090 < Static177.aStringArray9.length) {
				Static50.anInt1090++;
				Static608.method2877();
				Static209.anInt4374 = Static216.aString49.length();
			} else if (local127 == 105 && Static50.anInt1090 > 0) {
				Static50.anInt1090--;
				Static608.method2877();
				Static209.anInt4374 = Static216.aString49.length();
			} else if (Static371.method5587(local131) || local131 == '\' || local131 == '/' || local131 == '.' || local131 == ':' || local131 == ',' || local131 == ' ' || local131 == '_' || local131 == '-' || local131 == '+' || local131 == '[' || local131 == ']') {
				Static216.aString49 = Static216.aString49.substring(0, Static209.anInt4374) + Static15.anInterface16Array1[local29].method4737() + Static216.aString49.substring(Static209.anInt4374);
				Static209.anInt4374++;
			}
		}
		Static470.anInt8064 = 0;
		Static542.anInt9036 = 0;
		Static539.method7534();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/util/Random;IB)I")
	public static int method8343(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static504.method7825(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local45 >= local42);
			return Static438.method6516(local45, arg1);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIII)Lclient!sfa;")
	public static Class22 method8345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg3 * 76724863L ^ (long) arg4 * 32147369L ^ (long) arg1 * 986053L ^ (long) arg5 * 475427L ^ (long) arg2 * 97549L ^ (long) arg0 * 67481L;
		@Pc(44) Class22 local44 = (Class22) Static439.aClass233_37.method5669(local38);
		if (local44 == null) {
			local44 = Static555.aClass87_14.method7948(arg0, arg2, arg5, arg1, arg4, arg3);
			Static439.aClass233_37.method5662(local44, local38);
			return local44;
		} else {
			return local44;
		}
	}
}

import java.awt.Canvas;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!mg;")
	public static Class191 aClass191_1;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Lclient!bn;")
	public static final Class31 aClass31_1 = new Class31(10, 2, 2, 0);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)I")
	public static int method232() {
		return Static301.anInt5567;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
	public static void method233() {
		if (Static168.anInt5448 != 0) {
			Static469.anInt9081 -= Static168.anInt5448 * 5;
			if (Static469.anInt9081 >= Static158.anInt2904) {
				Static469.anInt9081 = Static158.anInt2904 - 1;
			}
			if (Static469.anInt9081 < 0) {
				Static469.anInt9081 = 0;
			}
			Static168.anInt5448 = 0;
		}
		if (Static241.anInt4829 < 102) {
			Static241.anInt4829 += 6;
		}
		for (@Pc(38) int local38 = 0; local38 < Static240.anInt4803; local38++) {
			@Pc(44) Interface12 local44 = Static176.anInterface12Array1[local38];
			@Pc(48) int local48 = local44.method7437();
			@Pc(52) char local52 = local44.method7436();
			@Pc(56) int local56 = local44.method7435();
			if (local48 == 84) {
				Static462.method6521(false);
			}
			if (local48 == 80) {
				Static462.method6521(true);
			} else if (local48 == 66 && (local56 & 0x4) != 0) {
				if (Static129.aClipboard1 != null) {
					@Pc(357) String local357 = "";
					for (@Pc(362) int local362 = Static200.aStringArray19.length - 1; local362 >= 0; local362--) {
						if (Static200.aStringArray19[local362] != null && Static200.aStringArray19[local362].length() > 0) {
							local357 = local357 + Static200.aStringArray19[local362] + '\n';
						}
					}
					Static129.aClipboard1.setContents(new StringSelection(local357), null);
				}
			} else if (local48 == 67 && (local56 & 0x4) != 0) {
				if (Static129.aClipboard1 != null) {
					@Pc(300) Transferable local300 = Static129.aClipboard1.getContents(null);
					if (local300 != null) {
						try {
							@Pc(307) String local307 = (String) local300.getTransferData(DataFlavor.stringFlavor);
							if (local307 != null) {
								@Pc(314) String[] local314 = Static254.method4297('\n', local307);
								if (local314.length > 1) {
									for (@Pc(320) int local320 = 0; local320 < local314.length; local320++) {
										Static69.aString12 = local314[local320];
										Static462.method6521(false);
									}
								} else {
									Static69.aString12 = Static69.aString12 + local307;
								}
							}
						} catch (@Pc(351) Exception local351) {
						}
					}
				}
			} else if (local48 == 85 && Static132.anInt2616 > 0) {
				Static69.aString12 = Static69.aString12.substring(0, Static132.anInt2616 - 1) + Static69.aString12.substring(Static132.anInt2616);
				Static132.anInt2616--;
			} else if (local48 == 101 && Static132.anInt2616 < Static69.aString12.length()) {
				Static69.aString12 = Static69.aString12.substring(0, Static132.anInt2616) + Static69.aString12.substring(Static132.anInt2616 + 1);
			} else if (local48 == 96 && Static132.anInt2616 > 0) {
				Static132.anInt2616--;
			} else if (local48 == 97 && Static132.anInt2616 < Static69.aString12.length()) {
				Static132.anInt2616++;
			} else if (local48 == 102) {
				Static132.anInt2616 = 0;
			} else if (local48 == 103) {
				Static132.anInt2616 = Static69.aString12.length();
			} else if (local48 == 104 && Static200.aStringArray19.length > Static25.anInt547) {
				Static25.anInt547++;
				Static120.method2017();
				Static132.anInt2616 = Static69.aString12.length();
			} else if (local48 == 105 && Static25.anInt547 > 0) {
				Static25.anInt547--;
				Static120.method2017();
				Static132.anInt2616 = Static69.aString12.length();
			} else if (Static535.method7413(local52) || local52 == ':' || local52 == ',' || local52 == ' ' || local52 == '_' || local52 == '-' || local52 == '+' || local52 == '[' || local52 == ']') {
				Static69.aString12 = Static69.aString12.substring(0, Static132.anInt2616) + Static176.anInterface12Array1[local38].method7436() + Static69.aString12.substring(Static132.anInt2616);
				Static132.anInt2616++;
			}
		}
		Static240.anInt4803 = 0;
		Static299.method4748();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!jq;IILclient!pa;Lclient!qa;III)V")
	public static void method237(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class40 arg3, @OriginalArg(5) Class122 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) Class30 local16 = Static244.aClass272_4.method6380(arg0);
		if (local16 == null || !local16.aBoolean45 || !local16.method907(Static251.aClass119_1)) {
			return;
		}
		@Pc(36) int local36;
		if (local16.anIntArray120 != null) {
			@Pc(34) int[] local34 = new int[local16.anIntArray120.length];
			@Pc(51) int local51;
			for (local36 = 0; local36 < local34.length / 2; local36++) {
				if (Static448.anInt7701 == 4) {
					local51 = (int) Static404.aFloat156 & 0x3FFF;
				} else {
					local51 = (int) Static404.aFloat156 + Static265.anInt5084 & 0x3FFF;
				}
				@Pc(62) int local62 = Class310.anIntArray827[local51];
				@Pc(66) int local66 = Class310.anIntArray826[local51];
				if (Static448.anInt7701 != 4) {
					local62 = local62 * 256 / (Static316.anInt5814 + 256);
					local66 = local66 * 256 / (Static316.anInt5814 + 256);
				}
				local34[local36 * 2] = (local66 * (arg2 + local16.anIntArray120[local36 * 2] * 4) + local62 * (arg7 + local16.anIntArray120[local36 * 2 + 1] * 4) >> 14) + arg6 + arg1.anInt4732 / 2;
				local34[local36 * 2 + 1] = arg5 + arg1.anInt4673 / 2 - ((local16.anIntArray120[local36 * 2 + 1] * 4 + arg7) * local66 - local62 * (local16.anIntArray120[local36 * 2] * 4 + arg2) >> 14);
			}
			Static12.method384(arg4, local34, local16.anInt898, arg1.anIntArray454, arg1.anIntArray450);
			for (local51 = 0; local51 < local34.length / 2 - 1; local51++) {
				arg4.method7231(local34[local51 * 2], local34[local51 * 2 + 1], local34[local51 * 2 + 2], local34[local51 * 2 + 2 + 1], local16.anInt889, arg3, arg6, arg5);
			}
			arg4.method7231(local34[local34.length - 2], local34[local34.length - 1], local34[0], local34[1], local16.anInt889, arg3, arg6, arg5);
		}
		@Pc(264) Class2 local264 = null;
		if (local16.anInt873 != -1) {
			local264 = local16.method913(arg4, false);
			if (local264 != null) {
				Static530.method7335(arg5, arg2, arg7, arg3, arg6, local264, arg1);
			}
		}
		if (local16.aString5 == null) {
			return;
		}
		local36 = 0;
		if (local264 != null) {
			local36 = local264.la();
		}
		@Pc(297) Class67 local297 = Static435.aClass67_11;
		@Pc(299) Class232 local299 = Static454.aClass232_8;
		if (local16.anInt870 == 1) {
			local299 = Static448.aClass232_7;
			local297 = Static112.aClass67_3;
		}
		if (local16.anInt870 == 2) {
			local297 = Static296.aClass67_9;
			local299 = Static381.aClass232_6;
		}
		Static305.method4809(arg2, local16.anInt872, arg3, local299, arg7, local16.aString5, arg5, arg6, local36, arg1, local297);
		return;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!n;Ljava/awt/Canvas;ZI)Lclient!qa;")
	public static Class122 method239(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class122_Sub1_Sub1(arg1, arg0) : new Class122_Sub1_Sub2(arg1, arg0);
	}
}

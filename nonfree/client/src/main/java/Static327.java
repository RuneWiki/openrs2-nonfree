import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!mda", name = "H", descriptor = "I")
	public static int anInt6049;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Z)V")
	public static void method5032() {
		if (Static90.anInt1946 < 102) {
			Static90.anInt1946 += 6;
		}
		@Pc(24) int local24;
		if (Static51.anInt1262 != -1 && Static352.aLong162 < Static548.method7437()) {
			for (local24 = Static51.anInt1262; local24 < Static266.aStringArray81.length; local24++) {
				if (Static266.aStringArray81[local24].startsWith("pause")) {
					@Pc(43) int local43 = 5;
					try {
						local43 = Integer.parseInt(Static266.aStringArray81[local24].substring(6));
					} catch (@Pc(52) Exception local52) {
					}
					Static212.method3438("Pausing for " + local43 + " seconds...");
					Static51.anInt1262 = local24 + 1;
					Static352.aLong162 = Static548.method7437() + (long) (local43 * 1000);
					return;
				}
				Static163.aString22 = Static266.aStringArray81[local24];
				Static175.method3011(false);
			}
			Static51.anInt1262 = -1;
		}
		if (Static148.anInt3056 != 0) {
			Static70.anInt1594 -= Static148.anInt3056 * 5;
			if (Static70.anInt1594 >= Static583.anInt9519) {
				Static70.anInt1594 = Static583.anInt9519 - 1;
			}
			if (Static70.anInt1594 < 0) {
				Static70.anInt1594 = 0;
			}
			Static148.anInt3056 = 0;
		}
		for (local24 = 0; local24 < Static398.anInt8718; local24++) {
			@Pc(127) Interface2 local127 = Static577.anInterface2Array2[local24];
			@Pc(131) int local131 = local127.method5040();
			@Pc(135) char local135 = local127.method5044();
			@Pc(139) int local139 = local127.method5043();
			if (local131 == 84) {
				Static175.method3011(false);
			}
			if (local131 == 80) {
				Static175.method3011(true);
			} else if (local131 == 66 && (local139 & 0x4) != 0) {
				if (Static484.aClipboard1 != null) {
					@Pc(161) String local161 = "";
					for (@Pc(166) int local166 = Static77.aStringArray189.length - 1; local166 >= 0; local166--) {
						if (Static77.aStringArray189[local166] != null && Static77.aStringArray189[local166].length() > 0) {
							local161 = local161 + Static77.aStringArray189[local166] + '\n';
						}
					}
					Static484.aClipboard1.setContents(new StringSelection(local161), null);
				}
			} else if (local131 == 67 && (local139 & 0x4) != 0) {
				if (Static484.aClipboard1 != null) {
					@Pc(418) Transferable local418 = Static484.aClipboard1.getContents(null);
					if (local418 != null) {
						try {
							@Pc(425) String local425 = (String) local418.getTransferData(DataFlavor.stringFlavor);
							if (local425 != null) {
								@Pc(432) String[] local432 = Static568.method7710(local425, '\n');
								if (local432.length > 1) {
									for (@Pc(438) int local438 = 0; local438 < local432.length; local438++) {
										if (local432[local438].startsWith("pause")) {
											@Pc(448) int local448 = 5;
											try {
												local448 = Integer.parseInt(local432[local438].substring(6));
											} catch (@Pc(457) Exception local457) {
											}
											Static212.method3438("Pausing for " + local448 + " seconds...");
											Static266.aStringArray81 = local432;
											Static51.anInt1262 = local438 + 1;
											Static352.aLong162 = Static548.method7437() + (long) (local448 * 1000);
											return;
										}
										Static163.aString22 = local432[local438];
										Static175.method3011(false);
									}
								} else {
									Static163.aString22 = Static163.aString22 + local425;
								}
							}
						} catch (@Pc(508) Exception local508) {
						}
					}
				}
			} else if (local131 == 85 && Static428.anInt7331 > 0) {
				Static163.aString22 = Static163.aString22.substring(0, Static428.anInt7331 - 1) + Static163.aString22.substring(Static428.anInt7331);
				Static428.anInt7331--;
			} else if (local131 == 101 && Static428.anInt7331 < Static163.aString22.length()) {
				Static163.aString22 = Static163.aString22.substring(0, Static428.anInt7331) + Static163.aString22.substring(Static428.anInt7331 + 1);
			} else if (local131 == 96 && Static428.anInt7331 > 0) {
				Static428.anInt7331--;
			} else if (local131 == 97 && Static428.anInt7331 < Static163.aString22.length()) {
				Static428.anInt7331++;
			} else if (local131 == 102) {
				Static428.anInt7331 = 0;
			} else if (local131 == 103) {
				Static428.anInt7331 = Static163.aString22.length();
			} else if (local131 == 104 && Static361.anInt7411 < Static77.aStringArray189.length) {
				Static361.anInt7411++;
				Static462.method6516();
				Static428.anInt7331 = Static163.aString22.length();
			} else if (local131 == 105 && Static361.anInt7411 > 0) {
				Static361.anInt7411--;
				Static462.method6516();
				Static428.anInt7331 = Static163.aString22.length();
			} else if (Static367.method5475(local135) || local135 == ':' || local135 == ',' || local135 == ' ' || local135 == '_' || local135 == '-' || local135 == '+' || local135 == '[' || local135 == ']') {
				Static163.aString22 = Static163.aString22.substring(0, Static428.anInt7331) + Static577.anInterface2Array2[local24].method5044() + Static163.aString22.substring(Static428.anInt7331);
				Static428.anInt7331++;
			}
		}
		Static398.anInt8718 = 0;
		Static19.anInt584 = 0;
		Static139.method2348();
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IFFF[BLclient!ab;FIIIIFII)V")
	public static void method5033(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class4 arg5, @OriginalArg(6) float arg6, @OriginalArg(11) float arg7, @OriginalArg(13) int arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg5.method7706(arg1 / (float) 128, arg8, arg6 / (float) 128, local12, 0, arg2 / (float) 16, arg7 * 127.0F);
			local42 = arg0;
			arg1 *= 2.0F;
			for (local48 = 0; local48 < 16384; local48++) {
				arg4[local42] = (byte) ((float) arg4[local42] + local12[local48]);
				local42++;
			}
			arg2 *= 2.0F;
			arg6 *= 2.0F;
			arg7 *= arg3;
		}
		local42 = arg0;
		for (local48 = 0; local48 < 16384; local48++) {
			arg4[local42] = (byte) (arg4[local42] + 127);
			local42++;
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BIIII)V")
	public static void method5034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static326.anInt6028 <= arg0 && arg0 <= Static80.anInt1738) {
			@Pc(20) int local20 = Static489.method6853(arg2, Static553.anInt9074, Static249.anInt4668);
			@Pc(26) int local26 = Static489.method6853(arg1, Static553.anInt9074, Static249.anInt4668);
			Static359.method5310(arg0, local26, arg3, local20);
		}
	}
}

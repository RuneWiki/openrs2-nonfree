import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public static int anInt3452;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	public static int anInt3454;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	public static void method2826() {
		if (Static180.anInt4653 != 0) {
			Static23.anInt431 -= Static180.anInt4653 * 5;
			if (Static6.anInt4028 <= Static23.anInt431) {
				Static23.anInt431 = Static6.anInt4028 - 1;
			}
			if (Static23.anInt431 < 0) {
				Static23.anInt431 = 0;
			}
			Static180.anInt4653 = 0;
		}
		if (Static236.anInt4750 < 102) {
			Static236.anInt4750 += 6;
		}
		@Pc(53) int local53;
		for (@Pc(45) int local45 = 0; local45 < Static191.anInt6244; local45++) {
			local53 = Static10.aClass75Array1[local45].method1492();
			@Pc(59) char local59 = Static10.aClass75Array1[local45].method1491();
			if (local53 == 84) {
				Static101.method1499();
			} else if (Static278.aClass143_20.method4857(82) && local53 == 66) {
				if (Static55.aClipboard1 != null) {
					@Pc(339) String local339 = "";
					for (@Pc(344) int local344 = Static314.aStringArray21.length - 1; local344 >= 0; local344--) {
						if (Static314.aStringArray21[local344] != null && Static314.aStringArray21[local344].length() > 0) {
							local339 = local339 + Static314.aStringArray21[local344] + '\n';
						}
					}
					Static55.aClipboard1.setContents(new StringSelection(local339), null);
				}
			} else if (Static278.aClass143_20.method4857(82) && local53 == 67) {
				if (Static55.aClipboard1 != null) {
					@Pc(287) Transferable local287 = Static55.aClipboard1.getContents(null);
					if (local287 != null) {
						try {
							@Pc(294) String local294 = (String) local287.getTransferData(DataFlavor.stringFlavor);
							if (local294 != null) {
								@Pc(301) String[] local301 = Static313.method5273('\n', local294);
								if (local301.length <= 1) {
									Static55.aString9 = Static55.aString9 + local294;
								} else {
									for (@Pc(318) int local318 = 0; local318 < local301.length; local318++) {
										Static55.aString9 = local301[local318];
										Static101.method1499();
									}
								}
							}
						} catch (@Pc(333) Exception local333) {
						}
					}
				}
			} else if (local53 == 85 && Static328.anInt6296 > 0) {
				Static55.aString9 = Static55.aString9.substring(0, Static328.anInt6296 - 1) + Static55.aString9.substring(Static328.anInt6296);
				Static328.anInt6296--;
			} else if (local53 == 101 && Static328.anInt6296 < Static55.aString9.length()) {
				Static55.aString9 = Static55.aString9.substring(0, Static328.anInt6296) + Static55.aString9.substring(Static328.anInt6296 + 1);
			} else if (local53 == 96 && Static328.anInt6296 > 0) {
				Static328.anInt6296--;
			} else if (local53 == 97 && Static328.anInt6296 < Static55.aString9.length()) {
				Static328.anInt6296++;
			} else if (local53 == 102) {
				Static328.anInt6296 = 0;
			} else if (local53 == 103) {
				Static328.anInt6296 = Static55.aString9.length();
			} else if (local53 == 104 && Static174.anInt3440 < Static314.aStringArray21.length) {
				Static174.anInt3440++;
				Static269.method4629();
				Static328.anInt6296 = Static55.aString9.length();
			} else if (local53 == 105 && Static174.anInt3440 > 0) {
				Static174.anInt3440--;
				Static269.method4629();
				Static328.anInt6296 = Static55.aString9.length();
			} else if (Static203.method3644(local59) || local59 == ':' || local59 == ',' || local59 == ' ' || local59 == '_' || local59 == '-' || local59 == '+') {
				Static55.aString9 = Static55.aString9.substring(0, Static328.anInt6296) + Static10.aClass75Array1[local45].method1491() + Static55.aString9.substring(Static328.anInt6296);
				Static328.anInt6296++;
			}
		}
		Static191.anInt6244 = 0;
		for (local53 = 0; local53 < 100; local53++) {
			@Pc(396) int local396;
			if (Static34.aBooleanArray5[local53]) {
				local396 = Static186.anIntArray286[local53]++;
				if (Static186.anIntArray286[local53] > 102) {
					Static34.aBooleanArray5[local53] = false;
				}
			} else {
				local396 = Static186.anIntArray286[local53]--;
				if (Static186.anIntArray286[local53] < 0) {
					Static316.anIntArray508[local53] = (int) (Math.random() * (double) Static164.anInt3090);
					Static325.anIntArray88[local53] = (int) (Math.random() * 350.0D);
					Static186.anIntArray286[local53] = 0;
					Static34.aBooleanArray5[local53] = true;
				}
			}
		}
		Static239.method4236();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!jk;I)V")
	public static void method2827(@OriginalArg(0) Class11_Sub24 arg0) {
		if (Static212.aClass106ArrayArrayArray2 == null) {
			return;
		}
		@Pc(13) Interface7 local13 = null;
		if (arg0.anInt2705 == 0) {
			local13 = (Interface7) Static3.method15(arg0.anInt2700, arg0.anInt2702, arg0.anInt2699);
		}
		if (arg0.anInt2705 == 1) {
			local13 = (Interface7) Static74.method1139(arg0.anInt2700, arg0.anInt2702, arg0.anInt2699);
		}
		if (arg0.anInt2705 == 2) {
			local13 = (Interface7) Static284.method4725(arg0.anInt2700, arg0.anInt2702, arg0.anInt2699, sc.class);
		}
		if (arg0.anInt2705 == 3) {
			local13 = (Interface7) Static136.method5506(arg0.anInt2700, arg0.anInt2702, arg0.anInt2699);
		}
		if (local13 == null) {
			arg0.anInt2706 = 0;
			arg0.anInt2703 = 0;
			arg0.anInt2697 = -1;
		} else {
			arg0.anInt2697 = local13.method5410();
			arg0.anInt2706 = local13.method5414();
			arg0.anInt2703 = local13.method5413();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBIFIIZI)[[I")
	public static int[][] method2828(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class11_Sub2_Sub20 local13 = new Class11_Sub2_Sub20();
		local13.anInt3424 = (int) (arg0 * 4096.0F);
		local13.anInt3422 = 3;
		local13.anInt3416 = 8;
		local13.aBoolean217 = false;
		local13.anInt3427 = 4;
		local13.method5708();
		Static243.method5702(64, 256);
		for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
			local13.method2814(local47, local9[local47]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
	public static void method2829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass67_Sub1_1 != null) {
			local7.aClass67_Sub1_1 = null;
		}
		if (local7.aClass67_Sub1_2 != null) {
			local7.aClass67_Sub1_2 = null;
		}
	}
}

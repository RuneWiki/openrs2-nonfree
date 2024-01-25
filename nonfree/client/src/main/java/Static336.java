import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!um;")
	public static final Class238 aClass238_4 = new Class238("WTWIP", 3);

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
	public static int anInt6190 = -1;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	public static void method4870(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static290.anInt5325 - Static335.anInt6175;
		if (local8 >= 100) {
			Static107.anInt2382 = 1;
			return;
		}
		@Pc(17) int local17 = (int) Static265.aFloat64;
		if (local17 < Static338.anInt1371 >> 8) {
			local17 = Static338.anInt1371 >> 8;
		}
		if (Static310.aBooleanArray23[4] && local17 < Static35.anIntArray427[4] + 128) {
			local17 = Static35.anIntArray427[4] + 128;
		}
		@Pc(54) int local54 = Static407.anInt7062 + (int) Static235.aFloat60 & 0x3FFF;
		Static292.method4286(Static334.anInt6158, arg0, local54, (local17 >> 3) * 3 + 600 << 0, Static124.method2209(Static124.anInt2688, Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053, Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055) - 50, Static288.anInt5279, local17);
		@Pc(99) float local99 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static398.anInt6901 = (int) ((float) Static414.anInt7168 + local99 * (float) (Static398.anInt6901 - Static414.anInt7168));
		Static422.anInt7281 = (int) ((float) (Static422.anInt7281 - Static422.anInt7280) * local99 + (float) Static422.anInt7280);
		Static141.anInt3177 = (int) (local99 * (float) (Static141.anInt3177 - Static433.anInt7353) + (float) Static433.anInt7353);
		Static80.anInt1722 = (int) ((float) (Static80.anInt1722 - Static4.anInt816) * local99 + (float) Static4.anInt816);
		@Pc(157) int local157 = Static430.anInt7326 - Static339.anInt6222;
		if (local157 > 8192) {
			local157 -= 16384;
		} else if (local157 < -8192) {
			local157 += 16384;
		}
		Static430.anInt7326 = (int) ((float) local157 * local99 + (float) Static339.anInt6222);
		Static430.anInt7326 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)I")
	public static int method4872(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local21) {
			local30 = local21;
		}
		if (local28 < local30) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local12 < local21) {
			local44 = local21;
		}
		if (local44 < local28) {
			local44 = local28;
		}
		@Pc(66) double local66 = 0.0D;
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local30 + local44) / 2.0D;
		if (local30 != local44) {
			if (local74 < 0.5D) {
				local68 = (local44 - local30) / (local44 + local30);
			}
			if (local44 == local12) {
				local66 = (local21 - local28) / (local44 - local30);
			} else if (local44 == local21) {
				local66 = (local28 - local12) / (local44 - local30) + 2.0D;
			} else if (local28 == local44) {
				local66 = (local12 - local21) / (-local30 + local44) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local68 = (local44 - local30) / (2.0D - local44 - local30);
			}
		}
		local66 /= 6.0D;
		@Pc(159) int local159 = (int) (local66 * 256.0D);
		@Pc(164) int local164 = (int) (local68 * 256.0D);
		@Pc(169) int local169 = (int) (local74 * 256.0D);
		if (local164 < 0) {
			local164 = 0;
		} else if (local164 > 255) {
			local164 = 255;
		}
		if (local169 < 0) {
			local169 = 0;
		} else if (local169 > 255) {
			local169 = 255;
		}
		if (local169 > 243) {
			local164 >>= 0x4;
		} else if (local169 > 217) {
			local164 >>= 0x3;
		} else if (local169 > 192) {
			local164 >>= 0x2;
		} else if (local169 > 179) {
			local164 >>= 0x1;
		}
		return (local169 >> 1) + (local164 >> 5 << 7) + ((local159 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)Z")
	public static boolean method4873() {
		@Pc(13) Class3_Sub38 local13 = (Class3_Sub38) Static374.aClass229_41.aClass3_233.aClass3_262;
		if (local13 == null || Static374.aClass229_41.aClass3_233 == local13) {
			return false;
		} else {
			if (local13.anInt6532 >= 2000) {
				local13.anInt6532 -= 2000;
			}
			return local13.anInt6532 == 1008;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method4876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILjava/awt/Component;Lclient!hs;I)Lclient!fr;")
	public static Class33 method4877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) Class103 arg3) {
		if (Static94.anInt2028 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class33 local33 = (Class33) Class.forName("Class33_Sub2").getDeclaredConstructor().newInstance();
			local33.anInt3673 = arg0;
			local33.anIntArray282 = new int[(Static29.aBoolean45 ? 2 : 1) * 256];
			local33.method3051(arg2);
			local33.anInt3676 = (arg0 & 0xFFFFFC00) + 1024;
			if (local33.anInt3676 > 16384) {
				local33.anInt3676 = 16384;
			}
			local33.method3060(local33.anInt3676);
			if (Static392.anInt6751 > 0 && Static36.aClass152_1 == null) {
				Static36.aClass152_1 = new Class152();
				Static36.aClass152_1.aClass103_4 = arg3;
				arg3.method2832(Static36.aClass152_1, Static392.anInt6751);
			}
			if (Static36.aClass152_1 != null) {
				if (Static36.aClass152_1.aClass33Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static36.aClass152_1.aClass33Array1[arg1] = local33;
			}
			return local33;
		} catch (@Pc(103) Throwable local103) {
			try {
				@Pc(109) Class33_Sub1 local109 = new Class33_Sub1(arg3, arg1);
				local109.anInt3673 = arg0;
				local109.anIntArray282 = new int[(Static29.aBoolean45 ? 2 : 1) * 256];
				local109.method3051(arg2);
				local109.anInt3676 = 16384;
				local109.method3060(local109.anInt3676);
				if (Static392.anInt6751 > 0 && Static36.aClass152_1 == null) {
					Static36.aClass152_1 = new Class152();
					Static36.aClass152_1.aClass103_4 = arg3;
					arg3.method2832(Static36.aClass152_1, Static392.anInt6751);
				}
				if (Static36.aClass152_1 != null) {
					if (Static36.aClass152_1.aClass33Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static36.aClass152_1.aClass33Array1[arg1] = local109;
				}
				return local109;
			} catch (@Pc(175) Throwable local175) {
				return new Class33();
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!qa;IIZLclient!oa;I)V")
	public static void method4878(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class65 arg4, @OriginalArg(6) int arg5) {
		if (arg3) {
			Static367.aClass22_18.method6074((Static385.anInt6686 - Static367.aClass22_18.ja()) / 2, (Static120.anInt2616 - Static367.aClass22_18.JA()) / 2);
			Static267.aClass22_13.method6074((Static385.anInt6686 - Static267.aClass22_13.ja()) / 2, 18);
		}
		arg4.method5804((Static436.aClass89_3 == Static114.aClass89_2 ? Static258.aClass175_244 : Static102.aClass175_23).method4201(Static216.anInt4257), Static385.anInt6686 / 2, Static120.anInt2616 / 2 - 26, arg5, -1);
		@Pc(56) int local56 = Static120.anInt2616 / 2 - 18;
		arg1.method2637(Static385.anInt6686 / 2 - 152, local56, 304, 34, arg2, 0);
		arg1.method2637(Static385.anInt6686 / 2 - 151, local56 + 1, 302, 32, 0, 0);
		arg1.NA(Static385.anInt6686 / 2 - 150, local56 + 2, Static433.anInt7360 * 3, 30, arg0, 0);
		arg1.NA(Static433.anInt7360 * 3 + Static385.anInt6686 / 2 - 150, local56 + 2, 300 - Static433.anInt7360 * 3, 30, 0, 0);
		arg4.method5804(Static21.aString4, Static385.anInt6686 / 2, Static120.anInt2616 / 2 + 4, arg5, -1);
	}
}

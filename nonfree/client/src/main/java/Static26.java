import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_6 = new Class212(71, 3);

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
	public static int anInt470 = 0;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
	public static final int anInt471 = 50;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[anInt471];

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "[I")
	public static final int[] anIntArray31 = new int[anInt471];

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
	public static final int[] anIntArray32 = new int[anInt471];

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "[I")
	public static final int[] anIntArray33 = new int[anInt471];

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "[I")
	public static final int[] anIntArray34 = new int[anInt471];

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "[I")
	public static final int[] anIntArray35 = new int[anInt471];

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "[I")
	public static final int[] anIntArray36 = new int[anInt471];

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	public static void method397() {
		@Pc(11) Class137 local11 = null;
		try {
			@Pc(17) Class87 local17 = Static390.aClass255_5.method5847("2", true);
			while (local17.anInt2679 == 0) {
				Static77.method1653(1L);
			}
			if (local17.anInt2679 == 1) {
				local11 = (Class137) local17.anObject3;
				@Pc(39) byte[] local39 = new byte[(int) local11.method3703()];
				@Pc(56) int local56;
				for (@Pc(41) int local41 = 0; local41 < local39.length; local41 += local56) {
					local56 = local11.method3704(local39, local39.length - local41, local41);
					if (local56 == -1) {
						throw new IOException("EOF");
					}
				}
				Static260.method4231(new Class4_Sub20(local39));
			}
		} catch (@Pc(85) Exception local85) {
		}
		try {
			if (local11 != null) {
				local11.method3708();
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ci;)V")
	public static void method398(@OriginalArg(1) Class38 arg0) {
		Static49.aClass38_11 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	public static void method399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static425.aFloat64 < Static425.aFloat65) {
			Static425.aFloat64 = (float) ((double) Static425.aFloat64 + (double) Static425.aFloat64 / 30.0D);
			if (Static425.aFloat64 > Static425.aFloat65) {
				Static425.aFloat64 = Static425.aFloat65;
			}
			Static142.method2614();
			Static425.anInt3653 = (int) Static425.aFloat64 >> 1;
			Static425.aByteArrayArrayArray2 = Static182.method3324(Static425.anInt3653);
		} else if (Static425.aFloat65 < Static425.aFloat64) {
			Static425.aFloat64 = (float) ((double) Static425.aFloat64 - (double) Static425.aFloat64 / 30.0D);
			if (Static425.aFloat64 < Static425.aFloat65) {
				Static425.aFloat64 = Static425.aFloat65;
			}
			Static142.method2614();
			Static425.anInt3653 = (int) Static425.aFloat64 >> 1;
			Static425.aByteArrayArrayArray2 = Static182.method3324(Static425.anInt3653);
		}
		if (Static245.anInt4781 != -1 && Static113.anInt2426 != -1) {
			@Pc(86) int local86 = Static245.anInt4781 - Static97.anInt2096;
			if (local86 < 2 || local86 > 2) {
				local86 /= 8;
			}
			@Pc(105) int local105 = Static113.anInt2426 - Static241.anInt4715;
			Static97.anInt2096 -= -local86;
			if (local105 < 2 || local105 > 2) {
				local105 /= 8;
			}
			Static241.anInt4715 += local105;
			if (local86 == 0 && local105 == 0) {
				Static245.anInt4781 = -1;
				Static113.anInt2426 = -1;
			}
			Static142.method2614();
		}
		if (Static355.anInt6248 <= 0) {
			Static9.anInt194 = -1;
			Static209.anInt4256 = -1;
		} else {
			Static399.anInt7064--;
			if (Static399.anInt7064 == 0) {
				Static399.anInt7064 = 100;
				Static355.anInt6248--;
			}
		}
		if (!Static310.aBoolean419 || Static345.aClass91_41 == null) {
			return;
		}
		for (@Pc(171) Class4_Sub43 local171 = (Class4_Sub43) Static345.aClass91_41.method2584(); local171 != null; local171 = (Class4_Sub43) Static345.aClass91_41.method2586()) {
			@Pc(180) Class217 local180 = Static425.aClass116_3.method3300(local171.aClass4_Sub4_1.anInt366);
			if (local171.method5879(arg1, arg0)) {
				if (local180.aStringArray32 != null) {
					if (local180.aStringArray32[4] != null) {
						Static12.method4708(1009, (long) local171.aClass4_Sub4_1.anInt366, local180.anInt6182, false, true, -1, local180.aString54, local180.aStringArray32[4], -1, 0);
					}
					if (local180.aStringArray32[3] != null) {
						Static12.method4708(1006, (long) local171.aClass4_Sub4_1.anInt366, local180.anInt6182, false, true, -1, local180.aString54, local180.aStringArray32[3], -1, 0);
					}
					if (local180.aStringArray32[2] != null) {
						Static12.method4708(1011, (long) local171.aClass4_Sub4_1.anInt366, local180.anInt6182, false, true, -1, local180.aString54, local180.aStringArray32[2], -1, 0);
					}
					if (local180.aStringArray32[1] != null) {
						Static12.method4708(1004, (long) local171.aClass4_Sub4_1.anInt366, local180.anInt6182, false, true, -1, local180.aString54, local180.aStringArray32[1], -1, 0);
					}
					if (local180.aStringArray32[0] != null) {
						Static12.method4708(1003, (long) local171.aClass4_Sub4_1.anInt366, local180.anInt6182, false, true, -1, local180.aString54, local180.aStringArray32[0], -1, 0);
					}
				}
				if (!local171.aClass4_Sub4_1.aBoolean19) {
					local171.aClass4_Sub4_1.aBoolean19 = true;
					Static64.method1466(Static43.aClass131_2, local171.aClass4_Sub4_1.anInt366, local180.anInt6182);
				}
				if (local171.aClass4_Sub4_1.aBoolean19) {
					Static64.method1466(Static230.aClass131_5, local171.aClass4_Sub4_1.anInt366, local180.anInt6182);
				}
			} else if (local171.aClass4_Sub4_1.aBoolean19) {
				local171.aClass4_Sub4_1.aBoolean19 = false;
				Static64.method1466(Static35.aClass131_1, local171.aClass4_Sub4_1.anInt366, local180.anInt6182);
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[B)Lclient!hu;")
	public static Class4_Sub1_Sub11 method400(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class4_Sub1_Sub11 local9 = new Class4_Sub1_Sub11();
		@Pc(14) Class4_Sub20 local14 = new Class4_Sub20(arg0);
		local14.anInt5526 = local14.aByteArray77.length - 2;
		@Pc(25) int local25 = local14.method4560();
		@Pc(36) int local36 = local14.aByteArray77.length - local25 - 2 - 12;
		local14.anInt5526 = local36;
		@Pc(48) int local48 = local14.method4595();
		local9.anInt3234 = local14.method4560();
		local9.anInt3239 = local14.method4560();
		local9.anInt3236 = local14.method4560();
		local9.anInt3238 = local14.method4560();
		@Pc(72) int local72 = local14.method4614();
		@Pc(83) int local83;
		@Pc(89) int local89;
		if (local72 > 0) {
			local9.aClass96Array1 = new Class96[local72];
			for (local83 = 0; local83 < local72; local83++) {
				local89 = local14.method4560();
				@Pc(96) Class96 local96 = new Class96(Static84.method6309(local89));
				local9.aClass96Array1[local83] = local96;
				while (local89-- > 0) {
					@Pc(107) int local107 = local14.method4595();
					@Pc(111) int local111 = local14.method4595();
					local96.method2805((long) local107, new Class4_Sub16(local111));
				}
			}
		}
		local14.anInt5526 = 0;
		local9.aString23 = local14.method4559();
		local9.anIntArray265 = new int[local48];
		local9.anIntArray264 = new int[local48];
		local9.aStringArray16 = new String[local48];
		local83 = 0;
		while (local14.anInt5526 < local36) {
			local89 = local14.method4560();
			if (local89 == 3) {
				local9.aStringArray16[local83] = local14.method4624().intern();
			} else if (local89 >= 100 || local89 == 21 || local89 == 38 || local89 == 39) {
				local9.anIntArray264[local83] = local14.method4614();
			} else {
				local9.anIntArray264[local83] = local14.method4595();
			}
			local9.anIntArray265[local83++] = local89;
		}
		return local9;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!tf;I)Ljava/lang/String;")
	public static String method401(@OriginalArg(0) Class240 arg0) {
		if (Static50.method1146(arg0).method5906() == 0) {
			return null;
		} else if (arg0.aString60 == null || arg0.aString60.trim().length() == 0) {
			return Static341.aBoolean453 ? "Hidden-use" : null;
		} else {
			return arg0.aString60;
		}
	}
}

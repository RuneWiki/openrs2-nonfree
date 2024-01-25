import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	public static int anInt5821 = 0;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[I")
	public static final int[] anIntArray484 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[I")
	public static final int[] anIntArray485 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString218 = "wave:";

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)I")
	public static int method4919(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(43) int local43 = (arg0 & 0x7F) * 96 >> 7;
			if (local43 < 2) {
				local43 = 2;
			} else if (local43 > 126) {
				local43 = 126;
			}
			return local43 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method4920() {
		Static121.aClass198_18.method5260();
		Static65.aClass178_2.method4765();
		Static285.aClass178_9.method4765();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIILclient!lo;)V")
	public static void method4921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub2_Sub1 arg3) {
		@Pc(9) Class10 local9 = arg3.method5428();
		@Pc(19) int local19 = arg3.anInt6501 - arg3.aClass108_7.anInt3431 & 0x3FFF;
		if (arg1 == -1) {
			if (local19 != 0 || arg3.anInt6524 > 25) {
				if (arg0 < 0 && local9.anInt209 != -1) {
					arg3.anInt6540 = local9.anInt209;
				} else if (arg0 <= 0 || local9.anInt232 == -1) {
					arg3.anInt6540 = local9.anInt226;
				} else {
					arg3.anInt6540 = local9.anInt232;
				}
				arg3.aBoolean569 = false;
			} else if (!arg3.aBoolean569 || !local9.method248(arg3.anInt6540)) {
				arg3.anInt6540 = local9.method246();
				arg3.aBoolean569 = arg3.anInt6540 != -1;
			}
		} else if (arg3.anInt6479 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(279) int local279 = Static276.anIntArray456[arg2] - arg3.aClass108_7.anInt3431 & 0x3FFF;
			if (arg1 == 2 && local9.anInt247 != -1) {
				if (local279 > 2048 && local279 <= 6144 && local9.anInt234 != -1) {
					arg3.anInt6540 = local9.anInt234;
				} else if (local279 >= 10240 && local279 < 14336 && local9.anInt239 != -1) {
					arg3.anInt6540 = local9.anInt239;
				} else if (local279 <= 6144 || local279 >= 10240 || local9.anInt211 == -1) {
					arg3.anInt6540 = local9.anInt247;
				} else {
					arg3.anInt6540 = local9.anInt211;
				}
			} else if (arg1 == 0 && local9.anInt248 != -1) {
				if (local279 > 2048 && local279 <= 6144 && local9.anInt238 != -1) {
					arg3.anInt6540 = local9.anInt238;
				} else if (local279 >= 10240 && local279 < 14336 && local9.anInt208 != -1) {
					arg3.anInt6540 = local9.anInt208;
				} else if (local279 <= 6144 || local279 >= 10240 || local9.anInt224 == -1) {
					arg3.anInt6540 = local9.anInt248;
				} else {
					arg3.anInt6540 = local9.anInt224;
				}
			} else if (local279 > 2048 && local279 <= 6144 && local9.anInt246 != -1) {
				arg3.anInt6540 = local9.anInt246;
			} else if (local279 >= 10240 && local279 < 14336 && local9.anInt217 != -1) {
				arg3.anInt6540 = local9.anInt217;
			} else if (local279 <= 6144 || local279 >= 10240 || local9.anInt230 == -1) {
				arg3.anInt6540 = local9.anInt226;
			} else {
				arg3.anInt6540 = local9.anInt230;
			}
			arg3.aBoolean569 = false;
		} else if (local19 == 0 && arg3.anInt6524 <= 25) {
			arg3.aBoolean569 = false;
			if (arg1 == 2 && local9.anInt247 != -1) {
				arg3.anInt6540 = local9.anInt247;
			} else if (arg1 == 0 && local9.anInt248 != -1) {
				arg3.anInt6540 = local9.anInt248;
			} else {
				arg3.anInt6540 = local9.anInt226;
			}
		} else {
			if (arg1 == 2 && local9.anInt247 != -1) {
				if (arg0 < 0 && local9.anInt214 != -1) {
					arg3.anInt6540 = local9.anInt214;
				} else if (arg0 <= 0 || local9.anInt244 == -1) {
					arg3.anInt6540 = local9.anInt247;
				} else {
					arg3.anInt6540 = local9.anInt244;
				}
			} else if (arg1 == 0 && local9.anInt248 != -1) {
				if (arg0 < 0 && local9.anInt212 != -1) {
					arg3.anInt6540 = local9.anInt212;
				} else if (arg0 <= 0 || local9.anInt218 == -1) {
					arg3.anInt6540 = local9.anInt248;
				} else {
					arg3.anInt6540 = local9.anInt218;
				}
			} else if (arg0 < 0 && local9.anInt210 != -1) {
				arg3.anInt6540 = local9.anInt210;
			} else if (arg0 <= 0 || local9.anInt204 == -1) {
				arg3.anInt6540 = local9.anInt226;
			} else {
				arg3.anInt6540 = local9.anInt204;
			}
			arg3.aBoolean569 = false;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method4923(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static154.aBoolean287) {
			try {
				@Pc(28) Class59 local28 = (Class59) Class.forName("Class59_Sub1").getDeclaredConstructor().newInstance();
				local28.method1270(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static154.aBoolean287 = true;
			}
		}
		return arg0;
	}
}

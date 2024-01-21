import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!wc", name = "ub", descriptor = "[I")
	private static int[] anIntArray358 = new int[10000];

	@OriginalMember(owner = "client!wc", name = "vb", descriptor = "[I")
	public static int[] anIntArray359 = Class2_Sub1_Sub2_Sub2.anIntArray219;

	@OriginalMember(owner = "client!wc", name = "wb", descriptor = "[I")
	public static int[] anIntArray360 = Class2_Sub1_Sub2_Sub2.anIntArray221;

	@OriginalMember(owner = "client!wc", name = "Vb", descriptor = "[I")
	private static int[] anIntArray365 = new int[10000];

	@OriginalMember(owner = "client!wc", name = "Xb", descriptor = "I")
	private static int anInt3045 = 0;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)I")
	public static int method2172(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!fd;II)Lclient!wc;")
	public static Class2_Sub1_Sub1_Sub7 method2175(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1931(0, arg1);
		return local5 == null ? null : new Class2_Sub1_Sub1_Sub7(local5);
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "()V")
	public static void method2179() {
		anIntArray365 = null;
		anIntArray358 = null;
		anIntArray359 = null;
		anIntArray360 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!wc;Lclient!wc;IIIZ)V")
	public static void method2185(@OriginalArg(0) Class2_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method2177();
		arg0.method2186();
		arg1.method2177();
		arg1.method2186();
		anInt3045++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray367;
		@Pc(19) int local19 = arg1.anInt3043;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt3043; local21++) {
			@Pc(27) Class37 local27 = arg0.aClass37Array1[local21];
			if (local27.anInt1325 != 0) {
				local37 = arg0.anIntArray362[local21] - arg3;
				if (local37 <= arg1.anInt3039) {
					@Pc(48) int local48 = arg0.anIntArray367[local21] - arg2;
					if (local48 >= arg1.anInt3042 && local48 <= arg1.anInt3040) {
						@Pc(64) int local64 = arg0.anIntArray364[local21] - arg4;
						if (local64 >= arg1.anInt3041 && local64 <= arg1.anInt3046) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class37 local81 = arg1.aClass37Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray364[local75] && local37 == arg1.anIntArray362[local75] && local81.anInt1325 != 0) {
									if (arg0.aClass37Array2 == null) {
										arg0.aClass37Array2 = new Class37[arg0.anInt3043];
									}
									if (arg1.aClass37Array2 == null) {
										arg1.aClass37Array2 = new Class37[local19];
									}
									@Pc(121) Class37 local121 = arg0.aClass37Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass37Array2[local21] = new Class37(local27);
									}
									@Pc(138) Class37 local138 = arg1.aClass37Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass37Array2[local75] = new Class37(local81);
									}
									local121.anInt1321 += local81.anInt1321;
									local121.anInt1320 += local81.anInt1320;
									local121.anInt1318 += local81.anInt1318;
									local121.anInt1325 += local81.anInt1325;
									local138.anInt1321 += local27.anInt1321;
									local138.anInt1320 += local27.anInt1320;
									local138.anInt1318 += local27.anInt1318;
									local138.anInt1325 += local27.anInt1325;
									local13++;
									anIntArray365[local21] = anInt3045;
									anIntArray358[local75] = anInt3045;
								}
							}
						}
					}
				}
			}
		}
		if (local13 < 3 || !arg5) {
			return;
		}
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt3038; local232++) {
			if (anIntArray365[arg0.anIntArray361[local232]] == anInt3045 && anIntArray365[arg0.anIntArray366[local232]] == anInt3045 && anIntArray365[arg0.anIntArray356[local232]] == anInt3045) {
				if (arg0.aByteArray39 == null) {
					arg0.aByteArray39 = new byte[arg0.anInt3038];
				}
				arg0.aByteArray39[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt3038; local37++) {
			if (anIntArray358[arg1.anIntArray361[local37]] == anInt3045 && anIntArray358[arg1.anIntArray366[local37]] == anInt3045 && anIntArray358[arg1.anIntArray356[local37]] == anInt3045) {
				if (arg1.aByteArray39 == null) {
					arg1.aByteArray39 = new byte[arg1.anInt3038];
				}
				arg1.aByteArray39[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I")
	public static int method2189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}

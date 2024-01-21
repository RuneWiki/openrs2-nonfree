import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "[I")
	private static int[] anIntArray89 = new int[10000];

	@OriginalMember(owner = "client!cb", name = "ub", descriptor = "[I")
	private static int[] anIntArray92 = new int[10000];

	@OriginalMember(owner = "client!cb", name = "Cb", descriptor = "I")
	private static int anInt433 = 0;

	@OriginalMember(owner = "client!cb", name = "Db", descriptor = "[I")
	public static int[] anIntArray94 = Class5_Sub2_Sub1_Sub2.anIntArray197;

	@OriginalMember(owner = "client!cb", name = "Qb", descriptor = "[I")
	public static int[] anIntArray100 = Class5_Sub2_Sub1_Sub2.anIntArray198;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)I")
	public static int method326(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!cb;Lclient!cb;IIIZ)V")
	public static void method331(@OriginalArg(0) Class5_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) Class5_Sub2_Sub2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method322();
		arg0.method325();
		arg1.method322();
		arg1.method325();
		anInt433++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray97;
		@Pc(19) int local19 = arg1.anInt437;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt437; local21++) {
			@Pc(27) Class67 local27 = arg0.aClass67Array2[local21];
			if (local27.anInt2843 != 0) {
				local37 = arg0.anIntArray96[local21] - arg3;
				if (local37 <= arg1.anInt431) {
					@Pc(48) int local48 = arg0.anIntArray97[local21] - arg2;
					if (local48 >= arg1.anInt430 && local48 <= arg1.anInt435) {
						@Pc(64) int local64 = arg0.anIntArray91[local21] - arg4;
						if (local64 >= arg1.anInt436 && local64 <= arg1.anInt432) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class67 local81 = arg1.aClass67Array2[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray91[local75] && local37 == arg1.anIntArray96[local75] && local81.anInt2843 != 0) {
									if (arg0.aClass67Array1 == null) {
										arg0.aClass67Array1 = new Class67[arg0.anInt437];
									}
									if (arg1.aClass67Array1 == null) {
										arg1.aClass67Array1 = new Class67[local19];
									}
									@Pc(121) Class67 local121 = arg0.aClass67Array1[local21];
									if (local121 == null) {
										local121 = arg0.aClass67Array1[local21] = new Class67(local27);
									}
									@Pc(138) Class67 local138 = arg1.aClass67Array1[local75];
									if (local138 == null) {
										local138 = arg1.aClass67Array1[local75] = new Class67(local81);
									}
									local121.anInt2841 += local81.anInt2841;
									local121.anInt2838 += local81.anInt2838;
									local121.anInt2837 += local81.anInt2837;
									local121.anInt2843 += local81.anInt2843;
									local138.anInt2841 += local27.anInt2841;
									local138.anInt2838 += local27.anInt2838;
									local138.anInt2837 += local27.anInt2837;
									local138.anInt2843 += local27.anInt2843;
									local13++;
									anIntArray89[local21] = anInt433;
									anIntArray92[local75] = anInt433;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt429; local232++) {
			if (anIntArray89[arg0.anIntArray99[local232]] == anInt433 && anIntArray89[arg0.anIntArray95[local232]] == anInt433 && anIntArray89[arg0.anIntArray93[local232]] == anInt433) {
				if (arg0.aByteArray9 == null) {
					arg0.aByteArray9 = new byte[arg0.anInt429];
				}
				arg0.aByteArray9[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt429; local37++) {
			if (anIntArray92[arg1.anIntArray99[local37]] == anInt433 && anIntArray92[arg1.anIntArray95[local37]] == anInt433 && anIntArray92[arg1.anIntArray93[local37]] == anInt433) {
				if (arg1.aByteArray9 == null) {
					arg1.aByteArray9 = new byte[arg1.anInt429];
				}
				arg1.aByteArray9[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "()V")
	public static void method337() {
		anIntArray89 = null;
		anIntArray92 = null;
		anIntArray100 = null;
		anIntArray94 = null;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)I")
	public static int method339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ff;II)Lclient!cb;")
	public static Class5_Sub2_Sub2_Sub1 method341(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1038(arg1, 0);
		return local5 == null ? null : new Class5_Sub2_Sub2_Sub1(local5);
	}
}

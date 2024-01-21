import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!td", name = "tb", descriptor = "[I")
	private static int[] anIntArray460 = new int[10000];

	@OriginalMember(owner = "client!td", name = "wb", descriptor = "[I")
	public static int[] anIntArray461 = Class1_Sub1_Sub2_Sub4.anIntArray399;

	@OriginalMember(owner = "client!td", name = "Gb", descriptor = "[I")
	public static int[] anIntArray462 = Class1_Sub1_Sub2_Sub4.anIntArray397;

	@OriginalMember(owner = "client!td", name = "Jb", descriptor = "[I")
	private static int[] anIntArray464 = new int[10000];

	@OriginalMember(owner = "client!td", name = "ac", descriptor = "I")
	private static int anInt2705 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!td;Lclient!td;IIIZ)V")
	public static void method1906(@OriginalArg(0) Class1_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1910();
		arg0.method1913();
		arg1.method1910();
		arg1.method1913();
		anInt2705++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray463;
		@Pc(19) int local19 = arg1.anInt2704;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2704; local21++) {
			@Pc(27) Class69 local27 = arg0.aClass69Array1[local21];
			if (local27.anInt2629 != 0) {
				local37 = arg0.anIntArray467[local21] - arg3;
				if (local37 <= arg1.anInt2701) {
					@Pc(48) int local48 = arg0.anIntArray463[local21] - arg2;
					if (local48 >= arg1.anInt2702 && local48 <= arg1.anInt2703) {
						@Pc(64) int local64 = arg0.anIntArray470[local21] - arg4;
						if (local64 >= arg1.anInt2707 && local64 <= arg1.anInt2700) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class69 local81 = arg1.aClass69Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray470[local75] && local37 == arg1.anIntArray467[local75] && local81.anInt2629 != 0) {
									if (arg0.aClass69Array2 == null) {
										arg0.aClass69Array2 = new Class69[arg0.anInt2704];
									}
									if (arg1.aClass69Array2 == null) {
										arg1.aClass69Array2 = new Class69[local19];
									}
									@Pc(121) Class69 local121 = arg0.aClass69Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass69Array2[local21] = new Class69(local27);
									}
									@Pc(138) Class69 local138 = arg1.aClass69Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass69Array2[local75] = new Class69(local81);
									}
									local121.anInt2630 += local81.anInt2630;
									local121.anInt2623 += local81.anInt2623;
									local121.anInt2628 += local81.anInt2628;
									local121.anInt2629 += local81.anInt2629;
									local138.anInt2630 += local27.anInt2630;
									local138.anInt2623 += local27.anInt2623;
									local138.anInt2628 += local27.anInt2628;
									local138.anInt2629 += local27.anInt2629;
									local13++;
									anIntArray460[local21] = anInt2705;
									anIntArray464[local75] = anInt2705;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt2706; local232++) {
			if (anIntArray460[arg0.anIntArray459[local232]] == anInt2705 && anIntArray460[arg0.anIntArray469[local232]] == anInt2705 && anIntArray460[arg0.anIntArray468[local232]] == anInt2705) {
				if (arg0.aByteArray33 == null) {
					arg0.aByteArray33 = new byte[arg0.anInt2706];
				}
				arg0.aByteArray33[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2706; local37++) {
			if (anIntArray464[arg1.anIntArray459[local37]] == anInt2705 && anIntArray464[arg1.anIntArray469[local37]] == anInt2705 && anIntArray464[arg1.anIntArray468[local37]] == anInt2705) {
				if (arg1.aByteArray33 == null) {
					arg1.aByteArray33 = new byte[arg1.anInt2706];
				}
				arg1.aByteArray33[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)I")
	public static int method1907(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!sf;II)Lclient!td;")
	public static Class1_Sub1_Sub1_Sub7 method1911(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method107(0, arg1);
		return local5 == null ? null : new Class1_Sub1_Sub1_Sub7(local5);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)I")
	public static int method1917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!td", name = "j", descriptor = "()V")
	public static void method1922() {
		anIntArray460 = null;
		anIntArray464 = null;
		anIntArray461 = null;
		anIntArray462 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!df", name = "lb", descriptor = "[I")
	private static int[] anIntArray95 = new int[10000];

	@OriginalMember(owner = "client!df", name = "ub", descriptor = "[I")
	public static int[] anIntArray97 = Class8_Sub1_Sub3_Sub1.anIntArray40;

	@OriginalMember(owner = "client!df", name = "Cb", descriptor = "[I")
	private static int[] anIntArray99 = new int[10000];

	@OriginalMember(owner = "client!df", name = "Ib", descriptor = "[I")
	public static int[] anIntArray100 = Class8_Sub1_Sub3_Sub1.anIntArray38;

	@OriginalMember(owner = "client!df", name = "Yb", descriptor = "I")
	private static int anInt790 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!dd;II)Lclient!df;")
	public static Class8_Sub1_Sub1_Sub3 method472(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1156(0, arg1);
		return local5 == null ? null : new Class8_Sub1_Sub1_Sub3(local5);
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)I")
	public static int method481(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
	public static int method486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!df;Lclient!df;IIIZ)V")
	public static void method489(@OriginalArg(0) Class8_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) Class8_Sub1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method474();
		arg0.method478();
		arg1.method474();
		arg1.method478();
		anInt790++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray96;
		@Pc(19) int local19 = arg1.anInt787;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt787; local21++) {
			@Pc(27) Class56 local27 = arg0.aClass56Array1[local21];
			if (local27.anInt2201 != 0) {
				local37 = arg0.anIntArray103[local21] - arg3;
				if (local37 <= arg1.anInt789) {
					@Pc(48) int local48 = arg0.anIntArray96[local21] - arg2;
					if (local48 >= arg1.anInt784 && local48 <= arg1.anInt783) {
						@Pc(64) int local64 = arg0.anIntArray94[local21] - arg4;
						if (local64 >= arg1.anInt782 && local64 <= arg1.anInt788) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class56 local81 = arg1.aClass56Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray94[local75] && local37 == arg1.anIntArray103[local75] && local81.anInt2201 != 0) {
									if (arg0.aClass56Array2 == null) {
										arg0.aClass56Array2 = new Class56[arg0.anInt787];
									}
									if (arg1.aClass56Array2 == null) {
										arg1.aClass56Array2 = new Class56[local19];
									}
									@Pc(121) Class56 local121 = arg0.aClass56Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass56Array2[local21] = new Class56(local27);
									}
									@Pc(138) Class56 local138 = arg1.aClass56Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass56Array2[local75] = new Class56(local81);
									}
									local121.anInt2202 += local81.anInt2202;
									local121.anInt2199 += local81.anInt2199;
									local121.anInt2197 += local81.anInt2197;
									local121.anInt2201 += local81.anInt2201;
									local138.anInt2202 += local27.anInt2202;
									local138.anInt2199 += local27.anInt2199;
									local138.anInt2197 += local27.anInt2197;
									local138.anInt2201 += local27.anInt2201;
									local13++;
									anIntArray95[local21] = anInt790;
									anIntArray99[local75] = anInt790;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt785; local232++) {
			if (anIntArray95[arg0.anIntArray98[local232]] == anInt790 && anIntArray95[arg0.anIntArray92[local232]] == anInt790 && anIntArray95[arg0.anIntArray101[local232]] == anInt790) {
				if (arg0.aByteArray5 == null) {
					arg0.aByteArray5 = new byte[arg0.anInt785];
				}
				arg0.aByteArray5[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt785; local37++) {
			if (anIntArray99[arg1.anIntArray98[local37]] == anInt790 && anIntArray99[arg1.anIntArray92[local37]] == anInt790 && anIntArray99[arg1.anIntArray101[local37]] == anInt790) {
				if (arg1.aByteArray5 == null) {
					arg1.aByteArray5 = new byte[arg1.anInt785];
				}
				arg1.aByteArray5[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "j", descriptor = "()V")
	public static void method493() {
		anIntArray95 = null;
		anIntArray99 = null;
		anIntArray100 = null;
		anIntArray97 = null;
	}
}

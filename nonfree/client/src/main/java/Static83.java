import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!pa", name = "Nb", descriptor = "[I")
	private static int[] anIntArray337 = new int[10000];

	@OriginalMember(owner = "client!pa", name = "Pb", descriptor = "[I")
	private static int[] anIntArray338 = new int[10000];

	@OriginalMember(owner = "client!pa", name = "Zb", descriptor = "I")
	private static int anInt2331 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!pa;Lclient!pa;IIIZ)V")
	public static void method1569(@OriginalArg(0) Class5_Sub2_Sub4_Sub7 arg0, @OriginalArg(1) Class5_Sub2_Sub4_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1586();
		arg0.method1583();
		arg1.method1586();
		arg1.method1583();
		anInt2331++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray343;
		@Pc(19) int local19 = arg1.anInt2328;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2328; local21++) {
			@Pc(27) Class50 local27 = arg0.aClass50Array1[local21];
			if (local27.anInt2189 != 0) {
				local37 = arg0.anIntArray342[local21] - arg3;
				if (local37 <= arg1.anInt2326) {
					@Pc(48) int local48 = arg0.anIntArray343[local21] - arg2;
					if (local48 >= arg1.anInt2324 && local48 <= arg1.anInt2323) {
						@Pc(64) int local64 = arg0.anIntArray335[local21] - arg4;
						if (local64 >= arg1.anInt2329 && local64 <= arg1.anInt2327) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class50 local81 = arg1.aClass50Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray335[local75] && local37 == arg1.anIntArray342[local75] && local81.anInt2189 != 0) {
									if (arg0.aClass50Array2 == null) {
										arg0.aClass50Array2 = new Class50[arg0.anInt2328];
									}
									if (arg1.aClass50Array2 == null) {
										arg1.aClass50Array2 = new Class50[local19];
									}
									@Pc(121) Class50 local121 = arg0.aClass50Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass50Array2[local21] = new Class50(local27);
									}
									@Pc(138) Class50 local138 = arg1.aClass50Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass50Array2[local75] = new Class50(local81);
									}
									local121.anInt2195 += local81.anInt2195;
									local121.anInt2192 += local81.anInt2192;
									local121.anInt2188 += local81.anInt2188;
									local121.anInt2189 += local81.anInt2189;
									local138.anInt2195 += local27.anInt2195;
									local138.anInt2192 += local27.anInt2192;
									local138.anInt2188 += local27.anInt2188;
									local138.anInt2189 += local27.anInt2189;
									local13++;
									anIntArray338[local21] = anInt2331;
									anIntArray337[local75] = anInt2331;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt2330; local232++) {
			if (anIntArray338[arg0.anIntArray339[local232]] == anInt2331 && anIntArray338[arg0.anIntArray340[local232]] == anInt2331 && anIntArray338[arg0.anIntArray333[local232]] == anInt2331) {
				if (arg0.aByteArray33 == null) {
					arg0.aByteArray33 = new byte[arg0.anInt2330];
				}
				arg0.aByteArray33[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2330; local37++) {
			if (anIntArray337[arg1.anIntArray339[local37]] == anInt2331 && anIntArray337[arg1.anIntArray340[local37]] == anInt2331 && anIntArray337[arg1.anIntArray333[local37]] == anInt2331) {
				if (arg1.aByteArray33 == null) {
					arg1.aByteArray33 = new byte[arg1.anInt2330];
				}
				arg1.aByteArray33[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!sd;II)Lclient!pa;")
	public static Class5_Sub2_Sub4_Sub7 method1570(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method733(0, arg1);
		return local5 == null ? null : new Class5_Sub2_Sub4_Sub7(local5);
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "()V")
	public static void method1574() {
		anIntArray338 = null;
		anIntArray337 = null;
		Class5_Sub2_Sub4_Sub7.anIntArray330 = null;
	}

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "(I)I")
	public static int method1576(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class5_Sub2_Sub4_Sub7.anIntArray330[arg0];
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)I")
	public static int method1578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}

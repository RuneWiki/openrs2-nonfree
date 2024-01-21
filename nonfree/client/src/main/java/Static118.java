import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!u", name = "lb", descriptor = "I")
	private static int anInt2827 = 0;

	@OriginalMember(owner = "client!u", name = "yb", descriptor = "[I")
	private static int[] anIntArray313 = new int[10000];

	@OriginalMember(owner = "client!u", name = "Cb", descriptor = "[I")
	private static int[] anIntArray316 = new int[10000];

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)I")
	public static int method1988(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class4_Sub4_Sub1_Sub7.anIntArray310[arg0];
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "()V")
	public static void method1991() {
		anIntArray313 = null;
		anIntArray316 = null;
		Class4_Sub4_Sub1_Sub7.anIntArray310 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!u;Lclient!u;IIIZ)V")
	public static void method1995(@OriginalArg(0) Class4_Sub4_Sub1_Sub7 arg0, @OriginalArg(1) Class4_Sub4_Sub1_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method2002();
		arg0.method1987();
		arg1.method2002();
		arg1.method1987();
		anInt2827++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray307;
		@Pc(19) int local19 = arg1.anInt2832;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2832; local21++) {
			@Pc(27) Class57 local27 = arg0.aClass57Array2[local21];
			if (local27.anInt2029 != 0) {
				local37 = arg0.anIntArray304[local21] - arg3;
				if (local37 <= arg1.anInt2831) {
					@Pc(48) int local48 = arg0.anIntArray307[local21] - arg2;
					if (local48 >= arg1.anInt2830 && local48 <= arg1.anInt2825) {
						@Pc(64) int local64 = arg0.anIntArray306[local21] - arg4;
						if (local64 >= arg1.anInt2829 && local64 <= arg1.anInt2824) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class57 local81 = arg1.aClass57Array2[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray306[local75] && local37 == arg1.anIntArray304[local75] && local81.anInt2029 != 0) {
									if (arg0.aClass57Array1 == null) {
										arg0.aClass57Array1 = new Class57[arg0.anInt2832];
									}
									if (arg1.aClass57Array1 == null) {
										arg1.aClass57Array1 = new Class57[local19];
									}
									@Pc(121) Class57 local121 = arg0.aClass57Array1[local21];
									if (local121 == null) {
										local121 = arg0.aClass57Array1[local21] = new Class57(local27);
									}
									@Pc(138) Class57 local138 = arg1.aClass57Array1[local75];
									if (local138 == null) {
										local138 = arg1.aClass57Array1[local75] = new Class57(local81);
									}
									local121.anInt2037 += local81.anInt2037;
									local121.anInt2026 += local81.anInt2026;
									local121.anInt2027 += local81.anInt2027;
									local121.anInt2029 += local81.anInt2029;
									local138.anInt2037 += local27.anInt2037;
									local138.anInt2026 += local27.anInt2026;
									local138.anInt2027 += local27.anInt2027;
									local138.anInt2029 += local27.anInt2029;
									local13++;
									anIntArray313[local21] = anInt2827;
									anIntArray316[local75] = anInt2827;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt2826; local232++) {
			if (anIntArray313[arg0.anIntArray311[local232]] == anInt2827 && anIntArray313[arg0.anIntArray312[local232]] == anInt2827 && anIntArray313[arg0.anIntArray305[local232]] == anInt2827) {
				if (arg0.aByteArray118 == null) {
					arg0.aByteArray118 = new byte[arg0.anInt2826];
				}
				arg0.aByteArray118[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2826; local37++) {
			if (anIntArray316[arg1.anIntArray311[local37]] == anInt2827 && anIntArray316[arg1.anIntArray312[local37]] == anInt2827 && anIntArray316[arg1.anIntArray305[local37]] == anInt2827) {
				if (arg1.aByteArray118 == null) {
					arg1.aByteArray118 = new byte[arg1.anInt2826];
				}
				arg1.aByteArray118[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)I")
	public static int method1997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!lc;II)Lclient!u;")
	public static Class4_Sub4_Sub1_Sub7 method2001(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1110(0, arg1);
		return local5 == null ? null : new Class4_Sub4_Sub1_Sub7(local5);
	}
}

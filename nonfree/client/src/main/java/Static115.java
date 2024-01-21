import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
	private static int anInt2745 = 0;

	@OriginalMember(owner = "client!oe", name = "fb", descriptor = "[I")
	private static int[] anIntArray309 = new int[10000];

	@OriginalMember(owner = "client!oe", name = "jb", descriptor = "[I")
	public static int[] anIntArray310 = Class3_Sub2_Sub3_Sub4.anIntArray347;

	@OriginalMember(owner = "client!oe", name = "sb", descriptor = "[I")
	private static int[] anIntArray311 = new int[10000];

	@OriginalMember(owner = "client!oe", name = "Ab", descriptor = "[I")
	public static int[] anIntArray313 = Class3_Sub2_Sub3_Sub4.anIntArray346;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!jg;II)Lclient!oe;")
	public static Class3_Sub2_Sub1_Sub6 method1944(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1624(arg1, 0);
		return local5 == null ? null : new Class3_Sub2_Sub1_Sub6(local5);
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "()V")
	public static void method1945() {
		anIntArray309 = null;
		anIntArray311 = null;
		anIntArray310 = null;
		anIntArray313 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!oe;Lclient!oe;IIIZ)V")
	public static void method1955(@OriginalArg(0) Class3_Sub2_Sub1_Sub6 arg0, @OriginalArg(1) Class3_Sub2_Sub1_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1947();
		arg0.method1951();
		arg1.method1947();
		arg1.method1951();
		anInt2745++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray304;
		@Pc(19) int local19 = arg1.anInt2746;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2746; local21++) {
			@Pc(27) Class79 local27 = arg0.aClass79Array2[local21];
			if (local27.anInt3526 != 0) {
				local37 = arg0.anIntArray308[local21] - arg3;
				if (local37 >= arg1.aShort34 && local37 <= arg1.aShort32) {
					@Pc(53) int local53 = arg0.anIntArray304[local21] - arg2;
					if (local53 >= arg1.aShort29 && local53 <= arg1.aShort28) {
						@Pc(69) int local69 = arg0.anIntArray312[local21] - arg4;
						if (local69 >= arg1.aShort33 && local69 <= arg1.aShort30) {
							for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
								@Pc(86) Class79 local86 = arg1.aClass79Array2[local80];
								if (local53 == local16[local80] && local69 == arg1.anIntArray312[local80] && local37 == arg1.anIntArray308[local80] && local86.anInt3526 != 0) {
									if (arg0.aClass79Array1 == null) {
										arg0.aClass79Array1 = new Class79[arg0.anInt2746];
									}
									if (arg1.aClass79Array1 == null) {
										arg1.aClass79Array1 = new Class79[local19];
									}
									@Pc(126) Class79 local126 = arg0.aClass79Array1[local21];
									if (local126 == null) {
										local126 = arg0.aClass79Array1[local21] = new Class79(local27);
									}
									@Pc(143) Class79 local143 = arg1.aClass79Array1[local80];
									if (local143 == null) {
										local143 = arg1.aClass79Array1[local80] = new Class79(local86);
									}
									local126.anInt3528 += local86.anInt3528;
									local126.anInt3527 += local86.anInt3527;
									local126.anInt3529 += local86.anInt3529;
									local126.anInt3526 += local86.anInt3526;
									local143.anInt3528 += local27.anInt3528;
									local143.anInt3527 += local27.anInt3527;
									local143.anInt3529 += local27.anInt3529;
									local143.anInt3526 += local27.anInt3526;
									local13++;
									anIntArray309[local21] = anInt2745;
									anIntArray311[local80] = anInt2745;
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
		for (@Pc(237) int local237 = 0; local237 < arg0.anInt2747; local237++) {
			if (anIntArray309[arg0.anIntArray305[local237]] == anInt2745 && anIntArray309[arg0.anIntArray306[local237]] == anInt2745 && anIntArray309[arg0.anIntArray307[local237]] == anInt2745) {
				if (arg0.aByteArray30 == null) {
					arg0.aByteArray30 = new byte[arg0.anInt2747];
				}
				arg0.aByteArray30[local237] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2747; local37++) {
			if (anIntArray311[arg1.anIntArray305[local37]] == anInt2745 && anIntArray311[arg1.anIntArray306[local37]] == anInt2745 && anIntArray311[arg1.anIntArray307[local37]] == anInt2745) {
				if (arg1.aByteArray30 == null) {
					arg1.aByteArray30 = new byte[arg1.anInt2747];
				}
				arg1.aByteArray30[local37] = 2;
			}
		}
	}
}

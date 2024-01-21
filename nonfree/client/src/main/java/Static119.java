import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!oe", name = "pb", descriptor = "[I")
	public static int[] anIntArray232 = Class2_Sub2_Sub2_Sub4.anIntArray217;

	@OriginalMember(owner = "client!oe", name = "rb", descriptor = "I")
	private static int anInt2499 = 0;

	@OriginalMember(owner = "client!oe", name = "xb", descriptor = "[I")
	private static int[] anIntArray234 = new int[10000];

	@OriginalMember(owner = "client!oe", name = "Hb", descriptor = "[I")
	private static int[] anIntArray236 = new int[10000];

	@OriginalMember(owner = "client!oe", name = "Jb", descriptor = "[I")
	public static int[] anIntArray237 = Class2_Sub2_Sub2_Sub4.anIntArray218;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
	public static void method2014() {
		anIntArray234 = null;
		anIntArray236 = null;
		anIntArray232 = null;
		anIntArray237 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!oe;Lclient!oe;IIIZ)V")
	public static void method2019(@OriginalArg(0) Class2_Sub2_Sub3_Sub6 arg0, @OriginalArg(1) Class2_Sub2_Sub3_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method2037();
		arg0.method2035();
		arg1.method2037();
		arg1.method2035();
		anInt2499++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray235;
		@Pc(19) int local19 = arg1.anInt2501;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2501; local21++) {
			@Pc(27) Class38 local27 = arg0.aClass38Array2[local21];
			if (local27.anInt1439 != 0) {
				local37 = arg0.anIntArray228[local21] - arg3;
				if (local37 >= arg1.aShort34 && local37 <= arg1.aShort23) {
					@Pc(53) int local53 = arg0.anIntArray235[local21] - arg2;
					if (local53 >= arg1.aShort25 && local53 <= arg1.aShort29) {
						@Pc(69) int local69 = arg0.anIntArray230[local21] - arg4;
						if (local69 >= arg1.aShort24 && local69 <= arg1.aShort26) {
							for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
								@Pc(86) Class38 local86 = arg1.aClass38Array2[local80];
								if (local53 == local16[local80] && local69 == arg1.anIntArray230[local80] && local37 == arg1.anIntArray228[local80] && local86.anInt1439 != 0) {
									if (arg0.aClass38Array1 == null) {
										arg0.aClass38Array1 = new Class38[arg0.anInt2501];
									}
									if (arg1.aClass38Array1 == null) {
										arg1.aClass38Array1 = new Class38[local19];
									}
									@Pc(126) Class38 local126 = arg0.aClass38Array1[local21];
									if (local126 == null) {
										local126 = arg0.aClass38Array1[local21] = new Class38(local27);
									}
									@Pc(143) Class38 local143 = arg1.aClass38Array1[local80];
									if (local143 == null) {
										local143 = arg1.aClass38Array1[local80] = new Class38(local86);
									}
									local126.anInt1442 += local86.anInt1442;
									local126.anInt1441 += local86.anInt1441;
									local126.anInt1444 += local86.anInt1444;
									local126.anInt1439 += local86.anInt1439;
									local143.anInt1442 += local27.anInt1442;
									local143.anInt1441 += local27.anInt1441;
									local143.anInt1444 += local27.anInt1444;
									local143.anInt1439 += local27.anInt1439;
									local13++;
									anIntArray234[local21] = anInt2499;
									anIntArray236[local80] = anInt2499;
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
		for (@Pc(237) int local237 = 0; local237 < arg0.anInt2500; local237++) {
			if (anIntArray234[arg0.anIntArray229[local237]] == anInt2499 && anIntArray234[arg0.anIntArray233[local237]] == anInt2499 && anIntArray234[arg0.anIntArray231[local237]] == anInt2499) {
				if (arg0.aByteArray38 == null) {
					arg0.aByteArray38 = new byte[arg0.anInt2500];
				}
				arg0.aByteArray38[local237] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2500; local37++) {
			if (anIntArray236[arg1.anIntArray229[local37]] == anInt2499 && anIntArray236[arg1.anIntArray233[local37]] == anInt2499 && anIntArray236[arg1.anIntArray231[local37]] == anInt2499) {
				if (arg1.aByteArray38 == null) {
					arg1.aByteArray38 = new byte[arg1.anInt2500];
				}
				arg1.aByteArray38[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!bg;II)Lclient!oe;")
	public static Class2_Sub2_Sub3_Sub6 method2029(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method2049(0, arg1);
		return local5 == null ? null : new Class2_Sub2_Sub3_Sub6(local5);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ob", name = "rb", descriptor = "I")
	private static int anInt2732 = 0;

	@OriginalMember(owner = "client!ob", name = "Cb", descriptor = "[I")
	public static final int[] anIntArray364 = Class3_Sub1_Sub4_Sub2.anIntArray190;

	@OriginalMember(owner = "client!ob", name = "Fb", descriptor = "[I")
	private static final int[] anIntArray366 = new int[10000];

	@OriginalMember(owner = "client!ob", name = "Nb", descriptor = "[I")
	private static final int[] anIntArray370 = new int[10000];

	@OriginalMember(owner = "client!ob", name = "Ub", descriptor = "[I")
	public static final int[] anIntArray375 = Class3_Sub1_Sub4_Sub2.anIntArray188;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ob;Lclient!ob;IIIZ)V")
	public static void method1888(@OriginalArg(0) Class3_Sub1_Sub5_Sub5 arg0, @OriginalArg(1) Class3_Sub1_Sub5_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1900();
		arg0.method1896();
		arg1.method1900();
		arg1.method1896();
		anInt2732++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray371;
		@Pc(19) int local19 = arg1.anInt2729;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2729; local21++) {
			@Pc(27) Class14 local27 = arg0.aClass14Array2[local21];
			if (local27.anInt514 != 0) {
				local37 = arg0.anIntArray369[local21] - arg3;
				if (local37 >= arg1.aShort34 && local37 <= arg1.aShort25) {
					@Pc(53) int local53 = arg0.anIntArray371[local21] - arg2;
					if (local53 >= arg1.aShort29 && local53 <= arg1.aShort27) {
						@Pc(69) int local69 = arg0.anIntArray374[local21] - arg4;
						if (local69 >= arg1.aShort30 && local69 <= arg1.aShort26) {
							for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
								@Pc(86) Class14 local86 = arg1.aClass14Array2[local80];
								if (local53 == local16[local80] && local69 == arg1.anIntArray374[local80] && local37 == arg1.anIntArray369[local80] && local86.anInt514 != 0) {
									if (arg0.aClass14Array1 == null) {
										arg0.aClass14Array1 = new Class14[arg0.anInt2729];
									}
									if (arg1.aClass14Array1 == null) {
										arg1.aClass14Array1 = new Class14[local19];
									}
									@Pc(126) Class14 local126 = arg0.aClass14Array1[local21];
									if (local126 == null) {
										local126 = arg0.aClass14Array1[local21] = new Class14(local27);
									}
									@Pc(143) Class14 local143 = arg1.aClass14Array1[local80];
									if (local143 == null) {
										local143 = arg1.aClass14Array1[local80] = new Class14(local86);
									}
									local126.anInt511 += local86.anInt511;
									local126.anInt515 += local86.anInt515;
									local126.anInt508 += local86.anInt508;
									local126.anInt514 += local86.anInt514;
									local143.anInt511 += local27.anInt511;
									local143.anInt515 += local27.anInt515;
									local143.anInt508 += local27.anInt508;
									local143.anInt514 += local27.anInt514;
									local13++;
									anIntArray370[local21] = anInt2732;
									anIntArray366[local80] = anInt2732;
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
		for (@Pc(237) int local237 = 0; local237 < arg0.anInt2731; local237++) {
			if (anIntArray370[arg0.anIntArray367[local237]] == anInt2732 && anIntArray370[arg0.anIntArray368[local237]] == anInt2732 && anIntArray370[arg0.anIntArray372[local237]] == anInt2732) {
				if (arg0.aByteArray30 == null) {
					arg0.aByteArray30 = new byte[arg0.anInt2731];
				}
				arg0.aByteArray30[local237] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2731; local37++) {
			if (anIntArray366[arg1.anIntArray367[local37]] == anInt2732 && anIntArray366[arg1.anIntArray368[local37]] == anInt2732 && anIntArray366[arg1.anIntArray372[local37]] == anInt2732) {
				if (arg1.aByteArray30 == null) {
					arg1.aByteArray30 = new byte[arg1.anInt2731];
				}
				arg1.aByteArray30[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!bc;II)Lclient!ob;")
	public static Class3_Sub1_Sub5_Sub5 method1911(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method60(arg1, 0);
		return local5 == null ? null : new Class3_Sub1_Sub5_Sub5(local5);
	}
}

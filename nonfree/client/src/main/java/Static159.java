import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!td", name = "R", descriptor = "[I")
	private static int[] anIntArray373 = new int[10000];

	@OriginalMember(owner = "client!td", name = "gb", descriptor = "I")
	private static int anInt3617 = 0;

	@OriginalMember(owner = "client!td", name = "Fb", descriptor = "[I")
	private static int[] anIntArray381 = new int[10000];

	@OriginalMember(owner = "client!td", name = "Gb", descriptor = "[I")
	public static int[] anIntArray382 = Class1_Sub2_Sub2_Sub1.anIntArray30;

	@OriginalMember(owner = "client!td", name = "Hb", descriptor = "[I")
	public static int[] anIntArray383 = Class1_Sub2_Sub2_Sub1.anIntArray33;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "()V")
	public static void method2758() {
		anIntArray381 = null;
		anIntArray373 = null;
		anIntArray382 = null;
		anIntArray383 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!td;Lclient!td;IIIZ)V")
	public static void method2763(@OriginalArg(0) Class1_Sub2_Sub1_Sub6 arg0, @OriginalArg(1) Class1_Sub2_Sub1_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method2750();
		arg0.method2749();
		arg1.method2750();
		arg1.method2749();
		anInt3617++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray376;
		@Pc(19) int local19 = arg1.anInt3618;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt3618; local21++) {
			@Pc(27) Class58 local27 = arg0.aClass58Array2[local21];
			if (local27.anInt2522 != 0) {
				local37 = arg0.anIntArray375[local21] - arg3;
				if (local37 >= arg1.aShort36 && local37 <= arg1.aShort33) {
					@Pc(53) int local53 = arg0.anIntArray376[local21] - arg2;
					if (local53 >= arg1.aShort29 && local53 <= arg1.aShort30) {
						@Pc(69) int local69 = arg0.anIntArray378[local21] - arg4;
						if (local69 >= arg1.aShort32 && local69 <= arg1.aShort34) {
							for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
								@Pc(86) Class58 local86 = arg1.aClass58Array2[local80];
								if (local53 == local16[local80] && local69 == arg1.anIntArray378[local80] && local37 == arg1.anIntArray375[local80] && local86.anInt2522 != 0) {
									if (arg0.aClass58Array1 == null) {
										arg0.aClass58Array1 = new Class58[arg0.anInt3618];
									}
									if (arg1.aClass58Array1 == null) {
										arg1.aClass58Array1 = new Class58[local19];
									}
									@Pc(126) Class58 local126 = arg0.aClass58Array1[local21];
									if (local126 == null) {
										local126 = arg0.aClass58Array1[local21] = new Class58(local27);
									}
									@Pc(143) Class58 local143 = arg1.aClass58Array1[local80];
									if (local143 == null) {
										local143 = arg1.aClass58Array1[local80] = new Class58(local86);
									}
									local126.anInt2515 += local86.anInt2515;
									local126.anInt2521 += local86.anInt2521;
									local126.anInt2517 += local86.anInt2517;
									local126.anInt2522 += local86.anInt2522;
									local143.anInt2515 += local27.anInt2515;
									local143.anInt2521 += local27.anInt2521;
									local143.anInt2517 += local27.anInt2517;
									local143.anInt2522 += local27.anInt2522;
									local13++;
									anIntArray381[local21] = anInt3617;
									anIntArray373[local80] = anInt3617;
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
		for (@Pc(237) int local237 = 0; local237 < arg0.anInt3615; local237++) {
			if (anIntArray381[arg0.anIntArray380[local237]] == anInt3617 && anIntArray381[arg0.anIntArray379[local237]] == anInt3617 && anIntArray381[arg0.anIntArray384[local237]] == anInt3617) {
				if (arg0.aByteArray39 == null) {
					arg0.aByteArray39 = new byte[arg0.anInt3615];
				}
				arg0.aByteArray39[local237] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt3615; local37++) {
			if (anIntArray373[arg1.anIntArray380[local37]] == anInt3617 && anIntArray373[arg1.anIntArray379[local37]] == anInt3617 && anIntArray373[arg1.anIntArray384[local37]] == anInt3617) {
				if (arg1.aByteArray39 == null) {
					arg1.aByteArray39 = new byte[arg1.anInt3615];
				}
				arg1.aByteArray39[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!vb;II)Lclient!td;")
	public static Class1_Sub2_Sub1_Sub6 method2767(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method2942(0, arg1);
		return local5 == null ? null : new Class1_Sub2_Sub1_Sub6(local5);
	}
}

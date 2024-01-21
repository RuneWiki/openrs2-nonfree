import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!sf", name = "ab", descriptor = "[I")
	public static int[] anIntArray495 = Class1_Sub1_Sub12_Sub2.anIntArray417;

	@OriginalMember(owner = "client!sf", name = "ob", descriptor = "[I")
	public static int[] anIntArray498 = Class1_Sub1_Sub12_Sub2.anIntArray416;

	@OriginalMember(owner = "client!sf", name = "sb", descriptor = "I")
	private static int anInt3772 = 0;

	@OriginalMember(owner = "client!sf", name = "Ib", descriptor = "[I")
	private static int[] anIntArray503 = new int[10000];

	@OriginalMember(owner = "client!sf", name = "Jb", descriptor = "[I")
	private static int[] anIntArray504 = new int[10000];

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!sf;Lclient!sf;IIIZ)V")
	public static void method2598(@OriginalArg(0) Class1_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method2607();
		arg0.method2595();
		arg1.method2607();
		arg1.method2595();
		anInt3772++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray497;
		@Pc(19) int local19 = arg1.anInt3774;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt3774; local21++) {
			@Pc(27) Class83 local27 = arg0.aClass83Array2[local21];
			if (local27.anInt4019 != 0) {
				local37 = arg0.anIntArray505[local21] - arg3;
				if (local37 >= arg1.aShort36 && local37 <= arg1.aShort30) {
					@Pc(53) int local53 = arg0.anIntArray497[local21] - arg2;
					if (local53 >= arg1.aShort31 && local53 <= arg1.aShort29) {
						@Pc(69) int local69 = arg0.anIntArray500[local21] - arg4;
						if (local69 >= arg1.aShort33 && local69 <= arg1.aShort34) {
							for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
								@Pc(86) Class83 local86 = arg1.aClass83Array2[local80];
								if (local53 == local16[local80] && local69 == arg1.anIntArray500[local80] && local37 == arg1.anIntArray505[local80] && local86.anInt4019 != 0) {
									if (arg0.aClass83Array1 == null) {
										arg0.aClass83Array1 = new Class83[arg0.anInt3774];
									}
									if (arg1.aClass83Array1 == null) {
										arg1.aClass83Array1 = new Class83[local19];
									}
									@Pc(126) Class83 local126 = arg0.aClass83Array1[local21];
									if (local126 == null) {
										local126 = arg0.aClass83Array1[local21] = new Class83(local27);
									}
									@Pc(143) Class83 local143 = arg1.aClass83Array1[local80];
									if (local143 == null) {
										local143 = arg1.aClass83Array1[local80] = new Class83(local86);
									}
									local126.anInt4015 += local86.anInt4015;
									local126.anInt4021 += local86.anInt4021;
									local126.anInt4017 += local86.anInt4017;
									local126.anInt4019 += local86.anInt4019;
									local143.anInt4015 += local27.anInt4015;
									local143.anInt4021 += local27.anInt4021;
									local143.anInt4017 += local27.anInt4017;
									local143.anInt4019 += local27.anInt4019;
									local13++;
									anIntArray504[local21] = anInt3772;
									anIntArray503[local80] = anInt3772;
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
		for (@Pc(237) int local237 = 0; local237 < arg0.anInt3771; local237++) {
			if (anIntArray504[arg0.anIntArray494[local237]] == anInt3772 && anIntArray504[arg0.anIntArray501[local237]] == anInt3772 && anIntArray504[arg0.anIntArray502[local237]] == anInt3772) {
				if (arg0.aByteArray39 == null) {
					arg0.aByteArray39 = new byte[arg0.anInt3771];
				}
				arg0.aByteArray39[local237] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt3771; local37++) {
			if (anIntArray503[arg1.anIntArray494[local37]] == anInt3772 && anIntArray503[arg1.anIntArray501[local37]] == anInt3772 && anIntArray503[arg1.anIntArray502[local37]] == anInt3772) {
				if (arg1.aByteArray39 == null) {
					arg1.aByteArray39 = new byte[arg1.anInt3771];
				}
				arg1.aByteArray39[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "()V")
	public static void method2599() {
		anIntArray504 = null;
		anIntArray503 = null;
		anIntArray498 = null;
		anIntArray495 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ga;II)Lclient!sf;")
	public static Class1_Sub1_Sub1_Sub6 method2610(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1301(arg1, 0);
		return local5 == null ? null : new Class1_Sub1_Sub1_Sub6(local5);
	}
}

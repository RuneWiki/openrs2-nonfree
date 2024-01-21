import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!be", name = "hb", descriptor = "[I")
	private static int[] anIntArray62 = new int[10000];

	@OriginalMember(owner = "client!be", name = "lb", descriptor = "I")
	private static int anInt464 = 0;

	@OriginalMember(owner = "client!be", name = "ob", descriptor = "[I")
	public static int[] anIntArray65 = Class1_Sub2_Sub1_Sub2.anIntArray41;

	@OriginalMember(owner = "client!be", name = "Ab", descriptor = "[I")
	private static int[] anIntArray66 = new int[10000];

	@OriginalMember(owner = "client!be", name = "Bb", descriptor = "[I")
	public static int[] anIntArray67 = Class1_Sub2_Sub1_Sub2.anIntArray38;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!be;Lclient!be;IIIZ)V")
	public static void method495(@OriginalArg(0) Class1_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) Class1_Sub2_Sub2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method504();
		arg0.method507();
		arg1.method504();
		arg1.method507();
		anInt464++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray61;
		@Pc(19) int local19 = arg1.anInt465;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt465; local21++) {
			@Pc(27) Class89 local27 = arg0.aClass89Array1[local21];
			if (local27.anInt4001 != 0) {
				local37 = arg0.anIntArray69[local21] - arg3;
				if (local37 >= arg1.aShort27 && local37 <= arg1.aShort5) {
					@Pc(53) int local53 = arg0.anIntArray61[local21] - arg2;
					if (local53 >= arg1.aShort9 && local53 <= arg1.aShort6) {
						@Pc(69) int local69 = arg0.anIntArray70[local21] - arg4;
						if (local69 >= arg1.aShort8 && local69 <= arg1.aShort3) {
							for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
								@Pc(86) Class89 local86 = arg1.aClass89Array1[local80];
								if (local53 == local16[local80] && local69 == arg1.anIntArray70[local80] && local37 == arg1.anIntArray69[local80] && local86.anInt4001 != 0) {
									if (arg0.aClass89Array2 == null) {
										arg0.aClass89Array2 = new Class89[arg0.anInt465];
									}
									if (arg1.aClass89Array2 == null) {
										arg1.aClass89Array2 = new Class89[local19];
									}
									@Pc(126) Class89 local126 = arg0.aClass89Array2[local21];
									if (local126 == null) {
										local126 = arg0.aClass89Array2[local21] = new Class89(local27);
									}
									@Pc(143) Class89 local143 = arg1.aClass89Array2[local80];
									if (local143 == null) {
										local143 = arg1.aClass89Array2[local80] = new Class89(local86);
									}
									local126.anInt3999 += local86.anInt3999;
									local126.anInt4002 += local86.anInt4002;
									local126.anInt4000 += local86.anInt4000;
									local126.anInt4001 += local86.anInt4001;
									local143.anInt3999 += local27.anInt3999;
									local143.anInt4002 += local27.anInt4002;
									local143.anInt4000 += local27.anInt4000;
									local143.anInt4001 += local27.anInt4001;
									local13++;
									anIntArray62[local21] = anInt464;
									anIntArray66[local80] = anInt464;
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
		for (@Pc(237) int local237 = 0; local237 < arg0.anInt467; local237++) {
			if (anIntArray62[arg0.anIntArray72[local237]] == anInt464 && anIntArray62[arg0.anIntArray64[local237]] == anInt464 && anIntArray62[arg0.anIntArray71[local237]] == anInt464) {
				if (arg0.aByteArray14 == null) {
					arg0.aByteArray14 = new byte[arg0.anInt467];
				}
				arg0.aByteArray14[local237] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt467; local37++) {
			if (anIntArray66[arg1.anIntArray72[local37]] == anInt464 && anIntArray66[arg1.anIntArray64[local37]] == anInt464 && anIntArray66[arg1.anIntArray71[local37]] == anInt464) {
				if (arg1.aByteArray14 == null) {
					arg1.aByteArray14 = new byte[arg1.anInt467];
				}
				arg1.aByteArray14[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ag;II)Lclient!be;")
	public static Class1_Sub2_Sub2_Sub1 method505(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method2243(arg1, 0);
		return local5 == null ? null : new Class1_Sub2_Sub2_Sub1(local5);
	}

	@OriginalMember(owner = "client!be", name = "i", descriptor = "()V")
	public static void method510() {
		anIntArray62 = null;
		anIntArray66 = null;
		anIntArray65 = null;
		anIntArray67 = null;
	}
}

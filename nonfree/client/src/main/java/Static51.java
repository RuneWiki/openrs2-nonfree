import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
	private static int anInt1306 = 0;

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "[I")
	private static final int[] anIntArray128 = new int[10000];

	@OriginalMember(owner = "client!ff", name = "ob", descriptor = "[I")
	public static final int[] anIntArray131 = Class4_Sub1_Sub7_Sub4.anIntArray416;

	@OriginalMember(owner = "client!ff", name = "yb", descriptor = "[I")
	public static final int[] anIntArray134 = Class4_Sub1_Sub7_Sub4.anIntArray412;

	@OriginalMember(owner = "client!ff", name = "Jb", descriptor = "[I")
	private static final int[] anIntArray138 = new int[10000];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ff;Lclient!ff;IIIZ)V")
	public static void method999(@OriginalArg(0) Class4_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) Class4_Sub1_Sub1_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1001();
		arg0.method995();
		arg1.method1001();
		arg1.method995();
		anInt1306++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray130;
		@Pc(19) int local19 = arg1.anInt1307;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1307; local21++) {
			@Pc(27) Class6 local27 = arg0.aClass6Array2[local21];
			if (local27.anInt234 != 0) {
				local37 = arg0.anIntArray135[local21] - arg3;
				if (local37 >= arg1.aShort29 && local37 <= arg1.aShort18) {
					@Pc(53) int local53 = arg0.anIntArray130[local21] - arg2;
					if (local53 >= arg1.aShort20 && local53 <= arg1.aShort16) {
						@Pc(69) int local69 = arg0.anIntArray133[local21] - arg4;
						if (local69 >= arg1.aShort17 && local69 <= arg1.aShort19) {
							for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
								@Pc(86) Class6 local86 = arg1.aClass6Array2[local80];
								if (local53 == local16[local80] && local69 == arg1.anIntArray133[local80] && local37 == arg1.anIntArray135[local80] && local86.anInt234 != 0) {
									if (arg0.aClass6Array1 == null) {
										arg0.aClass6Array1 = new Class6[arg0.anInt1307];
									}
									if (arg1.aClass6Array1 == null) {
										arg1.aClass6Array1 = new Class6[local19];
									}
									@Pc(126) Class6 local126 = arg0.aClass6Array1[local21];
									if (local126 == null) {
										local126 = arg0.aClass6Array1[local21] = new Class6(local27);
									}
									@Pc(143) Class6 local143 = arg1.aClass6Array1[local80];
									if (local143 == null) {
										local143 = arg1.aClass6Array1[local80] = new Class6(local86);
									}
									local126.anInt235 += local86.anInt235;
									local126.anInt228 += local86.anInt228;
									local126.anInt229 += local86.anInt229;
									local126.anInt234 += local86.anInt234;
									local143.anInt235 += local27.anInt235;
									local143.anInt228 += local27.anInt228;
									local143.anInt229 += local27.anInt229;
									local143.anInt234 += local27.anInt234;
									local13++;
									anIntArray128[local21] = anInt1306;
									anIntArray138[local80] = anInt1306;
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
		for (@Pc(237) int local237 = 0; local237 < arg0.anInt1309; local237++) {
			if (anIntArray128[arg0.anIntArray129[local237]] == anInt1306 && anIntArray128[arg0.anIntArray132[local237]] == anInt1306 && anIntArray128[arg0.anIntArray127[local237]] == anInt1306) {
				if (arg0.aByteArray14 == null) {
					arg0.aByteArray14 = new byte[arg0.anInt1309];
				}
				arg0.aByteArray14[local237] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt1309; local37++) {
			if (anIntArray138[arg1.anIntArray129[local37]] == anInt1306 && anIntArray138[arg1.anIntArray132[local37]] == anInt1306 && anIntArray138[arg1.anIntArray127[local37]] == anInt1306) {
				if (arg1.aByteArray14 == null) {
					arg1.aByteArray14 = new byte[arg1.anInt1309];
				}
				arg1.aByteArray14[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!nh;II)Lclient!ff;")
	public static Class4_Sub1_Sub1_Sub6 method1003(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method2878(arg1, 0);
		return local5 == null ? null : new Class4_Sub1_Sub1_Sub6(local5);
	}
}

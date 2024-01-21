import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ei", name = "cb", descriptor = "[I")
	private static int[] anIntArray155 = new int[10000];

	@OriginalMember(owner = "client!ei", name = "lb", descriptor = "I")
	private static int anInt1507 = 0;

	@OriginalMember(owner = "client!ei", name = "nb", descriptor = "[I")
	public static int[] anIntArray156 = Class1_Sub1_Sub1_Sub1.anIntArray11;

	@OriginalMember(owner = "client!ei", name = "ob", descriptor = "[I")
	public static int[] anIntArray157 = Class1_Sub1_Sub1_Sub1.anIntArray8;

	@OriginalMember(owner = "client!ei", name = "Lb", descriptor = "[I")
	private static int[] anIntArray163 = new int[10000];

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "()V")
	public static void method1130() {
		anIntArray163 = null;
		anIntArray155 = null;
		anIntArray156 = null;
		anIntArray157 = null;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ei;Lclient!ei;IIIZ)V")
	public static void method1142(@OriginalArg(0) Class1_Sub1_Sub4_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub4_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1137();
		arg0.method1150();
		arg1.method1137();
		arg1.method1150();
		anInt1507++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray162;
		@Pc(19) int local19 = arg1.anInt1506;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1506; local21++) {
			@Pc(27) Class13 local27 = arg0.aClass13Array1[local21];
			if (local27.anInt703 != 0) {
				local37 = arg0.anIntArray158[local21] - arg3;
				if (local37 >= arg1.aShort36 && local37 <= arg1.aShort28) {
					@Pc(53) int local53 = arg0.anIntArray162[local21] - arg2;
					if (local53 >= arg1.aShort23 && local53 <= arg1.aShort29) {
						@Pc(69) int local69 = arg0.anIntArray161[local21] - arg4;
						if (local69 >= arg1.aShort26 && local69 <= arg1.aShort27) {
							for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
								@Pc(86) Class13 local86 = arg1.aClass13Array1[local80];
								if (local53 == local16[local80] && local69 == arg1.anIntArray161[local80] && local37 == arg1.anIntArray158[local80] && local86.anInt703 != 0) {
									if (arg0.aClass13Array2 == null) {
										arg0.aClass13Array2 = new Class13[arg0.anInt1506];
									}
									if (arg1.aClass13Array2 == null) {
										arg1.aClass13Array2 = new Class13[local19];
									}
									@Pc(126) Class13 local126 = arg0.aClass13Array2[local21];
									if (local126 == null) {
										local126 = arg0.aClass13Array2[local21] = new Class13(local27);
									}
									@Pc(143) Class13 local143 = arg1.aClass13Array2[local80];
									if (local143 == null) {
										local143 = arg1.aClass13Array2[local80] = new Class13(local86);
									}
									local126.anInt702 += local86.anInt702;
									local126.anInt700 += local86.anInt700;
									local126.anInt705 += local86.anInt705;
									local126.anInt703 += local86.anInt703;
									local143.anInt702 += local27.anInt702;
									local143.anInt700 += local27.anInt700;
									local143.anInt705 += local27.anInt705;
									local143.anInt703 += local27.anInt703;
									local13++;
									anIntArray163[local21] = anInt1507;
									anIntArray155[local80] = anInt1507;
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
		for (@Pc(237) int local237 = 0; local237 < arg0.anInt1508; local237++) {
			if (anIntArray163[arg0.anIntArray153[local237]] == anInt1507 && anIntArray163[arg0.anIntArray159[local237]] == anInt1507 && anIntArray163[arg0.anIntArray160[local237]] == anInt1507) {
				if (arg0.aByteArray17 == null) {
					arg0.aByteArray17 = new byte[arg0.anInt1508];
				}
				arg0.aByteArray17[local237] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt1508; local37++) {
			if (anIntArray155[arg1.anIntArray153[local37]] == anInt1507 && anIntArray155[arg1.anIntArray159[local37]] == anInt1507 && anIntArray155[arg1.anIntArray160[local37]] == anInt1507) {
				if (arg1.aByteArray17 == null) {
					arg1.aByteArray17 = new byte[arg1.anInt1508];
				}
				arg1.aByteArray17[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!u;II)Lclient!ei;")
	public static Class1_Sub1_Sub4_Sub3 method1144(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method3316(0, arg1);
		return local5 == null ? null : new Class1_Sub1_Sub4_Sub3(local5);
	}
}

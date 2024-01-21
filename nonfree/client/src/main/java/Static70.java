import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ja", name = "Hb", descriptor = "I")
	private static int anInt2122 = 0;

	@OriginalMember(owner = "client!ja", name = "Kb", descriptor = "[I")
	private static int[] anIntArray181 = new int[10000];

	@OriginalMember(owner = "client!ja", name = "Nb", descriptor = "[I")
	private static int[] anIntArray183 = new int[10000];

	@OriginalMember(owner = "client!ja", name = "Qb", descriptor = "[I")
	public static int[] anIntArray185 = Class1_Sub1_Sub8_Sub4.anIntArray216;

	@OriginalMember(owner = "client!ja", name = "Rb", descriptor = "[I")
	public static int[] anIntArray186 = Class1_Sub1_Sub8_Sub4.anIntArray212;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "()V")
	public static void method1476() {
		anIntArray183 = null;
		anIntArray181 = null;
		anIntArray186 = null;
		anIntArray185 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!dd;II)Lclient!ja;")
	public static Class1_Sub1_Sub5_Sub5 method1483(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method2254(0, arg1);
		return local5 == null ? null : new Class1_Sub1_Sub5_Sub5(local5);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ja;Lclient!ja;IIIZ)V")
	public static void method1484(@OriginalArg(0) Class1_Sub1_Sub5_Sub5 arg0, @OriginalArg(1) Class1_Sub1_Sub5_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1481();
		arg0.method1492();
		arg1.method1481();
		arg1.method1492();
		anInt2122++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray179;
		@Pc(19) int local19 = arg1.anInt2125;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2125; local21++) {
			@Pc(27) Class89 local27 = arg0.aClass89Array2[local21];
			if (local27.anInt4744 != 0) {
				local37 = arg0.anIntArray180[local21] - arg3;
				if (local37 <= arg1.anInt2121) {
					@Pc(48) int local48 = arg0.anIntArray179[local21] - arg2;
					if (local48 >= arg1.anInt2120 && local48 <= arg1.anInt2124) {
						@Pc(64) int local64 = arg0.anIntArray178[local21] - arg4;
						if (local64 >= arg1.anInt2119 && local64 <= arg1.anInt2118) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class89 local81 = arg1.aClass89Array2[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray178[local75] && local37 == arg1.anIntArray180[local75] && local81.anInt4744 != 0) {
									if (arg0.aClass89Array1 == null) {
										arg0.aClass89Array1 = new Class89[arg0.anInt2125];
									}
									if (arg1.aClass89Array1 == null) {
										arg1.aClass89Array1 = new Class89[local19];
									}
									@Pc(121) Class89 local121 = arg0.aClass89Array1[local21];
									if (local121 == null) {
										local121 = arg0.aClass89Array1[local21] = new Class89(local27);
									}
									@Pc(138) Class89 local138 = arg1.aClass89Array1[local75];
									if (local138 == null) {
										local138 = arg1.aClass89Array1[local75] = new Class89(local81);
									}
									local121.anInt4742 += local81.anInt4742;
									local121.anInt4741 += local81.anInt4741;
									local121.anInt4740 += local81.anInt4740;
									local121.anInt4744 += local81.anInt4744;
									local138.anInt4742 += local27.anInt4742;
									local138.anInt4741 += local27.anInt4741;
									local138.anInt4740 += local27.anInt4740;
									local138.anInt4744 += local27.anInt4744;
									local13++;
									anIntArray183[local21] = anInt2122;
									anIntArray181[local75] = anInt2122;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt2117; local232++) {
			if (anIntArray183[arg0.anIntArray177[local232]] == anInt2122 && anIntArray183[arg0.anIntArray182[local232]] == anInt2122 && anIntArray183[arg0.anIntArray187[local232]] == anInt2122) {
				if (arg0.aByteArray24 == null) {
					arg0.aByteArray24 = new byte[arg0.anInt2117];
				}
				arg0.aByteArray24[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2117; local37++) {
			if (anIntArray181[arg1.anIntArray177[local37]] == anInt2122 && anIntArray181[arg1.anIntArray182[local37]] == anInt2122 && anIntArray181[arg1.anIntArray187[local37]] == anInt2122) {
				if (arg1.aByteArray24 == null) {
					arg1.aByteArray24 = new byte[arg1.anInt2117];
				}
				arg1.aByteArray24[local37] = 2;
			}
		}
	}
}

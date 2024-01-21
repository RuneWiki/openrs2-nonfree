import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!sd", name = "Z", descriptor = "[I")
	public static int[] anIntArray330 = Class4_Sub4_Sub5_Sub1.anIntArray119;

	@OriginalMember(owner = "client!sd", name = "mb", descriptor = "[I")
	private static int[] anIntArray334 = new int[10000];

	@OriginalMember(owner = "client!sd", name = "Ab", descriptor = "[I")
	private static int[] anIntArray339 = new int[10000];

	@OriginalMember(owner = "client!sd", name = "Kb", descriptor = "I")
	private static int anInt2392 = 0;

	@OriginalMember(owner = "client!sd", name = "Lb", descriptor = "[I")
	public static int[] anIntArray341 = Class4_Sub4_Sub5_Sub1.anIntArray118;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!sd;Lclient!sd;IIIZ)V")
	public static void method1640(@OriginalArg(0) Class4_Sub4_Sub3_Sub5 arg0, @OriginalArg(1) Class4_Sub4_Sub3_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1651();
		arg0.method1658();
		arg1.method1651();
		arg1.method1658();
		anInt2392++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray333;
		@Pc(19) int local19 = arg1.anInt2386;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2386; local21++) {
			@Pc(27) Class44 local27 = arg0.aClass44Array1[local21];
			if (local27.anInt1725 != 0) {
				local37 = arg0.anIntArray340[local21] - arg3;
				if (local37 <= arg1.anInt2389) {
					@Pc(48) int local48 = arg0.anIntArray333[local21] - arg2;
					if (local48 >= arg1.anInt2391 && local48 <= arg1.anInt2393) {
						@Pc(64) int local64 = arg0.anIntArray337[local21] - arg4;
						if (local64 >= arg1.anInt2388 && local64 <= arg1.anInt2387) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class44 local81 = arg1.aClass44Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray337[local75] && local37 == arg1.anIntArray340[local75] && local81.anInt1725 != 0) {
									if (arg0.aClass44Array2 == null) {
										arg0.aClass44Array2 = new Class44[arg0.anInt2386];
									}
									if (arg1.aClass44Array2 == null) {
										arg1.aClass44Array2 = new Class44[local19];
									}
									@Pc(121) Class44 local121 = arg0.aClass44Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass44Array2[local21] = new Class44(local27);
									}
									@Pc(138) Class44 local138 = arg1.aClass44Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass44Array2[local75] = new Class44(local81);
									}
									local121.anInt1731 += local81.anInt1731;
									local121.anInt1723 += local81.anInt1723;
									local121.anInt1724 += local81.anInt1724;
									local121.anInt1725 += local81.anInt1725;
									local138.anInt1731 += local27.anInt1731;
									local138.anInt1723 += local27.anInt1723;
									local138.anInt1724 += local27.anInt1724;
									local138.anInt1725 += local27.anInt1725;
									local13++;
									anIntArray334[local21] = anInt2392;
									anIntArray339[local75] = anInt2392;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt2390; local232++) {
			if (anIntArray334[arg0.anIntArray331[local232]] == anInt2392 && anIntArray334[arg0.anIntArray332[local232]] == anInt2392 && anIntArray334[arg0.anIntArray335[local232]] == anInt2392) {
				if (arg0.aByteArray53 == null) {
					arg0.aByteArray53 = new byte[arg0.anInt2390];
				}
				arg0.aByteArray53[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2390; local37++) {
			if (anIntArray339[arg1.anIntArray331[local37]] == anInt2392 && anIntArray339[arg1.anIntArray332[local37]] == anInt2392 && anIntArray339[arg1.anIntArray335[local37]] == anInt2392) {
				if (arg1.aByteArray53 == null) {
					arg1.aByteArray53 = new byte[arg1.anInt2390];
				}
				arg1.aByteArray53[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)I")
	public static int method1644(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!la;II)Lclient!sd;")
	public static Class4_Sub4_Sub3_Sub5 method1648(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method290(arg1, 0);
		return local5 == null ? null : new Class4_Sub4_Sub3_Sub5(local5);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
	public static int method1649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "()V")
	public static void method1656() {
		anIntArray334 = null;
		anIntArray339 = null;
		anIntArray341 = null;
		anIntArray330 = null;
	}
}

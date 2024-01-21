import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!je", name = "zb", descriptor = "[I")
	private static int[] anIntArray232 = new int[10000];

	@OriginalMember(owner = "client!je", name = "Db", descriptor = "[I")
	private static int[] anIntArray234 = new int[10000];

	@OriginalMember(owner = "client!je", name = "Ob", descriptor = "I")
	private static int anInt1630 = 0;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "()V")
	public static void method1089() {
		anIntArray232 = null;
		anIntArray234 = null;
		Class1_Sub1_Sub2_Sub5.anIntArray229 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!q;II)Lclient!je;")
	public static Class1_Sub1_Sub2_Sub5 method1097(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method2008(0, arg1);
		return local5 == null ? null : new Class1_Sub1_Sub2_Sub5(local5);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!je;Lclient!je;IIIZ)V")
	public static void method1098(@OriginalArg(0) Class1_Sub1_Sub2_Sub5 arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1088();
		arg0.method1087();
		arg1.method1088();
		arg1.method1087();
		anInt1630++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray239;
		@Pc(19) int local19 = arg1.anInt1631;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1631; local21++) {
			@Pc(27) Class17 local27 = arg0.aClass17Array1[local21];
			if (local27.anInt1056 != 0) {
				local37 = arg0.anIntArray237[local21] - arg3;
				if (local37 <= arg1.anInt1628) {
					@Pc(48) int local48 = arg0.anIntArray239[local21] - arg2;
					if (local48 >= arg1.anInt1625 && local48 <= arg1.anInt1626) {
						@Pc(64) int local64 = arg0.anIntArray227[local21] - arg4;
						if (local64 >= arg1.anInt1632 && local64 <= arg1.anInt1627) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class17 local81 = arg1.aClass17Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray227[local75] && local37 == arg1.anIntArray237[local75] && local81.anInt1056 != 0) {
									if (arg0.aClass17Array2 == null) {
										arg0.aClass17Array2 = new Class17[arg0.anInt1631];
									}
									if (arg1.aClass17Array2 == null) {
										arg1.aClass17Array2 = new Class17[local19];
									}
									@Pc(121) Class17 local121 = arg0.aClass17Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass17Array2[local21] = new Class17(local27);
									}
									@Pc(138) Class17 local138 = arg1.aClass17Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass17Array2[local75] = new Class17(local81);
									}
									local121.anInt1063 += local81.anInt1063;
									local121.anInt1055 += local81.anInt1055;
									local121.anInt1059 += local81.anInt1059;
									local121.anInt1056 += local81.anInt1056;
									local138.anInt1063 += local27.anInt1063;
									local138.anInt1055 += local27.anInt1055;
									local138.anInt1059 += local27.anInt1059;
									local138.anInt1056 += local27.anInt1056;
									local13++;
									anIntArray232[local21] = anInt1630;
									anIntArray234[local75] = anInt1630;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt1633; local232++) {
			if (anIntArray232[arg0.anIntArray230[local232]] == anInt1630 && anIntArray232[arg0.anIntArray231[local232]] == anInt1630 && anIntArray232[arg0.anIntArray236[local232]] == anInt1630) {
				if (arg0.aByteArray44 == null) {
					arg0.aByteArray44 = new byte[arg0.anInt1633];
				}
				arg0.aByteArray44[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt1633; local37++) {
			if (anIntArray234[arg1.anIntArray230[local37]] == anInt1630 && anIntArray234[arg1.anIntArray231[local37]] == anInt1630 && anIntArray234[arg1.anIntArray236[local37]] == anInt1630) {
				if (arg1.aByteArray44 == null) {
					arg1.aByteArray44 = new byte[arg1.anInt1633];
				}
				arg1.aByteArray44[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(II)I")
	public static int method1102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)I")
	public static int method1105(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class1_Sub1_Sub2_Sub5.anIntArray229[arg0];
	}
}

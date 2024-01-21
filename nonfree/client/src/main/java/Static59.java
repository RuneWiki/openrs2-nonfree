import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!kc", name = "rb", descriptor = "[I")
	private static int[] anIntArray193 = new int[10000];

	@OriginalMember(owner = "client!kc", name = "sb", descriptor = "I")
	private static int anInt1333 = 0;

	@OriginalMember(owner = "client!kc", name = "wb", descriptor = "[I")
	private static int[] anIntArray196 = new int[10000];

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I")
	public static int method998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)I")
	public static int method999(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class1_Sub1_Sub2_Sub3.anIntArray204[arg0];
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()V")
	public static void method1000() {
		anIntArray193 = null;
		anIntArray196 = null;
		Class1_Sub1_Sub2_Sub3.anIntArray204 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!kc;Lclient!kc;IIIZ)V")
	public static void method1007(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1011();
		arg0.method1005();
		arg1.method1011();
		arg1.method1005();
		anInt1333++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray202;
		@Pc(19) int local19 = arg1.anInt1334;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1334; local21++) {
			@Pc(27) Class3 local27 = arg0.aClass3Array1[local21];
			if (local27.anInt73 != 0) {
				local37 = arg0.anIntArray203[local21] - arg3;
				if (local37 <= arg1.anInt1341) {
					@Pc(48) int local48 = arg0.anIntArray202[local21] - arg2;
					if (local48 >= arg1.anInt1339 && local48 <= arg1.anInt1338) {
						@Pc(64) int local64 = arg0.anIntArray205[local21] - arg4;
						if (local64 >= arg1.anInt1335 && local64 <= arg1.anInt1337) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class3 local81 = arg1.aClass3Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray205[local75] && local37 == arg1.anIntArray203[local75] && local81.anInt73 != 0) {
									if (arg0.aClass3Array2 == null) {
										arg0.aClass3Array2 = new Class3[arg0.anInt1334];
									}
									if (arg1.aClass3Array2 == null) {
										arg1.aClass3Array2 = new Class3[local19];
									}
									@Pc(121) Class3 local121 = arg0.aClass3Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass3Array2[local21] = new Class3(local27);
									}
									@Pc(138) Class3 local138 = arg1.aClass3Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass3Array2[local75] = new Class3(local81);
									}
									local121.anInt72 += local81.anInt72;
									local121.anInt78 += local81.anInt78;
									local121.anInt74 += local81.anInt74;
									local121.anInt73 += local81.anInt73;
									local138.anInt72 += local27.anInt72;
									local138.anInt78 += local27.anInt78;
									local138.anInt74 += local27.anInt74;
									local138.anInt73 += local27.anInt73;
									local13++;
									anIntArray193[local21] = anInt1333;
									anIntArray196[local75] = anInt1333;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt1336; local232++) {
			if (anIntArray193[arg0.anIntArray198[local232]] == anInt1333 && anIntArray193[arg0.anIntArray195[local232]] == anInt1333 && anIntArray193[arg0.anIntArray201[local232]] == anInt1333) {
				if (arg0.aByteArray11 == null) {
					arg0.aByteArray11 = new byte[arg0.anInt1336];
				}
				arg0.aByteArray11[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt1336; local37++) {
			if (anIntArray196[arg1.anIntArray198[local37]] == anInt1333 && anIntArray196[arg1.anIntArray195[local37]] == anInt1333 && anIntArray196[arg1.anIntArray201[local37]] == anInt1333) {
				if (arg1.aByteArray11 == null) {
					arg1.aByteArray11 = new byte[arg1.anInt1336];
				}
				arg1.aByteArray11[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!pb;II)Lclient!kc;")
	public static Class1_Sub1_Sub2_Sub3 method1010(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1062(arg1, 0);
		return local5 == null ? null : new Class1_Sub1_Sub2_Sub3(local5);
	}
}

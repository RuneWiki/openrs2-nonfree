import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!fe", name = "yb", descriptor = "[I")
	private static int[] anIntArray117 = new int[10000];

	@OriginalMember(owner = "client!fe", name = "Jb", descriptor = "[I")
	private static int[] anIntArray120 = new int[10000];

	@OriginalMember(owner = "client!fe", name = "Qb", descriptor = "I")
	private static int anInt1121 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ef;II)Lclient!fe;")
	public static Class3_Sub1_Sub5_Sub2 method676(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method566(arg1, 0);
		return local5 == null ? null : new Class3_Sub1_Sub5_Sub2(local5);
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "()V")
	public static void method679() {
		anIntArray120 = null;
		anIntArray117 = null;
		Class3_Sub1_Sub5_Sub2.anIntArray116 = null;
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)I")
	public static int method684(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class3_Sub1_Sub5_Sub2.anIntArray116[arg0];
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)I")
	public static int method689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!fe;Lclient!fe;IIIZ)V")
	public static void method692(@OriginalArg(0) Class3_Sub1_Sub5_Sub2 arg0, @OriginalArg(1) Class3_Sub1_Sub5_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method680();
		arg0.method691();
		arg1.method680();
		arg1.method691();
		anInt1121++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray125;
		@Pc(19) int local19 = arg1.anInt1123;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1123; local21++) {
			@Pc(27) Class8 local27 = arg0.aClass8Array1[local21];
			if (local27.anInt290 != 0) {
				local37 = arg0.anIntArray119[local21] - arg3;
				if (local37 <= arg1.anInt1116) {
					@Pc(48) int local48 = arg0.anIntArray125[local21] - arg2;
					if (local48 >= arg1.anInt1119 && local48 <= arg1.anInt1122) {
						@Pc(64) int local64 = arg0.anIntArray118[local21] - arg4;
						if (local64 >= arg1.anInt1118 && local64 <= arg1.anInt1124) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class8 local81 = arg1.aClass8Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray118[local75] && local37 == arg1.anIntArray119[local75] && local81.anInt290 != 0) {
									if (arg0.aClass8Array2 == null) {
										arg0.aClass8Array2 = new Class8[arg0.anInt1123];
									}
									if (arg1.aClass8Array2 == null) {
										arg1.aClass8Array2 = new Class8[local19];
									}
									@Pc(121) Class8 local121 = arg0.aClass8Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass8Array2[local21] = new Class8(local27);
									}
									@Pc(138) Class8 local138 = arg1.aClass8Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass8Array2[local75] = new Class8(local81);
									}
									local121.anInt291 += local81.anInt291;
									local121.anInt292 += local81.anInt292;
									local121.anInt295 += local81.anInt295;
									local121.anInt290 += local81.anInt290;
									local138.anInt291 += local27.anInt291;
									local138.anInt292 += local27.anInt292;
									local138.anInt295 += local27.anInt295;
									local138.anInt290 += local27.anInt290;
									local13++;
									anIntArray120[local21] = anInt1121;
									anIntArray117[local75] = anInt1121;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt1117; local232++) {
			if (anIntArray120[arg0.anIntArray128[local232]] == anInt1121 && anIntArray120[arg0.anIntArray121[local232]] == anInt1121 && anIntArray120[arg0.anIntArray124[local232]] == anInt1121) {
				if (arg0.aByteArray6 == null) {
					arg0.aByteArray6 = new byte[arg0.anInt1117];
				}
				arg0.aByteArray6[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt1117; local37++) {
			if (anIntArray117[arg1.anIntArray128[local37]] == anInt1121 && anIntArray117[arg1.anIntArray121[local37]] == anInt1121 && anIntArray117[arg1.anIntArray124[local37]] == anInt1121) {
				if (arg1.aByteArray6 == null) {
					arg1.aByteArray6 = new byte[arg1.anInt1117];
				}
				arg1.aByteArray6[local37] = 2;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ub", name = "db", descriptor = "[I")
	private static int[] anIntArray455 = new int[10000];

	@OriginalMember(owner = "client!ub", name = "xb", descriptor = "[I")
	private static int[] anIntArray464 = new int[10000];

	@OriginalMember(owner = "client!ub", name = "Eb", descriptor = "I")
	private static int anInt2703 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!oc;II)Lclient!ub;")
	public static Class1_Sub2_Sub3_Sub7 method1886(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1269(arg1, 0);
		return local5 == null ? null : new Class1_Sub2_Sub3_Sub7(local5);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	public static int method1887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ub;Lclient!ub;IIIZ)V")
	public static void method1890(@OriginalArg(0) Class1_Sub2_Sub3_Sub7 arg0, @OriginalArg(1) Class1_Sub2_Sub3_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1882();
		arg0.method1898();
		arg1.method1882();
		arg1.method1898();
		anInt2703++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray456;
		@Pc(19) int local19 = arg1.anInt2699;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2699; local21++) {
			@Pc(27) Class33 local27 = arg0.aClass33Array1[local21];
			if (local27.anInt1218 != 0) {
				local37 = arg0.anIntArray468[local21] - arg3;
				if (local37 <= arg1.anInt2704) {
					@Pc(48) int local48 = arg0.anIntArray456[local21] - arg2;
					if (local48 >= arg1.anInt2696 && local48 <= arg1.anInt2701) {
						@Pc(64) int local64 = arg0.anIntArray459[local21] - arg4;
						if (local64 >= arg1.anInt2702 && local64 <= arg1.anInt2697) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class33 local81 = arg1.aClass33Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray459[local75] && local37 == arg1.anIntArray468[local75] && local81.anInt1218 != 0) {
									if (arg0.aClass33Array2 == null) {
										arg0.aClass33Array2 = new Class33[arg0.anInt2699];
									}
									if (arg1.aClass33Array2 == null) {
										arg1.aClass33Array2 = new Class33[local19];
									}
									@Pc(121) Class33 local121 = arg0.aClass33Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass33Array2[local21] = new Class33(local27);
									}
									@Pc(138) Class33 local138 = arg1.aClass33Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass33Array2[local75] = new Class33(local81);
									}
									local121.anInt1219 += local81.anInt1219;
									local121.anInt1223 += local81.anInt1223;
									local121.anInt1222 += local81.anInt1222;
									local121.anInt1218 += local81.anInt1218;
									local138.anInt1219 += local27.anInt1219;
									local138.anInt1223 += local27.anInt1223;
									local138.anInt1222 += local27.anInt1222;
									local138.anInt1218 += local27.anInt1218;
									local13++;
									anIntArray464[local21] = anInt2703;
									anIntArray455[local75] = anInt2703;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt2700; local232++) {
			if (anIntArray464[arg0.anIntArray457[local232]] == anInt2703 && anIntArray464[arg0.anIntArray458[local232]] == anInt2703 && anIntArray464[arg0.anIntArray461[local232]] == anInt2703) {
				if (arg0.aByteArray37 == null) {
					arg0.aByteArray37 = new byte[arg0.anInt2700];
				}
				arg0.aByteArray37[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2700; local37++) {
			if (anIntArray455[arg1.anIntArray457[local37]] == anInt2703 && anIntArray455[arg1.anIntArray458[local37]] == anInt2703 && anIntArray455[arg1.anIntArray461[local37]] == anInt2703) {
				if (arg1.aByteArray37 == null) {
					arg1.aByteArray37 = new byte[arg1.anInt2700];
				}
				arg1.aByteArray37[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "()V")
	public static void method1891() {
		anIntArray464 = null;
		anIntArray455 = null;
		Class1_Sub2_Sub3_Sub7.anIntArray463 = null;
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)I")
	public static int method1895(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class1_Sub2_Sub3_Sub7.anIntArray463[arg0];
	}
}

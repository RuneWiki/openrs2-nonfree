import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!de", name = "qb", descriptor = "[I")
	private static int[] anIntArray113 = new int[10000];

	@OriginalMember(owner = "client!de", name = "yb", descriptor = "I")
	private static int anInt1041 = 0;

	@OriginalMember(owner = "client!de", name = "Gb", descriptor = "[I")
	private static int[] anIntArray120 = new int[10000];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ff;II)Lclient!de;")
	public static Class2_Sub1_Sub1_Sub6 method540(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method383(0, arg1);
		return local5 == null ? null : new Class2_Sub1_Sub1_Sub6(local5);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)I")
	public static int method543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)I")
	public static int method544(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class2_Sub1_Sub1_Sub6.anIntArray111[arg0];
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!de;Lclient!de;IIIZ)V")
	public static void method547(@OriginalArg(0) Class2_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method546();
		arg0.method556();
		arg1.method546();
		arg1.method556();
		anInt1041++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray116;
		@Pc(19) int local19 = arg1.anInt1042;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1042; local21++) {
			@Pc(27) Class3 local27 = arg0.aClass3Array1[local21];
			if (local27.anInt167 != 0) {
				local37 = arg0.anIntArray123[local21] - arg3;
				if (local37 <= arg1.anInt1044) {
					@Pc(48) int local48 = arg0.anIntArray116[local21] - arg2;
					if (local48 >= arg1.anInt1040 && local48 <= arg1.anInt1039) {
						@Pc(64) int local64 = arg0.anIntArray121[local21] - arg4;
						if (local64 >= arg1.anInt1037 && local64 <= arg1.anInt1038) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class3 local81 = arg1.aClass3Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray121[local75] && local37 == arg1.anIntArray123[local75] && local81.anInt167 != 0) {
									if (arg0.aClass3Array2 == null) {
										arg0.aClass3Array2 = new Class3[arg0.anInt1042];
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
									local121.anInt162 += local81.anInt162;
									local121.anInt161 += local81.anInt161;
									local121.anInt159 += local81.anInt159;
									local121.anInt167 += local81.anInt167;
									local138.anInt162 += local27.anInt162;
									local138.anInt161 += local27.anInt161;
									local138.anInt159 += local27.anInt159;
									local138.anInt167 += local27.anInt167;
									local13++;
									anIntArray113[local21] = anInt1041;
									anIntArray120[local75] = anInt1041;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt1043; local232++) {
			if (anIntArray113[arg0.anIntArray124[local232]] == anInt1041 && anIntArray113[arg0.anIntArray118[local232]] == anInt1041 && anIntArray113[arg0.anIntArray114[local232]] == anInt1041) {
				if (arg0.aByteArray18 == null) {
					arg0.aByteArray18 = new byte[arg0.anInt1043];
				}
				arg0.aByteArray18[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt1043; local37++) {
			if (anIntArray120[arg1.anIntArray124[local37]] == anInt1041 && anIntArray120[arg1.anIntArray118[local37]] == anInt1041 && anIntArray120[arg1.anIntArray114[local37]] == anInt1041) {
				if (arg1.aByteArray18 == null) {
					arg1.aByteArray18 = new byte[arg1.anInt1043];
				}
				arg1.aByteArray18[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "()V")
	public static void method551() {
		anIntArray113 = null;
		anIntArray120 = null;
		Class2_Sub1_Sub1_Sub6.anIntArray111 = null;
	}
}

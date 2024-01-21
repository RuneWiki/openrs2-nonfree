import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!c", name = "tb", descriptor = "[I")
	private static int[] anIntArray53 = new int[10000];

	@OriginalMember(owner = "client!c", name = "Ib", descriptor = "I")
	private static int anInt418 = 0;

	@OriginalMember(owner = "client!c", name = "Yb", descriptor = "[I")
	private static int[] anIntArray65 = new int[10000];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!c;Lclient!c;IIIZ)V")
	public static void method346(@OriginalArg(0) Class1_Sub3_Sub4_Sub1 arg0, @OriginalArg(1) Class1_Sub3_Sub4_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method348();
		arg0.method345();
		arg1.method348();
		arg1.method345();
		anInt418++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray54;
		@Pc(19) int local19 = arg1.anInt415;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt415; local21++) {
			@Pc(27) Class36 local27 = arg0.aClass36Array1[local21];
			if (local27.anInt1305 != 0) {
				local37 = arg0.anIntArray58[local21] - arg3;
				if (local37 <= arg1.anInt417) {
					@Pc(48) int local48 = arg0.anIntArray54[local21] - arg2;
					if (local48 >= arg1.anInt416 && local48 <= arg1.anInt419) {
						@Pc(64) int local64 = arg0.anIntArray59[local21] - arg4;
						if (local64 >= arg1.anInt414 && local64 <= arg1.anInt413) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class36 local81 = arg1.aClass36Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray59[local75] && local37 == arg1.anIntArray58[local75] && local81.anInt1305 != 0) {
									if (arg0.aClass36Array2 == null) {
										arg0.aClass36Array2 = new Class36[arg0.anInt415];
									}
									if (arg1.aClass36Array2 == null) {
										arg1.aClass36Array2 = new Class36[local19];
									}
									@Pc(121) Class36 local121 = arg0.aClass36Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass36Array2[local21] = new Class36(local27);
									}
									@Pc(138) Class36 local138 = arg1.aClass36Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass36Array2[local75] = new Class36(local81);
									}
									local121.anInt1307 += local81.anInt1307;
									local121.anInt1304 += local81.anInt1304;
									local121.anInt1301 += local81.anInt1301;
									local121.anInt1305 += local81.anInt1305;
									local138.anInt1307 += local27.anInt1307;
									local138.anInt1304 += local27.anInt1304;
									local138.anInt1301 += local27.anInt1301;
									local138.anInt1305 += local27.anInt1305;
									local13++;
									anIntArray65[local21] = anInt418;
									anIntArray53[local75] = anInt418;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt421; local232++) {
			if (anIntArray65[arg0.anIntArray55[local232]] == anInt418 && anIntArray65[arg0.anIntArray60[local232]] == anInt418 && anIntArray65[arg0.anIntArray57[local232]] == anInt418) {
				if (arg0.aByteArray13 == null) {
					arg0.aByteArray13 = new byte[arg0.anInt421];
				}
				arg0.aByteArray13[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt421; local37++) {
			if (anIntArray53[arg1.anIntArray55[local37]] == anInt418 && anIntArray53[arg1.anIntArray60[local37]] == anInt418 && anIntArray53[arg1.anIntArray57[local37]] == anInt418) {
				if (arg1.aByteArray13 == null) {
					arg1.aByteArray13 = new byte[arg1.anInt421];
				}
				arg1.aByteArray13[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	public static int method349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)I")
	public static int method352(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class1_Sub3_Sub4_Sub1.anIntArray64[arg0];
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!kb;II)Lclient!c;")
	public static Class1_Sub3_Sub4_Sub1 method357(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1710(arg1, 0);
		return local5 == null ? null : new Class1_Sub3_Sub4_Sub1(local5);
	}

	@OriginalMember(owner = "client!c", name = "j", descriptor = "()V")
	public static void method364() {
		anIntArray65 = null;
		anIntArray53 = null;
		Class1_Sub3_Sub4_Sub1.anIntArray64 = null;
	}
}

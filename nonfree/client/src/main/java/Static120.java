import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!wd", name = "nb", descriptor = "[I")
	private static int[] anIntArray300 = new int[10000];

	@OriginalMember(owner = "client!wd", name = "Jb", descriptor = "[I")
	private static int[] anIntArray306 = new int[10000];

	@OriginalMember(owner = "client!wd", name = "Lb", descriptor = "I")
	private static int anInt2995 = 0;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)I")
	public static int method1981(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class5_Sub1_Sub1_Sub7.anIntArray303[arg0];
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!nb;II)Lclient!wd;")
	public static Class5_Sub1_Sub1_Sub7 method1985(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method679(arg1, 0);
		return local5 == null ? null : new Class5_Sub1_Sub1_Sub7(local5);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)I")
	public static int method1995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!wd;Lclient!wd;IIIZ)V")
	public static void method1999(@OriginalArg(0) Class5_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) Class5_Sub1_Sub1_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1996();
		arg0.method1984();
		arg1.method1996();
		arg1.method1984();
		anInt2995++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray305;
		@Pc(19) int local19 = arg1.anInt2993;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2993; local21++) {
			@Pc(27) Class26 local27 = arg0.aClass26Array1[local21];
			if (local27.anInt985 != 0) {
				local37 = arg0.anIntArray308[local21] - arg3;
				if (local37 <= arg1.anInt2988) {
					@Pc(48) int local48 = arg0.anIntArray305[local21] - arg2;
					if (local48 >= arg1.anInt2991 && local48 <= arg1.anInt2994) {
						@Pc(64) int local64 = arg0.anIntArray296[local21] - arg4;
						if (local64 >= arg1.anInt2989 && local64 <= arg1.anInt2996) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class26 local81 = arg1.aClass26Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray296[local75] && local37 == arg1.anIntArray308[local75] && local81.anInt985 != 0) {
									if (arg0.aClass26Array2 == null) {
										arg0.aClass26Array2 = new Class26[arg0.anInt2993];
									}
									if (arg1.aClass26Array2 == null) {
										arg1.aClass26Array2 = new Class26[local19];
									}
									@Pc(121) Class26 local121 = arg0.aClass26Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass26Array2[local21] = new Class26(local27);
									}
									@Pc(138) Class26 local138 = arg1.aClass26Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass26Array2[local75] = new Class26(local81);
									}
									local121.anInt989 += local81.anInt989;
									local121.anInt987 += local81.anInt987;
									local121.anInt988 += local81.anInt988;
									local121.anInt985 += local81.anInt985;
									local138.anInt989 += local27.anInt989;
									local138.anInt987 += local27.anInt987;
									local138.anInt988 += local27.anInt988;
									local138.anInt985 += local27.anInt985;
									local13++;
									anIntArray306[local21] = anInt2995;
									anIntArray300[local75] = anInt2995;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt2990; local232++) {
			if (anIntArray306[arg0.anIntArray307[local232]] == anInt2995 && anIntArray306[arg0.anIntArray298[local232]] == anInt2995 && anIntArray306[arg0.anIntArray299[local232]] == anInt2995) {
				if (arg0.aByteArray30 == null) {
					arg0.aByteArray30 = new byte[arg0.anInt2990];
				}
				arg0.aByteArray30[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2990; local37++) {
			if (anIntArray300[arg1.anIntArray307[local37]] == anInt2995 && anIntArray300[arg1.anIntArray298[local37]] == anInt2995 && anIntArray300[arg1.anIntArray299[local37]] == anInt2995) {
				if (arg1.aByteArray30 == null) {
					arg1.aByteArray30 = new byte[arg1.anInt2990];
				}
				arg1.aByteArray30[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "()V")
	public static void method2000() {
		anIntArray306 = null;
		anIntArray300 = null;
		Class5_Sub1_Sub1_Sub7.anIntArray303 = null;
	}
}

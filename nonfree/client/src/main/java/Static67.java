import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!lc", name = "mb", descriptor = "[I")
	private static int[] anIntArray212 = new int[10000];

	@OriginalMember(owner = "client!lc", name = "Db", descriptor = "[I")
	private static int[] anIntArray220 = new int[10000];

	@OriginalMember(owner = "client!lc", name = "Ib", descriptor = "I")
	private static int anInt1716 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!we;II)Lclient!lc;")
	public static Class3_Sub1_Sub4_Sub5 method1155(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1512(arg1, 0);
		return local5 == null ? null : new Class3_Sub1_Sub4_Sub5(local5);
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)I")
	public static int method1162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "()V")
	public static void method1167() {
		anIntArray212 = null;
		anIntArray220 = null;
		Class3_Sub1_Sub4_Sub5.anIntArray217 = null;
	}

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)I")
	public static int method1169(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class3_Sub1_Sub4_Sub5.anIntArray217[arg0];
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!lc;Lclient!lc;IIIZ)V")
	public static void method1170(@OriginalArg(0) Class3_Sub1_Sub4_Sub5 arg0, @OriginalArg(1) Class3_Sub1_Sub4_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1168();
		arg0.method1164();
		arg1.method1168();
		arg1.method1164();
		anInt1716++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray214;
		@Pc(19) int local19 = arg1.anInt1719;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1719; local21++) {
			@Pc(27) Class47 local27 = arg0.aClass47Array1[local21];
			if (local27.anInt1722 != 0) {
				local37 = arg0.anIntArray210[local21] - arg3;
				if (local37 <= arg1.anInt1713) {
					@Pc(48) int local48 = arg0.anIntArray214[local21] - arg2;
					if (local48 >= arg1.anInt1711 && local48 <= arg1.anInt1718) {
						@Pc(64) int local64 = arg0.anIntArray216[local21] - arg4;
						if (local64 >= arg1.anInt1717 && local64 <= arg1.anInt1714) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class47 local81 = arg1.aClass47Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray216[local75] && local37 == arg1.anIntArray210[local75] && local81.anInt1722 != 0) {
									if (arg0.aClass47Array2 == null) {
										arg0.aClass47Array2 = new Class47[arg0.anInt1719];
									}
									if (arg1.aClass47Array2 == null) {
										arg1.aClass47Array2 = new Class47[local19];
									}
									@Pc(121) Class47 local121 = arg0.aClass47Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass47Array2[local21] = new Class47(local27);
									}
									@Pc(138) Class47 local138 = arg1.aClass47Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass47Array2[local75] = new Class47(local81);
									}
									local121.anInt1723 += local81.anInt1723;
									local121.anInt1729 += local81.anInt1729;
									local121.anInt1725 += local81.anInt1725;
									local121.anInt1722 += local81.anInt1722;
									local138.anInt1723 += local27.anInt1723;
									local138.anInt1729 += local27.anInt1729;
									local138.anInt1725 += local27.anInt1725;
									local138.anInt1722 += local27.anInt1722;
									local13++;
									anIntArray212[local21] = anInt1716;
									anIntArray220[local75] = anInt1716;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt1712; local232++) {
			if (anIntArray212[arg0.anIntArray209[local232]] == anInt1716 && anIntArray212[arg0.anIntArray213[local232]] == anInt1716 && anIntArray212[arg0.anIntArray211[local232]] == anInt1716) {
				if (arg0.aByteArray36 == null) {
					arg0.aByteArray36 = new byte[arg0.anInt1712];
				}
				arg0.aByteArray36[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt1712; local37++) {
			if (anIntArray220[arg1.anIntArray209[local37]] == anInt1716 && anIntArray220[arg1.anIntArray213[local37]] == anInt1716 && anIntArray220[arg1.anIntArray211[local37]] == anInt1716) {
				if (arg1.aByteArray36 == null) {
					arg1.aByteArray36 = new byte[arg1.anInt1712];
				}
				arg1.aByteArray36[local37] = 2;
			}
		}
	}
}

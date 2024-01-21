import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!nf", name = "Bb", descriptor = "[I")
	private static int[] anIntArray287 = new int[10000];

	@OriginalMember(owner = "client!nf", name = "Db", descriptor = "[I")
	private static int[] anIntArray288 = new int[10000];

	@OriginalMember(owner = "client!nf", name = "Eb", descriptor = "I")
	private static int anInt2174 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!nf;Lclient!nf;IIIZ)V")
	public static void method1409(@OriginalArg(0) Class1_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1426();
		arg0.method1421();
		arg1.method1426();
		arg1.method1421();
		anInt2174++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray281;
		@Pc(19) int local19 = arg1.anInt2168;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2168; local21++) {
			@Pc(27) Class37 local27 = arg0.aClass37Array2[local21];
			if (local27.anInt1627 != 0) {
				local37 = arg0.anIntArray285[local21] - arg3;
				if (local37 <= arg1.anInt2170) {
					@Pc(48) int local48 = arg0.anIntArray281[local21] - arg2;
					if (local48 >= arg1.anInt2169 && local48 <= arg1.anInt2171) {
						@Pc(64) int local64 = arg0.anIntArray279[local21] - arg4;
						if (local64 >= arg1.anInt2176 && local64 <= arg1.anInt2173) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class37 local81 = arg1.aClass37Array2[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray279[local75] && local37 == arg1.anIntArray285[local75] && local81.anInt1627 != 0) {
									if (arg0.aClass37Array1 == null) {
										arg0.aClass37Array1 = new Class37[arg0.anInt2168];
									}
									if (arg1.aClass37Array1 == null) {
										arg1.aClass37Array1 = new Class37[local19];
									}
									@Pc(121) Class37 local121 = arg0.aClass37Array1[local21];
									if (local121 == null) {
										local121 = arg0.aClass37Array1[local21] = new Class37(local27);
									}
									@Pc(138) Class37 local138 = arg1.aClass37Array1[local75];
									if (local138 == null) {
										local138 = arg1.aClass37Array1[local75] = new Class37(local81);
									}
									local121.anInt1628 += local81.anInt1628;
									local121.anInt1634 += local81.anInt1634;
									local121.anInt1630 += local81.anInt1630;
									local121.anInt1627 += local81.anInt1627;
									local138.anInt1628 += local27.anInt1628;
									local138.anInt1634 += local27.anInt1634;
									local138.anInt1630 += local27.anInt1630;
									local138.anInt1627 += local27.anInt1627;
									local13++;
									anIntArray287[local21] = anInt2174;
									anIntArray288[local75] = anInt2174;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt2175; local232++) {
			if (anIntArray287[arg0.anIntArray282[local232]] == anInt2174 && anIntArray287[arg0.anIntArray286[local232]] == anInt2174 && anIntArray287[arg0.anIntArray290[local232]] == anInt2174) {
				if (arg0.aByteArray37 == null) {
					arg0.aByteArray37 = new byte[arg0.anInt2175];
				}
				arg0.aByteArray37[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2175; local37++) {
			if (anIntArray288[arg1.anIntArray282[local37]] == anInt2174 && anIntArray288[arg1.anIntArray286[local37]] == anInt2174 && anIntArray288[arg1.anIntArray290[local37]] == anInt2174) {
				if (arg1.aByteArray37 == null) {
					arg1.aByteArray37 = new byte[arg1.anInt2175];
				}
				arg1.aByteArray37[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ie;II)Lclient!nf;")
	public static Class1_Sub1_Sub1_Sub4 method1412(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1573(arg1, 0);
		return local5 == null ? null : new Class1_Sub1_Sub1_Sub4(local5);
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "()V")
	public static void method1414() {
		anIntArray287 = null;
		anIntArray288 = null;
		Class1_Sub1_Sub1_Sub4.anIntArray289 = null;
	}

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)I")
	public static int method1418(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class1_Sub1_Sub1_Sub4.anIntArray289[arg0];
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)I")
	public static int method1423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}

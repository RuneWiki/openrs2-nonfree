import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ed", name = "eb", descriptor = "[I")
	private static int[] anIntArray61 = new int[10000];

	@OriginalMember(owner = "client!ed", name = "ub", descriptor = "I")
	private static int anInt658 = 0;

	@OriginalMember(owner = "client!ed", name = "Db", descriptor = "[I")
	public static int[] anIntArray66 = Class2_Sub1_Sub4_Sub4.anIntArray248;

	@OriginalMember(owner = "client!ed", name = "Kb", descriptor = "[I")
	public static int[] anIntArray68 = Class2_Sub1_Sub4_Sub4.anIntArray251;

	@OriginalMember(owner = "client!ed", name = "Nb", descriptor = "[I")
	private static int[] anIntArray70 = new int[10000];

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)I")
	public static int method546(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)I")
	public static int method553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ed;Lclient!ed;IIIZ)V")
	public static void method557(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method543();
		arg0.method551();
		arg1.method543();
		arg1.method551();
		anInt658++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray62;
		@Pc(19) int local19 = arg1.anInt656;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt656; local21++) {
			@Pc(27) Class54 local27 = arg0.aClass54Array2[local21];
			if (local27.anInt1656 != 0) {
				local37 = arg0.anIntArray65[local21] - arg3;
				if (local37 <= arg1.anInt661) {
					@Pc(48) int local48 = arg0.anIntArray62[local21] - arg2;
					if (local48 >= arg1.anInt659 && local48 <= arg1.anInt655) {
						@Pc(64) int local64 = arg0.anIntArray63[local21] - arg4;
						if (local64 >= arg1.anInt657 && local64 <= arg1.anInt660) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class54 local81 = arg1.aClass54Array2[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray63[local75] && local37 == arg1.anIntArray65[local75] && local81.anInt1656 != 0) {
									if (arg0.aClass54Array1 == null) {
										arg0.aClass54Array1 = new Class54[arg0.anInt656];
									}
									if (arg1.aClass54Array1 == null) {
										arg1.aClass54Array1 = new Class54[local19];
									}
									@Pc(121) Class54 local121 = arg0.aClass54Array1[local21];
									if (local121 == null) {
										local121 = arg0.aClass54Array1[local21] = new Class54(local27);
									}
									@Pc(138) Class54 local138 = arg1.aClass54Array1[local75];
									if (local138 == null) {
										local138 = arg1.aClass54Array1[local75] = new Class54(local81);
									}
									local121.anInt1660 += local81.anInt1660;
									local121.anInt1652 += local81.anInt1652;
									local121.anInt1654 += local81.anInt1654;
									local121.anInt1656 += local81.anInt1656;
									local138.anInt1660 += local27.anInt1660;
									local138.anInt1652 += local27.anInt1652;
									local138.anInt1654 += local27.anInt1654;
									local138.anInt1656 += local27.anInt1656;
									local13++;
									anIntArray61[local21] = anInt658;
									anIntArray70[local75] = anInt658;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt662; local232++) {
			if (anIntArray61[arg0.anIntArray67[local232]] == anInt658 && anIntArray61[arg0.anIntArray64[local232]] == anInt658 && anIntArray61[arg0.anIntArray69[local232]] == anInt658) {
				if (arg0.aByteArray15 == null) {
					arg0.aByteArray15 = new byte[arg0.anInt662];
				}
				arg0.aByteArray15[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt662; local37++) {
			if (anIntArray70[arg1.anIntArray67[local37]] == anInt658 && anIntArray70[arg1.anIntArray64[local37]] == anInt658 && anIntArray70[arg1.anIntArray69[local37]] == anInt658) {
				if (arg1.aByteArray15 == null) {
					arg1.aByteArray15 = new byte[arg1.anInt662];
				}
				arg1.aByteArray15[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!na;II)Lclient!ed;")
	public static Class2_Sub1_Sub1_Sub2 method559(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1666(0, arg1);
		return local5 == null ? null : new Class2_Sub1_Sub1_Sub2(local5);
	}

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "()V")
	public static void method560() {
		anIntArray61 = null;
		anIntArray70 = null;
		anIntArray68 = null;
		anIntArray66 = null;
	}
}

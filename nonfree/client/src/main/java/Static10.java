import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bd", name = "tb", descriptor = "I")
	private static int anInt284 = 0;

	@OriginalMember(owner = "client!bd", name = "Hb", descriptor = "[I")
	private static int[] anIntArray16 = new int[10000];

	@OriginalMember(owner = "client!bd", name = "Tb", descriptor = "[I")
	private static int[] anIntArray22 = new int[10000];

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!bd;Lclient!bd;IIIZ)V")
	public static void method214(@OriginalArg(0) Class3_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) Class3_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method219();
		arg0.method228();
		arg1.method219();
		arg1.method228();
		anInt284++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray15;
		@Pc(19) int local19 = arg1.anInt285;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt285; local21++) {
			@Pc(27) Class63 local27 = arg0.aClass63Array1[local21];
			if (local27.anInt2435 != 0) {
				local37 = arg0.anIntArray12[local21] - arg3;
				if (local37 <= arg1.anInt287) {
					@Pc(48) int local48 = arg0.anIntArray15[local21] - arg2;
					if (local48 >= arg1.anInt288 && local48 <= arg1.anInt290) {
						@Pc(64) int local64 = arg0.anIntArray19[local21] - arg4;
						if (local64 >= arg1.anInt292 && local64 <= arg1.anInt289) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class63 local81 = arg1.aClass63Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray19[local75] && local37 == arg1.anIntArray12[local75] && local81.anInt2435 != 0) {
									if (arg0.aClass63Array2 == null) {
										arg0.aClass63Array2 = new Class63[arg0.anInt285];
									}
									if (arg1.aClass63Array2 == null) {
										arg1.aClass63Array2 = new Class63[local19];
									}
									@Pc(121) Class63 local121 = arg0.aClass63Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass63Array2[local21] = new Class63(local27);
									}
									@Pc(138) Class63 local138 = arg1.aClass63Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass63Array2[local75] = new Class63(local81);
									}
									local121.anInt2437 += local81.anInt2437;
									local121.anInt2431 += local81.anInt2431;
									local121.anInt2433 += local81.anInt2433;
									local121.anInt2435 += local81.anInt2435;
									local138.anInt2437 += local27.anInt2437;
									local138.anInt2431 += local27.anInt2431;
									local138.anInt2433 += local27.anInt2433;
									local138.anInt2435 += local27.anInt2435;
									local13++;
									anIntArray22[local21] = anInt284;
									anIntArray16[local75] = anInt284;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt291; local232++) {
			if (anIntArray22[arg0.anIntArray13[local232]] == anInt284 && anIntArray22[arg0.anIntArray25[local232]] == anInt284 && anIntArray22[arg0.anIntArray24[local232]] == anInt284) {
				if (arg0.aByteArray5 == null) {
					arg0.aByteArray5 = new byte[arg0.anInt291];
				}
				arg0.aByteArray5[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt291; local37++) {
			if (anIntArray16[arg1.anIntArray13[local37]] == anInt284 && anIntArray16[arg1.anIntArray25[local37]] == anInt284 && anIntArray16[arg1.anIntArray24[local37]] == anInt284) {
				if (arg1.aByteArray5 == null) {
					arg1.aByteArray5 = new byte[arg1.anInt291];
				}
				arg1.aByteArray5[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)I")
	public static int method216(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class3_Sub1_Sub2_Sub1.anIntArray18[arg0];
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!tb;II)Lclient!bd;")
	public static Class3_Sub1_Sub2_Sub1 method222(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1146(arg1, 0);
		return local5 == null ? null : new Class3_Sub1_Sub2_Sub1(local5);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)I")
	public static int method230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "()V")
	public static void method232() {
		anIntArray22 = null;
		anIntArray16 = null;
		Class3_Sub1_Sub2_Sub1.anIntArray18 = null;
	}
}

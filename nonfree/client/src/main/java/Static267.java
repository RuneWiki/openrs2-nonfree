import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "Lclient!rn;")
	public static Class155 aClass155_112;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
	public static int anInt5436 = -1;

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString196 = "Choose Option";

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
	public static int anInt5440 = 2;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
	public static int anInt5441 = 0;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString197 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
	public static void method4411() {
		Static153.aClass98_21.method2571();
		Static304.aClass98_46.method2571();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZZ)V")
	public static void method4413(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static283.aBoolean393 && arg0) {
			local11 = 1;
			local13 = Static249.aByteArrayArray111;
		} else {
			local11 = 4;
			local13 = Static44.aByteArrayArray18;
		}
		@Pc(27) int[] local27 = null;
		for (@Pc(29) int local29 = 0; local29 < local11; local29++) {
			Static174.method2872();
			for (@Pc(40) int local40 = 0; local40 < 13; local40++) {
				for (@Pc(47) int local47 = 0; local47 < 13; local47++) {
					@Pc(52) boolean local52 = false;
					@Pc(60) int local60 = Static120.anIntArrayArrayArray9[local29][local40][local47];
					if (local60 != -1) {
						@Pc(72) int local72 = local60 >> 24 & 0x3;
						if (!arg0 || local72 == 0) {
							@Pc(82) int local82 = local60 >> 1 & 0x3;
							@Pc(88) int local88 = local60 >> 14 & 0x3FF;
							@Pc(94) int local94 = local60 >> 3 & 0x7FF;
							@Pc(104) int local104 = local94 / 8 + (local88 / 8 << 8);
							for (@Pc(106) int local106 = 0; local106 < Static297.anIntArray220.length; local106++) {
								if (Static297.anIntArray220[local106] == local104 && local13[local106] != null) {
									local52 = true;
									@Pc(142) int[] local142 = Static229.method3781(local72, local94, arg0, local82, Static138.aClass153Array1, local29, local13[local106], local40 * 8, local47 * 8, local88);
									if (local27 == null && local142 != null) {
										local27 = local142;
									}
									break;
								}
							}
						}
					}
					if (!local52) {
						Static289.method4753(8, local29, local40 * 8, local47 * 8, 8);
					}
				}
			}
		}
		if (local27 == null) {
			Static238.anInt4825 = -1;
			return;
		}
		Static90.anInt1670 = local27[4];
		Static25.anInt465 = local27[3];
		Static310.anInt6101 = local27[2];
		Static238.anInt4825 = local27[0];
		Static248.anInt5000 = local27[1];
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!rn;BII)[Lclient!ho;")
	public static Class3_Sub4_Sub12[] method4415(@OriginalArg(0) Class155 arg0, @OriginalArg(3) int arg1) {
		return Static115.method1878(0, arg0, arg1) ? Static113.method1826() : null;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)V")
	public static void method4416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg3 + arg5;
		@Pc(15) int local15 = arg1 - arg5;
		@Pc(19) int local19 = arg5 + arg2;
		@Pc(21) int local21;
		for (local21 = arg3; local21 < local10; local21++) {
			Static235.method3988(arg0, Static129.anIntArrayArray40[local21], arg4, arg2);
		}
		for (local21 = arg1; local21 > local15; local21--) {
			Static235.method3988(arg0, Static129.anIntArrayArray40[local21], arg4, arg2);
		}
		@Pc(64) int local64 = arg4 - arg5;
		for (local21 = local10; local21 <= local15; local21++) {
			@Pc(77) int[] local77 = Static129.anIntArrayArray40[local21];
			Static235.method3988(arg0, local77, local19, arg2);
			Static235.method3988(arg0, local77, arg4, local64);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!rn;)V")
	public static void method4417(@OriginalArg(1) Class155 arg0) {
		Static23.aClass155_19 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)V")
	public static void method4418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class172 local3 = Static266.method4409(arg0);
		@Pc(6) int local6 = local3.anInt5445;
		@Pc(24) int local24 = local3.anInt5442;
		@Pc(27) int local27 = local3.anInt5438;
		@Pc(33) int local33 = Class3_Sub2_Sub6.anIntArray64[local27 - local24];
		if (arg1 < 0 || arg1 > local33) {
			arg1 = 0;
		}
		local33 <<= local24;
		Static219.method3604(arg1 << local24 & local33 | ~local33 & Static229.anIntArray496[local6], local6);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BIIIIII)V")
	public static void method4420(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 - arg5 >= Static175.anInt3267 && Static204.anInt4020 >= arg0 + arg5 && Static245.anInt6027 <= arg2 - arg5 && arg2 + arg5 <= Static111.anInt2039) {
			Static45.method684(arg2, arg5, arg0, arg1, arg4, arg3);
		} else {
			Static209.method4934(arg0, arg1, arg3, arg5, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
	public static void method4421(@OriginalArg(1) int arg0) {
		if (Static245.method4932(arg0)) {
			Static200.method3313(-1, Static96.aClass151ArrayArray1[arg0]);
		}
	}
}

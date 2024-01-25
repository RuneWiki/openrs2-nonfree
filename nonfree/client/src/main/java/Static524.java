import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Lclient!hla;")
	public static Class3_Sub7_Sub10 aClass3_Sub7_Sub10_2;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Lclient!ik;")
	public static Class182 aClass182_104;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_31 = new Class320(12);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLclient!aba;)I")
	public static int method7013(@OriginalArg(1) Class3_Sub2_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method216(2);
		@Pc(26) int local26;
		if (local10 == 0) {
			local26 = 0;
		} else if (local10 == 1) {
			local26 = arg0.method216(5);
		} else if (local10 == 2) {
			local26 = arg0.method216(8);
		} else {
			local26 = arg0.method216(11);
		}
		return local26;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)Z")
	public static boolean method7014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLclient!rf;Lclient!ka;Lclient!rf;)V")
	public static void method7015(@OriginalArg(1) Class45 arg0, @OriginalArg(2) Class170 arg1, @OriginalArg(3) Class45 arg2) {
		if (arg0.method6571() && arg2.method6571()) {
			@Pc(14) Class149 local14 = arg0.aClass149_4;
			@Pc(17) Class149 local17 = arg2.aClass149_4;
			arg1.method8353(local14.aBooleanArray7, arg2.aClass79_8.aClass3_Sub7_Sub6_2, arg0.anInt7617, arg2.anInt7617, arg0.aClass79_8.aClass3_Sub7_Sub6_2, arg0.aClass79_8.anInt2465, local14.anIntArray275[arg0.anInt7637], arg0.aClass79_8.aClass3_Sub7_Sub6_1, arg0.aClass79_8.anInt2469, arg2.aClass79_8.anInt2465, arg2.aClass79_8.aClass3_Sub7_Sub6_1, local17.anIntArray275[arg2.anInt7637], local14.aBoolean230 | local17.aBoolean230, arg2.aClass79_8.anInt2469);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBI[BII)Z")
	public static boolean method7016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(15) int local15;
		if (local9 == 0) {
			local15 = 0;
		} else {
			local15 = 8 - local9;
		}
		@Pc(28) int local28 = -((arg4 + 8 - 1) / 8);
		@Pc(38) int local38 = -((arg0 + 8 - 1) / 8);
		for (@Pc(40) int local40 = local28; local40 < 0; local40++) {
			for (@Pc(48) int local48 = local38; local48 < 0; local48++) {
				if (arg3[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local15;
			if (arg3[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg2;
		}
		return false;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/String;Z[B)I")
	public static int method7017(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(17) int local17 = arg1.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19 += 4) {
			@Pc(29) int local29 = Static340.method4862(arg1.charAt(local19));
			@Pc(44) int local44 = local17 <= local19 + 1 ? -1 : Static340.method4862(arg1.charAt(local19 + 1));
			@Pc(60) int local60 = local19 + 2 < local17 ? Static340.method4862(arg1.charAt(local19 + 2)) : -1;
			@Pc(76) int local76 = local17 > local19 + 3 ? Static340.method4862(arg1.charAt(local19 + 3)) : -1;
			arg2[arg0++] = (byte) (local44 >>> 4 | local29 << 2);
			if (local60 == -1) {
				break;
			}
			arg2[arg0++] = (byte) (local60 >>> 2 | (local44 & 0xF) << 4);
			if (local76 == -1) {
				break;
			}
			arg2[arg0++] = (byte) ((local60 & 0x3) << 6 | local76);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Z")
	public static boolean method7018(@OriginalArg(0) int arg0) {
		return Static74.anInt1708 != 0;
	}
}

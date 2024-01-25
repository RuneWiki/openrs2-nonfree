import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
	public static int anInt7467;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_155 = new Class180(77, 28);

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)Z")
	public static boolean method6585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static414.method5908(arg0, arg1) & Static169.method3086(arg0, arg1);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!bba;)V")
	public static void method6586(@OriginalArg(1) Class28_Sub1_Sub1_Sub1 arg0) {
		@Pc(15) int local15 = arg0.anInt10780 - Static588.anInt9467;
		@Pc(27) int local27 = arg0.anInt10764 * 512 + arg0.method9314() * 256;
		@Pc(38) int local38 = arg0.anInt10784 * 512 + arg0.method9314() * 256;
		arg0.anInt10729 += (local27 - arg0.anInt10729) / local15;
		arg0.anInt10811 = 0;
		arg0.anInt10731 += (local38 - arg0.anInt10731) / local15;
		if (arg0.anInt10776 == 0) {
			arg0.method9308(8192);
		}
		if (arg0.anInt10776 == 1) {
			arg0.method9308(12288);
		}
		if (arg0.anInt10776 == 2) {
			arg0.method9308(0);
		}
		if (arg0.anInt10776 == 3) {
			arg0.method9308(4096);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II[BBIII)Z")
	public static boolean method6587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg0 + 7) / 8);
		@Pc(42) int local42 = -((arg4 + 8 - 1) / 8);
		for (@Pc(49) int local49 = local32; local49 < 0; local49++) {
			for (@Pc(53) int local53 = local42; local53 < 0; local53++) {
				if (arg2[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local19;
			if (arg2[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!dga;I[[B)V")
	public static void method6588(@OriginalArg(0) Class73_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0.anInt1875; local15++) {
			Static72.method1380();
			for (@Pc(21) int local21 = 0; local21 < Static158.anInt927 >> 3; local21++) {
				for (@Pc(25) int local25 = 0; local25 < Static515.anInt8292 >> 3; local25++) {
					@Pc(35) int local35 = Static637.anIntArrayArrayArray20[local15][local21][local25];
					if (local35 != -1) {
						@Pc(44) int local44 = local35 >> 24 & 0x3;
						if (!arg0.aBoolean147 || local44 == 0) {
							@Pc(55) int local55 = local35 >> 1 & 0x3;
							@Pc(61) int local61 = local35 >> 14 & 0x3FF;
							@Pc(67) int local67 = local35 >> 3 & 0x7FF;
							@Pc(77) int local77 = local67 / 8 + (local61 / 8 << 8);
							for (@Pc(79) int local79 = 0; local79 < Static77.anIntArray125.length; local79++) {
								if (Static77.anIntArray125[local79] == local77 && arg1[local79] != null) {
									arg0.method1812(local44, Static1.aClass252Array5, local21 * 8, local25 * 8, Static674.aClass13_22, local15, (local61 & 0x7) * 8, (local67 & 0x7) * 8, local55, arg1[local79]);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method6589(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static153.aString28 = Static153.aString28 + arg0[0];
			Static369.anInt5956 += arg0[0].length();
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11].startsWith("pause")) {
				@Pc(21) int local21 = 5;
				try {
					local21 = Integer.parseInt(arg0[local11].substring(6));
				} catch (@Pc(30) Exception local30) {
				}
				Static238.method4024("Pausing for " + local21 + " seconds...");
				Static216.aStringArray11 = arg0;
				Static438.anInt6924 = local11 + 1;
				Static657.aLong305 = (long) (local21 * 1000) + Static524.method7320();
				return;
			}
			Static153.aString28 = arg0[local11];
			Static462.method6720(false);
		}
	}
}

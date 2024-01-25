import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V")
	public static void method9441() {
		Static412.anInt7313 = 0;
		Static482.anInt8391 = -1;
		Static493.anInt8491 = -1;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!wka;)V")
	public static void method9442(@OriginalArg(1) Class19_Sub1_Sub3_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt7812 - Static269.anInt4883;
		@Pc(21) int local21 = arg0.anInt7811 * 512 + arg0.method6592() * 256;
		@Pc(41) int local41 = arg0.anInt7816 * 512 + arg0.method6592() * 256;
		arg0.anInt11204 += (local21 - arg0.anInt11204) / local9;
		arg0.anInt11211 += (local41 - arg0.anInt11211) / local9;
		arg0.anInt7821 = 0;
		if (arg0.anInt7817 == 0) {
			arg0.method6604(8192);
		}
		if (arg0.anInt7817 == 1) {
			arg0.method6604(12288);
		}
		if (arg0.anInt7817 == 2) {
			arg0.method6604(0);
		}
		if (arg0.anInt7817 == 3) {
			arg0.method6604(4096);
		}
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(B)[Lclient!qk;")
	public static Class304[] method9444() {
		return new Class304[] { Static536.aClass304_12, Static63.aClass304_6, Static335.aClass304_11 };
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method9445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg4 && arg7 == arg2 && arg5 == arg8 && arg0 == arg1) {
			Static396.method5961(arg1, arg3, arg4, arg7, arg8);
			return;
		}
		@Pc(29) int local29 = arg4;
		@Pc(31) int local31 = arg7;
		@Pc(35) int local35 = arg4 * 3;
		@Pc(39) int local39 = arg7 * 3;
		@Pc(43) int local43 = arg6 * 3;
		@Pc(47) int local47 = arg2 * 3;
		@Pc(51) int local51 = arg5 * 3;
		@Pc(55) int local55 = arg0 * 3;
		@Pc(65) int local65 = local43 + arg8 - arg4 - local51;
		@Pc(75) int local75 = local47 + arg1 - local55 - arg7;
		@Pc(86) int local86 = local51 + local35 - local43 - local43;
		@Pc(97) int local97 = local55 + local39 - local47 - local47;
		@Pc(102) int local102 = local43 - local35;
		@Pc(106) int local106 = local47 - local39;
		for (@Pc(108) int local108 = 128; local108 <= 4096; local108 += 128) {
			@Pc(116) int local116 = local108 * local108 >> 12;
			@Pc(122) int local122 = local108 * local116 >> 12;
			@Pc(126) int local126 = local65 * local122;
			@Pc(130) int local130 = local75 * local122;
			@Pc(134) int local134 = local86 * local116;
			@Pc(138) int local138 = local97 * local116;
			@Pc(142) int local142 = local102 * local108;
			@Pc(146) int local146 = local108 * local106;
			@Pc(156) int local156 = (local142 + local134 + local126 >> 12) + arg4;
			@Pc(167) int local167 = (local130 + local138 + local146 >> 12) + arg7;
			Static396.method5961(local167, arg3, local29, local31, local156);
			local29 = local156;
			local31 = local167;
		}
	}
}

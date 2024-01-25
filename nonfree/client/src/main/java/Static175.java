import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!il", name = "f", descriptor = "Lclient!dn;")
	public static Class56 aClass56_59;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_160 = new Class184(43, 6);

	@OriginalMember(owner = "client!il", name = "d", descriptor = "Z")
	public static boolean aBoolean343 = false;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_152 = new Class175(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg0;
		@Pc(21) int local21 = arg6 - arg0;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(69) int local69 = local25 * (1 - local57) + local41;
		@Pc(77) int local77 = local29 - local45 * (local57 - 1);
		@Pc(86) int local86 = local49 + local33 * (1 - local61);
		@Pc(94) int local94 = local37 - local53 * (local61 - 1);
		@Pc(98) int local98 = local25 << 2;
		@Pc(102) int local102 = local29 << 2;
		@Pc(106) int local106 = local33 << 2;
		@Pc(110) int local110 = local37 << 2;
		@Pc(114) int local114 = local41 * 3;
		@Pc(120) int local120 = local45 * (local57 - 3);
		@Pc(128) int local128 = local49 * 3;
		@Pc(134) int local134 = local53 * (local61 - 3);
		@Pc(136) int local136 = local102;
		@Pc(142) int local142 = local98 * (arg6 - 1);
		@Pc(144) int local144 = local110;
		@Pc(150) int local150 = local106 * (local21 - 1);
		@Pc(178) int local178;
		@Pc(186) int local186;
		@Pc(194) int local194;
		@Pc(202) int local202;
		if (Static161.anInt3448 <= arg5 && Static163.anInt3488 >= arg5) {
			@Pc(168) int[] local168 = Static376.anIntArrayArray64[arg5];
			local178 = Static439.method5863(arg1 - arg3, Static450.anInt7594, Static142.anInt3212);
			local186 = Static439.method5863(arg1 + arg3, Static450.anInt7594, Static142.anInt3212);
			local194 = Static439.method5863(arg1 - local16, Static450.anInt7594, Static142.anInt3212);
			local202 = Static439.method5863(local16 + arg1, Static450.anInt7594, Static142.anInt3212);
			Static15.method463(arg2, local168, local178, local194);
			Static15.method463(arg4, local168, local194, local202);
			Static15.method463(arg2, local168, local202, local186);
		}
		while (local9 > 0) {
			@Pc(233) boolean local233 = local21 >= local9;
			if (local69 < 0) {
				while (local69 < 0) {
					local77 += local136;
					local69 += local114;
					local114 += local102;
					local7++;
					local136 += local102;
				}
			}
			if (local233) {
				if (local86 < 0) {
					while (local86 < 0) {
						local86 += local128;
						local94 += local144;
						local11++;
						local128 += local110;
						local144 += local110;
					}
				}
				if (local94 < 0) {
					local94 += local144;
					local86 += local128;
					local128 += local110;
					local11++;
					local144 += local110;
				}
				local94 += -local134;
				local86 += -local150;
				local150 -= local106;
				local134 -= local106;
			}
			if (local77 < 0) {
				local77 += local136;
				local69 += local114;
				local7++;
				local136 += local102;
				local114 += local102;
			}
			local69 += -local142;
			local77 += -local120;
			local9--;
			local142 -= local98;
			local120 -= local98;
			local178 = arg5 - local9;
			local186 = local9 + arg5;
			if (local186 >= Static161.anInt3448 && local178 <= Static163.anInt3488) {
				local194 = Static439.method5863(local7 + arg1, Static450.anInt7594, Static142.anInt3212);
				local202 = Static439.method5863(arg1 - local7, Static450.anInt7594, Static142.anInt3212);
				if (local233) {
					@Pc(415) int local415 = Static439.method5863(local11 + arg1, Static450.anInt7594, Static142.anInt3212);
					@Pc(426) int local426 = Static439.method5863(arg1 - local11, Static450.anInt7594, Static142.anInt3212);
					@Pc(437) int[] local437;
					if (Static161.anInt3448 <= local178) {
						local437 = Static376.anIntArrayArray64[local178];
						Static15.method463(arg2, local437, local202, local426);
						Static15.method463(arg4, local437, local426, local415);
						Static15.method463(arg2, local437, local415, local194);
					}
					if (Static163.anInt3488 >= local186) {
						local437 = Static376.anIntArrayArray64[local186];
						Static15.method463(arg2, local437, local202, local426);
						Static15.method463(arg4, local437, local426, local415);
						Static15.method463(arg2, local437, local415, local194);
					}
				} else {
					if (local178 >= Static161.anInt3448) {
						Static15.method463(arg2, Static376.anIntArrayArray64[local178], local202, local194);
					}
					if (Static163.anInt3488 >= local186) {
						Static15.method463(arg2, Static376.anIntArrayArray64[local186], local202, local194);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!eo;B)Lclient!eo;")
	public static Class68 method3706(@OriginalArg(0) Class68 arg0) {
		@Pc(11) Class68 local11 = Static56.method1155(arg0);
		if (local11 == null) {
			local11 = arg0.aClass68_2;
		}
		return local11;
	}
}

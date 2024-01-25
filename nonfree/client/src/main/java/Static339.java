import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!nga", name = "q", descriptor = "I")
	public static int anInt6128;

	@OriginalMember(owner = "client!nga", name = "w", descriptor = "I")
	public static int anInt6133;

	@OriginalMember(owner = "client!nga", name = "x", descriptor = "Lclient!tl;")
	public static Class319 aClass319_9;

	@OriginalMember(owner = "client!nga", name = "n", descriptor = "Lclient!pd;")
	public static final Class247 aClass247_9 = new Class247();

	@OriginalMember(owner = "client!nga", name = "z", descriptor = "[Lclient!cb;")
	public static final Class42[] aClass42Array1 = new Class42[16];

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg1 == arg2 && arg4 == arg6 && arg5 == arg7 && arg8 == arg3) {
			Static308.method4871(arg3, arg0, arg1, arg5, arg4);
			return;
		}
		@Pc(23) int local23 = arg1;
		@Pc(25) int local25 = arg4;
		@Pc(29) int local29 = arg1 * 3;
		@Pc(33) int local33 = arg4 * 3;
		@Pc(37) int local37 = arg2 * 3;
		@Pc(41) int local41 = arg6 * 3;
		@Pc(45) int local45 = arg7 * 3;
		@Pc(49) int local49 = arg8 * 3;
		@Pc(58) int local58 = local37 + arg5 - local45 - arg1;
		@Pc(68) int local68 = local41 + arg3 - arg4 - local49;
		@Pc(78) int local78 = local29 + local45 - local37 - local37;
		@Pc(86) int local86 = local33 + local49 - local41 - local41;
		@Pc(91) int local91 = local37 - local29;
		@Pc(96) int local96 = local41 - local33;
		for (@Pc(98) int local98 = 128; local98 <= 4096; local98 += 128) {
			@Pc(106) int local106 = local98 * local98 >> 12;
			@Pc(112) int local112 = local98 * local106 >> 12;
			@Pc(116) int local116 = local58 * local112;
			@Pc(120) int local120 = local112 * local68;
			@Pc(124) int local124 = local78 * local106;
			@Pc(128) int local128 = local86 * local106;
			@Pc(132) int local132 = local91 * local98;
			@Pc(136) int local136 = local98 * local96;
			@Pc(147) int local147 = (local124 + local116 + local132 >> 12) + arg1;
			@Pc(157) int local157 = (local136 + local128 + local120 >> 12) + arg4;
			Static308.method4871(local157, arg0, local23, local147, local25);
			local23 = local147;
			local25 = local157;
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZLclient!rr;I)V")
	public static void method5265(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class292 arg1) {
		@Pc(15) int local15 = arg1.anInt7896 == 0 ? arg1.anInt7963 : arg1.anInt7896;
		@Pc(24) int local24 = arg1.anInt7949 == 0 ? arg1.anInt7912 : arg1.anInt7949;
		Static321.method5071(local15, local24, arg0, Static14.aClass292ArrayArray1[arg1.anInt7890 >> 16], arg1.anInt7890);
		if (arg1.aClass292Array2 != null) {
			Static321.method5071(local15, local24, arg0, arg1.aClass292Array2, arg1.anInt7890);
		}
		@Pc(59) Class6_Sub11 local59 = (Class6_Sub11) Static224.aClass128_23.method3263((long) arg1.anInt7890);
		if (local59 != null) {
			Static67.method1356(local15, local59.anInt1216, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(II)V")
	public static void method5269(@OriginalArg(0) int arg0) {
		Static562.anInt9257 = -1;
		Static538.anInt8915 = arg0;
		Static562.anInt9257 = -1;
		Static125.method7473();
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method5270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static542.method7335(arg5);
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg5 - arg4;
		if (local21 < 0) {
			local21 = 0;
		}
		@Pc(30) int local30 = arg5;
		@Pc(33) int local33 = -arg5;
		@Pc(35) int local35 = local21;
		@Pc(38) int local38 = -local21;
		@Pc(40) int local40 = -1;
		@Pc(59) int local59;
		@Pc(68) int local68;
		@Pc(76) int local76;
		@Pc(84) int local84;
		if (Static583.anInt9478 <= arg0 && Static415.anInt9494 >= arg0) {
			@Pc(50) int[] local50 = Static454.anIntArrayArray71[arg0];
			local59 = Static201.method3634(arg3 - arg5, Static461.anInt7899, Static13.anInt7634);
			local68 = Static201.method3634(arg3 + arg5, Static461.anInt7899, Static13.anInt7634);
			local76 = Static201.method3634(arg3 - local21, Static461.anInt7899, Static13.anInt7634);
			local84 = Static201.method3634(arg3 + local21, Static461.anInt7899, Static13.anInt7634);
			Static208.method3687(local59, arg1, local50, local76);
			Static208.method3687(local76, arg2, local50, local84);
			Static208.method3687(local84, arg1, local50, local68);
		}
		@Pc(104) int local104 = -1;
		while (local16 < local30) {
			local104 += 2;
			local40 += 2;
			local38 += local104;
			local33 += local40;
			if (local38 >= 0 && local35 >= 1) {
				local35--;
				local38 -= local35 << 1;
				Static147.anIntArray692[local35] = local16;
			}
			local16++;
			@Pc(249) int local249;
			@Pc(258) int local258;
			@Pc(269) int[] local269;
			@Pc(155) int local155;
			if (local33 >= 0) {
				local30--;
				local33 -= local30 << 1;
				local155 = arg0 - local30;
				local59 = local30 + arg0;
				if (Static583.anInt9478 <= local59 && Static415.anInt9494 >= local155) {
					if (local30 >= local21) {
						local68 = Static201.method3634(local16 + arg3, Static461.anInt7899, Static13.anInt7634);
						local76 = Static201.method3634(arg3 - local16, Static461.anInt7899, Static13.anInt7634);
						if (local59 <= Static415.anInt9494) {
							Static208.method3687(local76, arg1, Static454.anIntArrayArray71[local59], local68);
						}
						if (local155 >= Static583.anInt9478) {
							Static208.method3687(local76, arg1, Static454.anIntArrayArray71[local155], local68);
						}
					} else {
						local68 = Static147.anIntArray692[local30];
						local76 = Static201.method3634(local16 + arg3, Static461.anInt7899, Static13.anInt7634);
						local84 = Static201.method3634(arg3 - local16, Static461.anInt7899, Static13.anInt7634);
						local249 = Static201.method3634(local68 + arg3, Static461.anInt7899, Static13.anInt7634);
						local258 = Static201.method3634(arg3 - local68, Static461.anInt7899, Static13.anInt7634);
						if (local59 <= Static415.anInt9494) {
							local269 = Static454.anIntArrayArray71[local59];
							Static208.method3687(local84, arg1, local269, local258);
							Static208.method3687(local258, arg2, local269, local249);
							Static208.method3687(local249, arg1, local269, local76);
						}
						if (local155 >= Static583.anInt9478) {
							local269 = Static454.anIntArrayArray71[local155];
							Static208.method3687(local84, arg1, local269, local258);
							Static208.method3687(local258, arg2, local269, local249);
							Static208.method3687(local249, arg1, local269, local76);
						}
					}
				}
			}
			local155 = arg0 - local16;
			local59 = arg0 + local16;
			if (Static583.anInt9478 <= local59 && Static415.anInt9494 >= local155) {
				local68 = arg3 + local30;
				local76 = arg3 - local30;
				if (Static13.anInt7634 <= local68 && Static461.anInt7899 >= local76) {
					local68 = Static201.method3634(local68, Static461.anInt7899, Static13.anInt7634);
					local76 = Static201.method3634(local76, Static461.anInt7899, Static13.anInt7634);
					if (local21 <= local16) {
						if (Static415.anInt9494 >= local59) {
							Static208.method3687(local76, arg1, Static454.anIntArrayArray71[local59], local68);
						}
						if (local155 >= Static583.anInt9478) {
							Static208.method3687(local76, arg1, Static454.anIntArrayArray71[local155], local68);
						}
					} else {
						local84 = local16 > local35 ? Static147.anIntArray692[local16] : local35;
						local249 = Static201.method3634(arg3 + local84, Static461.anInt7899, Static13.anInt7634);
						local258 = Static201.method3634(arg3 - local84, Static461.anInt7899, Static13.anInt7634);
						if (local59 <= Static415.anInt9494) {
							local269 = Static454.anIntArrayArray71[local59];
							Static208.method3687(local76, arg1, local269, local258);
							Static208.method3687(local258, arg2, local269, local249);
							Static208.method3687(local249, arg1, local269, local68);
						}
						if (local155 >= Static583.anInt9478) {
							local269 = Static454.anIntArrayArray71[local155];
							Static208.method3687(local76, arg1, local269, local258);
							Static208.method3687(local258, arg2, local269, local249);
							Static208.method3687(local249, arg1, local269, local68);
						}
					}
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIB)V")
	public static void method2968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class3_Sub7_Sub19 local12 = Static73.method5992(10, arg3);
		local12.method7363();
		local12.anInt9381 = arg2;
		local12.anInt9383 = arg1;
		local12.anInt9377 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!pn;IIIII)V")
	public static void method2971(@OriginalArg(0) Class25_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static590.anInt10277) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static349.anInt6237) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static414.anInt7451 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class333 local62 = Static189.aClass333ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static256.aClass127Array3[local17].method7862(local32, local23) + Static256.aClass127Array3[local17].method7862(local32, local23 + 1) + Static256.aClass127Array3[local17].method7862(local32 + 1, local23) + Static256.aClass127Array3[local17].method7862(local32 + 1, local23 + 1)) / 4 - (Static256.aClass127Array3[arg1].method7862(arg3, arg2) + Static256.aClass127Array3[arg1].method7862(arg3, arg2 + 1) + Static256.aClass127Array3[arg1].method7862(arg3 + 1, arg2) + Static256.aClass127Array3[arg1].method7862(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class25_Sub2_Sub3 local151 = local62.aClass25_Sub2_Sub3_2;
									@Pc(154) Class25_Sub2_Sub3 local154 = local62.aClass25_Sub2_Sub3_1;
									if (local151 != null && local151.method6643()) {
										arg0.method6654(local148, (local23 - arg2) * Static331.anInt6010 + (1 - arg4) * Static211.anInt8485, Static68.aClass31_4, local1, (local32 - arg3) * Static331.anInt6010 + (1 - arg5) * Static211.anInt8485, local151);
									}
									if (local154 != null && local154.method6643()) {
										arg0.method6654(local148, (local23 - arg2) * Static331.anInt6010 + (1 - arg4) * Static211.anInt8485, Static68.aClass31_4, local1, (local32 - arg3) * Static331.anInt6010 + (1 - arg5) * Static211.anInt8485, local154);
									}
									for (@Pc(227) Class147 local227 = local62.aClass147_3; local227 != null; local227 = local227.aClass147_2) {
										@Pc(231) Class25_Sub2_Sub2 local231 = local227.aClass25_Sub2_Sub2_1;
										if (local231 != null && local231.method6643() && (local23 == local231.aShort106 || local23 == local3) && (local32 == local231.aShort107 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort108 + 1 - local231.aShort106;
											@Pc(268) int local268 = local231.aShort109 + 1 - local231.aShort107;
											arg0.method6654(local148, (local231.aShort106 - arg2) * Static331.anInt6010 + (local260 - arg4) * Static211.anInt8485, Static68.aClass31_4, local1, (local231.aShort107 - arg3) * Static331.anInt6010 + (local268 - arg5) * Static211.anInt8485, local231);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILclient!vca;Lclient!kt;ILclient!r;)Z")
	public static boolean method2973(@OriginalArg(2) Class338 arg0, @OriginalArg(3) Class3_Sub33 arg1, @OriginalArg(5) Class31 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray561 != null) {
			local13 = Static157.anInt2667 - (Static157.anInt2667 - Static157.anInt2664) * (-Static157.anInt2666 + arg0.anInt9732 + arg1.anInt5495) / (Static157.anInt2669 - Static157.anInt2666);
			local9 = (arg1.anInt5494 + arg0.anInt9746 - Static157.anInt2672) * (Static157.anInt2668 - Static157.anInt2662) / (Static157.anInt2665 - Static157.anInt2672) + Static157.anInt2662;
			local11 = Static157.anInt2667 - (Static157.anInt2667 - Static157.anInt2664) * (arg0.anInt9720 + arg1.anInt5495 - Static157.anInt2666) / (Static157.anInt2669 - Static157.anInt2666);
			local7 = Static157.anInt2662 + (arg0.anInt9745 + arg1.anInt5494 - Static157.anInt2672) * (-Static157.anInt2662 + Static157.anInt2668) / (Static157.anInt2665 - Static157.anInt2672);
		}
		@Pc(104) Class73 local104 = null;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		if (arg0.anInt9741 != -1) {
			if (arg1.aBoolean376 && arg0.anInt9728 != -1) {
				local104 = arg0.method7654(arg2, true);
			} else {
				local104 = arg0.method7654(arg2, false);
			}
			if (local104 != null) {
				local106 = arg1.anInt5489 - (local104.A() + 1 >> 1);
				local108 = arg1.anInt5489 + (local104.A() + 1 >> 1);
				if (local7 > local106) {
					local7 = local106;
				}
				if (local9 < local108) {
					local9 = local108;
				}
				local110 = arg1.anInt5488 - (local104.ca() + 1 >> 1);
				if (local110 < local11) {
					local11 = local110;
				}
				local112 = arg1.anInt5488 + (local104.ca() + 1 >> 1);
				if (local13 < local112) {
					local13 = local112;
				}
			}
		}
		@Pc(214) Class262 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(278) int local278;
		@Pc(305) int local305;
		if (arg0.aString255 != null) {
			local214 = Static151.method2836(arg0.anInt9742);
			if (local214 != null) {
				local216 = Static441.aClass328_10.method7374(arg0.aString255, null, null, Static243.aStringArray43);
				local218 = arg1.anInt5488;
				if (local104 == null) {
					local218 -= local216 * local214.method5836() / 2;
				} else {
					local218 -= (local104.ca() >> 1) + (local216 * local214.method5833());
				}
				for (local278 = 0; local278 < local216; local278++) {
					@Pc(284) String local284 = Static243.aStringArray43[local278];
					if (local216 - 1 > local278) {
						local284 = local284.substring(0, local284.length() - 4);
					}
					local305 = local214.method5834(local284);
					if (local305 > local220) {
						local220 = local305;
					}
				}
				local222 = arg1.anInt5489 - local220 / 2;
				local224 = arg1.anInt5489 + local220 / 2;
				if (local222 < local7) {
					local7 = local222;
				}
				if (local224 > local9) {
					local9 = local224;
				}
				local226 = local218;
				if (local226 < local11) {
					local11 = local226;
				}
				local228 = local218 + local214.method5833() * local216;
				if (local228 > local13) {
					local13 = local228;
				}
			}
		}
		if (Static157.anInt2662 > local9 || Static157.anInt2668 < local7 || local13 < Static157.anInt2664 || local11 > Static157.anInt2667) {
			return true;
		}
		@Pc(421) int local421;
		if (arg0.anIntArray561 != null) {
			@Pc(419) int[] local419 = new int[arg0.anIntArray561.length];
			for (local421 = 0; local421 < local419.length / 2; local421++) {
				local305 = arg1.anInt5494 + arg0.anIntArray561[local421 * 2];
				@Pc(446) int local446 = arg0.anIntArray561[local421 * 2 + 1] + arg1.anInt5495;
				local419[local421 * 2] = (Static157.anInt2668 - Static157.anInt2662) * (-Static157.anInt2672 + local305) / (Static157.anInt2665 - Static157.anInt2672) + Static157.anInt2662;
				local419[local421 * 2 + 1] = Static157.anInt2667 - (local446 - Static157.anInt2666) * (-Static157.anInt2664 + Static157.anInt2667) / (Static157.anInt2669 - Static157.anInt2666);
			}
			Static316.method4690(arg2, local419, arg0.anInt9738);
			for (local305 = 0; local305 < local419.length / 2 - 1; local305++) {
				arg2.method8088(arg0.anInt9726, local419[local305 * 2 + 1], local419[local305 * 2 + 1 + 2], local419[local305 * 2], local419[(local305 + 1) * 2]);
			}
			arg2.method8088(arg0.anInt9726, local419[local419.length - 1], local419[1], local419[local419.length - 2], local419[0]);
		}
		if (local104 != null) {
			if (Static438.anInt4270 > 0 && (Static158.anInt3573 != -1 && arg1.anInt5496 == Static158.anInt3573 || Static372.anInt6490 != -1 && Static372.anInt6490 == arg0.anInt9749)) {
				if (Static21.anInt211 <= 50) {
					local278 = Static21.anInt211 * 2;
				} else {
					local278 = 200 - Static21.anInt211 * 2;
				}
				local421 = local278 << 24 | 0xFFFF00;
				arg2.method8072(arg1.anInt5488, local104.E() / 2 + 7, local421, arg1.anInt5489);
				arg2.method8072(arg1.anInt5488, local104.E() / 2 + 5, local421, arg1.anInt5489);
				arg2.method8072(arg1.anInt5488, local104.E() / 2 + 3, local421, arg1.anInt5489);
				arg2.method8072(arg1.anInt5488, local104.E() / 2 + 1, local421, arg1.anInt5489);
				arg2.method8072(arg1.anInt5488, local104.E() / 2, local421, arg1.anInt5489);
			}
			local104.method7957(arg1.anInt5489 - (local104.A() >> 1), arg1.anInt5488 + -(local104.ca() >> 1));
		}
		if (arg0.aString255 != null && local214 != null) {
			Static483.method6563(local216, local218, arg1, local214, local220, arg2, arg0);
		}
		if (arg0.anInt9741 != -1 || arg0.aString255 != null) {
			@Pc(740) Class3_Sub21 local740 = new Class3_Sub21(arg1);
			local740.anInt3728 = local110;
			local740.anInt3732 = local112;
			local740.anInt3733 = local108;
			local740.anInt3735 = local228;
			local740.anInt3730 = local222;
			local740.anInt3737 = local224;
			local740.anInt3729 = local226;
			local740.anInt3734 = local106;
			Static448.aClass244_72.method5570(local740);
		}
		return false;
	}
}

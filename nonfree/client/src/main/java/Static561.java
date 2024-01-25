import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "[Lclient!iga;")
	public static Class11_Sub5_Sub1_Sub1[] aClass11_Sub5_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "Lclient!tb;")
	public static final Class316 aClass316_6 = new Class316();

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIIZIII)Z")
	public static boolean method7582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static218.method3260(arg6, arg5, arg4)) {
			return false;
		}
		@Pc(15) int local15 = Static174.anIntArray148[0];
		@Pc(19) int local19 = Static174.anIntArray148[2];
		@Pc(23) int local23 = Static174.anIntArray148[1];
		if (!Static218.method3260(arg1, arg7, arg0)) {
			return false;
		}
		@Pc(40) int local40 = Static174.anIntArray148[2];
		@Pc(44) int local44 = Static174.anIntArray148[0];
		@Pc(48) int local48 = Static174.anIntArray148[1];
		if (Static218.method3260(arg3, arg2, arg8)) {
			@Pc(60) int local60 = Static174.anIntArray148[2];
			@Pc(64) int local64 = Static174.anIntArray148[1];
			@Pc(68) int local68 = Static174.anIntArray148[0];
			return Static35.method643(local68, local64, local19, local40, local48, local23, local15, local44, local60);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBIII)V")
	public static void method7583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(91) Class360 local91 = Static568.aClass360ArrayArrayArray22[arg1][arg2][arg0];
		if (local91 != null) {
			if (arg3 == 1) {
				local91.aShort121 = 0;
			} else if (arg3 == 2) {
				local91.aShort123 = 0;
			}
		}
		Static180.method7714();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIILclient!ad;I)V")
	public static void method7585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub4 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt230 == -1 && arg3.anIntArray9 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg3.anInt229 < arg4) {
			local15 = arg4 - arg3.anInt229;
		} else if (arg3.anInt238 > arg4) {
			local15 = arg3.anInt238 - arg4;
		}
		@Pc(52) int local52 = arg3.anInt228 * Static86.aClass1_Sub30_Sub1_1.anInt6196 >> 8;
		if (arg3.anInt224 < arg1) {
			local15 += arg1 - arg3.anInt224;
		} else if (arg3.anInt225 > arg1) {
			local15 += arg3.anInt225 - arg1;
		}
		if (arg3.anInt233 == 0 || local15 - 256 > arg3.anInt233 || Static86.aClass1_Sub30_Sub1_1.anInt6196 == 0 || arg2 != arg3.anInt232) {
			if (arg3.aClass1_Sub6_Sub4_1 != null) {
				Static425.aClass1_Sub6_Sub3_2.method6532(arg3.aClass1_Sub6_Sub4_1);
				arg3.aClass1_Sub6_Sub4_1 = null;
				arg3.aClass1_Sub49_2 = null;
				arg3.aClass1_Sub13_Sub1_2 = null;
			}
			if (arg3.aClass1_Sub6_Sub4_2 != null) {
				Static425.aClass1_Sub6_Sub3_2.method6532(arg3.aClass1_Sub6_Sub4_2);
				arg3.aClass1_Sub49_1 = null;
				arg3.aClass1_Sub13_Sub1_1 = null;
				arg3.aClass1_Sub6_Sub4_2 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(153) int local153 = (arg3.anInt233 - local15) * local52 / arg3.anInt233;
		Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.method6058();
		@Pc(159) int local159 = 8192;
		@Pc(170) int local170 = (arg3.anInt229 + arg3.anInt238) / 2 - arg4;
		@Pc(181) int local181 = (arg3.anInt225 + arg3.anInt224) / 2 - arg1;
		@Pc(208) int local208;
		@Pc(224) int local224;
		if (local170 != 0 || local181 != 0) {
			local208 = -Static175.anInt3256 - (int) (Math.atan2((double) local170, (double) local181) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local208 > 8192) {
				local208 = 16384 - local208;
			}
			if (local15 <= 0) {
				local224 = 8192;
			} else if (local15 >= 4096) {
				local224 = 16384;
			} else {
				local224 = local15 * 8192 / 4096 + 8192;
			}
			local159 = (16384 - local224 >> 1) + local224 * local208 / 8192;
		}
		@Pc(330) Class1_Sub6_Sub4 local330;
		if (arg3.aClass1_Sub6_Sub4_1 != null) {
			arg3.aClass1_Sub6_Sub4_1.method6619(local153);
			arg3.aClass1_Sub6_Sub4_1.method6612(local159);
		} else if (arg3.anInt230 >= 0) {
			local208 = arg3.anInt239 == 256 && arg3.anInt240 == 256 ? 256 : Static5.method85(arg3.anInt240, arg3.anInt239);
			if (arg3.aBoolean5) {
				if (arg3.aClass1_Sub49_2 == null) {
					arg3.aClass1_Sub49_2 = Static562.method7595(Static133.aClass308_53, arg3.anInt230);
				}
				if (arg3.aClass1_Sub49_2 != null) {
					if (arg3.aClass1_Sub13_Sub1_2 == null) {
						arg3.aClass1_Sub13_Sub1_2 = arg3.aClass1_Sub49_2.method7594(new int[] { 22050 });
					}
					if (arg3.aClass1_Sub13_Sub1_2 != null) {
						local330 = Static605.method6617(arg3.aClass1_Sub13_Sub1_2, local208, local153 << 6, local159);
						local330.method6620(-1);
						Static425.aClass1_Sub6_Sub3_2.method6530(local330);
						arg3.aClass1_Sub6_Sub4_1 = local330;
					}
				}
			} else {
				@Pc(347) Class249 local347 = Static603.method5368(Static341.aClass308_120, arg3.anInt230, 0);
				if (local347 != null) {
					@Pc(354) Class1_Sub13_Sub1 local354 = local347.method5369().method805(Static44.aClass227_1);
					@Pc(362) Class1_Sub6_Sub4 local362 = Static605.method6617(local354, local208, local153 << 6, local159);
					local362.method6620(-1);
					Static425.aClass1_Sub6_Sub3_2.method6530(local362);
					arg3.aClass1_Sub6_Sub4_1 = local362;
				}
			}
		}
		if (arg3.aClass1_Sub6_Sub4_2 != null) {
			arg3.aClass1_Sub6_Sub4_2.method6619(local153);
			arg3.aClass1_Sub6_Sub4_2.method6612(local159);
			if (arg3.aClass1_Sub6_Sub4_2.method7907()) {
				return;
			}
			arg3.aClass1_Sub49_1 = null;
			arg3.aClass1_Sub6_Sub4_2 = null;
			arg3.aClass1_Sub13_Sub1_1 = null;
		} else if (arg3.anIntArray9 != null && (arg3.anInt236 -= arg0) <= 0) {
			local208 = arg3.anInt239 == 256 && arg3.anInt240 == 256 ? 256 : (int) ((double) (arg3.anInt239 - arg3.anInt240) * Math.random()) + arg3.anInt240;
			if (arg3.aBoolean6) {
				if (arg3.aClass1_Sub49_1 == null) {
					local224 = (int) (Math.random() * (double) arg3.anIntArray9.length);
					arg3.aClass1_Sub49_1 = Static562.method7595(Static133.aClass308_53, arg3.anIntArray9[local224]);
				}
				if (arg3.aClass1_Sub49_1 != null) {
					if (arg3.aClass1_Sub13_Sub1_1 == null) {
						arg3.aClass1_Sub13_Sub1_1 = arg3.aClass1_Sub49_1.method7594(new int[] { 22050 });
					}
					if (arg3.aClass1_Sub13_Sub1_1 != null) {
						local330 = Static605.method6617(arg3.aClass1_Sub13_Sub1_1, local208, local153 << 6, local159);
						local330.method6620(0);
						Static425.aClass1_Sub6_Sub3_2.method6530(local330);
						arg3.anInt236 = (int) ((double) (arg3.anInt241 - arg3.anInt234) * Math.random()) + arg3.anInt234;
						arg3.aClass1_Sub6_Sub4_2 = local330;
						return;
					}
				}
				return;
			}
			local224 = (int) ((double) arg3.anIntArray9.length * Math.random());
			@Pc(509) Class249 local509 = Static603.method5368(Static341.aClass308_120, arg3.anIntArray9[local224], 0);
			if (local509 != null) {
				@Pc(516) Class1_Sub13_Sub1 local516 = local509.method5369().method805(Static44.aClass227_1);
				@Pc(524) Class1_Sub6_Sub4 local524 = Static605.method6617(local516, local208, local153 << 6, local159);
				local524.method6620(0);
				Static425.aClass1_Sub6_Sub3_2.method6530(local524);
				arg3.anInt236 = (int) ((double) (arg3.anInt241 - arg3.anInt234) * Math.random()) + arg3.anInt234;
				arg3.aClass1_Sub6_Sub4_2 = local524;
				return;
			}
		}
	}
}

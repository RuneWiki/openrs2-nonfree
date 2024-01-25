import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "Lclient!jn;")
	public static Class176 aClass176_28;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "J")
	public static long aLong41 = 0L;

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "Z")
	public static boolean aBoolean83 = false;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BIII)I")
	public static int method1260(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!ff;Lclient!r;Lclient!vc;)V")
	public static void method1261(@OriginalArg(1) Class4_Sub17 arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) Class338 arg2) {
		@Pc(10) Class78 local10 = arg2.method7974(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.E();
		if (local16 < local10.u()) {
			local16 = local10.u();
		}
		@Pc(28) int local28 = arg0.anInt2871;
		@Pc(31) int local31 = arg0.anInt2868;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(78) int local78;
		if (arg2.aString92 != null) {
			local33 = Static211.aClass114_7.method2947(arg2.aString92, Static283.aStringArray73, null, null);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static283.aStringArray73[local51];
				if (local33 - 1 > local51) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local78 = Static471.aClass183_8.method4392(local57);
				if (local35 < local78) {
					local35 = local78;
				}
			}
			local37 = Static471.aClass183_8.method4386() * local33 + Static471.aClass183_8.method4390() / 2;
		}
		local51 = local16 / 2 + arg0.anInt2871;
		@Pc(108) int local108 = arg0.anInt2868;
		if (local28 < Static455.anInt3441 + local16) {
			local51 = local35 / 2 + local16 / 2 + Static455.anInt3441 + 5 + 10;
			local28 = Static455.anInt3441;
		} else if (local28 > Static455.anInt3444 - local16) {
			local51 = Static455.anInt3444 - local35 / 2 - local16 / 2 - 5 - 10;
			local28 = Static455.anInt3444 - local16;
		}
		if (Static455.anInt3447 + local16 > local31) {
			local108 = local16 / 2 + Static455.anInt3447 + 10;
			local31 = Static455.anInt3447;
		} else if (local31 > Static455.anInt3449 - local16) {
			local31 = Static455.anInt3449 - local16;
			local108 = Static455.anInt3449 - local37 - local16 / 2 - 10;
		}
		local78 = (int) (Math.atan2((double) (local28 - arg0.anInt2871), (double) (local31 - arg0.anInt2868)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method8189((float) local16 / 2.0F + (float) local28, (float) local31 + (float) local16 / 2.0F, 4096, local78);
		@Pc(244) int local244 = -2;
		@Pc(246) int local246 = -2;
		@Pc(248) int local248 = -2;
		@Pc(250) int local250 = -2;
		if (arg2.aString92 != null) {
			local244 = local51 - local35 / 2 - 5;
			local246 = local108;
			local250 = local33 * Static471.aClass183_8.method4386() + local108 + 3;
			local248 = local244 + local35 + 10;
			if (arg2.anInt9759 != 0) {
				arg1.method5006(local244, local248 - local244, local108, arg2.anInt9759, local250 - local108);
			}
			if (arg2.anInt9761 != 0) {
				arg1.method5030(local250 - local108, arg2.anInt9761, local108, local248 - local244, local244);
			}
			for (@Pc(320) int local320 = 0; local320 < local33; local320++) {
				@Pc(326) String local326 = Static283.aStringArray73[local320];
				if (local320 < local33 - 1) {
					local326 = local326.substring(0, local326.length() - 4);
				}
				Static471.aClass183_8.method4387(arg1, local326, local51, local108, arg2.anInt9740);
				local108 += Static471.aClass183_8.method4386();
			}
		}
		if (arg2.anInt9756 == -1 && arg2.aString92 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(373) Class4_Sub32 local373 = new Class4_Sub32(arg0);
		local373.anInt7360 = local250;
		local373.anInt7363 = local28 + local16;
		local373.anInt7361 = local246;
		local373.anInt7362 = local248;
		local373.anInt7357 = local31 - local16;
		local373.anInt7364 = local31 + local16;
		local373.anInt7359 = local28 - local16;
		local373.anInt7356 = local244;
		Static264.aClass244_39.method5960(local373);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BLclient!un;)Lclient!ow;")
	public static Class22_Sub3 method1263(@OriginalArg(1) Class4_Sub11 arg0) {
		return new Class22_Sub3(arg0.method4946(), arg0.method4946(), arg0.method4946(), arg0.method4946(), arg0.method4934(), arg0.method4905());
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)Z")
	public static boolean method1264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | Static248.method3992(arg1, arg0) || Static401.method6308(arg0, arg1);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "([JI[III)V")
	public static void method1265(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg3 + arg1) / 2;
		@Pc(21) int local21 = arg1;
		@Pc(25) long local25 = arg0[local19];
		arg0[local19] = arg0[arg3];
		arg0[arg3] = local25;
		@Pc(39) int local39 = arg2[local19];
		arg2[local19] = arg2[arg3];
		arg2[arg3] = local39;
		@Pc(57) int local57 = local25 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg1; local59 < arg3; local59++) {
			if (arg0[local59] < (long) (local59 & local57) + local25) {
				@Pc(80) long local80 = arg0[local59];
				arg0[local59] = arg0[local21];
				arg0[local21] = local80;
				@Pc(94) int local94 = arg2[local59];
				arg2[local59] = arg2[local21];
				arg2[local21++] = local94;
			}
		}
		arg0[arg3] = arg0[local21];
		arg0[local21] = local25;
		arg2[arg3] = arg2[local21];
		arg2[local21] = local39;
		method1265(arg0, arg1, arg2, local21 - 1);
		method1265(arg0, local21 + 1, arg2, arg3);
	}
}

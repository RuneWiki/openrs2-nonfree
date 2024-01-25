import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "Lclient!lf;")
	public static final Class183 aClass183_1 = new Class183(0, 3, Static302.aClass176_12);

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "Lclient!lf;")
	public static final Class183 aClass183_2 = new Class183(1, 3, Static302.aClass176_12);

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "Lclient!lf;")
	public static final Class183 aClass183_3 = new Class183(2, 4, Static302.aClass176_8);

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "Lclient!lf;")
	public static final Class183 aClass183_4 = new Class183(3, 1, Static302.aClass176_12);

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "Lclient!lf;")
	public static final Class183 aClass183_5 = new Class183(4, 2, Static302.aClass176_12);

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "Lclient!lf;")
	public static final Class183 aClass183_6 = new Class183(5, 3, Static302.aClass176_12);

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "Lclient!lf;")
	public static final Class183 aClass183_7 = new Class183(6, 4, Static302.aClass176_12);

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
	public static final int anInt6313 = Static126.method2629(16);

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
	public static int anInt6314 = 2;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
	public static int anInt6315 = -1;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
	public static int anInt6316 = -1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIB)V")
	public static void method5291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(14) Class6_Sub45 local14 = (Class6_Sub45) Static590.aClass163_60.method4966(); local14 != null; local14 = (Class6_Sub45) Static590.aClass163_60.method4965()) {
			Static493.method7165(arg2, arg1, arg3, arg0, local14);
		}
		@Pc(181) boolean local181;
		for (@Pc(35) Class6_Sub45 local35 = (Class6_Sub45) Static610.aClass163_61.method4966(); local35 != null; local35 = (Class6_Sub45) Static610.aClass163_61.method4965()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class303 local44 = local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.method3625();
			if (local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.anInt4312 == -1 || local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.aBoolean349) {
				local39 = 0;
			} else if (local44.anInt8969 == local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.anInt4312 || local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.anInt4312 == local44.anInt8943 || local44.anInt8981 == local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.anInt4312 || local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.anInt4312 == local44.anInt8938) {
				local39 = 2;
			} else if (local44.anInt8948 == local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.anInt4312 || local44.anInt8976 == local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.anInt4312 || local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.anInt4312 == local44.anInt8982 || local44.anInt8957 == local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.anInt4312) {
				local39 = 3;
			}
			if (local35.anInt8281 != local39) {
				@Pc(133) int local133 = Static490.method4316(local35.aClass9_Sub4_Sub2_Sub1_Sub1_2);
				@Pc(137) Class158 local137 = local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.aClass158_1;
				if (local137.anIntArray260 != null) {
					local137 = local137.method4867(Static140.aClass157_1);
				}
				if (local137 == null || local133 == -1) {
					local35.anInt8281 = local39;
					local35.anInt8269 = -1;
					local35.aBoolean661 = false;
				} else if (local35.anInt8269 == local133 && local35.aBoolean661 == local137.aBoolean451) {
					local35.anInt8284 = local137.anInt5854;
					local35.anInt8281 = local39;
				} else {
					local181 = false;
					if (local35.aClass6_Sub4_Sub5_3 == null) {
						local181 = true;
					} else {
						local35.anInt8284 -= 512;
						if (local35.anInt8284 <= 0) {
							Static152.aClass6_Sub4_Sub3_2.method5197(local35.aClass6_Sub4_Sub5_3);
							local35.aClass6_Sub4_Sub5_3 = null;
							local181 = true;
						}
					}
					if (local181) {
						local35.aClass6_Sub27_Sub1_3 = null;
						local35.anInt8284 = local137.anInt5854;
						local35.aBoolean661 = local137.aBoolean451;
						local35.anInt8281 = local39;
						local35.aClass6_Sub20_1 = null;
						local35.anInt8269 = local133;
					}
				}
			}
			local35.anInt8283 = local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.anInt10360;
			local35.anInt8278 = local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.anInt10360 + (local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.method3620() << 8);
			local35.anInt8280 = local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.anInt10357;
			local35.anInt8270 = local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.anInt10357 + (local35.aClass9_Sub4_Sub2_Sub1_Sub1_2.method3620() << 8);
			Static493.method7165(arg2, arg1, arg3, arg0, local35);
		}
		for (@Pc(293) Class6_Sub45 local293 = (Class6_Sub45) Static209.aClass380_14.method8755(); local293 != null; local293 = (Class6_Sub45) Static209.aClass380_14.method8752()) {
			@Pc(297) byte local297 = 1;
			@Pc(302) Class303 local302 = local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.method3625();
			if (local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt4312 == -1 || local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.aBoolean349) {
				local297 = 0;
			} else if (local302.anInt8969 == local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt4312 || local302.anInt8943 == local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt4312 || local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt4312 == local302.anInt8981 || local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt4312 == local302.anInt8938) {
				local297 = 2;
			} else if (local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt4312 == local302.anInt8948 || local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt4312 == local302.anInt8976 || local302.anInt8982 == local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt4312 || local302.anInt8957 == local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt4312) {
				local297 = 3;
			}
			if (local297 != local293.anInt8281) {
				@Pc(386) int local386 = Static501.method7250(local293.aClass9_Sub4_Sub2_Sub1_Sub2_2);
				if (local386 == local293.anInt8269 && local293.aBoolean661 == local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.aBoolean355) {
					local293.anInt8281 = local297;
					local293.anInt8284 = local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt4363;
				} else {
					local181 = false;
					if (local293.aClass6_Sub4_Sub5_3 == null) {
						local181 = true;
					} else {
						local293.anInt8284 -= 512;
						if (local293.anInt8284 <= 0) {
							Static152.aClass6_Sub4_Sub3_2.method5197(local293.aClass6_Sub4_Sub5_3);
							local293.aClass6_Sub4_Sub5_3 = null;
							local181 = true;
						}
					}
					if (local181) {
						local293.anInt8269 = local386;
						local293.aClass6_Sub27_Sub1_3 = null;
						local293.aClass6_Sub20_1 = null;
						local293.anInt8284 = local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt4363;
						local293.anInt8281 = local297;
						local293.aBoolean661 = local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.aBoolean355;
					}
				}
			}
			local293.anInt8283 = local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt10360;
			local293.anInt8278 = local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt10360 + (local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.method3620() << 8);
			local293.anInt8280 = local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt10357;
			local293.anInt8270 = local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt10357 + (local293.aClass9_Sub4_Sub2_Sub1_Sub2_2.method3620() << 8);
			Static493.method7165(arg2, arg1, arg3, arg0, local293);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)Lclient!lf;")
	public static Class183 method5293(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass183_1;
		} else if (arg0 == 1) {
			return aClass183_2;
		} else if (arg0 == 2) {
			return aClass183_3;
		} else if (arg0 == 3) {
			return aClass183_4;
		} else if (arg0 == 4) {
			return aClass183_5;
		} else if (arg0 == 5) {
			return aClass183_6;
		} else if (arg0 == 6) {
			return aClass183_7;
		} else {
			return null;
		}
	}
}

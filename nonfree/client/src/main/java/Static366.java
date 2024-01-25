import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!si", name = "b", descriptor = "[F")
	public static final float[] aFloatArray30 = new float[4];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!jv;III)J")
	public static long method4338(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class182 local16 = Static71.aClass105_6.method2336(arg0.method4665());
		@Pc(37) long local37 = (long) ((arg2 | 0x800000) << 7 | arg1 | arg0.method4666() << 14 | arg0.method4670() << 20);
		if (local16.anInt5468 == 0) {
			local37 |= local9;
		}
		if (local16.anInt5470 == 1) {
			local37 |= local5;
		}
		if (local16.aBoolean359) {
			local37 |= local7;
		}
		return local37 | (long) arg0.method4665() << 32;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!bt;I)Lclient!jc;")
	public static Class125 method4341(@OriginalArg(0) int arg0, @OriginalArg(1) Class26_Sub2 arg1) {
		@Pc(9) Class125 local9;
		if (Static280.aClass125_2 == null) {
			local9 = new Class125();
		} else {
			local9 = Static280.aClass125_2;
			Static280.aClass125_2 = Static280.aClass125_2.aClass125_1;
			local9.aClass125_1 = null;
			Static165.anInt3105--;
		}
		local9.anInt3453 = arg0;
		local9.aClass26_Sub2_1 = arg1;
		return local9;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Lclient!gf;")
	public static Class26_Sub4 method4342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class211 local7 = Static268.aClass211ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass26_Sub4_2 == null ? null : local7.aClass26_Sub4_2;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IFFF)I")
	public static int method4345(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(22) float local22 = arg1 < (float) 0 ? -arg1 : arg1;
		@Pc(31) float local31 = arg2 < 0.0F ? -arg2 : arg2;
		if (local12 < local22 && local31 < local22) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local12 < local31 && local22 < local31) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(II)I")
	public static int method4346(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BLclient!vh;)V")
	public static void method4350(@OriginalArg(1) Class250 arg0) {
		Static409.anInt7172 = arg0.method5652("titlebg");
		Static285.anInt7834 = arg0.method5652("logo");
	}
}

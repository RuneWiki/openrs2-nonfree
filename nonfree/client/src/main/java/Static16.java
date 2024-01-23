import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "Lclient!th;")
	public static Class168 aClass168_19;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "J")
	public static long aLong29 = 0L;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
	public static int anInt461 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
	public static void method411(@OriginalArg(1) byte arg0) {
		if (Static53.aByteArrayArrayArray2 == null) {
			Static53.aByteArrayArrayArray2 = new byte[4][104][104];
		}
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			for (@Pc(27) int local27 = 0; local27 < 104; local27++) {
				for (@Pc(32) int local32 = 0; local32 < 104; local32++) {
					Static53.aByteArrayArrayArray2[local22][local27][local32] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILclient!kf;II)V")
	public static void method412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub16 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt3279 == -1 && arg2.anIntArray303 == null) {
			return;
		}
		@Pc(19) int local19 = 0;
		if (arg2.anInt3272 < arg3) {
			local19 = arg3 - arg2.anInt3272;
		} else if (arg2.anInt3277 > arg3) {
			local19 = arg2.anInt3277 - arg3;
		}
		if (arg4 > arg2.anInt3280) {
			local19 += arg4 - arg2.anInt3280;
		} else if (arg4 < arg2.anInt3268) {
			local19 += arg2.anInt3268 - arg4;
		}
		@Pc(82) int local82 = Static286.anInt5742 * arg2.anInt3269 >> 8;
		if (arg2.anInt3271 == 0 || local19 - 64 > arg2.anInt3271 || Static286.anInt5742 == 0 || arg2.anInt3276 != arg1) {
			if (arg2.aClass1_Sub10_Sub4_2 != null) {
				Static101.aClass1_Sub10_Sub2_2.method1864(arg2.aClass1_Sub10_Sub4_2);
				arg2.aClass1_Sub10_Sub4_2 = null;
			}
			if (arg2.aClass1_Sub10_Sub4_1 != null) {
				Static101.aClass1_Sub10_Sub2_2.method1864(arg2.aClass1_Sub10_Sub4_1);
				arg2.aClass1_Sub10_Sub4_1 = null;
			}
			return;
		}
		local19 -= 64;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(146) int local146 = (arg2.anInt3271 - local19) * local82 / arg2.anInt3271;
		if (arg2.aClass1_Sub10_Sub4_2 != null) {
			arg2.aClass1_Sub10_Sub4_2.method4369(local146);
		} else if (arg2.anInt3279 >= 0) {
			@Pc(168) Class172 local168 = Static325.method4139(Static281.aClass168_98, arg2.anInt3279, 0);
			if (local168 != null) {
				@Pc(176) Class1_Sub11_Sub1 local176 = local168.method4136().method1619(Static189.aClass19_1);
				@Pc(181) Class1_Sub10_Sub4 local181 = Static327.method4375(local176, local146);
				local181.method4382(-1);
				Static101.aClass1_Sub10_Sub2_2.method1863(local181);
				arg2.aClass1_Sub10_Sub4_2 = local181;
			}
		}
		if (arg2.aClass1_Sub10_Sub4_1 != null) {
			arg2.aClass1_Sub10_Sub4_1.method4369(local146);
			if (!arg2.aClass1_Sub10_Sub4_1.method4768()) {
				arg2.aClass1_Sub10_Sub4_1 = null;
			}
		} else if (arg2.anIntArray303 != null && (arg2.anInt3273 -= arg0) <= 0) {
			@Pc(214) int local214 = (int) ((double) arg2.anIntArray303.length * Math.random());
			@Pc(222) Class172 local222 = Static325.method4139(Static281.aClass168_98, arg2.anIntArray303[local214], 0);
			if (local222 != null) {
				@Pc(230) Class1_Sub11_Sub1 local230 = local222.method4136().method1619(Static189.aClass19_1);
				@Pc(235) Class1_Sub10_Sub4 local235 = Static327.method4375(local230, local146);
				local235.method4382(0);
				Static101.aClass1_Sub10_Sub2_2.method1863(local235);
				arg2.aClass1_Sub10_Sub4_1 = local235;
				arg2.anInt3273 = (int) ((double) (arg2.anInt3275 - arg2.anInt3278) * Math.random()) + arg2.anInt3278;
			}
		}
	}
}

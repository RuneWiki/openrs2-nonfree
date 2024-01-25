import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
	public static int anInt4894;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "[I")
	public static final int[] anIntArray400 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ln;B)I")
	public static int method4156(@OriginalArg(0) Class6_Sub26 arg0) {
		@Pc(7) String local7 = Static378.method5557(arg0);
		@Pc(9) int[] local9 = null;
		if (Static452.method6341(arg0.anInt5472)) {
			local9 = Static119.aClass244_4.method5726((int) arg0.aLong126).anIntArray482;
		} else if (arg0.anInt5470 != -1) {
			local9 = Static119.aClass244_4.method5726(arg0.anInt5470).anIntArray482;
		} else if (Static543.method7377(arg0.anInt5472)) {
			@Pc(41) Class6_Sub49 local41 = (Class6_Sub49) Static251.aClass234_29.method5464((long) arg0.aLong126);
			if (local41 != null) {
				@Pc(46) Class15_Sub2_Sub4_Sub1 local46 = local41.aClass15_Sub2_Sub4_Sub1_2;
				@Pc(49) Class88 local49 = local46.aClass88_1;
				if (local49.anIntArray182 != null) {
					local49 = local49.method1940(Static65.aClass51_1);
				}
				if (local49 != null) {
					local9 = local49.anIntArray184;
				}
			}
		} else if (Static252.method3929(arg0.anInt5472)) {
			@Pc(81) Class192 local81;
			if (arg0.anInt5472 == 1007) {
				local81 = Static85.aClass27_1.method516((int) arg0.aLong126);
			} else {
				local81 = Static85.aClass27_1.method516((int) (arg0.aLong126 >>> 32 & 0x7FFFFFFFL));
			}
			if (local81.lb != null) {
				local81 = local81.method4585(Static65.aClass51_1);
			}
			if (local81 != null) {
				local9 = local81.anIntArray426;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static96.method6297(local9);
		}
		@Pc(134) int local134 = Static479.aClass202_13.method4977(local7, Static241.aClass71Array29);
		if (arg0.aBoolean380) {
			local134 += Static449.aClass71_48.QA() + 4;
		}
		return local134;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)[Lclient!dg;")
	public static Class72[] method4158() {
		return new Class72[] { Static442.aClass72_10, Static173.aClass72_4, Static482.aClass72_11 };
	}
}

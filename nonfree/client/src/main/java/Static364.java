import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!ve", name = "P", descriptor = "Lclient!tr;")
	public static Class110 aClass110_20;

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "[I")
	public static int[] anIntArray651 = new int[2];

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
	public static int anInt6110 = 0;

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
	public static final int anInt6112 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!rp;I)Lclient!so;")
	public static Class216 method5428(@OriginalArg(0) Class3_Sub5 arg0) {
		@Pc(7) Class216 local7 = new Class216();
		local7.anInt5450 = arg0.method2767();
		local7.aClass3_Sub7_Sub5_1 = Static222.method3706(local7.anInt5450);
		return local7;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)Z")
	public static boolean method5430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static330.anIntArrayArrayArray15[arg0][arg1][arg2];
		if (local7 == -Static389.anInt6446) {
			return false;
		} else if (local7 == Static389.anInt6446) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static187.anInt3390;
			@Pc(26) int local26 = arg2 << Static187.anInt3390;
			if (Static79.method1320(local22 + 1, Static337.aClass7Array3[arg0].method5648(arg1, arg2), local26 + 1) && Static79.method1320(local22 + Static258.anInt4653 - 1, Static337.aClass7Array3[arg0].method5648(arg1 + 1, arg2), local26 + 1) && Static79.method1320(local22 + Static258.anInt4653 - 1, Static337.aClass7Array3[arg0].method5648(arg1 + 1, arg2 + 1), local26 + Static258.anInt4653 - 1) && Static79.method1320(local22 + 1, Static337.aClass7Array3[arg0].method5648(arg1, arg2 + 1), local26 + Static258.anInt4653 - 1)) {
				Static330.anIntArrayArrayArray15[arg0][arg1][arg2] = Static389.anInt6446;
				return true;
			} else {
				Static330.anIntArrayArrayArray15[arg0][arg1][arg2] = -Static389.anInt6446;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
	public static void method5431() {
		if (Static239.aBoolean441) {
			return;
		}
		Static55.aBoolean64 = true;
		Static239.aBoolean441 = true;
		if (Static164.aClass154_Sub1_1.aBoolean466) {
			Static279.aFloat67 = (int) Static279.aFloat67 + 47 & 0xFFFFFFF0;
		} else {
			Static75.aFloat11 += (12.0F - Static75.aFloat11) / 2.0F;
		}
	}
}

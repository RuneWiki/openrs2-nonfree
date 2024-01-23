import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
	public static int anInt458;

	@OriginalMember(owner = "client!bd", name = "Z", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
	public static volatile int anInt461 = -1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIII)I")
	public static int method353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(8) int local8 = arg1;
			arg1 = arg0;
			arg0 = local8;
		}
		@Pc(21) int local21 = arg4 & 0x3;
		if (local21 == 0) {
			return arg5;
		} else if (local21 == 1) {
			return 7 + 1 - arg3 - arg1;
		} else if (local21 == 2) {
			return 1 + 7 - arg0 - arg5;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIBIII)V")
	public static void method355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class36[] local8 = Static187.aClass36Array1;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(18) Class36 local18 = local8[local10];
			if (local18 != null && local18.anInt1168 == 2) {
				Static250.method3901(local18.anInt1163 + (local18.anInt1171 - Static224.anInt4695 << 7), arg4 >> 1, local18.anInt1165 * 2, arg5 >> 1, (local18.anInt1159 - Static158.anInt2961 << 7) + local18.anInt1158, arg3, arg2);
				if (Static55.anInt1167 > -1 && Static261.anInt5259 % 20 < 10) {
					Static121.aClass1_Sub2_Sub2Array6[local18.anInt1166].method3921(arg0 + Static55.anInt1167 - 12, arg1 - -Static178.anInt3321 + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I")
	public static int method356(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}
}

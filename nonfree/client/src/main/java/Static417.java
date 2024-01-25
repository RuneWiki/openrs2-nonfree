import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!pv", name = "B", descriptor = "I")
	public static int anInt7008 = 0;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!vr;")
	public static Class9_Sub1_Sub1 method5998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class63 local7 = Static554.aClass63ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class16 local14 = local7.aClass16_3; local14 != null; local14 = local14.aClass16_1) {
			@Pc(18) Class9_Sub1_Sub1 local18 = local14.aClass9_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort112 == arg1 && local18.aShort115 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "(I)I")
	public static int method5999() {
		if ((double) Static284.aFloat161 == 3.0D) {
			return 37;
		} else if ((double) Static284.aFloat161 == 4.0D) {
			return 50;
		} else if ((double) Static284.aFloat161 == 6.0D) {
			return 75;
		} else if ((double) Static284.aFloat161 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIII)V")
	public static void method6000(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(28) int local28 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg2 + arg0);
		@Pc(37) int local37 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg2 - arg0);
		Static337.method5150(local28, arg1, local37, Static176.anIntArrayArray28[arg3]);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(87) int local87;
			@Pc(98) int local98;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local65 = arg3 - local9;
				local69 = local9 + arg3;
				if (local69 >= Static385.anInt6630 && local65 <= Static69.anInt1918) {
					local87 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, local7 + arg2);
					local98 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg2 - local7);
					if (Static69.anInt1918 >= local69) {
						Static337.method5150(local87, arg1, local98, Static176.anIntArrayArray28[local69]);
					}
					if (Static385.anInt6630 <= local65) {
						Static337.method5150(local87, arg1, local98, Static176.anIntArrayArray28[local65]);
					}
				}
			}
			local7++;
			local65 = arg3 - local7;
			local69 = local7 + arg3;
			if (Static385.anInt6630 <= local69 && local65 <= Static69.anInt1918) {
				local87 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, local9 + arg2);
				local98 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg2 - local9);
				if (local69 <= Static69.anInt1918) {
					Static337.method5150(local87, arg1, local98, Static176.anIntArrayArray28[local69]);
				}
				if (Static385.anInt6630 <= local65) {
					Static337.method5150(local87, arg1, local98, Static176.anIntArrayArray28[local65]);
				}
			}
		}
	}
}

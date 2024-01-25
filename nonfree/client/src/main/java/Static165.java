import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
	public static int anInt2746 = -1;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(DI)V")
	public static void method2436(@OriginalArg(0) double arg0) {
		if (arg0 == Static670.aDouble29) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Class41_Sub1_Sub3_Sub1.lb[local7] = local19 <= 255 ? local19 : 255;
		}
		Static670.aDouble29 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!sf;Z[[[BIB)Z")
	public static boolean method2439(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static281.aBoolean294) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10366 >> Static138.anInt2287;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt10367 >> Static138.anInt2287;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class41_Sub1_Sub1) {
			local10 = ((Class41_Sub1_Sub1) arg0).aShort107;
			local17 = ((Class41_Sub1_Sub1) arg0).aShort110;
			local8 = ((Class41_Sub1_Sub1) arg0).aShort109;
			local15 = ((Class41_Sub1_Sub1) arg0).aShort108;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte150 < Static202.anInt3256 && local38 >= Static15.anInt230 && local38 < Static544.anInt8920 && local41 >= Static582.anInt9578 && local41 < Static264.anInt4215) {
					if ((arg2 == null || arg0.aByte149 < arg3 || arg2[arg0.aByte149][local38][local41] != arg4) && arg0.method8664() && !arg0.method8651(Static267.aClass143_6)) {
						return false;
					}
					if (!arg1 && local38 >= Static281.anInt4404 - 16 && local38 <= Static281.anInt4404 + 16 && local41 >= Static411.anInt7045 - 16 && local41 <= Static411.anInt7045 + 16) {
						if (Static362.aBoolean459) {
							Static472.aClass345Array1[Static338.anInt9521++].method7946(arg0);
							Static338.anInt9521 %= Static286.anInt4496;
						} else {
							arg0.method8662(Static267.aClass143_6);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
	public static void method2443() {
		if (!Static284.method3903()) {
			return;
		}
		if (Static223.aStringArray14 == null) {
			Static556.method7634();
		}
		Static514.anInt8682 = 0;
		Static207.aBoolean229 = true;
	}
}

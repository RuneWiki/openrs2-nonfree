import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IBLclient!sia;)Z")
	public static boolean method8289(@OriginalArg(0) int arg0, @OriginalArg(2) Class309 arg1) {
		Static400.aClass39_9.method7254(arg1.anIntArray568[arg0], arg1.anIntArray569[arg0], arg1.anIntArray567[arg0], Static342.anIntArray396);
		@Pc(27) int local27 = Static342.anIntArray396[2];
		if (local27 < 50) {
			return false;
		} else {
			arg1.aShortArray131[arg0] = (short) (Static342.anIntArray396[0] * Static380.anInt7104 / local27 + Static436.anInt7858);
			arg1.aShortArray130[arg0] = (short) (Static342.anIntArray396[1] * Static449.anInt7993 / local27 + Static289.anInt8542);
			arg1.aShortArray129[arg0] = (short) local27;
			return true;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!ha;Ljava/lang/String;IIIII)V")
	public static void method8291(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static207.aClass24_13 == null || Static398.aClass24_24 == null) {
			if (Static474.aClass196_98.method5111(Static275.anInt4975) && Static474.aClass196_98.method5111(Static586.anInt9600)) {
				Static207.aClass24_13 = arg1.method7525(Static645.method2771(Static474.aClass196_98, Static275.anInt4975, 0), true);
				@Pc(45) Class107 local45 = Static645.method2771(Static474.aClass196_98, Static586.anInt9600, 0);
				Static398.aClass24_24 = arg1.method7525(local45, true);
				local45.method2763();
				Static341.aClass24_31 = arg1.method7525(local45, true);
			} else {
				arg1.aa(arg0, arg4, arg3, 20, Static134.anInt2742 | 255 - Static460.anInt8088 << 24, 1);
			}
		}
		if (Static207.aClass24_13 != null && Static398.aClass24_24 != null) {
			@Pc(76) int local76 = (arg3 - Static398.aClass24_24.method8558() * 2) / Static207.aClass24_13.method8558();
			for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
				Static207.aClass24_13.method8559(arg0 + Static398.aClass24_24.method8558() + Static207.aClass24_13.method8558() * local78, arg4);
			}
			Static398.aClass24_24.method8559(arg0, arg4);
			Static341.aClass24_31.method8559(arg3 + arg0 - Static341.aClass24_31.method8558(), arg4);
		}
		Static460.aClass62_9.method8373(-1, -16777216 | Static325.anInt6089, arg0 + 3, arg2, arg4 + 14);
		arg1.aa(arg0, arg4 + 20, arg3, arg5 - 20, Static134.anInt2742 | 255 - Static460.anInt8088 << 24, 1);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BI[BIIII)Z")
	public static boolean method8293(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(18) int local18;
		if (local9 == 0) {
			local18 = 0;
		} else {
			local18 = 8 - local9;
		}
		@Pc(31) int local31 = -((arg4 + 8 - 1) / 8);
		@Pc(40) int local40 = -((arg1 + 8 - 1) / 8);
		for (@Pc(42) int local42 = local31; local42 < 0; local42++) {
			for (@Pc(49) int local49 = local40; local49 < 0; local49++) {
				if (arg0[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local18;
			if (arg0[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}
}

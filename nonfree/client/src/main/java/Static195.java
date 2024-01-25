import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public static int anInt3175 = -1;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!sg;B)I")
	public static int method2803(@OriginalArg(0) Class5_Sub5_Sub19 arg0) {
		@Pc(7) String local7 = Static442.method6549(arg0);
		@Pc(9) int[] local9 = null;
		if (Static30.method493(arg0.anInt9210)) {
			local9 = Static201.aClass127_1.method2501((int) arg0.aLong267).anIntArray316;
		} else if (arg0.anInt9209 != -1) {
			local9 = Static201.aClass127_1.method2501(arg0.anInt9209).anIntArray316;
		} else if (Static74.method1184((byte) 126, arg0.anInt9210)) {
			@Pc(90) Class5_Sub35 local90 = (Class5_Sub35) Static623.aClass291_43.method6993((long) (int) arg0.aLong267, 1);
			if (local90 != null) {
				@Pc(95) Class8_Sub1_Sub3_Sub2_Sub2 local95 = local90.aClass8_Sub1_Sub3_Sub2_Sub2_2;
				@Pc(98) Class227 local98 = local95.aClass227_1;
				if (local98.anIntArray341 != null) {
					local98 = local98.method5322(Static413.aClass118_1);
				}
				if (local98 != null) {
					local9 = local98.anIntArray342;
				}
			}
		} else if (Static408.method6016(arg0.anInt9210)) {
			@Pc(55) Class55 local55;
			if (arg0.anInt9210 == 1003) {
				local55 = Static536.aClass392_2.method9293(0, (int) arg0.aLong267);
			} else {
				local55 = Static536.aClass392_2.method9293(0, (int) (arg0.aLong267 >>> 32 & 0x7FFFFFFFL));
			}
			if (local55.anIntArray46 != null) {
				local55 = local55.method847(Static413.aClass118_1);
			}
			if (local55 != null) {
				local9 = local55.anIntArray47;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static459.method6733(local9);
		}
		@Pc(146) int local146 = Static594.aClass224_12.method5250(local7, Static494.aClass134Array13);
		if (arg0.aBoolean708) {
			local146 += Static264.aClass134_25.method9236() + 4;
		}
		return local146;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
	public static void method2804() {
		if (Static570.aClass201_10 != Static116.aClass201_5) {
			try {
				Static681.method743(Static454.aClient1, "tbrefresh");
			} catch (@Pc(25) Throwable local25) {
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
	public static int anInt9067;

	@OriginalMember(owner = "client!tfa", name = "k", descriptor = "I")
	public static int anInt9071 = 0;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(JJ)J")
	public static long method7411(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!rm;I)I")
	public static int method7413(@OriginalArg(0) Class4_Sub39 arg0) {
		@Pc(7) String local7 = Static464.method7047(arg0);
		@Pc(16) int[] local16 = null;
		if (Static504.method7403(arg0.anInt8541)) {
			local16 = Static521.aClass273_2.method6712((int) arg0.aLong219).anIntArray364;
		} else if (arg0.anInt8545 != -1) {
			local16 = Static521.aClass273_2.method6712(arg0.anInt8545).anIntArray364;
		} else if (Static114.method7979(arg0.anInt8541)) {
			@Pc(49) Class4_Sub4 local49 = (Class4_Sub4) Static585.aClass350_41.method8207((long) arg0.aLong219);
			if (local49 != null) {
				@Pc(54) Class1_Sub4_Sub2_Sub1_Sub1 local54 = local49.aClass1_Sub4_Sub2_Sub1_Sub1_1;
				@Pc(57) Class283 local57 = local54.aClass283_1;
				if (local57.anIntArray453 != null) {
					local57 = local57.method6834(Static45.aClass148_1);
				}
				if (local57 != null) {
					local16 = local57.anIntArray451;
				}
			}
		} else if (Static52.method683(arg0.anInt8541)) {
			@Pc(91) Class101 local91;
			if (arg0.anInt8541 == 1011) {
				local91 = Static204.aClass139_8.method3309((int) arg0.aLong219);
			} else {
				local91 = Static204.aClass139_8.method3309((int) (arg0.aLong219 >>> 32 & 0x7FFFFFFFL));
			}
			if (local91.anIntArray140 != null) {
				local91 = local91.method2710(Static45.aClass148_1);
			}
			if (local91 != null) {
				local16 = local91.anIntArray135;
			}
		}
		if (local16 != null) {
			local7 = local7 + Static67.method1095(local16);
		}
		@Pc(143) int local143 = Static314.aClass114_11.method2949(local7, Static500.aClass78Array18);
		if (arg0.aBoolean606) {
			local143 += Static32.aClass78_1.E() + 4;
		}
		return local143;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IBI)I")
	public static int method7414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILclient!gba;I)V")
	public static void method7415(@OriginalArg(0) int arg0, @OriginalArg(1) Class112 arg1) {
		if (Static546.aBoolean680) {
			arg0 = 0;
			Static546.aBoolean680 = false;
		}
		if (Static441.aClass112_8 != null && Static441.aClass112_8.method2913(arg1)) {
			return;
		}
		Static441.aClass112_8 = arg1;
		Static383.aLong189 = Static574.method8210();
		Static564.anInt9904 = arg0;
		Static20.anInt301 = arg0;
		if (Static20.anInt301 != 0) {
			Static161.anInt566 = Static226.anInt4164;
			Static123.aFloat105 = Static195.aFloat127;
			Static148.aFloat229 = Static143.aFloat108;
			Static188.aFloat125 = Static565.aFloat227;
			Static204.aClass36_8 = Static231.aClass36_4;
			Static290.aFloat186 = Static73.aFloat36;
			Static347.aFloat195 = Static170.aFloat122;
			Static506.anInt3161 = Static242.anInt4382;
			Static331.aFloat194 = Static128.aFloat107;
			Static307.anInt6165 = Static453.anInt8519;
			return;
		}
		Static525.method7620();
	}
}

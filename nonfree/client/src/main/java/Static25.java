import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	public static int anInt358;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public static int anInt361;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLclient!nt;)[Lclient!nl;")
	public static Class174[] method357(@OriginalArg(1) Class177 arg0) {
		if (!arg0.method3843()) {
			return new Class174[0];
		}
		@Pc(16) Class253 local16 = arg0.method3848();
		while (local16.anInt6669 == 0) {
			Static331.method4343(10L);
		}
		if (local16.anInt6669 == 2) {
			return new Class174[0];
		}
		@Pc(46) int[] local46 = (int[]) local16.anObject9;
		@Pc(52) Class174[] local52 = new Class174[local46.length >> 2];
		for (@Pc(54) int local54 = 0; local54 < local52.length; local54++) {
			@Pc(60) Class174 local60 = new Class174();
			local52[local54] = local60;
			local60.anInt4753 = local46[local54 << 2];
			local60.anInt4754 = local46[(local54 << 2) + 1];
			local60.anInt4752 = local46[(local54 << 2) + 2];
			local60.anInt4756 = local46[(local54 << 2) + 3];
		}
		return local52;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!za;I)V")
	public static void method360(@OriginalArg(0) Class117 arg0) {
		@Pc(7) int local7 = Static64.anInt995;
		@Pc(9) int local9 = anInt358;
		@Pc(11) int local11 = Static273.anInt4719;
		@Pc(13) int local13 = Static361.anInt5833;
		arg0.method5664(local11, local9, -10660793, local13, local7);
		arg0.method5664(local11 - 2, local9 + 1, -16777216, 16, local7 + 1);
		arg0.method5666(local9 + 18, local11 - 2, local13 - 19, -16777216, local7 + 1);
		Static17.aClass137_5.method4587(local9 + 14, local7 - -3, Static141.aClass142_97.method3118(Static63.anInt981), -10660793, -1);
		@Pc(72) int local72 = Static181.aClass224_1.method5613();
		@Pc(78) int local78 = Static181.aClass224_1.method5615();
		@Pc(80) int local80 = 0;
		for (@Pc(85) Class1_Sub10 local85 = (Class1_Sub10) Static57.aClass14_3.method203(); local85 != null; local85 = (Class1_Sub10) Static57.aClass14_3.method208()) {
			@Pc(100) int local100 = (Static76.anInt1078 - local80 - 1) * 16 + local9 + 31;
			@Pc(102) short local102 = -1;
			if (local7 < local72 && local72 < local11 + local7 && local100 - 13 < local78 && local78 < local100 + 3 && local85.aBoolean132) {
				local102 = -256;
			}
			@Pc(135) int[] local135 = null;
			if (Static189.method2734(local85.anInt1057)) {
				local135 = Static285.aClass226_2.method4788((int) local85.aLong31).anIntArray274;
			} else if (local85.anInt1050 != -1) {
				local135 = Static285.aClass226_2.method4788(local85.anInt1050).anIntArray274;
			} else if (Static463.method5977(local85.anInt1057)) {
				@Pc(212) Class1_Sub44 local212 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local85.aLong31);
				if (local212 != null) {
					@Pc(217) Class11_Sub1_Sub3_Sub1 local217 = local212.aClass11_Sub1_Sub3_Sub1_2;
					@Pc(220) Class272 local220 = local217.aClass272_1;
					if (local220.anIntArray543 != null) {
						local220 = local220.method5900(Static32.aClass4_1);
					}
					if (local220 != null) {
						local135 = local220.anIntArray542;
					}
				}
			} else if (Static319.method4209(local85.anInt1057)) {
				@Pc(177) Class87 local177;
				if (local85.anInt1057 == 1002) {
					local177 = Static86.aClass248_7.method5246((int) local85.aLong31);
				} else {
					local177 = Static86.aClass248_7.method5246((int) (local85.aLong31 >>> 32 & 0x7FFFFFFFL));
				}
				if (local177.anIntArray170 != null) {
					local177 = local177.method1571(Static32.aClass4_1);
				}
				if (local177 != null) {
					local135 = local177.anIntArray168;
				}
			}
			@Pc(249) String local249 = Static95.method5204(local85);
			if (local135 != null) {
				local249 = local249 + Static237.method3379(local135);
			}
			Static17.aClass137_5.method4591(local102, local7 + 3, Static138.anIntArray185, local249, Static91.aClass85Array5, local100);
			if (local85.aBoolean131) {
				Static51.aClass85_6.method5406(Static15.aClass252_5.method5291(local249) + local7 + 5, local100 + -12);
			}
			local80++;
		}
		Static140.method1762(Static361.anInt5833, Static64.anInt995, anInt358, Static273.anInt4719);
	}
}

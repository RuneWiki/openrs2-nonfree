import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "Z")
	public static boolean aBoolean370 = false;

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
	public static int anInt4955 = -1;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method4036(@OriginalArg(1) Class16 arg0) {
		if (Static548.anInt9471 < 2 && !Static147.aBoolean270 || Static10.aClass331_3 != null) {
			return;
		}
		@Pc(40) String local40;
		if (Static147.aBoolean270 && Static548.anInt9471 < 2) {
			local40 = Static598.aString17 + Static121.aClass84_32.method2710(Static372.anInt7083) + Static4.aString2 + " ->";
		} else if (Static131.aBoolean255 && Static295.aClass209_1.method5482(81) && Static548.anInt9471 > 2) {
			local40 = Static452.method6861(Static193.aClass8_Sub5_Sub7_1);
		} else {
			@Pc(44) Class8_Sub5_Sub7 local44 = Static193.aClass8_Sub5_Sub7_1;
			if (local44 == null) {
				return;
			}
			local40 = Static452.method6861(local44);
			@Pc(53) int[] local53 = null;
			if (Static529.method7476(local44.anInt3779)) {
				local53 = Static497.aClass258_21.method6652((int) local44.aLong93).anIntArray462;
			} else if (local44.anInt3777 != -1) {
				local53 = Static497.aClass258_21.method6652(local44.anInt3777).anIntArray462;
			} else if (Static95.method2218(local44.anInt3779)) {
				@Pc(120) Class8_Sub50 local120 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local44.aLong93);
				if (local120 != null) {
					@Pc(125) Class15_Sub1_Sub2_Sub2_Sub2 local125 = local120.aClass15_Sub1_Sub2_Sub2_Sub2_2;
					@Pc(128) Class300 local128 = local125.aClass300_1;
					if (local128.anIntArray498 != null) {
						local128 = local128.method7306(Static420.aClass77_1);
					}
					if (local128 != null) {
						local53 = local128.anIntArray500;
					}
				}
			} else if (Static85.method7007(local44.anInt3779)) {
				@Pc(85) Class352 local85;
				if (local44.anInt3779 == 1003) {
					local85 = Static437.aClass199_3.method5342((int) local44.aLong93);
				} else {
					local85 = Static437.aClass199_3.method5342((int) (local44.aLong93 >>> 32 & 0x7FFFFFFFL));
				}
				if (local85.anIntArray591 != null) {
					local85 = local85.method8164(Static420.aClass77_1);
				}
				if (local85 != null) {
					local53 = local85.anIntArray590;
				}
			}
			if (local53 != null) {
				local40 = local40 + Static32.method1192(local53);
			}
		}
		if (Static548.anInt9471 > 2) {
			local40 = local40 + "<col=ffffff> / " + (Static548.anInt9471 - 2) + Static121.aClass84_25.method2710(Static372.anInt7083);
		}
		if (Static547.aClass331_17 != null) {
			@Pc(254) Class27 local254 = Static547.aClass331_17.method7737(arg0);
			if (local254 == null) {
				local254 = Static206.aClass27_20;
			}
			local254.method6999(Static288.aRandom6, Static223.anInt9989, local40, Static547.aClass331_17.anInt9508, Static547.aClass331_17.anInt9562, Static59.anInt1902, Static547.aClass331_17.anInt9572, Static547.aClass331_17.anInt9548, Static547.aClass331_17.anInt9505, Static446.anIntArray421, Static99.aClass21Array5, Static287.anIntArray343, Static101.anInt2722, Static547.aClass331_17.anInt9553);
			Static76.method1967(Static287.anIntArray343[3], Static287.anIntArray343[2], Static287.anIntArray343[0], Static287.anIntArray343[1]);
		} else if (Static78.aClass331_6 != null && Static18.aClass217_1 == Static207.aClass217_3) {
			@Pc(234) int local234 = Static206.aClass27_20.method7005(local40, Static526.anInt9111 + 16, Static288.aRandom6, Static446.anIntArray421, Static105.anInt2771 + 4, Static223.anInt9989, Static99.aClass21Array5);
			Static76.method1967(16, Static469.aClass345_15.method8112(local40) + local234, Static105.anInt2771 + 4, Static526.anInt9111);
			return;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZI)Lclient!eca;")
	public static Class8_Sub18 method4038(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class8_Sub18) Static329.aClass253_22.method6594(local17);
	}
}

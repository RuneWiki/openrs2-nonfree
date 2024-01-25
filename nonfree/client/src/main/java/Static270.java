import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(B[B)V")
	public static void method4445(@OriginalArg(1) byte[] arg0) {
		@Pc(18) Class5_Sub36 local18 = new Class5_Sub36(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(22) int local22 = local18.method7291();
					if (local22 == 0) {
						return;
					}
					if (local22 == 1) {
						@Pc(134) int[] local134 = Static344.anIntArray330 = new int[6];
						local134[0] = local18.method7333();
						local134[1] = local18.method7333();
						local134[2] = local18.method7333();
						local134[3] = local18.method7333();
						local134[4] = local18.method7333();
						local134[5] = local18.method7333();
					} else {
						@Pc(47) int local47;
						@Pc(42) int local42;
						if (local22 == 4) {
							local42 = local18.method7291();
							Static180.anIntArray155 = new int[local42];
							for (local47 = 0; local47 < local42; local47++) {
								Static180.anIntArray155[local47] = local18.method7333();
								if (Static180.anIntArray155[local47] == 65535) {
									Static180.anIntArray155[local47] = -1;
								}
							}
						} else if (local22 == 5) {
							local42 = local18.method7291();
							Static192.anIntArray441 = new int[local42];
							for (local47 = 0; local47 < local42; local47++) {
								Static192.anIntArray441[local47] = local18.method7333();
								if (Static192.anIntArray441[local47] == 65535) {
									Static192.anIntArray441[local47] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)V")
	public static void method4446() {
		Static228.anInt3937 = 0;
		Static315.anInt5380 = 0;
		Static139.anInt2749 = 0;
		Static527.anInt8398 = 0;
		Static290.anInt5128 = 0;
		Static549.anInt8709 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static8.aClass212Array1.length; local19++) {
			Static8.aClass212Array1[local19] = null;
		}
		Static206.method3386();
		for (@Pc(40) int local40 = 0; local40 < 2048; local40++) {
			Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local40] = null;
		}
		Static438.anInt7239 = 0;
		Static677.aClass306_37.method6936();
		if (-96 != -96) {
			return;
		}
		Static259.anInt4657 = 0;
		Static248.aClass306_18.method6936();
		Static234.method3707();
		Static682.anInt10922 = 0;
		Static23.aClass247_1.method5704();
		Static484.aLong227 = 0L;
		Static55.aClass325_1 = null;
		Static348.aClass5_Sub55_2 = null;
		Static605.aClass5_Sub55_3 = null;
		Static321.aClass325_3 = null;
		Static437.aClass5_Sub16_2 = null;
	}

	@OriginalMember(owner = "client!jia", name = "j", descriptor = "(I)V")
	public static void method4447() {
		Static240.aClass141_4.method3310();
		Static292.aClass152_4.method3419();
		Static239.aClass294_1.method6577();
		Static528.aClass243_3.method5552();
		Static378.aClass369_2.method8464();
		Static82.aClass134_1.method3184();
		Static315.aClass14_1.method224();
		Static463.aClass352_1.method8005();
		Static284.aClass305_1.method6903();
		Static628.aClass348_1.method7724();
		Static379.aClass39_1.method766();
		Static197.aClass9_1.method152();
		Static591.aClass148_2.method3402();
		Static201.aClass97_3.method1929();
		Static583.aClass327_4.method7410();
		Static234.aClass101_1.method2564();
		Static612.aClass380_2.method8838();
		Static635.aClass356_1.method8134();
		Static332.aClass161_1.method3638();
		Static433.aClass104_1.method2581();
		Static458.aClass233_1.method5215();
		Static280.aClass111_1.method2751();
		Static140.aClass312_1.method7051();
		Static308.method4796();
		Static525.method7160();
		Static257.method4232();
		Static445.method5770();
		Static114.method1693();
		Static95.aClass168_17.method3856();
		Static250.aClass168_43.method3856();
		Static651.aClass168_95.method3856();
		Static199.aClass168_33.method3856();
		Static247.aClass168_42.method3856();
	}

	@OriginalMember(owner = "client!jia", name = "i", descriptor = "(I)V")
	public static void method4448() {
		@Pc(5) int local5;
		if (Static429.aClass250Array119 != null) {
			for (local5 = 0; local5 < Static115.anInt1870; local5++) {
				Static429.aClass250Array119[local5] = null;
			}
			Static429.aClass250Array119 = null;
		}
		if (Static41.aClass250Array16 != null) {
			for (local5 = 0; local5 < Static609.anInt7074; local5++) {
				Static41.aClass250Array16[local5] = null;
			}
			Static41.aClass250Array16 = null;
		}
		if (Static96.aClass250Array178 != null) {
			for (local5 = 0; local5 < Static412.anInt6979; local5++) {
				Static96.aClass250Array178[local5] = null;
			}
			Static96.aClass250Array178 = null;
		}
		Static362.anInt9811 = -1;
		Static504.anInt8078 = -1;
		Static648.anIntArrayArrayArray19 = null;
		Static660.anIntArray613 = null;
		Static5.aClass250Array181 = null;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!hha;")
	public static Class27 method4449(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(18) Class27 local18;
		try {
			local18 = (Class27) Class.forName("bca").getDeclaredConstructor().newInstance();
		} catch (@Pc(20) Throwable local20) {
			local18 = new Class27_Sub2();
		}
		local18.anInt1167 = arg0;
		local18.aString11 = arg1;
		return local18;
	}
}

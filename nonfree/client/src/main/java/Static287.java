import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "Lclient!of;")
	public static final Class174 aClass174_186 = new Class174(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLclient!qw;II)V")
	public static void method5413(@OriginalArg(1) Class3_Sub38 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0 == Static325.aClass193_54.aClass3_198) {
			return;
		}
		@Pc(23) int local23 = arg0.anInt5874;
		@Pc(26) int local26 = arg0.anInt5870;
		@Pc(29) int local29 = arg0.anInt5875;
		@Pc(33) int local33 = (int) arg0.aLong199;
		if (local29 >= 2000) {
			local29 -= 2000;
		}
		@Pc(40) long local40 = arg0.aLong199;
		if (local29 == 1012) {
			Static314.anInt5331 = 2;
			Static368.anInt6235 = 0;
			Static105.anInt1902 = arg1;
			Static390.anInt6546 = arg2;
			Static307.method4633(Static91.aClass163_52);
			Static243.aClass3_Sub25_Sub1_7.method4123((int) (local40 >>> 32) & Integer.MAX_VALUE);
			Static243.aClass3_Sub25_Sub1_7.method4123(local23 + Static59.anInt1127);
			Static243.aClass3_Sub25_Sub1_7.method4090(Static137.aClass143_1.method5471(82) ? 1 : 0);
			Static243.aClass3_Sub25_Sub1_7.method4093(local26 + Static49.anInt873);
			Static429.method5840(local23, local26, local40);
		}
		@Pc(108) Class3_Sub40 local108;
		@Pc(117) Class1_Sub2_Sub6_Sub1 local117;
		if (local29 == 16) {
			local108 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local33);
			if (local108 != null) {
				Static368.anInt6235 = 0;
				Static390.anInt6546 = arg2;
				local117 = local108.aClass1_Sub2_Sub6_Sub1_2;
				Static314.anInt5331 = 2;
				Static105.anInt1902 = arg1;
				Static307.method4633(Static276.aClass163_115);
				Static243.aClass3_Sub25_Sub1_7.method4081(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static243.aClass3_Sub25_Sub1_7.method4106(local33);
				Static39.method636(0, local117.anIntArray509[0], local117.method6204(), -2, 0, local117.method6204(), true, local117.anIntArray510[0]);
			}
		}
		if (local29 == 23) {
			local108 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local33);
			if (local108 != null) {
				Static368.anInt6235 = 0;
				Static390.anInt6546 = arg2;
				Static314.anInt5331 = 2;
				Static105.anInt1902 = arg1;
				local117 = local108.aClass1_Sub2_Sub6_Sub1_2;
				Static307.method4633(Static76.aClass163_45);
				Static243.aClass3_Sub25_Sub1_7.method4081(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static243.aClass3_Sub25_Sub1_7.method4093(local33);
				Static39.method636(0, local117.anIntArray509[0], local117.method6204(), -2, 0, local117.method6204(), true, local117.anIntArray510[0]);
			}
		}
		if (local29 == 8) {
			if (Static300.anInt5196 > 0 && Static137.aClass143_1.method5471(82) && Static137.aClass143_1.method5471(81)) {
				Static365.method5103(Static59.anInt1127 + local23, Static49.anInt873 + local26, Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101);
			} else {
				Static423.method5768(local26, local23, local33);
				if (local33 == 1) {
					Static243.aClass3_Sub25_Sub1_7.method4081(-1);
					Static243.aClass3_Sub25_Sub1_7.method4081(-1);
					Static243.aClass3_Sub25_Sub1_7.method4123((int) Static19.aFloat6);
					Static243.aClass3_Sub25_Sub1_7.method4081(57);
					Static243.aClass3_Sub25_Sub1_7.method4081(Static139.anInt2475);
					Static243.aClass3_Sub25_Sub1_7.method4081(Static197.anInt3551);
					Static243.aClass3_Sub25_Sub1_7.method4081(89);
					Static243.aClass3_Sub25_Sub1_7.method4123(Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560);
					Static243.aClass3_Sub25_Sub1_7.method4123(Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557);
					Static243.aClass3_Sub25_Sub1_7.method4081(63);
				} else {
					Static390.anInt6546 = arg2;
					Static314.anInt5331 = 1;
					Static105.anInt1902 = arg1;
					Static368.anInt6235 = 0;
				}
				Static39.method636(0, local26, 1, -4, 0, 1, true, local23);
			}
		}
		if (local29 == 12) {
			Static368.anInt6235 = 0;
			Static105.anInt1902 = arg1;
			Static314.anInt5331 = 2;
			Static390.anInt6546 = arg2;
			Static307.method4633(Static394.aClass163_171);
			Static243.aClass3_Sub25_Sub1_7.method4123(local23 + Static59.anInt1127);
			Static243.aClass3_Sub25_Sub1_7.method4081(Static137.aClass143_1.method5471(82) ? 1 : 0);
			Static243.aClass3_Sub25_Sub1_7.method4123(Integer.MAX_VALUE & (int) (local40 >>> 32));
			Static243.aClass3_Sub25_Sub1_7.method4077(local26 + Static49.anInt873);
			Static429.method5840(local23, local26, local40);
		}
		@Pc(399) Class82 local399;
		if (local29 == 10) {
			local399 = Static360.method5048(local23, local26);
			if (local399 != null) {
				Static178.method2853();
				@Pc(406) Class3_Sub42 local406 = Static54.method1060(local399);
				Static294.method4202(local406.method5454(), local399, local406.anInt6590);
				Static320.aString12 = Static363.method5076(local399);
				if (Static320.aString12 == null) {
					Static320.aString12 = "Null";
				}
				Static296.aString56 = local399.aString34 + "<col=ffffff>";
			}
			return;
		}
		@Pc(440) Class1_Sub2_Sub6_Sub2 local440;
		if (local29 == 6) {
			local440 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local33];
			if (local440 != null) {
				Static390.anInt6546 = arg2;
				Static105.anInt1902 = arg1;
				Static368.anInt6235 = 0;
				Static314.anInt5331 = 2;
				Static307.method4633(Static443.aClass163_188);
				Static243.aClass3_Sub25_Sub1_7.method4093(local33);
				Static243.aClass3_Sub25_Sub1_7.method4084(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static39.method636(0, local440.anIntArray509[0], local440.method6204(), -2, 0, local440.method6204(), true, local440.anIntArray510[0]);
			}
		}
		if (local29 == 21) {
			local440 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local33];
			if (local440 != null) {
				Static368.anInt6235 = 0;
				Static314.anInt5331 = 2;
				Static105.anInt1902 = arg1;
				Static390.anInt6546 = arg2;
				Static307.method4633(Static93.aClass163_53);
				Static243.aClass3_Sub25_Sub1_7.method4106(local33);
				Static243.aClass3_Sub25_Sub1_7.method4081(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static39.method636(0, local440.anIntArray509[0], local440.method6204(), -2, 0, local440.method6204(), true, local440.anIntArray510[0]);
			}
		}
		if (local29 == 46) {
			local440 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local33];
			if (local440 != null) {
				Static105.anInt1902 = arg1;
				Static368.anInt6235 = 0;
				Static314.anInt5331 = 2;
				Static390.anInt6546 = arg2;
				Static307.method4633(Static140.aClass163_65);
				Static243.aClass3_Sub25_Sub1_7.method4106(local33);
				Static243.aClass3_Sub25_Sub1_7.method4084(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static39.method636(0, local440.anIntArray509[0], local440.method6204(), -2, 0, local440.method6204(), true, local440.anIntArray510[0]);
			}
		}
		if (local29 == 3) {
			local440 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local33];
			if (local440 != null) {
				Static105.anInt1902 = arg1;
				Static390.anInt6546 = arg2;
				Static314.anInt5331 = 2;
				Static368.anInt6235 = 0;
				Static307.method4633(Static304.aClass163_168);
				Static243.aClass3_Sub25_Sub1_7.method4090(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static243.aClass3_Sub25_Sub1_7.method4077(local33);
				Static39.method636(0, local440.anIntArray509[0], local440.method6204(), -2, 0, local440.method6204(), true, local440.anIntArray510[0]);
			}
		}
		if (local29 == 17) {
			Static314.anInt5331 = 2;
			Static368.anInt6235 = 0;
			Static105.anInt1902 = arg1;
			Static390.anInt6546 = arg2;
			Static307.method4633(Static162.aClass163_84);
			Static243.aClass3_Sub25_Sub1_7.method4093(local33);
			Static243.aClass3_Sub25_Sub1_7.method4123(Static49.anInt873 + local26);
			Static243.aClass3_Sub25_Sub1_7.method4090(Static137.aClass143_1.method5471(82) ? 1 : 0);
			Static243.aClass3_Sub25_Sub1_7.method4077(local23 + Static59.anInt1127);
			Static168.method2587(local26, local23);
		}
		if (local29 == 19) {
			local440 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local33];
			if (local440 != null) {
				Static368.anInt6235 = 0;
				Static314.anInt5331 = 2;
				Static105.anInt1902 = arg1;
				Static390.anInt6546 = arg2;
				Static307.method4633(Static147.aClass163_72);
				Static243.aClass3_Sub25_Sub1_7.method4081(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static243.aClass3_Sub25_Sub1_7.method4123(local33);
				Static39.method636(0, local440.anIntArray509[0], local440.method6204(), -2, 0, local440.method6204(), true, local440.anIntArray510[0]);
			}
		}
		if (local29 == 59) {
			local440 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local33];
			if (local440 != null) {
				Static105.anInt1902 = arg1;
				Static390.anInt6546 = arg2;
				Static314.anInt5331 = 2;
				Static368.anInt6235 = 0;
				Static307.method4633(Static221.aClass163_175);
				Static243.aClass3_Sub25_Sub1_7.method4090(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static243.aClass3_Sub25_Sub1_7.method4093(local33);
				Static39.method636(0, local440.anIntArray509[0], local440.method6204(), -2, 0, local440.method6204(), true, local440.anIntArray510[0]);
			}
		}
		if (local29 == 49) {
			local440 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local33];
			if (local440 != null) {
				Static390.anInt6546 = arg2;
				Static314.anInt5331 = 2;
				Static368.anInt6235 = 0;
				Static105.anInt1902 = arg1;
				Static307.method4633(Static141.aClass163_68);
				Static243.aClass3_Sub25_Sub1_7.method4084(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static243.aClass3_Sub25_Sub1_7.method4077(local33);
				Static39.method636(0, local440.anIntArray509[0], local440.method6204(), -2, 0, local440.method6204(), true, local440.anIntArray510[0]);
			}
		}
		if (local29 == 45 || local29 == 1006) {
			Static300.method4283(local26, arg0.aString57, local33, local23);
		}
		if (local29 == 48) {
			Static314.anInt5331 = 2;
			Static368.anInt6235 = 0;
			Static390.anInt6546 = arg2;
			Static105.anInt1902 = arg1;
			Static307.method4633(Static293.aClass163_120);
			Static243.aClass3_Sub25_Sub1_7.method4123(local33);
			Static243.aClass3_Sub25_Sub1_7.method4093(local23 + Static59.anInt1127);
			Static243.aClass3_Sub25_Sub1_7.method4090(Static137.aClass143_1.method5471(82) ? 1 : 0);
			Static243.aClass3_Sub25_Sub1_7.method4093(Static49.anInt873 + local26);
			Static168.method2587(local26, local23);
		}
		if (local29 == 30) {
			Static368.anInt6235 = 0;
			Static314.anInt5331 = 2;
			Static105.anInt1902 = arg1;
			Static390.anInt6546 = arg2;
			Static307.method4633(Static357.aClass163_151);
			Static243.aClass3_Sub25_Sub1_7.method4084(Static137.aClass143_1.method5471(82) ? 1 : 0);
			Static243.aClass3_Sub25_Sub1_7.method4106(local26 + Static49.anInt873);
			Static243.aClass3_Sub25_Sub1_7.method4106(local33);
			Static243.aClass3_Sub25_Sub1_7.method4123(local23 + Static59.anInt1127);
			Static168.method2587(local26, local23);
		}
		if (local29 == 44) {
			local108 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local33);
			if (local108 != null) {
				Static105.anInt1902 = arg1;
				local117 = local108.aClass1_Sub2_Sub6_Sub1_2;
				Static314.anInt5331 = 2;
				Static368.anInt6235 = 0;
				Static390.anInt6546 = arg2;
				Static307.method4633(Static306.aClass163_128);
				Static243.aClass3_Sub25_Sub1_7.method4106(Static102.anInt1846);
				Static243.aClass3_Sub25_Sub1_7.method4090(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static243.aClass3_Sub25_Sub1_7.method4077(local33);
				Static243.aClass3_Sub25_Sub1_7.method4071(Static327.anInt5460);
				Static243.aClass3_Sub25_Sub1_7.method4077(Static138.anInt2449);
				Static39.method636(0, local117.anIntArray509[0], local117.method6204(), -2, 0, local117.method6204(), true, local117.anIntArray510[0]);
			}
		}
		if (local29 == 58) {
			local399 = Static360.method5048(local23, local26);
			if (local399 != null) {
				Static58.method1109(local399);
			}
		}
		if (local29 == 1003) {
			Static390.anInt6546 = arg2;
			Static314.anInt5331 = 2;
			Static368.anInt6235 = 0;
			Static105.anInt1902 = arg1;
			Static307.method4633(Static218.aClass163_192);
			Static243.aClass3_Sub25_Sub1_7.method4123(local33);
		}
		if (local29 == 20) {
			Static314.anInt5331 = 2;
			Static390.anInt6546 = arg2;
			Static105.anInt1902 = arg1;
			Static368.anInt6235 = 0;
			Static307.method4633(Static285.aClass163_117);
			Static243.aClass3_Sub25_Sub1_7.method4077(Static138.anInt2449);
			Static243.aClass3_Sub25_Sub1_7.method4106(Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7621);
			Static243.aClass3_Sub25_Sub1_7.method4084(Static137.aClass143_1.method5471(82) ? 1 : 0);
			Static243.aClass3_Sub25_Sub1_7.method4105(Static327.anInt5460);
			Static243.aClass3_Sub25_Sub1_7.method4077(Static102.anInt1846);
		}
		if (local29 == 1010 || local29 == 1004 || local29 == 1001 || local29 == 1008 || local29 == 1011) {
			Static244.method3506(local33, local23, local29);
		}
		if (local29 == 18) {
			Static390.anInt6546 = arg2;
			Static368.anInt6235 = 0;
			Static314.anInt5331 = 2;
			Static105.anInt1902 = arg1;
			Static307.method4633(Static393.aClass163_170);
			Static243.aClass3_Sub25_Sub1_7.method4123(Static49.anInt873 + local26);
			Static243.aClass3_Sub25_Sub1_7.method4077(local23 + Static59.anInt1127);
			Static243.aClass3_Sub25_Sub1_7.method4106((int) (local40 >>> 32) & Integer.MAX_VALUE);
			Static243.aClass3_Sub25_Sub1_7.method4081(Static137.aClass143_1.method5471(82) ? 1 : 0);
			Static429.method5840(local23, local26, local40);
		}
		if (local29 == 22) {
			local108 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local33);
			if (local108 != null) {
				Static390.anInt6546 = arg2;
				Static314.anInt5331 = 2;
				Static105.anInt1902 = arg1;
				Static368.anInt6235 = 0;
				local117 = local108.aClass1_Sub2_Sub6_Sub1_2;
				Static307.method4633(Static320.aClass163_37);
				Static243.aClass3_Sub25_Sub1_7.method4106(local33);
				Static243.aClass3_Sub25_Sub1_7.method4070(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static39.method636(0, local117.anIntArray509[0], local117.method6204(), -2, 0, local117.method6204(), true, local117.anIntArray510[0]);
			}
		}
		if (local29 == 57) {
			local108 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local33);
			if (local108 != null) {
				local117 = local108.aClass1_Sub2_Sub6_Sub1_2;
				Static390.anInt6546 = arg2;
				Static368.anInt6235 = 0;
				Static314.anInt5331 = 2;
				Static105.anInt1902 = arg1;
				Static307.method4633(Static325.aClass163_132);
				Static243.aClass3_Sub25_Sub1_7.method4123(local33);
				Static243.aClass3_Sub25_Sub1_7.method4081(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static39.method636(0, local117.anIntArray509[0], local117.method6204(), -2, 0, local117.method6204(), true, local117.anIntArray510[0]);
			}
		}
		if (local29 == 2) {
			local108 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local33);
			if (local108 != null) {
				Static390.anInt6546 = arg2;
				Static105.anInt1902 = arg1;
				local117 = local108.aClass1_Sub2_Sub6_Sub1_2;
				Static314.anInt5331 = 2;
				Static368.anInt6235 = 0;
				Static307.method4633(Static248.aClass163_110);
				Static243.aClass3_Sub25_Sub1_7.method4093(local33);
				Static243.aClass3_Sub25_Sub1_7.method4090(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static39.method636(0, local117.anIntArray509[0], local117.method6204(), -2, 0, local117.method6204(), true, local117.anIntArray510[0]);
			}
		}
		if (local29 == 60 && Static444.aClass82_23 == null) {
			Static463.method6303(local23, local26);
			Static444.aClass82_23 = Static360.method5048(local23, local26);
			Static463.method6297(Static444.aClass82_23);
		}
		if (local29 == 9) {
			if (Static300.anInt5196 > 0 && Static137.aClass143_1.method5471(82) && Static137.aClass143_1.method5471(81)) {
				Static365.method5103(local23 + Static59.anInt1127, local26 + Static49.anInt873, Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101);
			} else {
				Static314.anInt5331 = 1;
				Static105.anInt1902 = arg1;
				Static368.anInt6235 = 0;
				Static390.anInt6546 = arg2;
				Static307.method4633(Static370.aClass163_158);
				Static243.aClass3_Sub25_Sub1_7.method4093(local26 + Static49.anInt873);
				Static243.aClass3_Sub25_Sub1_7.method4077(Static59.anInt1127 + local23);
			}
		}
		if (local29 == 5) {
			Static105.anInt1902 = arg1;
			Static314.anInt5331 = 2;
			Static390.anInt6546 = arg2;
			Static368.anInt6235 = 0;
			Static307.method4633(Static18.aClass163_16);
			Static243.aClass3_Sub25_Sub1_7.method4093(local23 + Static59.anInt1127);
			Static243.aClass3_Sub25_Sub1_7.method4090(Static137.aClass143_1.method5471(82) ? 1 : 0);
			Static243.aClass3_Sub25_Sub1_7.method4106(local33);
			Static243.aClass3_Sub25_Sub1_7.method4106(local26 + Static49.anInt873);
			Static168.method2587(local26, local23);
		}
		if (local29 == 15) {
			local440 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local33];
			if (local440 != null) {
				Static105.anInt1902 = arg1;
				Static314.anInt5331 = 2;
				Static368.anInt6235 = 0;
				Static390.anInt6546 = arg2;
				Static307.method4633(Static269.aClass163_87);
				Static243.aClass3_Sub25_Sub1_7.method4106(local33);
				Static243.aClass3_Sub25_Sub1_7.method4081(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static39.method636(0, local440.anIntArray509[0], local440.method6204(), -2, 0, local440.method6204(), true, local440.anIntArray510[0]);
			}
		}
		if (local29 == 13) {
			Static390.anInt6546 = arg2;
			Static314.anInt5331 = 2;
			Static105.anInt1902 = arg1;
			Static368.anInt6235 = 0;
			Static307.method4633(Static443.aClass163_189);
			Static243.aClass3_Sub25_Sub1_7.method4123(Integer.MAX_VALUE & (int) (local40 >>> 32));
			Static243.aClass3_Sub25_Sub1_7.method4070(Static137.aClass143_1.method5471(82) ? 1 : 0);
			Static243.aClass3_Sub25_Sub1_7.method4106(local26 + Static49.anInt873);
			Static243.aClass3_Sub25_Sub1_7.method4123(Static59.anInt1127 + local23);
			Static429.method5840(local23, local26, local40);
		}
		if (local29 == 51) {
			Static390.anInt6546 = arg2;
			Static368.anInt6235 = 0;
			Static105.anInt1902 = arg1;
			Static314.anInt5331 = 2;
			Static307.method4633(Static60.aClass163_34);
			Static243.aClass3_Sub25_Sub1_7.method4106(Integer.MAX_VALUE & (int) (local40 >>> 32));
			Static243.aClass3_Sub25_Sub1_7.method4093(local23 + Static59.anInt1127);
			Static243.aClass3_Sub25_Sub1_7.method4093(local26 + Static49.anInt873);
			Static243.aClass3_Sub25_Sub1_7.method4090(Static137.aClass143_1.method5471(82) ? 1 : 0);
			Static429.method5840(local23, local26, local40);
		}
		if (local29 == 1002) {
			Static390.anInt6546 = arg2;
			Static314.anInt5331 = 2;
			Static105.anInt1902 = arg1;
			Static368.anInt6235 = 0;
			local108 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local33);
			if (local108 != null) {
				local117 = local108.aClass1_Sub2_Sub6_Sub1_2;
				@Pc(1802) Class158 local1802 = local117.aClass158_1;
				if (local1802.anIntArray294 != null) {
					local1802 = local1802.method3705(Static119.aClass47_1);
				}
				if (local1802 != null) {
					Static307.method4633(Static370.aClass163_157);
					Static243.aClass3_Sub25_Sub1_7.method4123(local1802.anInt4476);
				}
			}
		}
		if (local29 == 50) {
			Static105.anInt1902 = arg1;
			Static314.anInt5331 = 1;
			Static390.anInt6546 = arg2;
			Static368.anInt6235 = 0;
			Static307.method4633(Static134.aClass163_64);
			Static243.aClass3_Sub25_Sub1_7.method4093(local26 + Static49.anInt873);
			Static243.aClass3_Sub25_Sub1_7.method4093(Static102.anInt1846);
			Static243.aClass3_Sub25_Sub1_7.method4123(Static138.anInt2449);
			Static243.aClass3_Sub25_Sub1_7.method4123(Static59.anInt1127 + local23);
			Static243.aClass3_Sub25_Sub1_7.method4071(Static327.anInt5460);
			Static39.method636(0, local26, 1, -4, 0, 1, true, local23);
		}
		if (local29 == 47) {
			Static390.anInt6546 = arg2;
			Static314.anInt5331 = 2;
			Static105.anInt1902 = arg1;
			Static368.anInt6235 = 0;
			Static307.method4633(Static5.aClass163_2);
			Static243.aClass3_Sub25_Sub1_7.method4084(Static137.aClass143_1.method5471(82) ? 1 : 0);
			Static243.aClass3_Sub25_Sub1_7.method4123(local23 + Static59.anInt1127);
			Static243.aClass3_Sub25_Sub1_7.method4077(Static138.anInt2449);
			Static243.aClass3_Sub25_Sub1_7.method4106(local26 + Static49.anInt873);
			Static243.aClass3_Sub25_Sub1_7.method4123(local33);
			Static243.aClass3_Sub25_Sub1_7.method4105(Static327.anInt5460);
			Static243.aClass3_Sub25_Sub1_7.method4077(Static102.anInt1846);
			Static168.method2587(local26, local23);
		}
		if (local29 == 11) {
			Static390.anInt6546 = arg2;
			Static368.anInt6235 = 0;
			Static314.anInt5331 = 2;
			Static105.anInt1902 = arg1;
			Static307.method4633(Static353.aClass163_190);
			Static243.aClass3_Sub25_Sub1_7.method4077(Static49.anInt873 + local26);
			Static243.aClass3_Sub25_Sub1_7.method4090(Static137.aClass143_1.method5471(82) ? 1 : 0);
			Static243.aClass3_Sub25_Sub1_7.method4077(Static59.anInt1127 + local23);
			Static243.aClass3_Sub25_Sub1_7.method4106(local33);
			Static168.method2587(local26, local23);
		}
		if (local29 == 4) {
			local440 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local33];
			if (local440 != null) {
				Static368.anInt6235 = 0;
				Static314.anInt5331 = 2;
				Static390.anInt6546 = arg2;
				Static105.anInt1902 = arg1;
				Static307.method4633(Static285.aClass163_117);
				Static243.aClass3_Sub25_Sub1_7.method4077(Static138.anInt2449);
				Static243.aClass3_Sub25_Sub1_7.method4106(local33);
				Static243.aClass3_Sub25_Sub1_7.method4084(Static137.aClass143_1.method5471(82) ? 1 : 0);
				Static243.aClass3_Sub25_Sub1_7.method4105(Static327.anInt5460);
				Static243.aClass3_Sub25_Sub1_7.method4077(Static102.anInt1846);
				Static39.method636(0, local440.anIntArray509[0], local440.method6204(), -2, 0, local440.method6204(), true, local440.anIntArray510[0]);
			}
		}
		if (local29 == 25) {
			Static314.anInt5331 = 2;
			Static390.anInt6546 = arg2;
			Static368.anInt6235 = 0;
			Static105.anInt1902 = arg1;
			Static307.method4633(Static366.aClass163_154);
			Static243.aClass3_Sub25_Sub1_7.method4093(Static138.anInt2449);
			Static243.aClass3_Sub25_Sub1_7.method4090(Static137.aClass143_1.method5471(82) ? 1 : 0);
			Static243.aClass3_Sub25_Sub1_7.method4093(Integer.MAX_VALUE & (int) (local40 >>> 32));
			Static243.aClass3_Sub25_Sub1_7.method4123(Static49.anInt873 + local26);
			Static243.aClass3_Sub25_Sub1_7.method4077(local23 + Static59.anInt1127);
			Static243.aClass3_Sub25_Sub1_7.method4082(Static327.anInt5460);
			Static243.aClass3_Sub25_Sub1_7.method4077(Static102.anInt1846);
			Static429.method5840(local23, local26, local40);
		}
		if (local29 == 1007) {
			Static368.anInt6235 = 0;
			Static314.anInt5331 = 2;
			Static390.anInt6546 = arg2;
			Static105.anInt1902 = arg1;
			Static307.method4633(Static62.aClass163_35);
			Static243.aClass3_Sub25_Sub1_7.method4123(local33);
		}
		if (Static73.aBoolean88) {
			Static178.method2853();
		}
		if (Static260.aClass82_21 != null && Static438.anInt2388 == 0) {
			Static463.method6297(Static260.aClass82_21);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
	public static void method5414() {
		Static57.anInt1114 = -1;
		Static439.anInt7311 = 0;
		Static392.anInt6568 = -1;
		Static31.anInt592 = -1;
	}
}

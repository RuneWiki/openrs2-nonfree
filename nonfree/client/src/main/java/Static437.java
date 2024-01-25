import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
	public static int anInt7214;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "Lclient!s;")
	public static final Class217 aClass217_157 = new Class217(11, 8);

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "Lclient!mo;")
	public static final Class168 aClass168_39 = new Class168(12, 15);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!nn;I)Lclient!ej;")
	public static Class10_Sub2 method5684(@OriginalArg(0) Class10_Sub8 arg0) {
		arg0.method2502();
		@Pc(18) int local18 = arg0.method2502();
		@Pc(22) Class10_Sub2 local22 = Static316.method4338(local18);
		local22.anInt7569 = arg0.method2502();
		@Pc(31) int local31 = arg0.method2502();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method2502();
			local22.method6044(local39, arg0);
		}
		local22.method6036();
		return local22;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!wi;IIB)V")
	public static void method5688(@OriginalArg(0) Class10_Sub45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || arg0 == Static70.aClass163_13.aClass10_149) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt7507;
		@Pc(18) int local18 = arg0.anInt7508;
		@Pc(21) int local21 = arg0.anInt7505;
		@Pc(25) int local25 = (int) arg0.aLong261;
		@Pc(28) long local28 = arg0.aLong261;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(42) Class89 local42;
		if (local21 == 30) {
			local42 = Static397.method5275(local15, local18);
			if (local42 != null) {
				Static456.method6051();
				@Pc(51) Class10_Sub38 local51 = Static56.method1002(local42);
				Static382.method5564(local51.anInt5651, local51.method4502(), local42);
				Static312.aString52 = Static11.method162(local42);
				Static70.aString10 = local42.aString18 + "<col=ffffff>";
				if (Static312.aString52 == null) {
					Static312.aString52 = "Null";
				}
			}
			return;
		}
		if (local21 == 57) {
			Static156.anInt3162 = arg1;
			Static177.anInt3658 = 2;
			Static167.anInt3308 = 0;
			Static152.anInt3123 = arg2;
			Static310.method4308(Static80.aClass27_34);
			Static337.aClass10_Sub8_Sub2_2.method2519(local15 + Static168.anInt3353);
			Static337.aClass10_Sub8_Sub2_2.method2519(local25);
			Static337.aClass10_Sub8_Sub2_2.method2519(local18 + Static72.anInt1488);
			Static337.aClass10_Sub8_Sub2_2.method2458(Static197.aClass245_1.method5907(82) ? 1 : 0);
			Static156.method2640(local15, local18);
		}
		if (local21 == 10) {
			Static167.anInt3308 = 0;
			Static156.anInt3162 = arg1;
			Static152.anInt3123 = arg2;
			Static177.anInt3658 = 2;
			Static310.method4308(Static223.aClass27_69);
			Static337.aClass10_Sub8_Sub2_2.method2497(local25);
			Static337.aClass10_Sub8_Sub2_2.method2505(local15 + Static168.anInt3353);
			Static337.aClass10_Sub8_Sub2_2.method2518(Static197.aClass245_1.method5907(82) ? 1 : 0);
			Static337.aClass10_Sub8_Sub2_2.method2497(Static72.anInt1488 + local18);
			Static156.method2640(local15, local18);
		}
		if (local21 == 60) {
			Static177.anInt3658 = 2;
			Static156.anInt3162 = arg1;
			Static167.anInt3308 = 0;
			Static152.anInt3123 = arg2;
			Static310.method4308(Static432.aClass27_105);
			Static337.aClass10_Sub8_Sub2_2.method2505((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static337.aClass10_Sub8_Sub2_2.method2474(Static197.aClass245_1.method5907(82) ? 1 : 0);
			Static337.aClass10_Sub8_Sub2_2.method2519(Static72.anInt1488 + local18);
			Static337.aClass10_Sub8_Sub2_2.method2505(local15 + Static168.anInt3353);
			Static25.method332(local28, local15, local18);
		}
		@Pc(241) Class24_Sub3_Sub2_Sub2 local241;
		if (local21 == 8) {
			local241 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local25];
			if (local241 != null) {
				Static152.anInt3123 = arg2;
				Static156.anInt3162 = arg1;
				Static177.anInt3658 = 2;
				Static167.anInt3308 = 0;
				Static310.method4308(Static270.aClass27_76);
				Static337.aClass10_Sub8_Sub2_2.method2518(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static337.aClass10_Sub8_Sub2_2.method2509(local25);
				Static28.method370(0, local241.anIntArray611[0], true, local241.method4919(), local241.anIntArray610[0], -2, local241.method4919(), 0);
			}
		}
		if (local21 == 15) {
			Static152.anInt3123 = arg2;
			Static177.anInt3658 = 2;
			Static156.anInt3162 = arg1;
			Static167.anInt3308 = 0;
			Static310.method4308(Static135.aClass27_97);
			Static337.aClass10_Sub8_Sub2_2.method2509(local25);
			Static337.aClass10_Sub8_Sub2_2.method2497(local18 + Static72.anInt1488);
			Static337.aClass10_Sub8_Sub2_2.method2519(local15 + Static168.anInt3353);
			Static337.aClass10_Sub8_Sub2_2.method2518(Static197.aClass245_1.method5907(82) ? 1 : 0);
			Static156.method2640(local15, local18);
		}
		if (local21 == 13) {
			Static177.anInt3658 = 2;
			Static167.anInt3308 = 0;
			Static156.anInt3162 = arg1;
			Static152.anInt3123 = arg2;
			Static310.method4308(Static442.aClass27_107);
			Static337.aClass10_Sub8_Sub2_2.method2497((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static337.aClass10_Sub8_Sub2_2.method2509(Static72.anInt1488 + local18);
			Static337.aClass10_Sub8_Sub2_2.method2505(Static168.anInt3353 + local15);
			Static337.aClass10_Sub8_Sub2_2.method2458(Static197.aClass245_1.method5907(82) ? 1 : 0);
			Static25.method332(local28, local15, local18);
		}
		@Pc(436) Class24_Sub3_Sub2_Sub1 local436;
		@Pc(427) Class10_Sub26 local427;
		if (local21 == 6) {
			local427 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local25);
			if (local427 != null) {
				Static167.anInt3308 = 0;
				Static152.anInt3123 = arg2;
				local436 = local427.aClass24_Sub3_Sub2_Sub1_2;
				Static156.anInt3162 = arg1;
				Static177.anInt3658 = 2;
				Static310.method4308(Static456.aClass27_112);
				Static337.aClass10_Sub8_Sub2_2.method2497(local25);
				Static337.aClass10_Sub8_Sub2_2.method2458(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static28.method370(0, local436.anIntArray611[0], true, local436.method4919(), local436.anIntArray610[0], -2, local436.method4919(), 0);
			}
		}
		if (local21 == 18) {
			Static177.anInt3658 = 2;
			Static152.anInt3123 = arg2;
			Static156.anInt3162 = arg1;
			Static167.anInt3308 = 0;
			Static310.method4308(Static154.aClass27_59);
			Static337.aClass10_Sub8_Sub2_2.method2506(Static273.anInt4773);
			Static337.aClass10_Sub8_Sub2_2.method2474(Static197.aClass245_1.method5907(82) ? 1 : 0);
			Static337.aClass10_Sub8_Sub2_2.method2505(Static228.anInt4243);
			Static337.aClass10_Sub8_Sub2_2.method2497(Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6228);
			Static337.aClass10_Sub8_Sub2_2.method2497(Static219.anInt4156);
		}
		if (local21 == 21) {
			local241 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local25];
			if (local241 != null) {
				Static177.anInt3658 = 2;
				Static167.anInt3308 = 0;
				Static152.anInt3123 = arg2;
				Static156.anInt3162 = arg1;
				Static310.method4308(Static422.aClass27_100);
				Static337.aClass10_Sub8_Sub2_2.method2458(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static337.aClass10_Sub8_Sub2_2.method2497(local25);
				Static28.method370(0, local241.anIntArray611[0], true, local241.method4919(), local241.anIntArray610[0], -2, local241.method4919(), 0);
			}
		}
		if (local21 == 51) {
			local427 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local25);
			if (local427 != null) {
				Static152.anInt3123 = arg2;
				Static177.anInt3658 = 2;
				Static156.anInt3162 = arg1;
				local436 = local427.aClass24_Sub3_Sub2_Sub1_2;
				Static167.anInt3308 = 0;
				Static310.method4308(Static64.aClass27_28);
				Static337.aClass10_Sub8_Sub2_2.method2505(local25);
				Static337.aClass10_Sub8_Sub2_2.method2464(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static28.method370(0, local436.anIntArray611[0], true, local436.method4919(), local436.anIntArray610[0], -2, local436.method4919(), 0);
			}
		}
		if (local21 == 20) {
			local427 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local25);
			if (local427 != null) {
				local436 = local427.aClass24_Sub3_Sub2_Sub1_2;
				Static156.anInt3162 = arg1;
				Static152.anInt3123 = arg2;
				Static167.anInt3308 = 0;
				Static177.anInt3658 = 2;
				Static310.method4308(Static8.aClass27_5);
				Static337.aClass10_Sub8_Sub2_2.method2464(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static337.aClass10_Sub8_Sub2_2.method2519(local25);
				Static28.method370(0, local436.anIntArray611[0], true, local436.method4919(), local436.anIntArray610[0], -2, local436.method4919(), 0);
			}
		}
		if (local21 == 46) {
			local241 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local25];
			if (local241 != null) {
				Static156.anInt3162 = arg1;
				Static177.anInt3658 = 2;
				Static167.anInt3308 = 0;
				Static152.anInt3123 = arg2;
				Static310.method4308(Static127.aClass27_46);
				Static337.aClass10_Sub8_Sub2_2.method2519(local25);
				Static337.aClass10_Sub8_Sub2_2.method2518(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static28.method370(0, local241.anIntArray611[0], true, local241.method4919(), local241.anIntArray610[0], -2, local241.method4919(), 0);
			}
		}
		if (local21 == 59) {
			Static156.anInt3162 = arg1;
			Static167.anInt3308 = 0;
			Static177.anInt3658 = 2;
			Static152.anInt3123 = arg2;
			Static310.method4308(Static328.aClass27_103);
			Static337.aClass10_Sub8_Sub2_2.method2505(local25);
			Static337.aClass10_Sub8_Sub2_2.method2458(Static197.aClass245_1.method5907(82) ? 1 : 0);
			Static337.aClass10_Sub8_Sub2_2.method2505(local18 + Static72.anInt1488);
			Static337.aClass10_Sub8_Sub2_2.method2497(local15 + Static168.anInt3353);
			Static156.method2640(local15, local18);
		}
		if (local21 == 16) {
			Static156.anInt3162 = arg1;
			Static152.anInt3123 = arg2;
			Static177.anInt3658 = 2;
			Static167.anInt3308 = 0;
			Static310.method4308(Static48.aClass27_21);
			Static337.aClass10_Sub8_Sub2_2.method2458(Static197.aClass245_1.method5907(82) ? 1 : 0);
			Static337.aClass10_Sub8_Sub2_2.method2509(local25);
			Static337.aClass10_Sub8_Sub2_2.method2497(local18 + Static72.anInt1488);
			Static337.aClass10_Sub8_Sub2_2.method2505(local15 + Static168.anInt3353);
			Static156.method2640(local15, local18);
		}
		if (local21 == 47) {
			Static156.anInt3162 = arg1;
			Static152.anInt3123 = arg2;
			Static177.anInt3658 = 2;
			Static167.anInt3308 = 0;
			Static310.method4308(Static28.aClass27_12);
			Static337.aClass10_Sub8_Sub2_2.method2497(local25);
			Static337.aClass10_Sub8_Sub2_2.method2464(Static197.aClass245_1.method5907(82) ? 1 : 0);
			Static337.aClass10_Sub8_Sub2_2.method2505(Static228.anInt4243);
			Static337.aClass10_Sub8_Sub2_2.method2497(Static168.anInt3353 + local15);
			Static337.aClass10_Sub8_Sub2_2.method2497(Static72.anInt1488 + local18);
			Static337.aClass10_Sub8_Sub2_2.method2523(Static273.anInt4773);
			Static337.aClass10_Sub8_Sub2_2.method2519(Static219.anInt4156);
			Static156.method2640(local15, local18);
		}
		if (local21 == 11) {
			local427 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local25);
			if (local427 != null) {
				Static177.anInt3658 = 2;
				Static152.anInt3123 = arg2;
				Static156.anInt3162 = arg1;
				Static167.anInt3308 = 0;
				local436 = local427.aClass24_Sub3_Sub2_Sub1_2;
				Static310.method4308(Static12.aClass27_8);
				Static337.aClass10_Sub8_Sub2_2.method2517(Static273.anInt4773);
				Static337.aClass10_Sub8_Sub2_2.method2464(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static337.aClass10_Sub8_Sub2_2.method2497(local25);
				Static337.aClass10_Sub8_Sub2_2.method2497(Static228.anInt4243);
				Static337.aClass10_Sub8_Sub2_2.method2505(Static219.anInt4156);
				Static28.method370(0, local436.anIntArray611[0], true, local436.method4919(), local436.anIntArray610[0], -2, local436.method4919(), 0);
			}
		}
		if (local21 == 23) {
			local241 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local25];
			if (local241 != null) {
				Static167.anInt3308 = 0;
				Static177.anInt3658 = 2;
				Static152.anInt3123 = arg2;
				Static156.anInt3162 = arg1;
				Static310.method4308(Static299.aClass27_73);
				Static337.aClass10_Sub8_Sub2_2.method2464(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static337.aClass10_Sub8_Sub2_2.method2519(local25);
				Static28.method370(0, local241.anIntArray611[0], true, local241.method4919(), local241.anIntArray610[0], -2, local241.method4919(), 0);
			}
		}
		if (local21 == 1008) {
			Static177.anInt3658 = 2;
			Static152.anInt3123 = arg2;
			Static167.anInt3308 = 0;
			Static156.anInt3162 = arg1;
			Static310.method4308(Static211.aClass27_66);
			Static337.aClass10_Sub8_Sub2_2.method2509(local25);
		}
		if (local21 == 49) {
			Static167.anInt3308 = 0;
			Static177.anInt3658 = 1;
			Static152.anInt3123 = arg2;
			Static156.anInt3162 = arg1;
			Static310.method4308(Static147.aClass27_55);
			Static337.aClass10_Sub8_Sub2_2.method2505(local18 + Static72.anInt1488);
			Static337.aClass10_Sub8_Sub2_2.method2505(Static228.anInt4243);
			Static337.aClass10_Sub8_Sub2_2.method2509(local15 + Static168.anInt3353);
			Static337.aClass10_Sub8_Sub2_2.method2505(Static219.anInt4156);
			Static337.aClass10_Sub8_Sub2_2.method2523(Static273.anInt4773);
			Static28.method370(0, local18, true, 1, local15, -4, 1, 0);
		}
		if (local21 == 45 || local21 == 1001) {
			Static344.method4661(local25, local18, arg0.aString72, local15);
		}
		if (local21 == 19 && Static378.aClass89_13 == null) {
			Static169.method2822(local15, local18);
			Static378.aClass89_13 = Static397.method5275(local15, local18);
			Static135.method5400(Static378.aClass89_13);
		}
		if (local21 == 5) {
			if (Static200.anInt3974 > 0 && Static197.aClass245_1.method5907(82) && Static197.aClass245_1.method5907(81)) {
				Static297.method4135(Static72.anInt1488 + local18, local15 + Static168.anInt3353, Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98);
			} else {
				Static140.method2399(local18, local15, local25);
				if (local25 == 1) {
					Static337.aClass10_Sub8_Sub2_2.method2458(-1);
					Static337.aClass10_Sub8_Sub2_2.method2458(-1);
					Static337.aClass10_Sub8_Sub2_2.method2509((int) Static149.aFloat53);
					Static337.aClass10_Sub8_Sub2_2.method2458(57);
					Static337.aClass10_Sub8_Sub2_2.method2458(Static419.anInt7040);
					Static337.aClass10_Sub8_Sub2_2.method2458(Static394.anInt6667);
					Static337.aClass10_Sub8_Sub2_2.method2458(89);
					Static337.aClass10_Sub8_Sub2_2.method2509(Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092);
					Static337.aClass10_Sub8_Sub2_2.method2509(Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094);
					Static337.aClass10_Sub8_Sub2_2.method2458(63);
				} else {
					Static167.anInt3308 = 0;
					Static152.anInt3123 = arg2;
					Static177.anInt3658 = 1;
					Static156.anInt3162 = arg1;
				}
				Static28.method370(0, local18, true, 1, local15, -4, 1, 0);
			}
		}
		if (local21 == 4) {
			Static152.anInt3123 = arg2;
			Static177.anInt3658 = 2;
			Static156.anInt3162 = arg1;
			Static167.anInt3308 = 0;
			Static310.method4308(Static327.aClass27_75);
			Static337.aClass10_Sub8_Sub2_2.method2464(Static197.aClass245_1.method5907(82) ? 1 : 0);
			Static337.aClass10_Sub8_Sub2_2.method2497(Static168.anInt3353 + local15);
			Static337.aClass10_Sub8_Sub2_2.method2519((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static337.aClass10_Sub8_Sub2_2.method2509(Static72.anInt1488 + local18);
			Static25.method332(local28, local15, local18);
		}
		if (local21 == 44) {
			local241 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local25];
			if (local241 != null) {
				Static156.anInt3162 = arg1;
				Static167.anInt3308 = 0;
				Static177.anInt3658 = 2;
				Static152.anInt3123 = arg2;
				Static310.method4308(Static352.aClass27_86);
				Static337.aClass10_Sub8_Sub2_2.method2519(local25);
				Static337.aClass10_Sub8_Sub2_2.method2474(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static28.method370(0, local241.anIntArray611[0], true, local241.method4919(), local241.anIntArray610[0], -2, local241.method4919(), 0);
			}
		}
		if (local21 == 17) {
			Static167.anInt3308 = 0;
			Static152.anInt3123 = arg2;
			Static156.anInt3162 = arg1;
			Static177.anInt3658 = 2;
			Static310.method4308(Static455.aClass27_111);
			Static337.aClass10_Sub8_Sub2_2.method2458(Static197.aClass245_1.method5907(82) ? 1 : 0);
			Static337.aClass10_Sub8_Sub2_2.method2497(Static72.anInt1488 + local18);
			Static337.aClass10_Sub8_Sub2_2.method2497((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static337.aClass10_Sub8_Sub2_2.method2509(Static168.anInt3353 + local15);
			Static25.method332(local28, local15, local18);
		}
		if (local21 == 9) {
			local427 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local25);
			if (local427 != null) {
				Static156.anInt3162 = arg1;
				Static152.anInt3123 = arg2;
				Static167.anInt3308 = 0;
				local436 = local427.aClass24_Sub3_Sub2_Sub1_2;
				Static177.anInt3658 = 2;
				Static310.method4308(Static61.aClass27_26);
				Static337.aClass10_Sub8_Sub2_2.method2518(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static337.aClass10_Sub8_Sub2_2.method2509(local25);
				Static28.method370(0, local436.anIntArray611[0], true, local436.method4919(), local436.anIntArray610[0], -2, local436.method4919(), 0);
			}
		}
		if (local21 == 1012) {
			Static156.anInt3162 = arg1;
			Static167.anInt3308 = 0;
			Static152.anInt3123 = arg2;
			Static177.anInt3658 = 2;
			local427 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local25);
			if (local427 != null) {
				local436 = local427.aClass24_Sub3_Sub2_Sub1_2;
				@Pc(1606) Class222 local1606 = local436.aClass222_1;
				if (local1606.anIntArray613 != null) {
					local1606 = local1606.method4938(Static329.aClass201_9);
				}
				if (local1606 != null) {
					Static310.method4308(Static320.aClass27_81);
					Static337.aClass10_Sub8_Sub2_2.method2509(local1606.anInt6362);
				}
			}
		}
		if (local21 == 25) {
			local241 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local25];
			if (local241 != null) {
				Static177.anInt3658 = 2;
				Static152.anInt3123 = arg2;
				Static167.anInt3308 = 0;
				Static156.anInt3162 = arg1;
				Static310.method4308(Static154.aClass27_59);
				Static337.aClass10_Sub8_Sub2_2.method2506(Static273.anInt4773);
				Static337.aClass10_Sub8_Sub2_2.method2474(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static337.aClass10_Sub8_Sub2_2.method2505(Static228.anInt4243);
				Static337.aClass10_Sub8_Sub2_2.method2497(local25);
				Static337.aClass10_Sub8_Sub2_2.method2497(Static219.anInt4156);
				Static28.method370(0, local241.anIntArray611[0], true, local241.method4919(), local241.anIntArray610[0], -2, local241.method4919(), 0);
			}
		}
		if (local21 == 3) {
			local42 = Static397.method5275(local15, local18);
			if (local42 != null) {
				Static18.method257(local42);
			}
		}
		if (local21 == 1003) {
			Static152.anInt3123 = arg2;
			Static177.anInt3658 = 2;
			Static156.anInt3162 = arg1;
			Static167.anInt3308 = 0;
			Static310.method4308(Static226.aClass27_70);
			Static337.aClass10_Sub8_Sub2_2.method2509(local25);
		}
		if (local21 == 22) {
			local427 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local25);
			if (local427 != null) {
				local436 = local427.aClass24_Sub3_Sub2_Sub1_2;
				Static167.anInt3308 = 0;
				Static152.anInt3123 = arg2;
				Static156.anInt3162 = arg1;
				Static177.anInt3658 = 2;
				Static310.method4308(Static13.aClass27_80);
				Static337.aClass10_Sub8_Sub2_2.method2497(local25);
				Static337.aClass10_Sub8_Sub2_2.method2518(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static28.method370(0, local436.anIntArray611[0], true, local436.method4919(), local436.anIntArray610[0], -2, local436.method4919(), 0);
			}
		}
		if (local21 == 12) {
			local241 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local25];
			if (local241 != null) {
				Static152.anInt3123 = arg2;
				Static156.anInt3162 = arg1;
				Static177.anInt3658 = 2;
				Static167.anInt3308 = 0;
				Static310.method4308(Static385.aClass27_89);
				Static337.aClass10_Sub8_Sub2_2.method2464(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static337.aClass10_Sub8_Sub2_2.method2519(local25);
				Static28.method370(0, local241.anIntArray611[0], true, local241.method4919(), local241.anIntArray610[0], -2, local241.method4919(), 0);
			}
		}
		if (local21 == 1004) {
			Static177.anInt3658 = 2;
			Static156.anInt3162 = arg1;
			Static167.anInt3308 = 0;
			Static152.anInt3123 = arg2;
			Static310.method4308(Static403.aClass27_94);
			Static337.aClass10_Sub8_Sub2_2.method2519((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static337.aClass10_Sub8_Sub2_2.method2519(Static72.anInt1488 + local18);
			Static337.aClass10_Sub8_Sub2_2.method2497(Static168.anInt3353 + local15);
			Static337.aClass10_Sub8_Sub2_2.method2518(Static197.aClass245_1.method5907(82) ? 1 : 0);
			Static25.method332(local28, local15, local18);
		}
		if (local21 == 48) {
			if (Static200.anInt3974 > 0 && Static197.aClass245_1.method5907(82) && Static197.aClass245_1.method5907(81)) {
				Static297.method4135(local18 + Static72.anInt1488, local15 + Static168.anInt3353, Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98);
			} else {
				Static167.anInt3308 = 0;
				Static177.anInt3658 = 1;
				Static156.anInt3162 = arg1;
				Static152.anInt3123 = arg2;
				Static310.method4308(Static85.aClass27_114);
				Static337.aClass10_Sub8_Sub2_2.method2519(local18 + Static72.anInt1488);
				Static337.aClass10_Sub8_Sub2_2.method2519(Static168.anInt3353 + local15);
			}
		}
		if (local21 == 50) {
			local241 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local25];
			if (local241 != null) {
				Static152.anInt3123 = arg2;
				Static177.anInt3658 = 2;
				Static156.anInt3162 = arg1;
				Static167.anInt3308 = 0;
				Static310.method4308(Static61.aClass27_27);
				Static337.aClass10_Sub8_Sub2_2.method2519(local25);
				Static337.aClass10_Sub8_Sub2_2.method2518(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static28.method370(0, local241.anIntArray611[0], true, local241.method4919(), local241.anIntArray610[0], -2, local241.method4919(), 0);
			}
		}
		if (local21 == 58) {
			Static167.anInt3308 = 0;
			Static152.anInt3123 = arg2;
			Static156.anInt3162 = arg1;
			Static177.anInt3658 = 2;
			Static310.method4308(Static431.aClass27_104);
			Static337.aClass10_Sub8_Sub2_2.method2497(Static228.anInt4243);
			Static337.aClass10_Sub8_Sub2_2.method2473(Static273.anInt4773);
			Static337.aClass10_Sub8_Sub2_2.method2464(Static197.aClass245_1.method5907(82) ? 1 : 0);
			Static337.aClass10_Sub8_Sub2_2.method2505(Static219.anInt4156);
			Static337.aClass10_Sub8_Sub2_2.method2497(local15 + Static168.anInt3353);
			Static337.aClass10_Sub8_Sub2_2.method2505((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static337.aClass10_Sub8_Sub2_2.method2497(Static72.anInt1488 + local18);
			Static25.method332(local28, local15, local18);
		}
		if (local21 == 2) {
			local241 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local25];
			if (local241 != null) {
				Static156.anInt3162 = arg1;
				Static177.anInt3658 = 2;
				Static167.anInt3308 = 0;
				Static152.anInt3123 = arg2;
				Static310.method4308(Static445.aClass27_109);
				Static337.aClass10_Sub8_Sub2_2.method2497(local25);
				Static337.aClass10_Sub8_Sub2_2.method2458(Static197.aClass245_1.method5907(82) ? 1 : 0);
				Static28.method370(0, local241.anIntArray611[0], true, local241.method4919(), local241.anIntArray610[0], -2, local241.method4919(), 0);
			}
		}
		if (local21 == 1002 || local21 == 1011 || local21 == 1010 || local21 == 1006 || local21 == 1009) {
			Static340.method4572(local21, local15, local25);
		}
		if (Static401.aBoolean489) {
			Static456.method6051();
		}
		if (Static343.aClass89_9 != null && Static24.anInt392 == 0) {
			Static135.method5400(Static343.aClass89_9);
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZILclient!ha;)V")
	public static void method5693(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub8_Sub2 arg1) {
		Static106.anInt2139 = 0;
		Static48.aBoolean52 = false;
		Static309.method4273(arg1);
		Static293.method4113(arg1);
		if (Static48.aBoolean52) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt2989) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt2989 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "(I)V")
	public static void method5694() {
		for (@Pc(11) int local11 = 0; local11 < Static219.anInt4155; local11++) {
			@Pc(17) int local17 = Static57.anIntArray91[local11];
			@Pc(24) Class10_Sub26 local24 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local17);
			if (local24 != null) {
				@Pc(29) Class24_Sub3_Sub2_Sub1 local29 = local24.aClass24_Sub3_Sub2_Sub1_2;
				Static100.method1784(local29, local29.aClass222_1.anInt6351);
			}
		}
	}
}

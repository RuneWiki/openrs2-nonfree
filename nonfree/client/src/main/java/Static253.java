import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
	public static int anInt1024;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "[I")
	public static final int[] anIntArray50 = new int[5];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!qa;Lclient!ha;III)V")
	public static void method847(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class137 local12;
		if (arg3 < Static251.anInt4344) {
			local12 = Static131.aClass137ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass47_Sub5_1 != null && local12.aClass47_Sub5_1.method5725()) {
				arg1.method5733(0, Static297.anInt4985, arg0, true, local12.aClass47_Sub5_1, 0);
			}
		}
		if (arg4 < Static251.anInt4344) {
			local12 = Static131.aClass137ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass47_Sub5_1 != null && local12.aClass47_Sub5_1.method5725()) {
				arg1.method5733(0, 0, arg0, true, local12.aClass47_Sub5_1, Static297.anInt4985);
			}
		}
		if (arg3 < Static251.anInt4344 && arg4 < Static219.anInt3872) {
			local12 = Static131.aClass137ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass47_Sub5_1 != null && local12.aClass47_Sub5_1.method5725()) {
				arg1.method5733(0, Static297.anInt4985, arg0, true, local12.aClass47_Sub5_1, Static297.anInt4985);
			}
		}
		if (arg3 < Static251.anInt4344 && arg4 > 0) {
			local12 = Static131.aClass137ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass47_Sub5_1 != null && local12.aClass47_Sub5_1.method5725()) {
				arg1.method5733(0, Static297.anInt4985, arg0, true, local12.aClass47_Sub5_1, -Static297.anInt4985);
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!on;Lclient!qa;I)I")
	public static int method848(@OriginalArg(0) Class185 arg0, @OriginalArg(1) Class121 arg1) {
		if (arg0.anInt4868 != -1) {
			return arg0.anInt4868;
		}
		if (arg0.anInt4866 != -1) {
			@Pc(30) Class132 local30 = arg1.anInterface5_16.method3920(arg1.method4605() ? arg0.anInt4866 : arg0.anInt4873);
			if (!local30.aBoolean284) {
				return local30.aShort63;
			}
		}
		return arg0.anInt4860;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIILclient!ps;Lclient!qf;)V")
	public static void method849(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class47_Sub1_Sub5_Sub2 arg2, @OriginalArg(4) Class1_Sub14_Sub2 arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(15) int local15;
		if ((arg1 & 0x20) != 0) {
			local15 = arg3.method4524();
			@Pc(18) byte[] local18 = new byte[local15];
			@Pc(23) Class1_Sub14 local23 = new Class1_Sub14(local18);
			arg3.method4526(local15, local18);
			Static31.aClass1_Sub14Array1[arg0] = local23;
			arg2.method4342(local23);
		}
		@Pc(50) int local50;
		@Pc(54) int local54;
		if ((arg1 & 0x800) != 0) {
			local15 = Static123.anInt2333;
			local50 = arg3.method4521();
			local54 = arg3.method4548();
			arg2.method4314(local15, local50, local54);
		}
		if ((arg1 & 0x10) != 0) {
			local15 = arg3.method4498();
			if (local15 == 65535) {
				local15 = -1;
			}
			local50 = arg3.method4548();
			Static242.method3808(local15, arg2, local50);
		}
		if ((arg1 & 0x4000) != 0) {
			local7 = arg3.method4513();
		}
		if ((arg1 & 0x400) != 0) {
			arg2.anInt5394 = arg3.method4529();
			arg2.anInt5342 = arg3.method4529();
			arg2.anInt5405 = arg3.method4514();
			arg2.anInt5413 = arg3.method4514();
			arg2.anInt5344 = arg3.method4498() + Static123.anInt2333;
			arg2.anInt5380 = arg3.method4518() + Static123.anInt2333;
			arg2.anInt5355 = arg3.method4494();
			arg2.anInt5420 = 0;
			if (arg2.aBoolean436) {
				arg2.anInt5394 += arg2.anInt5428;
				arg2.anInt5342 += arg2.anInt5436;
				arg2.anInt5405 += arg2.anInt5428;
				arg2.anInt5421 = 0;
				arg2.anInt5413 += arg2.anInt5436;
			} else {
				arg2.anInt5421 = 1;
				arg2.anInt5342 += arg2.anIntArray408[0];
				arg2.anInt5405 += arg2.anIntArray407[0];
				arg2.anInt5394 += arg2.anIntArray407[0];
				arg2.anInt5413 += arg2.anIntArray408[0];
			}
		}
		if ((arg1 & 0x8) != 0) {
			local15 = arg3.method4498();
			if (local15 == 65535) {
				local15 = -1;
			}
			arg2.anInt5378 = local15;
		}
		if ((arg1 & 0x8000) != 0) {
			local15 = arg3.method4533();
			arg2.anInt5417 = arg3.method4524();
			arg2.anInt5402 = arg3.method4548();
			arg2.anInt5367 = local15 & 0x7FFF;
			arg2.aBoolean431 = (local15 & 0x8000) != 0;
			arg2.anInt5352 = arg2.anInt5367 + Static123.anInt2333 + arg2.anInt5417;
		}
		if ((arg1 & 0x100) != 0) {
			arg2.aString64 = arg3.method4509();
			if (arg2.aString64.charAt(0) == '~') {
				arg2.aString64 = arg2.aString64.substring(1);
				Static179.method2890(2, arg2.aString64, 0, arg2.method4345(), arg2.method4339());
			} else if (arg2 == Static255.aClass47_Sub1_Sub5_Sub2_2) {
				Static179.method2890(2, arg2.aString64, 0, arg2.method4345(), arg2.method4339());
			}
			arg2.anInt5384 = 0;
			arg2.anInt5353 = 0;
			arg2.anInt5369 = 150;
		}
		if ((arg1 & 0x4) != 0) {
			Static282.aByteArray57[arg0] = arg3.method4529();
		}
		if ((arg1 & 0x40) != 0) {
			local15 = arg3.method4521();
			local50 = arg3.method4548();
			arg2.method4314(Static123.anInt2333, local15, local50);
			arg2.anInt5363 = Static123.anInt2333 + 300;
			arg2.anInt5377 = arg3.method4491();
		}
		if ((arg1 & 0x10000) != 0) {
			arg2.aByte75 = arg3.method4529();
			arg2.aByte74 = arg3.method4552();
			arg2.aByte76 = arg3.method4514();
			arg2.aByte77 = (byte) arg3.method4494();
			arg2.anInt5340 = Static123.anInt2333 + arg3.method4518();
			arg2.anInt5386 = Static123.anInt2333 + arg3.method4498();
		}
		if ((arg1 & 0x1) != 0) {
			local15 = arg3.method4533();
			local50 = arg3.method4524();
			local54 = arg3.method4491();
			@Pc(447) int local447 = arg3.anInt5695;
			@Pc(455) boolean local455 = (local15 & 0x8000) != 0;
			if (arg2.aString66 != null && arg2.aClass201_1 != null) {
				@Pc(463) boolean local463 = false;
				if (local50 <= 1) {
					if (!local455 && (Static406.aBoolean595 && !Static151.aBoolean219 || Static195.aBoolean276)) {
						local463 = true;
					} else if (Static206.method3152(arg2.aString66)) {
						local463 = true;
					}
				}
				if (!local463 && Static266.anInt7428 == 0) {
					Static379.aClass1_Sub14_6.anInt5695 = 0;
					arg3.method4501(local54, Static379.aClass1_Sub14_6.aByteArray65);
					Static379.aClass1_Sub14_6.anInt5695 = 0;
					@Pc(509) int local509 = -1;
					@Pc(517) String local517;
					if (local455) {
						local15 &= 0x7FFF;
						@Pc(527) Class55 local527 = Static65.method976(Static379.aClass1_Sub14_6);
						local509 = local527.anInt1238;
						local517 = local527.aClass1_Sub1_Sub5_1.method775(Static379.aClass1_Sub14_6);
					} else {
						local517 = Static418.method5658(Static161.method2527(Static379.aClass1_Sub14_6));
					}
					arg2.aString64 = local517.trim();
					arg2.anInt5353 = local15 & 0xFF;
					arg2.anInt5369 = 150;
					arg2.anInt5384 = local15 >> 8;
					@Pc(567) int local567;
					if (local50 == 1 || local50 == 2) {
						local567 = local455 ? 17 : 1;
					} else {
						local567 = local455 ? 17 : 2;
					}
					if (local50 == 2) {
						Static165.method3932("<img=1>" + arg2.method4345(), local509, "<img=1>" + arg2.method4339(), 0, null, local517, local567);
					} else if (local50 == 1) {
						Static165.method3932("<img=0>" + arg2.method4345(), local509, "<img=0>" + arg2.method4339(), 0, null, local517, local567);
					} else {
						Static165.method3932(arg2.method4345(), local509, arg2.method4339(), 0, null, local517, local567);
					}
				}
			}
			arg3.anInt5695 = local54 + local447;
		}
		if ((arg1 & 0x40000) != 0) {
			local15 = arg3.method4494();
			@Pc(675) int[] local675 = new int[local15];
			@Pc(678) int[] local678 = new int[local15];
			@Pc(681) int[] local681 = new int[local15];
			for (@Pc(683) int local683 = 0; local683 < local15; local683++) {
				@Pc(689) int local689 = arg3.method4498();
				if (local689 == 65535) {
					local689 = -1;
				}
				local675[local683] = local689;
				local678[local683] = arg3.method4494();
				local681[local683] = arg3.method4499();
			}
			Static113.method1792(local678, local675, local681, arg2);
		}
		if ((arg1 & 0x1000) != 0) {
			arg2.aBoolean438 = arg3.method4494() == 1;
		}
		if ((arg1 & 0x200) != 0) {
			local15 = arg3.method4533();
			local50 = arg3.method4500();
			if (local15 == 65535) {
				local15 = -1;
			}
			local54 = arg3.method4494();
			arg2.method4318(local15, local50, local54, false);
		}
		if ((arg1 & 0x80) != 0) {
			arg2.anInt5440 = arg3.method4499();
			if (arg2.anInt5421 == 0) {
				arg2.method4321(arg2.anInt5440);
				arg2.anInt5440 = -1;
			}
		}
		if ((arg1 & 0x20000) != 0) {
			local15 = arg3.method4533();
			local50 = arg3.method4528();
			if (local15 == 65535) {
				local15 = -1;
			}
			local54 = arg3.method4494();
			arg2.method4318(local15, local50, local54, true);
		}
		if (!arg2.aBoolean436) {
			return;
		}
		if (local7 == 127) {
			arg2.method4336(arg2.anInt5428, arg2.anInt5436);
			return;
		}
		@Pc(841) byte local841;
		if (local7 == -1) {
			local841 = Static282.aByteArray57[arg0];
		} else {
			local841 = local7;
		}
		arg2.method4334(arg2.anInt5436, arg2.anInt5428, local841);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILclient!bo;III)V")
	public static void method851(@OriginalArg(0) int arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class1_Sub25 local15 = (Class1_Sub25) Static285.aClass142_2.method3199(); local15 != null; local15 = (Class1_Sub25) Static285.aClass142_2.method3198()) {
			if (local15.anInt3566 == arg0 && local15.anInt3562 == arg2 << 7 && arg3 << 7 == local15.anInt3568 && local15.aClass29_1.anInt545 == arg1.anInt545) {
				if (local15.aClass1_Sub5_Sub2_3 != null) {
					Static292.aClass1_Sub5_Sub1_2.method423(local15.aClass1_Sub5_Sub2_3);
					local15.aClass1_Sub5_Sub2_3 = null;
				}
				if (local15.aClass1_Sub5_Sub2_2 != null) {
					Static292.aClass1_Sub5_Sub1_2.method423(local15.aClass1_Sub5_Sub2_2);
					local15.aClass1_Sub5_Sub2_2 = null;
				}
				local15.method5965();
				return;
			}
		}
	}
}

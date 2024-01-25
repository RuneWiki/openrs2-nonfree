import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static720 {

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "([JII[II)V")
	public static void method9580(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if (arg4 < arg1) {
			@Pc(10) int local10 = (arg4 + arg1) / 2;
			@Pc(12) int local12 = arg4;
			@Pc(16) long local16 = arg0[local10];
			arg0[local10] = arg0[arg1];
			arg0[arg1] = local16;
			@Pc(30) int local30 = arg3[local10];
			arg3[local10] = arg3[arg1];
			arg3[arg1] = local30;
			@Pc(49) int local49 = local16 == Long.MAX_VALUE ? 0 : 1;
			for (@Pc(51) int local51 = arg4; local51 < arg1; local51++) {
				if (arg0[local51] < (long) (local49 & local51) + local16) {
					@Pc(70) long local70 = arg0[local51];
					arg0[local51] = arg0[local12];
					arg0[local12] = local70;
					@Pc(84) int local84 = arg3[local51];
					arg3[local51] = arg3[local12];
					arg3[local12++] = local84;
				}
			}
			arg0[arg1] = arg0[local12];
			arg0[local12] = local16;
			arg3[arg1] = arg3[local12];
			arg3[local12] = local30;
			method9580(arg0, local12 - 1, 122, arg3, arg4);
			method9580(arg0, arg1, 109, arg3, local12 + 1);
		}
		if (arg2 > 76) {
			;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!tw;II)V")
	public static void method9581(@OriginalArg(0) Class2_Sub20_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) boolean local16 = arg0.method8608(1) == 1;
		if (local16) {
			Static668.anIntArray730[Static559.anInt8813++] = arg1;
		}
		@Pc(33) int local33 = arg0.method8608(2);
		@Pc(37) Class4_Sub2_Sub1_Sub2_Sub1 local37 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[arg1];
		if (local33 != 0) {
			@Pc(166) int local166;
			@Pc(171) int local171;
			@Pc(176) int local176;
			if (local33 == 1) {
				local166 = arg0.method8608(3);
				local171 = local37.anIntArray183[0];
				local176 = local37.anIntArray182[0];
				if (local166 == 0) {
					local171--;
					local176--;
				} else if (local166 == 1) {
					local176--;
				} else if (local166 == 2) {
					local171++;
					local176--;
				} else if (local166 == 3) {
					local171--;
				} else if (local166 == 4) {
					local171++;
				} else if (local166 == 5) {
					local176++;
					local171--;
				} else if (local166 == 6) {
					local176++;
				} else if (local166 == 7) {
					local171++;
					local176++;
				}
				if (local16) {
					local37.anInt843 = local171;
					local37.aBoolean101 = true;
					local37.anInt847 = local176;
				} else {
					local37.method734(local171, Static192.aByteArray37[arg1], local176, (byte) 97);
				}
			} else if (local33 == 2) {
				local166 = arg0.method8608(4);
				local171 = local37.anIntArray183[0];
				local176 = local37.anIntArray182[0];
				if (local166 == 0) {
					local176 -= 2;
					local171 -= 2;
				} else if (local166 == 1) {
					local176 -= 2;
					local171--;
				} else if (local166 == 2) {
					local176 -= 2;
				} else if (local166 == 3) {
					local171++;
					local176 -= 2;
				} else if (local166 == 4) {
					local171 += 2;
					local176 -= 2;
				} else if (local166 == 5) {
					local176--;
					local171 -= 2;
				} else if (local166 == 6) {
					local171 += 2;
					local176--;
				} else if (local166 == 7) {
					local171 -= 2;
				} else if (local166 == 8) {
					local171 += 2;
				} else if (local166 == 9) {
					local176++;
					local171 -= 2;
				} else if (local166 == 10) {
					local176++;
					local171 += 2;
				} else if (local166 == 11) {
					local176 += 2;
					local171 -= 2;
				} else if (local166 == 12) {
					local171--;
					local176 += 2;
				} else if (local166 == 13) {
					local176 += 2;
				} else if (local166 == 14) {
					local171++;
					local176 += 2;
				} else if (local166 == 15) {
					local171 += 2;
					local176 += 2;
				}
				if (local16) {
					local37.anInt843 = local171;
					local37.aBoolean101 = true;
					local37.anInt847 = local176;
				} else {
					local37.method734(local171, Static192.aByteArray37[arg1], local176, (byte) 68);
				}
			} else {
				local166 = arg0.method8608(1);
				@Pc(532) int local532;
				@Pc(542) int local542;
				@Pc(555) int local555;
				@Pc(562) int local562;
				if (local166 == 0) {
					local171 = arg0.method8608(12);
					local176 = local171 >> 10;
					local532 = local171 >> 5 & 0x1F;
					if (local532 > 15) {
						local532 -= 32;
					}
					local542 = local171 & 0x1F;
					if (local542 > 15) {
						local542 -= 32;
					}
					local555 = local37.anIntArray183[0] + local532;
					local562 = local37.anIntArray182[0] + local542;
					if (local16) {
						local37.aBoolean101 = true;
						local37.anInt847 = local562;
						local37.anInt843 = local555;
					} else {
						local37.method734(local555, Static192.aByteArray37[arg1], local562, (byte) 98);
					}
					local37.aByte133 = local37.aByte134 = (byte) (local37.aByte133 + local176 & 0x3);
					if (Static83.method1237(local555, local562)) {
						local37.aByte134++;
					}
					if (arg1 == Class4_Sub2_Sub1_Sub2.lb) {
						if (local37.aByte133 != Static684.anInt10516) {
							Static415.aBoolean615 = true;
						}
						Static684.anInt10516 = local37.aByte133;
					}
				} else {
					local171 = arg0.method8608(30);
					local176 = local171 >> 28;
					local532 = local171 >> 14 & 0x3FFF;
					local542 = local171 & 0x3FFF;
					local555 = (local37.anIntArray183[0] + Static243.anInt3820 + local532 & 0x3FFF) - Static243.anInt3820;
					local562 = (local37.anIntArray182[0] + Static224.anInt11062 + local542 & 0x3FFF) - Static224.anInt11062;
					if (local16) {
						local37.anInt843 = local555;
						local37.anInt847 = local562;
						local37.aBoolean101 = true;
					} else {
						local37.method734(local555, Static192.aByteArray37[arg1], local562, (byte) 70);
					}
					local37.aByte133 = local37.aByte134 = (byte) (local37.aByte133 + local176 & 0x3);
					if (Static83.method1237(local555, local562)) {
						local37.aByte134++;
					}
					if (Class4_Sub2_Sub1_Sub2.lb == arg1) {
						Static684.anInt10516 = local37.aByte133;
					}
				}
			}
		} else if (local16) {
			local37.aBoolean101 = false;
		} else if (Class4_Sub2_Sub1_Sub2.lb == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(68) Class361 local68 = Static701.aClass361Array2[arg1] = new Class361();
			local68.anInt9765 = (Static243.anInt3820 + local37.anIntArray183[0] >> 6 << 14) + ((local37.aByte133 << 28) + (Static224.anInt11062 + local37.anIntArray182[0] >> 6));
			if (local37.anInt848 == -1) {
				local68.anInt9762 = local37.aClass178_7.method3799();
			} else {
				local68.anInt9762 = local37.anInt848;
			}
			local68.aBoolean835 = local37.aBoolean102;
			local68.anInt9763 = local37.anInt2348;
			local68.aBoolean834 = local37.aBoolean99;
			if (local37.anInt842 > 0) {
				Static708.method9450(local37);
			}
			Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[arg1] = null;
			if (arg0.method8608(1) != 0) {
				Static599.method8211(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method9582(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) short[] local16 = new short[16];
		@Pc(18) int local18 = 0;
		@Pc(25) int local25 = arg0 ? 32768 : 0;
		@Pc(36) int local36 = (arg0 ? Static645.aClass180_2.anInt4240 : Static645.aClass180_2.anInt4239) + local25;
		for (@Pc(38) int local38 = local25; local38 < local36; local38++) {
			@Pc(45) Class2_Sub6_Sub8 local45 = Static645.aClass180_2.method3843(local38);
			if (local45.aBoolean409 && local45.method4313().toLowerCase().indexOf(local13) != -1) {
				if (local18 >= 50) {
					Static354.anInt5659 = -1;
					Static727.aShortArray149 = null;
					return;
				}
				if (local18 >= local16.length) {
					@Pc(84) short[] local84 = new short[local16.length * 2];
					for (@Pc(86) int local86 = 0; local86 < local18; local86++) {
						local84[local86] = local16[local86];
					}
					local16 = local84;
				}
				local16[local18++] = (short) local38;
			}
		}
		Static354.anInt5659 = local18;
		Static465.anInt7549 = 0;
		Static727.aShortArray149 = local16;
		@Pc(133) String[] local133 = new String[Static354.anInt5659];
		for (@Pc(135) int local135 = 0; local135 < Static354.anInt5659; local135++) {
			local133[local135] = Static645.aClass180_2.method3843(local16[local135]).method4313();
		}
		Static344.method4778(local133, Static727.aShortArray149);
	}
}

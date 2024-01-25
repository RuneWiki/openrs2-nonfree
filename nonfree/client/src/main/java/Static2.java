import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	public static int anInt29;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!db;")
	public static final Class64 aClass64_4 = new Class64(39, 8);

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Z")
	public static boolean aBoolean2 = false;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZ)I")
	public static int method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return local16 + ((arg0 >>> 31) + arg0) % arg1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBLclient!cea;)V")
	public static void method49(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9_Sub1 arg1) {
		@Pc(15) boolean local15 = arg1.method1046(1) == 1;
		if (local15) {
			Static136.anIntArray298[Static295.anInt5451++] = arg0;
		}
		@Pc(30) int local30 = arg1.method1046(2);
		@Pc(38) Class10_Sub1_Sub2_Sub2 local38 = Static246.aClass10_Sub1_Sub2_Sub2Array1[arg0];
		if (local30 != 0) {
			@Pc(154) int local154;
			@Pc(159) int local159;
			@Pc(164) int local164;
			if (local30 == 1) {
				local154 = arg1.method1046(3);
				local159 = local38.anIntArray653[0];
				local164 = local38.anIntArray654[0];
				if (local154 == 0) {
					local159--;
					local164--;
				} else if (local154 == 1) {
					local164--;
				} else if (local154 == 2) {
					local164--;
					local159++;
				} else if (local154 == 3) {
					local159--;
				} else if (local154 == 4) {
					local159++;
				} else if (local154 == 5) {
					local164++;
					local159--;
				} else if (local154 == 6) {
					local164++;
				} else if (local154 == 7) {
					local164++;
					local159++;
				}
				if (local15) {
					local38.aBoolean596 = true;
					local38.anInt8567 = local164;
					local38.anInt8555 = local159;
				} else {
					local38.method7046(local159, Static178.aByteArray43[arg0], local164);
				}
			} else if (local30 == 2) {
				local154 = arg1.method1046(4);
				local159 = local38.anIntArray653[0];
				local164 = local38.anIntArray654[0];
				if (local154 == 0) {
					local164 -= 2;
					local159 -= 2;
				} else if (local154 == 1) {
					local164 -= 2;
					local159--;
				} else if (local154 == 2) {
					local164 -= 2;
				} else if (local154 == 3) {
					local164 -= 2;
					local159++;
				} else if (local154 == 4) {
					local159 += 2;
					local164 -= 2;
				} else if (local154 == 5) {
					local164--;
					local159 -= 2;
				} else if (local154 == 6) {
					local159 += 2;
					local164--;
				} else if (local154 == 7) {
					local159 -= 2;
				} else if (local154 == 8) {
					local159 += 2;
				} else if (local154 == 9) {
					local159 -= 2;
					local164++;
				} else if (local154 == 10) {
					local159 += 2;
					local164++;
				} else if (local154 == 11) {
					local164 += 2;
					local159 -= 2;
				} else if (local154 == 12) {
					local164 += 2;
					local159--;
				} else if (local154 == 13) {
					local164 += 2;
				} else if (local154 == 14) {
					local164 += 2;
					local159++;
				} else if (local154 == 15) {
					local159 += 2;
					local164 += 2;
				}
				if (local15) {
					local38.anInt8555 = local159;
					local38.anInt8567 = local164;
					local38.aBoolean596 = true;
				} else {
					local38.method7046(local159, Static178.aByteArray43[arg0], local164);
				}
			} else {
				local154 = arg1.method1046(1);
				@Pc(425) int local425;
				@Pc(435) int local435;
				@Pc(446) int local446;
				@Pc(454) int local454;
				if (local154 == 0) {
					local159 = arg1.method1046(12);
					local164 = local159 >> 10;
					local425 = local159 >> 5 & 0x1F;
					if (local425 > 15) {
						local425 -= 32;
					}
					local435 = local159 & 0x1F;
					if (local435 > 15) {
						local435 -= 32;
					}
					local446 = local425 + local38.anIntArray653[0];
					local454 = local38.anIntArray654[0] + local435;
					if (local15) {
						local38.anInt8555 = local446;
						local38.anInt8567 = local454;
						local38.aBoolean596 = true;
					} else {
						local38.method7046(local446, Static178.aByteArray43[arg0], local454);
					}
					local38.aByte101 = (byte) (local38.aByte101 + local164 & 0x3);
					if (Static416.anInt7186 == arg0) {
						Static320.anInt5748 = local38.aByte101;
					}
				} else {
					local159 = arg1.method1046(30);
					local164 = local159 >> 28;
					local425 = local159 >> 14 & 0x3FFF;
					local435 = local159 & 0x3FFF;
					local446 = (Static373.anInt6695 + local38.anIntArray653[0] + local425 & 0x3FFF) - Static373.anInt6695;
					local454 = (local435 + local38.anIntArray654[0] + Static6.anInt97 & 0x3FFF) - Static6.anInt97;
					if (local15) {
						local38.anInt8555 = local446;
						local38.anInt8567 = local454;
						local38.aBoolean596 = true;
					} else {
						local38.method7046(local446, Static178.aByteArray43[arg0], local454);
					}
					local38.aByte101 = (byte) (local164 + local38.aByte101 & 0x3);
					if (arg0 == Static416.anInt7186) {
						Static320.anInt5748 = local38.aByte101;
					}
				}
			}
		} else if (local15) {
			local38.aBoolean596 = false;
		} else if (arg0 == Static416.anInt7186) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(69) Class319 local69 = Static230.aClass319Array1[arg0] = new Class319();
			local69.anInt8807 = (local38.anIntArray654[0] + Static6.anInt97 >> 6) + (local38.aByte101 << 28) + (local38.anIntArray653[0] + Static373.anInt6695 >> 6 << 14);
			if (local38.anInt8547 == -1) {
				local69.anInt8809 = local38.aClass155_7.method3695();
			} else {
				local69.anInt8809 = local38.anInt8547;
			}
			local69.aBoolean611 = local38.aBoolean598;
			local69.anInt8810 = local38.anInt8465;
			if (local38.anInt8562 > 0) {
				Static326.method4924(local38);
			}
			Static246.aClass10_Sub1_Sub2_Sub2Array1[arg0] = null;
			if (arg1.method1046(1) != 0) {
				Static563.method7750(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method50() {
		if (Static440.method6236(Static598.anInt9831) || Static69.method1224(Static598.anInt9831)) {
			Static574.method5778(5000, Static563.anInt9436 >> 12, Static473.anInt7978 >> 12);
		} else {
			@Pc(16) int local16 = Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray653[0] >> 3;
			@Pc(23) int local23 = Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray654[0] >> 3;
			if (local16 >= 0 && Static38.anInt740 >> 3 > local16 && local23 >= 0 && Static38.anInt741 >> 3 > local23) {
				Static574.method5778(5000, local23, local16);
			} else {
				Static574.method5778(0, Static38.anInt741 >> 4, Static38.anInt740 >> 4);
			}
		}
		Static552.method7617();
		Static501.method7140();
		Static570.method7800();
		Static448.method6329();
	}
}

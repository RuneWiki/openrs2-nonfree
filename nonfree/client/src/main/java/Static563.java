import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!ss", name = "q", descriptor = "F")
	public static float aFloat178;

	@OriginalMember(owner = "client!ss", name = "r", descriptor = "Lclient!ns;")
	public static Class257 aClass257_1;

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
	public static void method7420() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static375.aBoolean532) {
			local9 = 4096;
			if (Static295.aBoolean333) {
				local7 = 2048;
			}
		}
		if (Static376.aFloat104 < (float) local7) {
			Static376.aFloat104 = (float) local7;
		}
		while (Static318.aFloat81 >= 16384.0F) {
			Static318.aFloat81 -= 16384.0F;
		}
		if (Static376.aFloat104 > (float) local9) {
			Static376.aFloat104 = (float) local9;
		}
		while (Static318.aFloat81 < 0.0F) {
			Static318.aFloat81 += 16384.0F;
		}
		@Pc(57) int local57 = Static365.anInt6231 >> 9;
		@Pc(61) int local61 = Static434.anInt7081 >> 9;
		@Pc(72) int local72 = Static662.method8831(Static434.anInt7081, Static365.anInt6231, Static570.anInt9192);
		@Pc(74) int local74 = 0;
		@Pc(94) int local94;
		if (local57 > 3 && local61 > 3 && Static98.anInt361 - 4 > local57 && Static438.anInt7120 - 4 > local61) {
			for (local94 = local57 - 4; local94 <= local57 + 4; local94++) {
				for (@Pc(100) int local100 = local61 - 4; local100 <= local61 + 4; local100++) {
					@Pc(104) int local104 = Static570.anInt9192;
					if (local104 < 3 && Static209.method3118(local94, local100)) {
						local104++;
					}
					@Pc(115) int local115 = 0;
					if (Static326.aClass49_Sub1_1.aByteArrayArrayArray7 != null && Static326.aClass49_Sub1_1.aByteArrayArrayArray7[local104] != null) {
						local115 = (Static326.aClass49_Sub1_1.aByteArrayArrayArray7[local104][local94][local100] & 0xFF) * 8 << 2;
					}
					if (Static582.aClass35Array3 != null && Static582.aClass35Array3[local104] != null) {
						@Pc(157) int local157 = local115 + local72 - Static582.aClass35Array3[local104].method7461(local100, local94);
						if (local157 > local74) {
							local74 = local157;
						}
					}
				}
			}
		}
		local94 = (local74 >> 2) * 1536;
		if (local94 > 786432) {
			local94 = 786432;
		}
		if (local94 < 262144) {
			local94 = 262144;
		}
		if (local94 > Static604.anInt10087) {
			Static604.anInt10087 += (local94 - Static604.anInt10087) / 24;
		} else if (local94 < Static604.anInt10087) {
			Static604.anInt10087 += (local94 - Static604.anInt10087) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLclient!dt;)Lclient!bu;")
	public static Class33_Sub2 method7421(@OriginalArg(1) Class3_Sub4 arg0) {
		return new Class33_Sub2(arg0.method7918(), arg0.method7918(), arg0.method7918(), arg0.method7918(), arg0.method7918(), arg0.method7918(), arg0.method7918(), arg0.method7918(), arg0.method7945(), arg0.method7954());
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZIILclient!ofa;I)V")
	public static void method7423(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class265 arg3) {
		@Pc(8) int local8 = arg3.anInt7024;
		if (arg3.aByte110 == 0) {
			arg3.anInt7024 = arg3.anInt7011;
		} else if (arg3.aByte110 == 1) {
			arg3.anInt7024 = arg2 - arg3.anInt7011;
		} else if (arg3.aByte110 == 2) {
			arg3.anInt7024 = arg2 * arg3.anInt7011 >> 14;
		}
		@Pc(47) int local47 = arg3.anInt6997;
		if (arg3.aByte111 == 0) {
			arg3.anInt6997 = arg3.anInt6990;
		} else if (arg3.aByte111 == 1) {
			arg3.anInt6997 = arg1 - arg3.anInt6990;
		} else if (arg3.aByte111 == 2) {
			arg3.anInt6997 = arg3.anInt6990 * arg1 >> 14;
		}
		if (arg3.aByte110 == 4) {
			arg3.anInt7024 = arg3.anInt6976 * arg3.anInt6997 / arg3.anInt7003;
		}
		if (arg3.aByte111 == 4) {
			arg3.anInt6997 = arg3.anInt7024 * arg3.anInt7003 / arg3.anInt6976;
		}
		if (Static97.aBoolean153 && (Static86.method1383(arg3).anInt7824 != 0 || arg3.anInt6967 == 0)) {
			if (arg3.anInt6997 < 5 && arg3.anInt7024 < 5) {
				arg3.anInt6997 = 5;
				arg3.anInt7024 = 5;
			} else {
				if (arg3.anInt6997 <= 0) {
					arg3.anInt6997 = 5;
				}
				if (arg3.anInt7024 <= 0) {
					arg3.anInt7024 = 5;
				}
			}
		}
		if (arg3.anInt7015 == Static377.anInt7881) {
			Static434.aClass265_11 = arg3;
		}
		if (arg0 && arg3.anObjectArray2 != null && (arg3.anInt7024 != local8 || local47 != arg3.anInt6997)) {
			@Pc(207) Class3_Sub53 local207 = new Class3_Sub53();
			local207.aClass265_16 = arg3;
			local207.anObjectArray35 = arg3.anObjectArray2;
			Static221.aClass302_22.method6613(local207);
		}
	}
}

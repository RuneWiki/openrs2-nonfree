import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!ws", name = "B", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ws", name = "C", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_183 = new Class12(49, 12);

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!kh;II)V")
	public static void method5917(@OriginalArg(0) Class1_Sub28_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(24) boolean local24 = arg0.method3084(1) == 1;
		if (local24) {
			Static59.anIntArray54[Static409.anInt6725++] = arg1;
		}
		@Pc(39) int local39 = arg0.method3084(2);
		@Pc(43) Class25_Sub5_Sub1_Sub2 local43 = Static28.aClass25_Sub5_Sub1_Sub2Array1[arg1];
		if (local39 != 0) {
			@Pc(160) int local160;
			@Pc(165) int local165;
			@Pc(170) int local170;
			if (local39 == 1) {
				local160 = arg0.method3084(3);
				local165 = local43.anIntArray283[0];
				local170 = local43.anIntArray284[0];
				if (local160 == 0) {
					local170--;
					local165--;
				} else if (local160 == 1) {
					local170--;
				} else if (local160 == 2) {
					local170--;
					local165++;
				} else if (local160 == 3) {
					local165--;
				} else if (local160 == 4) {
					local165++;
				} else if (local160 == 5) {
					local165--;
					local170++;
				} else if (local160 == 6) {
					local170++;
				} else if (local160 == 7) {
					local165++;
					local170++;
				}
				if (local24) {
					local43.anInt4343 = local165;
					local43.anInt4325 = local170;
					local43.aBoolean486 = true;
				} else {
					local43.method3443(local165, local170, Static372.aByteArray84[arg1]);
				}
			} else if (local39 == 2) {
				local160 = arg0.method3084(4);
				local165 = local43.anIntArray283[0];
				local170 = local43.anIntArray284[0];
				if (local160 == 0) {
					local165 -= 2;
					local170 -= 2;
				} else if (local160 == 1) {
					local165--;
					local170 -= 2;
				} else if (local160 == 2) {
					local170 -= 2;
				} else if (local160 == 3) {
					local165++;
					local170 -= 2;
				} else if (local160 == 4) {
					local165 += 2;
					local170 -= 2;
				} else if (local160 == 5) {
					local170--;
					local165 -= 2;
				} else if (local160 == 6) {
					local170--;
					local165 += 2;
				} else if (local160 == 7) {
					local165 -= 2;
				} else if (local160 == 8) {
					local165 += 2;
				} else if (local160 == 9) {
					local165 -= 2;
					local170++;
				} else if (local160 == 10) {
					local170++;
					local165 += 2;
				} else if (local160 == 11) {
					local170 += 2;
					local165 -= 2;
				} else if (local160 == 12) {
					local170 += 2;
					local165--;
				} else if (local160 == 13) {
					local170 += 2;
				} else if (local160 == 14) {
					local170 += 2;
					local165++;
				} else if (local160 == 15) {
					local170 += 2;
					local165 += 2;
				}
				if (local24) {
					local43.anInt4343 = local165;
					local43.aBoolean486 = true;
					local43.anInt4325 = local170;
				} else {
					local43.method3443(local165, local170, Static372.aByteArray84[arg1]);
				}
			} else {
				local160 = arg0.method3084(1);
				@Pc(448) int local448;
				@Pc(456) int local456;
				@Pc(468) int local468;
				@Pc(475) int local475;
				if (local160 == 0) {
					local165 = arg0.method3084(12);
					local170 = local165 >> 10;
					local448 = local165 >> 5 & 0x1F;
					if (local448 > 15) {
						local448 -= 32;
					}
					local456 = local165 & 0x1F;
					if (local456 > 15) {
						local456 -= 32;
					}
					local468 = local43.anIntArray283[0] + local448;
					local475 = local43.anIntArray284[0] + local456;
					if (local24) {
						local43.anInt4325 = local475;
						local43.aBoolean486 = true;
						local43.anInt4343 = local468;
					} else {
						local43.method3443(local468, local475, Static372.aByteArray84[arg1]);
					}
					local43.aByte94 = (byte) (local170 + local43.aByte94 & 0x3);
					if (arg1 == Static296.anInt5181) {
						Static265.anInt4807 = local43.aByte94;
					}
				} else {
					local165 = arg0.method3084(30);
					local170 = local165 >> 28;
					local448 = local165 >> 14 & 0x3FFF;
					local456 = local165 & 0x3FFF;
					local468 = (local43.anIntArray283[0] + Static199.anInt3480 + local448 & 0x3FFF) - Static199.anInt3480;
					local475 = (Static164.anInt2731 + local43.anIntArray284[0] + local456 & 0x3FFF) - Static164.anInt2731;
					if (local24) {
						local43.anInt4343 = local468;
						local43.anInt4325 = local475;
						local43.aBoolean486 = true;
					} else {
						local43.method3443(local468, local475, Static372.aByteArray84[arg1]);
					}
					local43.aByte94 = (byte) (local170 + local43.aByte94 & 0x3);
					if (arg1 == Static296.anInt5181) {
						Static265.anInt4807 = local43.aByte94;
					}
				}
			}
		} else if (local24) {
			local43.aBoolean486 = false;
		} else if (arg1 == Static296.anInt5181) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(74) Class44 local74 = Static162.aClass44Array1[arg1] = new Class44();
			local74.anInt1171 = (local43.aByte94 << 28) - (-(Static199.anInt3480 + local43.anIntArray283[0] >> 6 << 14) - (local43.anIntArray284[0] + Static164.anInt2731 >> 6));
			if (local43.anInt4346 == -1) {
				local74.anInt1174 = local43.aClass265_7.method5841();
			} else {
				local74.anInt1174 = local43.anInt4346;
			}
			local74.anInt1172 = local43.anInt4238;
			local74.aBoolean122 = local43.aBoolean487;
			if (local43.anInt4331 > 0) {
				Static61.method1291(local43);
			}
			Static28.aClass25_Sub5_Sub1_Sub2Array1[arg1] = null;
			if (arg0.method3084(1) != 0) {
				Static147.method5938(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZII)I")
	public static int method5921(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return (arg0 & 0xFF80) + local22;
	}
}

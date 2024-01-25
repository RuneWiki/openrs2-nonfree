import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!v", name = "X", descriptor = "I")
	public static int anInt9671;

	@OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
	public static int anInt9672;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_66 = new Class136(4);

	@OriginalMember(owner = "client!v", name = "P", descriptor = "Lclient!maa;")
	public static final Class215 aClass215_14 = new Class215(7, 7);

	@OriginalMember(owner = "client!v", name = "R", descriptor = "J")
	public static long aLong260 = 0L;

	@OriginalMember(owner = "client!v", name = "T", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_289 = new Class194(67, 6);

	@OriginalMember(owner = "client!v", name = "V", descriptor = "Z")
	public static boolean aBoolean735 = true;

	@OriginalMember(owner = "client!v", name = "W", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_290 = new Class194(4, 3);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!mfa;I)V")
	public static void method8193(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub9_Sub2 arg1) {
		@Pc(15) boolean local15 = arg1.method5642(1) == 1;
		if (local15) {
			Static27.anIntArray33[Static458.anInt7786++] = arg0;
		}
		@Pc(32) int local32 = arg1.method5642(2);
		@Pc(36) Class9_Sub2_Sub1_Sub2_Sub1 local36 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[arg0];
		if (local32 != 0) {
			@Pc(158) int local158;
			@Pc(163) int local163;
			@Pc(168) int local168;
			if (local32 == 1) {
				local158 = arg1.method5642(3);
				local163 = local36.anIntArray675[0];
				local168 = local36.anIntArray676[0];
				if (local158 == 0) {
					local163--;
					local168--;
				} else if (local158 == 1) {
					local168--;
				} else if (local158 == 2) {
					local163++;
					local168--;
				} else if (local158 == 3) {
					local163--;
				} else if (local158 == 4) {
					local163++;
				} else if (local158 == 5) {
					local168++;
					local163--;
				} else if (local158 == 6) {
					local168++;
				} else if (local158 == 7) {
					local168++;
					local163++;
				}
				if (local15) {
					local36.anInt1321 = local163;
					local36.anInt1290 = local168;
					local36.aBoolean81 = true;
				} else {
					local36.method1155(local163, Static87.aByteArray15[arg0], local168);
				}
			} else if (local32 == 2) {
				local158 = arg1.method5642(4);
				local163 = local36.anIntArray675[0];
				local168 = local36.anIntArray676[0];
				if (local158 == 0) {
					local163 -= 2;
					local168 -= 2;
				} else if (local158 == 1) {
					local163--;
					local168 -= 2;
				} else if (local158 == 2) {
					local168 -= 2;
				} else if (local158 == 3) {
					local163++;
					local168 -= 2;
				} else if (local158 == 4) {
					local163 += 2;
					local168 -= 2;
				} else if (local158 == 5) {
					local168--;
					local163 -= 2;
				} else if (local158 == 6) {
					local168--;
					local163 += 2;
				} else if (local158 == 7) {
					local163 -= 2;
				} else if (local158 == 8) {
					local163 += 2;
				} else if (local158 == 9) {
					local168++;
					local163 -= 2;
				} else if (local158 == 10) {
					local168++;
					local163 += 2;
				} else if (local158 == 11) {
					local163 -= 2;
					local168 += 2;
				} else if (local158 == 12) {
					local163--;
					local168 += 2;
				} else if (local158 == 13) {
					local168 += 2;
				} else if (local158 == 14) {
					local168 += 2;
					local163++;
				} else if (local158 == 15) {
					local168 += 2;
					local163 += 2;
				}
				if (local15) {
					local36.anInt1290 = local168;
					local36.anInt1321 = local163;
					local36.aBoolean81 = true;
				} else {
					local36.method1155(local163, Static87.aByteArray15[arg0], local168);
				}
			} else {
				local158 = arg1.method5642(1);
				@Pc(429) int local429;
				@Pc(439) int local439;
				@Pc(451) int local451;
				@Pc(459) int local459;
				if (local158 == 0) {
					local163 = arg1.method5642(12);
					local168 = local163 >> 10;
					local429 = local163 >> 5 & 0x1F;
					if (local429 > 15) {
						local429 -= 32;
					}
					local439 = local163 & 0x1F;
					if (local439 > 15) {
						local439 -= 32;
					}
					local451 = local36.anIntArray675[0] + local429;
					local459 = local36.anIntArray676[0] + local439;
					if (local15) {
						local36.anInt1290 = local459;
						local36.anInt1321 = local451;
						local36.aBoolean81 = true;
					} else {
						local36.method1155(local451, Static87.aByteArray15[arg0], local459);
					}
					local36.aByte127 = local36.aByte128 = (byte) (local36.aByte127 + local168 & 0x3);
					if (Static97.method1657(local459, local451)) {
						local36.aByte128++;
					}
					if (Static54.anInt1032 == arg0) {
						if (Static65.anInt1298 != local36.aByte127) {
							Static334.aBoolean462 = true;
						}
						Static65.anInt1298 = local36.aByte127;
					}
				} else {
					local163 = arg1.method5642(30);
					local168 = local163 >> 28;
					local429 = local163 >> 14 & 0x3FFF;
					local439 = local163 & 0x3FFF;
					local451 = (Static427.anInt7462 + local36.anIntArray675[0] + local429 & 0x3FFF) - Static427.anInt7462;
					local459 = (local439 + Static22.anInt329 + local36.anIntArray676[0] & 0x3FFF) - Static22.anInt329;
					if (local15) {
						local36.anInt1321 = local451;
						local36.aBoolean81 = true;
						local36.anInt1290 = local459;
					} else {
						local36.method1155(local451, Static87.aByteArray15[arg0], local459);
					}
					local36.aByte127 = local36.aByte128 = (byte) (local36.aByte127 + local168 & 0x3);
					if (Static97.method1657(local459, local451)) {
						local36.aByte128++;
					}
					if (arg0 == Static54.anInt1032) {
						Static65.anInt1298 = local36.aByte127;
					}
				}
			}
		} else if (local15) {
			local36.aBoolean81 = false;
		} else if (arg0 == Static54.anInt1032) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(67) Class328 local67 = Static370.aClass328Array1[arg0] = new Class328();
			local67.anInt9150 = (local36.aByte127 << 28) + (local36.anIntArray675[0] + Static427.anInt7462 >> 6 << 14) + (local36.anIntArray676[0] + Static22.anInt329 >> 6);
			if (local36.anInt1295 == -1) {
				local67.anInt9156 = local36.aClass191_7.method5071();
			} else {
				local67.anInt9156 = local36.anInt1295;
			}
			local67.anInt9155 = local36.anInt10185;
			local67.aBoolean677 = local36.aBoolean80;
			if (local36.anInt1324 > 0) {
				Static422.method6652(local36);
			}
			Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[arg0] = null;
			if (arg1.method5642(1) != 0) {
				Static153.method2722(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!dc;I)Ljava/lang/String;")
	public static String method8196(@OriginalArg(0) Class3_Sub9 arg0) {
		return Static114.method2108(arg0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IC)Z")
	public static boolean method8200(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}

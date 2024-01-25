import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!bj;")
	public static Class25 aClass25_5;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_71 = new Class243(12, 0);

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_72 = new Class243(73, 3);

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_73 = new Class243(32, 7);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!no;B)V")
	public static void method6236(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub29_Sub2 arg1) {
		@Pc(15) boolean local15 = arg1.method5248(1) == 1;
		if (local15) {
			Static327.anIntArray495[Static394.anInt7461++] = arg0;
		}
		@Pc(30) int local30 = arg1.method5248(2);
		@Pc(34) Class1_Sub1_Sub2_Sub1 local34 = Static278.aClass1_Sub1_Sub2_Sub1Array1[arg0];
		if (local30 != 0) {
			@Pc(140) int local140;
			@Pc(145) int local145;
			@Pc(150) int local150;
			if (local30 == 1) {
				local140 = arg1.method5248(3);
				local145 = local34.anIntArray450[0];
				local150 = local34.anIntArray449[0];
				if (local140 == 0) {
					local145--;
					local150--;
				} else if (local140 == 1) {
					local150--;
				} else if (local140 == 2) {
					local145++;
					local150--;
				} else if (local140 == 3) {
					local145--;
				} else if (local140 == 4) {
					local145++;
				} else if (local140 == 5) {
					local145--;
					local150++;
				} else if (local140 == 6) {
					local150++;
				} else if (local140 == 7) {
					local150++;
					local145++;
				}
				if (local15) {
					local34.aBoolean260 = true;
					local34.anInt3247 = local145;
					local34.anInt3273 = local150;
				} else {
					local34.method2953(local145, local150, Static452.aByteArray107[arg0]);
				}
			} else if (local30 == 2) {
				local140 = arg1.method5248(4);
				local145 = local34.anIntArray450[0];
				local150 = local34.anIntArray449[0];
				if (local140 == 0) {
					local145 -= 2;
					local150 -= 2;
				} else if (local140 == 1) {
					local150 -= 2;
					local145--;
				} else if (local140 == 2) {
					local150 -= 2;
				} else if (local140 == 3) {
					local145++;
					local150 -= 2;
				} else if (local140 == 4) {
					local145 += 2;
					local150 -= 2;
				} else if (local140 == 5) {
					local150--;
					local145 -= 2;
				} else if (local140 == 6) {
					local150--;
					local145 += 2;
				} else if (local140 == 7) {
					local145 -= 2;
				} else if (local140 == 8) {
					local145 += 2;
				} else if (local140 == 9) {
					local145 -= 2;
					local150++;
				} else if (local140 == 10) {
					local145 += 2;
					local150++;
				} else if (local140 == 11) {
					local150 += 2;
					local145 -= 2;
				} else if (local140 == 12) {
					local145--;
					local150 += 2;
				} else if (local140 == 13) {
					local150 += 2;
				} else if (local140 == 14) {
					local145++;
					local150 += 2;
				} else if (local140 == 15) {
					local145 += 2;
					local150 += 2;
				}
				if (local15) {
					local34.anInt3247 = local145;
					local34.anInt3273 = local150;
					local34.aBoolean260 = true;
				} else {
					local34.method2953(local145, local150, Static452.aByteArray107[arg0]);
				}
			} else {
				local140 = arg1.method5248(1);
				@Pc(413) int local413;
				@Pc(423) int local423;
				@Pc(434) int local434;
				@Pc(441) int local441;
				if (local140 == 0) {
					local145 = arg1.method5248(12);
					local150 = local145 >> 10;
					local413 = local145 >> 5 & 0x1F;
					if (local413 > 15) {
						local413 -= 32;
					}
					local423 = local145 & 0x1F;
					if (local423 > 15) {
						local423 -= 32;
					}
					local434 = local413 + local34.anIntArray450[0];
					local441 = local34.anIntArray449[0] + local423;
					if (local15) {
						local34.anInt3247 = local434;
						local34.aBoolean260 = true;
						local34.anInt3273 = local441;
					} else {
						local34.method2953(local434, local441, Static452.aByteArray107[arg0]);
					}
					local34.aByte90 = (byte) (local34.aByte90 + local150 & 0x3);
					if (Static174.anInt3154 == arg0) {
						Static208.anInt3742 = local34.aByte90;
					}
				} else {
					local145 = arg1.method5248(30);
					local150 = local145 >> 28;
					local413 = local145 >> 14 & 0x3FFF;
					local423 = local145 & 0x3FFF;
					local434 = (local413 + Static238.anInt4280 + local34.anIntArray450[0] & 0x3FFF) - Static238.anInt4280;
					local441 = (local423 + Static371.anInt6936 + local34.anIntArray449[0] & 0x3FFF) - Static371.anInt6936;
					if (local15) {
						local34.anInt3273 = local441;
						local34.aBoolean260 = true;
						local34.anInt3247 = local434;
					} else {
						local34.method2953(local434, local441, Static452.aByteArray107[arg0]);
					}
					local34.aByte90 = (byte) (local150 + local34.aByte90 & 0x3);
					if (Static174.anInt3154 == arg0) {
						Static208.anInt3742 = local34.aByte90;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean260 = false;
		} else if (Static174.anInt3154 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(58) Class317 local58 = Static370.aClass317Array1[arg0] = new Class317();
			local58.anInt9356 = (local34.aByte90 << 28) + (local34.anIntArray450[0] + Static238.anInt4280 >> 6 << 14) + (Static371.anInt6936 - -local34.anIntArray449[0] >> 6);
			if (local34.anInt3271 == -1) {
				local58.anInt9354 = local34.aClass151_7.method3664();
			} else {
				local58.anInt9354 = local34.anInt3271;
			}
			local58.anInt9352 = local34.anInt5062;
			local58.aBoolean676 = local34.aBoolean259;
			if (local34.anInt3255 > 0) {
				Static532.method7663(local34);
			}
			Static278.aClass1_Sub1_Sub2_Sub1Array1[arg0] = null;
			if (arg1.method5248(1) != 0) {
				Static45.method835(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)Z")
	public static boolean method6241() {
		@Pc(7) Class2 local7 = Static448.aClass249_63.aClass2_224.aClass2_283;
		if (local7 == null || local7 == Static448.aClass249_63.aClass2_224) {
			return false;
		}
		@Pc(23) Class2_Sub44 local23 = (Class2_Sub44) local7;
		if (local23.anInt8460 >= 2000) {
			local23.anInt8460 -= 2000;
		}
		return local23.anInt8460 == 1001;
	}
}

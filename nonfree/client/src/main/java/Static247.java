import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "Lclient!ba;")
	public static Class18 aClass18_2;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_152 = new Class214(98, 12);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!no;")
	public static Class173 method4074(@OriginalArg(1) Component arg0) {
		return new Class173_Sub1(arg0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)Z")
	public static boolean method4075(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static97.anInt2097; local1 < Static227.anInt4511; local1++) {
			@Pc(6) Class162[][] local6 = Static294.aClass162ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static120.anInt2511; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static243.anInt4735 + local9;
				@Pc(18) int local18 = Static243.anInt4735 - local9;
				if (local14 >= Static440.anInt7506 || local18 < Static54.anInt1311) {
					for (@Pc(27) int local27 = -Static120.anInt2511; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static140.anInt2891 + local27;
						@Pc(36) int local36 = Static140.anInt2891 - local27;
						@Pc(48) Class162 local48;
						if (local14 >= Static440.anInt7506) {
							if (local32 >= Static412.anInt7172) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean331) {
									Static343.aBoolean434 = arg0;
									Static180.aClass32_1.method5958(local48);
									Static180.aClass32_1.method5962();
								}
							}
							if (local36 < Static206.anInt4217) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean331) {
									Static343.aBoolean434 = arg0;
									Static180.aClass32_1.method5958(local48);
									Static180.aClass32_1.method5962();
								}
							}
						}
						if (local18 < Static54.anInt1311) {
							if (local32 >= Static412.anInt7172) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean331) {
									Static343.aBoolean434 = arg0;
									Static180.aClass32_1.method5958(local48);
									Static180.aClass32_1.method5962();
								}
							}
							if (local36 < Static206.anInt4217) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean331) {
									Static343.aBoolean434 = arg0;
									Static180.aClass32_1.method5958(local48);
									Static180.aClass32_1.method5962();
								}
							}
						}
						if (Static183.anInt3715 == 0) {
							if (Static111.aBoolean166) {
								Static180.aClass32_1.method5963(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)V")
	public static void method4077(@OriginalArg(1) boolean arg0) {
		Static256.method4185();
		if (!Static200.method3531(Static70.anInt1726)) {
			return;
		}
		Static458.anInt7819++;
		if (Static458.anInt7819 < 50 && !arg0) {
			return;
		}
		Static458.anInt7819 = 0;
		if (!Static82.aBoolean140 && Static172.aClass13_1 != null) {
			Static448.method6134(Static127.aClass212_34);
			try {
				Static172.aClass13_1.method177(Static457.aClass4_Sub20_Sub1_5.anInt5526, Static457.aClass4_Sub20_Sub1_5.aByteArray77);
				Static457.aClass4_Sub20_Sub1_5.anInt5526 = 0;
			} catch (@Pc(53) IOException local53) {
				Static82.aBoolean140 = true;
			}
		}
		Static256.method4185();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)V")
	public static void method4078() {
		for (@Pc(7) int local7 = 0; local7 < Static93.anInt2064; local7++) {
			@Pc(13) Class7 local13 = Static121.aClass7Array2[local7];
			@Pc(15) boolean local15 = false;
			@Pc(135) int local135;
			if (local13.aClass4_Sub7_Sub1_1 == null) {
				local13.anInt63--;
				if ((local13.aByte1 == 2 ? -1500 : -10) > local13.anInt63) {
					local15 = true;
				} else {
					if (local13.aByte1 == 1 && local13.aClass110_1 == null) {
						local13.aClass110_1 = Static473.method3025(Static180.aClass38_37, local13.anInt61, 0);
						if (local13.aClass110_1 == null) {
							continue;
						}
						local13.anInt63 += local13.aClass110_1.method3024();
					} else if (local13.aByte1 == 2 && (local13.aClass4_Sub34_1 == null || local13.aClass4_Sub9_Sub1_1 == null)) {
						if (local13.aClass4_Sub34_1 == null) {
							local13.aClass4_Sub34_1 = Static333.method4920(Static30.aClass38_9, local13.anInt61);
						}
						if (local13.aClass4_Sub34_1 == null) {
							continue;
						}
						if (local13.aClass4_Sub9_Sub1_1 == null) {
							local13.aClass4_Sub9_Sub1_1 = local13.aClass4_Sub34_1.method4918(new int[] { 22050 });
							if (local13.aClass4_Sub9_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local13.anInt63 < 0) {
						if (local13.anInt62 == 0) {
							local135 = Static157.aClass185_Sub1_1.anInt5554 * local13.anInt64 >> 8;
						} else {
							@Pc(144) int local144 = local13.anInt62 >> 24 & 0x3;
							if (Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 == local144) {
								@Pc(163) int local163 = (local13.anInt62 & 0xFF) << 7;
								@Pc(170) int local170 = local13.anInt62 >> 16 & 0xFF;
								@Pc(180) int local180 = (local170 << 7) + 64 - Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514;
								if (local180 < 0) {
									local180 = -local180;
								}
								@Pc(195) int local195 = local13.anInt62 >> 8 & 0xFF;
								@Pc(204) int local204 = (local195 << 7) + 64 - Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515;
								if (local204 < 0) {
									local204 = -local204;
								}
								@Pc(216) int local216 = local180 + local204 - 128;
								if (local216 > local163) {
									local13.anInt63 = -99999;
									continue;
								}
								if (local216 < 0) {
									local216 = 0;
								}
								local135 = Static157.aClass185_Sub1_1.anInt5555 * (local163 - local216) * local13.anInt64 / local163 >> 8;
							} else {
								local135 = 0;
							}
						}
						if (local135 > 0) {
							@Pc(253) Class4_Sub9_Sub1 local253 = null;
							if (local13.aByte1 == 1) {
								local253 = local13.aClass110_1.method3023().method1302(Static131.aClass254_2);
							} else if (local13.aByte1 == 2) {
								local253 = local13.aClass4_Sub9_Sub1_1;
							}
							@Pc(281) Class4_Sub7_Sub1 local281 = local13.aClass4_Sub7_Sub1_1 = Static470.method977(local253, local135);
							local281.method974(local13.anInt59 - 1);
							Static132.aClass4_Sub7_Sub4_1.method5473(local281);
						}
					}
				}
			} else if (!local13.aClass4_Sub7_Sub1_1.method6325()) {
				local15 = true;
			}
			if (local15) {
				Static93.anInt2064--;
				for (local135 = local7; local135 < Static93.anInt2064; local135++) {
					Static121.aClass7Array2[local135] = Static121.aClass7Array2[local135 + 1];
				}
				local7--;
			}
		}
		if (Static351.aBoolean462 && !Static147.method2735()) {
			if (Static157.aClass185_Sub1_1.anInt5567 != 0 && Static305.anInt5655 != -1) {
				Static1.method2(Static157.aClass185_Sub1_1.anInt5567, Static305.anInt5655, Static296.aClass38_80);
			}
			Static351.aBoolean462 = false;
		} else if (Static157.aClass185_Sub1_1.anInt5567 != 0 && Static305.anInt5655 != -1 && !Static147.method2735()) {
			Static448.method6134(Static224.aClass212_61);
			Static457.aClass4_Sub20_Sub1_5.method4561(Static305.anInt5655);
			Static305.anInt5655 = -1;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILclient!wo;I)J")
	public static long method4079(@OriginalArg(1) int arg0, @OriginalArg(2) Interface12 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class139 local16 = Static146.aClass228_1.method5203(arg1.method6320());
		@Pc(37) long local37 = (long) (arg2 | 0x40000000 | arg0 << 7 | arg1.method6318() << 14 | arg1.method6316() << 20);
		if (local16.anInt4358 == 0) {
			local37 |= local9;
		}
		if (local16.anInt4355 == 1) {
			local37 |= local5;
		}
		if (local16.aBoolean289) {
			local37 |= local7;
		}
		return local37 | (long) arg1.method6320() << 32;
	}
}

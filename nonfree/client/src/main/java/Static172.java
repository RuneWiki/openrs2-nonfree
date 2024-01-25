import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!hca", name = "p", descriptor = "I")
	public static int anInt3436;

	@OriginalMember(owner = "client!hca", name = "q", descriptor = "I")
	public static int anInt3437;

	@OriginalMember(owner = "client!hca", name = "g", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!hca", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString73 = null;

	@OriginalMember(owner = "client!hca", name = "o", descriptor = "[S")
	public static final short[] aShortArray70 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!hca", name = "r", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_55 = new Class45("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II[[[Lclient!dg;BIZ)Z")
	public static boolean method3204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (Static389.anInt6904 & 0xFF);
		if (Static314.aByteArrayArrayArray12[Static322.anInt6113][arg1][arg0] == local14) {
			return false;
		} else if ((Static379.aByteArrayArrayArray13[Static322.anInt6113][arg1][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(42) byte local42 = 0;
			Static267.anIntArray424[0] = arg1;
			@Pc(48) int local48 = 0;
			@Pc(51) int local51 = local42 + 1;
			Static321.anIntArray480[0] = arg0;
			Static314.aByteArrayArrayArray12[Static322.anInt6113][arg1][arg0] = local14;
			while (local48 != local51) {
				@Pc(74) int local74 = Static267.anIntArray424[local48] & 0xFFFF;
				@Pc(82) int local82 = Static267.anIntArray424[local48] >> 16 & 0xFF;
				@Pc(90) int local90 = Static267.anIntArray424[local48] >> 24 & 0xFF;
				@Pc(96) int local96 = Static321.anIntArray480[local48] & 0xFFFF;
				@Pc(104) int local104 = Static321.anIntArray480[local48] >> 16 & 0xFF;
				local48 = local48 + 1 & 0xFFF;
				@Pc(112) boolean local112 = false;
				if ((Static379.aByteArrayArrayArray13[Static322.anInt6113][local74][local96] & 0x4) == 0) {
					local112 = true;
				}
				@Pc(129) boolean local129 = false;
				@Pc(168) int local168;
				@Pc(218) int local218;
				label231: for (@Pc(133) int local133 = Static322.anInt6113 + 1; local133 <= 3; local133++) {
					if ((Static379.aByteArrayArrayArray13[local133][local74][local96] & 0x8) == 0) {
						@Pc(317) Class20_Sub1 local317;
						@Pc(327) int local327;
						@Pc(306) Class64 local306;
						@Pc(312) Class232 local312;
						if (local112 && arg2[local133][local74][local96] != null) {
							if (arg2[local133][local74][local96].aClass20_Sub2_1 != null) {
								local168 = Static517.method7911(local82);
								if (local168 == arg2[local133][local74][local96].aClass20_Sub2_1.anInt9299 || arg2[local133][local74][local96].aClass20_Sub2_2 != null && arg2[local133][local74][local96].aClass20_Sub2_2.anInt9299 == local168) {
									continue;
								}
								if (local90 != 0) {
									local218 = Static517.method7911(local90);
									if (arg2[local133][local74][local96].aClass20_Sub2_1.anInt9299 == local218 || arg2[local133][local74][local96].aClass20_Sub2_2 != null && local218 == arg2[local133][local74][local96].aClass20_Sub2_2.anInt9299) {
										continue;
									}
								}
								if (local104 != 0) {
									local218 = Static517.method7911(local104);
									if (arg2[local133][local74][local96].aClass20_Sub2_1.anInt9299 == local218 || arg2[local133][local74][local96].aClass20_Sub2_2 != null && local218 == arg2[local133][local74][local96].aClass20_Sub2_2.anInt9299) {
										continue;
									}
								}
							}
							local306 = arg2[local133][local74][local96];
							if (local306.aClass232_2 != null) {
								for (local312 = local306.aClass232_2; local312 != null; local312 = local312.aClass232_3) {
									local317 = local312.aClass20_Sub1_2;
									if (local317 instanceof Interface7) {
										@Pc(323) Interface7 local323 = (Interface7) local317;
										local327 = local323.method8047();
										if (local327 == 21) {
											local327 = 19;
										}
										@Pc(338) int local338 = local323.method8044();
										@Pc(344) int local344 = local327 | local338 << 6;
										if (local82 == local344 || local90 != 0 && local344 == local90 || local104 != 0 && local344 == local104) {
											continue label231;
										}
									}
								}
							}
						}
						local306 = arg2[local133][local74][local96];
						if (local306 != null && local306.aClass232_2 != null) {
							for (local312 = local306.aClass232_2; local312 != null; local312 = local312.aClass232_3) {
								local317 = local312.aClass20_Sub1_2;
								if (local317.aShort124 != local317.aShort126 || local317.aShort125 != local317.aShort123) {
									for (@Pc(417) int local417 = local317.aShort124; local417 <= local317.aShort126; local417++) {
										for (local327 = local317.aShort123; local327 <= local317.aShort125; local327++) {
											Static314.aByteArrayArrayArray12[local133][local417][local327] = local14;
										}
									}
								}
							}
						}
						Static314.aByteArrayArrayArray12[local133][local74][local96] = local14;
						local129 = true;
					}
				}
				if (local129) {
					local168 = Static296.aClass7Array11[Static322.anInt6113 + 1].ba(local74, local96);
					if (Static204.anIntArray322[arg3] < local168) {
						Static204.anIntArray322[arg3] = local168;
					}
					local218 = local74 << 7;
					@Pc(499) int local499 = local96 << 7;
					if (local218 < Static265.anIntArray281[arg3]) {
						Static265.anIntArray281[arg3] = local218;
					} else if (Static348.anIntArray622[arg3] < local218) {
						Static348.anIntArray622[arg3] = local218;
					}
					if (Static220.anIntArray340[arg3] > local499) {
						Static220.anIntArray340[arg3] = local499;
					} else if (Static279.anIntArray261[arg3] < local499) {
						Static279.anIntArray261[arg3] = local499;
					}
				}
				if (!local112) {
					if (local74 >= 1 && local14 != Static314.aByteArrayArrayArray12[Static322.anInt6113][local74 - 1][local96]) {
						Static267.anIntArray424[local51] = 0xD3000000 | 0x120000 | local74 - 1;
						Static321.anIntArray480[local51] = local96 | 0x130000;
						Static314.aByteArrayArrayArray12[Static322.anInt6113][local74 - 1][local96] = local14;
						local51 = local51 + 1 & 0xFFF;
					}
					local96++;
					if (local96 < Static373.anInt6694) {
						if (local74 - 1 >= 0 && Static314.aByteArrayArrayArray12[Static322.anInt6113][local74 - 1][local96] != local14 && (Static379.aByteArrayArrayArray13[Static322.anInt6113][local74][local96] & 0x4) == 0 && (Static379.aByteArrayArrayArray13[Static322.anInt6113][local74 - 1][local96 - 1] & 0x4) == 0) {
							Static267.anIntArray424[local51] = local74 - 1 | 0x52000000 | 0x120000;
							Static321.anIntArray480[local51] = local96 | 0x130000;
							Static314.aByteArrayArrayArray12[Static322.anInt6113][local74 - 1][local96] = local14;
							local51 = local51 + 1 & 0xFFF;
						}
						if (local14 != Static314.aByteArrayArrayArray12[Static322.anInt6113][local74][local96]) {
							Static267.anIntArray424[local51] = local74 | 0x520000 | 0x13000000;
							Static321.anIntArray480[local51] = local96 | 0x530000;
							local51 = local51 + 1 & 0xFFF;
							Static314.aByteArrayArrayArray12[Static322.anInt6113][local74][local96] = local14;
						}
						if (Static237.anInt4563 > local74 + 1 && Static314.aByteArrayArrayArray12[Static322.anInt6113][local74 + 1][local96] != local14 && (Static379.aByteArrayArrayArray13[Static322.anInt6113][local74][local96] & 0x4) == 0 && (Static379.aByteArrayArrayArray13[Static322.anInt6113][local74 + 1][local96 - 1] & 0x4) == 0) {
							Static267.anIntArray424[local51] = 0x92000000 | 0x520000 | local74 + 1;
							Static321.anIntArray480[local51] = local96 | 0x530000;
							Static314.aByteArrayArrayArray12[Static322.anInt6113][local74 + 1][local96] = local14;
							local51 = local51 + 1 & 0xFFF;
						}
					}
					local96--;
					if (Static237.anInt4563 > local74 + 1 && local14 != Static314.aByteArrayArrayArray12[Static322.anInt6113][local74 + 1][local96]) {
						Static267.anIntArray424[local51] = local74 + 1 | 0x920000 | 0x53000000;
						Static321.anIntArray480[local51] = local96 | 0x930000;
						Static314.aByteArrayArrayArray12[Static322.anInt6113][local74 + 1][local96] = local14;
						local51 = local51 + 1 & 0xFFF;
					}
					local96--;
					if (local96 >= 0) {
						if (local74 - 1 >= 0 && Static314.aByteArrayArrayArray12[Static322.anInt6113][local74 - 1][local96] != local14 && (Static379.aByteArrayArrayArray13[Static322.anInt6113][local74][local96] & 0x4) == 0 && (Static379.aByteArrayArrayArray13[Static322.anInt6113][local74 - 1][local96 + 1] & 0x4) == 0) {
							Static267.anIntArray424[local51] = local74 - 1 | 0xD20000 | 0x12000000;
							Static321.anIntArray480[local51] = local96 | 0xD30000;
							Static314.aByteArrayArrayArray12[Static322.anInt6113][local74 - 1][local96] = local14;
							local51 = local51 + 1 & 0xFFF;
						}
						if (Static314.aByteArrayArrayArray12[Static322.anInt6113][local74][local96] != local14) {
							Static267.anIntArray424[local51] = local74 | 0x93000000 | 0xD20000;
							Static321.anIntArray480[local51] = local96 | 0xD30000;
							Static314.aByteArrayArrayArray12[Static322.anInt6113][local74][local96] = local14;
							local51 = local51 + 1 & 0xFFF;
						}
						if (local74 + 1 < Static237.anInt4563 && Static314.aByteArrayArrayArray12[Static322.anInt6113][local74 + 1][local96] != local14 && (Static379.aByteArrayArrayArray13[Static322.anInt6113][local74][local96] & 0x4) == 0 && (Static379.aByteArrayArrayArray13[Static322.anInt6113][local74 + 1][local96 + 1] & 0x4) == 0) {
							Static267.anIntArray424[local51] = local74 + 1 | 0xD2000000 | 0x920000;
							Static321.anIntArray480[local51] = local96 | 0x930000;
							local51 = local51 + 1 & 0xFFF;
							Static314.aByteArrayArrayArray12[Static322.anInt6113][local74 + 1][local96] = local14;
						}
					}
				}
			}
			if (Static204.anIntArray322[arg3] != -1000000) {
				Static204.anIntArray322[arg3] += 10;
				Static265.anIntArray281[arg3] -= 50;
				Static348.anIntArray622[arg3] += 50;
				Static279.anIntArray261[arg3] += 50;
				Static220.anIntArray340[arg3] -= 50;
			}
			return true;
		}
	}
}

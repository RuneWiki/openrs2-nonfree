import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!kq", name = "J", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_55 = new Class240(33, 11);

	@OriginalMember(owner = "client!kq", name = "Z", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_29 = new Class295(4);

	@OriginalMember(owner = "client!kq", name = "db", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_81 = new Class171(9, 6);

	@OriginalMember(owner = "client!kq", name = "fb", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_82 = new Class171(93, -1);

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIZI[[[Lclient!vda;I)Z")
	public static boolean method4594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class368[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg2 ? 1 : (byte) (Static494.anInt7829 & 0xFF);
		if (Static366.aByteArrayArrayArray14[Static570.anInt9192][arg4][arg0] == local14) {
			return false;
		} else if ((Static315.aByteArrayArrayArray13[Static570.anInt9192][arg4][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(42) byte local42 = 0;
			Static429.anIntArray385[0] = arg4;
			@Pc(48) int local48 = 0;
			@Pc(62) int local62 = local42 + 1;
			Static472.anIntArray407[0] = arg0;
			Static366.aByteArrayArrayArray14[Static570.anInt9192][arg4][arg0] = local14;
			while (local62 != local48) {
				@Pc(80) int local80 = Static429.anIntArray385[local48] & 0xFFFF;
				@Pc(88) int local88 = Static429.anIntArray385[local48] >> 16 & 0xFF;
				@Pc(96) int local96 = Static429.anIntArray385[local48] >> 24 & 0xFF;
				@Pc(102) int local102 = Static472.anIntArray407[local48] & 0xFFFF;
				@Pc(110) int local110 = Static472.anIntArray407[local48] >> 16 & 0xFF;
				local48 = local48 + 1 & 0xFFF;
				@Pc(118) boolean local118 = false;
				if ((Static315.aByteArrayArrayArray13[Static570.anInt9192][local80][local102] & 0x4) == 0) {
					local118 = true;
				}
				@Pc(132) boolean local132 = false;
				@Pc(138) int local138;
				@Pc(177) int local177;
				@Pc(224) int local224;
				if (arg3 != null) {
					label237: for (local138 = Static570.anInt9192 + 1; local138 <= 3; local138++) {
						if (arg3[local138] != null && (Static315.aByteArrayArrayArray13[local138][local80][local102] & 0x8) == 0) {
							@Pc(319) Class34_Sub1_Sub1 local319;
							@Pc(329) int local329;
							@Pc(308) Class368 local308;
							@Pc(314) Class205 local314;
							if (local118 && arg3[local138][local80][local102] != null) {
								if (arg3[local138][local80][local102].aClass34_Sub1_Sub5_2 != null) {
									local177 = Static308.method4436(local88);
									if (arg3[local138][local80][local102].aClass34_Sub1_Sub5_2.aShort53 == local177 || arg3[local138][local80][local102].aClass34_Sub1_Sub5_1 != null && local177 == arg3[local138][local80][local102].aClass34_Sub1_Sub5_1.aShort53) {
										continue;
									}
									if (local96 != 0) {
										local224 = Static308.method4436(local96);
										if (local224 == arg3[local138][local80][local102].aClass34_Sub1_Sub5_2.aShort53 || arg3[local138][local80][local102].aClass34_Sub1_Sub5_1 != null && local224 == arg3[local138][local80][local102].aClass34_Sub1_Sub5_1.aShort53) {
											continue;
										}
									}
									if (local110 != 0) {
										local224 = Static308.method4436(local110);
										if (local224 == arg3[local138][local80][local102].aClass34_Sub1_Sub5_2.aShort53 || arg3[local138][local80][local102].aClass34_Sub1_Sub5_1 != null && arg3[local138][local80][local102].aClass34_Sub1_Sub5_1.aShort53 == local224) {
											continue;
										}
									}
								}
								local308 = arg3[local138][local80][local102];
								if (local308.aClass205_4 != null) {
									for (local314 = local308.aClass205_4; local314 != null; local314 = local314.aClass205_3) {
										local319 = local314.aClass34_Sub1_Sub1_1;
										if (local319 instanceof Interface17) {
											@Pc(325) Interface17 local325 = (Interface17) local319;
											local329 = local325.method6662();
											if (local329 == 21) {
												local329 = 19;
											}
											@Pc(338) int local338 = local325.method6659();
											@Pc(344) int local344 = local329 | local338 << 6;
											if (local88 == local344 || local96 != 0 && local344 == local96 || local110 != 0 && local110 == local344) {
												continue label237;
											}
										}
									}
								}
							}
							local308 = arg3[local138][local80][local102];
							if (local308 != null && local308.aClass205_4 != null) {
								for (local314 = local308.aClass205_4; local314 != null; local314 = local314.aClass205_3) {
									local319 = local314.aClass34_Sub1_Sub1_1;
									if (local319.aShort97 != local319.aShort98 || local319.aShort99 != local319.aShort96) {
										for (@Pc(413) int local413 = local319.aShort98; local413 <= local319.aShort97; local413++) {
											for (local329 = local319.aShort99; local329 <= local319.aShort96; local329++) {
												Static366.aByteArrayArrayArray14[local138][local413][local329] = local14;
											}
										}
									}
								}
							}
							Static366.aByteArrayArrayArray14[local138][local80][local102] = local14;
							local132 = true;
						}
					}
				}
				if (local132) {
					local138 = Static582.aClass35Array3[Static570.anInt9192 + 1].method7461(local102, local80);
					if (Static419.anIntArray363[arg1] < local138) {
						Static419.anIntArray363[arg1] = local138;
					}
					local177 = local80 << 9;
					if (local177 < Static652.anIntArray579[arg1]) {
						Static652.anIntArray579[arg1] = local177;
					} else if (Static464.anIntArray403[arg1] < local177) {
						Static464.anIntArray403[arg1] = local177;
					}
					local224 = local102 << 9;
					if (local224 < Static58.anIntArray511[arg1]) {
						Static58.anIntArray511[arg1] = local224;
					} else if (local224 > Static492.anIntArray42[arg1]) {
						Static492.anIntArray42[arg1] = local224;
					}
				}
				if (!local118) {
					if (local80 >= 1 && Static366.aByteArrayArrayArray14[Static570.anInt9192][local80 - 1][local102] != local14) {
						Static429.anIntArray385[local62] = local80 - 1 | 0x120000 | 0xD3000000;
						Static472.anIntArray407[local62] = local102 | 0x130000;
						local62 = local62 + 1 & 0xFFF;
						Static366.aByteArrayArrayArray14[Static570.anInt9192][local80 - 1][local102] = local14;
					}
					local102++;
					if (Static438.anInt7120 > local102) {
						if (local80 - 1 >= 0 && Static366.aByteArrayArrayArray14[Static570.anInt9192][local80 - 1][local102] != local14 && (Static315.aByteArrayArrayArray13[Static570.anInt9192][local80][local102] & 0x4) == 0 && (Static315.aByteArrayArrayArray13[Static570.anInt9192][local80 - 1][local102 - 1] & 0x4) == 0) {
							Static429.anIntArray385[local62] = local80 - 1 | 0x52000000 | 0x120000;
							Static472.anIntArray407[local62] = local102 | 0x130000;
							local62 = local62 + 1 & 0xFFF;
							Static366.aByteArrayArrayArray14[Static570.anInt9192][local80 - 1][local102] = local14;
						}
						if (Static366.aByteArrayArrayArray14[Static570.anInt9192][local80][local102] != local14) {
							Static429.anIntArray385[local62] = local80 | 0x520000 | 0x13000000;
							Static472.anIntArray407[local62] = local102 | 0x530000;
							Static366.aByteArrayArrayArray14[Static570.anInt9192][local80][local102] = local14;
							local62 = local62 + 1 & 0xFFF;
						}
						if (Static98.anInt361 > local80 + 1 && local14 != Static366.aByteArrayArrayArray14[Static570.anInt9192][local80 + 1][local102] && (Static315.aByteArrayArrayArray13[Static570.anInt9192][local80][local102] & 0x4) == 0 && (Static315.aByteArrayArrayArray13[Static570.anInt9192][local80 + 1][local102 - 1] & 0x4) == 0) {
							Static429.anIntArray385[local62] = local80 + 1 | 0x92000000 | 0x520000;
							Static472.anIntArray407[local62] = local102 | 0x530000;
							Static366.aByteArrayArrayArray14[Static570.anInt9192][local80 + 1][local102] = local14;
							local62 = local62 + 1 & 0xFFF;
						}
					}
					local102--;
					if (local80 + 1 < Static98.anInt361 && Static366.aByteArrayArrayArray14[Static570.anInt9192][local80 + 1][local102] != local14) {
						Static429.anIntArray385[local62] = local80 + 1 | 0x920000 | 0x53000000;
						Static472.anIntArray407[local62] = local102 | 0x930000;
						local62 = local62 + 1 & 0xFFF;
						Static366.aByteArrayArrayArray14[Static570.anInt9192][local80 + 1][local102] = local14;
					}
					local102--;
					if (local102 >= 0) {
						if (local80 - 1 >= 0 && Static366.aByteArrayArrayArray14[Static570.anInt9192][local80 - 1][local102] != local14 && (Static315.aByteArrayArrayArray13[Static570.anInt9192][local80][local102] & 0x4) == 0 && (Static315.aByteArrayArrayArray13[Static570.anInt9192][local80 - 1][local102 + 1] & 0x4) == 0) {
							Static429.anIntArray385[local62] = local80 - 1 | 0xD20000 | 0x12000000;
							Static472.anIntArray407[local62] = local102 | 0xD30000;
							Static366.aByteArrayArrayArray14[Static570.anInt9192][local80 - 1][local102] = local14;
							local62 = local62 + 1 & 0xFFF;
						}
						if (Static366.aByteArrayArrayArray14[Static570.anInt9192][local80][local102] != local14) {
							Static429.anIntArray385[local62] = 0x93000000 | 0xD20000 | local80;
							Static472.anIntArray407[local62] = local102 | 0xD30000;
							local62 = local62 + 1 & 0xFFF;
							Static366.aByteArrayArrayArray14[Static570.anInt9192][local80][local102] = local14;
						}
						if (local80 + 1 < Static98.anInt361 && Static366.aByteArrayArrayArray14[Static570.anInt9192][local80 + 1][local102] != local14 && (Static315.aByteArrayArrayArray13[Static570.anInt9192][local80][local102] & 0x4) == 0 && (Static315.aByteArrayArrayArray13[Static570.anInt9192][local80 + 1][local102 + 1] & 0x4) == 0) {
							Static429.anIntArray385[local62] = local80 + 1 | 0x920000 | 0xD2000000;
							Static472.anIntArray407[local62] = local102 | 0x930000;
							Static366.aByteArrayArrayArray14[Static570.anInt9192][local80 + 1][local102] = local14;
							local62 = local62 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static419.anIntArray363[arg1] != -1000000) {
				Static419.anIntArray363[arg1] += 40;
				Static652.anIntArray579[arg1] -= 512;
				Static464.anIntArray403[arg1] += 512;
				Static492.anIntArray42[arg1] += 512;
				Static58.anIntArray511[arg1] -= 512;
			}
			return true;
		}
	}
}

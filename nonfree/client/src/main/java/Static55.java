import java.awt.Frame;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "[Lclient!bi;")
	public static Class4_Sub2_Sub1[] aClass4_Sub2_Sub1Array4;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "Z")
	public static boolean aBoolean81;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
	public static int anInt1085 = 0;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "J")
	public static volatile long aLong39 = 0L;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
	public static void method876() {
		Static145.aClass33_24.method838(5);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method877(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = Static168.method2661(arg0);
		if (local3 != -1) {
			@Pc(37) int[] local37 = Static23.aClass4_Sub2_Sub9_1.method1414(Static192.aClass9_2.anIntArray22[local3] >> 28 & 0x3, Static192.aClass9_2.anIntArray22[local3] & 0x3FFF, Static192.aClass9_2.anIntArray22[local3] >> 14 & 0x3FFF);
			Static237.method3672(local37[1], local37[2]);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
	public static void method878() {
		aFrame2 = null;
		aCRC32_1 = null;
		aClass4_Sub2_Sub1Array4 = null;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z[[[Lclient!dk;IIII)Z")
	public static boolean method879(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub11[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static32.anInt641 & 0xFF);
		if (Static275.aByteArrayArrayArray18[Static210.anInt4103][arg2][arg4] == local14) {
			return false;
		} else if ((Static46.aByteArrayArrayArray2[Static210.anInt4103][arg2][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(45) byte local45 = 0;
			Static46.anIntArray121[0] = arg2;
			@Pc(52) int local52 = local45 + 1;
			Static211.anIntArray381[0] = arg4;
			Static275.aByteArrayArrayArray18[Static210.anInt4103][arg2][arg4] = local14;
			@Pc(64) int local64 = 0;
			while (local52 != local64) {
				@Pc(80) int local80 = Static46.anIntArray121[local64] >> 24 & 0xFF;
				@Pc(88) int local88 = Static46.anIntArray121[local64] >> 16 & 0xFF;
				@Pc(94) int local94 = Static211.anIntArray381[local64] & 0xFFFF;
				@Pc(102) int local102 = Static211.anIntArray381[local64] >> 16 & 0xFF;
				@Pc(108) int local108 = Static46.anIntArray121[local64] & 0xFFFF;
				@Pc(110) boolean local110 = false;
				@Pc(112) boolean local112 = false;
				local64 = local64 + 1 & 0xFFF;
				if ((Static46.aByteArrayArrayArray2[Static210.anInt4103][local108][local94] & 0x4) == 0) {
					local110 = true;
				}
				@Pc(138) int local138;
				@Pc(181) int local181;
				label235: for (local138 = Static210.anInt4103 + 1; local138 <= 3; local138++) {
					if ((Static46.aByteArrayArrayArray2[local138][local108][local94] & 0x8) == 0) {
						@Pc(217) int local217;
						@Pc(344) int local344;
						if (local110 && arg1[local138][local108][local94] != null) {
							if (arg1[local138][local108][local94].aClass43_1 != null) {
								local181 = Static269.method4010(local88);
								if (local181 == arg1[local138][local108][local94].aClass43_1.anInt1227 || arg1[local138][local108][local94].aClass43_1.anInt1231 == local181) {
									continue;
								}
								if (local80 != 0) {
									local217 = Static269.method4010(local80);
									if (arg1[local138][local108][local94].aClass43_1.anInt1227 == local217 || arg1[local138][local108][local94].aClass43_1.anInt1231 == local217) {
										continue;
									}
								}
								if (local102 != 0) {
									local217 = Static269.method4010(local102);
									if (local217 == arg1[local138][local108][local94].aClass43_1.anInt1227 || local217 == arg1[local138][local108][local94].aClass43_1.anInt1231) {
										continue;
									}
								}
							}
							if (arg1[local138][local108][local94].aClass173Array1 != null) {
								for (local181 = 0; local181 < arg1[local138][local108][local94].anInt1054; local181++) {
									local217 = (int) (arg1[local138][local108][local94].aClass173Array1[local181].aLong183 >> 14 & 0x3FL);
									if (local217 == 21) {
										local217 = 19;
									}
									@Pc(338) int local338 = (int) (arg1[local138][local108][local94].aClass173Array1[local181].aLong183 >> 20 & 0x3L);
									local344 = local217 | local338 << 6;
									if (local344 == local88 || local80 != 0 && local344 == local80 || local102 != 0 && local344 == local102) {
										continue label235;
									}
								}
							}
						}
						local112 = true;
						@Pc(378) Class4_Sub11 local378 = arg1[local138][local108][local94];
						if (local378 != null && local378.anInt1054 > 0) {
							for (local217 = 0; local217 < local378.anInt1054; local217++) {
								@Pc(397) Class173 local397 = local378.aClass173Array1[local217];
								if (local397.anInt5163 != local397.anInt5149 || local397.anInt5157 != local397.anInt5158) {
									for (local344 = local397.anInt5149; local344 <= local397.anInt5163; local344++) {
										for (@Pc(425) int local425 = local397.anInt5157; local425 <= local397.anInt5158; local425++) {
											Static275.aByteArrayArrayArray18[local138][local344][local425] = local14;
										}
									}
								}
							}
						}
						Static275.aByteArrayArrayArray18[local138][local108][local94] = local14;
					}
				}
				if (local112) {
					if (Static250.anIntArrayArrayArray13[Static210.anInt4103 + 1][local108][local94] > Static16.anIntArray33[arg3]) {
						Static16.anIntArray33[arg3] = Static250.anIntArrayArrayArray13[Static210.anInt4103 + 1][local108][local94];
					}
					local138 = local108 << 7;
					local181 = local94 << 7;
					if (local138 < Static127.anIntArray244[arg3]) {
						Static127.anIntArray244[arg3] = local138;
					} else if (local138 > Static150.anIntArray278[arg3]) {
						Static150.anIntArray278[arg3] = local138;
					}
					if (Static120.anIntArray238[arg3] > local181) {
						Static120.anIntArray238[arg3] = local181;
					} else if (Static255.anIntArray434[arg3] < local181) {
						Static255.anIntArray434[arg3] = local181;
					}
				}
				if (!local110) {
					if (local108 >= 1 && Static275.aByteArrayArrayArray18[Static210.anInt4103][local108 - 1][local94] != local14) {
						Static46.anIntArray121[local52] = local108 - 1 | 0x120000 | 0xD3000000;
						Static211.anIntArray381[local52] = local94 | 0x130000;
						local52 = local52 + 1 & 0xFFF;
						Static275.aByteArrayArrayArray18[Static210.anInt4103][local108 - 1][local94] = local14;
					}
					local94++;
					if (local94 < 104) {
						if (local108 - 1 >= 0 && Static275.aByteArrayArrayArray18[Static210.anInt4103][local108 - 1][local94] != local14 && (Static46.aByteArrayArrayArray2[Static210.anInt4103][local108][local94] & 0x4) == 0 && (Static46.aByteArrayArrayArray2[Static210.anInt4103][local108 - 1][local94 - 1] & 0x4) == 0) {
							Static46.anIntArray121[local52] = local108 - 1 | 0x52000000 | 0x120000;
							Static211.anIntArray381[local52] = local94 | 0x130000;
							local52 = local52 + 1 & 0xFFF;
							Static275.aByteArrayArrayArray18[Static210.anInt4103][local108 - 1][local94] = local14;
						}
						if (Static275.aByteArrayArrayArray18[Static210.anInt4103][local108][local94] != local14) {
							Static46.anIntArray121[local52] = local108 | 0x520000 | 0x13000000;
							Static211.anIntArray381[local52] = local94 | 0x530000;
							Static275.aByteArrayArrayArray18[Static210.anInt4103][local108][local94] = local14;
							local52 = local52 + 1 & 0xFFF;
						}
						if (local108 + 1 < 104 && local14 != Static275.aByteArrayArrayArray18[Static210.anInt4103][local108 + 1][local94] && (Static46.aByteArrayArrayArray2[Static210.anInt4103][local108][local94] & 0x4) == 0 && (Static46.aByteArrayArrayArray2[Static210.anInt4103][local108 + 1][local94 - 1] & 0x4) == 0) {
							Static46.anIntArray121[local52] = local108 + 1 | 0x520000 | 0x92000000;
							Static211.anIntArray381[local52] = local94 | 0x530000;
							local52 = local52 + 1 & 0xFFF;
							Static275.aByteArrayArrayArray18[Static210.anInt4103][local108 + 1][local94] = local14;
						}
					}
					local94--;
					if (local108 + 1 < 104 && Static275.aByteArrayArrayArray18[Static210.anInt4103][local108 + 1][local94] != local14) {
						Static46.anIntArray121[local52] = local108 + 1 | 0x920000 | 0x53000000;
						Static211.anIntArray381[local52] = local94 | 0x930000;
						local52 = local52 + 1 & 0xFFF;
						Static275.aByteArrayArrayArray18[Static210.anInt4103][local108 + 1][local94] = local14;
					}
					local94--;
					if (local94 >= 0) {
						if (local108 - 1 >= 0 && local14 != Static275.aByteArrayArrayArray18[Static210.anInt4103][local108 - 1][local94] && (Static46.aByteArrayArrayArray2[Static210.anInt4103][local108][local94] & 0x4) == 0 && (Static46.aByteArrayArrayArray2[Static210.anInt4103][local108 - 1][local94 + 1] & 0x4) == 0) {
							Static46.anIntArray121[local52] = local108 - 1 | 0xD20000 | 0x12000000;
							Static211.anIntArray381[local52] = local94 | 0xD30000;
							local52 = local52 + 1 & 0xFFF;
							Static275.aByteArrayArrayArray18[Static210.anInt4103][local108 - 1][local94] = local14;
						}
						if (local14 != Static275.aByteArrayArrayArray18[Static210.anInt4103][local108][local94]) {
							Static46.anIntArray121[local52] = local108 | 0xD20000 | 0x93000000;
							Static211.anIntArray381[local52] = local94 | 0xD30000;
							Static275.aByteArrayArrayArray18[Static210.anInt4103][local108][local94] = local14;
							local52 = local52 + 1 & 0xFFF;
						}
						if (local108 + 1 < 104 && local14 != Static275.aByteArrayArrayArray18[Static210.anInt4103][local108 + 1][local94] && (Static46.aByteArrayArrayArray2[Static210.anInt4103][local108][local94] & 0x4) == 0 && (Static46.aByteArrayArrayArray2[Static210.anInt4103][local108 + 1][local94 + 1] & 0x4) == 0) {
							Static46.anIntArray121[local52] = 0xD2000000 | 0x920000 | local108 + 1;
							Static211.anIntArray381[local52] = local94 | 0x930000;
							local52 = local52 + 1 & 0xFFF;
							Static275.aByteArrayArrayArray18[Static210.anInt4103][local108 + 1][local94] = local14;
						}
					}
				}
			}
			if (Static16.anIntArray33[arg3] != -1000000) {
				Static16.anIntArray33[arg3] += 10;
				Static127.anIntArray244[arg3] -= 50;
				Static150.anIntArray278[arg3] += 50;
				Static255.anIntArray434[arg3] += 50;
				Static120.anIntArray238[arg3] -= 50;
			}
			return true;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
	public static int anInt3285;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_67 = new Class254(71, 28);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public static void method2919() {
		Static521.anInt9062 = 0;
		Static360.aClass161Array1 = new Class161[50];
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILclient!oa;Lclient!e;)V")
	public static void method2924(@OriginalArg(1) Class9 arg0, @OriginalArg(2) Interface2 arg1) {
		if (Static461.aClass6_Sub4_Sub12_2 == null) {
			return;
		}
		if (Static297.anInt4703 < 10) {
			if (!Static461.aClass168_2.method4437(Static461.aClass6_Sub4_Sub12_2.aString78)) {
				Static297.anInt4703 = Static168.aClass168_41.method4457(Static461.aClass6_Sub4_Sub12_2.aString78) / 10;
				return;
			}
			Static5.method209();
			Static297.anInt4703 = 10;
		}
		if (Static297.anInt4703 == 10) {
			Static461.anInt57 = Static461.aClass6_Sub4_Sub12_2.anInt6896 >> 6 << 6;
			Static461.anInt58 = Static461.aClass6_Sub4_Sub12_2.anInt6894 >> 6 << 6;
			Static461.anInt53 = (Static461.aClass6_Sub4_Sub12_2.anInt6898 >> 6 << 6) + 64 - Static461.anInt58;
			Static461.anInt52 = (Static461.aClass6_Sub4_Sub12_2.anInt6895 >> 6 << 6) + 64 - Static461.anInt57;
			@Pc(82) int[] local82 = new int[3];
			@Pc(84) int local84 = -1;
			@Pc(86) int local86 = -1;
			if (Static461.aClass6_Sub4_Sub12_2.method5807(Static247.anInt5049 + (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351 >> 9), local82, Static191.anInt4147 + (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 >> 9), Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77)) {
				local86 = local82[2] - Static461.anInt58;
				local84 = local82[1] - Static461.anInt57;
			}
			if (!Static349.aBoolean508 && local84 >= 0 && local84 < Static461.anInt52 && local86 >= 0 && local86 < Static461.anInt53) {
				local86 += (int) (Math.random() * 10.0D) - 5;
				local84 += (int) (Math.random() * 10.0D) - 5;
				Static567.anInt7671 = local86;
				Static556.anInt9488 = local84;
			} else if (Static453.anInt8318 == -1 || Static288.anInt5499 == -1) {
				Static461.aClass6_Sub4_Sub12_2.method5809(local82, Static461.aClass6_Sub4_Sub12_2.anInt6889 >> 14 & 0x3FFF, Static461.aClass6_Sub4_Sub12_2.anInt6889 & 0x3FFF);
				Static556.anInt9488 = local82[1] - Static461.anInt57;
				Static567.anInt7671 = local82[2] - Static461.anInt58;
			} else {
				Static461.aClass6_Sub4_Sub12_2.method5809(local82, Static453.anInt8318, Static288.anInt5499);
				if (local82 != null) {
					Static567.anInt7671 = local82[2] - Static461.anInt58;
					Static556.anInt9488 = local82[1] - Static461.anInt57;
				}
				Static349.aBoolean508 = false;
				Static288.anInt5499 = -1;
				Static453.anInt8318 = -1;
			}
			if (Static461.aClass6_Sub4_Sub12_2.anInt6901 == 37) {
				Static461.aFloat3 = 3.0F;
				Static461.aFloat4 = 3.0F;
			} else if (Static461.aClass6_Sub4_Sub12_2.anInt6901 == 50) {
				Static461.aFloat3 = 4.0F;
				Static461.aFloat4 = 4.0F;
			} else if (Static461.aClass6_Sub4_Sub12_2.anInt6901 == 75) {
				Static461.aFloat3 = 6.0F;
				Static461.aFloat4 = 6.0F;
			} else if (Static461.aClass6_Sub4_Sub12_2.anInt6901 == 100) {
				Static461.aFloat3 = 8.0F;
				Static461.aFloat4 = 8.0F;
			} else if (Static461.aClass6_Sub4_Sub12_2.anInt6901 == 200) {
				Static461.aFloat3 = 16.0F;
				Static461.aFloat4 = 16.0F;
			} else {
				Static461.aFloat3 = 8.0F;
				Static461.aFloat4 = 8.0F;
			}
			Static461.anInt48 = (int) Static461.aFloat3 >> 1;
			Static461.aByteArrayArrayArray2 = Static384.method6056(Static461.anInt48);
			Static41.method1128();
			Static461.method90();
			Static305.aClass211_44 = new Class211();
			Static461.anInt47 += (int) (Math.random() * 5.0D) - 2;
			if (Static461.anInt47 < -8) {
				Static461.anInt47 = -8;
			}
			if (Static461.anInt47 > 8) {
				Static461.anInt47 = 8;
			}
			Static461.anInt49 += (int) (Math.random() * 5.0D) - 2;
			if (Static461.anInt49 < -16) {
				Static461.anInt49 = -16;
			}
			if (Static461.anInt49 > 16) {
				Static461.anInt49 = 16;
			}
			Static461.method104(arg1, Static461.anInt47 >> 2 << 10, Static461.anInt49 >> 1);
			Static461.aClass42_2.method1149(256, 1024);
			Static461.aClass226_2.method5642(256, 256);
			Static461.aClass57_2.method1472(4096);
			Static177.aClass171_1.method4467(256);
			Static297.anInt4703 = 20;
		} else if (Static297.anInt4703 == 20) {
			Static144.method2663(true);
			Static461.method84(arg0, Static461.anInt47, Static461.anInt49);
			Static297.anInt4703 = 60;
			Static144.method2663(true);
			Static349.method5693();
		} else if (Static297.anInt4703 == 60) {
			if (Static461.aClass168_2.method4429(Static461.aClass6_Sub4_Sub12_2.aString78 + "_staticelements")) {
				if (!Static461.aClass168_2.method4437(Static461.aClass6_Sub4_Sub12_2.aString78 + "_staticelements")) {
					return;
				}
				Static461.aClass183_2 = Static554.method7902(Static156.aBoolean272, Static461.aClass168_2, Static461.aClass6_Sub4_Sub12_2.aString78 + "_staticelements");
			} else {
				Static461.aClass183_2 = new Class183(0);
			}
			Static461.method93();
			Static297.anInt4703 = 70;
			Static144.method2663(true);
			Static349.method5693();
		} else if (Static297.anInt4703 == 70) {
			Static552.aClass269_11 = new Class269(arg0, 11, true, Static38.aCanvas4);
			Static297.anInt4703 = 73;
			Static144.method2663(true);
			Static349.method5693();
		} else if (Static297.anInt4703 == 73) {
			Static30.aClass269_3 = new Class269(arg0, 12, true, Static38.aCanvas4);
			Static297.anInt4703 = 76;
			Static144.method2663(true);
			Static349.method5693();
		} else if (Static297.anInt4703 == 76) {
			Static562.aClass269_13 = new Class269(arg0, 14, true, Static38.aCanvas4);
			Static297.anInt4703 = 79;
			Static144.method2663(true);
			Static349.method5693();
		} else if (Static297.anInt4703 == 79) {
			Static134.aClass269_12 = new Class269(arg0, 17, true, Static38.aCanvas4);
			Static297.anInt4703 = 82;
			Static144.method2663(true);
			Static349.method5693();
		} else if (Static297.anInt4703 == 82) {
			Static387.aClass269_9 = new Class269(arg0, 19, true, Static38.aCanvas4);
			Static297.anInt4703 = 85;
			Static144.method2663(true);
			Static349.method5693();
		} else if (Static297.anInt4703 == 85) {
			Static101.aClass269_4 = new Class269(arg0, 22, true, Static38.aCanvas4);
			Static297.anInt4703 = 88;
			Static144.method2663(true);
			Static349.method5693();
		} else if (Static297.anInt4703 == 88) {
			Static303.aClass269_8 = new Class269(arg0, 26, true, Static38.aCanvas4);
			Static297.anInt4703 = 91;
			Static144.method2663(true);
			Static349.method5693();
		} else {
			Static288.aClass269_7 = new Class269(arg0, 30, true, Static38.aCanvas4);
			Static297.anInt4703 = 100;
			Static144.method2663(true);
			Static349.method5693();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B[B)Ljava/lang/String;")
	public static String method2925(@OriginalArg(1) byte[] arg0) {
		@Pc(16) int local16 = arg0.length;
		@Pc(19) char[] local19 = new char[local16];
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local16; local23++) {
			@Pc(31) int local31 = arg0[local23] & 0xFF;
			if (local31 < 128) {
				local19[local21++] = (char) local31;
			} else if (local31 >= 194) {
				@Pc(85) int local85;
				if (local31 >= 224) {
					if (local31 >= 240) {
						if (local31 < 244) {
							throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
						}
						throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local31);
					}
					if (local23 + 2 >= local16) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local23++;
					local85 = arg0[local23] & 0xFF;
					if (local85 >= 128 && local85 <= 191) {
						local23++;
						@Pc(105) int local105 = arg0[local23] & 0xFF;
						if (local105 >= 128 && local105 <= 191) {
							local19[local21++] = (char) ((local85 & 0xFFFFFF7F) << 6 | (local31 & 0xFFFFFF1F) << 12 | local105 & 0xFFFFFF7F);
							continue;
						}
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
				} else if (local23 + 1 < local16) {
					local23++;
					local85 = arg0[local23] & 0xFF;
					if (local85 < 128 || local85 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local19[local21++] = (char) (local85 & 0xFFFFFF7F | (local31 & 0xFFFFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local31);
			}
		}
		return new String(local19, 0, local21);
	}
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_109 = new Class25(79, -1);

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_110 = new Class25(45, 15);

	@OriginalMember(owner = "client!wn", name = "v", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_125 = new Class186(1, 4);

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
	public static void method5632() {
		if (Static8.aClass173_Sub1_1.method3974(Static155.anInt2774) != 2) {
			return;
		}
		@Pc(25) byte local25 = (byte) (Static75.anInt1503 - 4 & 0xFF);
		@Pc(29) int local29 = Static75.anInt1503 % Static84.anInt1632;
		@Pc(35) int local35;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			for (local35 = 0; local35 < Static261.anInt4480; local35++) {
				Static193.aByteArrayArrayArray4[local31][local29][local35] = local25;
			}
		}
		if (Static4.anInt30 == 3) {
			return;
		}
		for (local35 = 0; local35 < 2; local35++) {
			Static23.anIntArray32[local35] = -1000000;
			Static97.anIntArray189[local35] = 1000000;
			Static10.anIntArray567[local35] = 0;
			Static375.anIntArray546[local35] = 1000000;
			Static243.anIntArray371[local35] = 0;
		}
		@Pc(102) int local102;
		if (Static9.anInt164 != 1) {
			local102 = Static165.method2689(Static32.anInt521, Static4.anInt30, Static214.anInt3730);
			if (local102 - Static354.anInt5973 < 800 && (Static179.aByteArrayArrayArray3[Static4.anInt30][Static32.anInt521 >> 7][Static214.anInt3730 >> 7] & 0x4) != 0) {
				Static252.method3889(Static30.aClass189ArrayArrayArray2, Static214.anInt3730 >> 7, 1, Static32.anInt521 >> 7, false);
				return;
			}
			return;
		}
		if ((Static179.aByteArrayArrayArray3[Static4.anInt30][Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 >> 7][Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 >> 7] & 0x4) != 0) {
			Static252.method3889(Static30.aClass189ArrayArrayArray2, Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 >> 7, 0, Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 >> 7, false);
		}
		if (Static303.anInt4990 >= 2560) {
			return;
		}
		local102 = Static32.anInt521 >> 7;
		@Pc(178) int local178 = Static214.anInt3730 >> 7;
		@Pc(183) int local183 = Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 >> 7;
		@Pc(188) int local188 = Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 >> 7;
		@Pc(195) int local195;
		if (local102 >= local183) {
			local195 = local102 - local183;
		} else {
			local195 = local183 - local102;
		}
		@Pc(210) int local210;
		if (local178 < local188) {
			local210 = local188 - local178;
		} else {
			local210 = local178 - local188;
		}
		if (local195 == 0 && local210 == 0 || -Static84.anInt1632 >= local195 || Static84.anInt1632 <= local195 || local210 <= -Static261.anInt4480 || local210 >= Static261.anInt4480) {
			Static40.method799(null, "RC: " + local102 + "," + local178 + " " + local183 + "," + local188 + " " + Static206.anInt3592 + "," + Static99.anInt1814);
			return;
		}
		@Pc(282) int local282;
		@Pc(284) int local284;
		if (local195 <= local210) {
			local282 = local195 * 65536 / local210;
			local284 = 32768;
			while (local178 != local188) {
				if (local178 < local188) {
					local178++;
				} else if (local178 > local188) {
					local178--;
				}
				if ((Static179.aByteArrayArrayArray3[Static4.anInt30][local102][local178] & 0x4) != 0) {
					Static252.method3889(Static30.aClass189ArrayArrayArray2, local178, 1, local102, false);
					return;
				}
				local284 += local282;
				if (local284 >= 65536) {
					if (local183 > local102) {
						local102++;
					} else if (local183 < local102) {
						local102--;
					}
					local284 -= 65536;
					if ((Static179.aByteArrayArrayArray3[Static4.anInt30][local102][local178] & 0x4) != 0) {
						Static252.method3889(Static30.aClass189ArrayArrayArray2, local178, 1, local102, false);
						return;
					}
				}
			}
			return;
		}
		local282 = local210 * 65536 / local195;
		local284 = 32768;
		while (local183 != local102) {
			if (local183 > local102) {
				local102++;
			} else if (local102 > local183) {
				local102--;
			}
			if ((Static179.aByteArrayArrayArray3[Static4.anInt30][local102][local178] & 0x4) != 0) {
				Static252.method3889(Static30.aClass189ArrayArrayArray2, local178, 1, local102, false);
				return;
			}
			local284 += local282;
			if (local284 >= 65536) {
				local284 -= 65536;
				if (local188 > local178) {
					local178++;
				} else if (local178 > local188) {
					local178--;
				}
				if ((Static179.aByteArrayArrayArray3[Static4.anInt30][local102][local178] & 0x4) != 0) {
					Static252.method3889(Static30.aClass189ArrayArrayArray2, local178, 1, local102, false);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V")
	public static void method5635() {
		Static278.anInt4731 = -1;
		Static58.anInt1221 = -1;
		Static451.anInt6251 = -1;
		Static392.anInt6523 = 0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!bl;ILjava/lang/String;I)Lclient!an;")
	public static Class13 method5636(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static297.anIntArray447, 0);
		if (Static297.anIntArray447[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class13(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}

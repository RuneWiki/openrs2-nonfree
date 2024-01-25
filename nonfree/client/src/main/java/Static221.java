import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!mo", name = "Q", descriptor = "I")
	public static int anInt4100;

	@OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
	public static int anInt4102 = 0;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)I")
	public static int method3731() {
		@Pc(7) Class82 local7 = Static304.aClass82_4;
		@Pc(9) boolean local9 = false;
		if (Static123.anInt2363 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local7 = Static189.method4473(local15, 0, null, 0, null);
			local9 = true;
		}
		@Pc(34) long local34 = Static51.method979();
		for (@Pc(41) int local41 = 0; local41 < 10000; local41++) {
			local7.method4505();
		}
		@Pc(66) int local66 = (int) (Static51.method979() - local34);
		local7.method4486(100, 100, 0, -16777216, 0);
		if (local9) {
			local7.method4553();
		}
		return local66;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)V")
	public static void method3732() {
		if (Static292.method4434() != 2) {
			return;
		}
		@Pc(23) byte local23 = (byte) (Static47.anInt936 - 4 & 0xFF);
		@Pc(27) int local27 = Static47.anInt936 % Static392.anInt6751;
		@Pc(33) int local33;
		for (@Pc(29) int local29 = 0; local29 < 4; local29++) {
			for (local33 = 0; local33 < Static307.anInt5484; local33++) {
				Static75.aByteArrayArrayArray5[local29][local27][local33] = local23;
			}
		}
		if (Static331.anInt5804 == 3) {
			return;
		}
		for (local33 = 0; local33 < 2; local33++) {
			Static227.anIntArray515[local33] = -1000000;
			Static323.anIntArray696[local33] = 1000000;
			Static186.anIntArray763[local33] = 0;
			Static305.anIntArray250[local33] = 1000000;
			Static54.anIntArray149[local33] = 0;
		}
		@Pc(92) int local92;
		if (Static283.anInt5017 != 1) {
			local92 = Static18.method508(Static22.anInt547, Static331.anInt5804, Static160.anInt2915);
			if (local92 - Static71.anInt1354 < 800 && (Static244.aByteArrayArrayArray4[Static331.anInt5804][Static160.anInt2915 >> 7][Static22.anInt547 >> 7] & 0x4) != 0) {
				Static149.method2529(false, 1, Static297.aClass227ArrayArrayArray7, Static160.anInt2915 >> 7, Static22.anInt547 >> 7);
				return;
			}
			return;
		}
		if ((Static244.aByteArrayArrayArray4[Static331.anInt5804][Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 >> 7][Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 >> 7] & 0x4) != 0) {
			Static149.method2529(false, 0, Static297.aClass227ArrayArrayArray7, Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 >> 7, Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 >> 7);
		}
		if (Static278.anInt1556 >= 2560) {
			return;
		}
		local92 = Static160.anInt2915 >> 7;
		@Pc(174) int local174 = Static22.anInt547 >> 7;
		@Pc(179) int local179 = Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 >> 7;
		@Pc(184) int local184 = Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 >> 7;
		@Pc(192) int local192;
		if (local92 < local179) {
			local192 = local179 - local92;
		} else {
			local192 = local92 - local179;
		}
		@Pc(206) int local206;
		if (local174 < local184) {
			local206 = local184 - local174;
		} else {
			local206 = local174 - local184;
		}
		if (local192 == 0 && local206 == 0 || -Static392.anInt6751 >= local192 || Static392.anInt6751 <= local192 || local206 <= -Static307.anInt5484 || local206 >= Static307.anInt5484) {
			Static235.method3843("RC: " + local92 + "," + local174 + " " + local179 + "," + local184 + " " + Static376.anInt6607 + "," + Static133.anInt2474, null);
			return;
		}
		@Pc(281) int local281;
		@Pc(283) int local283;
		if (local206 >= local192) {
			local281 = local192 * 65536 / local206;
			local283 = 32768;
			while (local184 != local174) {
				if (local174 < local184) {
					local174++;
				} else if (local174 > local184) {
					local174--;
				}
				if ((Static244.aByteArrayArrayArray4[Static331.anInt5804][local92][local174] & 0x4) != 0) {
					Static149.method2529(false, 1, Static297.aClass227ArrayArrayArray7, local92, local174);
					return;
				}
				local283 += local281;
				if (local283 >= 65536) {
					local283 -= 65536;
					if (local92 < local179) {
						local92++;
					} else if (local179 < local92) {
						local92--;
					}
					if ((Static244.aByteArrayArrayArray4[Static331.anInt5804][local92][local174] & 0x4) != 0) {
						Static149.method2529(false, 1, Static297.aClass227ArrayArrayArray7, local92, local174);
						return;
					}
				}
			}
			return;
		}
		local281 = local206 * 65536 / local192;
		local283 = 32768;
		while (local92 != local179) {
			if (local179 > local92) {
				local92++;
			} else if (local92 > local179) {
				local92--;
			}
			if ((Static244.aByteArrayArrayArray4[Static331.anInt5804][local92][local174] & 0x4) != 0) {
				Static149.method2529(false, 1, Static297.aClass227ArrayArrayArray7, local92, local174);
				return;
			}
			local283 += local281;
			if (local283 >= 65536) {
				local283 -= 65536;
				if (local174 < local184) {
					local174++;
				} else if (local184 < local174) {
					local174--;
				}
				if ((Static244.aByteArrayArrayArray4[Static331.anInt5804][local92][local174] & 0x4) != 0) {
					Static149.method2529(false, 1, Static297.aClass227ArrayArrayArray7, local92, local174);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(III)Lclient!we;")
	public static Class12_Sub4 method3733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static297.aClass227ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass12_Sub4_3;
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)V")
	public static void method3734() {
		Static115.method2164();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static190.aClass239Array1[local8].method5561();
		}
		Static383.method5696();
		Static382.method5683();
		System.gc();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B[[I)V")
	public static void method3735(@OriginalArg(1) int[][] arg0) {
		Static267.anIntArrayArray38 = arg0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZZ)V")
	public static void method3736() {
		Static19.method552(Static375.aClass41_128);
		for (@Pc(17) Class2_Sub41 local17 = (Class2_Sub41) Static362.aClass214_32.method5060(); local17 != null; local17 = (Class2_Sub41) Static362.aClass214_32.method5064()) {
			if (!local17.method5744()) {
				local17 = (Class2_Sub41) Static362.aClass214_32.method5060();
				if (local17 == null) {
					break;
				}
			}
			if (local17.anInt6413 == 0) {
				Static303.method4757(local17, true, true);
			}
		}
		if (Static307.aClass155_31 != null) {
			Static295.method4664(Static307.aClass155_31);
			Static307.aClass155_31 = null;
		}
	}
}

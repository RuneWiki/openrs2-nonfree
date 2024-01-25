import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!th", name = "j", descriptor = "[I")
	public static int[] anIntArray530;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)V")
	public static void method5311() {
		Static273.aClass11_117.method215(5);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
	public static void method5312() {
		for (@Pc(8) int local8 = 0; local8 < Static222.anInt4457; local8++) {
			@Pc(14) int local14 = Static116.anIntArray227[local8];
			@Pc(18) Class10_Sub3_Sub3_Sub1 local18 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local14];
			@Pc(22) int local22 = Static30.aClass14_Sub4_Sub2_1.method2548();
			if ((local22 & 0x20) != 0) {
				local22 += Static30.aClass14_Sub4_Sub2_1.method2548() << 8;
			}
			if ((local22 & 0x200) != 0) {
				local18.anInt5936 = Static30.aClass14_Sub4_Sub2_1.method2498();
				local18.anInt5932 = Static30.aClass14_Sub4_Sub2_1.method2498();
			}
			if ((local22 & 0x4) != 0) {
				if (local18.aClass192_1.method5286()) {
					Static261.method3791(local18);
				}
				local18.method4957(Static267.method4561(Static30.aClass14_Sub4_Sub2_1.method2540()));
				local18.method5362(local18.aClass192_1.anInt5798);
				local18.anInt5922 = local18.aClass192_1.anInt5784 << 3;
				if (local18.aClass192_1.method5286()) {
					Static117.method4693(local18.anIntArray535[0], null, Static219.anInt4400, 0, local18, null, local18.anIntArray536[0]);
				}
			}
			@Pc(113) int local113;
			@Pc(130) int local130;
			if ((local22 & 0x400) != 0) {
				local113 = Static30.aClass14_Sub4_Sub2_1.method2548();
				@Pc(116) int[] local116 = new int[local113];
				@Pc(119) int[] local119 = new int[local113];
				@Pc(122) int[] local122 = new int[local113];
				for (@Pc(124) int local124 = 0; local124 < local113; local124++) {
					local130 = Static30.aClass14_Sub4_Sub2_1.method2540();
					if (local130 == 65535) {
						local130 = -1;
					}
					local116[local124] = local130;
					local119[local124] = Static30.aClass14_Sub4_Sub2_1.method2548();
					local122[local124] = Static30.aClass14_Sub4_Sub2_1.method2505();
				}
				Static155.method3054(local119, local122, local116, local18);
			}
			if ((local22 & 0x80) != 0) {
				local18.anInt5921 = Static30.aClass14_Sub4_Sub2_1.method2499();
				if (local18.anInt5921 == 65535) {
					local18.anInt5921 = -1;
				}
			}
			@Pc(198) int local198;
			if ((local22 & 0x10) != 0) {
				local113 = Static30.aClass14_Sub4_Sub2_1.method2540();
				if (local113 == 65535) {
					local113 = -1;
				}
				local198 = Static30.aClass14_Sub4_Sub2_1.method2552();
				@Pc(200) boolean local200 = true;
				@Pc(271) Class79 local271;
				if (local113 != -1 && local18.anInt5957 != -1) {
					@Pc(220) Class78 local220;
					if (local18.anInt5957 == local113) {
						local220 = Static76.method1908(local113);
						if (local220.aBoolean161 && local220.anInt2302 != -1) {
							local271 = Static233.method4080(local220.anInt2302);
							local130 = local271.anInt2361;
							if (local130 == 0) {
								local200 = false;
							} else if (local130 == 1) {
								local200 = true;
							} else if (local130 == 2) {
								local18.anInt5945 = 0;
								local200 = false;
							}
						}
					} else {
						local220 = Static76.method1908(local113);
						@Pc(225) Class78 local225 = Static76.method1908(local18.anInt5957);
						if (local220.anInt2302 != -1 && local225.anInt2302 != -1) {
							@Pc(240) Class79 local240 = Static233.method4080(local220.anInt2302);
							@Pc(245) Class79 local245 = Static233.method4080(local225.anInt2302);
							if (local240.anInt2357 < local245.anInt2357) {
								local200 = false;
							}
						}
					}
				}
				if (local200) {
					local18.anInt5952 = 0;
					local18.anInt5953 = 1;
					local18.anInt5917 = local198 >> 16;
					local18.anInt5969 = Static153.anInt3257 + (local198 & 0xFFFF);
					local18.anInt5962 = 0;
					local18.anInt5957 = local113;
					if (local18.anInt5969 > Static153.anInt3257) {
						local18.anInt5962 = -1;
					}
					if (local18.anInt5957 != -1 && Static153.anInt3257 == local18.anInt5969) {
						@Pc(346) int local346 = Static76.method1908(local18.anInt5957).anInt2302;
						if (local346 != -1) {
							local271 = Static233.method4080(local346);
							if (local271 != null && local271.anIntArray217 != null) {
								Static273.method4631(local18.anInt5908, 0, local18.anInt5910, false, local271);
							}
						}
					}
				}
			}
			if ((local22 & 0x40) != 0) {
				local113 = Static30.aClass14_Sub4_Sub2_1.method2525();
				local198 = Static30.aClass14_Sub4_Sub2_1.method2548();
				local18.method5365(local198, Static153.anInt3257, local113);
			}
			if ((local22 & 0x2) != 0) {
				local18.aString223 = Static30.aClass14_Sub4_Sub2_1.method2496();
				local18.anInt5934 = 100;
			}
			if ((local22 & 0x1) != 0) {
				local113 = Static30.aClass14_Sub4_Sub2_1.method2525();
				local198 = Static30.aClass14_Sub4_Sub2_1.method2548();
				local18.method5365(local198, Static153.anInt3257, local113);
				local18.anInt5949 = Static153.anInt3257 + 300;
				local18.anInt5967 = Static30.aClass14_Sub4_Sub2_1.method2513();
			}
			if ((local22 & 0x100) != 0) {
				local113 = Static30.aClass14_Sub4_Sub2_1.method2505();
				local18.anInt5914 = Static30.aClass14_Sub4_Sub2_1.method2511();
				local18.anInt5943 = Static30.aClass14_Sub4_Sub2_1.method2511();
				local18.aBoolean416 = (local113 & 0x8000) != 0;
				local18.anInt5970 = local113 & 0x7FFF;
				local18.anInt5912 = local18.anInt5970 + Static153.anInt3257 + local18.anInt5914;
			}
			if ((local22 & 0x8) != 0) {
				local113 = Static30.aClass14_Sub4_Sub2_1.method2505();
				if (local113 == 65535) {
					local113 = -1;
				}
				local198 = Static30.aClass14_Sub4_Sub2_1.method2539();
				Static348.method4754(local113, local18, local198);
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	public static void method5313() {
		Static308.aClass11_96.method214();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ap;B)[Lclient!wa;")
	public static Class210[] method5315(@OriginalArg(0) Class15 arg0) {
		if (!arg0.method286()) {
			return new Class210[0];
		}
		@Pc(16) Class205 local16 = arg0.method279();
		while (local16.anInt6370 == 0) {
			Static15.method5425(10L);
		}
		if (local16.anInt6370 == 2) {
			return new Class210[0];
		}
		@Pc(41) int[] local41 = (int[]) local16.anObject7;
		@Pc(47) Class210[] local47 = new Class210[local41.length >> 2];
		for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
			@Pc(55) Class210 local55 = new Class210();
			local47[local49] = local55;
			local55.anInt6532 = local41[local49 << 2];
			local55.anInt6535 = local41[(local49 << 2) + 1];
			local55.anInt6536 = local41[(local49 << 2) + 2];
			local55.anInt6531 = local41[(local49 << 2) + 3];
		}
		return local47;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	public static void method5316(@OriginalArg(0) int arg0) {
		@Pc(8) Class14_Sub2_Sub13 local8 = Static1.method5711(4, arg0);
		local8.method3539();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5317(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) long local29 = arg0; local29 != 0L; local29 /= 37L) {
				local27++;
			}
			@Pc(45) StringBuffer local45 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(49) long local49 = arg0;
				arg0 /= 37L;
				local45.append(Static137.aCharArray1[(int) (local49 - arg0 * 37L)]);
			}
			return local45.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)Z")
	public static boolean method5318() {
		try {
			return Static125.method2603();
		} catch (@Pc(15) IOException local15) {
			Static48.method1176();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(60) String local60 = "T2 - " + Static116.anInt2565 + "," + Static1.anInt6422 + "," + Static28.anInt657 + " - " + Static327.anInt6307 + "," + (Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0] + Static151.anInt3234) + "," + (Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0] + Static251.anInt3170) + " - ";
			for (@Pc(62) int local62 = 0; local62 < Static327.anInt6307 && local62 < 50; local62++) {
				local60 = local60 + Static30.aClass14_Sub4_Sub2_1.aByteArray74[local62] + ",";
			}
			Static47.method1149(local20, local60);
			Static198.method3705();
			return true;
		}
	}
}

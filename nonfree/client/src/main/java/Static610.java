import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!vo", name = "L", descriptor = "[I")
	public static int[] anIntArray611;

	@OriginalMember(owner = "client!vo", name = "J", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_145 = new Class218(64, 2);

	@OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
	public static int anInt10092 = 0;

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(II)V")
	public static void method8288(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub1_Sub21 local15 = Static57.method8561(arg0, 2);
		local15.method8628();
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(B)V")
	public static void method8289() {
		for (@Pc(6) Class3_Sub25 local6 = (Class3_Sub25) Static598.aClass276_62.method6907(); local6 != null; local6 = (Class3_Sub25) Static598.aClass276_62.method6912()) {
			if (local6.aBoolean402) {
				local6.method3944();
			}
		}
		for (@Pc(38) Class3_Sub25 local38 = (Class3_Sub25) Static342.aClass276_43.method6907(); local38 != null; local38 = (Class3_Sub25) Static342.aClass276_43.method6912()) {
			if (local38.aBoolean402) {
				local38.method3944();
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIZI)V")
	public static void method8290(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (!arg2 && Static472.anInt6106 == arg3 && arg0 == Static79.anInt1964 && (Static630.anInt10396 == Static552.anInt9440 || Static552.aClass3_Sub48_30.aClass23_Sub14_1.method4252() == 1)) {
			return;
		}
		Static472.anInt6106 = arg3;
		Static630.anInt10396 = Static552.anInt9440;
		Static79.anInt1964 = arg0;
		if (Static552.aClass3_Sub48_30.aClass23_Sub14_1.method4252() == 1) {
			Static630.anInt10396 = 0;
		}
		Static182.method3694(arg1);
		Static646.method8660(true, Static424.aClass315_16, Static47.aClass33_3, Static528.aClass25_7, Static287.aClass176_12.method4986(Static380.anInt7247));
		@Pc(64) int local64 = Static446.anInt8090;
		@Pc(66) int local66 = Static124.anInt3150;
		Static446.anInt8090 = (Static472.anInt6106 - (Static394.anInt7540 >> 4)) * 8;
		Static124.anInt3150 = (Static79.anInt1964 - (Static462.anInt8391 >> 4)) * 8;
		Static492.aClass3_Sub1_Sub16_3 = Static361.method2167(Static472.anInt6106 * 8, Static79.anInt1964 * 8);
		Static236.aClass57_3 = null;
		@Pc(99) int local99 = Static446.anInt8090 - local64;
		@Pc(104) int local104 = Static124.anInt3150 - local66;
		@Pc(111) int local111;
		@Pc(124) int local124;
		@Pc(251) int local251;
		@Pc(186) int local186;
		if (arg1 == 11) {
			for (local111 = 0; local111 < Static234.anInt5314; local111++) {
				@Pc(117) Class3_Sub49 local117 = Static482.aClass3_Sub49Array1[local111];
				if (local117 != null) {
					@Pc(122) Class2_Sub3_Sub1_Sub2_Sub1 local122 = local117.aClass2_Sub3_Sub1_Sub2_Sub1_2;
					for (local124 = 0; local124 < 10; local124++) {
						local122.anIntArray378[local124] -= local99;
						local122.anIntArray377[local124] -= local104;
					}
					local122.anInt10424 -= local104 * 512;
					local122.anInt10428 -= local99 * 512;
				}
			}
		} else {
			@Pc(172) boolean local172 = false;
			Static377.anInt7132 = 0;
			@Pc(180) int local180 = (Static394.anInt7540 - 1) * 512;
			local186 = Static462.anInt8391 * 512 - 512;
			for (local124 = 0; local124 < Static234.anInt5314; local124++) {
				@Pc(194) Class3_Sub49 local194 = Static482.aClass3_Sub49Array1[local124];
				if (local194 != null) {
					@Pc(199) Class2_Sub3_Sub1_Sub2_Sub1 local199 = local194.aClass2_Sub3_Sub1_Sub2_Sub1_2;
					local199.anInt10428 -= local99 * 512;
					local199.anInt10424 -= local104 * 512;
					if (local199.anInt10428 >= 0 && local199.anInt10428 <= local180 && local199.anInt10424 >= 0 && local199.anInt10424 <= local186) {
						@Pc(249) boolean local249 = true;
						for (local251 = 0; local251 < 10; local251++) {
							local199.anIntArray378[local251] -= local99;
							local199.anIntArray377[local251] -= local104;
							if (local199.anIntArray378[local251] < 0 || Static394.anInt7540 <= local199.anIntArray378[local251] || local199.anIntArray377[local251] < 0 || Static462.anInt8391 <= local199.anIntArray377[local251]) {
								local249 = false;
							}
						}
						if (local249) {
							Static176.anIntArray229[Static377.anInt7132++] = local199.anInt6289;
						} else {
							local199.method2679(null);
							local194.method8671();
							local172 = true;
						}
					} else {
						local199.method2679(null);
						local172 = true;
						local194.method8671();
					}
				}
			}
			if (local172) {
				Static234.anInt5314 = Static60.aClass307_6.method7420();
				Static60.aClass307_6.method7426(Static482.aClass3_Sub49Array1);
			}
		}
		for (local111 = 0; local111 < 2048; local111++) {
			@Pc(346) Class2_Sub3_Sub1_Sub2_Sub2 local346 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local111];
			if (local346 != null) {
				for (local186 = 0; local186 < 10; local186++) {
					local346.anIntArray378[local186] -= local99;
					local346.anIntArray377[local186] -= local104;
				}
				local346.anInt10428 -= local99 * 512;
				local346.anInt10424 -= local104 * 512;
			}
		}
		@Pc(398) Class369[] local398 = Static253.aClass369Array1;
		for (local186 = 0; local186 < local398.length; local186++) {
			@Pc(406) Class369 local406 = local398[local186];
			if (local406 != null) {
				local406.anInt10341 -= local99 * 512;
				local406.anInt10342 -= local104 * 512;
			}
		}
		for (@Pc(438) Class3_Sub38 local438 = (Class3_Sub38) Static165.aClass276_29.method6907(); local438 != null; local438 = (Class3_Sub38) Static165.aClass276_29.method6912()) {
			local438.anInt8088 -= local104;
			local438.anInt8095 -= local99;
			if (Static631.anInt10399 != 4 && (local438.anInt8095 < 0 || local438.anInt8088 < 0 || local438.anInt8095 >= Static394.anInt7540 || local438.anInt8088 >= Static462.anInt8391)) {
				local438.method8671();
			}
		}
		if (Static631.anInt10399 != 4) {
			for (@Pc(503) Class3_Sub46 local503 = (Class3_Sub46) Static644.aClass307_55.method7421(); local503 != null; local503 = (Class3_Sub46) Static644.aClass307_55.method7428()) {
				@Pc(511) int local511 = (int) (local503.aLong277 & 0x3FFFL);
				@Pc(516) int local516 = local511 - Static446.anInt8090;
				local251 = (int) (local503.aLong277 >> 14 & 0x3FFFL);
				@Pc(528) int local528 = local251 - Static124.anInt3150;
				if (local516 < 0 || local528 < 0 || Static394.anInt7540 <= local516 || Static462.anInt8391 <= local528) {
					local503.method8671();
				}
			}
		}
		if (Static326.anInt6537 != 0) {
			Static326.anInt6537 -= local99;
			Static29.anInt565 -= local104;
		}
		Static278.method6286();
		if (arg1 != 11) {
			Static66.anInt1410 -= local104;
			Static289.anInt5908 -= local104 * 512;
			Static493.anInt8769 -= local99;
			Static184.anInt4365 -= local104;
			Static227.anInt5145 -= local99;
			Static465.anInt8425 -= local99 * 512;
			if (Math.abs(local99) > Static394.anInt7540 || Math.abs(local104) > Static462.anInt8391) {
				Static34.method625();
			}
		} else if (Static516.anInt9019 == 4) {
			Static77.anInt3996 -= local104 * 512;
			Static89.anInt2312 -= local99 * 512;
			Static149.anInt3681 -= local104 * 512;
			Static242.anInt5467 -= local99 * 512;
		} else {
			Static155.anInt3810 = -1;
			Static531.anInt9157 = -1;
			Static516.anInt9019 = 1;
		}
		Static164.method7296();
		Static603.method8219();
		Static239.aClass276_36.method6910();
		Static267.aClass276_38.method6910();
		Static159.aClass375_4.method8637();
		Static175.method3576();
	}

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "(II)I")
	public static int method8293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static256.aByteArrayArray10 == null ? 0 : Static256.aByteArrayArray10[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BII)V")
	public static void method8294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub1_Sub21 local13 = Static57.method8561(arg0, 14);
		local13.method8631();
		local13.anInt10489 = arg1;
	}
}

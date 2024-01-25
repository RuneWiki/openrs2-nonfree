import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "Lclient!fk;")
	public static Class81 aClass81_1;

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "Lclient!rs;")
	public static Class225 aClass225_1 = new Class225(8);

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
	public static int anInt826 = 0;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
	public static void method681() {
		aClass225_1 = new Class225(8);
		Static364.anInt6038 = 0;
		for (@Pc(17) Class20_Sub3 local17 = (Class20_Sub3) Static73.aClass248_3.method5583(); local17 != null; local17 = (Class20_Sub3) Static73.aClass248_3.method5577()) {
			local17.method2124();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!bf;IIIII)V")
	public static void method682(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub3_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static176.method2475(arg1.anInt7339, arg2, arg3, arg0, 0, arg1.aByte99, arg1.anInt7343);
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
	public static void method683() {
		if (Static330.anInt5369 <= 0) {
			Static406.aString70 = "";
			return;
		}
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static307.aStringArray35.length; local11++) {
			if (Static307.aStringArray35[local11].startsWith("--> ")) {
				local9++;
				if (local9 == Static330.anInt5369) {
					Static406.aString70 = Static307.aStringArray35[local11].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIZIFIII)[[I")
	public static int[][] method687(@OriginalArg(5) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class4_Sub4_Sub10 local13 = new Class4_Sub4_Sub10();
		local13.anInt2083 = (int) (arg0 * 4096.0F);
		local13.aBoolean144 = false;
		local13.anInt2073 = 8;
		local13.anInt2084 = 3;
		local13.anInt2077 = 4;
		local13.method6038();
		Static409.method5559(256, 64);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method1656(local40, local9[local40]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!pc;BLclient!fh;)V")
	public static void method688(@OriginalArg(0) int arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(3) Class4_Sub9 arg2) {
		@Pc(9) Class4_Sub41 local9 = new Class4_Sub41();
		local9.anInt7077 = arg2.method5007();
		local9.anInt7079 = arg2.method4997();
		local9.aByteArrayArrayArray17 = new byte[local9.anInt7077][][];
		local9.anIntArray535 = new int[local9.anInt7077];
		local9.aClass45Array1 = new Class45[local9.anInt7077];
		local9.aClass45Array2 = new Class45[local9.anInt7077];
		local9.anIntArray533 = new int[local9.anInt7077];
		local9.anIntArray534 = new int[local9.anInt7077];
		for (@Pc(65) int local65 = 0; local65 < local9.anInt7077; local65++) {
			try {
				@Pc(71) int local71 = arg2.method5007();
				@Pc(90) String local90;
				@Pc(94) String local94;
				@Pc(96) int local96;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local90 = arg2.method5038();
					local94 = arg2.method5038();
					local96 = 0;
					if (local71 == 1) {
						local96 = arg2.method4997();
					}
					local9.anIntArray535[local65] = local71;
					local9.anIntArray534[local65] = local96;
					local9.aClass45Array1[local65] = arg1.method3911(local94, Static261.method3388(local90));
				} else if (local71 == 3 || local71 == 4) {
					local90 = arg2.method5038();
					local94 = arg2.method5038();
					local96 = arg2.method5007();
					@Pc(147) String[] local147 = new String[local96];
					for (@Pc(149) int local149 = 0; local149 < local96; local149++) {
						local147[local149] = arg2.method5038();
					}
					@Pc(168) byte[][] local168 = new byte[local96][];
					@Pc(181) int local181;
					if (local71 == 3) {
						for (@Pc(175) int local175 = 0; local175 < local96; local175++) {
							local181 = arg2.method4997();
							local168[local175] = new byte[local181];
							arg2.method5005(local168[local175], local181);
						}
					}
					local9.anIntArray535[local65] = local71;
					@Pc(210) Class[] local210 = new Class[local96];
					for (local181 = 0; local181 < local96; local181++) {
						local210[local181] = Static261.method3388(local147[local181]);
					}
					local9.aClass45Array2[local65] = arg1.method3902(local210, Static261.method3388(local90), local94);
					local9.aByteArrayArrayArray17[local65] = local168;
				}
			} catch (@Pc(245) ClassNotFoundException local245) {
				local9.anIntArray533[local65] = -1;
			} catch (@Pc(252) SecurityException local252) {
				local9.anIntArray533[local65] = -2;
			} catch (@Pc(259) NullPointerException local259) {
				local9.anIntArray533[local65] = -3;
			} catch (@Pc(266) Exception local266) {
				local9.anIntArray533[local65] = -4;
			} catch (@Pc(273) Throwable local273) {
				local9.anIntArray533[local65] = -5;
			}
		}
		Static298.aClass244_27.method5273(local9);
	}
}

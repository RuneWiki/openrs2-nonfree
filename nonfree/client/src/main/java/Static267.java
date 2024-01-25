import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "Lclient!om;")
	public static Class11_Sub10_Sub4 aClass11_Sub10_Sub4_2;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_90 = new Class117("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "[I")
	public static final int[] anIntArray414 = new int[3];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIII)V")
	public static void method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static319.anInt6196 = arg3;
		Static175.anInt3452 = arg2;
		Static264.anInt5402 = arg1;
		Static24.anInt455 = arg0;
		Static82.anInt1500 = arg4;
		if (Static319.anInt6196 >= 100) {
			@Pc(29) int local29 = Static175.anInt3452 * 128 + 64;
			@Pc(35) int local35 = Static264.anInt5402 * 128 + 64;
			@Pc(44) int local44 = Static168.method2721(local29, Static322.anInt6250, local35) - Static82.anInt1500;
			@Pc(49) int local49 = local29 - Static190.anInt3870;
			@Pc(54) int local54 = local44 - Static86.anInt1541;
			@Pc(59) int local59 = local35 - Static316.anInt6169;
			@Pc(70) int local70 = (int) Math.sqrt((double) (local59 * local59 + local49 * local49));
			Static184.anInt3721 = (int) (Math.atan2((double) local54, (double) local70) * 2607.5945876176133D) & 0x3FFF;
			Static308.anInt6050 = (int) (Math.atan2((double) local49, (double) local59) * -2607.5945876176133D) & 0x3FFF;
			Static157.anInt3004 = 0;
			if (Static184.anInt3721 < 1024) {
				Static184.anInt3721 = 1024;
			}
			if (Static184.anInt3721 > 3072) {
				Static184.anInt3721 = 3072;
			}
		}
		Static81.anInt1498 = 2;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ee;)V")
	public static void method4624(@OriginalArg(0) Class11_Sub5_Sub1 arg0) {
		if (Static219.anInt4457 >= 255) {
			return;
		}
		Static171.aClass11_Sub5_Sub1Array2[Static219.anInt4457] = arg0;
		Static117.aBooleanArray10[Static219.anInt4457] = false;
		Static219.anInt4457++;
		@Pc(18) int local18 = arg0.anInt1306;
		if (arg0.aBoolean82) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt1306;
		if (arg0.aBoolean83) {
			local26 = Static279.anInt5583 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt1286 + 64 - arg0.anInt1289 >> 7;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt1286 + arg0.anInt1289 - 64 >> 7;
			if (local66 >= Static300.anInt5931) {
				local66 = Static300.anInt5931 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray40[local38++];
				@Pc(96) int local96 = (arg0.anInt1285 + 64 - arg0.anInt1289 >> 7) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static232.anInt4703) {
					local104 = Static232.anInt4703 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) int local126 = Static117.anIntArrayArrayArray9[local35][local117][local75];
					if ((local126 & 0xFF) == 0) {
						Static117.anIntArrayArrayArray9[local35][local117][local75] = local126 | Static219.anInt4457;
					} else if ((local126 & 0xFF00) == 0) {
						Static117.anIntArrayArrayArray9[local35][local117][local75] = local126 | Static219.anInt4457 << 8;
					} else if ((local126 & 0xFF0000) == 0) {
						Static117.anIntArrayArrayArray9[local35][local117][local75] = local126 | Static219.anInt4457 << 16;
					} else if ((local126 & 0xFF000000) == 0) {
						Static117.anIntArrayArrayArray9[local35][local117][local75] = local126 | Static219.anInt4457 << 24;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)V")
	public static void method4626() {
		Static261.aClass26_46.method329(5);
	}
}

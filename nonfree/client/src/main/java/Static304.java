import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "Z")
	public static boolean aBoolean404 = true;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
	public static int anInt5810 = -1;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "Lclient!lg;")
	public static Class97 aClass97_23 = null;

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString201 = "yellow:";

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([Ljava/lang/String;ZII)Ljava/lang/String;")
	public static String method4669(@OriginalArg(0) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(20) String local20 = arg0[arg2];
			return local20 == null ? "null" : local20.toString();
		} else {
			@Pc(31) int local31 = arg2 + arg1;
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = arg2; local35 < local31; local35++) {
				@Pc(46) String local46 = arg0[local35];
				if (local46 == null) {
					local33 += 4;
				} else {
					local33 += local46.length();
				}
			}
			@Pc(71) StringBuffer local71 = new StringBuffer(local33);
			for (@Pc(73) int local73 = arg2; local73 < local31; local73++) {
				@Pc(84) String local84 = arg0[local73];
				if (local84 == null) {
					local71.append("null");
				} else {
					local71.append(local84);
				}
			}
			return local71.toString();
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[B)V")
	public static void method4671(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class4_Sub24 local10 = new Class4_Sub24(arg0);
		local10.anInt3822 = arg0.length - 2;
		Static150.anInt2948 = local10.method3085();
		Static99.aByteArrayArray8 = new byte[Static150.anInt2948][];
		Static246.anIntArray386 = new int[Static150.anInt2948];
		Static248.aBooleanArray33 = new boolean[Static150.anInt2948];
		Static95.aByteArrayArray7 = new byte[Static150.anInt2948][];
		Static278.anIntArray422 = new int[Static150.anInt2948];
		Static149.anIntArray238 = new int[Static150.anInt2948];
		Static107.anIntArray188 = new int[Static150.anInt2948];
		local10.anInt3822 = arg0.length - Static150.anInt2948 * 8 - 7;
		Static31.anInt651 = local10.method3085();
		Static161.anInt3300 = local10.method3085();
		@Pc(76) int local76 = (local10.method3110() & 0xFF) + 1;
		@Pc(78) int local78;
		for (local78 = 0; local78 < Static150.anInt2948; local78++) {
			Static149.anIntArray238[local78] = local10.method3085();
		}
		for (local78 = 0; local78 < Static150.anInt2948; local78++) {
			Static278.anIntArray422[local78] = local10.method3085();
		}
		for (local78 = 0; local78 < Static150.anInt2948; local78++) {
			Static107.anIntArray188[local78] = local10.method3085();
		}
		for (local78 = 0; local78 < Static150.anInt2948; local78++) {
			Static246.anIntArray386[local78] = local10.method3085();
		}
		local10.anInt3822 = arg0.length - (local76 - 1) * 3 - Static150.anInt2948 * 8 - 7;
		Static138.anIntArray228 = new int[local76];
		for (local78 = 1; local78 < local76; local78++) {
			Static138.anIntArray228[local78] = local10.method3063();
			if (Static138.anIntArray228[local78] == 0) {
				Static138.anIntArray228[local78] = 1;
			}
		}
		local10.anInt3822 = 0;
		for (local78 = 0; local78 < Static150.anInt2948; local78++) {
			@Pc(211) int local211 = Static107.anIntArray188[local78];
			@Pc(215) int local215 = Static246.anIntArray386[local78];
			@Pc(219) int local219 = local215 * local211;
			@Pc(222) byte[] local222 = new byte[local219];
			Static99.aByteArrayArray8[local78] = local222;
			@Pc(229) byte[] local229 = new byte[local219];
			@Pc(231) boolean local231 = false;
			Static95.aByteArrayArray7[local78] = local229;
			@Pc(239) int local239 = local10.method3110();
			@Pc(245) int local245;
			if ((local239 & 0x1) == 0) {
				for (local245 = 0; local245 < local219; local245++) {
					local222[local245] = local10.method3069();
				}
				if ((local239 & 0x2) != 0) {
					for (local245 = 0; local245 < local219; local245++) {
						@Pc(366) byte local366 = local229[local245] = local10.method3069();
						local231 |= local366 != -1;
					}
				}
			} else {
				local245 = 0;
				label88: while (true) {
					@Pc(254) int local254;
					if (local211 <= local245) {
						if ((local239 & 0x2) == 0) {
							break;
						}
						local245 = 0;
						while (true) {
							if (local245 >= local211) {
								break label88;
							}
							for (local254 = 0; local254 < local215; local254++) {
								@Pc(311) byte local311 = local229[local245 + local211 * local254] = local10.method3069();
								local231 |= local311 != -1;
							}
							local245++;
						}
					}
					for (local254 = 0; local254 < local215; local254++) {
						local222[local211 * local254 + local245] = local10.method3069();
					}
					local245++;
				}
			}
			Static248.aBooleanArray33[local78] = local231;
		}
	}
}

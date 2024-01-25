import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
	public static final int anInt2921 = 50;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "[I")
	public static final int[] anIntArray253 = new int[anInt2921];

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "[I")
	public static final int[] anIntArray254 = new int[anInt2921];

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
	public static int anInt2903 = 0;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_150 = new Class159("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
	public static int anInt2908 = 0;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
	public static int anInt2911 = 0;

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "[I")
	public static final int[] anIntArray256 = new int[anInt2921];

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "[I")
	public static final int[] anIntArray257 = new int[anInt2921];

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "[I")
	public static final int[] anIntArray258 = new int[anInt2921];

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[anInt2921];

	@OriginalMember(owner = "client!ng", name = "S", descriptor = "[I")
	public static final int[] anIntArray259 = new int[anInt2921];

	@OriginalMember(owner = "client!ng", name = "W", descriptor = "I")
	public static int anInt2930 = 0;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;CB)[Ljava/lang/String;")
	public static String[] method2554(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static18.method316(arg1, arg0);
		@Pc(23) String[] local23 = new String[local10 + 1];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local10; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg1 != arg0.charAt(local33); local33++) {
			}
			local23[local25++] = arg0.substring(local27, local33);
			local27 = local33 + 1;
		}
		local23[local10] = arg0.substring(local27);
		return local23;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
	public static void method2560() {
		if (Static77.aFloat23 < 1024.0F) {
			Static77.aFloat23 = 1024.0F;
		}
		while (Static106.aFloat31 >= 16384.0F) {
			Static106.aFloat31 -= 16384.0F;
		}
		if (Static77.aFloat23 > 3072.0F) {
			Static77.aFloat23 = 3072.0F;
		}
		while (Static106.aFloat31 < 0.0F) {
			Static106.aFloat31 += 16384.0F;
		}
		@Pc(41) int local41 = Static193.anInt4286 >> 7;
		@Pc(45) int local45 = Static354.anInt6740 >> 7;
		@Pc(51) int local51 = Static81.method2010(Static12.anInt267, Static354.anInt6740, Static193.anInt4286);
		@Pc(53) int local53 = 0;
		@Pc(73) int local73;
		if (local41 > 3 && local45 > 3 && local41 < 100 && local45 < 100) {
			for (local73 = local41 - 4; local73 <= local41 + 4; local73++) {
				for (@Pc(79) int local79 = local45 - 4; local79 <= local45 + 4; local79++) {
					@Pc(83) int local83 = Static12.anInt267;
					if (local83 < 3 && Static17.method309(local79, local73)) {
						local83++;
					}
					@Pc(96) int local96 = 0;
					if (Static139.aByteArrayArrayArray10 != null && Static139.aByteArrayArrayArray10[local83] != null) {
						local96 = (Static139.aByteArrayArrayArray10[local83][local73][local79] & 0xFF) * 8;
					}
					@Pc(126) int local126 = local51 + local96 - Static261.aClass60Array2[local83].method2264(local73, local79);
					if (local53 < local126) {
						local53 = local126;
					}
				}
			}
		}
		local73 = local53 * 1536;
		if (local73 > 786432) {
			local73 = 786432;
		}
		if (local73 < 262144) {
			local73 = 262144;
		}
		if (Static114.anInt2732 < local73) {
			Static114.anInt2732 += (local73 - Static114.anInt2732) / 24;
		} else if (local73 < Static114.anInt2732) {
			Static114.anInt2732 += (local73 - Static114.anInt2732) / 80;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)I")
	public static int method2561() {
		return ((Static8.anInt192 == 0 ? 0 : 1) << 22) + ((Static292.anInt5680 == 0 ? 0 : 1) << 20) + ((Static106.aBoolean193 ? 1 : 0) << 19) + ((Static144.aBoolean265 ? 1 : 0) << 16) + ((Static51.aBoolean102 ? 1 : 0) << 9) + ((Static292.aBoolean421 ? 1 : 0) << 8) + ((Static166.aBoolean285 ? 1 : 0) << 6) + ((Static181.aBoolean302 ? 1 : 0) << 5) + ((Static315.aBoolean453 ? 1 : 0) << 3) + (Static305.anInt6786 & 0x7) + ((Static9.anInt216 & 0x3) << 11) + (Static159.anInt3440 << 17) - (-((Static158.aBoolean271 ? 1 : 0) << 4) - ((Static241.aBoolean366 ? 1 : 0) << 10)) + ((Static237.aBoolean480 ? 1 : 0) << 13) + ((Static284.aBoolean418 ? 1 : 0) << 15) + ((Static26.anInt577 == 0 ? 0 : 1) << 21) + (Static258.method4489() << 23) + (Static43.anInt1146 << 25) + ((Static209.aBoolean333 ? 1 : 0) << 27) + (Static233.anInt4697 << 28);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILclient!br;IIIILclient!sg;I)V")
	public static void method2562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class118 arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = arg1 * arg1 + arg4 * arg4;
		if (arg5 < local13) {
			return;
		}
		@Pc(31) int local31 = Math.min(arg2.anInt740 / 2, arg2.anInt758 / 2);
		if (local13 <= local31 * local31) {
			Static221.method2479(arg4, arg3, arg7, arg6, arg2, Static316.aClass58Array124[arg0], arg1);
			return;
		}
		local31 -= 10;
		@Pc(64) int local64;
		if (Static353.anInt2640 == 4) {
			local64 = (int) Static106.aFloat31 & 0x3FFF;
		} else {
			local64 = (int) Static106.aFloat31 + Static75.anInt1928 & 0x3FFF;
		}
		@Pc(78) int local78 = Class118_Sub1.anIntArray314[local64];
		@Pc(82) int local82 = Class118_Sub1.anIntArray317[local64];
		if (Static353.anInt2640 != 4) {
			local82 = local82 * 256 / (Static255.anInt5169 + 256);
			local78 = local78 * 256 / (Static255.anInt5169 + 256);
		}
		@Pc(113) int local113 = local82 * arg4 + arg1 * local78 >> 15;
		@Pc(124) int local124 = local82 * arg1 - local78 * arg4 >> 15;
		@Pc(130) double local130 = Math.atan2((double) local113, (double) local124);
		@Pc(137) int local137 = (int) (Math.sin(local130) * (double) local31);
		@Pc(144) int local144 = (int) (Math.cos(local130) * (double) local31);
		Static101.aClass58Array140[arg0].method4284((float) local137 + (float) arg7 + (float) arg2.anInt740 / 2.0F, (float) -local144 + (float) arg3 + (float) arg2.anInt758 / 2.0F, 4096, (int) (-local130 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)I")
	public static int method2564(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static25.anIntArray17[arg1 & 0x3] : Static31.anIntArray41[arg1 & 0x3];
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!ir", name = "P", descriptor = "I")
	public static int anInt3208;

	@OriginalMember(owner = "client!ir", name = "Y", descriptor = "Lclient!jc;")
	public static Class116 aClass116_1;

	@OriginalMember(owner = "client!ir", name = "L", descriptor = "[I")
	public static final int[] anIntArray249 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIII)V")
	public static void method2736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static115.anInt2550 = arg1;
		Static181.anInt3812 = arg0;
		Static182.anInt3889 = arg3;
		Static120.anInt2645 = arg2;
		Static226.anInt4563 = arg4;
		if (Static115.anInt2550 >= 100) {
			@Pc(22) int local22 = Static182.anInt3889 * 128 + 64;
			@Pc(28) int local28 = Static226.anInt4563 * 128 + 64;
			@Pc(39) int local39 = Static36.method2335(local28, Static241.anInt2711, local22) - Static181.anInt3812;
			@Pc(44) int local44 = local22 - Static145.anInt5345;
			@Pc(49) int local49 = local39 - Static266.anInt5034;
			@Pc(54) int local54 = local28 - Static27.anInt2842;
			@Pc(65) int local65 = (int) Math.sqrt((double) (local44 * local44 + local54 * local54));
			Static237.anInt4684 = (int) (Math.atan2((double) local49, (double) local65) * 2607.5945876176133D) & 0x3FFF;
			Static29.anInt444 = (int) (Math.atan2((double) local44, (double) local54) * -2607.5945876176133D) & 0x3FFF;
			Static11.anInt209 = 0;
			if (Static237.anInt4684 < 1024) {
				Static237.anInt4684 = 1024;
			}
			if (Static237.anInt4684 > 3072) {
				Static237.anInt4684 = 3072;
			}
		}
		Static198.anInt4108 = 2;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILclient!ab;)I")
	public static int method2737(@OriginalArg(1) int arg0, @OriginalArg(2) Class3 arg1) {
		if (!Static51.method778(arg1).method3755(arg0) && arg1.anObjectArray13 == null) {
			return -1;
		} else if (arg1.anIntArray6 == null || arg0 >= arg1.anIntArray6.length) {
			return -1;
		} else {
			return arg1.anIntArray6[arg0];
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)Z")
	public static boolean method2738(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V")
	public static void method2739() {
		if (Static65.anIntArray109 != null) {
			return;
		}
		Static65.anIntArray109 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
			@Pc(40) float local40 = ((float) (local27 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(49) float local49 = (float) (local27 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(51) int local51 = 0; local51 < 128; local51++) {
				@Pc(58) float local58 = (float) local51 / 128.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(68) float local68 = local40 / 60.0F;
				@Pc(71) int local71 = (int) local68;
				@Pc(75) int local75 = local71 % 6;
				@Pc(80) float local80 = local68 - (float) local71;
				@Pc(87) float local87 = local58 * (1.0F - local49);
				@Pc(96) float local96 = (1.0F - local49 * local80) * local58;
				@Pc(108) float local108 = (1.0F - local49 * (1.0F - local80)) * local58;
				if (local75 == 0) {
					local64 = local87;
					local60 = local58;
					local62 = local108;
				} else if (local75 == 1) {
					local64 = local87;
					local62 = local58;
					local60 = local96;
				} else if (local75 == 2) {
					local62 = local58;
					local64 = local108;
					local60 = local87;
				} else if (local75 == 3) {
					local60 = local87;
					local64 = local58;
					local62 = local96;
				} else if (local75 == 4) {
					local64 = local58;
					local62 = local87;
					local60 = local108;
				} else if (local75 == 5) {
					local60 = local58;
					local62 = local87;
					local64 = local96;
				}
				local60 = (float) Math.pow((double) local60, local19);
				local62 = (float) Math.pow((double) local62, local19);
				local64 = (float) Math.pow((double) local64, local19);
				@Pc(203) int local203 = (int) (local60 * 256.0F);
				@Pc(208) int local208 = (int) (local62 * 256.0F);
				@Pc(213) int local213 = (int) (local64 * 256.0F);
				@Pc(227) int local227 = local213 + (local203 << 16) + (local208 << 8) - 16777216;
				Static65.anIntArray109[local21++] = local227;
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(II)V")
	public static void method2740(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(4, arg0);
		local8.method1197();
	}

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "(B)V")
	public static void method2741() {
		@Pc(5) Class41 local5 = Static236.aClass41_55;
		synchronized (Static236.aClass41_55) {
			Static236.aClass41_55.method829();
		}
		local5 = Static157.aClass41_40;
		synchronized (Static157.aClass41_40) {
			Static157.aClass41_40.method829();
		}
	}
}

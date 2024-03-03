import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!hu", name = "t", descriptor = "Lclient!is;")
	public static Class109 aClass109_1;

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "(I)V", line = 290)
	public static void method2624() {
		if (Static169.anIntArray204 != null) {
			return;
		}
		Static169.anIntArray204 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		int var2 = 0;
		for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
			@Pc(38) float local38 = ((float) (local24 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(47) float local47 = (float) (local24 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(49) int local49 = 0; local49 < 128; local49++) {
				@Pc(56) float local56 = (float) local49 / 128.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(66) float local66 = local38 / 60.0F;
				@Pc(69) int local69 = (int) local66;
				@Pc(73) int local73 = local69 % 6;
				@Pc(78) float local78 = local66 - (float) local69;
				@Pc(84) float local84 = local56 * (1.0F - local47);
				@Pc(93) float local93 = local56 * (1.0F - local78 * local47);
				@Pc(105) float local105 = local56 * (1.0F - local47 * (1.0F - local78));
				if (local73 == 0) {
					local60 = local105;
					local62 = local84;
					local58 = local56;
				} else if (local73 == 1) {
					local62 = local84;
					local60 = local56;
					local58 = local93;
				} else if (local73 == 2) {
					local62 = local105;
					local60 = local56;
					local58 = local84;
				} else if (local73 == 3) {
					local60 = local93;
					local58 = local84;
					local62 = local56;
				} else if (local73 == 4) {
					local60 = local84;
					local58 = local105;
					local62 = local56;
				} else if (local73 == 5) {
					local58 = local56;
					local60 = local84;
					local62 = local93;
				}
				local58 = (float) Math.pow((double) local58, local20);
				local60 = (float) Math.pow((double) local60, local20);
				local62 = (float) Math.pow((double) local62, local20);
				@Pc(199) int local199 = (int) (local58 * 256.0F);
				@Pc(204) int local204 = (int) (local60 * 256.0F);
				@Pc(209) int local209 = (int) (local62 * 256.0F);
				@Pc(222) int local222 = local209 + (local204 << 8) + (local199 << 16) - 16777216;
				Static169.anIntArray204[var2++] = local222;
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "(I)V", line = 408)
	public static void method2625() {
		if (Class2_Sub2_Sub5.anInt1392 < 0) {
			return;
		}
		@Pc(11) long local11 = Static190.method3686();
		Class2_Sub2_Sub5.anInt1392 = (int) ((long) Class2_Sub2_Sub5.anInt1392 + Class1.aLong1 - local11);
		if (Class2_Sub2_Sub5.anInt1392 > 0) {
			@Pc(31) int local31 = (Class2_Sub2_Sub5.anInt1392 << 8) / Class174.anInt4793;
			@Pc(36) int local36 = 255 - local31;
			@Pc(41) float local41 = (float) local31 / 255.0F;
			Static106.anInt2334 = (local31 * (Static330.anInt6553 & 0xFF00) + local36 * (Static288.aClass21_2.anInt637 & 0xFF00) & 0xFF0000) + (local36 * (Static288.aClass21_2.anInt637 & 0xFF00FF) + (Static330.anInt6553 & 0xFF00FF) * local31 & 0xFF00FF00) >>> 8;
			@Pc(77) float local77 = 1.0F - local41;
			Static125.aFloat32 = Static179.aFloat39 + local77 * (Static288.aClass21_2.aFloat24 - Static179.aFloat39);
			Static339.anInt6804 = local36 * Static288.aClass21_2.anInt634 + Static164.anInt3347 * local31 >> 8;
			Static92.anInt2092 = ((Static288.aClass21_2.anInt641 & 0xFF00FF) * local36 + local31 * (Static212.anInt4041 & 0xFF00FF) & 0xFF00FF00) + (local36 * (Static288.aClass21_2.anInt641 & 0xFF00) + (Static212.anInt4041 & 0xFF00) * local31 & 0xFF0000) >>> 8;
			Static294.aFloat73 = (Static288.aClass21_2.aFloat22 - Static216.aFloat62) * local77 + Static216.aFloat62;
			Static322.aFloat76 = (Static288.aClass21_2.aFloat23 - Static203.aFloat29) * local77 + Static203.aFloat29;
			Static154.aFloat37 = Static316.aFloat75 + (Static288.aClass21_2.aFloat25 - Static316.aFloat75) * local77;
			Static147.aFloat34 = Static63.aFloat30 + local77 * (Static288.aClass21_2.aFloat26 - Static63.aFloat30);
			Static132.aFloat33 = Static95.aFloat40 + (Static288.aClass21_2.aFloat21 - Static95.aFloat40) * local77;
			if (Static288.aClass21_2.aClass42_1 != Static75.aClass42_4) {
				Static23.aClass42_2 = Static61.aClass19_3.method2829(Static75.aClass42_4, Static288.aClass21_2.aClass42_1, local77, Static23.aClass42_2);
			}
		} else {
			Static23.aClass42_2 = Static288.aClass21_2.aClass42_1;
			Static339.anInt6804 = Static288.aClass21_2.anInt634;
			Static92.anInt2092 = Static288.aClass21_2.anInt641;
			Class2_Sub2_Sub5.anInt1392 = -1;
			Static294.aFloat73 = Static288.aClass21_2.aFloat22;
			Static147.aFloat34 = Static288.aClass21_2.aFloat26;
			Static154.aFloat37 = Static288.aClass21_2.aFloat25;
			Static106.anInt2334 = Static288.aClass21_2.anInt637;
			Static322.aFloat76 = Static288.aClass21_2.aFloat23;
			Static125.aFloat32 = Static288.aClass21_2.aFloat24;
			Static132.aFloat33 = Static288.aClass21_2.aFloat21;
		}
		Class1.aLong1 = local11;
	}

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "(I)V", line = 514)
	public static void method2629() {
		@Pc(1) Class98 local1 = Class68.aClass98_9;
		synchronized (Class68.aClass98_9) {
			Class68.aClass98_9.method2616();
		}
		local1 = Class230.aClass98_58;
		synchronized (Class230.aClass98_58) {
			Class230.aClass98_58.method2616();
		}
	}
}

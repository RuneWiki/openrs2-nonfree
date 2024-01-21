import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!q", name = "y", descriptor = "I")
	public static int anInt3071;

	@OriginalMember(owner = "client!q", name = "z", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1126 = Static146.method2172("Fps:");

	@OriginalMember(owner = "client!q", name = "D", descriptor = "[I")
	public static int[] anIntArray455 = new int[1000];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
	public static void method2177(@OriginalArg(1) int arg0) {
		@Pc(4) int[] local4 = Static76.aClass2_Sub2_Sub3_Sub2_4.anIntArray81;
		@Pc(11) int local11 = local4.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local4[local13] = 1;
		}
		@Pc(38) int local38;
		@Pc(40) int local40;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local38 = 4 * 512 * (103 - local25) + 24628;
			for (local40 = 1; local40 < 103; local40++) {
				if ((Static140.aByteArrayArrayArray6[arg0][local40][local25] & 0x18) == 0) {
					Static172.aClass60_1.method2055(local4, local38, arg0, local40, local25);
				}
				if (arg0 < 3 && (Static140.aByteArrayArrayArray6[arg0 + 1][local40][local25] & 0x8) != 0) {
					Static172.aClass60_1.method2055(local4, local38, arg0 + 1, local40, local25);
				}
				local38 += 4;
			}
		}
		Static76.aClass2_Sub2_Sub3_Sub2_4.method397();
		local40 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		local38 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (((int) (Math.random() * 20.0D)) + 228 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		@Pc(155) int local155;
		for (@Pc(151) int local151 = 1; local151 < 103; local151++) {
			for (local155 = 1; local155 < 103; local155++) {
				if ((Static140.aByteArrayArrayArray6[arg0][local155][local151] & 0x18) == 0) {
					Static9.method144(local40, local155, local151, local38, arg0);
				}
				if (arg0 < 3 && (Static140.aByteArrayArrayArray6[arg0 + 1][local155][local151] & 0x8) != 0) {
					Static9.method144(local40, local155, local151, local38, arg0 + 1);
				}
			}
		}
		Static77.anInt2029 = 0;
		for (local155 = 0; local155 < 104; local155++) {
			for (@Pc(228) int local228 = 0; local228 < 104; local228++) {
				@Pc(236) int local236 = Static172.aClass60_1.method2072(Static54.anInt1472, local155, local228);
				if (local236 != 0) {
					local236 = local236 >> 14 & 0x7FFF;
					@Pc(249) int local249 = Static121.method2129(local236).anInt544;
					if (local249 >= 0) {
						@Pc(253) int local253 = local228;
						@Pc(255) int local255 = local155;
						if (local249 != 22 && local249 != 29 && local249 != 34 && local249 != 36 && local249 != 46 && local249 != 47 && local249 != 48) {
							@Pc(285) int[][] local285 = Static27.aClass86Array1[Static54.anInt1472].anIntArrayArray36;
							for (@Pc(287) int local287 = 0; local287 < 10; local287++) {
								@Pc(294) int local294 = (int) (Math.random() * 4.0D);
								if (local294 == 0 && local255 > 0 && local255 > local155 - 3 && (local285[local255 - 1][local253] & 0x12C0108) == 0) {
									local255--;
								}
								if (local294 == 1 && local255 < 103 && local255 < local155 + 3 && (local285[local255 + 1][local253] & 0x12C0180) == 0) {
									local255++;
								}
								if (local294 == 2 && local253 > 0 && local228 - 3 < local253 && (local285[local255][local253 - 1] & 0x12C0102) == 0) {
									local253--;
								}
								if (local294 == 3 && local253 < 103 && local228 + 3 > local253 && (local285[local255][local253 + 1] & 0x12C0120) == 0) {
									local253++;
								}
							}
						}
						Static181.aClass2_Sub2_Sub3_Sub2Array13[Static77.anInt2029] = Static150.aClass2_Sub2_Sub3_Sub2Array11[local249];
						Static178.anIntArray638[Static77.anInt2029] = local255;
						Static97.anIntArray391[Static77.anInt2029] = local253;
						Static77.anInt2029++;
					}
				}
			}
		}
		Static152.aClass57_1.method2170();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public static void method2179() {
		anIntArray455 = null;
		aClass77_1126 = null;
	}
}

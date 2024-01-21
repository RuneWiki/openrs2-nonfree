import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_913 = Static181.method2795("Please remove ");

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "Lclient!qe;")
	public static Class83 aClass83_912 = aClass83_913;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_914 = Static181.method2795("<col=ffff00>");

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "Lclient!qe;")
	public static Class83 aClass83_915 = aClass83_913;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_916 = Static181.method2795("Could not complete login)3");

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "Lclient!qe;")
	public static Class83 aClass83_917 = aClass83_916;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)V")
	public static void method2346(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub2_Sub17_Sub1 local6;
		if (Static108.aClass2_Sub2_Sub17_3 == null) {
			local6 = new Class2_Sub2_Sub17_Sub1(512, 512);
		} else {
			local6 = (Class2_Sub2_Sub17_Sub1) Static108.aClass2_Sub2_Sub17_3;
		}
		@Pc(21) int[] local21 = local6.anIntArray252;
		@Pc(24) int local24 = local21.length;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			local21[local26] = 1;
		}
		@Pc(59) int local59;
		@Pc(61) int local61;
		for (@Pc(47) int local47 = 1; local47 < 103; local47++) {
			local59 = (103 - local47) * 512 * 4 + 24628;
			for (local61 = 1; local61 < 103; local61++) {
				if ((Static9.aByteArrayArrayArray7[arg0][local61][local47] & 0x18) == 0) {
					Static160.method2460(local21, local59, arg0, local61, local47);
				}
				if (arg0 < 3 && (Static9.aByteArrayArrayArray7[arg0 + 1][local61][local47] & 0x8) != 0) {
					Static160.method2460(local21, local59, arg0 + 1, local61, local47);
				}
				local59 += 4;
			}
		}
		local61 = (int) (Math.random() * 20.0D) + 228 << 16;
		local59 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		local6.method1917();
		@Pc(169) int local169;
		for (@Pc(165) int local165 = 1; local165 < 103; local165++) {
			for (local169 = 1; local169 < 103; local169++) {
				if ((Static9.aByteArrayArrayArray7[arg0][local169][local165] & 0x18) == 0) {
					Static161.method252(local165, local169, local59, arg0, local61);
				}
				if (arg0 < 3 && (Static9.aByteArrayArrayArray7[arg0 + 1][local169][local165] & 0x8) != 0) {
					Static161.method252(local165, local169, local59, arg0 + 1, local61);
				}
			}
		}
		Static67.anInt1607 = 0;
		for (local169 = 0; local169 < 104; local169++) {
			for (@Pc(238) int local238 = 0; local238 < 104; local238++) {
				@Pc(245) long local245 = Static93.method1604(Static43.anInt1126, local169, local238);
				if (local245 != 0L) {
					@Pc(260) Class2_Sub2_Sub20 local260 = Static99.method1689((int) (local245 >>> 32) & Integer.MAX_VALUE);
					@Pc(263) int local263 = local260.anInt2659;
					if (local263 >= 0) {
						@Pc(267) int local267 = local169;
						@Pc(269) int local269 = local238;
						if (local263 != 22 && local263 != 29 && local263 != 34 && local263 != 36 && local263 != 46 && local263 != 47 && local263 != 48) {
							@Pc(299) int[][] local299 = Static117.aClass22Array1[Static43.anInt1126].anIntArrayArray4;
							for (@Pc(301) int local301 = 0; local301 < 10; local301++) {
								@Pc(308) int local308 = (int) (Math.random() * 4.0D);
								if (local308 == 0 && local267 > 0 && local169 - 3 < local267 && (local299[local267 - 1][local269] & 0x12C0108) == 0) {
									local267--;
								}
								if (local308 == 1 && local267 < 103 && local169 + 3 > local267 && (local299[local267 + 1][local269] & 0x12C0180) == 0) {
									local267++;
								}
								if (local308 == 2 && local269 > 0 && local269 > local238 - 3 && (local299[local267][local269 - 1] & 0x12C0102) == 0) {
									local269--;
								}
								if (local308 == 3 && local269 < 103 && local269 < local238 + 3 && (local299[local267][local269 + 1] & 0x12C0120) == 0) {
									local269++;
								}
							}
						}
						Static147.anIntArray401[Static67.anInt1607] = local260.anInt2679;
						Static142.anIntArray295[Static67.anInt1607] = local267;
						Static196.anIntArray376[Static67.anInt1607] = local269;
						Static67.anInt1607++;
					}
				}
			}
		}
		Static108.aClass2_Sub2_Sub17_3 = local6;
		Static191.aClass34_1.method2581();
	}
}

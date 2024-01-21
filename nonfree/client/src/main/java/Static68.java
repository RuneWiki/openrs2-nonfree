import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!hb", name = "R", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
	public static int anInt1469 = 0;

	@OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
	public static int anInt1481 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
	public static void method1117() {
		if (Static201.aBooleanArray22[96]) {
			Static142.anInt2969 += (-Static142.anInt2969 - 24) / 2;
		} else if (Static201.aBooleanArray22[97]) {
			Static142.anInt2969 += (24 - Static142.anInt2969) / 2;
		} else {
			Static142.anInt2969 /= 2;
		}
		Static72.anInt1568 += Static142.anInt2969 / 2;
		if (Static201.aBooleanArray22[98]) {
			Static44.anInt1017 += (12 - Static44.anInt1017) / 2;
		} else if (Static201.aBooleanArray22[99]) {
			Static44.anInt1017 += (-Static44.anInt1017 - 12) / 2;
		} else {
			Static44.anInt1017 /= 2;
		}
		Static214.anInt4154 += Static44.anInt1017 / 2;
		@Pc(89) int local89 = Static183.anInt3681 + Static210.aClass1_Sub2_Sub2_2.anInt2241;
		@Pc(94) int local94 = Static211.anInt4099 + Static210.aClass1_Sub2_Sub2_2.anInt2234;
		if (Static139.anInt2898 - local89 < -500 || Static139.anInt2898 - local89 > 500 || Static2.anInt22 - local94 < -500 || Static2.anInt22 - local94 > 500) {
			Static2.anInt22 = local94;
			Static139.anInt2898 = local89;
		}
		if (local89 != Static139.anInt2898) {
			Static139.anInt2898 += (local89 - Static139.anInt2898) / 16;
		}
		if (local94 != Static2.anInt22) {
			Static2.anInt22 += (local94 - Static2.anInt22) / 16;
		}
		Static211.method3122();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
	public static void method1119(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static37.method1027(arg0)) {
			return;
		}
		@Pc(16) Class69[] local16 = Static155.aClass69ArrayArray1[arg0];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(26) Class69 local26 = local16[local18];
			if (local26.anObjectArray26 != null) {
				@Pc(33) Class5_Sub10 local33 = new Class5_Sub10();
				local33.anObjectArray3 = local26.anObjectArray26;
				local33.aClass69_3 = local26;
				Static146.method2246(2000000, local33);
			}
		}
	}
}

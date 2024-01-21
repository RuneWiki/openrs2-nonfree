import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2 aClass2_Sub1_Sub7_Sub2_1;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1004 = Static158.method3034("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1005 = Static158.method3034(" <col=00ff80>");

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "[S")
	public static final short[] aShortArray53 = new short[500];

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
	public static int anInt3673 = 0;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
	public static int anInt3676 = 0;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1006 = Static158.method3034("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ob;B)Z")
	public static boolean method2837(@OriginalArg(0) Class60 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static81.anInt2399; local16++) {
			if (arg0.method2698(Static169.aClass60Array25[local16])) {
				return true;
			}
		}
		return arg0.method2698(Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass60_288);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)Lclient!oh;")
	public static Class2_Sub1_Sub15 method2840(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub1_Sub15 local12 = (Class2_Sub1_Sub15) Static29.aClass89_9.method3437((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static88.aClass13_Sub1_11.method521(0, arg0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class2_Sub1_Sub15();
		@Pc(40) Class2_Sub3 local40 = new Class2_Sub3(local22);
		local40.anInt273 = local40.aByteArray4.length - 2;
		@Pc(51) int local51 = local40.method234();
		@Pc(61) int local61 = local40.aByteArray4.length - local51 - 2 - 12;
		local40.anInt273 = local61;
		@Pc(68) int local68 = local40.method206();
		local12.anInt3563 = local40.method234();
		local12.anInt3561 = local40.method234();
		local12.anInt3566 = local40.method234();
		local12.anInt3567 = local40.method234();
		@Pc(92) int local92 = local40.method218();
		@Pc(103) int local103;
		@Pc(109) int local109;
		if (local92 > 0) {
			local12.aClass51Array1 = new Class51[local92];
			for (local103 = 0; local103 < local92; local103++) {
				local109 = local40.method234();
				@Pc(116) Class51 local116 = new Class51(Static150.method2965(local109));
				local12.aClass51Array1[local103] = local116;
				while (local109-- > 0) {
					@Pc(127) int local127 = local40.method206();
					@Pc(131) int local131 = local40.method206();
					local116.method2463(new Class2_Sub12(local131), (long) local127);
				}
			}
		}
		local40.anInt273 = 0;
		local103 = 0;
		local12.aClass60_987 = local40.method211();
		local12.anIntArray406 = new int[local68];
		local12.anIntArray407 = new int[local68];
		local12.aClass60Array20 = new Class60[local68];
		while (local40.anInt273 < local61) {
			local109 = local40.method234();
			if (local109 == 3) {
				local12.aClass60Array20[local103] = local40.method240();
			} else if (local109 >= 100 || local109 == 21 || local109 == 38 || local109 == 39) {
				local12.anIntArray406[local103] = local40.method218();
			} else {
				local12.anIntArray406[local103] = local40.method206();
			}
			local12.anIntArray407[local103++] = local109;
		}
		Static29.aClass89_9.method3432(local12, (long) arg0);
		return local12;
	}
}

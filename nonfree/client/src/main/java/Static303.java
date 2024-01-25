import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_81 = new Class32("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "Lclient!mb;")
	public static final Class154 aClass154_7 = new Class154();

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "[I")
	public static final int[] anIntArray1020 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
	public static int anInt5133 = 0;

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
	public static int anInt5140 = 0;

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "Lclient!hq;")
	public static final Class101 aClass101_11 = new Class101("", 15);

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_79 = new Class11(11, 7);

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString56 = null;

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_114 = new Class205(76, 14);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZII)V")
	public static void method4468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class2_Sub29 local10 = (Class2_Sub29) Static161.aClass30_18.method694(); local10 != null; local10 = (Class2_Sub29) Static161.aClass30_18.method682()) {
			Static383.method5611(arg2, arg1, arg3, local10, arg0);
		}
		for (@Pc(31) Class2_Sub29 local31 = (Class2_Sub29) Static386.aClass30_44.method694(); local31 != null; local31 = (Class2_Sub29) Static386.aClass30_44.method682()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class103 local40 = local31.aClass1_Sub5_Sub1_Sub2_1.method5552();
			if (local31.aClass1_Sub5_Sub1_Sub2_1.aBoolean460) {
				local35 = 0;
			} else if (local40.anInt2819 == local31.aClass1_Sub5_Sub1_Sub2_1.anInt6423 || local40.anInt2824 == local31.aClass1_Sub5_Sub1_Sub2_1.anInt6423 || local40.anInt2827 == local31.aClass1_Sub5_Sub1_Sub2_1.anInt6423 || local40.anInt2828 == local31.aClass1_Sub5_Sub1_Sub2_1.anInt6423) {
				local35 = 2;
			} else if (local31.aClass1_Sub5_Sub1_Sub2_1.anInt6423 == local40.anInt2836 || local31.aClass1_Sub5_Sub1_Sub2_1.anInt6423 == local40.anInt2820 || local40.anInt2813 == local31.aClass1_Sub5_Sub1_Sub2_1.anInt6423 || local31.aClass1_Sub5_Sub1_Sub2_1.anInt6423 == local40.anInt2826) {
				local35 = 3;
			}
			if (local31.anInt3897 != local35) {
				@Pc(135) int local135 = Static121.method2479(local31.aClass1_Sub5_Sub1_Sub2_1);
				if (local31.anInt3905 != local135) {
					if (local31.aClass2_Sub2_Sub2_3 != null) {
						Static324.aClass2_Sub2_Sub1_2.method58(local31.aClass2_Sub2_Sub2_3);
						local31.aClass2_Sub2_Sub2_3 = null;
					}
					local31.anInt3905 = local135;
				}
				local31.anInt3897 = local35;
			}
			local31.anInt3899 = local31.aClass1_Sub5_Sub1_Sub2_1.anInt6390;
			local31.anInt3896 = local31.aClass1_Sub5_Sub1_Sub2_1.anInt6390 + local31.aClass1_Sub5_Sub1_Sub2_1.method5547() * 64;
			local31.anInt3900 = local31.aClass1_Sub5_Sub1_Sub2_1.anInt6386;
			local31.anInt3904 = local31.aClass1_Sub5_Sub1_Sub2_1.anInt6386 + local31.aClass1_Sub5_Sub1_Sub2_1.method5547() * 64;
			Static383.method5611(arg2, arg1, arg3, local31, arg0);
		}
		for (@Pc(217) Class2_Sub29 local217 = (Class2_Sub29) Static367.aClass246_32.method5606(); local217 != null; local217 = (Class2_Sub29) Static367.aClass246_32.method5614()) {
			@Pc(221) byte local221 = 1;
			@Pc(226) Class103 local226 = local217.aClass1_Sub5_Sub1_Sub1_2.method5552();
			if (local217.aClass1_Sub5_Sub1_Sub1_2.aBoolean460) {
				local221 = 0;
			} else if (local217.aClass1_Sub5_Sub1_Sub1_2.anInt6423 == local226.anInt2819 || local217.aClass1_Sub5_Sub1_Sub1_2.anInt6423 == local226.anInt2824 || local226.anInt2827 == local217.aClass1_Sub5_Sub1_Sub1_2.anInt6423 || local217.aClass1_Sub5_Sub1_Sub1_2.anInt6423 == local226.anInt2828) {
				local221 = 2;
			} else if (local217.aClass1_Sub5_Sub1_Sub1_2.anInt6423 == local226.anInt2836 || local217.aClass1_Sub5_Sub1_Sub1_2.anInt6423 == local226.anInt2820 || local226.anInt2813 == local217.aClass1_Sub5_Sub1_Sub1_2.anInt6423 || local226.anInt2826 == local217.aClass1_Sub5_Sub1_Sub1_2.anInt6423) {
				local221 = 3;
			}
			if (local221 != local217.anInt3897) {
				@Pc(313) int local313 = Static164.method2912(local217.aClass1_Sub5_Sub1_Sub1_2);
				if (local313 != local217.anInt3905) {
					if (local217.aClass2_Sub2_Sub2_3 != null) {
						Static324.aClass2_Sub2_Sub1_2.method58(local217.aClass2_Sub2_Sub2_3);
						local217.aClass2_Sub2_Sub2_3 = null;
					}
					local217.anInt3905 = local313;
				}
				local217.anInt3897 = local221;
			}
			local217.anInt3899 = local217.aClass1_Sub5_Sub1_Sub1_2.anInt6390;
			local217.anInt3896 = local217.aClass1_Sub5_Sub1_Sub1_2.anInt6390 + local217.aClass1_Sub5_Sub1_Sub1_2.method5547() * 64;
			local217.anInt3900 = local217.aClass1_Sub5_Sub1_Sub1_2.anInt6386;
			local217.anInt3904 = local217.aClass1_Sub5_Sub1_Sub1_2.anInt6386 + local217.aClass1_Sub5_Sub1_Sub1_2.method5547() * 64;
			Static383.method5611(arg2, arg1, arg3, local217, arg0);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLclient!vc;)V")
	public static void method4471(@OriginalArg(1) Class63 arg0) {
		if (Static233.aClass30_34.method687() == 0) {
			return;
		}
		@Pc(53) Class2_Sub33 local53;
		if (Static62.anInt1261 == 0) {
			for (local53 = (Class2_Sub33) Static233.aClass30_34.method694(); local53 != null; local53 = (Class2_Sub33) Static233.aClass30_34.method682()) {
				Static15.aClass81_1.method2177(local53.aBoolean336 ? Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1 : null, arg0, Static156.aClass9_1, local53.anInt4461, arg0, local53.anInt4457, false, local53.anInt4460, local53.anInt4458, false, local53.anInt4459);
				local53.method5617();
			}
			Static240.method3873();
			return;
		}
		if (Static379.aClass63_10 == null) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(36, 32);
			Static379.aClass63_10 = Static358.method1965(local21, Static329.anInterface9_6, 0, Static359.aClass111_5, 0);
			Static201.aClass9_2 = Static379.aClass63_10.method2034(Static230.method3732(Static255.anInt4502, Static120.aClass171_35), Static397.method2332(Static263.aClass171_64, Static255.anInt4502));
		}
		for (local53 = (Class2_Sub33) Static233.aClass30_34.method694(); local53 != null; local53 = (Class2_Sub33) Static233.aClass30_34.method682()) {
			Static15.aClass81_1.method2177(local53.aBoolean336 ? Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1 : null, arg0, Static201.aClass9_2, local53.anInt4461, Static379.aClass63_10, local53.anInt4457, false, local53.anInt4460, local53.anInt4458, false, local53.anInt4459);
			local53.method5617();
		}
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(II)[[[B")
	public static byte[][][] method4474(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local69 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(108) int local108;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local108 = 0; local108 < arg0; local108++) {
				if (local69 <= local108) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(151) int local151;
		for (local108 = arg0 - 1; local108 >= 0; local108--) {
			for (local151 = 0; local151 < arg0; local151++) {
				if (local151 >= local108) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(197) int local197;
		for (local151 = arg0 - 1; local151 >= 0; local151--) {
			for (local197 = 0; local197 < arg0; local197++) {
				if (local197 <= local151 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(238) int local238;
		for (local197 = 0; local197 < arg0; local197++) {
			for (local238 = 0; local238 < arg0; local238++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local238 >= local197 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(299) int local299;
		for (local238 = 0; local238 < arg0; local238++) {
			for (local299 = arg0 - 1; local299 >= 0; local299--) {
				if (local299 <= local238 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(348) int local348;
		for (local299 = arg0 - 1; local299 >= 0; local299--) {
			for (local348 = arg0 - 1; local348 >= 0; local348--) {
				if (local299 << 1 <= local348) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(393) int local393;
		for (local348 = arg0 - 1; local348 >= 0; local348--) {
			for (local393 = arg0 - 1; local393 >= 0; local393--) {
				if (local393 <= local348 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(435) int local435;
		for (local393 = arg0 - 1; local393 >= 0; local393--) {
			for (local435 = 0; local435 < arg0; local435++) {
				if (local435 >= local393 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(473) int local473;
		for (local435 = 0; local435 < arg0; local435++) {
			for (local473 = 0; local473 < arg0; local473++) {
				if (local435 >> 1 >= local473) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(514) int local514;
		for (local473 = 0; local473 < arg0; local473++) {
			for (local514 = arg0 - 1; local514 >= 0; local514--) {
				if (local473 << 1 <= local514) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(558) int local558;
		for (local514 = arg0 - 1; local514 >= 0; local514--) {
			for (local558 = 0; local558 < arg0; local558++) {
				if (local514 >> 1 <= local558) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(596) int local596;
		for (local558 = 0; local558 < arg0; local558++) {
			for (local596 = 0; local596 < arg0; local596++) {
				if (local596 <= local558 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(645) int local645;
		for (local596 = 0; local596 < arg0; local596++) {
			for (local645 = arg0 - 1; local645 >= 0; local645--) {
				if (local596 >> 1 <= local645) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(687) int local687;
		for (local645 = arg0 - 1; local645 >= 0; local645--) {
			for (local687 = arg0 - 1; local687 >= 0; local687--) {
				if (local687 <= local645 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(731) int local731;
		for (local687 = arg0 - 1; local687 >= 0; local687--) {
			for (local731 = arg0 - 1; local731 >= 0; local731--) {
				if (local731 >= local687 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(780) int local780;
		for (local731 = arg0 - 1; local731 >= 0; local731--) {
			for (local780 = 0; local780 < arg0; local780++) {
				if (local780 <= local731 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(825) int local825;
		for (local780 = 0; local780 < arg0; local780++) {
			for (local825 = 0; local825 < arg0; local825++) {
				if (local780 >> 1 <= local825) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(874) int local874;
		for (local825 = 0; local825 < arg0; local825++) {
			for (local874 = arg0 - 1; local874 >= 0; local874--) {
				if (local874 <= local825 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(915) int local915;
		for (local874 = 0; local874 < arg0; local874++) {
			for (local915 = 0; local915 < arg0; local915++) {
				if (local915 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(958) int local958;
		for (local915 = 0; local915 < arg0; local915++) {
			for (local958 = 0; local958 < arg0; local958++) {
				if (local915 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1001) int local1001;
		for (local958 = 0; local958 < arg0; local958++) {
			for (local1001 = 0; local1001 < arg0; local1001++) {
				if (local1001 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1048) int local1048;
		for (local1001 = 0; local1001 < arg0; local1001++) {
			for (local1048 = 0; local1048 < arg0; local1048++) {
				if (local1001 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1095) int local1095;
		for (local1048 = 0; local1048 < arg0; local1048++) {
			for (local1095 = 0; local1095 < arg0; local1095++) {
				if (local1048 - arg0 / 2 >= local1095) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1151) int local1151;
		for (local1095 = arg0 - 1; local1095 >= 0; local1095--) {
			for (local1151 = 0; local1151 < arg0; local1151++) {
				if (local1095 - arg0 / 2 >= local1151) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1200) int local1200;
		for (local1151 = arg0 - 1; local1151 >= 0; local1151--) {
			for (local1200 = arg0 - 1; local1200 >= 0; local1200--) {
				if (local1200 <= local1151 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1245) int local1245;
		for (local1200 = 0; local1200 < arg0; local1200++) {
			for (local1245 = arg0 - 1; local1245 >= 0; local1245--) {
				if (local1245 <= local1200 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1285) int local1285;
		for (local1245 = 0; local1245 < arg0; local1245++) {
			for (local1285 = 0; local1285 < arg0; local1285++) {
				if (local1245 - arg0 / 2 <= local1285) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1333) int local1333;
		for (local1285 = arg0 - 1; local1285 >= 0; local1285--) {
			for (local1333 = 0; local1333 < arg0; local1333++) {
				if (local1333 >= local1285 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1378) int local1378;
		for (local1333 = arg0 - 1; local1333 >= 0; local1333--) {
			for (local1378 = arg0 - 1; local1378 >= 0; local1378--) {
				if (local1378 >= local1333 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1378 = 0; local1378 < arg0; local1378++) {
			for (@Pc(1427) int local1427 = arg0 - 1; local1427 >= 0; local1427--) {
				if (local1427 >= local1378 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}

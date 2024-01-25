import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "J")
	public static long aLong22;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public static int anInt723;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Lclient!uw;")
	public static final Class350 aClass350_2 = new Class350("", 15);

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[I")
	public static final int[] anIntArray46 = new int[14];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method771() {
		@Pc(9) int local9 = Static627.aClass2_Sub11_Sub2_6.method8383();
		@Pc(13) int local13 = Static627.aClass2_Sub11_Sub2_6.method8354();
		@Pc(24) boolean local24 = Static627.aClass2_Sub11_Sub2_6.method8383() == 1;
		@Pc(30) int local30 = Static627.aClass2_Sub11_Sub2_6.method8351();
		Static69.anInt2216 = Static627.aClass2_Sub11_Sub2_6.method8389();
		Static8.method208();
		Static520.method7890(local9);
		Static627.aClass2_Sub11_Sub2_6.method8407();
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(59) int local59;
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			for (local48 = 0; local48 < Static47.anInt1794 >> 3; local48++) {
				for (local52 = 0; local52 < Static209.anInt4742 >> 3; local52++) {
					local59 = Static627.aClass2_Sub11_Sub2_6.method8400(1);
					if (local59 == 1) {
						Static277.anIntArrayArrayArray11[local44][local48][local52] = Static627.aClass2_Sub11_Sub2_6.method8400(26);
					} else {
						Static277.anIntArrayArrayArray11[local44][local48][local52] = -1;
					}
				}
			}
		}
		Static627.aClass2_Sub11_Sub2_6.method8402();
		local48 = (Static541.anInt9723 - Static627.aClass2_Sub11_Sub2_6.anInt10066) / 16;
		Static296.anIntArrayArray31 = new int[local48][4];
		for (local52 = 0; local52 < local48; local52++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static296.anIntArrayArray31[local52][local59] = Static627.aClass2_Sub11_Sub2_6.method8381();
			}
		}
		Static8.anIntArray10 = null;
		Static300.anIntArray106 = new int[local48];
		Static475.anIntArray654 = new int[local48];
		Static9.anIntArray11 = new int[local48];
		Static431.anIntArray533 = new int[local48];
		Static619.anIntArray701 = new int[local48];
		Static85.aByteArrayArray5 = null;
		Static268.aByteArrayArray14 = new byte[local48][];
		Static377.aByteArrayArray17 = new byte[local48][];
		Static557.aByteArrayArray24 = new byte[local48][];
		Static123.aByteArrayArray10 = new byte[local48][];
		local48 = 0;
		for (local59 = 0; local59 < 4; local59++) {
			for (@Pc(198) int local198 = 0; local198 < Static47.anInt1794 >> 3; local198++) {
				for (@Pc(202) int local202 = 0; local202 < Static209.anInt4742 >> 3; local202++) {
					@Pc(212) int local212 = Static277.anIntArrayArrayArray11[local59][local198][local202];
					if (local212 != -1) {
						@Pc(221) int local221 = local212 >> 14 & 0x3FF;
						@Pc(227) int local227 = local212 >> 3 & 0x7FF;
						@Pc(237) int local237 = local227 / 8 + (local221 / 8 << 8);
						for (@Pc(239) int local239 = 0; local239 < local48; local239++) {
							if (Static431.anIntArray533[local239] == local237) {
								local237 = -1;
								break;
							}
						}
						if (local237 != -1) {
							Static431.anIntArray533[local48] = local237;
							@Pc(276) int local276 = local237 >> 8 & 0xFF;
							@Pc(280) int local280 = local237 & 0xFF;
							Static9.anIntArray11[local48] = Static316.aClass157_158.method4571("m" + local276 + "_" + local280);
							Static300.anIntArray106[local48] = Static316.aClass157_158.method4571("l" + local276 + "_" + local280);
							Static619.anIntArray701[local48] = Static316.aClass157_158.method4571("um" + local276 + "_" + local280);
							Static475.anIntArray654[local48] = Static316.aClass157_158.method4571("ul" + local276 + "_" + local280);
							local48++;
						}
					}
				}
			}
		}
		Static562.method8437(local13, local30, 11, local24);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public static void method772() {
		if (Static513.anInt9420 == 5) {
			Static513.anInt9420 = 6;
		}
	}
}

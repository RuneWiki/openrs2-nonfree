import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "[Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array7;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1137 = Static120.method1824("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1138 = Static120.method1824("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Lclient!af;")
	public static final Class5 aClass5_40 = new Class5(30);

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1139 = Static120.method1824("Mitglieder)2Welt");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)Z")
	public static boolean method2061(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method2062(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static183.aClass83_1);
		arg0.removeMouseMotionListener(Static183.aClass83_1);
		arg0.removeFocusListener(Static183.aClass83_1);
		Static83.anInt1745 = 0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([IIIIIII)V")
	public static void method2063(@OriginalArg(0) int[] arg0) {
		Static162.anInt3644 = 25;
		Static133.aBooleanArrayArrayArrayArray1 = new boolean[8][32][Static162.anInt3644 + Static162.anInt3644 + 1][Static162.anInt3644 + Static162.anInt3644 + 1];
		Static18.anInt460 = 0;
		Static168.anInt3761 = 0;
		Static190.anInt4380 = 512;
		Static59.anInt1316 = 334;
		Static33.anInt774 = 256;
		Static186.anInt4212 = 167;
		@Pc(45) boolean[][][][] local45 = new boolean[9][32][Static162.anInt3644 + Static162.anInt3644 + 3][Static162.anInt3644 + Static162.anInt3644 + 3];
		@Pc(50) int local50;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(93) int local93;
		@Pc(97) int local97;
		for (@Pc(47) int local47 = 128; local47 <= 384; local47 += 32) {
			for (local50 = 0; local50 < 2048; local50 += 64) {
				Static14.anInt320 = Class3_Sub1_Sub4_Sub2.anIntArray188[local47];
				Static21.anInt512 = Class3_Sub1_Sub4_Sub2.anIntArray190[local47];
				Static112.anInt2518 = Class3_Sub1_Sub4_Sub2.anIntArray188[local50];
				Static112.anInt2527 = Class3_Sub1_Sub4_Sub2.anIntArray190[local50];
				local73 = (local47 - 128) / 32;
				local77 = local50 / 64;
				for (local82 = -(Static162.anInt3644 + 1); local82 <= Static162.anInt3644 + 1; local82++) {
					for (@Pc(88) int local88 = -(Static162.anInt3644 + 1); local88 <= Static162.anInt3644 + 1; local88++) {
						local93 = local82 * 128;
						local97 = local88 * 128;
						@Pc(99) boolean local99 = false;
						for (@Pc(102) int local102 = -500; local102 <= 800; local102 += 128) {
							if (Static59.method887(local93, arg0[local73] + local102, local97)) {
								local99 = true;
								break;
							}
						}
						local45[local73][local77][local82 + Static162.anInt3644 + 1][local88 + Static162.anInt3644 + 1] = local99;
					}
				}
			}
		}
		for (local50 = 0; local50 < 8; local50++) {
			for (local73 = 0; local73 < 32; local73++) {
				for (local77 = -Static162.anInt3644; local77 < Static162.anInt3644; local77++) {
					for (local82 = -Static162.anInt3644; local82 < Static162.anInt3644; local82++) {
						@Pc(174) boolean local174 = false;
						label76: for (local93 = -1; local93 <= 1; local93++) {
							for (local97 = -1; local97 <= 1; local97++) {
								if (local45[local50][local73][local77 + local93 + Static162.anInt3644 + 1][local82 + local97 + Static162.anInt3644 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50][(local73 + 1) % 31][local77 + local93 + Static162.anInt3644 + 1][local82 + local97 + Static162.anInt3644 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][local73][local77 + local93 + Static162.anInt3644 + 1][local82 + local97 + Static162.anInt3644 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][(local73 + 1) % 31][local77 + local93 + Static162.anInt3644 + 1][local82 + local97 + Static162.anInt3644 + 1]) {
									local174 = true;
									break label76;
								}
							}
						}
						Static133.aBooleanArrayArrayArrayArray1[local50][local73][local77 + Static162.anInt3644][local82 + Static162.anInt3644] = local174;
					}
				}
			}
		}
	}
}

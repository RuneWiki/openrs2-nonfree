import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!o", name = "db", descriptor = "[Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array6;

	@OriginalMember(owner = "client!o", name = "fb", descriptor = "Lclient!hf;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!o", name = "ib", descriptor = "Lclient!gd;")
	public static Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!o", name = "ob", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "client!o", name = "qb", descriptor = "[Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array7;

	@OriginalMember(owner = "client!o", name = "eb", descriptor = "Lclient!ad;")
	public static Class5 aClass5_18 = new Class5();

	@OriginalMember(owner = "client!o", name = "hb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1064 = Static59.method1195("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!o", name = "kb", descriptor = "I")
	public static int anInt2518 = 0;

	@OriginalMember(owner = "client!o", name = "lb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1065 = null;

	@OriginalMember(owner = "client!o", name = "mb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1066 = Static59.method1195("Stufe)2");

	@OriginalMember(owner = "client!o", name = "nb", descriptor = "[I")
	public static int[] anIntArray251 = new int[1000];

	@OriginalMember(owner = "client!o", name = "rb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1067 = Static59.method1195("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method1620(@OriginalArg(0) KeyEvent arg0) {
		@Pc(11) int local11 = arg0.getKeyChar();
		if (local11 == 8364) {
			return 128;
		} else {
			if (local11 <= 0 || local11 >= 256) {
				local11 = -1;
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	public static void method1622() {
		if (Static64.anInt2045 != 0 && Static64.anInt2045 != 3 || Static112.anInt3110 != 1) {
			return;
		}
		@Pc(32) int local32 = Static84.anInt2576 - 4 - 5;
		@Pc(36) int local36 = Static130.anInt3486 - 575;
		if (local36 < 0 || local32 < 0 || local36 >= 146 || local32 >= 151) {
			return;
		}
		local36 -= 73;
		local32 -= 75;
		@Pc(59) int local59 = Static39.anInt1294 + Static107.anInt3040 & 0x7FF;
		@Pc(63) int local63 = Class3_Sub1_Sub2_Sub1.anIntArray41[local59];
		@Pc(71) int local71 = local63 * (Static43.anInt1424 + 256) >> 8;
		@Pc(75) int local75 = Class3_Sub1_Sub2_Sub1.anIntArray39[local59];
		@Pc(83) int local83 = local75 * (Static43.anInt1424 + 256) >> 8;
		@Pc(94) int local94 = local83 * local32 - local36 * local71 >> 11;
		@Pc(104) int local104 = local36 * local83 + local32 * local71 >> 11;
		@Pc(112) int local112 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 - local94 >> 7;
		@Pc(119) int local119 = local104 + Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 >> 7;
		@Pc(139) boolean local139 = Static67.method1378(local119, true, 0, 0, 1, 0, 0, 0, local112, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
		if (!local139) {
			return;
		}
		Static81.aClass3_Sub12_Sub1_2.method1937(local36);
		Static81.aClass3_Sub12_Sub1_2.method1937(local32);
		Static81.aClass3_Sub12_Sub1_2.method1922(Static107.anInt3040);
		Static81.aClass3_Sub12_Sub1_2.method1937(57);
		Static81.aClass3_Sub12_Sub1_2.method1937(Static39.anInt1294);
		Static81.aClass3_Sub12_Sub1_2.method1937(Static43.anInt1424);
		Static81.aClass3_Sub12_Sub1_2.method1937(89);
		Static81.aClass3_Sub12_Sub1_2.method1922(Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524);
		Static81.aClass3_Sub12_Sub1_2.method1922(Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494);
		Static81.aClass3_Sub12_Sub1_2.method1937(Static100.anInt2951);
		Static81.aClass3_Sub12_Sub1_2.method1937(63);
		return;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
	public static void method1624() {
		aClass60_1064 = null;
		aClass3_Sub1_Sub2_Sub2_3 = null;
		anIntArray252 = null;
		anIntArray251 = null;
		aClass3_Sub1_Sub2_Sub4Array7 = null;
		aClass60_1067 = null;
		aClass3_Sub1_Sub2_Sub4Array6 = null;
		aClass28_1 = null;
		aClass60_1066 = null;
		aClass60_1065 = null;
		aClass5_18 = null;
	}
}

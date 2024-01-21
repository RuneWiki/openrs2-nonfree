import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics3;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Lclient!rd;")
	public static Class8 aClass8_3;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_15;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "Lclient!mc;")
	public static Class33_Sub1 aClass33_Sub1_31;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "Lclient!wb;")
	public static Class65 aClass65_853 = Static24.method441("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!da", name = "g", descriptor = "[I")
	public static int[] anIntArray256 = new int[50];

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Lclient!wb;")
	public static Class65 aClass65_854 = Static24.method441("@or3@");

	@OriginalMember(owner = "client!da", name = "u", descriptor = "I")
	public static int anInt1890 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method1099() {
		if (Static24.anInt717 != 0 || Static101.anInt2793 != 1) {
			return;
		}
		@Pc(18) int local18 = Static89.anInt2559 - 25 - 550;
		@Pc(24) int local24 = Static32.anInt1044 - 5 - 4;
		if (local18 < 0 || local24 < 0 || local18 >= 146 || local24 >= 151) {
			return;
		}
		local18 -= 73;
		local24 -= 75;
		@Pc(48) int local48 = Static3.anInt160 + Static71.anInt2176 & 0x7FF;
		@Pc(52) int local52 = Class2_Sub1_Sub4_Sub1.anIntArray55[local48];
		@Pc(60) int local60 = local52 * (Static98.anInt2758 + 256) >> 8;
		@Pc(64) int local64 = Class2_Sub1_Sub4_Sub1.anIntArray56[local48];
		@Pc(72) int local72 = (Static98.anInt2758 + 256) * local64 >> 8;
		@Pc(82) int local82 = local72 * local18 + local60 * local24 >> 11;
		@Pc(92) int local92 = local72 * local24 - local18 * local60 >> 11;
		@Pc(100) int local100 = Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518 + local82 >> 7;
		@Pc(108) int local108 = Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562 - local92 >> 7;
		@Pc(128) boolean local128 = Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 0, 0, 0, 1, 0, true, local100, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local108);
		if (!local128) {
			return;
		}
		Static12.aClass2_Sub8_Sub1_8.method1375(local18);
		Static12.aClass2_Sub8_Sub1_8.method1375(local24);
		Static12.aClass2_Sub8_Sub1_8.method1398(Static3.anInt160);
		Static12.aClass2_Sub8_Sub1_8.method1375(57);
		Static12.aClass2_Sub8_Sub1_8.method1375(Static71.anInt2176);
		Static12.aClass2_Sub8_Sub1_8.method1375(Static98.anInt2758);
		Static12.aClass2_Sub8_Sub1_8.method1375(89);
		Static12.aClass2_Sub8_Sub1_8.method1398(Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518);
		Static12.aClass2_Sub8_Sub1_8.method1398(Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562);
		Static12.aClass2_Sub8_Sub1_8.method1375(Static85.anInt2462);
		Static12.aClass2_Sub8_Sub1_8.method1375(63);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	public static void method1100() {
		Static39.anInt1251 = 0;
		Static12.anInt416 = 0;
		Static30.method569();
		Static15.method311();
		Static98.method1701();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static12.anInt416; local21++) {
			local27 = Static68.anIntArray276[local21];
			if (Static108.anInt2902 != Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local27].anInt1544) {
				Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local27].aClass2_Sub1_Sub11_1 = null;
				Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local27] = null;
			}
		}
		if (Static59.aClass2_Sub8_Sub1_19.anInt2342 != Static57.anInt1718) {
			throw new RuntimeException("gnp1 pos:" + Static59.aClass2_Sub8_Sub1_19.anInt2342 + " psize:" + Static57.anInt1718);
		}
		for (local27 = 0; local27 < Static51.anInt1482; local27++) {
			if (Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[Static23.anIntArray92[local27]] == null) {
				throw new RuntimeException("gnp2 pos:" + local27 + " size:" + Static51.anInt1482);
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!k;Lclient!k;ILclient!k;)V")
	public static void method1101(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(3) Class33 arg2) {
		Static22.aClass33_7 = arg0;
		Static38.aClass33_15 = arg1;
		Static51.aClass33_24 = arg2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIII)I")
	public static int method1102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class2_Sub1_Sub4_Sub1.anIntArray56[arg3 * 1024 / arg0] >> 1;
		return ((65536 - local21) * arg2 >> 16) + (local21 * arg1 >> 16);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	public static void method1103() {
		aClass2_Sub1_Sub4_Sub3_15 = null;
		aClass65_854 = null;
		aClass33_Sub1_31 = null;
		aClass65_853 = null;
		anIntArray256 = null;
		aFontMetrics3 = null;
		aClass8_3 = null;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	public static void method1106() {
		Static12.aClass2_Sub8_Sub1_8.method1425(245);
		if (Static89.anInt2549 != -1) {
			Static98.method1695(Static89.anInt2549);
			Static89.anInt2549 = -1;
			aBoolean99 = true;
			Static85.anInt2453 = -1;
			Static22.aBoolean46 = true;
		}
		if (Static21.anInt2494 != -1) {
			Static98.method1695(Static21.anInt2494);
			Static21.anInt2494 = -1;
			Static107.aBoolean156 = true;
			Static85.anInt2453 = -1;
		}
		if (Static96.anInt2688 != -1) {
			Static98.method1695(Static96.anInt2688);
			Static96.anInt2688 = -1;
			Static76.method1307(30);
		}
		if (Static46.anInt1375 != -1) {
			Static98.method1695(Static46.anInt1375);
			Static46.anInt1375 = -1;
		}
		if (Static98.anInt2770 != -1) {
			Static98.method1695(Static98.anInt2770);
			Static98.anInt2770 = -1;
			Static85.anInt2453 = -1;
		}
	}
}

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!kv", name = "H", descriptor = "I")
	public static int anInt7821;

	@OriginalMember(owner = "client!kv", name = "K", descriptor = "I")
	public static int anInt7824;

	@OriginalMember(owner = "client!kv", name = "C", descriptor = "Lclient!de;")
	public static final Class69 aClass69_47 = new Class69(8);

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
	public static void method6851() {
		Static376.anInt6481 = 0;
		@Pc(13) int local13 = Static327.aClass2_Sub17_Sub1_1.method2825();
		@Pc(17) int local17 = Static327.aClass2_Sub17_Sub1_1.method2888();
		@Pc(21) int local21 = Static327.aClass2_Sub17_Sub1_1.method2876();
		@Pc(30) boolean local30 = Static327.aClass2_Sub17_Sub1_1.method2865() == 1;
		Static150.method2653();
		Static33.method733(local17);
		@Pc(45) int local45 = (Static245.anInt4755 - Static327.aClass2_Sub17_Sub1_1.anInt3378) / 16;
		Static28.anIntArrayArray115 = new int[local45][4];
		@Pc(55) int local55;
		for (@Pc(51) int local51 = 0; local51 < local45; local51++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static28.anIntArrayArray115[local51][local55] = Static327.aClass2_Sub17_Sub1_1.method2881();
			}
		}
		Static80.anIntArray148 = new int[local45];
		Static635.anIntArray728 = new int[local45];
		Static94.aByteArrayArray5 = new byte[local45][];
		Static291.aByteArrayArray14 = new byte[local45][];
		Static326.anIntArray366 = new int[local45];
		Static461.anIntArray517 = null;
		Static87.anIntArray158 = new int[local45];
		Static641.aByteArrayArray27 = new byte[local45][];
		Static555.anIntArray663 = new int[local45];
		Static502.aByteArrayArray26 = null;
		Static187.aByteArrayArray8 = new byte[local45][];
		local45 = 0;
		for (local55 = (local21 - (Static456.anInt7428 >> 4)) / 8; local55 <= (local21 + (Static456.anInt7428 >> 4)) / 8; local55++) {
			for (@Pc(133) int local133 = (local13 - (Static5.anInt112 >> 4)) / 8; local133 <= ((Static5.anInt112 >> 4) + local13) / 8; local133++) {
				Static635.anIntArray728[local45] = local133 + (local55 << 8);
				Static87.anIntArray158[local45] = Static122.aClass238_58.method5575("m" + local55 + "_" + local133);
				Static326.anIntArray366[local45] = Static122.aClass238_58.method5575("l" + local55 + "_" + local133);
				Static80.anIntArray148[local45] = Static122.aClass238_58.method5575("um" + local55 + "_" + local133);
				Static555.anIntArray663[local45] = Static122.aClass238_58.method5575("ul" + local55 + "_" + local133);
				local45++;
			}
		}
		Static183.method3129(local30, local21, 11, local13);
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)I")
	public static int method6852() {
		@Pc(16) byte local16;
		if (Static79.anInt2093 >= 96) {
			@Pc(9) int local9 = Static189.method3248();
			if (local9 <= 100) {
				Static140.method2560();
				local16 = 4;
			} else if (local9 <= 500) {
				Static46.method4896();
				local16 = 3;
			} else if (local9 > 1000) {
				Static519.method7228();
				local16 = 1;
			} else {
				local16 = 2;
				Static74.method7156();
			}
		} else {
			Static519.method7228();
			local16 = 1;
		}
		if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() != 0) {
			Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub28_2, 0);
			Static99.method1936(false, 0);
		}
		Static531.method7366();
		return local16;
	}

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "(I)V")
	public static void method6853() {
		@Pc(1) Class69 local1 = Static570.aClass69_60;
		synchronized (Static570.aClass69_60) {
			Static570.aClass69_60.method1905();
		}
		local1 = Static86.aClass69_10;
		synchronized (Static86.aClass69_10) {
			Static86.aClass69_10.method1905();
		}
	}
}

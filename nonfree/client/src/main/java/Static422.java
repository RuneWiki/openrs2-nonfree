import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "Lclient!mt;")
	public static final Class165 aClass165_18 = new Class165(1, 2, 2, 0);

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_109 = new Class142("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "Z")
	public static boolean aBoolean591 = false;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)V")
	public static void method5393(@OriginalArg(1) int arg0) {
		Static406.method5233();
		Static252.method3559();
		Static279.method3752(arg0, true);
		Static8.method133(Static178.aClass185_49, Static186.aClass117_3, Static386.aClass185_118);
		Static27.method392(Static178.aClass185_49, Static186.aClass117_3);
		Static23.method351();
		Static379.method132(Static251.aClass85Array7);
		Static186.method2688();
		Static443.method5528();
		if (Static135.anInt2114 == 2) {
			Static154.method1923(3);
		} else if (Static135.anInt2114 == 6) {
			Static154.method1923(7);
		} else if (Static135.anInt2114 == 9) {
			Static154.method1923(10);
			return;
		} else if (Static135.anInt2114 == 1) {
			Static236.method3367(Static178.aClass185_49, Static186.aClass117_3);
			return;
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
	public static void method5394() {
		Static70.anInt4903 = 0;
		@Pc(11) int local11 = Static413.aClass1_Sub19_Sub2_1.method2919();
		@Pc(15) int local15 = Static413.aClass1_Sub19_Sub2_1.method2892();
		@Pc(19) int local19 = Static413.aClass1_Sub19_Sub2_1.method2896();
		@Pc(30) boolean local30 = Static413.aClass1_Sub19_Sub2_1.method2928() == 1;
		Static113.method1405();
		Static405.method5211(local11);
		@Pc(43) int local43 = (Static379.anInt119 - Static413.aClass1_Sub19_Sub2_1.anInt3698) / 16;
		Static438.anIntArrayArray52 = new int[local43][4];
		@Pc(53) int local53;
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static438.anIntArrayArray52[local49][local53] = Static413.aClass1_Sub19_Sub2_1.method2877();
			}
		}
		Static275.anIntArray353 = new int[local43];
		Static10.anIntArray385 = new int[local43];
		Static106.aByteArrayArray152 = null;
		Static292.anIntArray369 = new int[local43];
		Static172.aByteArrayArray56 = new byte[local43][];
		Static401.aByteArrayArray128 = new byte[local43][];
		Static334.anIntArray397 = new int[local43];
		Static114.anIntArray155 = null;
		Static161.aByteArrayArray51 = new byte[local43][];
		Static457.aByteArrayArray148 = new byte[local43][];
		Static26.anIntArray60 = new int[local43];
		local43 = 0;
		for (local53 = (local19 - (Static147.anInt2300 >> 4)) / 8; local53 <= ((Static147.anInt2300 >> 4) + local19) / 8; local53++) {
			for (@Pc(127) int local127 = (local15 - (Static293.anInt4886 >> 4)) / 8; local127 <= (local15 + (Static293.anInt4886 >> 4)) / 8; local127++) {
				Static334.anIntArray397[local43] = (local53 << 8) + local127;
				Static292.anIntArray369[local43] = Static210.aClass185_119.method4005("m" + local53 + "_" + local127);
				Static26.anIntArray60[local43] = Static210.aClass185_119.method4005("l" + local53 + "_" + local127);
				Static275.anIntArray353[local43] = Static210.aClass185_119.method4005("um" + local53 + "_" + local127);
				Static10.anIntArray385[local43] = Static210.aClass185_119.method4005("ul" + local53 + "_" + local127);
				local43++;
			}
		}
		Static282.method3774(10, local19, local30, local15);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIII)I")
	public static int method5395(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg1;
		}
		@Pc(17) int local17 = 128 - arg0;
		@Pc(31) int local31 = (arg1 & 0x7F) * local17 + arg0 * (arg2 & 0x7F) >> 7;
		@Pc(54) int local54 = local17 * (arg1 & 0x380) + arg0 * (arg2 & 0x380) >> 7;
		@Pc(68) int local68 = (arg2 & 0xFC00) * arg0 + (arg1 & 0xFC00) * local17 >> 7;
		return local31 & 0x7F | local54 & 0x380 | local68 & 0xFC00;
	}
}

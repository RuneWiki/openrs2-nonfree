import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!hia", name = "l", descriptor = "Lclient!hda;")
	public static Class144 aClass144_2;

	@OriginalMember(owner = "client!hia", name = "u", descriptor = "Lclient!uq;")
	public static Class362 aClass362_48;

	@OriginalMember(owner = "client!hia", name = "r", descriptor = "I")
	public static int anInt3963 = 0;

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method3384(@OriginalArg(0) Class95 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static498.aBoolean757) {
			local7 = Static84.method1336();
			local9 = Static614.method8324();
		}
		Static213.method3149(Static517.anInt8133 + local7, Static204.anInt3590, Static532.anInt8336, Static508.anInt8006 + local9, arg0);
		Static293.aClass67_14.method7684(-10660793, Static517.anInt8133 + local7 + 3, Static508.anInt8006 + local9 + 14, Static114.aClass84_24.method1729(Static654.anInt10668), -1);
		@Pc(66) int local66 = Static627.aClass48_1.method7512() + local7;
		@Pc(72) int local72 = local9 + Static627.aClass48_1.method7511();
		@Pc(76) int local76;
		@Pc(93) int local93;
		if (Static599.aBoolean544) {
			local76 = 0;
			for (@Pc(81) Class3_Sub5_Sub13 local81 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5459(); local81 != null; local81 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5453()) {
				local93 = local76 * 16 + local9 + Static508.anInt8006 + 31;
				local76++;
				if (local81.anInt6245 == 1) {
					Static104.method1687(local66, -256, arg0, -1, local72, local7 + Static517.anInt8133, Static532.anInt8336, Static204.anInt3590, local93, local9 + Static508.anInt8006, (Class3_Sub5_Sub18) local81.aClass243_10.aClass3_Sub5_44.aClass3_Sub5_66);
				} else {
					Static471.method6274(local72, local93, local7 + Static517.anInt8133, local66, arg0, -1, Static532.anInt8336, -256, Static204.anInt3590, local9 + Static508.anInt8006, local81);
				}
			}
			if (Static352.aClass3_Sub5_Sub13_1 != null) {
				Static213.method3149(Static453.anInt7304, Static515.anInt8106, Static473.anInt7547, Static3.anInt15, arg0);
				Static293.aClass67_14.method7684(-10660793, Static453.anInt7304 + 3, Static3.anInt15 - -14, Static352.aClass3_Sub5_Sub13_1.aString79, -1);
				local76 = 0;
				for (@Pc(177) Class3_Sub5_Sub18 local177 = (Class3_Sub5_Sub18) Static352.aClass3_Sub5_Sub13_1.aClass243_10.method5459(); local177 != null; local177 = (Class3_Sub5_Sub18) Static352.aClass3_Sub5_Sub13_1.aClass243_10.method5453()) {
					@Pc(187) int local187 = local76 * 16 + Static3.anInt15 + 31;
					Static104.method1687(local66, -256, arg0, -1, local72, Static453.anInt7304, Static473.anInt7547, Static515.anInt8106, local187, Static3.anInt15, local177);
					local76++;
				}
				Static387.method5432(Static453.anInt7304, Static515.anInt8106, Static473.anInt7547, Static3.anInt15);
			}
		} else {
			local76 = 0;
			for (@Pc(224) Class3_Sub5_Sub18 local224 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6603(); local224 != null; local224 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6605()) {
				local93 = (Static166.anInt3037 - local76 - 1) * 16 + Static508.anInt8006 + local9 + 31;
				Static104.method1687(local66, -256, arg0, -1, local72, Static517.anInt8133 + local7, Static532.anInt8336, Static204.anInt3590, local93, Static508.anInt8006 + local9, local224);
				local76++;
			}
		}
		Static387.method5432(local7 + Static517.anInt8133, Static204.anInt3590, Static532.anInt8336, local9 + Static508.anInt8006);
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)V")
	public static void method3385() {
		if (Static221.anInt3831 == 7) {
			Static316.method4541(false);
		} else {
			Static673.aClass26_2 = Static12.aClass26_1;
			Static12.aClass26_1 = null;
			Static279.method4069(13);
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)V")
	public static void method3386() {
		Static174.aClass302_16 = new Class302();
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIB)Z")
	public static boolean method3387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(II)I")
	public static int method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static510.aByteArrayArray12 == null ? 0 : Static510.aByteArrayArray12[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(III)I")
	public static int method3389(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static678.method9028(arg0 - 1, arg1 + -1) + Static678.method9028(arg0 + 1, arg1 + -1) + Static678.method9028(arg0 - 1, arg1 - -1) + Static678.method9028(arg0 + 1, arg1 + 1);
		@Pc(75) int local75 = Static678.method9028(arg0 - 1, arg1) + Static678.method9028(arg0 + 1, arg1) + Static678.method9028(arg0, arg1 - 1) + Static678.method9028(arg0, arg1 + 1);
		@Pc(80) int local80 = Static678.method9028(arg0, arg1);
		return local80 / 4 + local46 / 16 + local75 / 8;
	}

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)V")
	public static void method3390() {
		Static62.method1135();
		Static498.aBoolean757 = false;
	}
}

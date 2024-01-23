import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
	public static int anInt1312;

	@OriginalMember(owner = "client!fk", name = "V", descriptor = "[I")
	public static int[] anIntArray235;

	@OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
	public static int anInt1313 = -1;

	@OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
	public static int anInt1316 = 0;

	@OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
	public static int anInt1320 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!qe;B)V")
	public static void method1078(@OriginalArg(0) int arg0, @OriginalArg(1) Class78 arg1) {
		Static161.aClass2_Sub23_Sub1_5.method2155(60);
		Static161.aClass2_Sub23_Sub1_5.method2132(arg0);
		Static161.aClass2_Sub23_Sub1_5.method2116(arg1.method3016());
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V")
	public static void method1082() {
		if (Static121.aBooleanArray133[98]) {
			Static186.anInt4337 += (12 - Static186.anInt4337) / 2;
		} else if (Static121.aBooleanArray133[99]) {
			Static186.anInt4337 += (-Static186.anInt4337 - 12) / 2;
		} else {
			Static186.anInt4337 /= 2;
		}
		if (Static121.aBooleanArray133[96]) {
			Static113.anInt2488 += (-Static113.anInt2488 - 24) / 2;
		} else if (Static121.aBooleanArray133[97]) {
			Static113.anInt2488 += (24 - Static113.anInt2488) / 2;
		} else {
			Static113.anInt2488 /= 2;
		}
		@Pc(72) int local72 = Static33.anInt573 + Static31.aClass5_Sub2_Sub2_1.anInt1849;
		Static114.anInt2557 += Static186.anInt4337 / 2;
		Static140.anInt3197 += Static113.anInt2488 / 2;
		@Pc(93) int local93 = Static31.aClass5_Sub2_Sub2_1.anInt1827 + Static226.anInt4901;
		if (Static86.anInt1939 - local72 < -500 || Static86.anInt1939 - local72 > 500 || Static124.anInt2829 - local93 < -500 || Static124.anInt2829 - local93 > 500) {
			Static86.anInt1939 = local72;
			Static124.anInt2829 = local93;
		}
		if (local72 != Static86.anInt1939) {
			Static86.anInt1939 += (local72 - Static86.anInt1939) / 16;
		}
		if (Static124.anInt2829 != local93) {
			Static124.anInt2829 += (local93 - Static124.anInt2829) / 16;
		}
		Static13.method232();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!fd;Lclient!oe;ZLclient!oe;Z)V")
	public static void method1083(@OriginalArg(0) Class2_Sub3_Sub7_Sub1_Sub1 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(3) Class72 arg2, @OriginalArg(4) boolean arg3) {
		Static223.aClass72_283 = arg1;
		Static178.aClass72_244 = arg2;
		Static98.aBoolean80 = arg3;
		@Pc(19) int local19 = Static223.aClass72_283.method3182() - 1;
		Static34.anInt575 = local19 * 256 + Static223.aClass72_283.method3177(local19);
		Static216.aClass2_Sub3_Sub7_Sub1_Sub1_4 = arg0;
	}
}

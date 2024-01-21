import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!nb", name = "ib", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_75;

	@OriginalMember(owner = "client!nb", name = "mb", descriptor = "I")
	public static int anInt1781;

	@OriginalMember(owner = "client!nb", name = "Pb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!nb", name = "V", descriptor = "Lclient!hb;")
	public static Class27 aClass27_868 = Static87.method1648("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!nb", name = "jb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_870 = Static87.method1648("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!nb", name = "pb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_871 = Static87.method1648("redstone3");

	@OriginalMember(owner = "client!nb", name = "ub", descriptor = "I")
	public static int anInt1787 = 0;

	@OriginalMember(owner = "client!nb", name = "wb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_872 = Static87.method1648("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!nb", name = "Jb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_873 = Static87.method1648("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!nb", name = "Vb", descriptor = "I")
	public static int anInt1808 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!td;Lclient!td;B)I")
	public static int method1265(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1) {
		@Pc(1) int local1 = 0;
		if (arg0.method1608(Static76.aClass27_1011, Static81.aClass27_1042)) {
			local1++;
		}
		if (arg1.method1608(Static76.aClass27_1011, Static97.aClass27_1082)) {
			local1++;
		}
		if (arg1.method1608(Static76.aClass27_1011, Static56.aClass27_712)) {
			local1++;
		}
		if (arg1.method1608(Static76.aClass27_1011, Static12.aClass27_148)) {
			local1++;
		}
		if (arg1.method1608(Static76.aClass27_1011, Static104.aClass27_1312)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)V")
	public static void method1266() {
		aClass3_Sub3_Sub2_Sub4_75 = null;
		aClass27_868 = null;
		aClass27_872 = null;
		aClass27_871 = null;
		aClass27_873 = null;
		aByteArrayArrayArray5 = null;
		aClass27_870 = null;
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V")
	public static void method1269() {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = -1; local3 < Static104.anInt2718; local3++) {
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static99.anIntArray387[local3];
			}
			@Pc(21) Class3_Sub3_Sub1_Sub4_Sub2 local21 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local11];
			if (local21 != null && local21.anInt2400 > 0) {
				local21.anInt2400--;
				if (local21.anInt2400 == 0) {
					local21.aClass27_1138 = null;
				}
			}
		}
		for (local11 = 0; local11 < Static104.anInt2724; local11++) {
			@Pc(56) int local56 = Static85.anIntArray349[local11];
			@Pc(60) Class3_Sub3_Sub1_Sub4_Sub1 local60 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local56];
			if (local60 != null && local60.anInt2400 > 0) {
				local60.anInt2400--;
				if (local60.anInt2400 == 0) {
					local60.aClass27_1138 = null;
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_114 = new Class268(114, 10);

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_115 = new Class268(3, 10);

	@OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
	public static int anInt6586 = -1;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I")
	public static int method5659(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)V")
	public static void method5660(@OriginalArg(1) int arg0) {
		if (Static43.anInt862 == arg0) {
			return;
		}
		Static442.anInt7975 = Static284.anInt7916 = Static48.anIntArray58[arg0];
		Static343.method5556();
		Static246.anIntArrayArrayArray2 = new int[4][Static442.anInt7975 >> 3][Static284.anInt7916 >> 3];
		Static7.anIntArrayArray1 = new int[Static442.anInt7975][Static284.anInt7916];
		Static394.anIntArrayArray30 = new int[Static442.anInt7975][Static284.anInt7916];
		for (@Pc(45) int local45 = 0; local45 < 4; local45++) {
			Static619.aClass319Array1[local45] = Static47.method853(Static284.anInt7916, Static442.anInt7975);
		}
		Static312.aByteArrayArrayArray17 = new byte[4][Static442.anInt7975][Static284.anInt7916];
		Static486.method7258(Static284.anInt7916, Static442.anInt7975);
		Static637.method8952(Static162.aClass100_7, Static442.anInt7975 >> 3, Static284.anInt7916 >> 3);
		Static43.anInt862 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!nc", name = "cb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_992 = Static146.method2172("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!qf;I)V")
	public static void method1829(@OriginalArg(0) Class66 arg0) {
		@Pc(2) int local2 = arg0.anInt3224;
		if (local2 == 324) {
			if (Static72.anInt1926 == -1) {
				Static107.anInt2648 = arg0.anInt3232;
				Static72.anInt1926 = arg0.anInt3216;
			}
			if (Static56.aClass1_1.aBoolean1) {
				arg0.anInt3216 = Static72.anInt1926;
			} else {
				arg0.anInt3216 = Static107.anInt2648;
			}
		} else if (local2 == 325) {
			if (Static72.anInt1926 == -1) {
				Static107.anInt2648 = arg0.anInt3232;
				Static72.anInt1926 = arg0.anInt3216;
			}
			if (Static56.aClass1_1.aBoolean1) {
				arg0.anInt3216 = Static107.anInt2648;
			} else {
				arg0.anInt3216 = Static72.anInt1926;
			}
		} else if (local2 == 327) {
			arg0.anInt3235 = 150;
			arg0.anInt3220 = (int) (Math.sin((double) Static143.anInt3513 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3183 = -1;
			arg0.anInt3187 = 5;
		} else if (local2 == 328) {
			arg0.anInt3235 = 150;
			arg0.anInt3220 = (int) (Math.sin((double) Static143.anInt3513 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3187 = 5;
			arg0.anInt3183 = ((int) Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.aClass77_1482.method2531() << 11) + 2047;
		}
	}

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "(I)V")
	public static void method1830() {
		aClass77_992 = null;
	}

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "(I)I")
	public static int method1831() {
		return Static70.anInt1893++;
	}
}

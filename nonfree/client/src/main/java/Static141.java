import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
	public static int anInt3004 = 0;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
	public static int anInt3005 = 0;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!vg;")
	public static Class85 aClass85_12 = null;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	public static int anInt3006 = 0;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1356 = Static32.method683("_");

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "[I")
	public static int[] anIntArray281 = new int[128];

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1357 = Static32.method683("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
	public static int anInt3010 = 0;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1358 = Static32.method683("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1359 = Static32.method683("Hidden");

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1360 = aClass49_1359;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public static void method2339() {
		aClass49_1360 = null;
		aClass85_12 = null;
		aClass49_1359 = null;
		aClass49_1358 = null;
		anIntArray281 = null;
		aClass49_1356 = null;
		aClass49_1357 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method2340(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static123.anInt2726 > 0) {
			local21 = Static64.aByteArrayArray7[--Static123.anInt2726];
			Static64.aByteArrayArray7[Static123.anInt2726] = null;
			return local21;
		} else if (arg0 == 5000 && Static178.anInt3906 > 0) {
			local21 = Static30.aByteArrayArray4[--Static178.anInt3906];
			Static30.aByteArrayArray4[Static178.anInt3906] = null;
			return local21;
		} else if (arg0 == 30000 && Static158.anInt3454 > 0) {
			local21 = Static87.aByteArrayArray11[--Static158.anInt3454];
			Static87.aByteArrayArray11[Static158.anInt3454] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}
}

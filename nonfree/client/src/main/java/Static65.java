import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!da", name = "b", descriptor = "F")
	public static float aFloat228;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "[B")
	public static byte[] aByteArray222;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "I")
	public static int anInt7824;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "I")
	public static int anInt7829 = 0;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "Z")
	public static boolean aBoolean667 = false;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method6070(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static250.anInt4056 = 7;
		Static284.anInt5177 = 0x1 << Static250.anInt4056;
		Static176.anInt3421 = Static284.anInt5177 >> 1;
		Static195.anInt3812 = (int) Math.sqrt((double) (Static176.anInt3421 * Static176.anInt3421 + Static176.anInt3421 * Static176.anInt3421));
		Static412.anInt7193 = Static284.anInt5177 >> 2;
		Static102.anInt2184 = Static284.anInt5177;
		Static86.anInt2009 = arg0;
		Static360.anInt6340 = arg1;
		Static178.anInt3432 = arg2;
		Static79.aClass113ArrayArrayArray2 = new Class113[4][Static86.anInt2009][Static360.anInt6340];
		Static72.aClass106Array4 = new Class106[4];
		if (arg3) {
			Static72.anIntArrayArray29 = new int[Static86.anInt2009][Static360.anInt6340];
			Static87.aByteArrayArray6 = new byte[Static86.anInt2009][Static360.anInt6340];
			Static280.aByteArrayArray15 = new byte[Static86.anInt2009][Static360.anInt6340];
			Static3.aClass113ArrayArrayArray1 = new Class113[1][Static86.anInt2009][Static360.anInt6340];
			Static77.aClass106Array12 = new Class106[1];
		} else {
			Static72.anIntArrayArray29 = null;
			Static87.aByteArrayArray6 = null;
			Static280.aByteArrayArray15 = null;
			Static3.aClass113ArrayArrayArray1 = null;
			Static77.aClass106Array12 = null;
		}
		if (arg4) {
			Static427.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static77.aClass168Array9 = new Class168[65535];
			Static448.aBooleanArray54 = new boolean[65535];
			Static149.anInt2847 = 0;
		} else {
			Static427.aLongArrayArrayArray1 = null;
			Static77.aClass168Array9 = null;
			Static448.aBooleanArray54 = null;
			Static149.anInt2847 = 0;
		}
		Static215.method3334(false);
		Static325.aClass1Array2 = new Class1[1000];
		Static334.anInt5941 = 0;
		Static58.aClass1Array1 = new Class1[1000];
		Static268.anInt4957 = 0;
		Static162.anIntArrayArrayArray5 = new int[4][Static86.anInt2009 + 1][Static360.anInt6340 + 1];
		Static428.aClass4_Sub2Array3 = new Class4_Sub2[5000];
		Static450.anInt7838 = 0;
		Static348.aBooleanArrayArray7 = new boolean[Static178.anInt3432 + Static178.anInt3432 + 1][Static178.anInt3432 + Static178.anInt3432 + 1];
		Static24.aBooleanArrayArray1 = new boolean[Static178.anInt3432 + Static178.anInt3432 + 2][Static178.anInt3432 + Static178.anInt3432 + 2];
		Static151.aClass125_1 = null;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)Lclient!pn;")
	public static Class169 method6073() {
		try {
			return (Class169) Class.forName("Class169_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI[B)I")
	public static int method6075(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static322.method4616(arg1, 0, arg0);
	}
}

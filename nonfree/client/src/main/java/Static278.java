import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "Lclient!kn;")
	public static Class1_Sub2_Sub11_Sub2 aClass1_Sub2_Sub11_Sub2_5;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
	public static int anInt5374 = 0;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!fm;")
	public static Class49 aClass49_12 = new Class49(128);

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "Z")
	public static boolean aBoolean421 = true;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "[F")
	public static float[] aFloatArray28 = new float[4];

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)V")
	public static void method4232(@OriginalArg(1) int arg0) {
		Static258.anInt5077 = -1;
		Static258.anInt5077 = -1;
		if (arg0 == 37) {
			Static220.aFloat43 = 3.0F;
		} else if (arg0 == 50) {
			Static220.aFloat43 = 4.0F;
		} else if (arg0 == 75) {
			Static220.aFloat43 = 6.0F;
		} else if (arg0 == 100) {
			Static220.aFloat43 = 8.0F;
		} else if (arg0 == 200) {
			Static220.aFloat43 = 16.0F;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(CI)C")
	public static char method4233(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Lclient!kn;")
	public static Class1_Sub2_Sub11_Sub2 method4234() {
		@Pc(13) int local13 = Static44.anIntArray97[0] * Static31.anIntArray78[0];
		@Pc(17) byte[] local17 = Static268.aByteArrayArray13[0];
		@Pc(77) Class1_Sub2_Sub11_Sub2 local77;
		if (Static130.aBooleanArray29[0]) {
			@Pc(25) byte[] local25 = Static23.aByteArrayArray3[0];
			@Pc(28) int[] local28 = new int[local13];
			for (@Pc(30) int local30 = 0; local30 < local13; local30++) {
				local28[local30] = (local25[local30] & 0xFF) << 24 | Static133.anIntArray266[local17[local30] & 0xFF];
			}
			local77 = new Class1_Sub2_Sub11_Sub2_Sub1(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[0], Static289.anIntArray543[0], Static31.anIntArray78[0], Static44.anIntArray97[0], local28);
		} else {
			@Pc(82) int[] local82 = new int[local13];
			for (@Pc(84) int local84 = 0; local84 < local13; local84++) {
				local82[local84] = Static133.anIntArray266[local17[local84] & 0xFF];
			}
			local77 = new Class1_Sub2_Sub11_Sub2(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[0], Static289.anIntArray543[0], Static31.anIntArray78[0], Static44.anIntArray97[0], local82);
		}
		Static91.method1595();
		return local77;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
	public static void method4236(@OriginalArg(1) int arg0) {
		@Pc(2) Class138 local2 = Static48.aClass138_1;
		synchronized (Static48.aClass138_1) {
			Static244.anInt4846 = arg0;
		}
	}
}

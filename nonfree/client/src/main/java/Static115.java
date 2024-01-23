import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!il", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean188 = true;

	@OriginalMember(owner = "client!il", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32 = new String[1000];

	@OriginalMember(owner = "client!il", name = "q", descriptor = "[S")
	public static short[] aShortArray46 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!il", name = "t", descriptor = "I")
	public static int anInt2632 = 0;

	@OriginalMember(owner = "client!il", name = "u", descriptor = "Lclient!qc;")
	public static Class135 aClass135_12 = new Class135(64);

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(B)V")
	public static void method2092() {
		Static124.aClass77_1.method4027();
		@Pc(10) int local10;
		for (local10 = 0; local10 < 32; local10++) {
			Static18.aLongArray1[local10] = 0L;
		}
		for (local10 = 0; local10 < 32; local10++) {
			Static84.aLongArray2[local10] = 0L;
		}
		Static109.anInt2543 = 0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)[Lclient!pn;")
	public static Class1_Sub2_Sub11[] method2093() {
		@Pc(8) Class1_Sub2_Sub11[] local8 = new Class1_Sub2_Sub11[Static199.anInt4056];
		for (@Pc(15) int local15 = 0; local15 < Static199.anInt4056; local15++) {
			@Pc(30) int local30 = Static44.anIntArray97[local15] * Static31.anIntArray78[local15];
			@Pc(34) byte[] local34 = Static268.aByteArrayArray13[local15];
			@Pc(37) int[] local37 = new int[local30];
			for (@Pc(39) int local39 = 0; local39 < local30; local39++) {
				local37[local39] = Static133.anIntArray266[local34[local39] & 0xFF];
			}
			if (Static277.aBoolean412) {
				local8[local15] = new Class1_Sub2_Sub11_Sub1(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[local15], Static289.anIntArray543[local15], Static31.anIntArray78[local15], Static44.anIntArray97[local15], local37);
			} else {
				local8[local15] = new Class1_Sub2_Sub11_Sub2(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[local15], Static289.anIntArray543[local15], Static31.anIntArray78[local15], Static44.anIntArray97[local15], local37);
			}
		}
		Static91.method1595();
		return local8;
	}

	@OriginalMember(owner = "client!il", name = "f", descriptor = "(B)V")
	public static void method2094() {
		Static205.aClass135_23.method3324();
		Static232.aClass135_28.method3324();
	}
}

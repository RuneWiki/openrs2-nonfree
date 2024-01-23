import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "[S")
	public static short[] aShortArray13;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "[Lclient!te;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array6;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "Lclient!ia;")
	public static Class51 aClass51_423 = Static64.method1101("null");

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "[I")
	public static int[] anIntArray90 = new int[1000];

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
	public static int anInt1392 = 0;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "J")
	public static long aLong46 = 0L;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Lclient!ia;")
	public static Class51 aClass51_424 = Static64.method1101("compass");

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIZI)V")
	public static void method1049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static54.method933(arg0)) {
			Static209.method3455(arg3, arg2, arg1, -1, Static64.aClass71ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Lclient!ik;")
	public static Class1_Sub2_Sub10 method1051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class1_Sub2_Sub10 local20 = (Class1_Sub2_Sub10) Static194.aClass102_20.method3093((long) arg0 << 32 | (long) arg1);
		if (local20 == null) {
			local20 = new Class1_Sub2_Sub10(arg0, arg1);
			Static194.aClass102_20.method3083(local20, local20.aLong170);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLclient!fe;)V")
	public static void method1052(@OriginalArg(1) Class41_Sub1 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static179.anIntArray298.length; local9++) {
			Static179.anIntArray298[local9] = 0;
		}
		@Pc(41) int local41;
		for (@Pc(31) int local31 = 0; local31 < 5000; local31++) {
			local41 = (int) ((double) 256 * 128.0D * Math.random());
			Static179.anIntArray298[local41] = (int) (Math.random() * 284.0D);
		}
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(70) int local70;
		for (local41 = 0; local41 < 20; local41++) {
			for (local58 = 1; local58 < 255; local58++) {
				for (local62 = 1; local62 < 127; local62++) {
					local70 = (local58 << 7) + local62;
					Static50.anIntArray70[local70] = (Static179.anIntArray298[local70 + 128] + Static179.anIntArray298[local70 - 128] + Static179.anIntArray298[local70 - -1] + Static179.anIntArray298[local70 - 1]) / 4;
				}
			}
			@Pc(116) int[] local116 = Static179.anIntArray298;
			Static179.anIntArray298 = Static50.anIntArray70;
			Static50.anIntArray70 = local116;
		}
		if (arg0 == null) {
			return;
		}
		local58 = 0;
		for (local62 = 0; local62 < arg0.anInt1298; local62++) {
			for (local70 = 0; local70 < arg0.anInt1294; local70++) {
				if (arg0.aByteArray14[local58++] != 0) {
					@Pc(149) int local149 = arg0.anInt1297 + local70 + 16;
					@Pc(156) int local156 = local62 + arg0.anInt1293 + 16;
					@Pc(162) int local162 = local149 + (local156 << 7);
					Static179.anIntArray298[local162] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!mb;Z)V")
	public static void method1053(@OriginalArg(0) Class70 arg0) {
		if (Static151.aBoolean157) {
			return;
		}
		Static96.method1624();
		Static118.aClass1_Sub2_Sub1_4 = Static126.method2200(Static123.anInt2716, arg0);
		Static118.aClass1_Sub2_Sub1_4.method2067(-95, 0);
		Static146.aClass41_2 = Static25.method501(Static32.anInt706, arg0);
		Static146.aClass41_2.method969(382 - Static146.aClass41_2.anInt1294 / 2, 18);
		Static151.aBoolean157 = true;
	}
}

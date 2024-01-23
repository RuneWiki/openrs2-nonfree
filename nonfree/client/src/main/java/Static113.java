import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!le", name = "U", descriptor = "I")
	public static int anInt2595 = 0;

	@OriginalMember(owner = "client!le", name = "Y", descriptor = "Lclient!kh;")
	private static Class60 aClass60_851 = Static200.method3116("Loading textures )2 ");

	@OriginalMember(owner = "client!le", name = "V", descriptor = "Lclient!kh;")
	public static Class60 aClass60_850 = aClass60_851;

	@OriginalMember(owner = "client!le", name = "bb", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!le", name = "cb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_852 = Static200.method3116("3D)2Softwarebibliothek gestartet)3");

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V")
	public static void method1953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = -arg2;
		@Pc(10) int local10 = 0;
		Static104.method1768(arg0 - arg2, arg0 - -arg2, arg3, Static148.anIntArrayArray78[arg1]);
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = arg2;
		while (local28 > local10) {
			local26 += 2;
			local10++;
			local8 += local26;
			if (local8 >= 0) {
				local28--;
				@Pc(46) int[] local46 = Static148.anIntArrayArray78[arg1 + local28];
				local8 -= local28 << 1;
				@Pc(56) int local56 = local10 + arg0;
				@Pc(61) int local61 = arg0 - local10;
				@Pc(68) int[] local68 = Static148.anIntArrayArray78[arg1 - local28];
				Static104.method1768(local61, local56, arg3, local46);
				Static104.method1768(local61, local56, arg3, local68);
			}
			@Pc(86) int local86 = local28 + arg0;
			@Pc(91) int local91 = arg0 - local28;
			@Pc(97) int[] local97 = Static148.anIntArrayArray78[local10 + arg1];
			@Pc(104) int[] local104 = Static148.anIntArrayArray78[arg1 - local10];
			Static104.method1768(local91, local86, arg3, local97);
			Static104.method1768(local91, local86, arg3, local104);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BZII)Lclient!kh;")
	public static Class60 method1954(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(28) int local28 = arg1 / 10;
		@Pc(30) int local30 = 1;
		while (local28 != 0) {
			local30++;
			local28 /= 10;
		}
		@Pc(44) int local44 = local30;
		if (arg1 < 0 || arg0) {
			local44 = local30 + 1;
		}
		@Pc(55) byte[] local55 = new byte[local44];
		if (arg1 < 0) {
			local55[0] = 45;
		} else if (arg0) {
			local55[0] = 43;
		}
		for (@Pc(71) int local71 = 0; local71 < local30; local71++) {
			@Pc(82) int local82 = arg1 % 10;
			arg1 /= 10;
			if (local82 < 0) {
				local82 = -local82;
			}
			if (local82 > 9) {
				local82 += 39;
			}
			local55[local44 - local71 - 1] = (byte) (local82 + 48);
		}
		@Pc(119) Class60 local119 = new Class60();
		local119.aByteArray34 = local55;
		local119.anInt2439 = local44;
		return local119;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIII)V")
	public static void method1955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static214.anInt4572 <= arg2 - arg1 && arg1 + arg2 <= Static130.anInt2847 && Static141.anInt3163 <= arg3 - arg1 && arg1 + arg3 <= Static200.anInt4273) {
			Static155.method2626(arg2, arg5, arg0, arg4, arg1, arg3);
		} else {
			Static9.method3228(arg4, arg5, arg3, arg1, arg0, arg2);
		}
	}
}

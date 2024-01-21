import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
	public static int anInt4067 = 0;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "[I")
	public static int[] anIntArray462 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2433 = Static118.method2249("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B[B)[B")
	public static byte[] method3057(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class1_Sub14 local13 = new Class1_Sub14(arg0);
		@Pc(17) int local17 = local13.method1738();
		@Pc(21) int local21 = local13.method1700();
		if (local21 < 0 || Static55.anInt1486 != 0 && Static55.anInt1486 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(82) byte[] local82 = new byte[local21];
			local13.method1719(local21, local82);
			return local82;
		} else {
			@Pc(44) int local44 = local13.method1700();
			if (local44 < 0 || Static55.anInt1486 != 0 && Static55.anInt1486 < local44) {
				throw new RuntimeException();
			}
			@Pc(61) byte[] local61 = new byte[local44];
			if (local17 == 1) {
				Static17.method305(local61, local44, arg0, local21);
			} else {
				Static34.aClass85_1.method3030(local13, local61);
			}
			return local61;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Z")
	public static boolean method3059(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
	public static void method3063(@OriginalArg(0) int arg0) {
		Static148.anInt3490 = 50;
		Static39.anInt1069 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
	public static void method3065() {
		while (true) {
			@Pc(9) Class91 local9 = Static124.aClass91_11;
			@Pc(16) Class1_Sub25 local16;
			synchronized (Static124.aClass91_11) {
				local16 = (Class1_Sub25) Static148.aClass91_16.method3145();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass60_Sub1_158.method2351(local16.aClass32_4, (int) local16.aLong150, local16.aByteArray49, false);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
	public static void method3067(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static7.anInt172 == 0 || arg1 == 0 || Static161.anInt3642 >= 50 || arg0 == -1) {
			return;
		}
		Static111.anIntArray309[Static161.anInt3642] = arg0;
		Static104.anIntArray292[Static161.anInt3642] = arg1;
		Static134.anIntArray377[Static161.anInt3642] = arg2;
		Static122.aClass84Array2[Static161.anInt3642] = null;
		Static53.anIntArray130[Static161.anInt3642] = 0;
		Static161.anInt3642++;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!ph", name = "xg", descriptor = "Lclient!jda;")
	public static Class149_Sub1 aClass149_Sub1_2;

	@OriginalMember(owner = "client!ph", name = "Ih", descriptor = "Lclient!bn;")
	public static final Class31 aClass31_12 = new Class31(8, 0, 4, 1);

	@OriginalMember(owner = "client!ph", name = "ai", descriptor = "[I")
	public static final int[] anIntArray660 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!qba;)V")
	public static void method5684(@OriginalArg(1) Class72_Sub7 arg0) {
		arg0.aClass49_1 = null;
		@Pc(12) int local12 = arg0.aClass72_Sub2Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass72_Sub2Array1[local14].aBoolean129 = false;
		}
		@Pc(28) Class299[] local28 = Class300.aClass299Array1;
		synchronized (Class300.aClass299Array1) {
			if (Class300.aClass299Array1.length > local12 && Static287.anIntArray545[local12] < 200) {
				Class300.aClass299Array1[local12].method7027(arg0);
				@Pc(55) int local55 = Static287.anIntArray545[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5687(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static40.anInt856; local11++) {
			if (arg0.equalsIgnoreCase(Static170.aStringArray15[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static89.aStringArray8[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(IIIIIII)I")
	public static int method5690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = arg0 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(19) int local19 = arg4;
			arg4 = arg3;
			arg3 = local19;
		}
		if (local7 == 0) {
			return arg5;
		} else if (local7 == 1) {
			return 7 + 1 - arg2 - arg4;
		} else if (local7 == 2) {
			return 1 + 7 - arg5 - arg3;
		} else {
			return arg2;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!vp", name = "K", descriptor = "[Lclient!nu;")
	public static Class7_Sub2[] aClass7_Sub2Array3;

	@OriginalMember(owner = "client!vp", name = "L", descriptor = "I")
	public static int anInt7261;

	@OriginalMember(owner = "client!vp", name = "R", descriptor = "J")
	public static long aLong218 = -1L;

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "(B)V")
	public static void method5675() {
		for (@Pc(1) int local1 = 0; local1 < 5; local1++) {
			Static384.aBooleanArray20[local1] = false;
		}
		Static20.anInt684 = 0;
		Static362.anInt6125 = -1;
		Static194.anInt3884 = 0;
		Static166.anInt3384 = -1;
		Static161.anInt3316 = 1;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZZLclient!dk;B)V")
	public static void method5676(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class3_Sub9 arg2) {
		@Pc(14) int local14 = arg2.anInt1804;
		@Pc(18) int local18 = (int) arg2.aLong234;
		arg2.method5977();
		if (arg0) {
			Static192.method3072(local14);
		}
		Static278.method3935(local14);
		@Pc(33) Class156 local33 = Static435.method5705(local18);
		if (local33 != null) {
			Static386.method5010(local33);
		}
		Static164.method2714();
		if (!arg1 && Static226.anInt4225 != -1) {
			Static88.method1668(1, Static226.anInt4225);
		}
		@Pc(54) Class120 local54 = new Class120(Static318.aClass11_42);
		for (@Pc(59) Class3_Sub9 local59 = (Class3_Sub9) local54.method2980(); local59 != null; local59 = (Class3_Sub9) local54.method2979()) {
			if (!local59.method5978()) {
				local59 = (Class3_Sub9) local54.method2980();
				if (local59 == null) {
					return;
				}
			}
			if (local59.anInt1803 == 3) {
				@Pc(80) int local80 = (int) local59.aLong234;
				if (local80 >>> 16 == local14) {
					method5676(true, arg1, local59);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIII)V")
	public static void method5678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static374.aClass20_Sub1_1.anInt2360 != 0 && arg1 != 0 && Static319.anInt1933 < 50 && arg3 != -1) {
			Static25.aClass219Array1[Static319.anInt1933++] = new Class219((byte) 1, arg3, arg1, arg0, arg4, arg2);
		}
	}
}

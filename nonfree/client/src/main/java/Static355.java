import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public static void method5209() {
		@Pc(1) Class168 local1 = Static630.aClass168_93;
		synchronized (Static630.aClass168_93) {
			Static630.aClass168_93.method3862();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static236.method3740(Static319.anInt5445, Static573.anInt8986, arg1);
		@Pc(17) int local17 = Static236.method3740(Static319.anInt5445, Static573.anInt8986, arg3);
		@Pc(23) int local23 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg5);
		@Pc(29) int local29 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg2);
		@Pc(37) int local37 = Static236.method3740(Static319.anInt5445, Static573.anInt8986, arg4 + arg1);
		@Pc(48) int local48 = Static236.method3740(Static319.anInt5445, Static573.anInt8986, arg3 - arg4);
		for (@Pc(64) int local64 = local11; local64 < local37; local64++) {
			Static161.method2977(local23, arg6, local29, Static120.anIntArrayArray18[local64], -110);
		}
		for (@Pc(82) int local82 = local17; local82 > local48; local82--) {
			Static161.method2977(local23, arg6, local29, Static120.anIntArrayArray18[local82], -114);
		}
		@Pc(112) int local112 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg5 + arg4);
		@Pc(121) int local121 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg2 - arg4);
		for (@Pc(123) int local123 = local37; local123 <= local48; local123++) {
			@Pc(131) int[] local131 = Static120.anIntArrayArray18[local123];
			Static161.method2977(local23, arg6, local112, local131, -109);
			Static161.method2977(local112, arg0, local121, local131, -110);
			Static161.method2977(local121, arg6, local29, local131, -126);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public static void method5212() {
		if (Static536.anIntArray488 != null && Static153.anIntArray141 != null) {
			return;
		}
		Static153.anIntArray141 = new int[256];
		Static536.anIntArray488 = new int[256];
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(33) double local33 = (double) local24 / 255.0D * 6.283185307179586D;
			Static536.anIntArray488[local24] = (int) (Math.sin(local33) * 4096.0D);
			Static153.anIntArray141[local24] = (int) (Math.cos(local33) * 4096.0D);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray10 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!paa;[[BI)V")
	public static void method965(@OriginalArg(0) Class49_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(6) int local6 = Static73.aByteArrayArray2.length;
		for (@Pc(15) int local15 = 0; local15 < local6; local15++) {
			@Pc(20) byte[] local20 = arg1[local15];
			if (local20 != null) {
				@Pc(32) int local32 = (Static365.anIntArray336[local15] >> 8) * 64 - Static36.anInt617;
				@Pc(43) int local43 = (Static365.anIntArray336[local15] & 0xFF) * 64 - Static550.anInt9242;
				Static599.method8480();
				arg0.method6734(local43, local20, Static103.aClass144_3, Static40.aClass289Array1, local32);
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIII)V")
	public static void method968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static181.aClass14_Sub26_9.aClass43_Sub11_3.method3829() != 0 && arg4 != 0 && Static208.anInt7849 < 50 && arg1 != -1) {
			Static314.aClass106Array1[Static208.anInt7849++] = new Class106((byte) 1, arg1, arg4, arg2, arg0, 0, arg3, (Class4_Sub3) null);
		}
	}
}

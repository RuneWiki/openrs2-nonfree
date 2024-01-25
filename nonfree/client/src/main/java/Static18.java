import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public static int anInt303;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public static int anInt302 = 0;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLclient!ib;)Lclient!ega;")
	public static Class31_Sub2 method295(@OriginalArg(1) Class5_Sub23 arg0) {
		@Pc(7) Class31 local7 = Static617.method8748(arg0);
		@Pc(17) int local17 = arg0.method8527();
		@Pc(21) int local21 = arg0.method8527();
		return new Class31_Sub2(local7.aClass219_12, local7.aClass368_11, local7.anInt9298, local7.anInt9300, local7.anInt9301, local7.anInt9302, local7.anInt9305, local7.anInt9299, local7.anInt9306, local17, local21);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[[BLclient!haa;)V")
	public static void method296(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class153_Sub1 arg1) {
		@Pc(8) int local8 = Static319.aByteArrayArray13.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(21) byte[] local21 = arg0[local15];
			if (local21 != null) {
				@Pc(34) int local34 = (Static672.anIntArray621[local15] >> 8) * 64 - Static622.anInt10188;
				@Pc(45) int local45 = (Static672.anIntArray621[local15] & 0xFF) * 64 - Static668.anInt10683;
				Static62.method873();
				arg1.method3029(local45, Static457.aClass57_11, Static670.aClass88Array1, local34, local21);
			}
		}
	}
}

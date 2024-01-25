import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
	public static int anInt1433;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "[I")
	public static final int[] anIntArray82 = new int[2048];

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "[F")
	public static final float[] aFloatArray5 = new float[16];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([BB)[B")
	public static byte[] method1314(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub23 local8 = new Class6_Sub23(arg0);
		@Pc(17) int local17 = local8.method8374();
		@Pc(21) int local21 = local8.method8369();
		if (local21 < 0 || Static546.anInt9208 != 0 && local21 > Static546.anInt9208) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(98) byte[] local98 = new byte[local21];
			local8.method8375(local21, local98, 0);
			return local98;
		} else {
			@Pc(47) int local47 = local8.method8369();
			if (local47 < 0 || Static546.anInt9208 != 0 && Static546.anInt9208 < local47) {
				throw new RuntimeException();
			}
			@Pc(68) byte[] local68 = new byte[local47];
			if (local17 == 1) {
				Static501.method7190(local68, local47, arg0, local21);
			} else {
				@Pc(73) Class374 local73 = Static34.aClass374_1;
				synchronized (Static34.aClass374_1) {
					Static34.aClass374_1.method8743(local8, local68);
				}
			}
			return local68;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBI)V")
	public static void method1315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class6_Sub4_Sub18 local13 = Static565.method7924((long) arg2, 11);
		local13.method7976();
		local13.anInt9466 = arg1;
		local13.anInt9463 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!gga;I)Lclient!ss;")
	public static Class24_Sub3 method1316(@OriginalArg(0) Class6_Sub23 arg0) {
		return new Class24_Sub3(arg0.method8395(), arg0.method8395(), arg0.method8395(), arg0.method8395(), arg0.method8344(), arg0.method8374());
	}
}

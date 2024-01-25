import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array22;

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "Lclient!uh;")
	public static Class201 aClass201_15;

	@OriginalMember(owner = "client!ro", name = "s", descriptor = "Z")
	public static boolean aBoolean401 = false;

	@OriginalMember(owner = "client!ro", name = "x", descriptor = "[I")
	public static final int[] anIntArray482 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
	public static int anInt5908 = -1;

	@OriginalMember(owner = "client!ro", name = "A", descriptor = "Z")
	public static boolean aBoolean403 = true;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIII)V")
	public static void method5036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static348.anInt6763 = arg0;
		Static69.anInt1411 = arg3;
		Static306.anInt6053 = arg1;
		Static261.anInt5250 = arg4;
		Static169.anInt3575 = arg5;
		Static61.anInt1282 = arg2;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "([BI)[B")
	public static byte[] method5037(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class3_Sub4 local13 = new Class3_Sub4(arg0);
		@Pc(17) int local17 = local13.method3643();
		@Pc(21) int local21 = local13.method3642();
		if (local21 < 0 || Static151.anInt2965 != 0 && Static151.anInt2965 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(82) byte[] local82 = new byte[local21];
			local13.method3620(local21, local82);
			return local82;
		} else {
			@Pc(44) int local44 = local13.method3642();
			if (local44 < 0 || Static151.anInt2965 != 0 && Static151.anInt2965 < local44) {
				throw new RuntimeException();
			}
			@Pc(58) byte[] local58 = new byte[local44];
			if (local17 == 1) {
				Static146.method2377(local58, local44, arg0, local21);
			} else {
				Static111.aClass138_1.method3544(local58, local13);
			}
			return local58;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!tm;Lclient!ir;Lclient!ir;BLclient!ir;)Z")
	public static boolean method5041(@OriginalArg(0) Class3_Sub2_Sub4 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(4) Class100 arg3) {
		Static348.aClass3_Sub2_Sub4_3 = arg0;
		Static42.aClass100_15 = arg2;
		Static299.aClass100_117 = arg3;
		Static220.aClass100_93 = arg1;
		return true;
	}
}

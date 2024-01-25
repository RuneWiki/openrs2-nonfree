import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "Lclient!nh;")
	public static Class226 aClass226_5;

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "[I")
	public static int[] anIntArray554;

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "Lclient!tf;")
	public static Class322 aClass322_143;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[100];

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "Z")
	public static boolean aBoolean650 = true;

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[8];

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIII)V")
	public static void method7027(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static503.aByteArrayArrayArray11 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!rb;Z[[[BIB)Z")
	public static boolean method7028(@OriginalArg(0) Class41_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static512.aBoolean635) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt9444 >> Static315.anInt5369;
		@Pc(13) int local13 = arg0.anInt9442 >> Static315.anInt5369;
		if (local8 < Static325.anInt5509 || local8 >= Static120.anInt2772 || local13 < Static553.anInt8803 || local13 >= Static535.anInt8569) {
			return true;
		} else if ((arg2 == null || arg0.aByte117 < arg3 || arg2[arg0.aByte117][local8][local13] != arg4) && arg0.method7837() && !arg0.method7841()) {
			return false;
		} else {
			if (!arg1 && local8 >= Static5.anInt120 - 16 && local8 <= Static5.anInt120 + 16 && local13 >= Static394.anInt6891 - 16 && local13 <= Static394.anInt6891 + 16) {
				if (Static74.aBoolean149) {
					Static12.aClass187Array2[Static219.anInt3911++].method4395(arg0);
					Static219.anInt3911 %= Static261.anInt4596;
				} else {
					arg0.method7849(Static511.aClass45_12);
				}
			}
			return true;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "Ljava/lang/Object;")
	public static Object anObject15;

	@OriginalMember(owner = "client!lk", name = "C", descriptor = "Lclient!si;")
	public static final Class335 aClass335_20 = new Class335(16);

	@OriginalMember(owner = "client!lk", name = "E", descriptor = "[I")
	public static final int[] anIntArray318 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)Lclient!nk;")
	public static Class250 method5998(@OriginalArg(1) int arg0) {
		@Pc(10) Class250 local10 = (Class250) Static314.aClass22_28.method462((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static120.aClass124_33.method3641(0, arg0);
		local10 = new Class250();
		if (local20 != null) {
			local10.method6678(arg0, new Class2_Sub8(local20));
		}
		Static314.aClass22_28.method470((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIBI)Z")
	public static boolean method5999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static182.aClass76_5.method9642(arg1, arg2, arg0, Static75.anIntArray71);
		@Pc(13) int local13 = Static75.anIntArray71[2];
		if (local13 < 50) {
			return false;
		} else {
			Static75.anIntArray71[2] = local13;
			Static75.anIntArray71[1] = Static41.anInt911 + Static131.anInt2513 * Static75.anIntArray71[1] / local13;
			Static75.anIntArray71[0] = Static75.anIntArray71[0] * Static390.anInt7383 / local13 + Static610.anInt10745;
			return true;
		}
	}
}

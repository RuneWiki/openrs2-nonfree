import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!tv", name = "j", descriptor = "F")
	public static float aFloat190;

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "Lclient!jw;")
	public static final Class183 aClass183_37 = new Class183(16);

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "Lclient!db;")
	public static final Class64 aClass64_435 = new Class64(113, 7);

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray74 = new int[128][128];

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "S")
	public static short aShort114 = 256;

	@OriginalMember(owner = "client!tv", name = "i", descriptor = "[I")
	public static final int[] anIntArray676 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!tv", name = "k", descriptor = "Lclient!gba;")
	public static Class115 aClass115_14 = null;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIZII)V")
	public static void method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static189.aClass4_Sub2_Sub1_1.anInt9298 != 0 && arg0 != 0 && Static406.anInt7043 < 50 && arg2 != -1) {
			Static479.aClass22Array1[Static406.anInt7043++] = new Class22((byte) 1, arg2, arg0, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
	public static void method7283() {
		for (@Pc(10) Class4_Sub51 local10 = (Class4_Sub51) Static217.aClass124_22.method3267(); local10 != null; local10 = (Class4_Sub51) Static217.aClass124_22.method3273()) {
			if (local10.aBoolean678) {
				local10.method7876();
			}
		}
		for (@Pc(37) Class4_Sub51 local37 = (Class4_Sub51) Static162.aClass124_19.method3267(); local37 != null; local37 = (Class4_Sub51) Static162.aClass124_19.method3273()) {
			if (local37.aBoolean678) {
				local37.method7876();
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IZ)V")
	public static void method7285(@OriginalArg(0) int arg0) {
		Static161.anInt3558 = arg0;
		Static26.aClass223_36.method4932();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILclient!bi;)Lclient!ec;")
	public static Class4_Sub14 method7286(@OriginalArg(0) int arg0, @OriginalArg(2) Class31 arg1) {
		@Pc(13) byte[] local13 = arg1.method661(arg0);
		return local13 == null ? null : new Class4_Sub14(local13);
	}
}

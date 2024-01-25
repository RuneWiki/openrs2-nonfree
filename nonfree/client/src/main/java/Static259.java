import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Lclient!ij;")
	public static Class93 aClass93_101;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
	public static int anInt5094;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[B")
	public static byte[] aByteArray71;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!le;")
	public static final Class122 aClass122_10 = new Class122(64);

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "[I")
	public static final int[] anIntArray492 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!ti;")
	public static Class4_Sub5 method4533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class174 local7 = Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class84 local14 = local7.aClass84_3; local14 != null; local14 = local14.aClass84_2) {
			@Pc(18) Class4_Sub5 local18 = local14.aClass4_Sub5_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort92 == arg1 && local18.aShort93 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!vg;B)V")
	public static void method4534(@OriginalArg(0) Class201 arg0) {
		if (arg0.anInt6559 == 5 && arg0.anInt6509 != -1) {
			Static117.method2046(Static236.aClass55_9, arg0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
	public static void method4536() {
		Static271.anInt5299 = 0;
		Static224.anInt4437 = -1;
		Static159.anInt3128 = -1;
		Static101.anInt1914 = -1;
	}
}

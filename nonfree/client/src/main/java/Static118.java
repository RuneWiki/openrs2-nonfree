import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!efa", name = "z", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_31 = new Class274(114, -2);

	@OriginalMember(owner = "client!efa", name = "C", descriptor = "[I")
	public static int[] anIntArray207 = new int[2];

	@OriginalMember(owner = "client!efa", name = "D", descriptor = "I")
	public static int anInt2861 = -1;

	@OriginalMember(owner = "client!efa", name = "G", descriptor = "Z")
	public static boolean aBoolean251 = false;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I[Lclient!dm;ZIZI)V")
	public static void method2465(@OriginalArg(0) int arg0, @OriginalArg(1) Class78[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			@Pc(10) Class78 local10 = arg1[local5];
			if (local10 != null && arg0 == local10.anInt1967) {
				Static489.method7001(arg4, arg3, arg2, local10);
				Static187.method3390(arg4, arg3, local10);
				if (local10.anInt1966 > local10.anInt1971 - local10.anInt1964) {
					local10.anInt1966 = local10.anInt1971 - local10.anInt1964;
				}
				if (local10.anInt1961 - local10.anInt1991 < local10.anInt2009) {
					local10.anInt2009 = local10.anInt1961 - local10.anInt1991;
				}
				if (local10.anInt1966 < 0) {
					local10.anInt1966 = 0;
				}
				if (local10.anInt2009 < 0) {
					local10.anInt2009 = 0;
				}
				if (local10.anInt1955 == 0) {
					Static630.method8478(arg2, local10);
				}
			}
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(JJ)J")
	public static long method2466(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!efa", name = "f", descriptor = "(I)Lclient!eo;")
	public static Class11_Sub3 method2468() {
		@Pc(13) Class11_Sub3 local13 = (Class11_Sub3) Static600.aClass143_9.method3534();
		if (local13 == null) {
			return new Class11_Sub3();
		} else {
			Static490.anInt8356--;
			return local13;
		}
	}
}

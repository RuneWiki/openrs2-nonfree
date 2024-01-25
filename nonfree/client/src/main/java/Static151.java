import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
	public static int anInt3836 = 0;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString156 = "Loaded interfaces";

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "[J")
	public static final long[] aLongArray9 = new long[100];

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!u;)Z")
	public static boolean method3579(@OriginalArg(1) Class202 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean520) {
			return false;
		} else if (!arg0.method5175()) {
			return false;
		} else if (Static9.aClass26_1.method870((long) arg0.anInt5915) == null) {
			return Static90.aClass26_10.method870((long) arg0.anInt5902) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	public static void method3582() {
		@Pc(1) Class140 local1 = Static278.aClass140_145;
		synchronized (Static278.aClass140_145) {
			Static278.aClass140_145.method3813();
		}
		local1 = Static145.aClass140_77;
		synchronized (Static145.aClass140_77) {
			Static145.aClass140_77.method3813();
		}
		local1 = Static159.aClass140_84;
		synchronized (Static159.aClass140_84) {
			Static159.aClass140_84.method3813();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!ek;III[Z)Z")
	public static boolean method3583(@OriginalArg(0) Class1_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static7.aClass41Array1 != Static236.aClass41Array4) {
			@Pc(11) int local11 = Static288.aClass41Array5[arg1].method5433(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class41 local18 = Static288.aClass41Array5[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method5433(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method5419(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method5426(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!qj;Lclient!qj;I)V")
	public static void method3584(@OriginalArg(0) Class165 arg0, @OriginalArg(1) Class165 arg1) {
		Static95.aClass165_33 = arg0;
		Static220.aClass165_66 = arg1;
		Static95.aClass165_33.method4499(34);
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)V")
	public static void method3586() {
		if (Static24.anInt674 == 5) {
			Static24.anInt674 = 6;
		}
	}
}

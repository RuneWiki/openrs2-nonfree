import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static390 {

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
	public static int anInt6574 = 0;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)I")
	public static int method5743() {
		return Static378.anInt6342;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Z")
	public static boolean method5744() {
		return Static310.anInt5335 != 0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;ILclient!tga;I)Lclient!uga;")
	public static Class361 method5745(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class349 arg2) {
		return Static388.method5739(arg0, "openjs", arg1, arg2);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILclient!mj;)V")
	public static void method5746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class238 arg2) {
		if (arg2.aByte86 == 0) {
			arg2.anInt5989 = arg2.anInt5992;
		} else if (arg2.aByte86 == 1) {
			arg2.anInt5989 = (arg1 - arg2.anInt5973) / 2 + arg2.anInt5992;
		} else if (arg2.aByte86 == 2) {
			arg2.anInt5989 = arg1 - arg2.anInt5992 - arg2.anInt5973;
		} else if (arg2.aByte86 == 3) {
			arg2.anInt5989 = arg1 * arg2.anInt5992 >> 14;
		} else if (arg2.aByte86 == 4) {
			arg2.anInt5989 = (arg1 - arg2.anInt5973) / 2 + (arg2.anInt5992 * arg1 >> 14);
		} else {
			arg2.anInt5989 = arg1 - (arg2.anInt5992 * arg1 >> 14) - arg2.anInt5973;
		}
		if (arg2.aByte84 == 0) {
			arg2.anInt6028 = arg2.anInt5984;
		} else if (arg2.aByte84 == 1) {
			arg2.anInt6028 = (arg0 - arg2.anInt5985) / 2 + arg2.anInt5984;
		} else if (arg2.aByte84 == 2) {
			arg2.anInt6028 = arg0 - arg2.anInt5985 - arg2.anInt5984;
		} else if (arg2.aByte84 == 3) {
			arg2.anInt6028 = arg2.anInt5984 * arg0 >> 14;
		} else if (arg2.aByte84 == 4) {
			arg2.anInt6028 = (arg2.anInt5984 * arg0 >> 14) + (arg0 - arg2.anInt5985) / 2;
		} else {
			arg2.anInt6028 = arg0 - (arg2.anInt5984 * arg0 >> 14) - arg2.anInt5985;
		}
		if (!Static628.aBoolean710) {
			return;
		}
		if (Static73.method1209(arg2).anInt2210 == 0 && arg2.anInt5976 != 0) {
			return;
		}
		if (arg2.anInt6028 < 0) {
			arg2.anInt6028 = 0;
		} else if (arg0 < arg2.anInt5985 + arg2.anInt6028) {
			arg2.anInt6028 = arg0 - arg2.anInt5985;
		}
		if (arg2.anInt5989 < 0) {
			arg2.anInt5989 = 0;
			return;
		}
		if (arg1 < arg2.anInt5973 + arg2.anInt5989) {
			arg2.anInt5989 = arg1 - arg2.anInt5973;
			return;
		}
	}
}

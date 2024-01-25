import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ks", name = "R", descriptor = "I")
	public static int anInt3730;

	@OriginalMember(owner = "client!ks", name = "P", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_65 = new Class231("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!ks", name = "Q", descriptor = "[I")
	public static final int[] anIntArray318 = new int[14];

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!tq;II)V")
	public static void method3327(@OriginalArg(1) Class239 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte90 == 0) {
			arg0.anInt6484 = arg0.anInt6454;
		} else if (arg0.aByte90 == 1) {
			arg0.anInt6484 = arg0.anInt6454 + (arg1 - arg0.anInt6435) / 2;
		} else if (arg0.aByte90 == 2) {
			arg0.anInt6484 = arg1 - arg0.anInt6454 - arg0.anInt6435;
		} else if (arg0.aByte90 == 3) {
			arg0.anInt6484 = arg0.anInt6454 * arg1 >> 14;
		} else if (arg0.aByte90 == 4) {
			arg0.anInt6484 = (arg1 - arg0.anInt6435) / 2 + (arg1 * arg0.anInt6454 >> 14);
		} else {
			arg0.anInt6484 = arg1 - (arg1 * arg0.anInt6454 >> 14) - arg0.anInt6435;
		}
		if (arg0.aByte91 == 0) {
			arg0.anInt6483 = arg0.anInt6485;
		} else if (arg0.aByte91 == 1) {
			arg0.anInt6483 = (arg2 - arg0.anInt6408) / 2 + arg0.anInt6485;
		} else if (arg0.aByte91 == 2) {
			arg0.anInt6483 = arg2 - arg0.anInt6408 - arg0.anInt6485;
		} else if (arg0.aByte91 == 3) {
			arg0.anInt6483 = arg2 * arg0.anInt6485 >> 14;
		} else if (arg0.aByte91 == 4) {
			arg0.anInt6483 = (arg2 - arg0.anInt6408) / 2 + (arg0.anInt6485 * arg2 >> 14);
		} else {
			arg0.anInt6483 = arg2 - (arg0.anInt6485 * arg2 >> 14) - arg0.anInt6408;
		}
		if (!Static268.aBoolean330 || Static54.method1017(arg0).anInt5768 == 0 && arg0.anInt6447 != 0) {
			return;
		}
		if (arg0.anInt6483 < 0) {
			arg0.anInt6483 = 0;
		} else if (arg2 < arg0.anInt6408 + arg0.anInt6483) {
			arg0.anInt6483 = arg2 - arg0.anInt6408;
		}
		if (arg0.anInt6484 < 0) {
			arg0.anInt6484 = 0;
		} else if (arg0.anInt6484 + arg0.anInt6435 > arg1) {
			arg0.anInt6484 = arg1 - arg0.anInt6435;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method3328(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static352.method4977(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static352.method4977(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(48) int local48 = local14 - local11;
		if (local48 < 1 || local48 > 12) {
			return null;
		}
		@Pc(68) StringBuffer local68 = new StringBuffer(local48);
		for (@Pc(70) int local70 = local11; local70 < local14; local70++) {
			@Pc(76) char local76 = arg0.charAt(local70);
			if (Static288.method4288(local76)) {
				@Pc(84) char local84 = Static400.method5449(local76);
				if (local84 != '\u0000') {
					local68.append(local84);
				}
			}
		}
		if (local68.length() == 0) {
			return null;
		} else {
			return local68.toString();
		}
	}
}

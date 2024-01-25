import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "F")
	public static float aFloat212;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public static int anInt8285;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	public static int anInt8288;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	public static int anInt8291;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	public static int anInt8282 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!fca;)I")
	public static int method6846(@OriginalArg(1) Class97 arg0) {
		if (arg0 == Static352.aClass97_38) {
			return 6407;
		} else if (arg0 == Static7.aClass97_5) {
			return 6408;
		} else if (arg0 == Static362.aClass97_41) {
			return 6406;
		} else if (arg0 == Static466.aClass97_52) {
			return 6409;
		} else if (Static480.aClass97_55 == arg0) {
			return 6410;
		} else if (arg0 == Static258.aClass97_24) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII[III)Z")
	public static boolean method6847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg2 < 0) {
			arg2 = 0;
		}
		if (Static47.anInt645 < arg0) {
			arg0 = Static47.anInt645;
		}
		if (arg0 <= arg2) {
			return true;
		}
		arg1 += arg2 * arg3;
		@Pc(49) int local49 = arg0 - arg2 >> 2;
		arg5 += arg2 - 1;
		@Pc(78) int local78;
		@Pc(66) int local66;
		if (Static84.anInt1542 == 1) {
			Static192.anInt3745 += local49;
			while (true) {
				local49--;
				if (local49 < 0) {
					local49 = arg0 - arg2 & 0x3;
					while (true) {
						local49--;
						if (local49 < 0) {
							return true;
						}
						arg5++;
						if (arg4[arg5] > arg1) {
							arg4[arg5] = arg1;
						}
						arg1 += arg3;
					}
				}
				local66 = arg5 + 1;
				if (arg4[local66] > arg1) {
					arg4[local66] = arg1;
				}
				local78 = arg1 + arg3;
				local66++;
				if (local78 < arg4[local66]) {
					arg4[local66] = local78;
				}
				local78 += arg3;
				local66++;
				if (arg4[local66] > local78) {
					arg4[local66] = local78;
				}
				local78 += arg3;
				arg5 = local66 + 1;
				if (arg4[arg5] > local78) {
					arg4[arg5] = local78;
				}
				arg1 = local78 + arg3;
			}
		} else {
			arg1 -= 15360;
			while (true) {
				local49--;
				if (local49 < 0) {
					local49 = arg0 - arg2 & 0x3;
					while (true) {
						local49--;
						if (local49 < 0) {
							return true;
						}
						arg5++;
						if (arg4[arg5] > arg1) {
							return false;
						}
						arg1 += arg3;
					}
				}
				@Pc(167) int local167 = ~arg1;
				local66 = arg5 + 1;
				if (local167 > ~arg4[local66]) {
					return false;
				}
				local78 = arg1 + arg3;
				local167 = ~local78;
				local66++;
				if (local167 > ~arg4[local66]) {
					return false;
				}
				local78 += arg3;
				local167 = ~local78;
				local66++;
				if (local167 > ~arg4[local66]) {
					return false;
				}
				local78 += arg3;
				local167 = ~local78;
				arg5 = local66 + 1;
				if (local167 > ~arg4[arg5]) {
					return false;
				}
				arg1 = local78 + arg3;
			}
		}
	}
}

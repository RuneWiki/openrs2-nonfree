import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!oa", name = "rc", descriptor = "F")
	public static float aFloat273;

	@OriginalMember(owner = "client!oa", name = "bc", descriptor = "Lclient!fd;")
	public static final Class98 aClass98_4 = new Class98();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(BIZ)I")
	public static int method5353(@OriginalArg(1) int arg0) {
		@Pc(14) Class5_Sub24 local14 = Static459.method6391(arg0, false);
		if (local14 == null) {
			return Static403.aClass134_1.method3273(arg0).anInt5830;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.anIntArray261.length; local31++) {
			if (local14.anIntArray261[local31] == -1) {
				local24++;
			}
		}
		return local24 + Static403.aClass134_1.method3273(arg0).anInt5830 - local14.anIntArray261.length;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)I")
	public static int method5361(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local13 += 16;
		}
		if (arg0 >= 256) {
			local13 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local13 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local13 += 2;
		}
		if (arg0 >= 1) {
			local13++;
			arg0 >>>= 0x1;
		}
		return arg0 + local13;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)[Lclient!io;")
	public static Class148[] method5362() {
		return new Class148[] { Static481.aClass148_14, Static33.aClass148_1, Static162.aClass148_5, Static47.aClass148_2, Static309.aClass148_9, Static352.aClass148_11, Static101.aClass148_3, Static395.aClass148_12, Static480.aClass148_13, Static235.aClass148_7, Static146.aClass148_4, Static227.aClass148_6, Static332.aClass148_10, Static275.aClass148_8 };
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!ml;)Z")
	public static boolean method5363(@OriginalArg(1) Class199 arg0) {
		return arg0 == Static242.aClass199_6 || Static75.aClass199_2 == arg0 || Static14.aClass199_1 == arg0 || Static240.aClass199_5 == arg0;
	}
}

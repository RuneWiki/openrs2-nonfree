import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString191 = "Loading textures - ";

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "J")
	public static long aLong203 = 0L;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString192 = "Starting 3d Library";

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "Z")
	public static boolean aBoolean329 = true;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)I")
	public static int method3097() {
		if (Static37.aClass113_1 == null) {
			return -1;
		}
		while (Static37.aClass113_1.anInt3429 > Static184.anInt3907) {
			if (Static37.aClass113_1.method2820(Static184.anInt3907)) {
				return Static184.anInt3907++;
			}
			Static184.anInt3907++;
		}
		return -1;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLclient!jd;Lclient!jd;II)Lclient!l;")
	public static Class2_Sub3_Sub13 method3098(@OriginalArg(1) Class84 arg0, @OriginalArg(2) Class84 arg1, @OriginalArg(4) int arg2) {
		@Pc(6) int[] local6 = arg0.method2119(arg2);
		@Pc(12) boolean local12 = true;
		for (@Pc(20) int local20 = 0; local20 < local6.length; local20++) {
			@Pc(32) byte[] local32 = arg0.method2122(arg2, local6[local20]);
			if (local32 == null) {
				local12 = false;
			} else {
				@Pc(52) int local52 = local32[1] & 0xFF | (local32[0] & 0xFF) << 8;
				@Pc(68) byte[] local68 = arg1.method2122(local52, 0);
				if (local68 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class2_Sub3_Sub13(arg0, arg1, arg2, false);
		} catch (@Pc(89) Exception local89) {
			return null;
		}
	}
}

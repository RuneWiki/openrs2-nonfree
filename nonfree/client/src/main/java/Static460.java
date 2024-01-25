import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!io;")
	public static Class155 aClass155_2;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIZII)V")
	public static void method6253(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) Class372[] local7 = Static341.aClass372Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(17) Class372 local17 = local7[local9];
			if (local17 != null && local17.anInt9971 == 2) {
				Static568.method7796(local17.anInt9972, local17.anInt9976, local17.anInt9975, arg2 >> 1, local17.anInt9969 * 2, arg3 >> 1);
				if (Static526.anIntArray588[0] > -1 && Static262.anInt5597 % 20 < 10) {
					@Pc(63) Class61 local63 = Static564.aClass61Array14[local17.anInt9970];
					@Pc(71) int local71 = arg0 + Static526.anIntArray588[0] - 12;
					@Pc(79) int local79 = arg1 + Static526.anIntArray588[1] - 28;
					local63.method6431(local71, local79);
					Static170.method7976(local71 + local63.method6446(), local79 - -local63.method6438(), local71, local79);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)V")
	public static void method6254(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class2_Sub8 local8 = Static384.method5147(arg0, arg1);
		if (local8 != null) {
			local8.method8653();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6256(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static352.anInt5497; local11++) {
			if (arg0.equalsIgnoreCase(Static213.aStringArray13[local11])) {
				return local11;
			}
		}
		return -1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bia", name = "i", descriptor = "I")
	public static int anInt1550;

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "([BI)Lclient!vga;")
	public static Class8_Sub5_Sub20 method1350(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class8_Sub5_Sub20 local9 = new Class8_Sub5_Sub20();
		@Pc(14) Class8_Sub8 local14 = new Class8_Sub8(arg0);
		local14.anInt10588 = local14.aByteArray107.length - 2;
		@Pc(27) int local27 = local14.method8578();
		@Pc(37) int local37 = local14.aByteArray107.length - local27 - 2 - 12;
		local14.anInt10588 = local37;
		@Pc(46) int local46 = local14.method8540();
		local9.anInt10212 = local14.method8578();
		local9.anInt10213 = local14.method8578();
		local9.anInt10211 = local14.method8578();
		local9.anInt10216 = local14.method8578();
		@Pc(74) int local74 = local14.method8525();
		@Pc(83) int local83;
		@Pc(89) int local89;
		if (local74 > 0) {
			local9.aClass253Array1 = new Class253[local74];
			for (local83 = 0; local83 < local74; local83++) {
				local89 = local14.method8578();
				@Pc(96) Class253 local96 = new Class253(Static629.method8469(local89));
				local9.aClass253Array1[local83] = local96;
				while (local89-- > 0) {
					@Pc(107) int local107 = local14.method8540();
					@Pc(113) int local113 = local14.method8540();
					local96.method6591(new Class8_Sub17(local113), (long) local107);
				}
			}
		}
		local14.anInt10588 = 0;
		local9.aString109 = local14.method8581();
		local9.aStringArray38 = new String[local46];
		local9.anIntArray599 = new int[local46];
		local9.anIntArray598 = new int[local46];
		local83 = 0;
		while (local37 > local14.anInt10588) {
			local89 = local14.method8578();
			if (local89 == 3) {
				local9.aStringArray38[local83] = local14.method8570().intern();
			} else if (local89 >= 100 || local89 == 21 || local89 == 38 || local89 == 39) {
				local9.anIntArray599[local83] = local14.method8525();
			} else {
				local9.anIntArray599[local83] = local14.method8540();
			}
			local9.anIntArray598[local83++] = local89;
		}
		return local9;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = arg3; local7 <= arg2; local7++) {
			for (@Pc(11) int local11 = arg0; local11 <= arg4; local11++) {
				if (arg1 == Static391.anIntArrayArray41[local7][local11] && Static194.anIntArrayArray25[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}

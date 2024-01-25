import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZIIZI)I")
	public static int method3605(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class2_Sub38 local15 = Static448.method5748(arg2, false);
		if (local15 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local15.anIntArray512.length; local23++) {
			if (local15.anIntArray512[local23] >= 0 && Static318.aClass144_6.anInt3987 > local15.anIntArray512[local23]) {
				@Pc(48) Class45 local48 = Static318.aClass144_6.method3265(local15.anIntArray512[local23]);
				@Pc(58) int local58 = local48.method873(arg1, Static186.aClass161_1.method3729(arg1).anInt3608);
				if (arg0) {
					local21 += local15.anIntArray513[local23] * local58;
				} else {
					local21 += local58;
				}
			}
		}
		return local21;
	}
}

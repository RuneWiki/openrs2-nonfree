import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
	public static int anInt3347 = 0;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI)I")
	public static int method2782(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return (arg0 & 0xFF80) + local16;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLclient!gk;)Lclient!sv;")
	public static Class153_Sub3 method2786(@OriginalArg(1) Class2_Sub7 arg0) {
		@Pc(7) Class153 local7 = Static415.method1370(arg0);
		@Pc(11) int local11 = arg0.method4509();
		@Pc(15) int local15 = arg0.method4509();
		@Pc(24) int local24 = arg0.method4518();
		return new Class153_Sub3(local7.aClass322_13, local7.aClass347_13, local7.anInt9314, local7.anInt9315, local7.anInt9316, local7.anInt9312, local7.anInt9317, local7.anInt9313, local7.anInt9310, local11, local15, local24);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!r;IIZ)Lclient!la;")
	public static Class37 method2788(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(9) Class345 local9 = Static101.method1525(arg1, arg0, arg2);
		return local9 == null ? null : local9.aClass37_18;
	}
}

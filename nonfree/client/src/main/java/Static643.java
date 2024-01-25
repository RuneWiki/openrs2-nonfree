import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!vp", name = "M", descriptor = "I")
	public static int anInt10121 = -1;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLclient!es;)Lclient!in;")
	public static Class103_Sub2 method8576(@OriginalArg(1) Class4_Sub11 arg0) {
		@Pc(7) Class103 local7 = Static488.method6659(arg0);
		@Pc(16) int local16 = arg0.method8859();
		@Pc(20) int local20 = arg0.method8859();
		@Pc(24) int local24 = arg0.method8859();
		@Pc(28) int local28 = arg0.method8859();
		@Pc(32) int local32 = arg0.method8859();
		@Pc(36) int local36 = arg0.method8859();
		return new Class103_Sub2(local7.aClass291_14, local7.aClass125_16, local7.anInt8643, local7.anInt8650, local7.anInt8646, local7.anInt8653, local7.anInt8648, local7.anInt8641, local7.anInt8644, local16, local20, local24, local28, local32, local36);
	}
}

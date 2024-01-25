import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "Z")
	public static boolean aBoolean181 = false;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!sca;)Lclient!sca;")
	public static Class302 method2117(@OriginalArg(1) Class302 arg0) {
		if (arg0.anInt8806 != -1) {
			return Static386.method4914(arg0.anInt8806);
		}
		@Pc(24) int local24 = arg0.anInt8838 >>> 16;
		@Pc(29) Class295 local29 = new Class295(Static507.aClass128_42);
		for (@Pc(34) Class6_Sub29 local34 = (Class6_Sub29) local29.method7421(); local34 != null; local34 = (Class6_Sub29) local29.method7423()) {
			if (local24 == local34.anInt6361) {
				return Static386.method4914((int) local34.aLong278);
			}
		}
		return null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!u", name = "m", descriptor = "I")
	public static int anInt10296;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "I")
	public static int anInt10293 = -1;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BLclient!ol;)Lclient!ci;")
	public static Class26_Sub2 method8899(@OriginalArg(1) Class2_Sub8 arg0) {
		return new Class26_Sub2(arg0.method5174(), arg0.method5174(), arg0.method5174(), arg0.method5174(), arg0.method5161(), arg0.method5203());
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([BIIB)[B")
	public static byte[] method8900(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) byte[] local13;
		if (arg1 > 0) {
			local13 = new byte[arg2];
			for (@Pc(15) int local15 = 0; local15 < arg2; local15++) {
				local13[local15] = arg0[local15 + arg1];
			}
		} else {
			local13 = arg0;
		}
		@Pc(37) Class53 local37 = new Class53();
		local37.method1364();
		local37.method1372((long) (arg2 * 8), local13);
		@Pc(60) byte[] local60 = new byte[64];
		local37.method1367(local60);
		return local60;
	}
}

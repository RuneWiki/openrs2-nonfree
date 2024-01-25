import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static669 {

	@OriginalMember(owner = "client!wl", name = "db", descriptor = "I")
	public static int anInt10732;

	@OriginalMember(owner = "client!wl", name = "L", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_374 = new Class179(105, 4);

	@OriginalMember(owner = "client!wl", name = "fb", descriptor = "[B")
	public static final byte[] aByteArray106 = new byte[2048];

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!ae;BZLjava/lang/String;)Lclient!ak;")
	public static Class17 method9074(@OriginalArg(0) Class8 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg0.method252(arg2);
		if (local10 == -1) {
			return new Class17(0);
		}
		@Pc(23) int[] local23 = arg0.method263(local10);
		@Pc(29) Class17 local29 = new Class17(local23.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local36 < local29.anInt459) {
				@Pc(52) Class6_Sub23 local52 = new Class6_Sub23(arg0.method262(local23[local38++], local10));
				@Pc(56) int local56 = local52.method8369();
				@Pc(60) int local60 = local52.method8363();
				@Pc(64) int local64 = local52.method8374();
				if (!arg1 && local64 == 1) {
					local29.anInt459--;
				} else {
					local29.anIntArray16[local36] = local56;
					local29.anIntArray15[local36] = local60;
					local36++;
				}
			}
			return local29;
		}
	}
}

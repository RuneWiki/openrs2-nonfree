import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
	public static int anInt6534;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "[B")
	public static final byte[] aByteArray71 = new byte[2048];

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BCLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method5139(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = Static358.method4720(arg1, arg0);
		@Pc(13) String[] local13 = new String[local8 + 1];
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local8; local24++) {
			@Pc(27) int local27;
			for (local27 = local22; arg1.charAt(local27) != arg0; local27++) {
			}
			local13[local20++] = arg1.substring(local22, local27);
			local22 = local27 + 1;
		}
		local13[local8] = arg1.substring(local22);
		return local13;
	}
}

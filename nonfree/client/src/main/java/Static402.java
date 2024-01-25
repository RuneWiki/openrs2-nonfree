import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!uc", name = "Hb", descriptor = "Lclient!l;")
	public static Class143 aClass143_30;

	@OriginalMember(owner = "client!uc", name = "Cb", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_144 = new Class7("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!uc", name = "Gb", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_52 = new Class134(20);

	@OriginalMember(owner = "client!uc", name = "Ib", descriptor = "I")
	public static int anInt6499 = -1;

	@OriginalMember(owner = "client!uc", name = "Jb", descriptor = "Z")
	public static boolean aBoolean443 = false;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method5419(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(13) int local13 = Static434.method5759(arg0, arg1);
		@Pc(18) String[] local18 = new String[local13 + 1];
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local13; local24++) {
			@Pc(27) int local27;
			for (local27 = local22; arg1.charAt(local27) != arg0; local27++) {
			}
			local18[local20++] = arg1.substring(local22, local27);
			local22 = local27 + 1;
		}
		local18[local13] = arg1.substring(local22);
		return local18;
	}
}

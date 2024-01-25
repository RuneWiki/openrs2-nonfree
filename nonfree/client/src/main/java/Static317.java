import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!lr", name = "Z", descriptor = "Lclient!r;")
	public static Class31 aClass31_10;

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "J")
	public static final long aLong159 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!lr", name = "Qb", descriptor = "[Lclient!cp;")
	public static final Class3_Sub9[] aClass3_Sub9Array5 = new Class3_Sub9[8];

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)Z")
	public static boolean method4702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;")
	public static String[] method4706(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(10) int local10 = Static505.method6836(arg1, arg0);
		@Pc(20) String[] local20 = new String[local10 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg0 != arg1.charAt(local30); local30++) {
			}
			local20[local22++] = arg1.substring(local24, local30);
			local24 = local30 + 1;
		}
		local20[local10] = arg1.substring(local24);
		return local20;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
	public static int anInt8291;

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
	public static int anInt8292;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_156 = new Class73(19, 3);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)Z")
	public static boolean method6727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z[I)Ljava/lang/String;")
	public static String method6728(@OriginalArg(1) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = Static585.anInt9510;
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(23) Class204 local23 = Static586.aClass89_1.method2570(arg0[local11]);
			if (local23.anInt5581 != -1) {
				@Pc(36) Class58 local36 = (Class58) Static433.aClass136_83.method3473((long) local23.anInt5581);
				if (local36 == null) {
					@Pc(44) Class140 local44 = Static604.method3623(Static398.aClass251_94, local23.anInt5581, 0);
					if (local44 != null) {
						local36 = Static240.aClass14_7.method6889(local44, true);
						Static433.aClass136_83.method3482((long) local23.anInt5581, local36);
					}
				}
				if (local36 != null) {
					Static194.aClass58Array9[local9] = local36;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}
}

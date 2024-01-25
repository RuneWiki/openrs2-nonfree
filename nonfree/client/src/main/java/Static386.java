import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!mw", name = "A", descriptor = "[Lclient!mq;")
	public static Class71[] aClass71Array32;

	@OriginalMember(owner = "client!mw", name = "C", descriptor = "I")
	public static int anInt7301;

	@OriginalMember(owner = "client!mw", name = "D", descriptor = "I")
	public static int anInt7302;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILclient!gga;I)Lclient!rt;")
	public static Class324 method6506(@OriginalArg(1) Class124 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method3610(arg1);
		return local16 == null ? null : new Class324(local16);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BB)C")
	public static char method6507(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(47) char local47 = Static506.aCharArray7[local7 - 128];
			if (local47 == '\u0000') {
				local47 = '?';
			}
			local7 = local47;
		}
		return (char) local7;
	}
}

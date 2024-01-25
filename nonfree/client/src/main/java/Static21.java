import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
	public static int anInt265;

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
	public static int anInt266;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_8 = new Class244(19, 5);

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public static int anInt261 = -1;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "Lclient!us;")
	public static final Class234 aClass234_9 = new Class234(96, 6);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!b;Lclient!b;ILclient!b;Lclient!b;)V")
	public static void method258(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) Class20 arg2, @OriginalArg(4) Class20 arg3) {
		Static131.aClass20_37 = arg3;
		Static212.aClass20_51 = arg1;
		Static79.aClass20_20 = arg0;
		Static352.aClass20_94 = arg2;
		Static375.aClass62ArrayArray2 = new Class62[Static131.aClass20_37.method229()][];
		Static188.aBooleanArray82 = new boolean[Static131.aClass20_37.method229()];
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method260(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}
}

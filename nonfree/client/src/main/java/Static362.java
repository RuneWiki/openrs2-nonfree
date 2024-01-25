import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString51;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_87 = new Class267("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
	public static int anInt6441 = 0;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method5353(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 - 96;
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

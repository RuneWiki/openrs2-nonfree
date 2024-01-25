import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "Lclient!db;")
	public static final Class64 aClass64_436 = new Class64(52, 5);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method7296(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + (long) arg0.charAt(local17) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZII)Z")
	public static boolean method7299(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}

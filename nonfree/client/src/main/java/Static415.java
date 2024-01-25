import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
	public static int anInt7330;

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "Lclient!pq;")
	public static Class251 aClass251_121;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "Lclient!rn;")
	public static final Class277 aClass277_8 = new Class277();

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "I")
	public static int anInt7332 = 0;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method6085(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + Static176.method2702(arg0.charAt(local17)) - local15;
		}
		return local15;
	}
}

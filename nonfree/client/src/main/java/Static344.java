import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
	public static int anInt6231;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "Lclient!tb;")
	public static final Class313 aClass313_37 = new Class313(64);

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
	public static int anInt6233 = 0;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method5176(@OriginalArg(1) String[] arg0) {
		@Pc(6) String[] local6 = new String[5];
		for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
			local6[local8] = local8 + ": ";
			if (arg0 != null && arg0[local8] != null) {
				local6[local8] = local6[local8] + arg0[local8];
			}
		}
		return local6;
	}
}

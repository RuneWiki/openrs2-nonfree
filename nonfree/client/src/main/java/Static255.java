import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
	public static int anInt4996;

	@OriginalMember(owner = "client!ko", name = "R", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_73 = new Class252(37, 7);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method4633(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}
}

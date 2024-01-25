import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Lclient!lt;")
	public static Class158 aClass158_82;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "Lclient!bn;")
	public static Class30 aClass30_3;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "I")
	public static int anInt6289 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5262(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static342.aStringArray39.length; local12++) {
			if (Static342.aStringArray39[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}

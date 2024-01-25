import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
	public static int anInt656;

	@OriginalMember(owner = "client!ba", name = "fb", descriptor = "Lclient!ih;")
	public static Class116 aClass116_5;

	@OriginalMember(owner = "client!ba", name = "gb", descriptor = "I")
	public static int anInt657 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method583(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static150.aStringArray15.length; local12++) {
			if (Static150.aStringArray15[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}

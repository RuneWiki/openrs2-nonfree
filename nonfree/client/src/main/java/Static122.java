import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!efa", name = "s", descriptor = "I")
	public static int anInt1983;

	@OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
	public static int anInt1976 = 0;

	@OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
	public static int anInt1982 = 0;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ICB)I")
	public static int method1828(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(24) char local24 = Character.toLowerCase(arg1);
			local7 = (local24 << 4) + 1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IZI)Z")
	public static boolean method1834(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}

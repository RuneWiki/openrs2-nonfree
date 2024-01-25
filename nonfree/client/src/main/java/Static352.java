import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "Lclient!tj;")
	public static final Class357 aClass357_30 = new Class357();

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "Z")
	public static boolean aBoolean479 = true;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)Z")
	public static boolean method5097(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IBI)Z")
	public static boolean method5099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(19) Class144 local19 = Static70.aClass323_1.method7792(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local19.method3641(arg1);
	}
}

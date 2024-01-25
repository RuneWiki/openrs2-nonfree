import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static403 {

	@OriginalMember(owner = "client!oga", name = "I", descriptor = "Lclient!eia;")
	public static final Class81 aClass81_7 = new Class81();

	@OriginalMember(owner = "client!oga", name = "L", descriptor = "Z")
	public static boolean aBoolean505 = false;

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(III)Z")
	public static boolean method6476(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static239.method4149(arg1, arg0) | (arg1 & 0x40000) != 0 || Static420.method6612(arg1, arg0);
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)V")
	public static void method6477() {
		Static340.aClass8_37 = new Class8();
	}
}

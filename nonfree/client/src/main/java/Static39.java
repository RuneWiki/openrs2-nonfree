import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "Lclient!bi;")
	public static Class31 aClass31_11;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "Lclient!db;")
	public static final Class64 aClass64_49 = new Class64(101, 4);

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "Z")
	public static boolean aBoolean66 = false;

	@OriginalMember(owner = "client!bi", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString11 = "";

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)V")
	public static void method670() {
		for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
			Static271.aBooleanArray21[local8] = true;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Z")
	public static boolean method672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}

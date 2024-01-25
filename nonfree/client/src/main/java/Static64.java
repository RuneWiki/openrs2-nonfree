import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cg", name = "I", descriptor = "Lclient!qp;")
	public static Class283 aClass283_1;

	@OriginalMember(owner = "client!cg", name = "M", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray4;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	public static void method1449(@OriginalArg(0) int arg0) {
		for (@Pc(13) Class4 local13 = Static433.aClass221_29.method5072(); local13 != null; local13 = Static433.aClass221_29.method5071()) {
			if ((long) arg0 == (local13.aLong295 >> 48 & 0xFFFFL)) {
				local13.method8193();
			}
		}
	}
}

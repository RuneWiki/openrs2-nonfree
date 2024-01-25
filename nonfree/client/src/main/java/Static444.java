import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "Lclient!pl;")
	public static Class259 aClass259_139;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
	public static int anInt7770 = 0;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method6385(@OriginalArg(0) Class100 arg0) {
		for (@Pc(16) Class6_Sub8 local16 = (Class6_Sub8) Static508.aClass109_8.method2314(); local16 != null; local16 = (Class6_Sub8) Static508.aClass109_8.method2312()) {
			if (local16.aBoolean662) {
				local16.method7153(arg0);
			}
		}
	}
}

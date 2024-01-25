import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "Z")
	public static boolean aBoolean460 = false;

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
	public static int anInt6450 = -1;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_140 = new Class211(68, 2);

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIILclient!in;)V")
	public static void method5009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub5 arg3) {
		@Pc(4) Class270 local4 = Static62.method926(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass3_Sub5_2 = arg3;
		}
	}
}

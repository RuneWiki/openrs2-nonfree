import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
	public static int anInt1992;

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
	public static int anInt1993 = 0;

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_25 = new Class316(75, 3);

	@OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
	public static int anInt1995 = 0;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)Lclient!ri;")
	public static Class276 method1819(@OriginalArg(0) int arg0) {
		@Pc(15) Class276 local15 = (Class276) Static343.aClass330_36.method7677((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(27) byte[] local27 = Static455.aClass248_88.method5797(0, arg0);
		local15 = new Class276();
		if (local27 != null) {
			local15.method6318(arg0, new Class6_Sub12(local27));
		}
		Static343.aClass330_36.method7676(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILclient!ln;)V")
	public static void method1820(@OriginalArg(1) Class6_Sub26 arg0) {
		if (!Static266.aBoolean351) {
			arg0.method7948();
			Static384.anInt7048--;
		}
	}
}

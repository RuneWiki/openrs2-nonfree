import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public static int anInt6681;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
	public static int anInt6682;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "Lclient!ir;")
	public static Class100 aClass100_126;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Z")
	public static boolean aBoolean448 = false;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Z")
	public static boolean method5603(@OriginalArg(1) int arg0) {
		Static149.aBoolean163 = true;
		Static214.anInt4356 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)Lclient!md;")
	public static Class131 method5604(@OriginalArg(0) int arg0) {
		@Pc(5) Class198 local5 = Static251.aClass198_47;
		@Pc(14) Class131 local14;
		synchronized (Static251.aClass198_47) {
			local14 = (Class131) Static251.aClass198_47.method5242((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(43) byte[] local43 = Static348.aClass100_127.method2319(Static194.method3425(arg0), Static10.method168(arg0));
		local14 = new Class131();
		local14.anInt3997 = arg0;
		if (local43 != null) {
			local14.method3417(new Class3_Sub4(local43));
		}
		local14.method3414();
		@Pc(64) Class198 local64 = Static251.aClass198_47;
		synchronized (Static251.aClass198_47) {
			Static251.aClass198_47.method5231((long) arg0, local14);
			return local14;
		}
	}
}

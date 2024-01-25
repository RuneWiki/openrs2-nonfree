import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "Lclient!ie;")
	public static Class100 aClass100_1;

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "Lclient!fi;")
	public static Class74 aClass74_2;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public static int anInt178 = 0;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString14 = "Loaded interfaces";

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
	public static final int anInt185 = -13423323;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)Lclient!uf;")
	public static Class197 method162(@OriginalArg(0) int arg0) {
		@Pc(5) Class103 local5 = Static189.aClass103_34;
		@Pc(23) Class197 local23;
		synchronized (Static189.aClass103_34) {
			local23 = (Class197) Static189.aClass103_34.method2682((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(43) byte[] local43 = Static261.aClass180_68.method4560(Static92.method1869(arg0), Static325.method5215(arg0));
		local23 = new Class197();
		local23.anInt6074 = arg0;
		if (local43 != null) {
			local23.method5137(new Class7_Sub3(local43));
		}
		local5 = Static189.aClass103_34;
		synchronized (Static189.aClass103_34) {
			Static189.aClass103_34.method2687(local23, (long) arg0);
			return local23;
		}
	}
}

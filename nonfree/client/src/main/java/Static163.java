import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "Lclient!jr;")
	public static Class157 aClass157_5;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_37 = new Class306(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_145 = new Class296(30, 8);

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	public static void method2510() {
		for (@Pc(18) Class1_Sub1_Sub12 local18 = (Class1_Sub1_Sub12) Static266.aClass37_105.method977(); local18 != null; local18 = (Class1_Sub1_Sub12) Static266.aClass37_105.method971()) {
			@Pc(23) Class49_Sub2_Sub5 local23 = local18.aClass49_Sub2_Sub5_1;
			if (local23.aBoolean466) {
				local18.method7525();
				local23.method5390();
			} else if (Static436.anInt6850 >= local23.anInt6355) {
				local23.method5393(Static152.anInt2791);
				if (local23.aBoolean466) {
					local18.method7525();
				} else {
					Static468.method6558(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z")
	public static boolean method2511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x580) != 0;
	}
}

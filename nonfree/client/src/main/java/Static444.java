import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
	public static int anInt8180;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "Lclient!fv;")
	public static final Class112 aClass112_11 = new Class112(4, 1, 1, 1);

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
	public static int anInt8179 = 0;

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[100];

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILclient!mfa;Lclient!oa;I)V")
	public static void method6824(@OriginalArg(2) Class211 arg0, @OriginalArg(3) Class9 arg1) {
		Static305.aClass211_44.method5179();
		if (Static300.aBoolean431) {
			return;
		}
		for (@Pc(24) Class6_Sub7 local24 = (Class6_Sub7) arg0.method5183(); local24 != null; local24 = (Class6_Sub7) arg0.method5177()) {
			@Pc(32) Class137 local32 = Static461.aClass42_2.method1147(local24.anInt1365);
			if (Static19.method1016(local32)) {
				@Pc(44) boolean local44 = Static423.method6546(local32, arg1, local24);
				if (local44) {
					Static360.method5796(local24, arg1, local32);
				}
			}
		}
	}
}

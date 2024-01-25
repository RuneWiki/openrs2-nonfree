import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
	public static int anInt8997;

	@OriginalMember(owner = "client!uea", name = "i", descriptor = "Lclient!mga;")
	public static final Class223 aClass223_62 = new Class223(3000000, 200);

	@OriginalMember(owner = "client!uea", name = "I", descriptor = "Z")
	public static boolean aBoolean627 = false;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method7391(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static286.anInt8741 >= 100) {
			Static160.method3167(Static275.aClass198_38.method4407(Static56.anInt953));
			return;
		}
		@Pc(32) String local32 = Static488.method6774(arg0);
		if (local32 == null) {
			return;
		}
		@Pc(78) String local78;
		for (@Pc(37) int local37 = 0; local37 < Static286.anInt8741; local37++) {
			@Pc(45) String local45 = Static488.method6774(Static101.aStringArray5[local37]);
			if (local45 != null && local45.equals(local32)) {
				Static160.method3167(arg0 + Static275.aClass198_39.method4407(Static56.anInt953));
				return;
			}
			if (Static550.aStringArray38[local37] != null) {
				local78 = Static488.method6774(Static550.aStringArray38[local37]);
				if (local78 != null && local78.equals(local32)) {
					Static160.method3167(arg0 + Static275.aClass198_39.method4407(Static56.anInt953));
					return;
				}
			}
		}
		for (@Pc(105) int local105 = 0; local105 < Static282.anInt5285; local105++) {
			local78 = Static488.method6774(Static300.aStringArray26[local105]);
			if (local78 != null && local78.equals(local32)) {
				Static160.method3167(Static275.aClass198_44.method4407(Static56.anInt953) + arg0 + Static275.aClass198_45.method4407(Static56.anInt953));
				return;
			}
			if (Static38.aStringArray3[local105] != null) {
				@Pc(149) String local149 = Static488.method6774(Static38.aStringArray3[local105]);
				if (local149 != null && local149.equals(local32)) {
					Static160.method3167(Static275.aClass198_44.method4407(Static56.anInt953) + arg0 + Static275.aClass198_45.method4407(Static56.anInt953));
					return;
				}
			}
		}
		if (Static488.method6774(Static129.aClass10_Sub1_Sub2_Sub2_1.aString93).equals(local32)) {
			Static160.method3167(Static275.aClass198_41.method4407(Static56.anInt953));
			return;
		}
		@Pc(207) Class4_Sub41 local207 = Static128.method2707(Static192.aClass61_47, Class16_Sub3.lb);
		local207.aClass4_Sub9_Sub1_3.method5961(-345277664, Static509.method7221(arg0) + 1);
		local207.aClass4_Sub9_Sub1_3.method6000(arg0);
		local207.aClass4_Sub9_Sub1_3.method5961(-345277664, arg1 ? 1 : 0);
		Static551.method7603(local207);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(BI[B)I")
	public static int method7394(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static266.method4355(arg1, 0, arg0);
	}
}

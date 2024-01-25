import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
	public static int anInt3517;

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "[Lclient!ja;")
	public static final Class5_Sub9_Sub11[] aClass5_Sub9_Sub11Array4 = new Class5_Sub9_Sub11[14];

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
	public static int anInt3516 = 0;

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "[S")
	public static short[] aShortArray37 = new short[256];

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "Z")
	public static boolean aBoolean254 = false;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	public static void method3254() {
		for (@Pc(10) Class5_Sub4 local10 = (Class5_Sub4) Static60.aClass211_4.method5608(); local10 != null; local10 = (Class5_Sub4) Static60.aClass211_4.method5603()) {
			if (Static88.method1385(local10.anInt785)) {
				Static228.method3920(local10);
			}
		}
		if (Static27.anInt5324 == 1) {
			Static188.aBoolean264 = false;
			Static316.method5375(Static279.anInt5429, Static303.anInt5839, Static343.anInt6411, Static144.anInt2967);
			return;
		}
		Static316.method5375(Static279.anInt5429, Static303.anInt5839, Static343.anInt6411, Static144.anInt2967);
		@Pc(56) int local56 = Static337.aClass138_10.method3725(Static103.aString140);
		for (@Pc(61) Class5_Sub4 local61 = (Class5_Sub4) Static60.aClass211_4.method5608(); local61 != null; local61 = (Class5_Sub4) Static60.aClass211_4.method5603()) {
			@Pc(67) int local67 = Static39.method884(local61);
			if (local67 > local56) {
				local56 = local67;
			}
		}
		Static343.anInt6411 = (aBoolean254 ? 26 : 22) + Static27.anInt5324 * 16;
		Static144.anInt2967 = local56 + 8;
	}
}

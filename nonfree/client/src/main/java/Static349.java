import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!rk", name = "Q", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_126 = new Class119(58, -2);

	@OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
	public static int anInt5940 = 765;

	@OriginalMember(owner = "client!rk", name = "ab", descriptor = "Lclient!hl;")
	public static final Class101 aClass101_3 = new Class101(16);

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)Lclient!dj;")
	public static Class3_Sub4_Sub7 method4647(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub4_Sub7 local15 = (Class3_Sub4_Sub7) Static312.aClass101_2.method2479((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static46.aClass32_17.method785(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local15 = Static9.method117(local25);
			Static312.aClass101_2.method2477((long) arg0, local15);
			return local15;
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(Z)V")
	public static void method4648() {
		if (Static47.aClass16_2 != null) {
			Static47.aClass16_2.method4108();
		}
		if (Static42.aClass16_1 != null) {
			Static42.aClass16_1.method4108();
		}
	}
}

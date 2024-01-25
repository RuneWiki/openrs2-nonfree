import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
	public static int anInt4330;

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "[[Lclient!kq;")
	public static Class199[][] aClass199ArrayArray1;

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "Lclient!ida;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "[Lclient!ws;")
	public static Class393[] aClass393Array1;

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "[Lclient!gda;")
	public static Class3_Sub1[] aClass3_Sub1Array2;

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lclient!ifa;")
	public static final Class163 aClass163_24 = new Class163();

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(B)I")
	public static int method3872() {
		@Pc(17) byte local17;
		if (Static197.anInt5439 < 96) {
			local17 = 1;
			Static539.method7210();
		} else {
			@Pc(27) int local27 = Static319.method4404();
			if (local27 <= 100) {
				Static486.method6643();
				local17 = 4;
			} else if (local27 <= 500) {
				local17 = 3;
				Static331.method4564();
			} else if (local27 <= 1000) {
				local17 = 2;
				Static38.method7844();
			} else {
				Static539.method7210();
				local17 = 1;
			}
		}
		if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() != 0) {
			Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub13_1, 0);
			Static46.method825(0, false);
		}
		Static361.method4808();
		return local17;
	}
}

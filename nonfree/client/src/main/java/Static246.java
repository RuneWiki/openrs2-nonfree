import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
	public static int anInt4517;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array14;

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "F")
	public static float aFloat113;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "Lclient!uq;")
	public static Class334 aClass334_7;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "Lclient!kr;")
	public static Class195 aClass195_2 = null;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
	public static int anInt4520 = 0;

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)Lclient!su;")
	public static Class1_Sub6_Sub16 method3674() {
		@Pc(13) Class1_Sub6_Sub16 local13 = (Class1_Sub6_Sub16) Static264.aClass125_7.method2423();
		if (local13 != null) {
			local13.method7859();
			local13.method7811();
			return local13;
		}
		do {
			local13 = (Class1_Sub6_Sub16) Static106.aClass125_5.method2423();
			if (local13 == null) {
				return null;
			}
			if (local13.method6597() > Static413.method5668()) {
				return null;
			}
			local13.method7859();
			local13.method7811();
		} while ((local13.aLong293 & Long.MIN_VALUE) == 0L);
		return local13;
	}
}

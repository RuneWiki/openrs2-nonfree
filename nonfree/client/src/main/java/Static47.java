import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!kc;")
	public static Class16 aClass16_2;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!ng;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!ko;")
	public static final Class134 aClass134_3 = new Class134("RC", 1);

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString5 = null;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
	public static final int[] anIntArray87 = new int[5];

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
	public static int anInt1173 = 1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method862() {
		Static378.aClass8_25 = null;
		Static80.anInt2013 = -1;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)Lclient!kl;")
	public static Class3_Sub4_Sub12 method864() {
		@Pc(13) Class3_Sub4_Sub12 local13 = (Class3_Sub4_Sub12) Static319.aClass244_4.method5240();
		if (local13 != null) {
			local13.method5977();
			local13.method5949();
			return local13;
		}
		do {
			local13 = (Class3_Sub4_Sub12) Static74.aClass244_2.method5240();
			if (local13 == null) {
				return null;
			}
			if (local13.method3246() > Static118.method1934()) {
				return null;
			}
			local13.method5977();
			local13.method5949();
		} while ((local13.aLong233 & Long.MIN_VALUE) == 0L);
		return local13;
	}
}

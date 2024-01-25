import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
	public static int anInt7170;

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray8 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ria;I)Lclient!ria;")
	public static Class303 method6287(@OriginalArg(0) Class303 arg0) {
		if (arg0.anInt7985 != -1) {
			return Static43.method1101(arg0.anInt7985);
		}
		@Pc(18) int local18 = arg0.anInt7962 >>> 16;
		@Pc(23) Class83 local23 = new Class83(Static22.aClass323_4);
		for (@Pc(28) Class2_Sub28 local28 = (Class2_Sub28) local23.method2014(); local28 != null; local28 = (Class2_Sub28) local23.method2015()) {
			if (local28.anInt5454 == local18) {
				return Static43.method1101((int) local28.aLong278);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)Lclient!vi;")
	public static Class313 method6288() {
		try {
			return (Class313) Class.forName("Class313_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}

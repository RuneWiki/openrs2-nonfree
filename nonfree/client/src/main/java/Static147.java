import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
	public static int anInt2708;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "Lclient!g;")
	public static final Class122 aClass122_6 = new Class122(3);

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
	public static int anInt2707 = 0;

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
	public static int anInt2709 = 0;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!fda;")
	public static Class43 method2356(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class43 local13;
		try {
			local13 = (Class43) Class.forName("Class43_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			local13 = new Class43_Sub2();
		}
		local13.aString61 = arg0;
		local13.anInt4739 = arg1;
		return local13;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB)V")
	public static void method2357(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub5_Sub20 local13 = Static447.method6065((long) arg0, 3);
		local13.method8834();
	}
}

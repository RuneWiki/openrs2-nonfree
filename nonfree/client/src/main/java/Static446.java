import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "Lclient!fc;")
	public static Class98 aClass98_124;

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lclient!ew;")
	public static Class96 aClass96_1;

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "I")
	public static int anInt7893 = 0;

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "I")
	public static int anInt7894 = 0;

	@OriginalMember(owner = "client!rfa", name = "o", descriptor = "[Lclient!pd;")
	public static Class139_Sub1[] aClass139_Sub1Array2 = new Class139_Sub1[0];

	@OriginalMember(owner = "client!rfa", name = "q", descriptor = "Z")
	public static boolean aBoolean517 = false;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!bp;")
	public static Class37 method6299(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class37 local8;
		try {
			local8 = (Class37) Class.forName("Class37_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			local8 = new Class37_Sub2();
		}
		local8.anInt8644 = arg1;
		local8.aString72 = arg0;
		return local8;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)V")
	public static void method6300(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(7, arg0);
		local8.method3257();
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIII)V")
	public static void method6301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class133 local7 = Static113.aClass133ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class15_Sub4 local13 = local7.aClass15_Sub4_2;
		@Pc(16) Class15_Sub4 local16 = local7.aClass15_Sub4_1;
		if (local13 != null) {
			local13.anInt9047 = local13.anInt9047 * arg3 / (0x10 << Static23.anInt420 - 7);
			local13.anInt9050 = local13.anInt9050 * arg3 / (0x10 << Static23.anInt420 - 7);
		}
		if (local16 != null) {
			local16.anInt9047 = local16.anInt9047 * arg3 / (0x10 << Static23.anInt420 - 7);
			local16.anInt9050 = local16.anInt9050 * arg3 / (0x10 << Static23.anInt420 - 7);
		}
	}
}

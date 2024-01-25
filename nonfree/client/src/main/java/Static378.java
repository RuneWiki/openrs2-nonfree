import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!op", name = "F", descriptor = "I")
	public static int anInt6923;

	@OriginalMember(owner = "client!op", name = "K", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_86 = new Class316(34, -1);

	@OriginalMember(owner = "client!op", name = "Q", descriptor = "Lclient!bf;")
	public static final Class30 aClass30_6 = new Class30();

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(B)V")
	public static void method5548() {
		if (Static16.method202(Static375.anInt9162) || Static355.method5330(Static375.anInt9162)) {
			Static236.method3674(5000, anInt6923 >> 12, Static208.anInt3949 >> 12);
		} else {
			@Pc(21) int local21 = Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray638[0] >> 3;
			@Pc(28) int local28 = Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray637[0] >> 3;
			if (local21 >= 0 && local21 < Static18.anInt5706 >> 3 && local28 >= 0 && Static80.anInt1367 >> 3 > local28) {
				Static236.method3674(5000, local21, local28);
			} else {
				Static236.method3674(0, Static18.anInt5706 >> 4, Static80.anInt1367 >> 4);
			}
		}
		Static581.method7917();
		Static245.method3828();
		Static234.method3602();
		Static18.method4655();
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZZI)Lclient!sl;")
	public static Class6_Sub46 method5549(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(19) long local19 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class6_Sub46) Static73.aClass234_4.method5464(local19);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!ln;I)Ljava/lang/String;")
	public static String method5557(@OriginalArg(0) Class6_Sub26 arg0) {
		return arg0.aString43 == null || arg0.aString43.length() <= 0 ? arg0.aString44 : arg0.aString44 + Static146.aClass103_79.method2355(Static188.anInt28) + arg0.aString43;
	}
}

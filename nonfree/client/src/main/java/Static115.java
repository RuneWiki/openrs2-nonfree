import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "Lclient!tg;")
	public static Class6_Sub2_Sub19 aClass6_Sub2_Sub19_3;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
	public static int anInt2151 = 0;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "Ljava/lang/String;")
	public static final String aString85 = "glow3:";

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
	public static int anInt2157 = 0;

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method2320(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(13) Class6_Sub2_Sub8 local13 = Static239.method5786(3, arg0);
		local13.method2648();
		local13.aString105 = arg1;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	public static void method2323() {
		if (Static129.anInt2374 == 10 || Static129.anInt2374 == 28) {
			Static243.method4273(Static11.anInt197 >> 10, Static287.anInt5405 >> 10);
		} else {
			Static243.method4273(Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0] >> 3, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0] >> 3);
		}
		Static306.method5246();
		Static114.method2319();
		Static29.method479();
		Static20.method297();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Lclient!tf;")
	public static Class6_Sub2_Sub18 method2324(@OriginalArg(1) int arg0) {
		@Pc(16) Class6_Sub2_Sub18 local16 = (Class6_Sub2_Sub18) Static316.aClass31_10.method634((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(29) byte[] local29;
		if (arg0 < 32768) {
			local29 = Static145.aClass53_82.method1033(arg0, 0);
		} else {
			local29 = Static153.aClass53_85.method1033(arg0 & 0x7FFF, 0);
		}
		local16 = new Class6_Sub2_Sub18();
		if (local29 != null) {
			local16.method5134(new Class6_Sub10(local29));
		}
		if (arg0 >= 32768) {
			local16.method5129();
		}
		Static316.aClass31_10.method632((long) arg0, local16);
		return local16;
	}
}

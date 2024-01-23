import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	public static int anInt3171;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1054 = Static186.method3527("Starting 3d library");

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1055 = aClass50_1054;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1060 = Static186.method3527("Please remove ");

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1056 = aClass50_1060;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1057 = Static186.method3527("logo");

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1058 = Static186.method3527(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1059 = Static186.method3527("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1061 = aClass50_1060;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Z")
	public static boolean method2552() {
		return Static1.aBoolean1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!pc;B)V")
	public static void method2553(@OriginalArg(0) Class87 arg0) {
		@Pc(7) Class34 local7 = null;
		try {
			@Pc(17) Class116 local17 = arg0.method2690("runescape");
			while (local17.anInt4156 == 0) {
				Static204.method3250(1L);
			}
			if (local17.anInt4156 == 1) {
				local7 = (Class34) local17.anObject5;
				@Pc(40) Class1_Sub17 local40 = Static176.method2913();
				local7.method946(local40.anInt2656, local40.aByteArray40, 0);
			}
		} catch (@Pc(52) Exception local52) {
		}
		try {
			if (local7 != null) {
				local7.method949();
			}
		} catch (@Pc(59) Exception local59) {
		}
	}
}

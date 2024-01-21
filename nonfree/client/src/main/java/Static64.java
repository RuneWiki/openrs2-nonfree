import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "[I")
	public static int[] anIntArray130;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Lclient!h;")
	public static Class30 aClass30_10 = new Class30();

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Lclient!tg;")
	public static Class81 aClass81_534 = Static120.method2057(")1");

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "Lclient!tg;")
	public static Class81 aClass81_535 = Static120.method2057("Texturen geladen)3");

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
	public static int anInt1610 = 0;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "Lclient!tg;")
	public static Class81 aClass81_536 = Static120.method2057("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Lclient!f;")
	public static Class22 method1160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass22_1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	public static void method1161() {
		aClass30_10 = null;
		anIntArray130 = null;
		aClass81_534 = null;
		aClass81_535 = null;
		aClass81_536 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method1162() {
		if (Static160.aClass41_4 != null) {
			Static160.aClass41_4.method1340();
		}
	}
}

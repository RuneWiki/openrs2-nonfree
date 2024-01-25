import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray29;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "Lclient!vh;")
	public static Class250 aClass250_15;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_48 = new Class131(81, 3);

	@OriginalMember(owner = "client!df", name = "f", descriptor = "[I")
	public static final int[] anIntArray95 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
	public static void method1190() {
		@Pc(3) Class188[] local3 = Class127.aClass188Array1;
		synchronized (Class127.aClass188Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class127.aClass188Array1.length; local7++) {
				Class127.aClass188Array1[local7] = new Class188();
				Static393.anIntArray565[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([FIB)[F")
	public static float[] method1191(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static460.method4217(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLclient!oa;IIIBLclient!qa;)V")
	public static void method1192(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class109 arg5) {
		if (arg0) {
			Static337.aClass80_21.method6099((Static207.anInt3842 - Static337.aClass80_21.ja()) / 2, (Static255.anInt4574 - Static337.aClass80_21.JA()) / 2);
			Static424.aClass80_19.method6099((Static207.anInt3842 - Static424.aClass80_19.ja()) / 2, 18);
		}
		arg1.method5828(Static255.anInt4574 / 2 - 26, Static207.anInt3842 / 2, arg4, -1, (Static288.aClass145_3 == Static248.aClass145_2 ? Static394.aClass84_89 : Static227.aClass84_54).method1678(Static167.anInt3118));
		@Pc(62) int local62 = Static255.anInt4574 / 2 - 18;
		arg5.method4685(Static207.anInt3842 / 2 - 152, local62, 304, 34, arg3, 0);
		arg5.method4685(Static207.anInt3842 / 2 - 151, local62 + 1, 302, 32, 0, 0);
		arg5.NA(Static207.anInt3842 / 2 - 150, local62 + 2, Static274.anInt4882 * 3, 30, arg2, 0);
		arg5.NA(Static207.anInt3842 / 2 + Static274.anInt4882 * 3 - 150, local62 + 2, 300 - Static274.anInt4882 * 3, 30, 0, 0);
		arg1.method5828(Static255.anInt4574 / 2 + 4, Static207.anInt3842 / 2, arg4, -1, Static364.aString42);
	}
}

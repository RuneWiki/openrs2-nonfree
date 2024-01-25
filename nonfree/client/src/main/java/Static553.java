import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "F")
	public static float aFloat189;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "[Lclient!pga;")
	public static Class32[] aClass32Array19;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "Lclient!he;")
	public static final Class128 aClass128_45 = new Class128(8);

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_85 = new Class208(14, 8);

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_54 = new Class166(5);

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
	public static int anInt9425 = 100;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z[Ljava/lang/String;)V")
	public static void method8004(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static489.aString98 = Static489.aString98 + arg0[0];
			Static44.anInt872 += arg0[0].length();
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
			if (arg0[local33].startsWith("pause")) {
				@Pc(52) int local52 = 5;
				try {
					local52 = Integer.parseInt(arg0[local33].substring(6));
				} catch (@Pc(61) Exception local61) {
				}
				Static97.method1576("Pausing for " + local52 + " seconds...");
				Static603.anInt10033 = local33 + 1;
				Static422.aStringArray53 = arg0;
				Static560.aLong247 = Static32.method595() + (long) (local52 * 1000);
				return;
			}
			Static489.aString98 = arg0[local33];
			Static253.method4541(false);
		}
	}
}

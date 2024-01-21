import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!wa;")
	public static Class23 aClass23_18;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[Lclient!ji;")
	public static Class5_Sub2_Sub10[] aClass5_Sub2_Sub10Array4;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	public static int anInt671;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!ig;")
	public static Class5_Sub2_Sub8 aClass5_Sub2_Sub8_2;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_244 = Static161.method2452("m");

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!ib;")
	public static final Class5_Sub15 aClass5_Sub15_1 = new Class5_Sub15(0, 0);

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_245 = Static161.method2452(" more options");

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	public static int anInt670 = 0;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_246 = Static161.method2452("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_247 = Static161.method2452(")2");

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_248 = Static161.method2452("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!dc;")
	public static Class20 aClass20_249 = aClass20_245;

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)J")
	public static long method509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass86_1 == null ? 0L : local7.aClass86_1.aLong190;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	public static void method510() {
		for (@Pc(6) Class5_Sub25 local6 = (Class5_Sub25) Static75.aClass75_7.method2067(); local6 != null; local6 = (Class5_Sub25) Static75.aClass75_7.method2066()) {
			@Pc(11) int local11 = local6.anInt3526;
			if (Static37.method1027(local11)) {
				@Pc(17) boolean local17 = true;
				@Pc(21) Class69[] local21 = Static155.aClass69ArrayArray1[local11];
				for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
					if (local21[local23] != null) {
						local17 = local21[local23].aBoolean103;
						break;
					}
				}
				if (!local17) {
					@Pc(51) int local51 = (int) local6.aLong253;
					@Pc(55) Class69 local55 = Static157.method2392(local51);
					if (local55 != null) {
						Static184.method2779(local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!f;Z)V")
	public static void method514(@OriginalArg(0) Class5_Sub11 arg0) {
		if (arg0.aClass5_Sub7_5 != null) {
			arg0.aClass5_Sub7_5.anInt2686 = 0;
		}
		arg0.aBoolean171 = false;
		for (@Pc(22) Class5_Sub11 local22 = arg0.method2866(); local22 != null; local22 = arg0.method2865()) {
			method514(local22);
		}
	}
}

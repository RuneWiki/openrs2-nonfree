import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_24;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "Lclient!ce;")
	public static Class5_Sub6 aClass5_Sub6_4;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
	public static int anInt3533 = 0;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1298 = Static161.method2452(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1300 = Static161.method2452("This world is full)3");

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1299 = aClass20_1300;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
	public static int anInt3542 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILclient!dc;Lclient!dc;Lclient!dc;B)V")
	public static void method2680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class20 arg4) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static53.anIntArray105[local7] = Static53.anIntArray105[local7 - 1];
			Static73.aClass20Array8[local7] = Static73.aClass20Array8[local7 - 1];
			Static143.aClass20Array24[local7] = Static143.aClass20Array24[local7 - 1];
			Static89.aClass20Array12[local7] = Static89.aClass20Array12[local7 - 1];
			Static196.anIntArray406[local7] = Static196.anIntArray406[local7 - 1];
		}
		Static195.anInt3812 = Static98.anInt2085;
		Static107.anInt2194++;
		Static73.aClass20Array8[0] = arg4;
		Static143.aClass20Array24[0] = arg2;
		Static89.aClass20Array12[0] = arg3;
		Static53.anIntArray105[0] = arg0;
		Static196.anIntArray406[0] = arg1;
	}
}

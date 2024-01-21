import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_12;

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "[Lclient!ih;")
	public static final Class43[] aClass43Array2 = new Class43[100];

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_805 = Static161.method2452("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_808 = Static161.method2452("Members only world");

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "Lclient!dc;")
	public static Class20 aClass20_806 = aClass20_808;

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_807 = Static161.method2452("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "[I")
	public static final int[] anIntArray232 = new int[50];

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
	public static int anInt2175 = 0;

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_809 = Static161.method2452("<col=ff7000>");

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
	public static int anInt2176 = 0;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Lclient!ih;")
	public static Class43 method1708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt333; local13++) {
			@Pc(19) Class43 local19 = local7.aClass43Array1[local13];
			if ((local19.aLong102 >> 29 & 0x3L) == 2L && local19.anInt1811 == arg1 && local19.anInt1816 == arg2) {
				return local19;
			}
		}
		return null;
	}
}

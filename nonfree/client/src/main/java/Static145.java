import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
	public static int anInt2755;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "Lclient!m;")
	public static final Class235 aClass235_17 = new Class235(52);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIILclient!av;)V")
	public static void method2394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class20 arg2) {
		Static518.anInt8817 = arg0;
		Static139.anInt2622 = arg1;
		Static490.aClass20_15 = arg2;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)Lclient!pm;")
	public static Class291 method2396(@OriginalArg(1) int arg0) {
		@Pc(16) Class291[] local16 = Static590.method8100();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class291 local24 = local16[local18];
			if (arg0 == local24.anInt8509) {
				return local24;
			}
		}
		return null;
	}
}

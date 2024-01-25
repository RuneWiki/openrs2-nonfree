import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!tha", name = "u", descriptor = "D")
	public static double aDouble16;

	@OriginalMember(owner = "client!tha", name = "g", descriptor = "J")
	public static long aLong241 = 0L;

	@OriginalMember(owner = "client!tha", name = "m", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_84 = new Class208(34, 3);

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method7967(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static530.anInt8592;
		@Pc(17) int[] local17 = Static551.anIntArray576;
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
			@Pc(29) Class20_Sub2_Sub2_Sub1_Sub1 local29 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local17[local21]];
			if (local29 != null && local29 != Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 && local29.aString12 != null && local29.aString12.equalsIgnoreCase(arg0)) {
				local19 = true;
				@Pc(66) Class6_Sub9 local66;
				if (arg1 == 1) {
					local66 = Static560.method8089(Static391.aClass126_1, Static345.aClass208_56);
					local66.aClass6_Sub40_Sub2_1.method8586(0);
					local66.aClass6_Sub40_Sub2_1.method8593(local17[local21]);
					Static263.method4681(local66);
				} else if (arg1 == 4) {
					local66 = Static560.method8089(Static391.aClass126_1, Static257.aClass208_43);
					local66.aClass6_Sub40_Sub2_1.method8609(local17[local21]);
					local66.aClass6_Sub40_Sub2_1.method8586(0);
					Static263.method4681(local66);
				} else if (arg1 == 5) {
					local66 = Static560.method8089(Static391.aClass126_1, Static90.aClass208_17);
					local66.aClass6_Sub40_Sub2_1.method8556(0);
					local66.aClass6_Sub40_Sub2_1.method8565(local17[local21]);
					Static263.method4681(local66);
				} else if (arg1 == 6) {
					local66 = Static560.method8089(Static391.aClass126_1, Static589.aClass208_91);
					local66.aClass6_Sub40_Sub2_1.method8609(local17[local21]);
					local66.aClass6_Sub40_Sub2_1.method8563(0);
					Static263.method4681(local66);
				} else if (arg1 == 7) {
					local66 = Static560.method8089(Static391.aClass126_1, Static567.aClass208_87);
					local66.aClass6_Sub40_Sub2_1.method8563(0);
					local66.aClass6_Sub40_Sub2_1.method8561(local17[local21]);
					Static263.method4681(local66);
				}
				break;
			}
		}
		if (!local19) {
			Static342.method5551(Static317.aClass192_21.method5299(Static307.anInt5931) + arg0);
		}
	}
}

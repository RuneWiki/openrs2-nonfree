import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_22 = new Class286(72, 15);

	@OriginalMember(owner = "client!ck", name = "J", descriptor = "Lclient!ki;")
	public static final Class190 aClass190_2 = new Class190();

	@OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
	public static int anInt1500 = 0;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!ha;III[Z)Z")
	public static boolean method1052(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static421.aClass67Array7 != Static592.aClass67Array4) {
			@Pc(12) int local12 = Static569.aClass67Array8[arg1].method6711(arg3, arg2);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class67 local19 = Static569.aClass67Array8[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method6711(arg3, arg2);
					if (arg4 != null) {
						arg4[local14] = local19.method6705(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.E(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}

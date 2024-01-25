import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!rs", name = "x", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!rs", name = "v", descriptor = "Lclient!vaa;")
	public static final Class299 aClass299_6 = new Class299();

	@OriginalMember(owner = "client!rs", name = "y", descriptor = "I")
	public static int anInt8037 = 0;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIII)V")
	public static void method6643(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		Static341.anInt6481 = arg0;
		Static251.anInt5168 = 0;
		Static507.anInt9124 = 0;
		Static234.anInt4897 = arg1;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IFFF)F")
	public static float method6644(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg0 + (arg2 - arg0) * arg1;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6646(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(29) String local29 = Static458.method6893(arg0);
		if (local29 == null) {
			return;
		}
		for (@Pc(34) int local34 = 0; local34 < Static358.anInt6694; local34++) {
			@Pc(40) String local40 = Static440.aStringArray54[local34];
			if (local40.startsWith("*")) {
				local40 = local40.substring(1);
			}
			local40 = Static458.method6893(local40);
			if (local40 != null && local40.equals(local29)) {
				Static358.anInt6694--;
				for (@Pc(64) int local64 = local34; local64 < Static358.anInt6694; local64++) {
					Static440.aStringArray54[local64] = Static440.aStringArray54[local64 + 1];
					Static54.aStringArray5[local64] = Static54.aStringArray5[local64 + 1];
					Static540.aStringArray61[local64] = Static540.aStringArray61[local64 + 1];
					Static362.aStringArray43[local64] = Static362.aStringArray43[local64 + 1];
					Static391.aBooleanArray39[local64] = Static391.aBooleanArray39[local64 + 1];
				}
				Static395.anInt7445 = Static413.anInt7729;
				Static332.method5312(Static458.aClass77_79);
				Static383.aClass12_Sub8_Sub2_1.method5214(Static201.method3811(arg0));
				Static383.aClass12_Sub8_Sub2_1.method5180(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZ)V")
	public static void method6647(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class12_Sub23 local10 = Static292.method4742(arg0, arg1);
		if (local10 != null) {
			for (@Pc(19) int local19 = 0; local19 < local10.anIntArray333.length; local19++) {
				local10.anIntArray333[local19] = -1;
				local10.anIntArray334[local19] = 0;
			}
		}
	}
}

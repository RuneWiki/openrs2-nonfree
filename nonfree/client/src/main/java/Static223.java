import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
	public static int anInt4189;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3811(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static156.method2258(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static48.anInt995; local29++) {
			@Pc(35) String local35 = Static400.aStringArray55[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static156.method2258(local35);
			if (local35 != null && local35.equals(local20)) {
				Static48.anInt995--;
				for (@Pc(59) int local59 = local29; local59 < Static48.anInt995; local59++) {
					Static400.aStringArray55[local59] = Static400.aStringArray55[local59 + 1];
					Static257.aStringArray32[local59] = Static257.aStringArray32[local59 + 1];
					Static408.anIntArray379[local59] = Static408.anIntArray379[local59 + 1];
					Static362.aStringArray46[local59] = Static362.aStringArray46[local59 + 1];
					Static456.anIntArray417[local59] = Static456.anIntArray417[local59 + 1];
					Static235.aBooleanArray13[local59] = Static235.aBooleanArray13[local59 + 1];
				}
				Static197.anInt10377 = Static126.anInt2290;
				@Pc(124) Class5_Sub48 local124 = Static16.method232(Static227.aClass46_43, Static276.aClass251_2);
				local124.aClass5_Sub22_Sub1_2.method5905(Static381.method5596(arg0));
				local124.aClass5_Sub22_Sub1_2.method5910(arg0);
				Static277.method4436(local124);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!pe;I)V")
	public static void method3812(@OriginalArg(0) Class4_Sub2_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class4_Sub2_Sub1_Sub1_Sub2) {
			@Pc(28) Class4_Sub2_Sub1_Sub1_Sub2 local28 = (Class4_Sub2_Sub1_Sub1_Sub2) arg0;
			if (local28.aClass225_1 != null) {
				Static607.method8166(local28, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 != local28.aByte132);
			}
		} else if (arg0 instanceof Class4_Sub2_Sub1_Sub1_Sub1) {
			@Pc(12) Class4_Sub2_Sub1_Sub1_Sub1 local12 = (Class4_Sub2_Sub1_Sub1_Sub1) arg0;
			Static179.method2722(local12.aByte132 != Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132, local12);
		}
	}
}

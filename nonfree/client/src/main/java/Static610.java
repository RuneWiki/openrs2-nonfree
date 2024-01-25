import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "[[Lclient!rja;")
	public static Class304[][] aClass304ArrayArray1;

	@OriginalMember(owner = "client!uo", name = "C", descriptor = "I")
	public static int anInt10303 = 1;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method8579(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(26) String local26 = Static566.method8154(arg0);
		if (local26 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static592.anInt1870; local31++) {
			@Pc(37) String local37 = Static369.aStringArray24[local31];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static566.method8154(local37);
			if (local37 != null && local37.equals(local26)) {
				Static592.anInt1870--;
				for (@Pc(61) int local61 = local31; local61 < Static592.anInt1870; local61++) {
					Static369.aStringArray24[local61] = Static369.aStringArray24[local61 + 1];
					Static570.aStringArray37[local61] = Static570.aStringArray37[local61 + 1];
					Static620.anIntArray765[local61] = Static620.anIntArray765[local61 + 1];
					Static674.aStringArray47[local61] = Static674.aStringArray47[local61 + 1];
					Static555.anIntArray694[local61] = Static555.anIntArray694[local61 + 1];
					Static267.aBooleanArray14[local61] = Static267.aBooleanArray14[local61 + 1];
				}
				Static619.anInt10403 = Static441.anInt7833;
				@Pc(130) Class14_Sub19 local130 = Static286.method4081(Static205.aClass394_1, Static544.aClass100_116);
				local130.aClass14_Sub29_Sub1_1.method5854(Static651.method9066(arg0));
				local130.aClass14_Sub29_Sub1_1.method5855(arg0);
				Static576.method8234(local130);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V")
	public static void method8580() {
		Static558.aClass14_Sub5_Sub2_2.method3899();
		Static507.anInt8961 = 1;
		Static628.aClass14_Sub5_Sub2_4 = null;
		Static478.aClass386_105 = null;
	}
}

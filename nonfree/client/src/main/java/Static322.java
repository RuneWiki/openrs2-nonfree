import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!km", name = "f", descriptor = "I")
	public static int anInt5593;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "I")
	public static int anInt5594;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method5059(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static458.anInt7639 >= 100) {
			Static354.method5381(Static21.aClass21_38.method324(Static26.anInt352));
			return;
		}
		@Pc(23) String local23 = Static531.method7864(arg1);
		if (local23 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(29) int local29 = 0; local29 < Static458.anInt7639; local29++) {
			@Pc(36) String local36 = Static531.method7864(Static292.aStringArray24[local29]);
			if (local36 != null && local36.equals(local23)) {
				Static354.method5381(arg1 + Static21.aClass21_39.method324(Static26.anInt352));
				return;
			}
			if (Static466.aStringArray34[local29] != null) {
				local72 = Static531.method7864(Static466.aStringArray34[local29]);
				if (local72 != null && local72.equals(local23)) {
					Static354.method5381(arg1 + Static21.aClass21_39.method324(Static26.anInt352));
					return;
				}
			}
		}
		for (@Pc(117) int local117 = 0; local117 < Static261.anInt4885; local117++) {
			local72 = Static531.method7864(Static265.aStringArray23[local117]);
			if (local72 != null && local72.equals(local23)) {
				Static354.method5381(Static21.aClass21_44.method324(Static26.anInt352) + arg1 + Static21.aClass21_45.method324(Static26.anInt352));
				return;
			}
			if (Static557.aStringArray37[local117] != null) {
				@Pc(163) String local163 = Static531.method7864(Static557.aStringArray37[local117]);
				if (local163 != null && local163.equals(local23)) {
					Static354.method5381(Static21.aClass21_44.method324(Static26.anInt352) + arg1 + Static21.aClass21_45.method324(Static26.anInt352));
					return;
				}
			}
		}
		if (Static531.method7864(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aString37).equals(local23)) {
			Static354.method5381(Static21.aClass21_41.method324(Static26.anInt352));
			return;
		}
		@Pc(221) Class347 local221 = Static435.method6495();
		@Pc(227) Class14_Sub54 local227 = Static72.method1195(local221.aClass197_2, Static541.aClass251_220);
		local227.aClass14_Sub21_Sub2_2.method7747(Static418.method6276(arg1) + 1);
		local227.aClass14_Sub21_Sub2_2.method7690(arg1);
		local227.aClass14_Sub21_Sub2_2.method7747(arg0 ? 1 : 0);
		local221.method8308(local227);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!gba;IIII)V")
	public static void method5060(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(18) Class14_Sub42 local18 = (Class14_Sub42) Static618.aClass32_66.method584(); local18 != null; local18 = (Class14_Sub42) Static618.aClass32_66.method577()) {
			if (local18.anInt9541 == arg3 && local18.anInt9546 == arg2 << 9 && local18.anInt9535 == arg1 << 9 && arg0.anInt2969 == local18.aClass128_1.anInt2969) {
				if (local18.aClass14_Sub1_Sub1_4 != null) {
					Static196.aClass14_Sub1_Sub2_1.method1810(local18.aClass14_Sub1_Sub1_4);
					local18.aClass14_Sub1_Sub1_4 = null;
				}
				if (local18.aClass14_Sub1_Sub1_3 != null) {
					Static196.aClass14_Sub1_Sub2_1.method1810(local18.aClass14_Sub1_Sub1_3);
					local18.aClass14_Sub1_Sub1_3 = null;
				}
				local18.method9513();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZI)V")
	public static void method5061(@OriginalArg(1) int arg0) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg0, 7);
		local9.method4001();
	}
}

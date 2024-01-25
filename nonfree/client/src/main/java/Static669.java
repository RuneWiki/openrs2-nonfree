import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static669 {

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "F")
	public static float aFloat209;

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
	public static int anInt10940;

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "Z")
	public static boolean aBoolean764 = false;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIII)V")
	public static void method9280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) int local11 = Static301.method5308(Static410.anInt7068, Static281.anInt5188, arg4);
		@Pc(17) int local17 = Static301.method5308(Static410.anInt7068, Static281.anInt5188, arg1);
		@Pc(23) int local23 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg6);
		@Pc(29) int local29 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg0);
		@Pc(37) int local37 = Static301.method5308(Static410.anInt7068, Static281.anInt5188, arg4 + arg2);
		@Pc(45) int local45 = Static301.method5308(Static410.anInt7068, Static281.anInt5188, arg1 - arg2);
		for (@Pc(47) int local47 = local11; local47 < local37; local47++) {
			Static240.method4038(local29, Static144.anIntArrayArray30[local47], arg5, local23);
		}
		if (arg3 != 4) {
			method9280(-105, 37, -107, 118, -60, 66, 3);
		}
		for (@Pc(86) int local86 = local17; local86 > local45; local86--) {
			Static240.method4038(local29, Static144.anIntArrayArray30[local86], arg5, local23);
		}
		@Pc(114) int local114 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg6 + arg2);
		@Pc(123) int local123 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg0 - arg2);
		for (@Pc(125) int local125 = local37; local125 <= local45; local125++) {
			@Pc(133) int[] local133 = Static144.anIntArrayArray30[local125];
			Static240.method4038(local114, local133, arg5, local23);
			Static240.method4038(local29, local133, arg5, local123);
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(JJ)J")
	public static long method9281(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method9282(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static261.anInt4885 >= 200 && !Static459.aBoolean734 || Static261.anInt4885 >= 200) {
			Static354.method5381(Static21.aClass21_10.method324(Static26.anInt352));
			return;
		}
		@Pc(32) String local32 = Static531.method7864(arg0);
		if (local32 == null) {
			return;
		}
		@Pc(79) String local79;
		for (@Pc(38) int local38 = 0; local38 < Static261.anInt4885; local38++) {
			@Pc(45) String local45 = Static531.method7864(Static265.aStringArray23[local38]);
			if (local45 != null && local45.equals(local32)) {
				Static354.method5381(arg0 + Static21.aClass21_37.method324(Static26.anInt352));
				return;
			}
			if (Static557.aStringArray37[local38] != null) {
				local79 = Static531.method7864(Static557.aStringArray37[local38]);
				if (local79 != null && local79.equals(local32)) {
					Static354.method5381(arg0 + Static21.aClass21_37.method324(Static26.anInt352));
					return;
				}
			}
		}
		for (@Pc(109) int local109 = 0; local109 < Static458.anInt7639; local109++) {
			local79 = Static531.method7864(Static292.aStringArray24[local109]);
			if (local79 != null && local79.equals(local32)) {
				Static354.method5381(Static21.aClass21_42.method324(Static26.anInt352) + arg0 + Static21.aClass21_43.method324(Static26.anInt352));
				return;
			}
			if (Static466.aStringArray34[local109] != null) {
				@Pc(155) String local155 = Static531.method7864(Static466.aStringArray34[local109]);
				if (local155 != null && local155.equals(local32)) {
					Static354.method5381(Static21.aClass21_42.method324(Static26.anInt352) + arg0 + Static21.aClass21_43.method324(Static26.anInt352));
					return;
				}
			}
		}
		if (Static531.method7864(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aString37).equals(local32)) {
			Static354.method5381(Static21.aClass21_40.method324(Static26.anInt352));
			return;
		}
		@Pc(224) Class347 local224 = Static435.method6495();
		@Pc(230) Class14_Sub54 local230 = Static72.method1195(local224.aClass197_2, Static113.aClass251_65);
		local230.aClass14_Sub21_Sub2_2.method7747(Static418.method6276(arg0));
		local230.aClass14_Sub21_Sub2_2.method7690(arg0);
		local224.method8308(local230);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IZ)V")
	public static void method9283() {
		@Pc(10) Class317 local10 = Static216.aClass317_32;
		synchronized (Static216.aClass317_32) {
			Static216.aClass317_32.method7870(5);
		}
	}
}

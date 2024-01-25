import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method4078(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static455.anInt7921 >= 100) {
			Static566.method7772(Static49.aClass42_39.method730(Static259.anInt4113));
			return;
		}
		@Pc(23) String local23 = Static555.method7630(arg1);
		if (local23 == null) {
			return;
		}
		@Pc(66) String local66;
		for (@Pc(28) int local28 = 0; local28 < Static455.anInt7921; local28++) {
			@Pc(35) String local35 = Static555.method7630(Static587.aStringArray38[local28]);
			if (local35 != null && local35.equals(local23)) {
				Static566.method7772(arg1 + Static49.aClass42_40.method730(Static259.anInt4113));
				return;
			}
			if (Static594.aStringArray39[local28] != null) {
				local66 = Static555.method7630(Static594.aStringArray39[local28]);
				if (local66 != null && local66.equals(local23)) {
					Static566.method7772(arg1 + Static49.aClass42_40.method730(Static259.anInt4113));
					return;
				}
			}
		}
		for (@Pc(97) int local97 = 0; local97 < Static529.anInt8750; local97++) {
			local66 = Static555.method7630(Static562.aStringArray36[local97]);
			if (local66 != null && local66.equals(local23)) {
				Static566.method7772(Static49.aClass42_45.method730(Static259.anInt4113) + arg1 + Static49.aClass42_46.method730(Static259.anInt4113));
				return;
			}
			if (Static128.aStringArray6[local97] != null) {
				@Pc(143) String local143 = Static555.method7630(Static128.aStringArray6[local97]);
				if (local143 != null && local143.equals(local23)) {
					Static566.method7772(Static49.aClass42_45.method730(Static259.anInt4113) + arg1 + Static49.aClass42_46.method730(Static259.anInt4113));
					return;
				}
			}
		}
		if (Static555.method7630(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aString100).equals(local23)) {
			Static566.method7772(Static49.aClass42_42.method730(Static259.anInt4113));
			return;
		}
		@Pc(201) Class5_Sub16 local201 = Static455.method6717(Static465.aClass187_71, Static16.aClass332_8);
		local201.aClass5_Sub15_Sub2_1.method3651(Static467.method6904(arg1) + 1);
		local201.aClass5_Sub15_Sub2_1.method3680(arg1);
		local201.aClass5_Sub15_Sub2_1.method3651(arg0 ? 1 : 0);
		Static479.method7038(local201);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZBLclient!ha;I)Lclient!jc;")
	public static Class176 method4080(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			return null;
		}
		if (Static596.anIntArray547 != null) {
			for (@Pc(12) int local12 = 0; local12 < Static596.anIntArray547.length; local12++) {
				if (arg2 == Static596.anIntArray547[local12]) {
					return Static429.aClass176Array1[local12];
				}
			}
		}
		@Pc(46) Class176 local46 = (Class176) Static214.aClass265_21.method6577((long) arg2);
		if (local46 != null) {
			if (arg0 && local46.aClass198_6 == null) {
				@Pc(58) Class198 local58 = Static249.method3522(Static108.aClass50_31, arg2);
				if (local58 == null) {
					return null;
				}
				local46.aClass198_6 = local58;
			}
			return local46;
		}
		@Pc(71) Class301[] local71 = Static684.method7229(Static663.aClass50_187, arg2);
		if (local71 == null) {
			return null;
		}
		@Pc(80) Class198 local80 = Static249.method3522(Static108.aClass50_31, arg2);
		if (local80 == null) {
			return null;
		}
		if (arg0) {
			local46 = new Class176(arg1.method6194(local80, local71), local80);
		} else {
			local46 = new Class176(arg1.method6194(local80, local71));
		}
		Static214.aClass265_21.method6566(local46, (long) arg2);
		return local46;
	}
}

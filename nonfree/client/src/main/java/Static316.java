import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5208(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(24) String local24 = Static456.method6912(arg0);
		if (local24 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static554.anInt9637; local29++) {
			@Pc(35) String local35 = Static525.aStringArray32[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static456.method6912(local35);
			if (local35 != null && local35.equals(local24)) {
				Static554.anInt9637--;
				for (@Pc(61) int local61 = local29; local61 < Static554.anInt9637; local61++) {
					Static525.aStringArray32[local61] = Static525.aStringArray32[local61 + 1];
					Static512.aStringArray31[local61] = Static512.aStringArray31[local61 + 1];
					Static304.aStringArray18[local61] = Static304.aStringArray18[local61 + 1];
					Static574.aStringArray35[local61] = Static574.aStringArray35[local61 + 1];
					Static423.aBooleanArray23[local61] = Static423.aBooleanArray23[local61 + 1];
				}
				Static198.anInt4606 = Static75.anInt2309;
				@Pc(118) Class8_Sub31 local118 = Static51.method1418(Static54.aClass257_14, Static608.aClass336_1);
				local118.aClass8_Sub8_Sub2_1.method8562(Static643.method8631(arg0));
				local118.aClass8_Sub8_Sub2_1.method8582(arg0);
				Static262.method4604(local118);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method5209(@OriginalArg(0) Class16 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = 0;
		if (Static513.aBoolean642) {
			local7 = Static550.method8313();
			local13 = Static530.method7484();
		}
		Static184.method3510(Static122.anInt3308 + local13, Static306.anInt6216, Static359.anInt6890, local7 + Static465.anInt8462, arg0);
		Static206.aClass27_20.method6993(Static465.anInt8462 + local7 + 3, -1, local13 + 14 + Static122.anInt3308, -10660793, Static121.aClass84_24.method2710(Static372.anInt7083));
		@Pc(62) int local62 = local7 + Static288.aClass35_6.method5764();
		@Pc(69) int local69 = Static288.aClass35_6.method5761() + local13;
		@Pc(73) int local73;
		@Pc(95) int local95;
		if (Static577.aBoolean710) {
			local73 = 0;
			for (@Pc(129) Class8_Sub5_Sub6 local129 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7327(); local129 != null; local129 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7326()) {
				local95 = local73 * 16 + local13 + Static122.anInt3308 + 31;
				if (local129.anInt3391 == 1) {
					Static249.method4527(local13 + Static122.anInt3308, (Class8_Sub5_Sub7) local129.aClass302_2.aClass8_Sub5_52.aClass8_Sub5_66, -1, -256, local62, Static306.anInt6216, local7 + Static465.anInt8462, arg0, Static359.anInt6890, local69, local95);
				} else {
					Static97.method2224(arg0, Static122.anInt3308 + local13, local129, local95, -256, local7 + Static465.anInt8462, Static306.anInt6216, -1, Static359.anInt6890, local62, local69);
				}
				local73++;
			}
			if (Static479.aClass8_Sub5_Sub6_1 != null) {
				Static184.method3510(Static528.anInt9126, Static358.anInt6868, Static331.anInt10704, Static264.anInt5648, arg0);
				Static206.aClass27_20.method6993(Static264.anInt5648 + 3, -1, Static528.anInt9126 + 14, -10660793, Static479.aClass8_Sub5_Sub6_1.aString37);
				local73 = 0;
				for (@Pc(225) Class8_Sub5_Sub7 local225 = (Class8_Sub5_Sub7) Static479.aClass8_Sub5_Sub6_1.aClass302_2.method7327(); local225 != null; local225 = (Class8_Sub5_Sub7) Static479.aClass8_Sub5_Sub6_1.aClass302_2.method7326()) {
					@Pc(236) int local236 = Static528.anInt9126 + local73 * 16 + 31;
					Static249.method4527(Static528.anInt9126, local225, -1, -256, local62, Static358.anInt6868, Static264.anInt5648, arg0, Static331.anInt10704, local69, local236);
					local73++;
				}
				Static436.method6738(Static358.anInt6868, Static528.anInt9126, Static331.anInt10704, Static264.anInt5648);
			}
		} else {
			local73 = 0;
			for (@Pc(78) Class8_Sub5_Sub7 local78 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1422(); local78 != null; local78 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1426()) {
				local95 = (Static548.anInt9471 - local73 - 1) * 16 + Static122.anInt3308 + local13 + 31;
				local73++;
				Static249.method4527(local13 + Static122.anInt3308, local78, -1, -256, local62, Static306.anInt6216, Static465.anInt8462 + local7, arg0, Static359.anInt6890, local69, local95);
			}
		}
		Static436.method6738(Static306.anInt6216, local13 + Static122.anInt3308, Static359.anInt6890, Static465.anInt8462 + local7);
	}
}

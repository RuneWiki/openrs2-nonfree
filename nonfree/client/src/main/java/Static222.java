import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
	public static int anInt3930 = 0;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(JB)V")
	public static void method3504(@OriginalArg(0) long arg0) {
		if (Static309.aClass299ArrayArrayArray3 != null) {
			if (Static379.anInt6482 == 1 || Static379.anInt6482 == 5) {
				Static212.method3417(arg0);
			} else if (Static379.anInt6482 == 4) {
				Static77.method1598(arg0);
			}
		}
		Static596.method7951(Static505.aClass45_11, (long) Static506.anInt8251);
		if (Static353.anInt6188 != -1) {
			Static18.method248(Static353.anInt6188);
		}
		for (@Pc(47) int local47 = 0; local47 < Static488.anInt7959; local47++) {
			if (Static319.aBooleanArray17[local47]) {
				Static93.aBooleanArray4[local47] = true;
			}
			Static326.aBooleanArray18[local47] = Static319.aBooleanArray17[local47];
			Static319.aBooleanArray17[local47] = false;
		}
		Static229.anInt4022 = Static506.anInt8251;
		if (Static353.anInt6188 != -1) {
			Static488.anInt7959 = 0;
			Static70.method1497();
		}
		Static505.aClass45_11.JA();
		Static208.method3390(Static505.aClass45_11);
		@Pc(92) int local92 = Static478.method6561();
		if (local92 == -1) {
			local92 = Static69.anInt1582;
		}
		if (local92 == -1) {
			local92 = Static87.anInt5456;
		}
		Static45.method737(local92);
		Static570.method7669(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442, Static541.anInt8161);
		Static541.anInt8161 = 0;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!np;B)Lclient!wm;")
	public static Class65_Sub1 method3505(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(7) Class65 local7 = Static5.method86(arg0);
		@Pc(11) int local11 = arg0.method5198();
		@Pc(15) int local15 = arg0.method5198();
		@Pc(19) int local19 = arg0.method5198();
		@Pc(28) int local28 = arg0.method5198();
		@Pc(32) int local32 = arg0.method5198();
		@Pc(36) int local36 = arg0.method5198();
		return new Class65_Sub1(local7.aClass63_16, local7.aClass249_16, local7.anInt5457, local7.anInt5460, local7.anInt5462, local7.anInt5461, local7.anInt5463, local7.anInt5459, local7.anInt5458, local11, local15, local19, local28, local32, local36);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)V")
	public static void method3506() {
		@Pc(13) int local13 = 0;
		if (Static405.aClass3_Sub3_Sub1_1 != null) {
			local13 = Static405.aClass3_Sub3_Sub1_1.method6310(Static60.anInt1312);
		}
		@Pc(35) int local35;
		@Pc(44) int local44;
		if (local13 == 2) {
			local35 = Static308.anInt5172 <= 800 ? Static308.anInt5172 : 800;
			Static40.anInt758 = local35;
			local44 = Static570.anInt9271 <= 600 ? Static570.anInt9271 : 600;
			Static322.anInt5444 = (Static308.anInt5172 - local35) / 2;
			Static308.anInt5171 = local44;
			Static486.anInt7950 = 0;
		} else if (local13 == 1) {
			local35 = Static308.anInt5172 > 1024 ? 1024 : Static308.anInt5172;
			local44 = Static570.anInt9271 <= 768 ? Static570.anInt9271 : 768;
			Static322.anInt5444 = (Static308.anInt5172 - local35) / 2;
			Static40.anInt758 = local35;
			Static486.anInt7950 = 0;
			Static308.anInt5171 = local44;
		} else {
			Static486.anInt7950 = 0;
			Static322.anInt5444 = 0;
			Static40.anInt758 = Static308.anInt5172;
			Static308.anInt5171 = Static570.anInt9271;
		}
	}
}

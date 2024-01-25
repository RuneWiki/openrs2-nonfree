import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_93 = new Class163(73, -1);

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_15 = new Class70(6, 0, 4, 2);

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "Lclient!of;")
	public static final Class174 aClass174_107 = new Class174(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "()V")
	public static void method3015() {
		Static249.method3548(Static174.anInt3263);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
	public static void method3016() {
		Static197.aClass193_30.method4524();
		for (@Pc(13) Class3_Sub38 local13 = (Class3_Sub38) Static325.aClass193_54.method4519(); local13 != null; local13 = (Class3_Sub38) Static325.aClass193_54.method4525()) {
			if (local13.anInt5875 < 1000) {
				local13.method6288();
				Static197.aClass193_30.method4527(local13);
			}
		}
		Static197.aClass193_30.method4526(Static325.aClass193_54);
		@Pc(41) int local41 = -1;
		@Pc(46) Class3_Sub5 local46 = (Class3_Sub5) Static273.aClass193_38.method4519();
		if (local46 != null) {
			local41 = local46.method5404();
		}
		if (!Static367.aBoolean425) {
			if (local41 == 0 && (Static29.anInt5767 == 1 && Static276.anInt4608 > 2 || Static383.method5318())) {
				local41 = 2;
			}
			if (local41 == 2 && Static276.anInt4608 > 0 && local46 != null) {
				if (Static296.aClass82_16 == null && Static20.anInt6289 == 0) {
					Static123.method1959(local46.method5408(), local46.method5406());
				} else {
					Static396.anInt6600 = 2;
				}
			}
			if (local41 == 0 && Static276.anInt4608 > 0) {
				Static440.method5940();
			}
			if (Static296.aClass82_16 == null && Static20.anInt6289 == 0) {
				Static133.aClass3_Sub38_1 = null;
				Static396.anInt6600 = 0;
				return;
			}
			return;
		}
		@Pc(128) int local128;
		@Pc(132) int local132;
		if (local41 == -1) {
			local128 = Static171.aClass50_1.method4993();
			local132 = Static171.aClass50_1.method4989();
			if (local128 < Static368.anInt6234 - 10 || Static368.anInt6234 + Static100.anInt1814 + 10 < local128 || Static348.anInt5871 - 10 > local132 || local132 > Static348.anInt5871 + Static242.anInt4125 + 10) {
				Static149.method2338();
			}
		}
		if (local41 != 0) {
			return;
		}
		local128 = Static368.anInt6234;
		local132 = Static348.anInt5871;
		@Pc(176) int local176 = Static100.anInt1814;
		@Pc(180) int local180 = local46.method5408();
		@Pc(184) int local184 = local46.method5406();
		@Pc(186) int local186 = -1;
		@Pc(205) int local205;
		for (@Pc(188) int local188 = 0; local188 < Static276.anInt4608; local188++) {
			if (Static71.aBoolean86) {
				local205 = local132 + (-local188 + Static276.anInt4608 - 1) * 16 + 33;
				if (local128 < local180 && local180 < local176 + local128 && local205 - 13 < local184 && local184 < local205 + 4) {
					local186 = local188;
				}
			} else {
				local205 = (Static276.anInt4608 - local188 - 1) * 16 + local132 + 31;
				if (local180 > local128 && local180 < local176 + local128 && local184 > local205 - 13 && local205 + 3 > local184) {
					local186 = local188;
				}
			}
		}
		if (local186 != -1) {
			local205 = 0;
			@Pc(295) Class21 local295 = new Class21(Static325.aClass193_54);
			for (@Pc(300) Class3_Sub38 local300 = (Class3_Sub38) local295.method499(); local300 != null; local300 = (Class3_Sub38) local295.method498()) {
				if (local205 == local186) {
					Static287.method5413(local300, local184, local180);
				}
				local205++;
			}
		}
		Static149.method2338();
	}
}

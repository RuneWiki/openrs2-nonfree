import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_150 = new Class287(68, 8);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII)V")
	public static void method8139(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class3_Sub30 local10 = (Class3_Sub30) Static407.aClass244_54.method5572(); local10 != null; local10 = (Class3_Sub30) Static407.aClass244_54.method5576()) {
			Static564.method7688(local10, arg2, arg3, arg1, arg0);
		}
		@Pc(175) boolean local175;
		for (@Pc(35) Class3_Sub30 local35 = (Class3_Sub30) Static483.aClass244_60.method5572(); local35 != null; local35 = (Class3_Sub30) Static483.aClass244_60.method5576()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class122 local44 = local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.method6683();
			if (local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.anInt8516 == -1 || local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.aBoolean579) {
				local39 = 0;
			} else if (local44.anInt4206 == local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.anInt8516 || local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.anInt8516 == local44.anInt4221 || local44.anInt4195 == local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.anInt8516 || local44.anInt4225 == local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.anInt8516) {
				local39 = 2;
			} else if (local44.anInt4187 == local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.anInt8516 || local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.anInt8516 == local44.anInt4205 || local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.anInt8516 == local44.anInt4211 || local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.anInt8516 == local44.anInt4198) {
				local39 = 3;
			}
			if (local35.anInt5193 != local39) {
				@Pc(132) int local132 = Static530.method7272(local35.aClass25_Sub2_Sub2_Sub5_Sub2_1);
				@Pc(136) Class213 local136 = local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.aClass213_1;
				if (local136.anIntArray345 != null) {
					local136 = local136.method4998(Static206.aClass143_3);
				}
				if (local136 == null || local132 == -1) {
					local35.anInt5188 = -1;
					local35.anInt5193 = local39;
					local35.aBoolean347 = false;
				} else if (local132 == local35.anInt5188 && local35.aBoolean347 == local136.aBoolean442) {
					local35.anInt5193 = local39;
					local35.anInt5187 = local136.anInt6189;
				} else {
					local175 = false;
					if (local35.aClass3_Sub16_Sub2_2 == null) {
						local175 = true;
					} else {
						local35.anInt5187 -= 512;
						if (local35.anInt5187 <= 0) {
							Static354.aClass3_Sub16_Sub4_2.method7757(local35.aClass3_Sub16_Sub2_2);
							local35.aClass3_Sub16_Sub2_2 = null;
							local175 = true;
						}
					}
					if (local175) {
						local35.aClass3_Sub32_2 = null;
						local35.anInt5193 = local39;
						local35.anInt5187 = local136.anInt6189;
						local35.aBoolean347 = local136.aBoolean442;
						local35.anInt5188 = local132;
						local35.aClass3_Sub17_Sub1_3 = null;
					}
				}
			}
			local35.anInt5180 = local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.anInt8476;
			local35.anInt5189 = local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.anInt8476 + (local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.method6668() << 8);
			local35.anInt5181 = local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.anInt8482;
			local35.anInt5190 = local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.anInt8482 + (local35.aClass25_Sub2_Sub2_Sub5_Sub2_1.method6668() << 8);
			Static564.method7688(local35, arg2, arg3, arg1, arg0);
		}
		for (@Pc(287) Class3_Sub30 local287 = (Class3_Sub30) Static66.aClass297_3.method6529(); local287 != null; local287 = (Class3_Sub30) Static66.aClass297_3.method6532()) {
			@Pc(291) byte local291 = 1;
			@Pc(296) Class122 local296 = local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.method6683();
			if (local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt8516 == -1 || local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.aBoolean579) {
				local291 = 0;
			} else if (local296.anInt4206 == local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt8516 || local296.anInt4221 == local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt8516 || local296.anInt4195 == local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt8516 || local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt8516 == local296.anInt4225) {
				local291 = 2;
			} else if (local296.anInt4187 == local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt8516 || local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt8516 == local296.anInt4205 || local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt8516 == local296.anInt4211 || local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt8516 == local296.anInt4198) {
				local291 = 3;
			}
			if (local287.anInt5193 != local291) {
				@Pc(388) int local388 = Static392.method5562(local287.aClass25_Sub2_Sub2_Sub5_Sub1_2);
				if (local287.anInt5188 == local388 && local287.aBoolean347 == local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.aBoolean496) {
					local287.anInt5187 = local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt7174;
					local287.anInt5193 = local291;
				} else {
					local175 = false;
					if (local287.aClass3_Sub16_Sub2_2 == null) {
						local175 = true;
					} else {
						local287.anInt5187 -= 512;
						if (local287.anInt5187 <= 0) {
							Static354.aClass3_Sub16_Sub4_2.method7757(local287.aClass3_Sub16_Sub2_2);
							local175 = true;
							local287.aClass3_Sub16_Sub2_2 = null;
						}
					}
					if (local175) {
						local287.anInt5193 = local291;
						local287.anInt5187 = local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt7174;
						local287.anInt5188 = local388;
						local287.aBoolean347 = local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.aBoolean496;
						local287.aClass3_Sub17_Sub1_3 = null;
						local287.aClass3_Sub32_2 = null;
					}
				}
			}
			local287.anInt5180 = local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt8476;
			local287.anInt5189 = local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt8476 + (local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.method6668() << 8);
			local287.anInt5181 = local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt8482;
			local287.anInt5190 = local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt8482 + (local287.aClass25_Sub2_Sub2_Sub5_Sub1_2.method6668() << 8);
			Static564.method7688(local287, arg2, arg3, arg1, arg0);
		}
	}
}

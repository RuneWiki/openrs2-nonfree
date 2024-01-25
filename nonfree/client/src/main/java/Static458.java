import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!wv", name = "q", descriptor = "S")
	public static short aShort108 = 32767;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Z")
	public static boolean method5729(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZIIIILclient!za;)V")
	public static void method5730(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class163 arg4) {
		arg4.ba(arg1, arg2, arg0 + arg1, arg2 + arg3);
		arg4.method5545(arg3, -16777216, arg0, arg2, arg1);
		if (Static178.anInt5442 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static282.anInt3475 / (float) Static282.anInt3468;
		@Pc(37) int local37 = arg0;
		@Pc(39) int local39 = arg3;
		if (local35 < 1.0F) {
			local39 = (int) (local35 * (float) arg0);
		} else {
			local37 = (int) ((float) arg3 / local35);
		}
		@Pc(71) int local71 = arg1 + (arg0 - local37) / 2;
		@Pc(80) int local80 = arg2 + (arg3 - local39) / 2;
		if (Static299.aClass13_19 == null || arg0 != Static299.aClass13_19.YA() || Static299.aClass13_19.ZA() != arg3) {
			Static282.method2774(Static282.anInt3479, Static282.anInt3477 + Static282.anInt3475, Static282.anInt3479 + Static282.anInt3468, Static282.anInt3477, local71, local80, local71 + local37, local80 - -local39);
			Static282.method2789(arg4);
			Static299.aClass13_19 = arg4.method5513(local71, local80, local37, local39, false);
		}
		Static299.aClass13_19.method5668(local71, local80);
		@Pc(138) int local138 = Static124.anInt1091 * local37 / Static282.anInt3468;
		@Pc(144) int local144 = local39 * Static253.anInt4075 / Static282.anInt3475;
		@Pc(153) int local153 = local71 + Static10.anInt143 * local37 / Static282.anInt3468;
		@Pc(166) int local166 = local80 + local39 - Static331.anInt5596 * local39 / Static282.anInt3475 - local144;
		@Pc(168) int local168 = -1996554240;
		if (Static270.aClass4_3 == Static118.aClass4_1) {
			local168 = -1996488705;
		}
		arg4.P(local153, local166, local138, local144, local168, 1);
		arg4.method5565(local153, local166, local138, local144, local168, 0);
		if (Static162.anInt2742 <= 0) {
			return;
		}
		@Pc(204) int local204;
		if (Static237.anInt3819 > 50) {
			local204 = (100 - Static237.anInt3819) * 5;
		} else {
			local204 = Static237.anInt3819 * 5;
		}
		for (@Pc(215) Class2_Sub40 local215 = (Class2_Sub40) Static282.aClass156_23.method3155(); local215 != null; local215 = (Class2_Sub40) Static282.aClass156_23.method3150()) {
			@Pc(223) Class78 local223 = Static282.aClass120_4.method2512(local215.anInt6352);
			if (Static308.method4222(local223)) {
				@Pc(252) int local252;
				@Pc(264) int local264;
				if (Static120.anInt2210 == local215.anInt6352) {
					local252 = local37 * local215.anInt6349 / Static282.anInt3468 + local71;
					local264 = local80 + (Static282.anInt3475 - local215.anInt6347) * local39 / Static282.anInt3475;
					arg4.method5545(4, local204 << 24 | 0xFFFF00, 4, local264 - 2, local252 - 2);
				} else if (Static47.anInt838 != -1 && local223.anInt2163 == Static47.anInt838) {
					local252 = local215.anInt6349 * local37 / Static282.anInt3468 + local71;
					local264 = (Static282.anInt3475 - local215.anInt6347) * local39 / Static282.anInt3475 + local80;
					arg4.method5545(4, local204 << 24 | 0xFFFF00, 4, local264 - 2, local252 + -2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "(B)V")
	public static void method5732() {
		if (Static128.anInt2309 == 0) {
			return;
		}
		try {
			if (++Static183.anInt3120 > 2000) {
				if (Static375.aClass160_3 != null) {
					Static375.aClass160_3.method3202();
					Static375.aClass160_3 = null;
				}
				if (Static116.anInt2153 >= 1) {
					Static128.anInt2309 = 0;
					Static310.anInt5372 = -5;
					return;
				}
				Static183.anInt3120 = 0;
				Static128.anInt2309 = 1;
				Static447.aClass265_5.aBoolean518 = !Static447.aClass265_5.aBoolean518;
				Static116.anInt2153++;
			}
			if (Static128.anInt2309 == 1) {
				Static229.aClass91_5 = Static79.aClass183_2.method3903(Static447.aClass265_5.aString199, Static447.aClass265_5.method5616());
				Static128.anInt2309 = 2;
			}
			@Pc(111) int local111;
			if (Static128.anInt2309 == 2) {
				if (Static229.aClass91_5.anInt2446 == 2) {
					throw new IOException();
				}
				if (Static229.aClass91_5.anInt2446 != 1) {
					return;
				}
				Static375.aClass160_3 = new Class160((Socket) Static229.aClass91_5.anObject3, Static79.aClass183_2);
				Static229.aClass91_5 = null;
				Static375.aClass160_3.method3210(Static456.aClass2_Sub13_Sub2_2.anInt4347, Static456.aClass2_Sub13_Sub2_2.aByteArray52);
				Static113.method1715();
				local111 = Static375.aClass160_3.method3205();
				Static113.method1715();
				if (local111 != 21) {
					Static310.anInt5372 = local111;
					Static128.anInt2309 = 0;
					Static375.aClass160_3.method3202();
					Static375.aClass160_3 = null;
					return;
				}
				Static128.anInt2309 = 3;
			}
			if (Static128.anInt2309 == 3) {
				if (Static375.aClass160_3.method3211() < 1) {
					return;
				}
				Static444.aStringArray41 = new String[Static375.aClass160_3.method3205()];
				Static128.anInt2309 = 4;
			}
			if (Static128.anInt2309 == 4 && Static375.aClass160_3.method3211() >= Static444.aStringArray41.length * 8) {
				Static26.aClass2_Sub13_Sub2_1.anInt4347 = 0;
				Static375.aClass160_3.method3207(Static444.aStringArray41.length * 8, Static26.aClass2_Sub13_Sub2_1.aByteArray52, 0);
				for (local111 = 0; local111 < Static444.aStringArray41.length; local111++) {
					Static444.aStringArray41[local111] = Static134.method1995(Static26.aClass2_Sub13_Sub2_1.method3597());
				}
				Static128.anInt2309 = 0;
				Static310.anInt5372 = 21;
				Static375.aClass160_3.method3202();
				Static375.aClass160_3 = null;
			}
		} catch (@Pc(217) IOException local217) {
			if (Static375.aClass160_3 != null) {
				Static375.aClass160_3.method3202();
				Static375.aClass160_3 = null;
			}
			if (Static116.anInt2153 < 1) {
				Static183.anInt3120 = 0;
				Static116.anInt2153++;
				Static128.anInt2309 = 1;
				Static447.aClass265_5.aBoolean518 = !Static447.aClass265_5.aBoolean518;
			} else {
				Static310.anInt5372 = -4;
				Static128.anInt2309 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIZI)Lclient!ha;")
	public static Class2_Sub21 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class2_Sub21 local7 = new Class2_Sub21();
		local7.anInt2585 = arg0;
		local7.anInt2586 = arg1;
		Static418.aClass72_44.method1653(local7, (long) arg2);
		Static457.method5717(arg0);
		@Pc(28) Class16 local28 = Static338.method4534(arg2);
		if (local28 != null) {
			Static176.method70(local28);
		}
		if (Static324.aClass16_16 != null) {
			Static176.method70(Static324.aClass16_16);
			Static324.aClass16_16 = null;
		}
		Static320.method4352();
		if (local28 != null) {
			Static399.method5068(!arg3, local28);
		}
		if (!arg3) {
			Static191.method2566(arg0);
		}
		if (!arg3 && Static142.anInt2523 != -1) {
			Static361.method4757(1, Static142.anInt2523);
		}
		return local7;
	}
}

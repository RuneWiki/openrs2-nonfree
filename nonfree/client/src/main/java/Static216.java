import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "B")
	public static byte aByte34;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "Lclient!ek;")
	public static final Class54 aClass54_3 = new Class54();

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
	public static int anInt4151 = 0;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	public static int anInt4152 = -1;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!nd;Lclient!li;IIZLclient!ae;)Z")
	public static boolean method3813(@OriginalArg(0) Class2_Sub31 arg0, @OriginalArg(1) Class120 arg1, @OriginalArg(5) Class4 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray297 != null) {
			local9 = Static127.anInt1563 + (arg1.anInt3654 + arg0.anInt4063 - Static127.anInt1573) * (Static127.anInt1571 - Static127.anInt1563) / (Static127.anInt1562 - Static127.anInt1573);
			local11 = Static127.anInt1570 - (Static127.anInt1570 - Static127.anInt1572) * (-Static127.anInt1569 + arg1.anInt3647 - -arg0.anInt4059) / (Static127.anInt1565 - Static127.anInt1569);
			local7 = Static127.anInt1563 + (arg0.anInt4063 + arg1.anInt3641 - Static127.anInt1573) * (Static127.anInt1571 - Static127.anInt1563) / (Static127.anInt1562 - Static127.anInt1573);
			local13 = Static127.anInt1570 - (Static127.anInt1570 - Static127.anInt1572) * (arg0.anInt4059 + arg1.anInt3666 - Static127.anInt1569) / (Static127.anInt1565 - Static127.anInt1569);
		}
		@Pc(103) Class31 local103 = null;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		if (arg1.anInt3646 != -1) {
			if (arg0.aBoolean363 && arg1.anInt3650 != -1) {
				local103 = arg1.method3330(arg2, true);
			} else {
				local103 = arg1.method3330(arg2, false);
			}
			if (local103 != null) {
				local105 = arg0.anInt4060 - (local103.method4376() + 1 >> 1);
				local107 = arg0.anInt4060 + (local103.method4376() + 1 >> 1);
				if (local7 > local105) {
					local7 = local105;
				}
				if (local107 > local9) {
					local9 = local107;
				}
				local109 = arg0.anInt4064 - (local103.method4378() + 1 >> 1);
				if (local109 < local11) {
					local11 = local109;
				}
				local111 = arg0.anInt4064 + (local103.method4378() + 1 >> 1);
				if (local13 < local111) {
					local13 = local111;
				}
			}
		}
		@Pc(208) Class98 local208 = null;
		@Pc(210) int local210 = 0;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(272) int local272;
		@Pc(295) int local295;
		if (arg1.aString32 != null) {
			local208 = Static203.method3130(arg1.anInt3662);
			if (local208 != null) {
				local210 = Static203.aClass188_7.method5316(arg1.aString32, null, null, Static6.aStringArray1);
				local212 = arg0.anInt4064;
				if (local103 == null) {
					local212 -= local208.method2967() * local210 / 2;
				} else {
					local212 -= (local103.method4378() >> 1) + (local208.method2965() * local210);
				}
				for (local272 = 0; local272 < local210; local272++) {
					@Pc(278) String local278 = Static6.aStringArray1[local272];
					if (local272 < local210 - 1) {
						local278 = local278.substring(0, local278.length() - 4);
					}
					local295 = local208.method2964(local278);
					if (local295 > local214) {
						local214 = local295;
					}
				}
				local216 = arg0.anInt4060 - local214 / 2;
				if (local7 > local216) {
					local7 = local216;
				}
				local218 = arg0.anInt4060 + local214 / 2;
				local220 = local212;
				if (local218 > local9) {
					local9 = local218;
				}
				local222 = local212 + local208.method2965() * local210;
				if (local220 < local11) {
					local11 = local220;
				}
				if (local222 > local13) {
					local13 = local222;
				}
			}
		}
		if (Static127.anInt1563 > local9 || Static127.anInt1571 < local7 || Static127.anInt1572 > local13 || local11 > Static127.anInt1570) {
			return true;
		}
		@Pc(413) int local413;
		if (arg1.anIntArray297 != null) {
			@Pc(411) int[] local411 = new int[arg1.anIntArray297.length];
			for (local413 = 0; local413 < local411.length / 2; local413++) {
				local295 = arg1.anIntArray297[local413 * 2] + arg0.anInt4063;
				@Pc(437) int local437 = arg1.anIntArray297[local413 * 2 + 1] + arg0.anInt4059;
				local411[local413 * 2] = (Static127.anInt1571 - Static127.anInt1563) * (-Static127.anInt1573 + local295) / (Static127.anInt1562 - Static127.anInt1573) + Static127.anInt1563;
				local411[local413 * 2 + 1] = Static127.anInt1570 - (local437 - Static127.anInt1569) * (-Static127.anInt1572 + Static127.anInt1570) / (Static127.anInt1565 - Static127.anInt1569);
			}
			Static16.method638(arg2, local411, arg1.anInt3664);
			for (local295 = 0; local295 < local411.length / 2 - 1; local295++) {
				arg2.method4230(local411[(local295 + 1) * 2], local411[(local295 + 1) * 2 + 1], local411[local295 * 2 + 1], local411[local295 * 2], arg1.anInt3655);
			}
			arg2.method4230(local411[0], local411[1], local411[local411.length - 1], local411[local411.length - 2], arg1.anInt3655);
		}
		if (local103 != null) {
			if (Static104.anInt5551 > 0 && (Static52.anInt1119 != -1 && Static52.anInt1119 == arg0.anInt4062 || Static20.anInt434 != -1 && arg1.anInt3637 == Static20.anInt434)) {
				if (Static203.anInt3379 > 50) {
					local272 = (100 - Static203.anInt3379) * 2;
				} else {
					local272 = Static203.anInt3379 * 2;
				}
				local413 = local272 << 24 | 0xFFFF00;
				arg2.method4234(arg0.anInt4064, local103.method4392() / 2 + 7, local413, arg0.anInt4060);
				arg2.method4234(arg0.anInt4064, local103.method4392() / 2 + 5, local413, arg0.anInt4060);
				arg2.method4234(arg0.anInt4064, local103.method4392() / 2 + 3, local413, arg0.anInt4060);
				arg2.method4234(arg0.anInt4064, local103.method4392() / 2 + 1, local413, arg0.anInt4060);
				arg2.method4234(arg0.anInt4064, local103.method4392() / 2, local413, arg0.anInt4060);
			}
			local103.method4377(arg0.anInt4060 - (local103.method4376() >> 1), arg0.anInt4064 - (local103.method4378() >> 1));
		}
		if (arg1.aString32 != null && local208 != null) {
			Static48.method1187(local208, local212, arg2, arg0, local210, local214, arg1);
		}
		if (arg1.anInt3646 != -1 || arg1.aString32 != null) {
			@Pc(722) Class2_Sub38 local722 = new Class2_Sub38(arg0);
			local722.anInt5880 = local107;
			local722.anInt5872 = local111;
			local722.anInt5877 = local218;
			local722.anInt5874 = local220;
			local722.anInt5873 = local109;
			local722.anInt5875 = local216;
			local722.anInt5881 = local222;
			local722.anInt5871 = local105;
			Static56.aClass216_19.method5995(local722);
		}
		return false;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)I")
	public static int method3815(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}
}

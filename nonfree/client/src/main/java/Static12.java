import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!am", name = "b", descriptor = "Lclient!qq;")
	public static Class22_Sub1 aClass22_Sub1_1;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "I")
	public static int anInt180 = 0;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	public static final int anInt181 = 1;

	@OriginalMember(owner = "client!am", name = "k", descriptor = "[B")
	public static final byte[] aByteArray3 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!am", name = "l", descriptor = "Z")
	public static final boolean aBoolean10 = false;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/awt/Canvas;IILclient!l;Lclient!dq;)Lclient!qa;")
	public static Class167 method199(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface7 arg2, @OriginalArg(4) Class51 arg3) {
		return new c(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIBIIILclient!kg;)Z")
	public static boolean method200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class128 arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg4;
		@Pc(26) int local26 = arg3 - 64;
		Static220.anIntArrayArray36[64][64] = 99;
		@Pc(37) int local37 = arg4 - 64;
		Static248.anIntArrayArray34[64][64] = 0;
		@Pc(45) byte local45 = 0;
		@Pc(47) int local47 = 0;
		Static203.anIntArray227[0] = arg3;
		@Pc(54) int local54 = local45 + 1;
		Static424.anIntArray459[0] = arg4;
		@Pc(59) int[][] local59 = arg9.anIntArrayArray27;
		while (local47 != local54) {
			local9 = Static424.anIntArray459[local47];
			local7 = Static203.anIntArray227[local47];
			@Pc(75) int local75 = local9 - arg9.anInt3692;
			local47 = local47 + 1 & 0xFFF;
			@Pc(86) int local86 = local7 - arg9.anInt3691;
			@Pc(91) int local91 = local7 - local26;
			@Pc(96) int local96 = local9 - local37;
			if (arg2 == -4) {
				if (arg7 == local7 && local9 == arg5) {
					Static15.anInt282 = local9;
					Static129.anInt2348 = local7;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static74.method1318(local7, 1, arg8, arg7, local9, 1, arg5, arg1)) {
					Static129.anInt2348 = local7;
					Static15.anInt282 = local9;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg9.method3187(local9, arg0, arg7, 1, arg1, arg5, 1, local7, arg8)) {
					Static15.anInt282 = local9;
					Static129.anInt2348 = local7;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg9.method3189(arg0, arg1, arg7, 1, arg5, local7, local9, arg8)) {
					Static129.anInt2348 = local7;
					Static15.anInt282 = local9;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg9.method3186(local9, arg6, local7, arg5, 1, arg2, arg7)) {
					Static15.anInt282 = local9;
					Static129.anInt2348 = local7;
					return true;
				}
			} else if (arg9.method3192(arg2, local9, 1, arg5, arg6, local7, arg7)) {
				Static129.anInt2348 = local7;
				Static15.anInt282 = local9;
				return true;
			}
			@Pc(250) int local250 = Static248.anIntArrayArray34[local91][local96] + 1;
			if (local91 > 0 && Static220.anIntArrayArray36[local91 - 1][local96] == 0 && (local59[local86 - 1][local75] & 0x42240000) == 0) {
				Static203.anIntArray227[local54] = local7 - 1;
				Static424.anIntArray459[local54] = local9;
				Static220.anIntArrayArray36[local91 - 1][local96] = 2;
				local54 = local54 + 1 & 0xFFF;
				Static248.anIntArrayArray34[local91 - 1][local96] = local250;
			}
			if (local91 < 127 && Static220.anIntArrayArray36[local91 + 1][local96] == 0 && (local59[local86 + 1][local75] & 0x60240000) == 0) {
				Static203.anIntArray227[local54] = local7 + 1;
				Static424.anIntArray459[local54] = local9;
				Static220.anIntArrayArray36[local91 + 1][local96] = 8;
				local54 = local54 + 1 & 0xFFF;
				Static248.anIntArrayArray34[local91 + 1][local96] = local250;
			}
			if (local96 > 0 && Static220.anIntArrayArray36[local91][local96 - 1] == 0 && (local59[local86][local75 - 1] & 0x40A40000) == 0) {
				Static203.anIntArray227[local54] = local7;
				Static424.anIntArray459[local54] = local9 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static220.anIntArrayArray36[local91][local96 - 1] = 1;
				Static248.anIntArrayArray34[local91][local96 - 1] = local250;
			}
			if (local96 < 127 && Static220.anIntArrayArray36[local91][local96 + 1] == 0 && (local59[local86][local75 + 1] & 0x48240000) == 0) {
				Static203.anIntArray227[local54] = local7;
				Static424.anIntArray459[local54] = local9 + 1;
				Static220.anIntArrayArray36[local91][local96 + 1] = 4;
				local54 = local54 + 1 & 0xFFF;
				Static248.anIntArrayArray34[local91][local96 + 1] = local250;
			}
			if (local91 > 0 && local96 > 0 && Static220.anIntArrayArray36[local91 - 1][local96 - 1] == 0 && (local59[local86 - 1][local75 - 1] & 0x43A40000) == 0 && (local59[local86 - 1][local75] & 0x42240000) == 0 && (local59[local86][local75 - 1] & 0x40A40000) == 0) {
				Static203.anIntArray227[local54] = local7 - 1;
				Static424.anIntArray459[local54] = local9 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static220.anIntArrayArray36[local91 - 1][local96 - 1] = 3;
				Static248.anIntArrayArray34[local91 - 1][local96 - 1] = local250;
			}
			if (local91 < 127 && local96 > 0 && Static220.anIntArrayArray36[local91 + 1][local96 - 1] == 0 && (local59[local86 + 1][local75 - 1] & 0x60E40000) == 0 && (local59[local86 + 1][local75] & 0x60240000) == 0 && (local59[local86][local75 - 1] & 0x40A40000) == 0) {
				Static203.anIntArray227[local54] = local7 + 1;
				Static424.anIntArray459[local54] = local9 - 1;
				Static220.anIntArrayArray36[local91 + 1][local96 - 1] = 9;
				local54 = local54 + 1 & 0xFFF;
				Static248.anIntArrayArray34[local91 + 1][local96 - 1] = local250;
			}
			if (local91 > 0 && local96 < 127 && Static220.anIntArrayArray36[local91 - 1][local96 + 1] == 0 && (local59[local86 - 1][local75 + 1] & 0x4E240000) == 0 && (local59[local86 - 1][local75] & 0x42240000) == 0 && (local59[local86][local75 + 1] & 0x48240000) == 0) {
				Static203.anIntArray227[local54] = local7 - 1;
				Static424.anIntArray459[local54] = local9 + 1;
				local54 = local54 + 1 & 0xFFF;
				Static220.anIntArrayArray36[local91 - 1][local96 + 1] = 6;
				Static248.anIntArrayArray34[local91 - 1][local96 + 1] = local250;
			}
			if (local91 < 127 && local96 < 127 && Static220.anIntArrayArray36[local91 + 1][local96 + 1] == 0 && (local59[local86 + 1][local75 + 1] & 0x78240000) == 0 && (local59[local86 + 1][local75] & 0x60240000) == 0 && (local59[local86][local75 + 1] & 0x48240000) == 0) {
				Static203.anIntArray227[local54] = local7 + 1;
				Static424.anIntArray459[local54] = local9 + 1;
				Static220.anIntArrayArray36[local91 + 1][local96 + 1] = 12;
				local54 = local54 + 1 & 0xFFF;
				Static248.anIntArrayArray34[local91 + 1][local96 + 1] = local250;
			}
		}
		Static129.anInt2348 = local7;
		Static15.anInt282 = local9;
		return false;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!ga;Lclient!ga;)V")
	public static void method201(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class82 arg1) {
		Static307.method4633(Static441.aClass163_186);
		Static243.aClass3_Sub25_Sub1_7.method4082(arg0.anInt2208);
		Static243.aClass3_Sub25_Sub1_7.method4077(arg1.anInt2209);
		Static243.aClass3_Sub25_Sub1_7.method4106(arg1.anInt2200);
		Static243.aClass3_Sub25_Sub1_7.method4123(arg0.anInt2209);
		Static243.aClass3_Sub25_Sub1_7.method4082(arg1.anInt2208);
		Static243.aClass3_Sub25_Sub1_7.method4106(arg0.anInt2200);
	}
}

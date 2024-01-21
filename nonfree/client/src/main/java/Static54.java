import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Lclient!pc;")
	public static Class67 aClass67_2;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	public static int anInt1298 = 0;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Lclient!tg;")
	private static Class81 aClass81_456 = Static120.method2057("Take");

	@OriginalMember(owner = "client!g", name = "c", descriptor = "Lclient!tg;")
	public static Class81 aClass81_454 = aClass81_456;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_455 = Static120.method2057("runes");

	@OriginalMember(owner = "client!g", name = "g", descriptor = "[Lclient!oa;")
	public static Class61[] aClass61Array1 = new Class61[6];

	@OriginalMember(owner = "client!g", name = "o", descriptor = "Lclient!tg;")
	private static Class81 aClass81_459 = Static120.method2057("Your profile will be transferred in:");

	@OriginalMember(owner = "client!g", name = "i", descriptor = "Lclient!tg;")
	public static Class81 aClass81_457 = aClass81_459;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!tg;")
	public static Class81 aClass81_458 = Static120.method2057("<col=00ff80>");

	@OriginalMember(owner = "client!g", name = "n", descriptor = "I")
	public static int anInt1304 = 99;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "[S")
	public static short[] aShortArray20 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!g", name = "t", descriptor = "[I")
	public static int[] anIntArray110 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void method963() {
		Static64.anIntArray130 = null;
		Static166.anIntArrayArrayArray8 = null;
		Static168.aByteArrayArrayArray9 = null;
		Static128.anIntArray303 = null;
		Static26.aByteArrayArrayArray1 = null;
		Static109.aByteArrayArrayArray7 = null;
		Static73.anIntArray154 = null;
		Static149.anIntArray353 = null;
		Static89.anIntArray425 = null;
		Static146.aByteArrayArrayArray8 = null;
		Static114.aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public static void method964() {
		for (@Pc(14) int local14 = 0; local14 < Static77.anInt1829; local14++) {
			@Pc(20) int local20 = Static90.anIntArray221[local14];
			@Pc(24) Class1_Sub2_Sub1_Sub3_Sub2 local24 = Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local20];
			@Pc(28) int local28 = Static21.aClass1_Sub8_Sub1_1.method336();
			if ((local28 & 0x10) != 0) {
				local24.aClass81_1088 = Static21.aClass1_Sub8_Sub1_1.method344();
				local24.anInt3035 = 100;
			}
			@Pc(54) int local54;
			@Pc(58) int local58;
			if ((local28 & 0x2) != 0) {
				local54 = Static21.aClass1_Sub8_Sub1_1.method353();
				local58 = Static21.aClass1_Sub8_Sub1_1.method353();
				local24.method2365(Static142.anInt3104, local54, local58);
				local24.anInt3043 = Static142.anInt3104 + 300;
				local24.anInt3014 = Static21.aClass1_Sub8_Sub1_1.method362();
			}
			if ((local28 & 0x40) != 0) {
				local24.anInt3052 = Static21.aClass1_Sub8_Sub1_1.method359();
				if (local24.anInt3052 == 65535) {
					local24.anInt3052 = -1;
				}
			}
			if ((local28 & 0x20) != 0) {
				local54 = Static21.aClass1_Sub8_Sub1_1.method326();
				local58 = Static21.aClass1_Sub8_Sub1_1.method362();
				local24.method2365(Static142.anInt3104, local54, local58);
			}
			if ((local28 & 0x4) != 0) {
				local24.anInt3018 = Static21.aClass1_Sub8_Sub1_1.method359();
				local24.anInt3053 = Static21.aClass1_Sub8_Sub1_1.method320();
			}
			if ((local28 & 0x80) != 0) {
				local24.anInt3028 = Static21.aClass1_Sub8_Sub1_1.method312();
				local54 = Static21.aClass1_Sub8_Sub1_1.method358();
				local24.anInt3044 = Static142.anInt3104 + (local54 & 0xFFFF);
				local24.anInt3042 = local54 >> 16;
				if (local24.anInt3028 == 65535) {
					local24.anInt3028 = -1;
				}
				local24.anInt3020 = 0;
				local24.anInt3058 = 0;
				if (local24.anInt3044 > Static142.anInt3104) {
					local24.anInt3058 = -1;
				}
			}
			if ((local28 & 0x1) != 0) {
				local54 = Static21.aClass1_Sub8_Sub1_1.method338();
				local58 = Static21.aClass1_Sub8_Sub1_1.method353();
				if (local54 == 65535) {
					local54 = -1;
				}
				if (local24.anInt3024 == local54 && local54 != -1) {
					@Pc(253) int local253 = Static73.method1277(local54).anInt3800;
					if (local253 == 1) {
						local24.anInt3060 = 0;
						local24.anInt3037 = local58;
						local24.anInt3008 = 0;
						local24.anInt3013 = 0;
					}
					if (local253 == 2) {
						local24.anInt3060 = 0;
					}
				} else if (local54 == -1 || local24.anInt3024 == -1 || Static73.method1277(local54).anInt3789 >= Static73.method1277(local24.anInt3024).anInt3789) {
					local24.anInt3060 = 0;
					local24.anInt3013 = 0;
					local24.anInt3008 = 0;
					local24.anInt3037 = local58;
					local24.anInt3045 = local24.anInt3011;
					local24.anInt3024 = local54;
				}
			}
			if ((local28 & 0x8) != 0) {
				local24.aClass1_Sub2_Sub5_1 = Static171.method3011(Static21.aClass1_Sub8_Sub1_1.method320());
				local24.anInt3055 = local24.aClass1_Sub2_Sub5_1.anInt1004;
				local24.anInt3017 = local24.aClass1_Sub2_Sub5_1.anInt1018;
				local24.anInt3034 = local24.aClass1_Sub2_Sub5_1.anInt1001;
				local24.anInt3009 = local24.aClass1_Sub2_Sub5_1.anInt1019;
				local24.anInt3041 = local24.aClass1_Sub2_Sub5_1.anInt1006;
				local24.anInt3033 = local24.aClass1_Sub2_Sub5_1.anInt996;
				local24.anInt3061 = local24.aClass1_Sub2_Sub5_1.anInt1008;
				local24.anInt3051 = local24.aClass1_Sub2_Sub5_1.anInt1010;
				local24.anInt3036 = local24.aClass1_Sub2_Sub5_1.anInt1021;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!tg;Lclient!vb;Lclient!tg;I)[Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4[] method965(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class81 arg2) {
		@Pc(12) int local12 = arg1.method2955(arg2);
		@Pc(18) int local18 = arg1.method2967(arg0, local12);
		return Static15.method231(local18, arg1, local12);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method966() {
		aClass81_458 = null;
		aClass81_459 = null;
		aClass61Array1 = null;
		aClass81_457 = null;
		aClass81_455 = null;
		aClass81_454 = null;
		aClass67_2 = null;
		aFont1 = null;
		aClass81_456 = null;
		anIntArray110 = null;
		aShortArray20 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
	public static void method967(@OriginalArg(0) int arg0) {
		if (Static89.anInt4032 == 0) {
			Static115.aClass1_Sub10_Sub3_2.method1309(arg0);
		} else {
			Static153.anInt3499 = arg0;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!vb;IIBLclient!vb;)Lclient!na;")
	public static Class1_Sub2_Sub2_Sub2_Sub1 method968(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class82 arg3) {
		return Static83.method1391(arg3, arg1, arg2) ? Static95.method1592(arg0.method2942(arg1, arg2)) : null;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Lclient!mh;")
	public static Class1_Sub2_Sub12 method969(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub2_Sub12 local6 = (Class1_Sub2_Sub12) Static96.aClass59_17.method1970((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static110.aClass82_41.method2942(arg0, 10);
		local6 = new Class1_Sub2_Sub12();
		local6.anInt2398 = arg0;
		if (local20 != null) {
			local6.method1806(new Class1_Sub8(local20));
		}
		local6.method1804();
		if (local6.anInt2399 != -1) {
			local6.method1797(method969(local6.anInt2399), method969(local6.anInt2388));
		}
		if (!Static6.aBoolean3 && local6.aBoolean103) {
			local6.aClass81_843 = Static132.aClass81_1030;
			local6.aClass81Array9 = null;
			local6.anInt2417 = 0;
			local6.aClass81Array10 = null;
			local6.aBoolean101 = false;
		}
		Static96.aClass59_17.method1973(local6, (long) arg0);
		return local6;
	}
}

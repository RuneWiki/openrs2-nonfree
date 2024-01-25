import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "Lclient!al;")
	public static Class17 aClass17_8;

	@OriginalMember(owner = "client!sv", name = "F", descriptor = "Lclient!ha;")
	public static Class95 aClass95_13;

	@OriginalMember(owner = "client!sv", name = "L", descriptor = "I")
	public static int anInt9141;

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
	public static int anInt9132 = 0;

	@OriginalMember(owner = "client!sv", name = "z", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_59 = new Class295(10);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method7435(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class3_Sub37 local12 = Static90.method1509(Static299.aClass240_51, Static226.aClass144_2);
		local12.aClass3_Sub4_Sub1_2.method7948(Static345.method5022(arg0) + 1);
		local12.aClass3_Sub4_Sub1_2.method7948(arg1);
		local12.aClass3_Sub4_Sub1_2.method7901(arg0);
		Static301.method2678(local12);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)V")
	public static void method7440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22;
		if (arg0 != Static91.anInt1849) {
			Static13.anIntArray11 = new int[arg0];
			for (local22 = 0; local22 < arg0; local22++) {
				Static13.anIntArray11[local22] = (local22 << 12) / arg0;
			}
			Static91.anInt1849 = arg0;
			Static348.anInt5973 = arg0 - 1;
			Static315.anInt5269 = arg0 * 32;
		}
		if (Static589.anInt9553 == arg1) {
			return;
		}
		if (Static91.anInt1849 == arg1) {
			Static510.anIntArray172 = Static13.anIntArray11;
		} else {
			Static510.anIntArray172 = new int[arg1];
			for (local22 = 0; local22 < arg1; local22++) {
				Static510.anIntArray172[local22] = (local22 << 12) / arg1;
			}
		}
		Static635.anInt10496 = arg1 - 1;
		Static589.anInt9553 = arg1;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZIILjava/lang/String;Ljava/lang/String;)V")
	public static void method7442(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		@Pc(6) Class3_Sub37 local6 = Static272.method4014();
		local6.aClass3_Sub4_Sub1_2.method7948(Static675.aClass179_7.anInt4730);
		local6.aClass3_Sub4_Sub1_2.method7956(0);
		@Pc(23) int local23 = local6.aClass3_Sub4_Sub1_2.anInt9739;
		local6.aClass3_Sub4_Sub1_2.method7956(645);
		@Pc(32) int[] local32 = Static405.method5596(local6);
		@Pc(36) int local36 = local6.aClass3_Sub4_Sub1_2.anInt9739;
		local6.aClass3_Sub4_Sub1_2.method7901(arg2);
		local6.aClass3_Sub4_Sub1_2.method7956(Static224.anInt3866);
		local6.aClass3_Sub4_Sub1_2.method7901(arg3);
		local6.aClass3_Sub4_Sub1_2.method7893(Static566.aLong254);
		local6.aClass3_Sub4_Sub1_2.method7948(Static654.anInt10668);
		local6.aClass3_Sub4_Sub1_2.method7948(Static227.aClass203_4.anInt5389);
		Static165.method2614(local6.aClass3_Sub4_Sub1_2);
		@Pc(82) String local82 = Static502.aString96;
		local6.aClass3_Sub4_Sub1_2.method7948(local82 == null ? 0 : 1);
		if (local82 != null) {
			local6.aClass3_Sub4_Sub1_2.method7901(local82);
		}
		local6.aClass3_Sub4_Sub1_2.method7948(arg1);
		local6.aClass3_Sub4_Sub1_2.method7948(arg0 ? 1 : 0);
		local6.aClass3_Sub4_Sub1_2.anInt9739 += 7;
		local6.aClass3_Sub4_Sub1_2.method7940(local6.aClass3_Sub4_Sub1_2.anInt9739, local32, local36);
		local6.aClass3_Sub4_Sub1_2.method7923(local6.aClass3_Sub4_Sub1_2.anInt9739 - local23);
		Static301.method2678(local6);
		Static492.anInt838 = 0;
		Static288.anInt4858 = 0;
		Static613.anInt10200 = 1;
		Static290.anInt4896 = -3;
		if (arg1 < 13) {
			Static281.aBoolean315 = true;
			Static34.method719();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZ)V")
	public static void method7444(@OriginalArg(0) int arg0) {
		if (Static634.anInt6735 == 0) {
			Static574.aClass3_Sub12_Sub3_3.method7553(arg0);
		} else {
			Static531.anInt8329 = arg0;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!dt;I)Lclient!bd;")
	public static Class21_Sub1 method7445(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(7) Class21 local7 = Static471.method6272(arg0);
		@Pc(11) int local11 = arg0.method7951();
		@Pc(15) int local15 = arg0.method7951();
		@Pc(19) int local19 = arg0.method7951();
		@Pc(23) int local23 = arg0.method7951();
		@Pc(27) int local27 = arg0.method7951();
		@Pc(38) int local38 = arg0.method7951();
		return new Class21_Sub1(local7.aClass266_12, local7.aClass131_23, local7.anInt9576, local7.anInt9573, local7.anInt9572, local7.anInt9574, local7.anInt9575, local7.anInt9570, local7.anInt9571, local11, local15, local19, local23, local27, local38);
	}
}

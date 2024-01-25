import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "Lclient!pu;")
	public static Class297 aClass297_1;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	public static int anInt7942;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLclient!hla;)I")
	public static int method6809(@OriginalArg(1) Class3_Sub7_Sub10 arg0) {
		@Pc(7) String local7 = Static489.method9236(arg0);
		@Pc(9) int[] local9 = null;
		if (Static594.method6761(arg0.anInt3913)) {
			local9 = Static606.aClass62_2.method1887((int) arg0.aLong145).lb;
		} else if (arg0.anInt3912 != -1) {
			local9 = Static606.aClass62_2.method1887(arg0.anInt3912).lb;
		} else if (Static496.method6774(arg0.anInt3913)) {
			@Pc(81) Class3_Sub52 local81 = (Class3_Sub52) Static94.aClass313_8.method7104((long) (int) arg0.aLong145);
			if (local81 != null) {
				@Pc(86) Class9_Sub1_Sub1_Sub2_Sub2 local86 = local81.aClass9_Sub1_Sub1_Sub2_Sub2_2;
				@Pc(89) Class219 local89 = local86.aClass219_1;
				if (local89.anIntArray405 != null) {
					local89 = local89.method5035(Static380.aClass127_1);
				}
				if (local89 != null) {
					local9 = local89.anIntArray407;
				}
			}
		} else if (Static485.method6599(arg0.anInt3913)) {
			@Pc(58) Class247 local58 = Static216.aClass53_3.method1523((int) (arg0.aLong145 >>> 32 & 0x7FFFFFFFL));
			if (local58.anIntArray477 != null) {
				local58 = local58.method5442(Static380.aClass127_1);
			}
			if (local58 != null) {
				local9 = local58.anIntArray480;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static343.method4887(local9);
		}
		@Pc(121) int local121 = Static677.aClass169_12.method3646(Static413.aClass178Array13, local7);
		if (arg0.aBoolean244) {
			local121 += Static693.aClass178_30.method7636() + 4;
		}
		return local121;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!ca;")
	public static Class50 method6810(@OriginalArg(1) Component arg0) {
		return new Class50_Sub1(arg0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6811(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(13) String local13 = Static69.method1531(arg0);
		if (local13 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static453.anInt6954; local19++) {
			@Pc(25) String local25 = Static501.aStringArray34[local19];
			@Pc(29) String local29 = Static69.method1531(local25);
			if (Static475.method6473(local29, local25, local13, arg0)) {
				Static453.anInt6954--;
				for (@Pc(42) int local42 = local19; local42 < Static453.anInt6954; local42++) {
					Static501.aStringArray34[local42] = Static501.aStringArray34[local42 + 1];
					Static646.aStringArray43[local42] = Static646.aStringArray43[local42 + 1];
					Static166.aStringArray15[local42] = Static166.aStringArray15[local42 + 1];
					Static557.aStringArray38[local42] = Static557.aStringArray38[local42 + 1];
					Static113.aBooleanArray1[local42] = Static113.aBooleanArray1[local42 + 1];
				}
				Static507.anInt8071 = Static475.anInt7494;
				@Pc(99) Class292 local99 = Static631.method8307();
				@Pc(105) Class3_Sub29 local105 = Static507.method6901(Static294.aClass144_45, local99.aClass88_2);
				local105.aClass3_Sub2_Sub1_1.method2065(Static63.method1479(arg0));
				local105.aClass3_Sub2_Sub1_1.method2073(arg0);
				local99.method6855(local105);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!kt;ILclient!kt;IIIBII)V")
	public static void method6813(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub1_Sub1_Sub2 arg3, @OriginalArg(4) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg1.method7475();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class178 local21 = (Class178) Static157.aClass307_33.method7002((long) local7);
		if (local21 == null) {
			@Pc(28) Class361[] local28 = Static735.method8277(Static218.aClass182_59, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static153.aClass22_4.method9363(local28[0], true);
			Static157.aClass307_33.method7000(local21, (long) local7);
		}
		Static376.method5111(0, arg3.method7485() * 256, arg3.anInt10694, arg3.aByte139, arg3.anInt10695);
		@Pc(69) int local69 = arg0 + Static143.anIntArray165[0] - 18;
		@Pc(79) int local79 = Static143.anIntArray165[1] + arg4 - 16 - 54;
		@Pc(87) int local87 = local69 + arg6 / 4 * 18;
		@Pc(95) int local95 = local79 + arg6 % 4 * 18;
		local21.method7637(local87, local95);
		if (arg1 == arg3) {
			Static153.aClass22_4.method9399(18, 18, -256, local87 - 1, local95 + -1);
		}
		Static218.method3251(local95 + 18, local87 + -1, local87 + 18, local95 + -1);
		@Pc(133) Class9_Sub10 local133 = Static238.method3424();
		local133.anInt10812 = local87;
		local133.anInt10814 = local87 + 16;
		local133.anInt10819 = local95 + 16;
		local133.anInt10813 = local95;
		local133.aClass9_Sub1_Sub1_Sub2_1 = arg1;
		Static295.aClass319_5.method7196(local133);
	}
}

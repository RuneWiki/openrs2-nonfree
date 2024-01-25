import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "Lclient!gga;")
	public static Class124 aClass124_77;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "Lclient!in;")
	public static final Class169 aClass169_171 = new Class169(94, 0);

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_69 = new Class341(45, 15);

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "Z")
	public static boolean aBoolean519 = false;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method6102(@OriginalArg(1) Class101 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static450.aBoolean606) {
			local7 = Static106.method1934();
			local9 = Static207.method3926();
		}
		@Pc(21) int local21 = local7 + Static537.anInt9380;
		@Pc(25) int local25 = local9 + Static297.anInt5412;
		@Pc(35) int local35 = Static22.anInt384;
		@Pc(39) int local39 = Static304.anInt10368 - 3;
		Static61.method1152(Static304.anInt10368, arg0, Static22.anInt384, local7 + Static537.anInt9380, Static205.aClass134_24.method3906(Static204.anInt8130), local9 + Static297.anInt5412);
		@Pc(63) int local63 = local7 + Static7.aClass6_1.method7048();
		@Pc(69) int local69 = local9 + Static7.aClass6_1.method7049();
		@Pc(73) int local73;
		@Pc(78) Class2_Sub1_Sub13 local78;
		@Pc(95) int local95;
		@Pc(277) int local277;
		@Pc(169) Class2_Sub1_Sub19 local169;
		@Pc(265) Class2_Sub1_Sub13 local265;
		if (Static672.aBoolean808) {
			local73 = 0;
			for (local169 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7293(); local169 != null; local169 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7298()) {
				local95 = local73 * 16 + local25 + 13 + 20;
				if (local7 + Static537.anInt9380 < local63 && Static22.anInt384 + local7 + Static537.anInt9380 > local63 && local69 > local95 - 13 && local95 + 4 > local69 && (local169.anInt9806 > 1 || ((Class2_Sub1_Sub13) local169.aClass279_13.aClass2_Sub1_54.aClass2_Sub1_67).aBoolean522)) {
					arg0.aa(local7 + Static537.anInt9380, local95 + -12, Static22.anInt384, 16, 255 - Static22.anInt392 << 24 | Static193.anInt4102, 1);
				}
				local73++;
			}
			if (Static214.aClass2_Sub1_Sub19_1 != null) {
				Static61.method1152(Static31.anInt534, arg0, Static100.anInt1550, Static429.anInt7876, Static214.aClass2_Sub1_Sub19_1.aString113, Static659.anInt11274);
				local73 = 0;
				for (local265 = (Class2_Sub1_Sub13) Static214.aClass2_Sub1_Sub19_1.aClass279_13.method7293(); local265 != null; local265 = (Class2_Sub1_Sub13) Static214.aClass2_Sub1_Sub19_1.aClass279_13.method7298()) {
					local277 = Static659.anInt11274 + local73 * 16 + 13 + 20;
					local73++;
					if (Static429.anInt7876 < local63 && Static100.anInt1550 + Static429.anInt7876 > local63 && local69 > local277 - 13 && local277 + 4 > local69 && local265.aBoolean522) {
						arg0.aa(Static429.anInt7876, local277 - 12, Static100.anInt1550, 16, 255 - Static22.anInt392 << 24 | Static193.anInt4102, 1);
					}
				}
				Static178.method3494(Static100.anInt1550, arg0, Static31.anInt534, Static659.anInt11274, Static429.anInt7876);
			}
		} else {
			local73 = 0;
			for (local78 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7177(); local78 != null; local78 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7175()) {
				local95 = (Static276.anInt5124 - local73 - 1) * 16 + local25 + 13 + 20;
				local73++;
				if (local63 > Static537.anInt9380 + local7 && Static22.anInt384 + local7 + Static537.anInt9380 > local63 && local69 > local95 - 13 && local69 < local95 + 4 && local78.aBoolean522) {
					arg0.aa(local7 + Static537.anInt9380, local95 + -12, Static22.anInt384, 16, Static193.anInt4102 | 255 - Static22.anInt392 << 24, 1);
				}
			}
		}
		Static178.method3494(Static22.anInt384, arg0, Static304.anInt10368, local9 + Static297.anInt5412, Static537.anInt9380 + local7);
		if (Static672.aBoolean808) {
			local73 = 0;
			for (local169 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7293(); local169 != null; local169 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7298()) {
				local95 = Static297.anInt5412 + local9 + local73 * 16 + 20 + 13;
				local73++;
				if (local169.anInt9806 == 1) {
					Static429.method7035(Static430.anInt7884 | 0xFF000000, (Class2_Sub1_Sub13) local169.aClass279_13.aClass2_Sub1_54.aClass2_Sub1_67, local69, local63, local95, Static63.anInt1213 | 0xFF000000, Static22.anInt384, local7 + Static537.anInt9380, local9 + Static297.anInt5412, arg0, Static304.anInt10368);
				} else {
					Static89.method1568(arg0, local69, local95, local63, Static430.anInt7884 | 0xFF000000, local169, Static537.anInt9380 + local7, local9 + Static297.anInt5412, Static22.anInt384, Static304.anInt10368, Static63.anInt1213 | 0xFF000000);
				}
			}
			if (Static214.aClass2_Sub1_Sub19_1 != null) {
				local73 = 0;
				for (local265 = (Class2_Sub1_Sub13) Static214.aClass2_Sub1_Sub19_1.aClass279_13.method7293(); local265 != null; local265 = (Class2_Sub1_Sub13) Static214.aClass2_Sub1_Sub19_1.aClass279_13.method7298()) {
					local277 = local73 * 16 + Static659.anInt11274 + 20 + 13;
					Static429.method7035(Static430.anInt7884 | 0xFF000000, local265, local69, local63, local277, Static63.anInt1213 | 0xFF000000, Static100.anInt1550, Static429.anInt7876, Static659.anInt11274, arg0, Static31.anInt534);
					local73++;
				}
				Static421.method6914(Static429.anInt7876, Static31.anInt534, Static659.anInt11274, Static100.anInt1550);
			}
		} else {
			local73 = 0;
			for (local78 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7177(); local78 != null; local78 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7175()) {
				local95 = (Static276.anInt5124 - local73 - 1) * 16 + local25 + 20 + 13;
				Static429.method7035(Static430.anInt7884 | 0xFF000000, local78, local69, local63, local95, Static63.anInt1213 | 0xFF000000, local35, local21, local25, arg0, local39);
				local73++;
			}
		}
		Static421.method6914(local7 + Static537.anInt9380, Static304.anInt10368, local9 + Static297.anInt5412, Static22.anInt384);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!bu;")
	public static Class54 aClass54_5;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "Lclient!vaa;")
	public static final Class361 aClass361_6 = new Class361(4, 1);

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	public static int anInt1144 = -1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Z")
	public static boolean method1124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
	public static void method1135() {
		@Pc(20) Class5_Sub44 local20;
		for (local20 = (Class5_Sub44) Static298.aClass102_38.method1916(); local20 != null; local20 = (Class5_Sub44) Static298.aClass102_38.method1915()) {
			if (local20.aBoolean609) {
				local20.method9327(1);
			} else {
				local20.aBoolean608 = true;
				if (local20.anInt8141 >= 0 && local20.anInt8152 >= 0 && Static544.anInt9261 > local20.anInt8141 && Static282.anInt4887 > local20.anInt8152) {
					Static570.method8203(local20);
				}
			}
		}
		for (local20 = (Class5_Sub44) Static605.aClass102_70.method1916(); local20 != null; local20 = (Class5_Sub44) Static605.aClass102_70.method1915()) {
			if (local20.aBoolean609) {
				local20.method9327(1);
			} else {
				local20.aBoolean608 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)V")
	public static void method1140(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static554.anInt9335 = arg0;
		Static387.aClass8_Sub5Array1 = new Class8_Sub5[Static506.anIntArray617[Static554.anInt9335] + 1];
		Static474.anInt8030 = 0;
		Static544.anInt9264 = 0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method1141(@OriginalArg(1) Class57 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static40.aBoolean61) {
			local7 = Static169.method2467();
			local9 = Static375.method5510();
		}
		@Pc(21) int local21 = local7 + Static327.anInt5831;
		@Pc(25) int local25 = Static507.anInt8693 + local9;
		@Pc(27) int local27 = Static498.anInt8306;
		@Pc(31) int local31 = Static42.anInt1723 - 3;
		Static449.method6674(Static42.anInt1723, local9 + Static507.anInt8693, Static498.anInt8306, arg0, Static582.aClass335_25.method8349(Static323.anInt5795), Static327.anInt5831 + local7);
		@Pc(63) int local63 = Static205.aClass107_1.method4079() + local7;
		@Pc(70) int local70 = Static205.aClass107_1.method4072() + local9;
		@Pc(74) int local74;
		@Pc(79) Class5_Sub5_Sub18 local79;
		@Pc(92) int local92;
		@Pc(207) int local207;
		@Pc(288) Class5_Sub5_Sub19 local288;
		@Pc(192) Class5_Sub5_Sub19 local192;
		if (Static320.aBoolean437) {
			local74 = 0;
			for (local79 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2890(); local79 != null; local79 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2894()) {
				local92 = local74 * 16 + local25 + 13 + 20;
				if (local63 > local7 + Static327.anInt5831 && local63 < Static498.anInt8306 + local7 + Static327.anInt5831 && local92 - 13 < local70 && local70 < local92 + 4 && (local79.anInt7610 > 1 || ((Class5_Sub5_Sub19) local79.aClass149_8.aClass5_Sub5_24.aClass5_Sub5_66).aBoolean707)) {
					arg0.aa(local7 + Static327.anInt5831, local92 + -12, Static498.anInt8306, 16, 255 - Static97.anInt1570 << 24 | Static234.anInt3917, 1);
				}
				local74++;
			}
			if (Static604.aClass5_Sub5_Sub18_1 != null) {
				Static449.method6674(Static101.anInt1607, Static422.anInt7304, Static493.anInt8236, arg0, Static604.aClass5_Sub5_Sub18_1.aString102, Static652.anInt10541);
				local74 = 0;
				for (local192 = (Class5_Sub5_Sub19) Static604.aClass5_Sub5_Sub18_1.aClass149_8.method2890(); local192 != null; local192 = (Class5_Sub5_Sub19) Static604.aClass5_Sub5_Sub18_1.aClass149_8.method2894()) {
					local207 = Static422.anInt7304 + local74 * 16 + 33;
					if (Static652.anInt10541 < local63 && local63 < Static652.anInt10541 + Static493.anInt8236 && local207 - 13 < local70 && local70 < local207 + 4 && local192.aBoolean707) {
						arg0.aa(Static652.anInt10541, local207 - 12, Static493.anInt8236, 16, 255 - Static97.anInt1570 << 24 | Static234.anInt3917, 1);
					}
					local74++;
				}
				Static489.method7069(Static101.anInt1607, arg0, Static652.anInt10541, Static422.anInt7304, Static493.anInt8236);
			}
		} else {
			local74 = 0;
			for (local288 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1916(); local288 != null; local288 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1915()) {
				local92 = local25 + (Static481.anInt8130 + -1 + -local74) * 16 + 13 + 20;
				if (local63 > local7 + Static327.anInt5831 && local7 + Static327.anInt5831 + Static498.anInt8306 > local63 && local92 - 13 < local70 && local70 < local92 + 4 && local288.aBoolean707) {
					arg0.aa(local7 + Static327.anInt5831, local92 + -12, Static498.anInt8306, 16, Static234.anInt3917 | 255 - Static97.anInt1570 << 24, 1);
				}
				local74++;
			}
		}
		Static489.method7069(Static42.anInt1723, arg0, local7 + Static327.anInt5831, Static507.anInt8693 - -local9, Static498.anInt8306);
		if (Static320.aBoolean437) {
			local74 = 0;
			for (local79 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2890(); local79 != null; local79 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2894()) {
				local92 = local74 * 16 + local9 + Static507.anInt8693 + 13 + 20;
				local74++;
				if (local79.anInt7610 == 1) {
					Static476.method6935(Static42.anInt1723, local7 + Static327.anInt5831, Static498.anInt8306, Static575.anInt9643 | 0xFF000000, local70, Static675.anInt10800 | 0xFF000000, local63, (Class5_Sub5_Sub19) local79.aClass149_8.aClass5_Sub5_24.aClass5_Sub5_66, local92, arg0, Static507.anInt8693 + local9);
				} else {
					Static394.method5768(Static42.anInt1723, local92, Static507.anInt8693 + local9, Static675.anInt10800 | 0xFF000000, local63, local70, local79, local7 + Static327.anInt5831, arg0, Static498.anInt8306, Static575.anInt9643 | 0xFF000000);
				}
			}
			if (Static604.aClass5_Sub5_Sub18_1 != null) {
				local74 = 0;
				for (local192 = (Class5_Sub5_Sub19) Static604.aClass5_Sub5_Sub18_1.aClass149_8.method2890(); local192 != null; local192 = (Class5_Sub5_Sub19) Static604.aClass5_Sub5_Sub18_1.aClass149_8.method2894()) {
					local207 = local74 * 16 + Static422.anInt7304 + 13 + 20;
					local74++;
					Static476.method6935(Static101.anInt1607, Static652.anInt10541, Static493.anInt8236, Static575.anInt9643 | 0xFF000000, local70, Static675.anInt10800 | 0xFF000000, local63, local192, local207, arg0, Static422.anInt7304);
				}
				Static61.method869(Static493.anInt8236, Static422.anInt7304, Static101.anInt1607, Static652.anInt10541);
			}
		} else {
			local74 = 0;
			for (local288 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1916(); local288 != null; local288 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1915()) {
				local92 = (Static481.anInt8130 - local74 - 1) * 16 + local25 + 20 + 13;
				Static476.method6935(local31, local21, local27, Static575.anInt9643 | 0xFF000000, local70, Static675.anInt10800 | 0xFF000000, local63, local288, local92, arg0, local25);
				local74++;
			}
		}
		Static61.method869(Static498.anInt8306, local9 + Static507.anInt8693, Static42.anInt1723, Static327.anInt5831 + local7);
	}
}

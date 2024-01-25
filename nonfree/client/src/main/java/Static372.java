import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
	public static int anInt6337;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
	public static int anInt6335 = -1;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
	public static void method5514() {
		Static138.method2656(Static265.aClass203_82);
		Static182.anInt3561++;
		if (Static178.aBoolean637 && Static297.aBoolean432) {
			@Pc(33) int local33 = Static563.aClass156_1.method5689();
			@Pc(37) int local37 = Static563.aClass156_1.method5690();
			local37 -= Static550.anInt7641;
			local33 -= Static419.anInt8466;
			if (Static383.anInt6588 > local33) {
				local33 = Static383.anInt6588;
			}
			if (local37 < Static11.anInt125) {
				local37 = Static11.anInt125;
			}
			if (Static265.aClass203_82.anInt5513 + local33 > Static215.aClass203_73.anInt5513 + Static383.anInt6588) {
				local33 = Static215.aClass203_73.anInt5513 + Static383.anInt6588 - Static265.aClass203_82.anInt5513;
			}
			if (Static215.aClass203_73.anInt5476 + Static11.anInt125 < local37 + Static265.aClass203_82.anInt5476) {
				local37 = Static215.aClass203_73.anInt5476 + Static11.anInt125 - Static265.aClass203_82.anInt5476;
			}
			@Pc(106) int local106 = Static215.aClass203_73.anInt5466 + local33 - Static383.anInt6588;
			@Pc(114) int local114 = Static215.aClass203_73.anInt5512 + local37 - Static11.anInt125;
			@Pc(167) Class3_Sub45 local167;
			if (Static563.aClass156_1.method5684()) {
				if (Static265.aClass203_82.anInt5445 < Static182.anInt3561) {
					@Pc(210) int local210 = local33 - Static271.anInt5048;
					@Pc(215) int local215 = local37 - Static577.anInt3692;
					if (Static265.aClass203_82.anInt5452 < local210 || -Static265.aClass203_82.anInt5452 > local210 || Static265.aClass203_82.anInt5452 < local215 || -Static265.aClass203_82.anInt5452 > local215) {
						Static16.aBoolean22 = true;
					}
				}
				if (Static265.aClass203_82.anObjectArray20 != null && Static16.aBoolean22) {
					local167 = new Class3_Sub45();
					local167.aClass203_136 = Static265.aClass203_82;
					local167.anInt8341 = local106;
					local167.anObjectArray33 = Static265.aClass203_82.anObjectArray20;
					local167.anInt8336 = local114;
					Static149.method2778(local167);
				}
			} else {
				if (Static16.aBoolean22) {
					Static103.method2177();
					if (Static265.aClass203_82.anObjectArray8 != null) {
						local167 = new Class3_Sub45();
						local167.aClass203_137 = Static184.aClass203_63;
						local167.anObjectArray33 = Static265.aClass203_82.anObjectArray8;
						local167.anInt8336 = local114;
						local167.anInt8341 = local106;
						local167.aClass203_136 = Static265.aClass203_82;
						Static149.method2778(local167);
					}
					if (Static184.aClass203_63 != null && Static69.method1649(Static265.aClass203_82) != null) {
						Static170.method2969(Static184.aClass203_63, Static265.aClass203_82);
					}
				} else if ((Static451.anInt7402 == 1 || Static325.method5045()) && Static151.anInt3123 > 2) {
					Static451.method6277(Static419.anInt8466 + Static271.anInt5048, Static577.anInt3692 + Static550.anInt7641);
				} else if (Static15.method248()) {
					Static451.method6277(Static271.anInt5048 + Static419.anInt8466, Static550.anInt7641 + Static577.anInt3692);
				}
				Static265.aClass203_82 = null;
			}
		} else if (Static182.anInt3561 > 1) {
			Static265.aClass203_82 = null;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!gfa;[Lclient!ff;)V")
	public static void method5515(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class3_Sub22[] arg1) {
		@Pc(6) int local6;
		if (Static21.aBoolean44) {
			local6 = arg0.method7468(arg1);
			Static482.aClass43_12.method7149(local6, arg1);
		}
		if (Static168.aClass139Array22 == Static29.aClass139Array6) {
			@Pc(28) int local28;
			if (arg0 instanceof Class9_Sub1_Sub1) {
				local6 = ((Class9_Sub1_Sub1) arg0).aShort112;
				local28 = ((Class9_Sub1_Sub1) arg0).aShort115;
			} else {
				local6 = arg0.anInt8975 >> Static458.anInt7508;
				local28 = arg0.anInt8980 >> Static458.anInt7508;
			}
			Static482.aClass43_12.YA(Static374.aClass139Array17[0].method6890(arg0.anInt8975, arg0.anInt8980), Static280.method4440(local6, local28), Static474.method6508(local6, local28), Static227.method3892(local6, local28));
		}
		@Pc(64) Class9_Sub2 local64 = arg0.method7480(Static482.aClass43_12);
		if (local64 == null) {
			return;
		}
		local64.aClass9_Sub1_1 = arg0;
		if (Static495.aBoolean622) {
			@Pc(73) Class309 local73 = Static120.aClass309_5;
			synchronized (Static120.aClass309_5) {
				@Pc(77) boolean local77 = false;
				for (@Pc(82) Class9_Sub2 local82 = (Class9_Sub2) Static120.aClass309_5.method6590(); local82 != null; local82 = (Class9_Sub2) Static120.aClass309_5.method6594()) {
					if (arg0.anInt8976 >= local82.aClass9_Sub1_1.anInt8976) {
						Static421.method6018(local64, local82);
						local77 = true;
						break;
					}
				}
				if (!local77) {
					Static120.aClass309_5.method6595(local64);
				}
				return;
			}
		}
		@Pc(117) boolean local117 = false;
		for (@Pc(122) Class9_Sub2 local122 = (Class9_Sub2) Static120.aClass309_5.method6590(); local122 != null; local122 = (Class9_Sub2) Static120.aClass309_5.method6594()) {
			if (arg0.anInt8976 >= local122.aClass9_Sub1_1.anInt8976) {
				Static421.method6018(local64, local122);
				local117 = true;
				break;
			}
		}
		if (!local117) {
			Static120.aClass309_5.method6595(local64);
		}
	}
}

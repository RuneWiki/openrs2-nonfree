import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "[[Lclient!cn;")
	public static Class73[][] aClass73ArrayArray1;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "Lclient!dea;")
	public static final Class85 aClass85_1 = new Class85();

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
	public static void method2571() {
		if (Static297.aClass146Array1 == null) {
			Static297.aClass146Array1 = Static198.method2858();
			Static279.aClass146_22 = Static297.aClass146Array1[0];
			Static240.aLong121 = Static515.method7499(79);
		}
		if (Static410.aClass194_1 == null) {
			Static454.method6682();
		}
		@Pc(27) Class146 local27 = Static279.aClass146_22;
		@Pc(37) int local37 = Static571.method8207();
		if (local27 == Static279.aClass146_22) {
			Static431.aString97 = Static279.aClass146_22.aClass335_1.method8349(Static323.anInt5795);
			if (Static279.aClass146_22.aBoolean262) {
				Static165.anInt2580 = local37 * (Static279.aClass146_22.anInt3222 - Static279.aClass146_22.anInt3227) / 100 + Static279.aClass146_22.anInt3227;
			}
			if (Static279.aClass146_22.aBoolean263) {
				Static431.aString97 = Static431.aString97 + Static165.anInt2580 + "%";
			}
		} else if (Static279.aClass146_22 == Static198.aClass146_21) {
			Static410.aClass194_1 = null;
			Static21.method316(3);
		} else {
			Static431.aString97 = local27.aClass335_2.method8349(Static323.anInt5795);
			Static165.anInt2580 = local27.anInt3222;
			if (Static279.aClass146_22.aBoolean263) {
				Static431.aString97 = Static431.aString97 + local27.anInt3222 + "%";
			}
			if (Static279.aClass146_22.aBoolean262 || local27.aBoolean262) {
				Static240.aLong121 = Static515.method7499(117);
			}
		}
		if (Static410.aClass194_1 == null) {
			return;
		}
		Static410.aClass194_1.method4396(Static240.aLong121, Static279.aClass146_22, Static165.anInt2580, Static431.aString97);
		if (Static109.anInterface14Array1 == null) {
			return;
		}
		for (@Pc(157) int local157 = Static669.anInt10712 + 1; local157 < Static109.anInterface14Array1.length; local157++) {
			if (Static109.anInterface14Array1[local157].method7949() >= 100 && Static669.anInt10712 == local157 - 1 && Static107.anInt1746 >= 1 && Static410.aClass194_1.method4391()) {
				try {
					Static109.anInterface14Array1[local157].method7948();
				} catch (@Pc(199) Exception local199) {
					Static109.anInterface14Array1 = null;
					return;
				}
				Static410.aClass194_1.method4385(Static109.anInterface14Array1[local157]);
				Static669.anInt10712++;
				if (Static669.anInt10712 >= Static109.anInterface14Array1.length - 1 && Static109.anInterface14Array1.length > 1) {
					Static669.anInt10712 = Static217.aClass229_1.method5341() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
	public static void method2572() {
		Static60.aClass57_1.method7659(Static484.aFloat142, Static677.aFloat208, Static521.aFloat163);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2573(@OriginalArg(0) Class57 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static40.aBoolean61) {
			local7 = Static169.method2467();
			local9 = Static375.method5510();
		}
		arg0.KA(local7, local9, local7 + Static70.anInt1125, 350 - -local9);
		arg0.aa(local7, local9, Static70.anInt1125, 350, Static258.anInt4452 << 24 | 0x332277, 1);
		Static82.method9318(local9 + 350, local9, local7 + Static70.anInt1125, local7);
		@Pc(55) int local55 = 350 / Static78.anInt9557;
		@Pc(64) int local64;
		if (Static503.anInt8655 > 0) {
			local64 = 346 - Static78.anInt9557 - 4;
			@Pc(75) int local75 = local55 * local64 / (local55 + Static503.anInt8655 - 1);
			@Pc(77) int local77 = 4;
			if (Static503.anInt8655 > 1) {
				local77 = (local64 - local75) * (-Static154.anInt2438 + Static503.anInt8655 - 1) / (Static503.anInt8655 - 1) + 4;
			}
			arg0.aa(Static70.anInt1125 + local7 - 16, local77 + local9, 12, local75, Static258.anInt4452 << 24 | 0x332277, 2);
			for (@Pc(120) int local120 = Static154.anInt2438; local120 < Static154.anInt2438 + local55 && local120 < Static503.anInt8655; local120++) {
				@Pc(129) String[] local129 = Static439.method6502(Static117.aStringArray15[local120], '\b');
				@Pc(138) int local138 = (Static70.anInt1125 - 8 - 16) / local129.length;
				for (@Pc(140) int local140 = 0; local140 < local129.length; local140++) {
					@Pc(148) int local148 = local140 * local138 + 8;
					arg0.KA(local7 + local148, local9, local138 + local148 + local7 - 8, local9 + 350);
					Static582.aClass80_12.method8780(-16777216, Static533.method7890(local129[local140]), local9 + 350 - Static570.aClass224_11.anInt6133 - Static81.anInt1318 - Static78.anInt9557 * (-Static154.anInt2438 + local120) - 2, -1, local148 + local7);
				}
			}
		}
		Static41.aClass80_2.method8796(local7 + Static70.anInt1125 - 25, "Build: 652", -1, -16777216, local9 + 350 - 20);
		arg0.KA(local7, local9, Static70.anInt1125 + local7, local9 - -350);
		arg0.method7709(-1, Static70.anInt1125, local7, local9 + 350 - Static81.anInt1318);
		if (-37 <= -93) {
			return;
		}
		Static533.aClass80_10.method8780(-16777216, "--> " + Static533.method7890(Static497.aString134), local9 + 350 - Static594.aClass224_12.anInt6133 - 1, -1, local7 + 10);
		if (!Static429.aBoolean567) {
			return;
		}
		local64 = -1;
		if (Static44.anInt740 % 30 > 15) {
			local64 = 16777215;
		}
		arg0.method7647(12, local9 + 350 - Static594.aClass224_12.anInt6133 - 11, Static594.aClass224_12.method5256("--> " + Static533.method7890(Static497.aString134).substring(0, Static287.anInt5059)) + 10 + local7, local64);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public static void method2575() {
		Static650.method2006();
		Static40.aBoolean61 = false;
	}
}

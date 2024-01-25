import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "[I")
	public static final int[] anIntArray635 = new int[2];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ts;)V")
	public static void method7654(@OriginalArg(0) Class329 arg0) {
		Static98.aClass329_2 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method7655(@OriginalArg(0) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(14) int local14 = Static327.anInt5901;
		for (@Pc(16) int local16 = 0; local16 < arg0.length; local16++) {
			@Pc(24) Class227 local24 = Static290.aClass119_1.method3063(arg0[local16]);
			if (local24.anInt6575 != -1) {
				@Pc(37) Class20 local37 = (Class20) Static111.aClass233_28.method5669((long) local24.anInt6575);
				if (local37 == null) {
					@Pc(45) Class120 local45 = Static647.method3070(Static594.aClass97_144, local24.anInt6575, 0);
					if (local45 != null) {
						local37 = Static600.aClass87_15.method7969(local45, true);
						Static111.aClass233_28.method5662(local37, (long) local24.anInt6575);
					}
				}
				if (local37 != null) {
					Static185.aClass20Array5[local14] = local37;
					local7.append(" <img=").append(local14).append(">");
					local14++;
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLclient!ud;)V")
	public static void method7656(@OriginalArg(1) Class2_Sub34 arg0) {
		@Pc(9) int local9 = arg0.method6863();
		Static242.aClass209Array1 = new Class209[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static242.aClass209Array1[local14] = new Class209();
			Static242.aClass209Array1[local14].anInt6169 = arg0.method6863();
			Static242.aClass209Array1[local14].aString58 = arg0.method6910();
		}
		Static191.anInt6072 = arg0.method6863();
		Static619.anInt10078 = arg0.method6863();
		Static231.anInt4666 = arg0.method6863();
		Static558.aClass202_Sub1Array2 = new Class202_Sub1[Static619.anInt10078 + 1 - Static191.anInt6072];
		for (@Pc(62) int local62 = 0; local62 < Static231.anInt4666; local62++) {
			@Pc(68) int local68 = arg0.method6863();
			@Pc(76) Class202_Sub1 local76 = Static558.aClass202_Sub1Array2[local68] = new Class202_Sub1();
			local76.anInt5719 = arg0.method6904();
			local76.anInt5716 = arg0.method6865();
			local76.anInt5725 = local68 + Static191.anInt6072;
			local76.aString56 = arg0.method6910();
			local76.aString55 = arg0.method6910();
		}
		Static378.anInt6773 = arg0.method6865();
		Static335.aBoolean434 = true;
	}
}

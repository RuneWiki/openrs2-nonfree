import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "Lclient!jia;")
	public static Class186 aClass186_18 = new Class186(0, -1);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
	public static void method799(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static282.method4263(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static404.method6051(local7);
			local7 = Static677.method8942(local7, "%3a", ":");
			local7 = Static677.method8942(local7, "%40", "@");
			local7 = Static677.method8942(local7, "%26", "&");
			local7 = Static677.method8942(local7, "%23", "#");
			if (Static697.anApplet2 != null) {
				@Pc(133) Class201 local133 = Static376.aClass47_5.method940(new URL(Static697.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static616.anInt9968 + "&u=" + (Static508.aString113 == null ? String.valueOf(Static78.aLong61) : Static508.aString113) + "&v1=" + Static75.aString26 + "&v2=" + Static75.aString25 + "&e=" + local7));
				while (local133.anInt5729 == 0) {
					Static564.method7845(1L);
				}
				if (local133.anInt5729 == 1) {
					@Pc(155) DataInputStream local155 = (DataInputStream) local133.anObject16;
					local155.read();
					local155.close();
				}
			}
		} catch (@Pc(162) Exception local162) {
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)V")
	public static void method800(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(17, (long) arg0);
		local9.method627();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!rba;I)V")
	public static void method802(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(9) int local9 = arg0.method5331();
		Static148.aClass366Array1 = new Class366[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static148.aClass366Array1[local14] = new Class366();
			Static148.aClass366Array1[local14].anInt10425 = arg0.method5331();
			Static148.aClass366Array1[local14].aString125 = arg0.method5269();
		}
		if (5222 != 5222) {
			aClass186_18 = null;
		}
		Static80.anInt1245 = arg0.method5331();
		Static410.anInt7308 = arg0.method5331();
		Static323.anInt5655 = arg0.method5331();
		Static460.aClass256_Sub1Array2 = new Class256_Sub1[Static410.anInt7308 + 1 - Static80.anInt1245];
		for (@Pc(76) int local76 = 0; local76 < Static323.anInt5655; local76++) {
			@Pc(84) int local84 = arg0.method5331();
			@Pc(92) Class256_Sub1 local92 = Static460.aClass256_Sub1Array2[local84] = new Class256_Sub1();
			local92.anInt7706 = arg0.method5322(-30);
			local92.anInt7704 = arg0.method5312();
			local92.anInt7714 = Static80.anInt1245 + local84;
			local92.aString105 = arg0.method5269();
			local92.aString106 = arg0.method5269();
		}
		Static642.anInt10382 = arg0.method5312();
		Static287.aBoolean449 = true;
	}
}

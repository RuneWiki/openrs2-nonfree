import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "Lclient!pm;")
	public static final Class295 aClass295_11 = new Class295(1);

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_44 = new Class85(8);

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "[I")
	public static final int[] anIntArray470 = new int[1000];

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
	public static void method6014() {
		Static10.aBoolean24 = true;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIBIII)V")
	public static void method6015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(70) int local70 = local21 * 3;
		@Pc(78) int local78 = ((arg4 << 1) - 3) * local25;
		@Pc(84) int local84 = local55;
		Static494.method7075(arg3 - arg2, arg0, arg2 + arg3, Static449.anIntArrayArray48[arg1], 18601);
		@Pc(103) int local103 = local51 * (arg4 - 1);
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local47 += local84;
					local39 += local70;
					local70 += local55;
					local84 += local55;
					local7++;
				}
			}
			if (local47 < 0) {
				local47 += local84;
				local39 += local70;
				local70 += local55;
				local7++;
				local84 += local55;
			}
			local39 += -local103;
			local47 += -local78;
			local9--;
			local78 -= local51;
			local103 -= local51;
			@Pc(179) int local179 = arg1 - local9;
			@Pc(184) int local184 = arg1 + local9;
			@Pc(188) int local188 = local7 + arg3;
			@Pc(192) int local192 = arg3 - local7;
			Static494.method7075(local192, arg0, local188, Static449.anIntArrayArray48[local179], 18601);
			Static494.method7075(local192, arg0, local188, Static449.anIntArrayArray48[local184], 18601);
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
	public static void method6016() {
		if (Static127.aClass406Array1 == null) {
			Static127.aClass406Array1 = Static722.method9625();
			Static101.aClass406_8 = Static127.aClass406Array1[0];
			Static335.aLong166 = Static567.method7863();
		}
		if (Static591.aClass337_3 == null) {
			Static655.method8998();
		}
		@Pc(27) Class406 local27 = Static101.aClass406_8;
		@Pc(30) int local30 = Static393.method5840();
		if (Static101.aClass406_8 == local27) {
			Static350.aString61 = Static101.aClass406_8.aClass191_64.method4067(Static414.anInt9485);
			if (Static101.aClass406_8.aBoolean941) {
				Static572.anInt9041 = Static101.aClass406_8.anInt11029 + local30 * (Static101.aClass406_8.anInt11031 - Static101.aClass406_8.anInt11029) / 100;
			}
			if (Static101.aClass406_8.aBoolean940) {
				Static350.aString61 = Static350.aString61 + Static572.anInt9041 + "%";
			}
		} else if (Static722.aClass406_30 == Static101.aClass406_8) {
			Static591.aClass337_3 = null;
			Static261.method9374(-94, 3);
		} else {
			Static350.aString61 = local27.aClass191_63.method4067(Static414.anInt9485);
			if (Static101.aClass406_8.aBoolean940) {
				Static350.aString61 = Static350.aString61 + local27.anInt11031 + "%";
			}
			Static572.anInt9041 = local27.anInt11031;
			if (Static101.aClass406_8.aBoolean941 || local27.aBoolean941) {
				Static335.aLong166 = Static567.method7863();
			}
		}
		if (Static591.aClass337_3 == null) {
			return;
		}
		Static591.aClass337_3.method8091(Static101.aClass406_8, Static350.aString61, Static572.anInt9041, Static335.aLong166);
		if (Static380.anInterface8Array1 == null) {
			return;
		}
		for (@Pc(158) int local158 = Static134.anInt2242 + 1; local158 < Static380.anInterface8Array1.length; local158++) {
			if (Static380.anInterface8Array1[local158].method7193() >= 100 && local158 - 1 == Static134.anInt2242 && Static357.anInt5722 >= 1 && Static591.aClass337_3.method8088()) {
				try {
					Static380.anInterface8Array1[local158].method7190();
				} catch (@Pc(200) Exception local200) {
					Static380.anInterface8Array1 = null;
					return;
				}
				Static591.aClass337_3.method8093(Static380.anInterface8Array1[local158]);
				Static134.anInt2242++;
				if (Static134.anInt2242 >= Static380.anInterface8Array1.length - 1 && Static380.anInterface8Array1.length > 1) {
					Static134.anInt2242 = Static509.aClass241_1.method5845() ? 0 : -1;
				}
			}
		}
		return;
	}
}

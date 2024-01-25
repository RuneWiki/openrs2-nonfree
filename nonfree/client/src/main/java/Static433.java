import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "Lclient!wea;")
	public static Class370 aClass370_3;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "Lclient!kha;")
	public static Class181 aClass181_81;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "Z")
	public static boolean aBoolean671 = false;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "Z")
	public static boolean aBoolean672 = false;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;B)V")
	public static void method6620(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		@Pc(6) Class3_Sub26 local6 = Static588.method8070();
		local6.aClass3_Sub15_Sub1_3.method8448(Static577.aClass240_37.anInt7401);
		local6.aClass3_Sub15_Sub1_3.method8464(0);
		@Pc(21) int local21 = local6.aClass3_Sub15_Sub1_3.anInt10282;
		local6.aClass3_Sub15_Sub1_3.method8464(636);
		@Pc(30) int[] local30 = Static474.method7013(local6);
		@Pc(34) int local34 = local6.aClass3_Sub15_Sub1_3.anInt10282;
		local6.aClass3_Sub15_Sub1_3.method8417(arg3);
		local6.aClass3_Sub15_Sub1_3.method8464(Static134.anInt3486);
		local6.aClass3_Sub15_Sub1_3.method8417(arg2);
		local6.aClass3_Sub15_Sub1_3.method8411(Static100.aLong55);
		local6.aClass3_Sub15_Sub1_3.method8448(Static380.anInt7247);
		local6.aClass3_Sub15_Sub1_3.method8448(Static648.aClass62_16.anInt2526);
		Static60.method1306(local6.aClass3_Sub15_Sub1_3);
		@Pc(71) String local71 = Static331.aString72;
		local6.aClass3_Sub15_Sub1_3.method8448(local71 == null ? 0 : 1);
		if (local71 != null) {
			local6.aClass3_Sub15_Sub1_3.method8417(local71);
		}
		local6.aClass3_Sub15_Sub1_3.method8448(arg0);
		local6.aClass3_Sub15_Sub1_3.method8448(arg1 ? 1 : 0);
		local6.aClass3_Sub15_Sub1_3.anInt10282 += 7;
		local6.aClass3_Sub15_Sub1_3.method8456(local34, local30, local6.aClass3_Sub15_Sub1_3.anInt10282);
		local6.aClass3_Sub15_Sub1_3.method8397(local6.aClass3_Sub15_Sub1_3.anInt10282 - local21);
		Static472.method5189(local6);
		Static544.anInt9356 = 0;
		Static278.anInt7456 = -3;
		Static6.anInt67 = 0;
		Static567.anInt9650 = 1;
		if (arg0 < 13) {
			Static207.aBoolean425 = true;
			Static368.method5896();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZ)I")
	public static int method6622(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub17 local14 = Static77.method3511(false, arg0);
		if (local14 == null) {
			return Static126.aClass9_1.method105(arg0).anInt1104;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray99.length; local26++) {
			if (local14.anIntArray99[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static126.aClass9_1.method105(arg0).anInt1104 - local14.anIntArray99.length;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
	public static void method6623() {
		for (@Pc(6) Class2_Sub7 local6 = (Class2_Sub7) Static479.aClass375_8.method8633(); local6 != null; local6 = (Class2_Sub7) Static479.aClass375_8.method8633()) {
			Static106.method2590(local6);
		}
		@Pc(34) int local34;
		@Pc(33) int local33;
		if (Static552.aClass3_Sub48_30.aClass23_Sub14_1.method4252() == 1) {
			local33 = 3;
			local34 = 0;
		} else {
			local33 = Static630.anInt10396;
			local34 = Static630.anInt10396;
		}
		Static71.method1831();
		for (@Pc(43) int local43 = local34; local43 <= local33; local43++) {
			Static71.method1835();
			Static71.method1838(local43);
			Static71.method1829(local43);
		}
		Static71.method1830();
		Static71.method1828();
	}
}

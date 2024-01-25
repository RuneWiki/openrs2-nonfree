import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
	public static int anInt2428;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZB)V")
	public static void method2048(@OriginalArg(0) boolean arg0) {
		if (Static97.aClass29_1 != null) {
			Static97.aClass29_1.method4606();
			Static97.aClass29_1 = null;
		}
		Static572.anInt9602 = 0;
		Static223.method3776();
		Static174.method3212();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static619.aClass319Array1[local19].method7929();
		}
		Static78.method1370(false);
		System.gc();
		Static357.method1358();
		Static152.anInt5128 = -1;
		Static166.aBoolean250 = false;
		Static259.method4619();
		Static120.method1982(true);
		Static195.anInt3961 = 0;
		Static436.anInt7900 = 0;
		Static152.anInt5122 = 0;
		Static22.anInt349 = 0;
		Static500.anInt8419 = 0;
		Static606.anInt8651 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static325.aClass19Array1.length; local60++) {
			Static325.aClass19Array1[local60] = null;
		}
		Static248.method4288();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local75] = null;
		}
		Static252.anInt5066 = 0;
		Static347.aClass128_23.method3562();
		Static273.anInt5420 = 0;
		Static333.aClass128_46.method3562();
		Static272.method5664();
		Static500.anInt8420 = 0;
		Static279.aClass294_1.method7418();
		Static187.method3365();
		Static587.method8271();
		Static32.aClass6_Sub17_1 = null;
		Static317.aLong161 = 0L;
		if (arg0) {
			Static190.method3390(12);
			return;
		}
		Static190.method3390(3);
		try {
			Static654.method5164(Static42.anApplet1, "loggedout");
		} catch (@Pc(130) Throwable local130) {
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
	public static void method2049() {
		Static560.aClass166_56.method4809(50);
		Static292.aClass166_29.method4809(50);
		Static284.aClass166_42.method4809(50);
		Static315.aClass166_31.method4809(50);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
	public static void method2053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class97 local7 = Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static10.method210(local7.aClass20_Sub2_Sub1_1);
		Static10.method210(local7.aClass20_Sub2_Sub1_2);
		if (local7.aClass20_Sub2_Sub1_1 != null) {
			local7.aClass20_Sub2_Sub1_1 = null;
		}
		if (local7.aClass20_Sub2_Sub1_2 != null) {
			local7.aClass20_Sub2_Sub1_2 = null;
		}
	}
}

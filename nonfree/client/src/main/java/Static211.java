import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
	public static int anInt3250;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_118 = new Class288(97, 17);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLclient!vj;)Lclient!eia;")
	public static Class2_Sub6 method2736(@OriginalArg(1) Class2_Sub22 arg0) {
		arg0.method8547();
		@Pc(13) int local13 = arg0.method8547();
		@Pc(17) Class2_Sub6 local17 = Static223.method3045(local13);
		local17.anInt10160 = arg0.method8547();
		@Pc(26) int local26 = arg0.method8547();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method8547();
			local17.method8467(local34, arg0);
		}
		local17.method8462();
		return local17;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V")
	public static void method2745() throws Exception_Sub1 {
		if (Static491.anInt8078 == 1) {
			Static361.aClass95_9.method6996(Static589.anInt9580, Static290.anInt4733);
		} else {
			Static361.aClass95_9.method6996(0, 0);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
	public static void method2746(@OriginalArg(1) boolean arg0) {
		if (Static155.aClass121_2 != null) {
			Static155.aClass121_2.method2936();
			Static155.aClass121_2 = null;
		}
		Static324.anInt5144 = 0;
		Static88.method1312();
		Static537.method7410();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static230.aClass240Array1[local19].method5187();
		}
		Static393.method5366(false);
		System.gc();
		Static506.method6919();
		Static489.anInt1781 = -1;
		Static446.aBoolean675 = false;
		Static151.method2243();
		Static99.method6065(true);
		Static22.anInt551 = 0;
		Static123.anInt2176 = 0;
		Static132.anInt2246 = 0;
		Static592.anInt9602 = 0;
		Static443.anInt7083 = 0;
		Static8.anInt114 = 0;
		for (@Pc(62) int local62 = 0; local62 < Static341.aClass372Array1.length; local62++) {
			Static341.aClass372Array1[local62] = null;
		}
		Static167.method2468();
		for (@Pc(81) int local81 = 0; local81 < 2048; local81++) {
			Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local81] = null;
		}
		Static639.anInt10306 = 0;
		Static440.aClass118_41.method2599();
		Static645.anInt9916 = 0;
		Static41.aClass118_6.method2599();
		Static204.method2871();
		Static372.anInt5855 = 0;
		Static431.aClass205_1.method4262();
		Static371.method5011();
		Static215.method2974();
		Static523.aClass2_Sub32_6 = null;
		Static2.aLong10 = 0L;
		if (arg0) {
			Static158.method2370(12);
			return;
		}
		Static158.method2370(3);
		try {
			Static651.method4296("loggedout", Static617.anApplet2);
		} catch (@Pc(136) Throwable local136) {
		}
	}
}

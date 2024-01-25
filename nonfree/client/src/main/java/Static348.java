import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "[I")
	public static int[] anIntArray219;

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
	public static int anInt2689 = 0;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!iq;Lclient!iq;Lclient!iq;Lclient!e;)Z")
	public static boolean method2463(@OriginalArg(1) Class104 arg0, @OriginalArg(2) Class104 arg1, @OriginalArg(3) Class104 arg2, @OriginalArg(4) Class2_Sub11_Sub1 arg3) {
		Static209.aClass104_194 = arg2;
		Static155.aClass104_93 = arg1;
		Static108.aClass104_71 = arg0;
		Static349.aClass2_Sub11_Sub1_5 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(B)V")
	public static void method2469() {
		if (Static129.aClass117_2 != null) {
			Static129.aClass117_2.method3278();
			Static129.aClass117_2 = null;
		}
		Static51.method1022();
		Static79.method1604();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static182.aClass61Array2[local17].method1611();
		}
		Static251.method4441(false);
		System.gc();
		Static153.method3166();
		Static97.aBoolean179 = false;
		Static290.anInt5805 = -1;
		Static17.method254(true);
		Static208.anInt4568 = 0;
		Static190.anInt6232 = 0;
		Static150.anInt3453 = 0;
		Static287.anInt5776 = 0;
		Static219.aBoolean424 = false;
		for (@Pc(54) int local54 = 0; local54 < Static223.aClass52Array1.length; local54++) {
			Static223.aClass52Array1[local54] = null;
		}
		Static265.method4658();
		for (@Pc(73) int local73 = 0; local73 < 2048; local73++) {
			Static164.aClass1_Sub2_Sub3_Sub1Array1[local73] = null;
		}
		Static186.anInt4092 = 0;
		for (@Pc(92) int local92 = 0; local92 < 32768; local92++) {
			Static95.aClass1_Sub2_Sub3_Sub2Array1[local92] = null;
		}
		Static198.aClass41_24.method907();
		Static63.method1320();
		Static281.anInt5678 = 0;
		Static307.method5138();
		Static123.method2390();
		Static160.method3261();
		Static315.method5228(true);
		try {
			Static381.method5669(Static62.aClass179_2.anApplet1, "loggedout");
		} catch (@Pc(126) Throwable local126) {
		}
		Static236.aLong31 = 0L;
		Static319.aClass2_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
	public static void method2471() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static62.aBooleanArray7[local3] = false;
		}
		Static135.anInt2910 = 5;
		Static58.anInt1028 = -1;
		Static122.anInt2596 = Static6.anInt91;
		Static309.anInt6122 = 0;
		Static234.anInt5034 = Static166.anInt3804;
		Static332.anInt6427 = Static51.anInt879;
		Static243.anInt5176 = Static195.anInt4286;
		Static133.anInt2845 = 0;
		Static276.anInt5646 = Static23.anInt356;
		Static228.anInt4939 = Static168.anInt3820;
		Static295.anInt5862 = -1;
	}

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)V")
	public static void method2474() {
		Static220.anIntArray355 = null;
		Static81.anIntArray127 = null;
		Static63.anIntArray102 = null;
		Static351.aBooleanArray30 = null;
		Static66.aBoolean117 = false;
		Static346.aClipboard2 = null;
		Static35.method5765();
	}
}

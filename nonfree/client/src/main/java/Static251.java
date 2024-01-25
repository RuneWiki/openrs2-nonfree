import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!qc", name = "Qc", descriptor = "Lclient!uh;")
	public static Class201 aClass201_14;

	@OriginalMember(owner = "client!qc", name = "Pc", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_47 = new Class198(64);

	@OriginalMember(owner = "client!qc", name = "Rc", descriptor = "I")
	public static int anInt4974 = 0;

	@OriginalMember(owner = "client!qc", name = "Sc", descriptor = "[I")
	public static final int[] anIntArray406 = new int[50];

	@OriginalMember(owner = "client!qc", name = "Vc", descriptor = "I")
	public static int anInt4977 = 20;

	@OriginalMember(owner = "client!qc", name = "Wc", descriptor = "I")
	public static int anInt4978 = 0;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "(I)V")
	public static void method4218() {
		if (Static76.aClass16_2 != null) {
			Static76.aClass16_2.method392();
			Static76.aClass16_2 = null;
		}
		Static333.method5471();
		Static323.method5290();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static34.aClass13Array1[local17].method241();
		}
		Static233.method4014(false);
		System.gc();
		Static310.method5212();
		Static107.aBoolean119 = false;
		Static312.anInt6282 = -1;
		Static107.method1836(true);
		Static130.anInt2745 = 0;
		Static186.anInt3094 = 0;
		Static16.anInt512 = 0;
		Static297.aBoolean407 = false;
		Static296.anInt5889 = 0;
		for (@Pc(56) int local56 = 0; local56 < Static108.aClass125Array11.length; local56++) {
			Static108.aClass125Array11[local56] = null;
		}
		Static170.anInt6275 = 0;
		Static42.anInt897 = 0;
		for (@Pc(77) int local77 = 0; local77 < 2048; local77++) {
			Static254.aClass5_Sub4_Sub4_Sub1Array1[local77] = null;
			Static109.aClass3_Sub4Array1[local77] = null;
		}
		for (@Pc(93) int local93 = 0; local93 < 32768; local93++) {
			Static244.aClass5_Sub4_Sub4_Sub2Array1[local93] = null;
		}
		Static128.aClass24_18.method608();
		Static271.method4581();
		Static214.anInt4356 = 0;
		Static102.method1721();
		Static165.method2610();
		Static257.method4352();
		Static68.method1088(true);
		try {
			Static361.method2055("loggedout", Static353.aClass42_5.anApplet1);
		} catch (@Pc(131) Throwable local131) {
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)Lclient!i;")
	public static Class88 method4221(@OriginalArg(1) int arg0) {
		@Pc(10) Class88 local10 = (Class88) Static313.aClass198_55.method5242((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static14.aClass100_9.method2319(35, arg0);
		local10 = new Class88();
		if (local25 != null) {
			local10.method2170(new Class3_Sub4(local25));
		}
		local10.method2173();
		Static313.aClass198_55.method5231((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(ZI)Lclient!ef;")
	public static Class54 method4222(@OriginalArg(1) int arg0) {
		@Pc(5) Class198 local5 = Static140.aClass198_23;
		@Pc(14) Class54 local14;
		synchronized (Static140.aClass198_23) {
			local14 = (Class54) Static140.aClass198_23.method5242((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static42.aClass100_16.method2319(32, arg0);
		local14 = new Class54();
		if (local30 != null) {
			local14.method1159(new Class3_Sub4(local30));
		}
		local14.method1153();
		@Pc(48) Class198 local48 = Static140.aClass198_23;
		synchronized (Static140.aClass198_23) {
			Static140.aClass198_23.method5231((long) arg0, local14);
			return local14;
		}
	}
}

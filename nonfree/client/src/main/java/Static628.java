import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
	public static int anInt10249;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Z")
	public static boolean aBoolean873 = false;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "Lclient!gh;")
	public static final Class131 aClass131_20 = new Class131(14, 0, 4, 1);

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
	public static int anInt10248 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZZ)I")
	public static int method8482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class5_Sub43 local13 = Static10.method153(arg1, arg2);
		if (local13 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local13.anIntArray405.length) {
			return local13.anIntArray405[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!d;ILclient!wm;)V")
	public static void method8483(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) Class390 arg1) {
		Static176.anInterface4_5 = arg0;
		Static469.aClass390_89 = arg1;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BZ)V")
	public static void method8487(@OriginalArg(1) boolean arg0) {
		if (Static12.aClass244_1 != null) {
			Static12.aClass244_1.method5753();
			Static12.aClass244_1 = null;
		}
		Static273.anInt5015 = 0;
		Static341.method5193();
		Static305.method4815();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static275.aClass106Array1[local17].method2663();
		}
		Static586.method8062(false);
		System.gc();
		Static435.method8378();
		Static33.anInt545 = -1;
		Static569.aBoolean788 = false;
		Static481.method6852();
		Static554.method7691(true);
		Static31.anInt483 = 0;
		Static589.anInt9683 = 0;
		Static436.anInt7546 = 0;
		Static201.anInt3839 = 0;
		Static427.anInt7491 = 0;
		Static153.anInt3147 = 0;
		for (@Pc(67) int local67 = 0; local67 < Static564.aClass371Array6.length; local67++) {
			Static564.aClass371Array6[local67] = null;
		}
		Static390.method5755();
		for (@Pc(81) int local81 = 0; local81 < 2048; local81++) {
			Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local81] = null;
		}
		Static36.anInt607 = 0;
		Static56.aClass300_8.method7189();
		Static37.anInt617 = 0;
		Static548.aClass300_41.method7189();
		Static665.method7138();
		Static446.anInt7663 = 0;
		Static161.aClass237_3.method5684();
		Static96.method1937();
		Static394.method5803();
		Static207.aClass5_Sub29_2 = null;
		Static613.aClass5_Sub45_2 = null;
		Static340.aLong164 = 0L;
		Static494.aClass5_Sub45_1 = null;
		Static300.aClass166_6 = null;
		Static101.aClass166_1 = null;
		if (arg0) {
			Static271.method4671(12);
			return;
		}
		Static271.method4671(3);
		try {
			Static682.method3657("loggedout", Static639.anApplet2);
		} catch (@Pc(135) Throwable local135) {
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
	public static void method8488(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub3_Sub17 local9 = Static358.method5408(16, (long) arg0);
		local9.method7288();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
	public static int anInt472;

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "[I")
	public static int[] anIntArray52;

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
	public static int anInt476 = 0;

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "[I")
	public static int[] anIntArray53 = new int[200];

	@OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
	public static int anInt483 = 0;

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "[I")
	public static int[] anIntArray54 = new int[100];

	@OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
	public static int anInt488 = 1;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(ZI)V")
	public static void method460(@OriginalArg(1) int arg0) {
		Static277.anInt5089 = arg0;
		Static155.method2675(3);
		Static155.method2675(4);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static19.method322(arg0)) {
			Static42.method782(Static176.aClass157ArrayArray1[arg0], -1, arg4, arg1, arg3, arg2, arg6, arg5);
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)Z")
	public static boolean method463() {
		if (Static274.aBoolean479) {
			try {
				Static320.method2266("showVideoAd", Static222.aClass176_3.anApplet1);
				return true;
			} catch (@Pc(16) Throwable local16) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)V")
	public static void method465() {
		if (Static129.aClass121_2 != null) {
			Static129.aClass121_2.method3576();
		}
		if (Static13.aClass121_1 != null) {
			Static13.aClass121_1.method3576();
		}
		Static222.method3591(Static230.aBoolean388);
		Static129.aClass121_2 = Static58.method1032(0, 22050, Static222.aClass176_3, Static229.aCanvas2);
		Static129.aClass121_2.method3581(Static84.aClass1_Sub7_Sub2_1);
		Static13.aClass121_1 = Static58.method1032(1, 2048, Static222.aClass176_3, Static229.aCanvas2);
		Static13.aClass121_1.method3581(Static173.aClass1_Sub7_Sub3_1);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILclient!kl;I)V")
	public static void method466(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub4_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt3864 == arg0 && arg0 != -1) {
			@Pc(96) Class152 local96 = Static107.method2016(arg0);
			@Pc(99) int local99 = local96.anInt4603;
			if (local99 == 1) {
				arg1.anInt3842 = 1;
				arg1.anInt3847 = 0;
				arg1.anInt3789 = 0;
				arg1.anInt3850 = 0;
				arg1.anInt3798 = arg2;
				Static291.method4385(local96, Static138.aClass11_Sub4_Sub1_3 == arg1, arg1.anInt3856, arg1.anInt3865, arg1.anInt3847);
			}
			if (local99 == 2) {
				arg1.anInt3789 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt3864 == -1 || Static107.method2016(arg0).anInt4608 >= Static107.method2016(arg1.anInt3864).anInt4608) {
			arg1.anInt3850 = 0;
			arg1.anInt3847 = 0;
			arg1.anInt3789 = 0;
			arg1.anInt3783 = arg1.anInt3863;
			arg1.anInt3864 = arg0;
			arg1.anInt3798 = arg2;
			arg1.anInt3842 = 1;
			if (arg1.anInt3864 != -1) {
				Static291.method4385(Static107.method2016(arg1.anInt3864), Static138.aClass11_Sub4_Sub1_3 == arg1, arg1.anInt3856, arg1.anInt3865, arg1.anInt3847);
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "(I)V")
	public static void method467() {
		Static183.aClass175_29.method4294();
		Static43.aClass175_8.method4294();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method469(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(4) Class1_Sub5_Sub21 local4 = Static278.method4266(3, arg0);
		local4.method4062();
		local4.aString185 = arg1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!nm;Lclient!me;ZLclient!nm;)V")
	public static void method470(@OriginalArg(1) Class119 arg0, @OriginalArg(2) Class1_Sub5_Sub9_Sub2 arg1, @OriginalArg(4) Class119 arg2) {
		Static291.aClass119_90 = arg2;
		Static199.aBoolean348 = true;
		Static105.aClass119_40 = arg0;
		@Pc(20) int local20 = Static291.aClass119_90.method3234() - 1;
		Static73.anInt1580 = local20 * 256 + Static291.aClass119_90.method3217(local20);
		Static315.aStringArray37 = new String[] { null, null, null, null, Static193.aString128 };
		Static306.aStringArray36 = new String[] { null, null, Static86.aString67, null, null };
		Static282.aClass1_Sub5_Sub9_Sub2_1 = arg1;
	}
}

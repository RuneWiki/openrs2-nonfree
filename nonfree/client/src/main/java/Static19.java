import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Z")
	public static boolean aBoolean19;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Lclient!da;")
	public static Class13 aClass13_17 = new Class13();

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Lclient!u;")
	private static Class74 aClass74_444 = Static72.method1077("Bad session id)3");

	@OriginalMember(owner = "client!da", name = "m", descriptor = "[Lclient!u;")
	public static Class74[] aClass74Array2 = new Class74[200];

	@OriginalMember(owner = "client!da", name = "q", descriptor = "I")
	public static int anInt573 = 0;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "Lclient!u;")
	public static Class74 aClass74_445 = aClass74_444;

	@OriginalMember(owner = "client!da", name = "B", descriptor = "Lclient!u;")
	private static Class74 aClass74_448 = Static72.method1077("Please remove ");

	@OriginalMember(owner = "client!da", name = "z", descriptor = "Lclient!u;")
	public static Class74 aClass74_446 = aClass74_448;

	@OriginalMember(owner = "client!da", name = "A", descriptor = "Lclient!u;")
	public static Class74 aClass74_447 = Static72.method1077(" )2> ");

	@OriginalMember(owner = "client!da", name = "C", descriptor = "[I")
	public static int[] anIntArray56 = new int[1000];

	@OriginalMember(owner = "client!da", name = "D", descriptor = "Lclient!u;")
	public static Class74 aClass74_449 = aClass74_448;

	@OriginalMember(owner = "client!da", name = "E", descriptor = "Lclient!r;")
	public static Class2_Sub10_Sub1 aClass2_Sub10_Sub1_1 = new Class2_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!da", name = "F", descriptor = "Lclient!u;")
	public static Class74 aClass74_450 = Static72.method1077("(U3");

	@OriginalMember(owner = "client!da", name = "G", descriptor = "Lclient!u;")
	public static Class74 aClass74_451 = Static72.method1077(")4l");

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method416() {
		Static3.aClass13_3 = new Class13();
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
	public static void method417() {
		aClass74_447 = null;
		aClass74_450 = null;
		anIntArray56 = null;
		aClass74_444 = null;
		aClass74_451 = null;
		aClass74_446 = null;
		aClass2_Sub10_Sub1_1 = null;
		aClass74_445 = null;
		aClass74_448 = null;
		aClass74_449 = null;
		aClass13_17 = null;
		aClass74Array2 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	public static void method420(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
			Static55.anInt513 = -1;
			Static119.anInt2549 = -1;
			return;
		}
		@Pc(35) int local35 = Static15.method348(arg1, arg2, Static117.anInt2529) - arg0;
		@Pc(39) int local39 = Class2_Sub2_Sub1_Sub4.anIntArray122[Static53.anInt1290];
		@Pc(43) int local43 = local35 - Static12.anInt362;
		@Pc(47) int local47 = arg2 - Static40.anInt958;
		@Pc(51) int local51 = Class2_Sub2_Sub1_Sub4.anIntArray119[Static53.anInt1290];
		@Pc(55) int local55 = arg1 - Static113.anInt2444;
		@Pc(59) int local59 = Class2_Sub2_Sub1_Sub4.anIntArray119[Static100.anInt2211];
		@Pc(63) int local63 = Class2_Sub2_Sub1_Sub4.anIntArray122[Static100.anInt2211];
		@Pc(73) int local73 = local47 * local63 + local55 * local59 >> 16;
		@Pc(83) int local83 = local47 * local59 - local63 * local55 >> 16;
		@Pc(85) int local85 = local73;
		@Pc(95) int local95 = local51 * local43 - local39 * local83 >> 16;
		@Pc(105) int local105 = local39 * local43 + local83 * local51 >> 16;
		if (local105 >= 50) {
			Static55.anInt513 = (local95 << 9) / local105 + 167;
			Static119.anInt2549 = (local85 << 9) / local105 + 256;
		} else {
			Static119.anInt2549 = -1;
			Static55.anInt513 = -1;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIII)V")
	public static void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static47.aClass2_Sub2_Sub1_Sub1Array5[0].method97(arg0, arg1);
		Static47.aClass2_Sub2_Sub1_Sub1Array5[1].method97(arg0, arg4 + arg1 - 16);
		Static58.method702(arg0, arg1 + 16, 16, arg4 - 32, Static97.anInt2893);
		@Pc(41) int local41 = arg4 * (arg4 - 32) / arg2;
		if (local41 < 8) {
			local41 = 8;
		}
		@Pc(59) int local59 = arg3 * (arg4 - local41 - 32) / (arg2 - arg4);
		Static58.method702(arg0, arg1 + local59 + 16, 16, local41, Static2.anInt39);
		Static58.method704(arg0, local59 + arg1 + 16, local41, Static86.anInt1852);
		Static58.method704(arg0 + 1, arg1 + 16 + local59, local41, Static86.anInt1852);
		Static58.method706(arg0, arg1 + local59 + 16, 16, Static86.anInt1852);
		Static58.method706(arg0, local59 + arg1 + 17, 16, Static86.anInt1852);
		Static58.method704(arg0 + 15, arg1 + 16 - -local59, local41, Static102.anInt2284);
		Static58.method704(arg0 + 14, local59 + 17 + arg1, local41 - 1, Static102.anInt2284);
		Static58.method706(arg0, local41 + local59 + arg1 + 15, 16, Static102.anInt2284);
		Static58.method706(arg0 + 1, local59 + arg1 - -14 + local41, 15, Static102.anInt2284);
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
	public static void method426() {
		Static17.anInt548 = 0;
		Static107.anInt2342 = 0;
		Static15.method351();
		Static38.method656();
		Static1.method1458();
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < Static17.anInt548; local25++) {
			local31 = Static85.anIntArray257[local25];
			if (Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local31].anInt2681 != Static107.anInt2338) {
				Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local31].aClass2_Sub2_Sub9_1 = null;
				Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local31] = null;
			}
		}
		if (aClass2_Sub10_Sub1_1.anInt2187 != Static16.anInt463) {
			throw new RuntimeException("gnp1 pos:" + aClass2_Sub10_Sub1_1.anInt2187 + " psize:" + Static16.anInt463);
		}
		for (local31 = 0; local31 < Static29.anInt686; local31++) {
			if (Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[Static40.anIntArray110[local31]] == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static29.anInt686);
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ve;B)I")
	public static int method429(@OriginalArg(0) Class2_Sub2_Sub17 arg0) {
		@Pc(22) Class2_Sub3 local22 = (Class2_Sub3) Static98.aClass58_53.method1307((long) arg0.anInt2782 + ((long) arg0.anInt2794 << 32));
		return local22 == null ? arg0.anInt2809 : local22.anInt130;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method430(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static112.aClass65_1);
		arg0.removeMouseMotionListener(Static112.aClass65_1);
		arg0.removeFocusListener(Static112.aClass65_1);
	}
}

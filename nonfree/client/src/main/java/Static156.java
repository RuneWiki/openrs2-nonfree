import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
	public static final int anInt3636 = 3353893;

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
	public static int anInt3638 = 0;

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "[I")
	public static int[] anIntArray358 = new int[2048];

	@OriginalMember(owner = "client!tb", name = "A", descriptor = "[Lclient!ai;")
	public static Class6[] aClass6Array18 = new Class6[100];

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1062 = Static38.method685("<col=00ffff>");

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
	public static int anInt3641 = 2;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Z")
	public static boolean method2407() {
		try {
			if (Static65.anInt1613 == 2) {
				if (Static140.aClass2_Sub4_1 == null) {
					Static140.aClass2_Sub4_1 = Static183.method91(Static19.aClass10_21, Static109.anInt3491, Static6.anInt1431);
					if (Static140.aClass2_Sub4_1 == null) {
						return false;
					}
				}
				if (Static35.aClass13_1 == null) {
					Static35.aClass13_1 = new Class13(Static95.aClass10_77, Static29.aClass10_28);
				}
				if (Static89.aClass2_Sub10_Sub3_1.method2016(Static140.aClass2_Sub4_1, Static165.aClass10_134, Static35.aClass13_1)) {
					Static89.aClass2_Sub10_Sub3_1.method2011();
					Static89.aClass2_Sub10_Sub3_1.method2006(Static135.anInt3139);
					Static89.aClass2_Sub10_Sub3_1.method2015(Static155.aBoolean161, Static140.aClass2_Sub4_1);
					Static65.anInt1613 = 0;
					Static140.aClass2_Sub4_1 = null;
					Static19.aClass10_21 = null;
					Static35.aClass13_1 = null;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static89.aClass2_Sub10_Sub3_1.method2030();
			Static65.anInt1613 = 0;
			Static140.aClass2_Sub4_1 = null;
			Static19.aClass10_21 = null;
			Static35.aClass13_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)I")
	public static int method2408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >> 31 & arg1 - 1;
		return local7 + ((arg0 >>> 31) + arg0) % arg1;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)Z")
	public static boolean method2409(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public static void method2410() {
		anIntArray358 = null;
		aBigInteger2 = null;
		aClass6Array18 = null;
		aClass6_1062 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIILclient!eh;I)V")
	public static void method2411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub3_Sub6 arg4) {
		@Pc(12) Class2_Sub21 local12 = new Class2_Sub21();
		local12.anInt3528 = arg4.anInt1180;
		local12.anInt3531 = arg2 * 128;
		local12.anInt3533 = arg4.anInt1203 * 128;
		local12.anInt3522 = arg4.anInt1215;
		local12.anInt3526 = arg3;
		local12.anInt3524 = arg4.anInt1204;
		local12.anInt3535 = arg0 * 128;
		@Pc(46) int local46 = arg4.anInt1205;
		local12.anIntArray351 = arg4.anIntArray63;
		@Pc(53) int local53 = arg4.anInt1195;
		if (arg1 == 1 || arg1 == 3) {
			local46 = arg4.anInt1195;
			local53 = arg4.anInt1205;
		}
		local12.anInt3525 = (arg2 + local53) * 128;
		local12.anInt3523 = (arg0 + local46) * 128;
		if (arg4.anIntArray61 != null) {
			local12.aClass2_Sub3_Sub6_1 = arg4;
			local12.method2339();
		}
		Static131.aClass84_11.method2701(local12);
		if (local12.anIntArray351 != null) {
			local12.anInt3532 = local12.anInt3522 + (int) (Math.random() * (double) (local12.anInt3524 - local12.anInt3522));
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!ai;)V")
	public static void method2412(@OriginalArg(0) int arg0, @OriginalArg(2) Class6 arg1) {
		Static66.aClass2_Sub13_Sub1_2.method1455(157);
		Static66.aClass2_Sub13_Sub1_2.method1434(arg1.method129());
		Static66.aClass2_Sub13_Sub1_2.method1408(arg0);
	}
}

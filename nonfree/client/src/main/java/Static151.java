import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "Lclient!nk;")
	public static Class121 aClass121_71;

	@OriginalMember(owner = "client!kn", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString165 = "wave2:";

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
	public static void method2549() {
		Static256.anInt4632 = 0;
		Static224.anInt4118 = 0;
		Static188.method3083();
		Static264.method4155();
		Static41.method741();
		@Pc(21) int local21;
		for (local21 = 0; local21 < Static256.anInt4632; local21++) {
			@Pc(32) int local32 = Static206.anIntArray315[local21];
			if (Static313.anInt2966 != Static83.aClass15_Sub5_Sub1Array1[local32].anInt5563) {
				if (Static83.aClass15_Sub5_Sub1Array1[local32].aClass99_1.method2644()) {
					Static27.method456(Static83.aClass15_Sub5_Sub1Array1[local32]);
				}
				Static83.aClass15_Sub5_Sub1Array1[local32].method3200(null);
				Static83.aClass15_Sub5_Sub1Array1[local32] = null;
			}
		}
		if (Static88.anInt1723 != Static13.aClass1_Sub14_Sub1_1.anInt1480) {
			throw new RuntimeException("gnp1 pos:" + Static13.aClass1_Sub14_Sub1_1.anInt1480 + " psize:" + Static88.anInt1723);
		}
		for (local21 = 0; local21 < Static85.anInt1689; local21++) {
			if (Static83.aClass15_Sub5_Sub1Array1[Static104.anIntArray178[local21]] == null) {
				throw new RuntimeException("gnp2 pos:" + local21 + " size:" + Static85.anInt1689);
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILclient!hi;II)V")
	public static void method2553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3) {
		if (Static156.aBoolean211) {
			Static119.method2138(arg0, arg1, arg2.anInt2204 + arg0, arg1 + arg2.anInt2207);
		}
		if (Static12.anInt176 < 3) {
			if (Static156.aBoolean211) {
				((Class1_Sub2_Sub1_Sub1) Static243.aClass1_Sub2_Sub1_50).method2603(arg0, arg1, arg2.anInt2204, arg2.anInt2207, Static243.aClass1_Sub2_Sub1_50.anInt4444 / 2, Static243.aClass1_Sub2_Sub1_50.anInt4454 / 2, (int) Static49.aFloat32, 256, (Class1_Sub2_Sub1_Sub1) arg2.method1920(false));
			} else {
				((Class1_Sub2_Sub1_Sub2) Static243.aClass1_Sub2_Sub1_50).method3856(arg0, arg1, arg2.anInt2204, arg2.anInt2207, Static243.aClass1_Sub2_Sub1_50.anInt4444 / 2, Static243.aClass1_Sub2_Sub1_50.anInt4454 / 2, (int) Static49.aFloat32, arg2.anIntArray198, arg2.anIntArray190);
			}
		} else if (Static156.aBoolean211) {
			@Pc(81) Class1_Sub2_Sub1 local81 = arg2.method1920(false);
			if (local81 != null) {
				local81.method3839(arg0, arg1);
			}
		} else {
			Static25.method387(arg0, arg1, arg2.anIntArray198, arg2.anIntArray190);
		}
		Static116.aBooleanArray8[arg3] = true;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method2554(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static86.method1604(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(44) int local44 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(47) int local47;
			do {
				local47 = arg1.nextInt();
			} while (local47 >= local44);
			return Static100.method1817(arg0, local47);
		}
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(B)V")
	public static void method2555() {
		Static192.aClass187_102.method4530();
		Static80.aClass187_50.method4530();
		Static79.aClass187_49.method4530();
	}
}

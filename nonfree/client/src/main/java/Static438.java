import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "Lclient!ee;")
	public static Class57 aClass57_3;

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
	public static int anInt2389;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_24 = new Class268(5);

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
	public static int anInt2388 = 0;

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
	public static int anInt2390 = -1;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	public static void method2066() {
		for (@Pc(10) Class3_Sub3_Sub1 local10 = (Class3_Sub3_Sub1) Static236.aClass193_34.method4519(); local10 != null; local10 = (Class3_Sub3_Sub1) Static236.aClass193_34.method4525()) {
			@Pc(15) Class1_Sub2_Sub5 local15 = local10.aClass1_Sub2_Sub5_1;
			if (local15.aBoolean382) {
				local10.method6288();
				local15.method4337();
			} else if (local15.anInt5272 <= Static172.anInt3107) {
				local15.method4343(Static46.anInt814);
				if (local15.aBoolean382) {
					local10.method6288();
				} else {
					Static114.method1845(local15, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)V")
	public static void method2067(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(11, arg0);
		local8.method1006();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method2068(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static94.method1600(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(40) int local40;
			do {
				local40 = arg0.nextInt();
			} while (local40 >= local37);
			return Static368.method5131(arg1, local40);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
	public static void method2070() {
		Static176.aClass3_Sub25_Sub1_1.method2785();
		@Pc(13) int local13 = Static176.aClass3_Sub25_Sub1_1.method2783(8);
		@Pc(18) int local18;
		if (local13 < Static379.anInt6398) {
			for (local18 = local13; local18 < Static379.anInt6398; local18++) {
				Static453.anIntArray505[Static359.anInt6117++] = Static198.anIntArray225[local18];
			}
		}
		if (Static379.anInt6398 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static379.anInt6398 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(60) int local60 = Static198.anIntArray225[local18];
			@Pc(68) Class1_Sub2_Sub6_Sub1 local68 = ((Class3_Sub40) Static63.aClass140_37.method3490((long) local60)).aClass1_Sub2_Sub6_Sub1_2;
			@Pc(73) int local73 = Static176.aClass3_Sub25_Sub1_1.method2783(1);
			if (local73 == 0) {
				Static198.anIntArray225[Static379.anInt6398++] = local60;
				local68.anInt7602 = Static172.anInt3107;
			} else {
				@Pc(93) int local93 = Static176.aClass3_Sub25_Sub1_1.method2783(2);
				if (local93 == 0) {
					Static198.anIntArray225[Static379.anInt6398++] = local60;
					local68.anInt7602 = Static172.anInt3107;
					Static288.anIntArray324[Static124.anInt2278++] = local60;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local93 == 1) {
						Static198.anIntArray225[Static379.anInt6398++] = local60;
						local68.anInt7602 = Static172.anInt3107;
						local135 = Static176.aClass3_Sub25_Sub1_1.method2783(3);
						local68.method5638(local135, 1);
						local145 = Static176.aClass3_Sub25_Sub1_1.method2783(1);
						if (local145 == 1) {
							Static288.anIntArray324[Static124.anInt2278++] = local60;
						}
					} else if (local93 == 2) {
						Static198.anIntArray225[Static379.anInt6398++] = local60;
						local68.anInt7602 = Static172.anInt3107;
						if (Static176.aClass3_Sub25_Sub1_1.method2783(1) == 1) {
							local135 = Static176.aClass3_Sub25_Sub1_1.method2783(3);
							local68.method5638(local135, 2);
							local145 = Static176.aClass3_Sub25_Sub1_1.method2783(3);
							local68.method5638(local145, 2);
						} else {
							local135 = Static176.aClass3_Sub25_Sub1_1.method2783(3);
							local68.method5638(local135, 0);
						}
						local135 = Static176.aClass3_Sub25_Sub1_1.method2783(1);
						if (local135 == 1) {
							Static288.anIntArray324[Static124.anInt2278++] = local60;
						}
					} else if (local93 == 3) {
						Static453.anIntArray505[Static359.anInt6117++] = local60;
					}
				}
			}
		}
	}
}

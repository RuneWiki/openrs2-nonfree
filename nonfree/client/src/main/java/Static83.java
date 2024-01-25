import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!du", name = "m", descriptor = "Lclient!kl;")
	public static final Class137 aClass137_4 = new Class137("WTI", 5);

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	public static int anInt1823 = 0;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "[I")
	public static final int[] anIntArray147 = new int[200];

	@OriginalMember(owner = "client!du", name = "u", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method1584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class80 local7 = client.lb[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class22 local13 = local7.aClass22_2; local13 != null; local13 = local13.aClass22_1) {
			@Pc(17) Class31_Sub2 local17 = local13.aClass31_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort103 == arg1 && local17.aShort102 == arg2) {
				Static157.method3070(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I[Lclient!uq;I)V")
	public static void method1586(@OriginalArg(1) Class251[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			@Pc(10) Class251 local10 = arg0[local5];
			if (local10 != null) {
				if (local10.anInt6654 == 0) {
					if (local10.aClass251Array2 != null) {
						method1586(local10.aClass251Array2, arg1);
					}
					@Pc(34) Class1_Sub23 local34 = (Class1_Sub23) Static101.aClass96_16.method2335((long) local10.anInt6689);
					if (local34 != null) {
						Static204.method5978(local34.anInt3059, arg1);
					}
				}
				@Pc(50) Class1_Sub24 local50;
				if (arg1 == 0 && local10.anObjectArray12 != null) {
					local50 = new Class1_Sub24();
					local50.aClass251_5 = local10;
					local50.anObjectArray3 = local10.anObjectArray12;
					Static13.method366(local50);
				}
				if (arg1 == 1 && local10.anObjectArray19 != null) {
					if (local10.anInt6679 >= 0) {
						@Pc(75) Class251 local75 = Static378.method3544(local10.anInt6689);
						if (local75 == null || local75.aClass251Array2 == null || local10.anInt6679 >= local75.aClass251Array2.length || local10 != local75.aClass251Array2[local10.anInt6679]) {
							continue;
						}
					}
					local50 = new Class1_Sub24();
					local50.anObjectArray3 = local10.anObjectArray19;
					local50.aClass251_5 = local10;
					Static13.method366(local50);
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIII)I")
	public static int method1587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static301.anInt5202 < 100) {
			return -2;
		}
		@Pc(17) int local17 = -2;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(23) int local23 = arg0 - Static168.anInt432;
		@Pc(28) int local28 = arg2 - Static168.anInt430;
		for (@Pc(33) Class1_Sub26 local33 = (Class1_Sub26) Static168.aClass181_3.method4112(); local33 != null; local33 = (Class1_Sub26) Static168.aClass181_3.method4104()) {
			if (local33.anInt3922 == arg1) {
				@Pc(45) int local45 = local33.anInt3920;
				@Pc(48) int local48 = local33.anInt3924;
				@Pc(59) int local59 = local48 + Static168.anInt430 | Static168.anInt432 + local45 << 14;
				@Pc(78) int local78 = (local23 - local45) * (-local45 + local23) + (local28 - local48) * (local28 + -local48);
				if (local17 < 0 || local78 < local19) {
					local19 = local78;
					local17 = local59;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!ul;Lclient!ul;I)I")
	public static int method1588(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1) {
		@Pc(13) int local13 = 0;
		if (arg1.method5497(Static374.anInt6118)) {
			local13++;
		}
		if (arg1.method5497(Static295.anInt5134)) {
			local13++;
		}
		if (arg1.method5497(Static218.anInt4007)) {
			local13++;
		}
		if (arg0.method5497(Static374.anInt6118)) {
			local13++;
		}
		if (arg0.method5497(Static295.anInt5134)) {
			local13++;
		}
		if (arg0.method5497(Static218.anInt4007)) {
			local13++;
		}
		return local13;
	}
}

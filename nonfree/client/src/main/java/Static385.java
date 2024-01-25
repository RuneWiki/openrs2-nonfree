import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "J")
	public static long aLong198;

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "[I")
	public static int[] anIntArray465;

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
	public static int anInt6934 = -1;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Lclient!vj;")
	public static Class15 method5794() {
		try {
			return new Class15_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class15) Class.forName("Class15_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(14) Throwable local14) {
				return new Class15_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!eq;II)Lclient!kr;")
	public static Class20 method5796(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class20 local20 = (Class20) Static180.aClass233_19.method5669((long) arg1);
		if (local20 == null) {
			if (Static49.aBoolean76) {
				local20 = Static600.aClass87_15.method7969(Static647.method3064(arg0, arg1), true);
			} else {
				local20 = Static555.method7694(arg0.method2570(arg1));
			}
			Static180.aClass233_19.method5662(local20, (long) arg1);
		}
		return local20;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)V")
	public static void method5797(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19;
		if (arg1 != Static93.anInt1862) {
			Static561.anIntArray649 = new int[arg1];
			for (local19 = 0; local19 < arg1; local19++) {
				Static561.anIntArray649[local19] = (local19 << 12) / arg1;
			}
			Static603.anInt9994 = arg1 - 1;
			Static93.anInt1862 = arg1;
			Static346.anInt6409 = arg1 * 32;
		}
		if (arg0 == Static512.anInt8591) {
			return;
		}
		if (Static93.anInt1862 == arg0) {
			Static353.anIntArray424 = Static561.anIntArray649;
		} else {
			Static353.anIntArray424 = new int[arg0];
			for (local19 = 0; local19 < arg0; local19++) {
				Static353.anIntArray424[local19] = (local19 << 12) / arg0;
			}
		}
		Static512.anInt8591 = arg0;
		Static93.anInt1860 = arg0 - 1;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIII)V")
	public static void method5798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg0 - arg1;
		@Pc(12) int local12 = arg3 - arg4;
		if (local12 == 0) {
			if (local8 != 0) {
				Static6.method113(arg4, arg0, arg1, arg2);
			}
		} else if (local8 == 0) {
			Static236.method3908(arg4, arg1, arg3, arg2);
		} else {
			if (local12 < 0) {
				local12 = -local12;
			}
			if (local8 < 0) {
				local8 = -local8;
			}
			@Pc(56) boolean local56 = local8 > local12;
			@Pc(60) int local60;
			@Pc(64) int local64;
			if (local56) {
				local60 = arg4;
				arg4 = arg1;
				local64 = arg3;
				arg1 = local60;
				arg3 = arg0;
				arg0 = local64;
			}
			if (arg3 < arg4) {
				local60 = arg4;
				local64 = arg1;
				arg4 = arg3;
				arg1 = arg0;
				arg3 = local60;
				arg0 = local64;
			}
			local60 = arg1;
			local64 = arg3 - arg4;
			@Pc(97) int local97 = arg0 - arg1;
			@Pc(102) int local102 = -(local64 >> 1);
			if (local97 < 0) {
				local97 = -local97;
			}
			@Pc(118) int local118 = arg0 > arg1 ? 1 : -1;
			@Pc(122) int local122;
			if (local56) {
				for (local122 = arg4; local122 <= arg3; local122++) {
					Static618.anIntArrayArray101[local122][local60] = arg2;
					local102 += local97;
					if (local102 > 0) {
						local102 -= local64;
						local60 += local118;
					}
				}
			} else {
				for (local122 = arg4; local122 <= arg3; local122++) {
					local102 += local97;
					Static618.anIntArrayArray101[local60][local122] = arg2;
					if (local102 > 0) {
						local60 += local118;
						local102 -= local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)Lclient!gb;")
	public static Class124 method5799() {
		try {
			return (Class124) Class.forName("Class124_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
	public static void method5800() {
		if (Static253.anIntArray343 != null && Static68.anIntArray145 != null) {
			return;
		}
		Static68.anIntArray145 = new int[256];
		Static253.anIntArray343 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(27) double local27 = (double) local18 / 255.0D * 6.283185307179586D;
			Static253.anIntArray343[local18] = (int) (Math.sin(local27) * 4096.0D);
			Static68.anIntArray145[local18] = (int) (Math.cos(local27) * 4096.0D);
		}
	}
}

import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_73 = new Class376(34, -1);

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "[I")
	public static final int[] anIntArray345 = new int[32];

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "Lclient!lc;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIII)V")
	public static void method4511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(15) int local15 = arg1 - arg3;
		if (local10 == 0) {
			if (local15 != 0) {
				Static247.method3932(arg0, arg1, arg4, arg3);
			}
		} else if (local15 == 0) {
			Static342.method5169(arg0, arg3, arg4, arg2);
		} else {
			@Pc(49) int local49 = (local15 << 12) / local10;
			@Pc(58) int local58 = arg3 - (arg0 * local49 >> 12);
			@Pc(67) int local67;
			@Pc(76) int local76;
			if (Static303.anInt9951 > arg2) {
				local67 = Static303.anInt9951;
				local76 = local58 + (local49 * Static303.anInt9951 >> 12);
			} else if (Static408.anInt6951 < arg2) {
				local76 = local58 + (local49 * Static408.anInt6951 >> 12);
				local67 = Static408.anInt6951;
			} else {
				local67 = arg2;
				local76 = arg1;
			}
			@Pc(118) int local118;
			@Pc(120) int local120;
			if (arg0 < Static303.anInt9951) {
				local118 = Static303.anInt9951;
				local120 = (local49 * Static303.anInt9951 >> 12) + local58;
			} else if (arg0 <= Static408.anInt6951) {
				local118 = arg0;
				local120 = arg3;
			} else {
				local118 = Static408.anInt6951;
				local120 = (local49 * Static408.anInt6951 >> 12) + local58;
			}
			if (local120 < Static255.anInt4818) {
				local118 = (Static255.anInt4818 - local58 << 12) / local49;
				local120 = Static255.anInt4818;
			} else if (local120 > Static658.anInt10079) {
				local118 = (Static658.anInt10079 - local58 << 12) / local49;
				local120 = Static658.anInt10079;
			}
			if (Static255.anInt4818 > local76) {
				local67 = (Static255.anInt4818 - local58 << 12) / local49;
				local76 = Static255.anInt4818;
			} else if (Static658.anInt10079 < local76) {
				local76 = Static658.anInt10079;
				local67 = (Static658.anInt10079 - local58 << 12) / local49;
			}
			Static424.method6045(arg4, local76, local67, local118, local120);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	public static void method4512(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub6_Sub12 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class104 local8 = Static239.aClass104Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static315.anInt5894; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static410.anInt6962; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static436.anInt7634;
							@Pc(32) int local32 = local12 << Static436.anInt7634;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class104 local41 = Static239.aClass104Array1[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method8279(local12, local15) - local41.method8279(local12, local15);
									@Pc(71) int local71 = local8.method8279(local12, local15 + 1) - local41.method8279(local12, local15 + 1);
									@Pc(91) int local91 = local8.method8279(local12 + 1, local15 + 1) - local41.method8279(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method8279(local12 + 1, local15) - local41.method8279(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}

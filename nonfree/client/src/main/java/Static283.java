import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Z")
	public static boolean aBoolean384;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	public static int anInt5199;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
	public static int anInt5203;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!gp;")
	public static final Class87 aClass87_17 = new Class87(9, 7);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([Lclient!eo;II)V")
	public static void method4160(@OriginalArg(0) Class68[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class68 local9 = arg0[local3];
			if (local9 != null && arg1 == local9.anInt2225 && !Static56.method1156(local9)) {
				if (local9.anInt2182 == 0) {
					method4160(arg0, local9.anInt2177);
					if (local9.aClass68Array2 != null) {
						method4160(local9.aClass68Array2, local9.anInt2177);
					}
					@Pc(46) Class3_Sub40 local46 = (Class3_Sub40) Static30.aClass127_3.method3246((long) local9.anInt2177);
					if (local46 != null) {
						Static83.method1452(local46.anInt6668);
					}
				}
				if (local9.anInt2182 == 6 && local9.anInt2205 != -1) {
					@Pc(67) Class96 local67 = Static196.aClass30_2.method942(local9.anInt2205);
					if (local67 != null) {
						local9.anInt2152 += Static429.anInt7317;
						while (local67.anIntArray254[local9.anInt2139] < local9.anInt2152) {
							local9.anInt2152 -= local67.anIntArray254[local9.anInt2139];
							local9.anInt2139++;
							if (local67.anIntArray253.length <= local9.anInt2139) {
								local9.anInt2139 -= local67.anInt3329;
								if (local9.anInt2139 < 0 || local67.anIntArray253.length <= local9.anInt2139) {
									local9.anInt2139 = 0;
								}
							}
							local9.anInt2216 = local9.anInt2139 + 1;
							if (local9.anInt2216 >= local67.anIntArray253.length) {
								local9.anInt2216 -= local67.anInt3329;
								if (local9.anInt2216 < 0 || local67.anIntArray253.length <= local9.anInt2216) {
									local9.anInt2216 = -1;
								}
							}
							Static442.method5899(local9);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII)I")
	public static int method4161(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static325.aByteArrayArrayArray15[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static325.aByteArrayArrayArray15[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
	public static void method4165(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub3_Sub4 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class64 local8 = Static205.aClass64Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static57.anInt1411; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static177.anInt3621; local15++) {
						local1 = local8.O(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static287.anInt5248;
							@Pc(32) int local32 = local12 << Static287.anInt5248;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class64 local41 = Static205.aClass64Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.I(local15, local12) - local41.I(local15, local12);
									@Pc(67) int local67 = local8.I(local15 + 1, local12) - local41.I(local15 + 1, local12);
									@Pc(85) int local85 = local8.I(local15 + 1, local12 + 1) - local41.I(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.I(local15, local12 + 1) - local41.I(local15, local12 + 1);
									local41.SA(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}

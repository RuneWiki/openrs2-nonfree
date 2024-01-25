import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
	public static int anInt208;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
	public static int anInt204 = 0;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "[Lclient!qi;")
	public static final Class200[] aClass200Array1 = new Class200[4];

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_3 = new Class11(42, 3);

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "Z")
	public static boolean aBoolean21 = true;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIII)V")
	public static void method144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static93.method1862(arg1, Static40.anInt818, Static138.anInt932);
		@Pc(17) int local17 = Static93.method1862(arg6, Static40.anInt818, Static138.anInt932);
		@Pc(23) int local23 = Static93.method1862(arg0, Static235.anInt4193, Static243.anInt4326);
		@Pc(33) int local33 = Static93.method1862(arg3, Static235.anInt4193, Static243.anInt4326);
		@Pc(41) int local41 = Static93.method1862(arg1 + arg5, Static40.anInt818, Static138.anInt932);
		@Pc(49) int local49 = Static93.method1862(arg6 - arg5, Static40.anInt818, Static138.anInt932);
		for (@Pc(51) int local51 = local11; local51 < local41; local51++) {
			Static315.method4662(local33, Static15.anIntArrayArray1[local51], local23, arg4);
		}
		for (@Pc(71) int local71 = local17; local71 > local49; local71--) {
			Static315.method4662(local33, Static15.anIntArrayArray1[local71], local23, arg4);
		}
		@Pc(97) int local97 = Static93.method1862(arg5 + arg0, Static235.anInt4193, Static243.anInt4326);
		@Pc(106) int local106 = Static93.method1862(arg3 - arg5, Static235.anInt4193, Static243.anInt4326);
		for (@Pc(108) int local108 = local41; local108 <= local49; local108++) {
			@Pc(114) int[] local114 = Static15.anIntArrayArray1[local108];
			Static315.method4662(local97, local114, local23, arg4);
			Static315.method4662(local106, local114, local97, arg2);
			Static315.method4662(local33, local114, local106, arg4);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZBZ)V")
	public static void method145(@OriginalArg(0) boolean arg0) {
		Static102.anInt2132--;
		if (Static102.anInt2132 == 0) {
			Static214.anIntArray762 = null;
		}
		if (arg0) {
			Static131.anInt2688--;
			if (Static131.anInt2688 == 0) {
				Static298.anIntArray1009 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I")
	public static int method147(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(II)I")
	public static int method148(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(26) int local26 = local16 | local16 >>> 4;
		@Pc(32) int local32 = local26 | local26 >>> 8;
		@Pc(38) int local38 = local32 | local32 >>> 16;
		return local38 + 1;
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(II)I")
	public static int method149(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[BIIII)Z")
	public static boolean method151(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) boolean local15 = true;
		@Pc(20) Class2_Sub16 local20 = new Class2_Sub16(arg0);
		@Pc(22) int local22 = -1;
		label68: while (true) {
			@Pc(26) int local26 = local20.method5319();
			if (local26 == 0) {
				return local15;
			}
			local22 += local26;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(66) int local66;
				@Pc(100) Class172 local100;
				do {
					@Pc(70) int local70;
					@Pc(74) int local74;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local20.method5311();
										if (local42 == 0) {
											continue label68;
										}
										local20.method5350();
									}
									local42 = local20.method5311();
									if (local42 == 0) {
										continue label68;
									}
									local34 += local42 - 1;
									@Pc(54) int local54 = local34 & 0x3F;
									@Pc(60) int local60 = local34 >> 6 & 0x3F;
									local66 = local20.method5350() >> 2;
									local70 = local60 + arg3;
									local74 = local54 + arg2;
								} while (local70 <= 0);
							} while (local74 <= 0);
						} while (local70 >= arg1 - 1);
					} while (arg4 - 1 <= local74);
					local100 = Static221.aClass118_6.method2858(local22);
				} while (local66 == 22 && !Static349.aBoolean351 && local100.anInt4140 == 0 && local100.anInt4108 != 1 && !local100.aBoolean321);
				local36 = true;
				if (!local100.method3783()) {
					Static162.anInt3139++;
					local15 = false;
				}
			}
		}
	}
}

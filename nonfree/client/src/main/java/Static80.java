import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!da", name = "b", descriptor = "I")
	public static final int anInt9683 = 1338;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	public static int anInt9684 = 0;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
	public static void method7914() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static339.aClass127Array1.length; local3++) {
				if (Static339.aClass127Array1[local3].method3182()) {
					Static394.aLongArray13[local3] = Static339.aClass127Array1[local3].method3181();
				} else {
					synchronized (Static339.aClass127Array1[local3]) {
						Static339.aClass127Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static339.aClass127Array1[Static339.aClass127Array1.length - 1].method3179();
				Static246.method3955(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static339.aClass127Array1.length - 1; local3++) {
						if (!Static339.aClass127Array1[local3].method3182()) {
							synchronized (Static339.aClass127Array1[local3]) {
								Static339.aClass127Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static339.aClass127Array1.length - 2; local102++) {
							Static339.aClass127Array1[local102].method3179();
						}
						Static246.method3955(2);
						while (!Static339.aClass127Array1[0].method3182()) {
							synchronized (Static339.aClass127Array1[0]) {
								Static339.aClass127Array1[0].notify();
							}
							try {
								Static63.method1019(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static339.aClass127Array1[0].method3179();
						return;
					}
					try {
						Static63.method1019(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static63.method1019(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ii;Lclient!ii;B)V")
	public static void method7918(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1) {
		if (arg1.aClass4_286 != null) {
			arg1.method8379();
		}
		arg1.aClass4_286 = arg0.aClass4_286;
		arg1.aClass4_285 = arg0;
		arg1.aClass4_286.aClass4_285 = arg1;
		arg1.aClass4_285.aClass4_286 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	public static void method7921() {
		Static190.method3335();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method7923() {
		if (!Static552.aBoolean689) {
			return;
		}
		while (true) {
			while (Static318.anInt6249 < Static5.aClass158_Sub1Array1.length) {
				@Pc(35) Class158_Sub1 local35 = Static5.aClass158_Sub1Array1[Static318.anInt6249];
				if (local35 != null && local35.anInt4061 == -1) {
					if (Static360.aClass4_Sub42_1 == null) {
						Static360.aClass4_Sub42_1 = Static282.aClass317_2.method7507(local35.aString45);
					}
					@Pc(58) int local58 = Static360.aClass4_Sub42_1.anInt8816;
					if (local58 == -1) {
						return;
					}
					local35.anInt4061 = local58;
					Static318.anInt6249++;
					Static360.aClass4_Sub42_1 = null;
				} else {
					Static318.anInt6249++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg3 == arg4 && arg2 == arg7 && arg1 == arg8 && arg5 == arg0) {
			Static547.method7952(arg8, arg4, arg0, arg2, arg6);
			return;
		}
		@Pc(36) int local36 = arg4;
		@Pc(38) int local38 = arg2;
		@Pc(42) int local42 = arg4 * 3;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(50) int local50 = arg3 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg1 * 3;
		@Pc(62) int local62 = arg5 * 3;
		@Pc(72) int local72 = arg8 + local50 - arg4 - local58;
		@Pc(81) int local81 = local54 + arg0 - local62 - arg2;
		@Pc(91) int local91 = local58 + local42 - local50 - local50;
		@Pc(101) int local101 = local46 + local62 - local54 - local54;
		@Pc(105) int local105 = local50 - local42;
		@Pc(109) int local109 = local54 - local46;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(119) int local119 = local111 * local111 >> 12;
			@Pc(125) int local125 = local119 * local111 >> 12;
			@Pc(129) int local129 = local72 * local125;
			@Pc(133) int local133 = local81 * local125;
			@Pc(137) int local137 = local119 * local91;
			@Pc(141) int local141 = local101 * local119;
			@Pc(145) int local145 = local111 * local105;
			@Pc(149) int local149 = local111 * local109;
			@Pc(160) int local160 = (local129 + local137 + local145 >> 12) + arg4;
			@Pc(170) int local170 = arg2 + (local149 + local141 + local133 >> 12);
			Static547.method7952(local160, local36, local170, local38, arg6);
			local36 = local160;
			local38 = local170;
		}
	}
}

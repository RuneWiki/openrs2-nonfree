import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!ku", name = "D", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!ku", name = "y", descriptor = "[I")
	public static final int[] anIntArray315 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(II)V")
	public static void method4361(@OriginalArg(1) int arg0) {
		Static537.anInt9039 = arg0;
		Static468.aClass326_46.method7230();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "()V")
	public static void method4364() {
		for (@Pc(1) int local1 = 0; local1 < Static64.anInt1565; local1++) {
			if (!Static503.aBooleanArray26[local1]) {
				@Pc(10) Class237 local10 = Static502.aClass237Array1[local1];
				@Pc(13) Class1_Sub5 local13 = local10.aClass1_Sub5_1;
				@Pc(16) int local16 = local10.anInt6651;
				@Pc(22) int local22 = local13.method4162() - Static159.anInt2896;
				@Pc(30) int local30 = (local22 * 2 >> Static378.anInt6665) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method4159() - local22 >> Static378.anInt6665;
				@Pc(53) int local53 = local13.method4158() - local22 >> Static378.anInt6665;
				@Pc(61) int local61 = local13.method4158() + local22 >> Static378.anInt6665;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static218.anInt4229) {
					local61 = Static218.anInt4229 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray78[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static446.anInt7725) {
						local108 = Static446.anInt7725 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class20_Sub2_Sub4 local141 = Static18.method537(local16, local125, local78, rc.class);
						if (local141 != null && local141.aByte113 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte113 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray78[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray78[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray78[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray78[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static503.aBooleanArray26[local1] = true;
				Static20.aClass17Array1[local16].method6640(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILclient!ua;ILjava/lang/String;Lclient!la;Lclient!wv;IIIIILclient!aga;)V")
	public static void method4365(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) Class35 arg4, @OriginalArg(5) Class365 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class13 arg10) {
		@Pc(15) int local15;
		if (Static585.anInt9461 == 4) {
			local15 = (int) Static143.aFloat61 & 0x3FFF;
		} else {
			local15 = (int) Static143.aFloat61 + Static368.anInt6520 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg5.anInt9578 / 2, arg5.anInt9638 / 2) + 10;
		@Pc(43) int local43 = arg2 * arg2 + arg6 * arg6;
		if (local43 > local34 * local34) {
			return;
		}
		@Pc(57) int local57 = Class151.anIntArray244[local15];
		@Pc(66) int local66 = Class151.anIntArray245[local15];
		if (Static585.anInt9461 != 4) {
			local57 = local57 * 256 / (Static536.anInt8845 + 256);
			local66 = local66 * 256 / (Static536.anInt8845 + 256);
		}
		@Pc(97) int local97 = arg2 * local66 + arg6 * local57 >> 14;
		@Pc(108) int local108 = arg6 * local66 - arg2 * local57 >> 14;
		@Pc(115) int local115 = arg10.method466(null, 100, arg3);
		@Pc(123) int local123 = arg10.method457(0, 100, arg3, null);
		@Pc(129) int local129 = local97 - local115 / 2;
		if (-arg5.anInt9578 <= local129 && arg5.anInt9578 >= local129 && local108 >= -arg5.anInt9638 && arg5.anInt9638 >= local108) {
			arg4.method4952(local115, arg5.anInt9638 / 2 + arg0 - local123 - arg9 - local108, null, arg3, arg1, 0, arg0, arg7, 50, 0, arg8, null, arg5.anInt9578 / 2 + local129 + arg7, 0, 1);
		}
	}
}

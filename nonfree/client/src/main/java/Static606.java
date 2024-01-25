import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!vo", name = "Qb", descriptor = "Lclient!eh;")
	public static final Class49 aClass49_1 = Static170.method2650();

	@OriginalMember(owner = "client!vo", name = "bc", descriptor = "Lclient!ew;")
	public static final Class98 aClass98_50 = new Class98("", 11);

	@OriginalMember(owner = "client!vo", name = "ic", descriptor = "[Lclient!lk;")
	public static final Class5_Sub5_Sub12[] aClass5_Sub5_Sub12Array5 = new Class5_Sub5_Sub12[14];

	@OriginalMember(owner = "client!vo", name = "xc", descriptor = "[I")
	public static final int[] anIntArray584 = new int[2];

	@OriginalMember(owner = "client!vo", name = "zc", descriptor = "I")
	public static int anInt10177 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIBIIIIIII)Z")
	public static boolean method8668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static176.method2703(arg0, arg6, arg2)) {
			return false;
		}
		@Pc(15) int local15 = Static75.anIntArray109[1];
		@Pc(19) int local19 = Static75.anIntArray109[0];
		@Pc(23) int local23 = Static75.anIntArray109[2];
		if (!Static176.method2703(arg5, arg1, arg8)) {
			return false;
		}
		@Pc(35) int local35 = Static75.anIntArray109[1];
		@Pc(39) int local39 = Static75.anIntArray109[0];
		@Pc(43) int local43 = Static75.anIntArray109[2];
		if (Static176.method2703(arg3, arg4, arg7)) {
			@Pc(70) int local70 = Static75.anIntArray109[0];
			@Pc(74) int local74 = Static75.anIntArray109[2];
			@Pc(78) int local78 = Static75.anIntArray109[1];
			return Static174.method2692(local15, local35, local23, local78, local70, local74, local39, local19, local43);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!jf;)V")
	public static void method8670(@OriginalArg(0) Class174 arg0) {
		if (Static461.anInt7766 >= 65535) {
			return;
		}
		@Pc(6) Class5_Sub11 local6 = arg0.aClass5_Sub11_2;
		Static278.aClass174Array1[Static461.anInt7766] = arg0;
		Static560.aBooleanArray26[Static461.anInt7766] = false;
		Static461.anInt7766++;
		@Pc(21) int local21 = arg0.anInt4603;
		if (arg0.aBoolean328) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt4603;
		if (arg0.aBoolean327) {
			local29 = Static68.anInt1380 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method8098() + Static147.anInt2575 - local6.method8099() >> Static115.anInt2156;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method8098() + local6.method8099() - Static147.anInt2575 >> Static115.anInt2156;
			if (local73 >= Static429.anInt7422) {
				local73 = Static429.anInt7422 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray60[local41++];
				@Pc(105) int local105 = (local6.method8103() + Static147.anInt2575 - local6.method8099() >> Static115.anInt2156) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static357.anInt5961) {
					local113 = Static357.anInt5961 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static26.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static26.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static461.anInt7766;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static26.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static461.anInt7766 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static26.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static461.anInt7766 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static26.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static461.anInt7766 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
	public static void method8671(@OriginalArg(1) int arg0) {
		if (Static10.anInt220 == 1) {
			Static104.anInt2011 = arg0;
		} else if (Static10.anInt220 == 2) {
			Static15.anInt244 = arg0;
		}
	}
}

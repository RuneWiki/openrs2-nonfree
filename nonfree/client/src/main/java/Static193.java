import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!jj", name = "G", descriptor = "Lclient!qs;")
	public static Class211 aClass211_50;

	@OriginalMember(owner = "client!jj", name = "P", descriptor = "Lclient!fl;")
	public static Class31 aClass31_2;

	@OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
	public static int anInt4033 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILjava/lang/Object;I)[B")
	public static byte[] method3127(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static378.method5230(local13, arg0);
		} else if (arg1 instanceof Class19) {
			@Pc(25) Class19 local25 = (Class19) arg1;
			return local25.method5153(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/Object;ILclient!nv;)V")
	public static void method3128(@OriginalArg(0) Object arg0, @OriginalArg(2) Class183 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg1.anEventQueue1.peekEvent() != null; local16++) {
			Static289.method4249(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!qs;B)V")
	public static void method3129(@OriginalArg(0) Class211 arg0) {
		Static306.aClass211_72 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!ol;Z)Z")
	public static boolean method3130(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static396.aClass96Array5 == Static221.aClass96Array4;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5726();
		if (arg0.aShort104 < 0 || arg0.aShort103 < 0 || arg0.aShort105 >= Static216.anInt4346 || arg0.aShort102 >= Static198.anInt7949) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort104; local34 <= arg0.aShort105; local34++) {
			for (local38 = arg0.aShort103; local38 <= arg0.aShort102; local38++) {
				@Pc(45) Class252 local45 = Static412.method5598(arg0.aByte102, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort104) {
						local49++;
					}
					if (local34 < arg0.aShort105) {
						local49 += 4;
					}
					if (local38 > arg0.aShort103) {
						local49 += 8;
					}
					if (local38 < arg0.aShort102) {
						local49 += 2;
					}
					@Pc(74) Class208 local74 = Static326.method4623(arg0, local49);
					@Pc(77) Class208 local77 = local45.aClass208_3;
					if (local77 == null) {
						local45.aClass208_3 = local74;
					} else {
						while (local77.aClass208_2 != null) {
							local77 = local77.aClass208_2;
						}
						local77.aClass208_2 = local74;
					}
					local45.aByte98 = (byte) (local45.aByte98 | local49);
					if (local6 && (Static360.anIntArrayArray52[local34][local38] & 0xFF000000) != 0) {
						local8 = Static360.anIntArrayArray52[local34][local38];
						local10 = Static372.aShortArrayArray6[local34][local38];
						local12 = Static383.aByteArrayArray22[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort104; local38 <= arg0.aShort105; local38++) {
				for (@Pc(150) int local150 = arg0.aShort103; local150 <= arg0.aShort102; local150++) {
					if ((Static360.anIntArrayArray52[local38][local150] & 0xFF000000) == 0) {
						Static360.anIntArrayArray52[local38][local150] = local8;
						Static372.aShortArrayArray6[local38][local150] = local10;
						Static383.aByteArrayArray22[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static268.aClass30_Sub1Array3[Static12.anInt184++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method3131(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg1 && arg0 == arg8 && arg7 == arg5 && arg6 == arg3) {
			Static310.method4463(arg2, arg6, arg8, arg4, arg5);
			return;
		}
		@Pc(17) int local17 = arg4;
		@Pc(19) int local19 = arg8;
		@Pc(23) int local23 = arg4 * 3;
		@Pc(27) int local27 = arg8 * 3;
		@Pc(31) int local31 = arg1 * 3;
		@Pc(35) int local35 = arg0 * 3;
		@Pc(39) int local39 = arg7 * 3;
		@Pc(43) int local43 = arg3 * 3;
		@Pc(51) int local51 = arg5 + local31 - local39 - arg4;
		@Pc(61) int local61 = arg6 + local35 - local43 - arg8;
		@Pc(71) int local71 = local23 + local39 - local31 - local31;
		@Pc(81) int local81 = local43 + local27 - local35 - local35;
		@Pc(86) int local86 = local31 - local23;
		@Pc(91) int local91 = local35 - local27;
		for (@Pc(93) int local93 = 128; local93 <= 4096; local93 += 128) {
			@Pc(100) int local100 = local93 * local93 >> 12;
			@Pc(106) int local106 = local100 * local93 >> 12;
			@Pc(110) int local110 = local51 * local106;
			@Pc(114) int local114 = local106 * local61;
			@Pc(118) int local118 = local100 * local71;
			@Pc(122) int local122 = local100 * local81;
			@Pc(126) int local126 = local86 * local93;
			@Pc(130) int local130 = local93 * local91;
			@Pc(140) int local140 = arg4 + (local126 + local118 + local110 >> 12);
			@Pc(151) int local151 = (local122 + local114 + local130 >> 12) + arg8;
			Static310.method4463(arg2, local151, local19, local17, local140);
			local17 = local140;
			local19 = local151;
		}
	}
}

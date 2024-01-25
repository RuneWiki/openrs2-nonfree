import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_152 = new Class163(50, 18);

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "[I")
	public static final int[] anIntArray377 = new int[14];

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_153 = new Class163(81, -1);

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "[I")
	public static final int[] anIntArray378 = new int[14];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIZIIII)V")
	public static void method5050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg3 && arg7 == arg4 && arg2 == arg0 && arg8 == arg1) {
			Static460.method6240(arg6, arg4, arg0, arg5, arg1);
			return;
		}
		@Pc(37) int local37 = arg5;
		@Pc(39) int local39 = arg4;
		@Pc(43) int local43 = arg5 * 3;
		@Pc(47) int local47 = arg4 * 3;
		@Pc(51) int local51 = arg3 * 3;
		@Pc(55) int local55 = arg7 * 3;
		@Pc(59) int local59 = arg2 * 3;
		@Pc(63) int local63 = arg8 * 3;
		@Pc(73) int local73 = arg0 + local51 - local59 - arg5;
		@Pc(81) int local81 = arg1 + local55 - local63 - arg4;
		@Pc(91) int local91 = local43 + local59 - local51 - local51;
		@Pc(102) int local102 = local63 + local47 - local55 - local55;
		@Pc(107) int local107 = local51 - local43;
		@Pc(112) int local112 = local55 - local47;
		for (@Pc(114) int local114 = 128; local114 <= 4096; local114 += 128) {
			@Pc(122) int local122 = local114 * local114 >> 12;
			@Pc(128) int local128 = local122 * local114 >> 12;
			@Pc(132) int local132 = local128 * local73;
			@Pc(136) int local136 = local81 * local128;
			@Pc(140) int local140 = local91 * local122;
			@Pc(144) int local144 = local102 * local122;
			@Pc(148) int local148 = local107 * local114;
			@Pc(152) int local152 = local114 * local112;
			@Pc(162) int local162 = (local140 + local132 + local148 >> 12) + arg5;
			@Pc(172) int local172 = arg4 + (local144 + local136 + local152 >> 12);
			Static460.method6240(arg6, local39, local162, local37, local172);
			local39 = local172;
			local37 = local162;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IC)Z")
	public static boolean method5051(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static375.method5236(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static392.aCharArray7;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (arg0 == local26) {
					return true;
				}
			}
			@Pc(43) char[] local43 = Static286.aCharArray5;
			for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
				@Pc(51) char local51 = local43[local45];
				if (arg0 == local51) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIILclient!jw;)V")
	public static void method5052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub4 arg3) {
		@Pc(4) Class227 local4 = method5054(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub4_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)Lclient!sn;")
	public static Class227 method5054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static389.aClass227ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static389.aClass227ArrayArrayArray3[0][arg1][arg2] != null && Static389.aClass227ArrayArrayArray3[0][arg1][arg2].aClass227_1 != null;
			if (local28 && arg0 >= Static174.anInt3263 - 1) {
				return null;
			}
			Static15.method314(arg0, arg1, arg2);
		}
		return Static389.aClass227ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)[Lclient!fg;")
	public static Class70[] method5055() {
		return new Class70[] { Static251.aClass70_20, Static139.aClass70_11, Static124.aClass70_9, Static372.aClass70_19, Static194.aClass70_15, Static106.aClass70_18, Static246.aClass70_16, Static425.aClass70_8, Static165.aClass70_10, Static311.aClass70_17, Static7.aClass70_6, Static441.aClass70_21, Static105.aClass70_4, Static166.aClass70_14 };
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IB)Z")
	public static boolean method5056(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}
}

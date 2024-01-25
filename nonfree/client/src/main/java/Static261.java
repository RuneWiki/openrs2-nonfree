import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
	public static int anInt948 = -1;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_15 = new Class217(70, 8);

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_16 = new Class217(0, 3);

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_17 = new Class217(60, -1);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg5 && arg1 == arg3 && arg6 == arg8 && arg7 == arg0) {
			Static116.method4221(arg6, arg3, arg7, arg2, arg4);
			return;
		}
		@Pc(29) int local29 = arg2;
		@Pc(31) int local31 = arg3;
		@Pc(35) int local35 = arg2 * 3;
		@Pc(39) int local39 = arg3 * 3;
		@Pc(43) int local43 = arg5 * 3;
		@Pc(47) int local47 = arg1 * 3;
		@Pc(51) int local51 = arg8 * 3;
		@Pc(55) int local55 = arg0 * 3;
		@Pc(64) int local64 = local43 + arg6 - local51 - arg2;
		@Pc(73) int local73 = arg7 + local47 - local55 - arg3;
		@Pc(82) int local82 = local35 + local51 - local43 - local43;
		@Pc(92) int local92 = local39 + local55 - local47 - local47;
		@Pc(97) int local97 = local43 - local35;
		@Pc(101) int local101 = local47 - local39;
		for (@Pc(103) int local103 = 128; local103 <= 4096; local103 += 128) {
			@Pc(110) int local110 = local103 * local103 >> 12;
			@Pc(116) int local116 = local110 * local103 >> 12;
			@Pc(120) int local120 = local116 * local64;
			@Pc(124) int local124 = local73 * local116;
			@Pc(128) int local128 = local110 * local82;
			@Pc(132) int local132 = local92 * local110;
			@Pc(136) int local136 = local97 * local103;
			@Pc(140) int local140 = local103 * local101;
			@Pc(151) int local151 = arg2 + (local128 + local120 + local136 >> 12);
			@Pc(163) int local163 = (local124 + local132 + local140 >> 12) + arg3;
			Static116.method4221(local151, local31, local163, local29, arg4);
			local31 = local163;
			local29 = local151;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!mq;I)V")
	public static void method660(@OriginalArg(0) int arg0, @OriginalArg(2) Class156 arg1, @OriginalArg(3) int arg2) {
		Static233.aClass156_6 = arg1;
		Static24.anInt845 = arg2;
		Static369.anInt6219 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZILclient!li;I)Ljava/awt/Frame;")
	public static Frame method661(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class143 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method3393()) {
			return null;
		}
		@Pc(18) Class136[] local18 = Static199.method3129(arg2);
		if (local18 == null) {
			return null;
		}
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < local18.length; local26++) {
			if (arg3 == local18[local26].anInt4114 && arg0 == local18[local26].anInt4110 && (!local24 || arg1 < local18[local26].anInt4113)) {
				arg1 = local18[local26].anInt4113;
				local24 = true;
			}
		}
		if (!local24) {
			return null;
		}
		@Pc(91) Class43 local91 = arg2.method3386(arg3, arg1, arg0);
		while (local91.anInt1521 == 0) {
			Static360.method4758(10L);
		}
		@Pc(106) Frame local106 = (Frame) local91.anObject3;
		if (local106 == null) {
			return null;
		} else if (local91.anInt1521 == 2) {
			Static225.method3375(arg2, local106);
			return null;
		} else {
			return local106;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZI)Z")
	public static boolean method664(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}

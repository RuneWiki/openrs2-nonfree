import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!rja", name = "l", descriptor = "I")
	public static int anInt8747;

	// $FF: synthetic field
	@OriginalMember(owner = "client!rja", name = "f", descriptor = "Ljava/lang/Class;")
	private static Class aClass24;

	@OriginalMember(owner = "client!rja", name = "i", descriptor = "Lclient!el;")
	public static final Class109 aClass109_182 = new Class109(45, 2);

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method7487(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			@Pc(27) char local27 = arg0.charAt(local19);
			if (local27 == '<' || local27 == '>') {
				local10 += 3;
			}
		}
		@Pc(51) StringBuffer local51 = new StringBuffer(local10 + local8);
		for (@Pc(55) int local55 = 0; local55 < local8; local55++) {
			@Pc(63) char local63 = arg0.charAt(local55);
			if (local63 == '<') {
				local51.append("<lt>");
			} else if (local63 == '>') {
				local51.append("<gt>");
			} else {
				local51.append(local63);
			}
		}
		return local51.toString();
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(IIBI[FIFIF[FIIFI)V")
	public static void method7489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11, @OriginalArg(13) int arg12) {
		@Pc(5) int local5 = arg1 - arg10;
		@Pc(9) int local9 = arg6 - arg9;
		@Pc(17) int local17 = arg12 - arg0;
		@Pc(43) float local43 = arg8[0] * (float) local17 + (float) local5 * arg8[1] + (float) local9 * arg8[2];
		@Pc(64) float local64 = arg8[5] * (float) local9 + (float) local17 * arg8[3] + arg8[4] * (float) local5;
		@Pc(85) float local85 = arg8[8] * (float) local9 + arg8[7] * (float) local5 + arg8[6] * (float) local17;
		@Pc(125) float local125;
		@Pc(132) float local132;
		if (arg4 == 0) {
			local132 = arg11 + 0.5F - local85;
			local125 = local43 + arg7 + 0.5F;
		} else if (arg4 == 1) {
			local132 = local85 + arg11 + 0.5F;
			local125 = local43 + arg7 + 0.5F;
		} else if (arg4 == 2) {
			local125 = arg7 + 0.5F - local43;
			local132 = arg5 + 0.5F - local64;
		} else if (arg4 == 3) {
			local125 = arg7 + local43 + 0.5F;
			local132 = arg5 + 0.5F - local64;
		} else if (arg4 == 4) {
			local125 = local85 + arg11 + 0.5F;
			local132 = arg5 + 0.5F - local64;
		} else {
			local125 = arg11 + 0.5F - local85;
			local132 = arg5 + 0.5F - local64;
		}
		@Pc(212) float local212;
		if (arg2 == 1) {
			local212 = local125;
			local125 = -local132;
			local132 = local212;
		} else if (arg2 == 2) {
			local125 = -local125;
			local132 = -local132;
		} else if (arg2 == 3) {
			local212 = local125;
			local125 = local132;
			local132 = -local212;
		}
		arg3[0] = local125;
		arg3[1] = local132;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(ZLclient!mca;)[Lclient!pi;")
	public static Class277[] method7490(@OriginalArg(1) Class230 arg0) {
		if (!arg0.method5347()) {
			return new Class277[0];
		}
		@Pc(26) Class366 local26 = arg0.method5345();
		while (local26.anInt10206 == 0) {
			Static351.method5279(10L);
		}
		if (local26.anInt10206 == 2) {
			return new Class277[0];
		}
		@Pc(52) int[] local52 = (int[]) local26.anObject18;
		@Pc(58) Class277[] local58 = new Class277[local52.length >> 2];
		for (@Pc(60) int local60 = 0; local60 < local58.length; local60++) {
			@Pc(66) Class277 local66 = new Class277();
			local58[local60] = local66;
			local66.anInt7756 = local52[local60 << 2];
			local66.anInt7753 = local52[(local60 << 2) + 1];
			local66.anInt7754 = local52[(local60 << 2) + 2];
			local66.anInt7752 = local52[(local60 << 2) + 3];
		}
		return local58;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method7491(@OriginalArg(0) String arg0) {
		return Static318.method4841(aClass24 == null ? (aClass24 = Class306.a("qi")) : aClass24, arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "Lclient!ta;")
	public static Class56 aClass56_4;

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "[F")
	public static final float[] aFloatArray48 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[Lclient!fca;Z)V")
	public static void method5957(@OriginalArg(0) int arg0, @OriginalArg(1) Class97[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class97 local13 = arg1[local7];
			if (local13 != null) {
				if (local13.anInt2264 == 0) {
					if (local13.aClass97Array1 != null) {
						method5957(arg0, local13.aClass97Array1);
					}
					@Pc(34) Class6_Sub31 local34 = (Class6_Sub31) Static564.aClass212_39.method5106((long) local13.anInt2311);
					if (local34 != null) {
						Static529.method7376(arg0, local34.anInt4563);
					}
				}
				@Pc(50) Class6_Sub36 local50;
				if (arg0 == 0 && local13.anObjectArray7 != null) {
					local50 = new Class6_Sub36();
					local50.anObjectArray34 = local13.anObjectArray7;
					local50.aClass97_7 = local13;
					Static100.method1639(local50);
				}
				if (arg0 == 1 && local13.anObjectArray12 != null) {
					if (local13.lb >= 0) {
						@Pc(76) Class97 local76 = Static133.method4068(local13.anInt2311);
						if (local76 == null || local76.aClass97Array1 == null || local76.aClass97Array1.length <= local13.lb || local76.aClass97Array1[local13.lb] != local13) {
							continue;
						}
					}
					local50 = new Class6_Sub36();
					local50.aClass97_7 = local13;
					local50.anObjectArray34 = local13.anObjectArray12;
					Static100.method1639(local50);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method5959(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local18] = (byte) local24;
			} else if (local24 == '€') {
				local11[local18] = -128;
			} else if (local24 == '‚') {
				local11[local18] = -126;
			} else if (local24 == 'ƒ') {
				local11[local18] = -125;
			} else if (local24 == '„') {
				local11[local18] = -124;
			} else if (local24 == '…') {
				local11[local18] = -123;
			} else if (local24 == '†') {
				local11[local18] = -122;
			} else if (local24 == '‡') {
				local11[local18] = -121;
			} else if (local24 == 'ˆ') {
				local11[local18] = -120;
			} else if (local24 == '‰') {
				local11[local18] = -119;
			} else if (local24 == 'Š') {
				local11[local18] = -118;
			} else if (local24 == '‹') {
				local11[local18] = -117;
			} else if (local24 == 'Œ') {
				local11[local18] = -116;
			} else if (local24 == 'Ž') {
				local11[local18] = -114;
			} else if (local24 == '‘') {
				local11[local18] = -111;
			} else if (local24 == '’') {
				local11[local18] = -110;
			} else if (local24 == '“') {
				local11[local18] = -109;
			} else if (local24 == '”') {
				local11[local18] = -108;
			} else if (local24 == '•') {
				local11[local18] = -107;
			} else if (local24 == '–') {
				local11[local18] = -106;
			} else if (local24 == '—') {
				local11[local18] = -105;
			} else if (local24 == '˜') {
				local11[local18] = -104;
			} else if (local24 == '™') {
				local11[local18] = -103;
			} else if (local24 == 'š') {
				local11[local18] = -102;
			} else if (local24 == '›') {
				local11[local18] = -101;
			} else if (local24 == 'œ') {
				local11[local18] = -100;
			} else if (local24 == 'ž') {
				local11[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local18] = -97;
			} else {
				local11[local18] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIBIIII)V")
	public static void method5961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < 1 || arg3 < 1 || Static301.anInt4912 - 2 < arg0 || arg3 > Static473.anInt7969 - 2) {
			return;
		}
		@Pc(32) int local32 = arg7;
		if (arg7 < 3 && Static26.method401(arg3, arg0)) {
			local32 = arg7 + 1;
		}
		if (!Static480.aClass6_Sub37_Sub1_1.method5165(Static567.anInt9503) && !Static355.method5298(local32, arg0, arg3, Static356.anInt6242)) {
			return;
		}
		if (Static208.aClass9ArrayArrayArray3 == null) {
			return;
		}
		Static416.aClass193_Sub1_2.method4191(arg7, Static296.aClass295Array3[arg7], arg3, Static176.aClass121_5, arg0, arg1);
		if (arg4 < 0) {
			return;
		}
		@Pc(73) boolean local73 = Static480.aClass6_Sub37_Sub1_1.aBoolean402;
		Static480.aClass6_Sub37_Sub1_1.aBoolean402 = true;
		Static416.aClass193_Sub1_2.method4184(arg4, Static296.aClass295Array3[arg7], arg3, local32, arg2, Static176.aClass121_5, arg0, arg7, arg5, arg6);
		Static480.aClass6_Sub37_Sub1_1.aBoolean402 = local73;
		return;
	}
}

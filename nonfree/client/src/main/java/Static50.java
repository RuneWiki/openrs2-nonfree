import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bja", name = "ib", descriptor = "I")
	public static int anInt1078;

	@OriginalMember(owner = "client!bja", name = "kb", descriptor = "Lclient!ha;")
	public static Class95 aClass95_1;

	@OriginalMember(owner = "client!bja", name = "mb", descriptor = "Lclient!hh;")
	public static Class6 aClass6_3;

	@OriginalMember(owner = "client!bja", name = "T", descriptor = "Z")
	public static boolean aBoolean72 = false;

	@OriginalMember(owner = "client!bja", name = "hb", descriptor = "Lclient!tca;")
	public static final Class333 aClass333_8 = new Class333(16);

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V")
	public static void method961(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg3) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) String local25 = arg2[local19];
		arg2[local19] = arg2[arg3];
		arg2[arg3] = local25;
		@Pc(39) short local39 = arg1[local19];
		arg1[local19] = arg1[arg3];
		arg1[arg3] = local39;
		for (@Pc(51) int local51 = arg0; local51 < arg3; local51++) {
			if (local25 == null || arg2[local51] != null && (local51 & 0x1) > arg2[local51].compareTo(local25)) {
				@Pc(72) String local72 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21] = local72;
				@Pc(86) short local86 = arg1[local51];
				arg1[local51] = arg1[local21];
				arg1[local21++] = local86;
			}
		}
		arg2[arg3] = arg2[local21];
		arg2[local21] = local25;
		arg1[arg3] = arg1[local21];
		arg1[local21] = local39;
		method961(arg0, arg1, arg2, local21 - 1);
		method961(local21 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "(IIB)I")
	public static int method963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(30) int local30 = ((arg0 & 0xFF00FF) * local12 & 0xFF00FF00 | (arg0 & 0xFF00) * local12 & 0xFF0000) >>> 8;
		@Pc(35) int local35 = 255 - local12;
		return ((local35 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local35 & 0xFF0000) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(ILclient!dt;I)Ljava/lang/String;")
	public static String method966(@OriginalArg(1) Class3_Sub4 arg0) {
		try {
			@Pc(7) int local7 = arg0.method7896();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt9739 += Static438.aClass264_1.method5896(local7, arg0.aByteArray90, arg0.anInt9739, local15, 0);
			return Static216.method3190(local15, local7, 0);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(Lclient!dt;B)V")
	public static void method967(@OriginalArg(0) Class3_Sub4 arg0) {
		for (@Pc(8) int local8 = 0; local8 < Static569.anInt9180; local8++) {
			@Pc(14) int local14 = arg0.method7896();
			@Pc(18) int local18 = arg0.method7951();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static257.aClass236_Sub1Array1[local14] != null) {
				Static257.aClass236_Sub1Array1[local14].anInt6385 = local18;
			}
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(IIZB)Ljava/lang/String;")
	public static String method968(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (!arg1 || arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(39) int local39 = 2;
		for (@Pc(43) int local43 = arg0 / 10; local43 != 0; local43 /= 10) {
			local39++;
		}
		@Pc(66) char[] local66 = new char[local39];
		local66[0] = '+';
		for (@Pc(74) int local74 = local39 - 1; local74 > 0; local74--) {
			@Pc(78) int local78 = arg0;
			arg0 /= 10;
			@Pc(89) int local89 = local78 - arg0 * 10;
			if (local89 >= 10) {
				local66[local74] = (char) (local89 + 87);
			} else {
				local66[local74] = (char) (local89 + 48);
			}
		}
		return new String(local66);
	}
}

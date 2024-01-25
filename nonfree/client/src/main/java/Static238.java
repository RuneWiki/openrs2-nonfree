import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "[Lclient!sn;")
	public static Interface22[] anInterface22Array1;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Lclient!de;")
	public static final Class60 aClass60_5 = new Class60("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "J")
	public static long aLong116 = 0L;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "Lclient!mga;")
	public static final Class230 aClass230_3 = new Class230();

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "[Lclient!sda;")
	public static final Class4_Sub45[] aClass4_Sub45Array1 = new Class4_Sub45[1024];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[S[Ljava/lang/String;BI)V")
	public static void method3424(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(22) int local22 = (arg0 + arg3) / 2;
		@Pc(24) int local24 = arg3;
		@Pc(28) String local28 = arg2[local22];
		arg2[local22] = arg2[arg0];
		arg2[arg0] = local28;
		@Pc(42) short local42 = arg1[local22];
		arg1[local22] = arg1[arg0];
		arg1[arg0] = local42;
		for (@Pc(54) int local54 = arg3; local54 < arg0; local54++) {
			if (local28 == null || arg2[local54] != null && arg2[local54].compareTo(local28) < (local54 & 0x1)) {
				@Pc(79) String local79 = arg2[local54];
				arg2[local54] = arg2[local24];
				arg2[local24] = local79;
				@Pc(93) short local93 = arg1[local54];
				arg1[local54] = arg1[local24];
				arg1[local24++] = local93;
			}
		}
		arg2[arg0] = arg2[local24];
		arg2[local24] = local28;
		arg1[arg0] = arg1[local24];
		arg1[local24] = local42;
		method3424(local24 - 1, arg1, arg2, arg3);
		method3424(arg0, arg1, arg2, local24 + 1);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIBLclient!ha;I)Lclient!ka;")
	public static Class62 method3428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class33 arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg2;
		@Pc(14) Class62 local14 = (Class62) Static403.aClass352_37.method7653(local6);
		if (local14 == null) {
			@Pc(24) Class334 local24 = Static111.method2111(arg2, Static89.aClass34_20);
			if (local24 == null) {
				return null;
			}
			if (local24.anInt8565 < 13) {
				local24.method7395();
			}
			local14 = arg4.method8072(local24, 2055, Static301.anInt4755, 64, 768);
			Static403.aClass352_37.method7655(local6, local14);
		}
		local14 = local14.method7329((byte) 2, 2055, true);
		if (arg3 != 0) {
			local14.a(arg3);
		}
		if (arg5 != 0) {
			local14.FA(arg5);
		}
		if (arg1 != 0) {
			local14.VA(arg1);
		}
		if (arg0 != 0) {
			local14.H(0, arg0, 0);
		}
		return local14;
	}
}

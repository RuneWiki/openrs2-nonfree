import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!oaa", name = "r", descriptor = "Lclient!vh;")
	public static Class363 aClass363_5;

	@OriginalMember(owner = "client!oaa", name = "o", descriptor = "Lclient!aia;")
	public static final Class15 aClass15_7 = new Class15("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "J")
	public static long aLong161 = 0L;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIZILclient!lca;)V")
	public static void method5804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub32 arg3) {
		@Pc(16) long local16 = (long) (arg0 << 28 | arg1 << 14 | arg2);
		@Pc(22) Class5_Sub18 local22 = (Class5_Sub18) Static440.aClass273_28.method6581(local16);
		if (local22 == null) {
			local22 = new Class5_Sub18();
			Static440.aClass273_28.method6585(local16, local22);
			local22.aClass330_8.method7917(arg3);
			return;
		}
		@Pc(45) Class255 local45 = Static643.aClass275_2.method6641(arg3.anInt5333);
		@Pc(48) int local48 = local45.anInt6559;
		if (local45.anInt6567 == 1) {
			local48 *= arg3.anInt5329 + 1;
		}
		for (@Pc(67) Class5_Sub32 local67 = (Class5_Sub32) local22.aClass330_8.method7908(); local67 != null; local67 = (Class5_Sub32) local22.aClass330_8.method7914()) {
			local45 = Static643.aClass275_2.method6641(local67.anInt5333);
			@Pc(78) int local78 = local45.anInt6559;
			if (local45.anInt6567 == 1) {
				local78 *= local67.anInt5329 + 1;
			}
			if (local78 < local48) {
				Static623.method8838(local67, arg3);
				return;
			}
		}
		local22.aClass330_8.method7917(arg3);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I[JIB[I)V")
	public static void method5805(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg2 + arg0) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) long local21 = arg1[local15];
		arg1[local15] = arg1[arg0];
		arg1[arg0] = local21;
		@Pc(35) int local35 = arg3[local15];
		arg3[local15] = arg3[arg0];
		arg3[arg0] = local35;
		@Pc(53) int local53 = local21 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg2; local55 < arg0; local55++) {
			if (local21 + (long) (local53 & local55) > arg1[local55]) {
				@Pc(73) long local73 = arg1[local55];
				arg1[local55] = arg1[local17];
				arg1[local17] = local73;
				@Pc(87) int local87 = arg3[local55];
				arg3[local55] = arg3[local17];
				arg3[local17++] = local87;
			}
		}
		arg1[arg0] = arg1[local17];
		arg1[local17] = local21;
		arg3[arg0] = arg3[local17];
		arg3[local17] = local35;
		method5805(local17 - 1, arg1, arg2, arg3);
		method5805(arg0, arg1, local17 + 1, arg3);
	}
}

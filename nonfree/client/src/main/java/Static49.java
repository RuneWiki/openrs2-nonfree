import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	public static int anInt856;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "Z")
	public static boolean aBoolean74 = true;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Lclient!ew;")
	public static final Class72 aClass72_11 = new Class72(64);

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
	public static int anInt857 = -1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!at;)V")
	public static void method690(@OriginalArg(1) Class16 arg0) {
		if (Static116.anInt2169 != arg0.anInt252) {
			return;
		}
		if (Static60.aClass3_Sub4_Sub1_Sub2_1.aString148 == null) {
			arg0.anInt267 = 0;
			arg0.anInt305 = 0;
			return;
		}
		arg0.anInt335 = 150;
		arg0.anInt308 = (int) (Math.sin((double) Static266.anInt4392 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt305 = Static201.anInt3383;
		arg0.anInt310 = 5;
		arg0.anInt267 = Static58.method837(Static60.aClass3_Sub4_Sub1_Sub2_1.aString148);
		arg0.anInt304 = Static60.aClass3_Sub4_Sub1_Sub2_1.anInt4967;
		arg0.anInt309 = 0;
		arg0.anInt278 = Static60.aClass3_Sub4_Sub1_Sub2_1.anInt4922;
		arg0.anInt299 = Static60.aClass3_Sub4_Sub1_Sub2_1.anInt4943;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI[Ljava/lang/Object;[JI)V")
	public static void method691(@OriginalArg(1) int arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg0) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) long local21 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local21;
		@Pc(35) Object local35 = arg1[local15];
		arg1[local15] = arg1[arg0];
		arg1[arg0] = local35;
		@Pc(55) int local55 = ~local21 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(57) int local57 = arg3; local57 < arg0; local57++) {
			if (arg2[local57] < local21 + (long) (local57 & local55)) {
				@Pc(75) long local75 = arg2[local57];
				arg2[local57] = arg2[local17];
				arg2[local17] = local75;
				@Pc(89) Object local89 = arg1[local57];
				arg1[local57] = arg1[local17];
				arg1[local17++] = local89;
			}
		}
		arg2[arg0] = arg2[local17];
		arg2[local17] = local21;
		arg1[arg0] = arg1[local17];
		arg1[local17] = local35;
		method691(local17 - 1, arg1, arg2, arg3);
		method691(arg0, arg1, arg2, local17 + 1);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBI)Z")
	public static boolean method693(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}

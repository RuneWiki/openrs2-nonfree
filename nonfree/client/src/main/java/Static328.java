import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[200];

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
	public static int anInt6057 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V")
	public static void method5458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static327.anInt3039 <= arg1 && arg1 <= Static230.anInt4308) {
			@Pc(19) int local19 = Static6.method125(arg0, Static265.anInt4933, Static311.anInt5837);
			@Pc(27) int local27 = Static6.method125(arg3, Static265.anInt4933, Static311.anInt5837);
			Static270.method4577(arg2, arg1, local27, local19);
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	public static void method5459() {
		@Pc(10) int local10 = Static220.aClass26_6.method508(Static150.aString121);
		@Pc(26) int local26;
		for (@Pc(20) Class6_Sub32 local20 = (Class6_Sub32) Static214.aClass211_24.method5594(); local20 != null; local20 = (Class6_Sub32) Static214.aClass211_24.method5582()) {
			local26 = Static212.method3770(local20);
			if (local10 < local26) {
				local10 = local26;
			}
		}
		local10 += 8;
		local26 = Static256.anInt4749 * 16 + 21;
		@Pc(56) int local56 = Static7.anInt149 - local10 / 2;
		if (Static209.anInt3815 < local56 + local10) {
			local56 = Static209.anInt3815 - local10;
		}
		if (local56 < 0) {
			local56 = 0;
		}
		@Pc(71) int local71 = Static79.anInt1449;
		if (local26 + local71 > Static94.anInt1731) {
			local71 = Static94.anInt1731 - local26;
		}
		if (local71 < 0) {
			local71 = 0;
		}
		Static194.anInt3666 = local56;
		Static201.aBoolean284 = true;
		Static25.anInt507 = local10;
		Static267.anInt4963 = local71;
		Static320.anInt5930 = (Static10.aBoolean19 ? 26 : 22) + Static256.anInt4749 * 16;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[Ljava/lang/String;[SI)V")
	public static void method5460(@OriginalArg(0) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(20) int local20 = (arg3 + arg0) / 2;
		@Pc(22) int local22 = arg3;
		@Pc(26) String local26 = arg1[local20];
		arg1[local20] = arg1[arg0];
		arg1[arg0] = local26;
		@Pc(40) short local40 = arg2[local20];
		arg2[local20] = arg2[arg0];
		arg2[arg0] = local40;
		for (@Pc(52) int local52 = arg3; local52 < arg0; local52++) {
			if (local26 == null || arg1[local52] != null && arg1[local52].compareTo(local26) < (local52 & 0x1)) {
				@Pc(77) String local77 = arg1[local52];
				arg1[local52] = arg1[local22];
				arg1[local22] = local77;
				@Pc(91) short local91 = arg2[local52];
				arg2[local52] = arg2[local22];
				arg2[local22++] = local91;
			}
		}
		arg1[arg0] = arg1[local22];
		arg1[local22] = local26;
		arg2[arg0] = arg2[local22];
		arg2[local22] = local40;
		method5460(local22 - 1, arg1, arg2, arg3);
		method5460(arg0, arg1, arg2, local22 + 1);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIB)V")
	public static void method5461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static67.anInt1256 = arg3;
		Static159.anInt2964 = arg0;
		Static271.anInt5040 = arg5;
		Static334.anInt6114 = arg2;
		Static24.anInt382 = arg1;
		Static118.anInt2260 = arg4;
	}
}

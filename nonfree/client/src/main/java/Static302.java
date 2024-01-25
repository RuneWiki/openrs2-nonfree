import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!l;")
	public static Interface4 anInterface4_7;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	public static int anInt5060 = 0;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!rk;BII)V")
	public static void method4040(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) long local20 = (long) (arg2 << 14 | arg3 << 28 | arg0);
		@Pc(26) Class1_Sub32 local26 = (Class1_Sub32) Static402.aClass208_37.method4405(local20);
		if (local26 == null) {
			local26 = new Class1_Sub32();
			Static402.aClass208_37.method4413(local20, local26);
			local26.aClass14_26.method205(arg1);
			return;
		}
		@Pc(49) Class135 local49 = Static285.aClass226_2.method4788(arg1.anInt5803);
		@Pc(52) int local52 = local49.anInt3826;
		if (local49.anInt3825 == 1) {
			local52 *= arg1.anInt5805 + 1;
		}
		for (@Pc(69) Class1_Sub39 local69 = (Class1_Sub39) local26.aClass14_26.method203(); local69 != null; local69 = (Class1_Sub39) local26.aClass14_26.method208()) {
			local49 = Static285.aClass226_2.method4788(local69.anInt5803);
			@Pc(80) int local80 = local49.anInt3826;
			if (local49.anInt3825 == 1) {
				local80 *= local69.anInt5805 + 1;
			}
			if (local52 > local80) {
				Static445.method5627(arg1, local69);
				return;
			}
		}
		local26.aClass14_26.method205(arg1);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB[Ljava/lang/Object;[JI)V")
	public static void method4041(@OriginalArg(0) int arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(11) int local11 = (arg3 + arg0) / 2;
		@Pc(13) int local13 = arg3;
		@Pc(17) long local17 = arg2[local11];
		arg2[local11] = arg2[arg0];
		arg2[arg0] = local17;
		@Pc(31) Object local31 = arg1[local11];
		arg1[local11] = arg1[arg0];
		arg1[arg0] = local31;
		@Pc(49) int local49 = local17 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(51) int local51 = arg3; local51 < arg0; local51++) {
			if (local17 + (long) (local49 & local51) > arg2[local51]) {
				@Pc(73) long local73 = arg2[local51];
				arg2[local51] = arg2[local13];
				arg2[local13] = local73;
				@Pc(87) Object local87 = arg1[local51];
				arg1[local51] = arg1[local13];
				arg1[local13++] = local87;
			}
		}
		arg2[arg0] = arg2[local13];
		arg2[local13] = local17;
		arg1[arg0] = arg1[local13];
		arg1[local13] = local31;
		method4041(local13 - 1, arg1, arg2, arg3);
		method4041(arg0, arg1, arg2, local13 + 1);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
	public static void method4042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static95.method5202(arg0)) {
			Static246.method3500(arg1, Static45.aClass107ArrayArray1[arg0]);
		}
	}
}

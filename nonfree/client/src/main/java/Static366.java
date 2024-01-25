import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IBI[J[Ljava/lang/Object;)V")
	public static void method5329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(23) int local23 = (arg0 + arg1) / 2;
		@Pc(25) int local25 = arg0;
		@Pc(29) long local29 = arg2[local23];
		arg2[local23] = arg2[arg1];
		arg2[arg1] = local29;
		@Pc(43) Object local43 = arg3[local23];
		arg3[local23] = arg3[arg1];
		arg3[arg1] = local43;
		@Pc(64) int local64 = ~local29 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(66) int local66 = arg0; local66 < arg1; local66++) {
			if (arg2[local66] < (long) (local64 & local66) + local29) {
				@Pc(85) long local85 = arg2[local66];
				arg2[local66] = arg2[local25];
				arg2[local25] = local85;
				@Pc(99) Object local99 = arg3[local66];
				arg3[local66] = arg3[local25];
				arg3[local25++] = local99;
			}
		}
		arg2[arg1] = arg2[local25];
		arg2[local25] = local29;
		arg3[arg1] = arg3[local25];
		arg3[local25] = local43;
		method5329(arg0, local25 - 1, arg2, arg3);
		method5329(local25 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method5330() {
		if (Static490.aBoolean536 || Static396.aClass5_Sub1_Sub13_2 == null) {
			return "";
		} else if ((Static396.aClass5_Sub1_Sub13_2.aString74 == null || Static396.aClass5_Sub1_Sub13_2.aString74.length() == 0) && Static396.aClass5_Sub1_Sub13_2.aString73 != null && Static396.aClass5_Sub1_Sub13_2.aString73.length() > 0) {
			return Static396.aClass5_Sub1_Sub13_2.aString73;
		} else {
			return Static396.aClass5_Sub1_Sub13_2.aString74;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
	public static int anInt6384 = 0;

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "Lclient!lc;")
	public static final Class136 aClass136_10 = new Class136("", 17);

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "Lclient!db;")
	public static final Class49 aClass49_8 = new Class49("LOCAL", 4);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([JII[II)V")
	public static void method5541(@OriginalArg(0) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(11) int local11 = (arg3 + arg1) / 2;
		@Pc(13) int local13 = arg3;
		@Pc(17) long local17 = arg0[local11];
		arg0[local11] = arg0[arg1];
		arg0[arg1] = local17;
		@Pc(31) int local31 = arg2[local11];
		arg2[local11] = arg2[arg1];
		arg2[arg1] = local31;
		for (@Pc(43) int local43 = arg3; local43 < arg1; local43++) {
			if ((long) (local43 & 0x1) + local17 > arg0[local43]) {
				@Pc(64) long local64 = arg0[local43];
				arg0[local43] = arg0[local13];
				arg0[local13] = local64;
				@Pc(78) int local78 = arg2[local43];
				arg2[local43] = arg2[local13];
				arg2[local13++] = local78;
			}
		}
		arg0[arg1] = arg0[local13];
		arg0[local13] = local17;
		arg2[arg1] = arg2[local13];
		arg2[local13] = local31;
		method5541(arg0, local13 - 1, arg2, arg3);
		method5541(arg0, arg1, arg2, local13 + 1);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V")
	public static void method5545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static46.anInt5339 = arg3;
		Static28.anInt429 = arg1;
		Static64.anInt1441 = arg2;
		Static309.anInt5673 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZII)Lclient!pe;")
	public static Class178 method5548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class178 local7 = new Class178();
		local7.anInt4980 = arg0 + 1 + 5;
		local7.anInt4993 = arg1 + 6;
		local7.anInt4995 = -1;
		local7.anInt4991 = -1;
		local7.anIntArrayArray34 = new int[local7.anInt4980][local7.anInt4993];
		local7.method4482();
		return local7;
	}
}

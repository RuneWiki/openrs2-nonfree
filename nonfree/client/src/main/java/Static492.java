import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "Lclient!vd;")
	public static final Class328 aClass328_6 = new Class328();

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "[Lclient!mj;")
	public static final Interface13[] anInterface13Array2 = new Interface13[75];

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "Lclient!jq;")
	public static final Class169 aClass169_1 = new Class169();

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Z")
	public static boolean method7381(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "([Ljava/lang/Object;II[JZ)V")
	public static void method7383(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(23) int local23 = (arg1 + arg2) / 2;
		@Pc(25) int local25 = arg1;
		@Pc(29) long local29 = arg3[local23];
		arg3[local23] = arg3[arg2];
		arg3[arg2] = local29;
		@Pc(43) Object local43 = arg0[local23];
		arg0[local23] = arg0[arg2];
		arg0[arg2] = local43;
		@Pc(63) int local63 = ~local29 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg1; local65 < arg2; local65++) {
			if (arg3[local65] < local29 + (long) (local63 & local65)) {
				@Pc(87) long local87 = arg3[local65];
				arg3[local65] = arg3[local25];
				arg3[local25] = local87;
				@Pc(101) Object local101 = arg0[local65];
				arg0[local65] = arg0[local25];
				arg0[local25++] = local101;
			}
		}
		arg3[arg2] = arg3[local25];
		arg3[local25] = local29;
		arg0[arg2] = arg0[local25];
		arg0[local25] = local43;
		method7383(arg0, arg1, local25 - 1, arg3);
		method7383(arg0, local25 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "([[[Lclient!ne;I)V")
	public static void method7384(@OriginalArg(0) Class224[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(11) Class224[][] local11 = arg0[local3];
			for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
				for (@Pc(17) int local17 = 0; local17 < local11[local13].length; local17++) {
					@Pc(25) Class224 local25 = local11[local13][local17];
					if (local25 != null) {
						if (local25.aClass11_Sub5_2 instanceof Interface17) {
							((Interface17) local25.aClass11_Sub5_2).method8115();
						}
						if (local25.aClass11_Sub3_2 instanceof Interface17) {
							((Interface17) local25.aClass11_Sub3_2).method8115();
						}
						if (local25.aClass11_Sub3_1 instanceof Interface17) {
							((Interface17) local25.aClass11_Sub3_1).method8115();
						}
						if (local25.aClass11_Sub4_3 instanceof Interface17) {
							((Interface17) local25.aClass11_Sub4_3).method8115();
						}
						if (local25.aClass11_Sub4_2 instanceof Interface17) {
							((Interface17) local25.aClass11_Sub4_2).method8115();
						}
						for (@Pc(77) Class270 local77 = local25.aClass270_1; local77 != null; local77 = local77.aClass270_2) {
							@Pc(82) Class11_Sub1 local82 = local77.aClass11_Sub1_2;
							if (local82 instanceof Interface17) {
								((Interface17) local82).method8115();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)I")
	public static int method7385() {
		return Static127.anInt2829;
	}
}

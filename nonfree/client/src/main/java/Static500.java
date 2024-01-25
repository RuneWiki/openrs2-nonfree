import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!qw", name = "P", descriptor = "Z")
	public static final boolean aBoolean650 = false;

	@OriginalMember(owner = "client!qw", name = "S", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray11 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILclient!uf;IB)V")
	public static void method7872(@OriginalArg(0) int arg0, @OriginalArg(1) Class357 arg1, @OriginalArg(2) int arg2) {
		Static148.anInt2748 = arg0;
		Static431.anInt2504 = arg2;
		Static266.aClass357_77 = arg1;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILclient!uf;Lclient!ha;II)V")
	public static void method7874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class357 arg2, @OriginalArg(3) Class101 arg3, @OriginalArg(5) int arg4) {
		for (@Pc(13) int local13 = 7; local13 >= 0; local13--) {
			for (@Pc(17) int local17 = 127; local17 >= 0; local17--) {
				@Pc(35) int local35 = local17 & 0x7F | (local13 & 0x7) << 7 | (arg0 & 0x3F) << 10;
				Static28.method489(false, true);
				@Pc(43) int local43 = Static101.anIntArray92[local35];
				Static508.method7933(true, false);
				arg3.aa(arg4 + (local17 * arg2.anInt10395 >> 7), (arg2.anInt10465 * (-local13 + 7) >> 3) + arg1, (arg2.anInt10395 >> 7) + 1, (arg2.anInt10465 >> 3) - -1, local43, 0);
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BI)V")
	public static void method7875(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub1_Sub5 local17 = Static653.method9595(7, (long) arg0);
		local17.method2489();
	}
}

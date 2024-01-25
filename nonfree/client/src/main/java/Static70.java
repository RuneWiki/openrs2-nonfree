import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
	public static int anInt9228;

	@OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
	public static int anInt9231;

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "[I")
	public static final int[] anIntArray712 = new int[13];

	@OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
	public static int anInt9227 = 0;

	@OriginalMember(owner = "client!cj", name = "M", descriptor = "[I")
	public static final int[] anIntArray713 = new int[2];

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method7878(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(30) int local30 = local19 + (arg1 ? Static473.aClass171_1.anInt4382 : Static473.aClass171_1.anInt4384);
		for (@Pc(32) int local32 = local19; local32 < local30; local32++) {
			@Pc(39) Class5_Sub4_Sub21 local39 = Static473.aClass171_1.method4004(local32);
			if (local39.aBoolean830 && local39.method8753().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static282.anInt4637 = -1;
					Static39.aShortArray15 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(70) short[] local70 = new short[local11.length * 2];
					for (@Pc(72) int local72 = 0; local72 < local13; local72++) {
						local70[local72] = local11[local72];
					}
					local11 = local70;
				}
				local11[local13++] = (short) local32;
			}
		}
		Static282.anInt4637 = local13;
		Static39.aShortArray15 = local11;
		Static273.anInt4520 = 0;
		@Pc(112) String[] local112 = new String[Static282.anInt4637];
		for (@Pc(114) int local114 = 0; local114 < Static282.anInt4637; local114++) {
			local112[local114] = Static473.aClass171_1.method4004(local11[local114]).method8753();
		}
		Static450.method6694(local112, Static39.aShortArray15);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Lclient!nl;")
	public static Class14_Sub1_Sub5 method7879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class156 local7 = Static535.aClass156ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass14_Sub1_Sub5_1 == null ? null : local7.aClass14_Sub1_Sub5_1;
	}
}

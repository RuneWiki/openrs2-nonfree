import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
	public static int anInt4069;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Lclient!uc;")
	public static Class100 aClass100_1 = new Class100();

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1165 = Static181.method2795(" is already on your friend list)3");

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1166 = aClass83_1165;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1167 = Static181.method2795("(U0a )2 via: ");

	@OriginalMember(owner = "client!vh", name = "B", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1175 = Static181.method2795("");

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1168 = aClass83_1175;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1169 = aClass83_1175;

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
	public static int anInt4066 = 0;

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "[S")
	public static final short[] aShortArray59 = new short[] { 32, 40, 1, 17, 3, 11, 20, 21 };

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
	public static int anInt4067 = 0;

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
	public static int anInt4068 = 0;

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1170 = Static181.method2795("Use");

	@OriginalMember(owner = "client!vh", name = "w", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1171 = aClass83_1170;

	@OriginalMember(owner = "client!vh", name = "x", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1172 = aClass83_1175;

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1173 = aClass83_1175;

	@OriginalMember(owner = "client!vh", name = "A", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1174 = aClass83_1175;

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1176 = aClass83_1175;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[Lclient!dg;I[BB)V")
	public static void method3109(@OriginalArg(0) int arg0, @OriginalArg(1) Class22[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		@Pc(10) Class2_Sub3 local10 = new Class2_Sub3(arg3);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method230();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local10.method232();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(47) int local47 = local31 & 0x3F;
				@Pc(51) int local51 = local31 >> 12;
				@Pc(57) int local57 = local31 >> 6 & 0x3F;
				@Pc(61) int local61 = local10.method260();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = arg0 + local57;
				@Pc(77) int local77 = arg2 + local47;
				if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
					@Pc(97) Class22 local97 = null;
					@Pc(99) int local99 = local51;
					if ((Static9.aByteArrayArrayArray7[1][local73][local77] & 0x2) == 2) {
						local99 = local51 - 1;
					}
					if (local99 >= 0) {
						local97 = arg1[local99];
					}
					Static96.method1642(local51, Static158.aBoolean148, local51, true, local73, local77, local65, local16, local69, local97);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static50.method998(Static61.anInt1501, Static147.anInt4074, arg4);
		@Pc(17) int local17 = Static50.method998(Static61.anInt1501, Static147.anInt4074, arg2);
		@Pc(23) int local23 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg6);
		@Pc(29) int local29 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg1);
		@Pc(37) int local37 = Static50.method998(Static61.anInt1501, Static147.anInt4074, arg5 + arg4);
		@Pc(45) int local45 = Static50.method998(Static61.anInt1501, Static147.anInt4074, arg2 - arg5);
		for (@Pc(47) int local47 = local11; local47 < local37; local47++) {
			Static22.method438(local29, arg3, local23, Static14.anIntArrayArray18[local47]);
		}
		for (@Pc(63) int local63 = local17; local63 > local45; local63--) {
			Static22.method438(local29, arg3, local23, Static14.anIntArrayArray18[local63]);
		}
		@Pc(93) int local93 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg5 + arg6);
		@Pc(101) int local101 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg1 - arg5);
		for (@Pc(103) int local103 = local37; local103 <= local45; local103++) {
			@Pc(109) int[] local109 = Static14.anIntArrayArray18[local103];
			Static22.method438(local93, arg3, local23, local109);
			Static22.method438(local101, arg0, local93, local109);
			Static22.method438(local29, arg3, local101, local109);
		}
	}
}

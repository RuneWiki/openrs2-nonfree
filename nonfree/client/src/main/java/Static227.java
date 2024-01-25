import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
	public static int anInt4884;

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "[I")
	public static int[] anIntArray437 = new int[2];

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
	public static int anInt4885 = -1;

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "[I")
	public static final int[] anIntArray438 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "[Lclient!mu;")
	public static final Class196[] aClass196Array1 = new Class196[32];

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIILclient!tr;)V")
	public static void method4089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub5 arg4) {
		@Pc(4) Class290 local4 = Static326.method5207(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt8135 = (arg1 << Static33.anInt880) + Static467.anInt8424;
		arg4.anInt8128 = arg3;
		arg4.anInt8132 = (arg2 << Static33.anInt880) + Static467.anInt8424;
		for (@Pc(28) Class98 local28 = local4.aClass98_3; local28 != null; local28 = local28.aClass98_1) {
			if (local28.aClass6_Sub1_1.aBoolean656) {
				@Pc(38) int local38 = local28.aClass6_Sub1_1.method7240();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt8128 += local8;
			arg4.aBoolean579 = true;
		} else if (local4.aClass6_Sub3_2 != null) {
			arg4.anInt8128 -= local4.aClass6_Sub3_2.aShort74;
		}
		local4.aClass6_Sub5_1 = arg4;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(JJ)J")
	public static long method4091(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIII)V")
	public static void method4092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 >= Static190.anInt4314 && arg4 <= Static145.anInt2941 && arg0 >= Static269.anInt5577 && Static81.anInt1788 >= arg2) {
			if (arg1 == 1) {
				Static473.method6745(arg4, arg5, arg2, arg3, arg0);
			} else {
				Static457.method6859(arg2, arg4, arg5, arg1, arg0, arg3);
			}
		} else if (arg1 == 1) {
			Static266.method4660(arg2, arg0, arg4, arg3, arg5);
		} else {
			Static383.method4809(arg0, arg2, arg5, arg4, arg3, arg1);
		}
	}
}

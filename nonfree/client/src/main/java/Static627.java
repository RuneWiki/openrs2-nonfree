import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "Lclient!ua;")
	public static final Class2_Sub11_Sub2 aClass2_Sub11_Sub2_6 = new Class2_Sub11_Sub2(7500);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I")
	public static int method7088(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local13 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local13 += 8;
		}
		if (arg0 >= 16) {
			local13 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local13 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local13++;
		}
		return local13 + arg0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIBIIII)V")
	public static void method7090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static365.method6195(arg0);
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = arg0 - arg2;
		if (local26 < 0) {
			local26 = 0;
		}
		@Pc(35) int local35 = arg0;
		@Pc(38) int local38 = -arg0;
		@Pc(40) int local40 = local26;
		@Pc(43) int local43 = -local26;
		@Pc(45) int local45 = -1;
		@Pc(47) int local47 = -1;
		@Pc(51) int[] local51 = Static208.anIntArrayArray20[arg3];
		@Pc(56) int local56 = arg1 - local26;
		@Pc(60) int local60 = local26 + arg1;
		Static280.method5108(local56, local51, arg1 - arg0, arg5);
		Static280.method5108(local60, local51, local56, arg4);
		Static280.method5108(arg0 + arg1, local51, local60, arg5);
		while (local35 > local21) {
			local47 += 2;
			local45 += 2;
			local43 += local47;
			local38 += local45;
			if (local43 >= 0 && local40 >= 1) {
				Static559.anIntArray650[local40] = local21;
				local40--;
				local43 -= local40 << 1;
			}
			local21++;
			@Pc(132) int[] local132;
			@Pc(139) int[] local139;
			@Pc(144) int local144;
			@Pc(149) int local149;
			@Pc(189) int local189;
			@Pc(194) int local194;
			@Pc(199) int local199;
			if (local38 >= 0) {
				local35--;
				local38 -= local35 << 1;
				if (local26 <= local35) {
					local132 = Static208.anIntArrayArray20[local35 + arg3];
					local139 = Static208.anIntArrayArray20[arg3 - local35];
					local144 = arg1 + local21;
					local149 = arg1 - local21;
					Static280.method5108(local144, local132, local149, arg5);
					Static280.method5108(local144, local139, local149, arg5);
				} else {
					local132 = Static208.anIntArrayArray20[arg3 + local35];
					local139 = Static208.anIntArrayArray20[arg3 - local35];
					local144 = Static559.anIntArray650[local35];
					local149 = local21 + arg1;
					local189 = arg1 - local21;
					local194 = arg1 + local144;
					local199 = arg1 - local144;
					Static280.method5108(local199, local132, local189, arg5);
					Static280.method5108(local194, local132, local199, arg4);
					Static280.method5108(local149, local132, local194, arg5);
					Static280.method5108(local199, local139, local189, arg5);
					Static280.method5108(local194, local139, local199, arg4);
					Static280.method5108(local149, local139, local194, arg5);
				}
			}
			local132 = Static208.anIntArrayArray20[arg3 + local21];
			local139 = Static208.anIntArrayArray20[arg3 - local21];
			local144 = arg1 + local35;
			local149 = arg1 - local35;
			if (local26 > local21) {
				local189 = local40 >= local21 ? local40 : Static559.anIntArray650[local21];
				local194 = local189 + arg1;
				local199 = arg1 - local189;
				Static280.method5108(local199, local132, local149, arg5);
				Static280.method5108(local194, local132, local199, arg4);
				Static280.method5108(local144, local132, local194, arg5);
				Static280.method5108(local199, local139, local149, arg5);
				Static280.method5108(local194, local139, local199, arg4);
				Static280.method5108(local144, local139, local194, arg5);
			} else {
				Static280.method5108(local144, local132, local149, arg5);
				Static280.method5108(local144, local139, local149, arg5);
			}
		}
	}
}

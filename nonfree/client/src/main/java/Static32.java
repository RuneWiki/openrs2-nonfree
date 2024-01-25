import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!baa", name = "r", descriptor = "I")
	public static int anInt566;

	@OriginalMember(owner = "client!baa", name = "j", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_5 = new Class391(5);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 >= Static642.anInt10429 && Static456.anInt7806 >= arg2 && arg3 >= Static642.anInt10429 && Static456.anInt7806 >= arg3 && arg6 >= Static642.anInt10429 && Static456.anInt7806 >= arg6 && arg7 >= Static642.anInt10429 && arg7 <= Static456.anInt7806 && arg1 >= Static456.anInt7815 && Static604.anInt10083 >= arg1 && Static456.anInt7815 <= arg4 && Static604.anInt10083 >= arg4 && arg5 >= Static456.anInt7815 && Static604.anInt10083 >= arg5 && Static456.anInt7815 <= arg8 && arg8 <= Static604.anInt10083) {
			Static271.method4027(arg2, arg0, arg8, arg3, arg1, arg5, arg7, arg4, arg6);
		} else {
			Static8.method98(arg2, arg7, arg4, arg6, arg1, arg3, arg8, arg0, arg5);
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BIIIIIII)V")
	public static void method553(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg2;
		@Pc(21) int local21 = arg5 - arg2;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg5 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + local25 * (1 - local57);
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(93) int local93 = local33 * (1 - local61) + local49;
		@Pc(102) int local102 = local37 - local53 * (local61 - 1);
		@Pc(106) int local106 = local25 << 2;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local37 << 2;
		@Pc(122) int local122 = local41 * 3;
		@Pc(128) int local128 = local45 * (local57 - 3);
		@Pc(132) int local132 = local49 * 3;
		@Pc(138) int local138 = local53 * (local61 - 3);
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = local106 * (arg5 - 1);
		@Pc(148) int local148 = local118;
		@Pc(154) int local154 = (local21 - 1) * local114;
		@Pc(158) int[] local158 = Static569.anIntArrayArray54[arg0];
		Static646.method7025(local158, arg6 - arg4, arg6 + -local16, arg1);
		Static646.method7025(local158, arg6 - local16, arg6 - -local16, arg3);
		Static646.method7025(local158, local16 + arg6, arg4 + arg6, arg1);
		while (local9 > 0) {
			@Pc(204) boolean local204 = local9 <= local21;
			if (local204) {
				if (local93 < 0) {
					while (local93 < 0) {
						local93 += local132;
						local102 += local148;
						local148 += local118;
						local11++;
						local132 += local118;
					}
				}
				if (local102 < 0) {
					local102 += local148;
					local93 += local132;
					local11++;
					local148 += local118;
					local132 += local118;
				}
				local93 += -local154;
				local102 += -local138;
				local154 -= local114;
				local138 -= local114;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local122;
					local79 += local140;
					local140 += local110;
					local7++;
					local122 += local110;
				}
			}
			if (local79 < 0) {
				local70 += local122;
				local79 += local140;
				local140 += local110;
				local122 += local110;
				local7++;
			}
			local79 += -local128;
			local70 += -local146;
			local128 -= local106;
			local146 -= local106;
			local9--;
			@Pc(355) int local355 = arg0 - local9;
			@Pc(359) int local359 = local9 + arg0;
			@Pc(363) int local363 = local7 + arg6;
			@Pc(367) int local367 = arg6 - local7;
			if (local204) {
				@Pc(393) int local393 = local11 + arg6;
				@Pc(398) int local398 = arg6 - local11;
				Static646.method7025(Static569.anIntArrayArray54[local355], local367, local398, arg1);
				Static646.method7025(Static569.anIntArrayArray54[local355], local398, local393, arg3);
				Static646.method7025(Static569.anIntArrayArray54[local355], local393, local363, arg1);
				Static646.method7025(Static569.anIntArrayArray54[local359], local367, local398, arg1);
				Static646.method7025(Static569.anIntArrayArray54[local359], local398, local393, arg3);
				Static646.method7025(Static569.anIntArrayArray54[local359], local393, local363, arg1);
			} else {
				Static646.method7025(Static569.anIntArrayArray54[local355], local367, local363, arg1);
				Static646.method7025(Static569.anIntArrayArray54[local359], local367, local363, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!ib;B)Lclient!rg;")
	public static Class303 method555(@OriginalArg(0) Class5_Sub23 arg0) {
		@Pc(13) int local13 = arg0.method8527();
		return new Class303(local13);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!jh;I)I")
	public static int method556(@OriginalArg(0) Class188 arg0) {
		if (arg0 == Static145.aClass188_9) {
			return 9216;
		} else if (Static506.aClass188_47 == arg0) {
			return 34065;
		} else if (arg0 == Static307.aClass188_20) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method557(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}

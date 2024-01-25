import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!gt", name = "Hb", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_67 = new Class298(20, 3);

	@OriginalMember(owner = "client!gt", name = "Jb", descriptor = "Lclient!mo;")
	public static final Class215 aClass215_2 = new Class215("WIP", 2);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II[IIIIBI)Z")
	public static boolean method3141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 > Static28.anInt683) {
			arg3 = Static28.anInt683;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg1 >= arg3) {
			return true;
		}
		@Pc(34) int local34 = arg3 - arg1 >> 2;
		arg5 += arg4 * arg1;
		arg0 += arg1 - 1;
		@Pc(72) int local72;
		@Pc(60) int local60;
		@Pc(69) int local69;
		if (Static437.anInt7278 == 1) {
			Static151.anInt3128 += local34;
			while (true) {
				local34--;
				if (local34 < 0) {
					local34 = arg3 - arg1 & 0x3;
					while (true) {
						local34--;
						if (local34 < 0) {
							return true;
						}
						local72 = ~arg5;
						arg0++;
						if (local72 > ~arg2[arg0]) {
							arg2[arg0] = arg5;
						}
						arg5 += arg4;
					}
				}
				local72 = ~arg5;
				local60 = arg0 + 1;
				if (local72 > ~arg2[local60]) {
					arg2[local60] = arg5;
				}
				local69 = arg5 + arg4;
				local60++;
				if (local69 < arg2[local60]) {
					arg2[local60] = local69;
				}
				local69 += arg4;
				local60++;
				if (arg2[local60] > local69) {
					arg2[local60] = local69;
				}
				local69 += arg4;
				local72 = ~local69;
				arg0 = local60 + 1;
				if (local72 > ~arg2[arg0]) {
					arg2[arg0] = local69;
				}
				arg5 = local69 + arg4;
			}
		} else {
			arg5 -= 15360;
			while (true) {
				local34--;
				if (local34 < 0) {
					local34 = arg3 - arg1 & 0x3;
					while (true) {
						local34--;
						if (local34 < 0) {
							return true;
						}
						arg0++;
						if (arg2[arg0] > arg5) {
							return false;
						}
						arg5 += arg4;
					}
				}
				local60 = arg0 + 1;
				if (arg5 < arg2[local60]) {
					return false;
				}
				local69 = arg5 + arg4;
				local72 = ~local69;
				local60++;
				if (local72 > ~arg2[local60]) {
					return false;
				}
				local69 += arg4;
				local60++;
				if (arg2[local60] > local69) {
					return false;
				}
				local69 += arg4;
				arg0 = local60 + 1;
				if (arg2[arg0] > local69) {
					return false;
				}
				arg5 = local69 + arg4;
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!qh;B)Lclient!bba;")
	public static Class21 method3144(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(14) int local14 = arg0.method3116();
		return new Class21(local14);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method3145(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) long local31 = arg0; local31 != 0L; local31 /= 37L) {
				local29++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local47.append(Static151.aCharArray5[(int) (local56 - arg0 * 37L)]);
			}
			return local47.reverse().toString();
		}
	}
}

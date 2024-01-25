import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!vu", name = "x", descriptor = "[Lclient!ga;")
	public static Class3_Sub1[] aClass3_Sub1Array143;

	@OriginalMember(owner = "client!vu", name = "p", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_245 = new Class215(46, -1);

	@OriginalMember(owner = "client!vu", name = "s", descriptor = "[I")
	public static final int[] anIntArray689 = new int[32];

	@OriginalMember(owner = "client!vu", name = "t", descriptor = "[I")
	public static final int[] anIntArray690 = new int[3];

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIIIII)V")
	public static void method8963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 != 8 && arg5 != 16) {
			@Pc(17) Class100 local17 = Static395.aClass100ArrayArrayArray3[arg4][arg0][arg3];
			if (local17 == null) {
				local17 = new Class100(arg4);
			}
			if (arg5 == 1) {
				local17.aShort31 = (short) arg1;
				local17.aShort32 = (short) arg2;
			} else if (arg5 == 2) {
				local17.aShort30 = (short) arg2;
				local17.aShort29 = (short) arg1;
			}
			if (Static172.aBoolean309) {
				Static130.method3023();
			}
			return;
		}
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(76) int local76;
		@Pc(80) int local80;
		@Pc(90) int local90;
		@Pc(100) int local100;
		if (arg5 != 8) {
			local67 = Static582.anInt10356 + (arg0 << Static151.anInt3896);
			local72 = local67 - Static582.anInt10356;
			local76 = arg3 << Static151.anInt3896;
			local80 = local76 + Static582.anInt10356;
			local90 = Static40.aClass65Array2[arg4].method7995(arg3, arg0 + 1);
			local100 = Static40.aClass65Array2[arg4].method7995(arg3 + 1, arg0);
			Static618.aClass82Array4[Static617.anInt10803++] = new Class82(arg5, arg4, local67, local72, local72, local67, local90, local100, local100 - arg2, local90 - arg2, local76, local80, local80, local76);
			return;
		}
		local67 = arg0 << Static151.anInt3896;
		local72 = Static582.anInt10356 + local67;
		local76 = arg3 << Static151.anInt3896;
		local80 = Static582.anInt10356 + local76;
		local90 = Static40.aClass65Array2[arg4].method7995(arg3, arg0);
		local100 = Static40.aClass65Array2[arg4].method7995(arg3 + 1, arg0 - -1);
		Static618.aClass82Array4[Static617.anInt10803++] = new Class82(arg5, arg4, local67, local72, local72, local67, local90, local100, local100 - arg2, -arg2 + local90, local76, local80, local80, local76);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
	public static int method8964(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(59) char local59;
			if (local17 == '\u0000') {
				local59 = arg2.charAt(local13++);
			} else {
				local59 = local17;
			}
			@Pc(72) char local72;
			if (local19 == '\u0000') {
				local72 = arg0.charAt(local15++);
			} else {
				local72 = local19;
			}
			local17 = Static366.method6225(local59);
			local19 = Static366.method6225(local72);
			local59 = Static392.method6464(local59, arg1);
			local72 = Static392.method6464(local72, arg1);
			if (local72 != local59 && Character.toUpperCase(local59) != Character.toUpperCase(local72)) {
				local59 = Character.toLowerCase(local59);
				local72 = Character.toLowerCase(local72);
				if (local72 != local59) {
					return Static38.method869(arg1, local59) - Static38.method869(arg1, local72);
				}
			}
		}
		@Pc(145) int local145 = Math.min(local8, local11);
		for (@Pc(147) int local147 = 0; local147 < local145; local147++) {
			if (arg1 == 2) {
				local15 = local11 - local147 - 1;
				local13 = local8 - local147 - 1;
			} else {
				local15 = local147;
				local13 = local147;
			}
			@Pc(176) char local176 = arg2.charAt(local13);
			@Pc(180) char local180 = arg0.charAt(local15);
			if (local180 != local176 && Character.toUpperCase(local176) != Character.toUpperCase(local180)) {
				local176 = Character.toLowerCase(local176);
				local180 = Character.toLowerCase(local180);
				if (local180 != local176) {
					return Static38.method869(arg1, local176) - Static38.method869(arg1, local180);
				}
			}
		}
		@Pc(232) int local232 = local8 - local11;
		if (local232 != 0) {
			return local232;
		}
		for (@Pc(241) int local241 = 0; local241 < local145; local241++) {
			@Pc(247) char local247 = arg2.charAt(local241);
			@Pc(251) char local251 = arg0.charAt(local241);
			if (local251 != local247) {
				return Static38.method869(arg1, local247) - Static38.method869(arg1, local251);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "(II)Z")
	public static boolean method8966(@OriginalArg(1) int arg0) {
		if (arg0 == 3 || arg0 == 4 || arg0 == 9 || arg0 == 59 || arg0 == 1007) {
			return true;
		} else {
			return arg0 == 2 || arg0 == 1001;
		}
	}
}

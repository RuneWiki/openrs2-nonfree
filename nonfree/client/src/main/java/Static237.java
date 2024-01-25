import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!p", name = "m", descriptor = "I")
	public static int anInt6655;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "[Lclient!vj;")
	public static Class58[] aClass58Array136;

	@OriginalMember(owner = "client!p", name = "r", descriptor = "I")
	public static int anInt6659;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "Z")
	public static boolean aBoolean480;

	@OriginalMember(owner = "client!p", name = "p", descriptor = "I")
	public static int anInt6657 = 0;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "I")
	public static int anInt6658 = 0;

	@OriginalMember(owner = "client!p", name = "w", descriptor = "S")
	public static short aShort95 = 320;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
	public static void method5582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg1, 12);
		local8.method4908();
		local8.anInt5705 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIII)I")
	public static int method5583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(12) int local12 = arg5;
			arg5 = arg4;
			arg4 = local12;
		}
		@Pc(20) int local20 = arg3 & 0x3;
		if (local20 == 0) {
			return arg0;
		} else if (local20 == 1) {
			return arg2;
		} else if (local20 == 2) {
			return 7 + 1 - arg0 - arg5;
		} else {
			return 1 + 7 - arg4 - arg2;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!ak;Lclient!vq;Lclient!mq;)V")
	public static void method5584(@OriginalArg(1) Class4_Sub3 arg0, @OriginalArg(2) Class47 arg1, @OriginalArg(3) Class136 arg2) {
		@Pc(10) Class58 local10 = arg2.method3847(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method4279();
		if (local16 < local10.method4274()) {
			local16 = local10.method4274();
		}
		@Pc(32) int local32 = arg0.anInt207;
		@Pc(39) int local39 = arg0.anInt208;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(59) int local59;
		@Pc(86) int local86;
		if (arg2.aString44 != null) {
			local41 = Static139.aClass16_3.method328(null, Static31.aStringArray7, null, arg2.aString44);
			for (local59 = 0; local59 < local41; local59++) {
				@Pc(65) String local65 = Static31.aStringArray7[local59];
				if (local41 - 1 > local59) {
					local65 = local65.substring(0, local65.length() - 4);
				}
				local86 = Static202.aClass189_9.method4932(local65);
				if (local43 < local86) {
					local43 = local86;
				}
			}
			local45 = local41 * Static202.aClass189_9.method4930() + Static202.aClass189_9.method4933() / 2;
		}
		local59 = local16 / 2 + arg0.anInt207;
		@Pc(119) int local119 = arg0.anInt208;
		if (Static54.anInt4743 + local16 > local32) {
			local59 = local43 / 2 + local16 / 2 + Static54.anInt4743 + 5 + 10;
			local32 = Static54.anInt4743;
		} else if (Static54.anInt4740 - local16 < local32) {
			local59 = Static54.anInt4740 - local43 / 2 - local16 / 2 - 5 - 10;
			local32 = Static54.anInt4740 - local16;
		}
		if (Static54.anInt4738 + local16 > local39) {
			local39 = Static54.anInt4738;
			local119 = Static54.anInt4738 + local16 / 2 + 10;
		} else if (Static54.anInt4742 - local16 < local39) {
			local119 = Static54.anInt4742 - local16 / 2 - local45 - 10;
			local39 = Static54.anInt4742 - local16;
		}
		local86 = (int) (Math.atan2((double) (local32 - arg0.anInt207), (double) (local39 - arg0.anInt208)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method4284((float) local16 / 2.0F + (float) local32, (float) local39 + (float) local16 / 2.0F, 4096, local86);
		@Pc(262) int local262 = -2;
		@Pc(264) int local264 = -2;
		@Pc(266) int local266 = -2;
		@Pc(268) int local268 = -2;
		if (arg2.aString44 != null) {
			local264 = local119;
			local262 = local59 - local43 / 2 - 5;
			local268 = local119 + local41 * Static202.aClass189_9.method4930() + 3;
			local266 = local43 + local262 + 10;
			if (arg2.anInt4274 != 0) {
				arg1.method2687(local262, arg2.anInt4274, local266 - local262, local119, local268 - local119);
			}
			if (arg2.anInt4255 != 0) {
				arg1.method2727(local119, local268 - local119, local266 - local262, arg2.anInt4255, local262);
			}
			for (@Pc(333) int local333 = 0; local333 < local41; local333++) {
				@Pc(339) String local339 = Static31.aStringArray7[local333];
				if (local333 < local41 - 1) {
					local339 = local339.substring(0, local339.length() - 4);
				}
				Static202.aClass189_9.method4934(arg1, local339, local59, local119, arg2.anInt4270);
				local119 += Static202.aClass189_9.method4930();
			}
		}
		if (arg2.anInt4264 == -1 && arg2.aString44 == null) {
			return;
		}
		@Pc(386) Class4_Sub18 local386 = new Class4_Sub18(arg0);
		local16 >>= 0x1;
		local386.anInt2711 = local266;
		local386.anInt2708 = local262;
		local386.anInt2716 = local264;
		local386.anInt2714 = local32 - local16;
		local386.anInt2712 = local16 + local32;
		local386.anInt2706 = local268;
		local386.anInt2710 = local39 + local16;
		local386.anInt2715 = local39 - local16;
		Static46.aClass116_4.method3274(local386);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!vq;Lclient!km;III)V")
	public static void method5585(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class128 local12;
		if (arg3 < Static198.anInt4128) {
			local12 = Static273.aClass128ArrayArrayArray4[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass8_Sub5_1 != null && local12.aClass8_Sub5_1.method5622()) {
				arg1.method5621(arg0, true, local12.aClass8_Sub5_1, 0, 128, 0);
			}
		}
		if (arg4 < Static198.anInt4128) {
			local12 = Static273.aClass128ArrayArrayArray4[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass8_Sub5_1 != null && local12.aClass8_Sub5_1.method5622()) {
				arg1.method5621(arg0, true, local12.aClass8_Sub5_1, 128, 0, 0);
			}
		}
		if (arg3 < Static198.anInt4128 && arg4 < Static15.anInt1162) {
			local12 = Static273.aClass128ArrayArrayArray4[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass8_Sub5_1 != null && local12.aClass8_Sub5_1.method5622()) {
				arg1.method5621(arg0, true, local12.aClass8_Sub5_1, 128, 128, 0);
			}
		}
		if (arg3 < Static198.anInt4128 && arg4 > 0) {
			local12 = Static273.aClass128ArrayArrayArray4[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass8_Sub5_1 != null && local12.aClass8_Sub5_1.method5622()) {
				arg1.method5621(arg0, true, local12.aClass8_Sub5_1, -128, 128, 0);
			}
		}
	}
}

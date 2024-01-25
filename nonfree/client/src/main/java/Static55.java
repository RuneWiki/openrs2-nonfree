import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZI)Z")
	public static boolean method6551(@OriginalArg(1) int arg0) {
		if (arg0 == 25 || arg0 == 4 || arg0 == 60 || arg0 == 2 || arg0 == 46) {
			return true;
		} else {
			return arg0 == 45 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILclient!r;Lclient!kt;Lclient!vca;)V")
	public static void method6552(@OriginalArg(1) Class31 arg0, @OriginalArg(2) Class3_Sub33 arg1, @OriginalArg(3) Class338 arg2) {
		@Pc(12) Class73 local12 = arg2.method7658(arg0);
		if (local12 == null) {
			return;
		}
		@Pc(18) int local18 = local12.E();
		if (local12.u() > local18) {
			local18 = local12.u();
		}
		@Pc(34) int local34 = arg1.anInt5489;
		@Pc(37) int local37 = arg1.anInt5488;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(59) int local59;
		@Pc(82) int local82;
		if (arg2.aString255 != null) {
			local39 = Static441.aClass328_10.method7374(arg2.aString255, null, null, Static243.aStringArray43);
			for (local59 = 0; local59 < local39; local59++) {
				@Pc(65) String local65 = Static243.aStringArray43[local59];
				if (local59 < local39 - 1) {
					local65 = local65.substring(0, local65.length() - 4);
				}
				local82 = Static569.aClass262_9.method5834(local65);
				if (local41 < local82) {
					local41 = local82;
				}
			}
			local43 = Static569.aClass262_9.method5833() * local39 + Static569.aClass262_9.method5836() / 2;
		}
		local59 = arg1.anInt5489 + local18 / 2;
		if (local18 + Static157.anInt2662 > local34) {
			local34 = Static157.anInt2662;
			local59 = local18 / 2 + Static157.anInt2662 + local41 / 2 + 10 + 5;
		} else if (local34 > Static157.anInt2668 - local18) {
			local34 = Static157.anInt2668 - local18;
			local59 = Static157.anInt2668 - local41 / 2 - local18 / 2 - 10 - 5;
		}
		@Pc(170) int local170 = arg1.anInt5488;
		if (Static157.anInt2664 + local18 > local37) {
			local37 = Static157.anInt2664;
			local170 = local18 / 2 + Static157.anInt2664 + 10;
		} else if (Static157.anInt2667 - local18 < local37) {
			local170 = Static157.anInt2667 - local43 - local18 / 2 - 10;
			local37 = Static157.anInt2667 - local18;
		}
		local82 = (int) (Math.atan2((double) (local34 - arg1.anInt5489), (double) (local37 - arg1.anInt5488)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local12.method7960((float) local34 + (float) local18 / 2.0F, (float) local37 + (float) local18 / 2.0F, 4096, local82);
		@Pc(260) int local260 = -2;
		@Pc(262) int local262 = -2;
		@Pc(264) int local264 = -2;
		@Pc(266) int local266 = -2;
		if (arg2.aString255 != null) {
			local260 = local59 - local41 / 2 - 5;
			local262 = local170;
			local266 = local170 + Static569.aClass262_9.method5833() * local39 + 3;
			local264 = local41 + local260 + 10;
			if (arg2.anInt9719 != 0) {
				arg0.method8094(local170, local260, local266 - local170, -local260 + local264, arg2.anInt9719);
			}
			if (arg2.anInt9721 != 0) {
				arg0.method8084(arg2.anInt9721, local266 - local170, -local260 + local264, local260, local170);
			}
			for (@Pc(335) int local335 = 0; local335 < local39; local335++) {
				@Pc(341) String local341 = Static243.aStringArray43[local335];
				if (local39 - 1 > local335) {
					local341 = local341.substring(0, local341.length() - 4);
				}
				Static569.aClass262_9.method5837(arg0, local341, local59, local170, arg2.anInt9736);
				local170 += Static569.aClass262_9.method5833();
			}
		}
		if (arg2.anInt9741 == -1 && arg2.aString255 == null) {
			return;
		}
		local18 >>= 0x1;
		@Pc(388) Class3_Sub21 local388 = new Class3_Sub21(arg1);
		local388.anInt3732 = local18 + local37;
		local388.anInt3733 = local34 + local18;
		local388.anInt3735 = local266;
		local388.anInt3728 = local37 - local18;
		local388.anInt3730 = local260;
		local388.anInt3734 = local34 - local18;
		local388.anInt3737 = local264;
		local388.anInt3729 = local262;
		Static448.aClass244_72.method5570(local388);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIII)V")
	public static void method6553(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static112.anInt2687 && Static333.anInt6022 >= arg1) {
			@Pc(23) int local23 = Static4.method56(arg0, Static384.anInt6641, Static191.anInt4134);
			@Pc(29) int local29 = Static4.method56(arg2, Static384.anInt6641, Static191.anInt4134);
			Static269.method4097(local29, arg1, local23, arg3);
		}
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(Z)V")
	public static void method6555() {
		@Pc(9) Class342 local9 = Static589.aClass342_203;
		synchronized (Static589.aClass342_203) {
			Static589.aClass342_203.method7687();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "Lclient!d;")
	public static Interface1 anInterface1_10;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Lclient!el;")
	public static final Class109 aClass109_180 = new Class109(36, -1);

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "Lclient!ef;")
	public static final Class102 aClass102_60 = new Class102();

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public static void method7451() {
		for (@Pc(18) Class5_Sub5_Sub9 local18 = (Class5_Sub5_Sub9) Static480.aClass102_51.method1916(); local18 != null; local18 = (Class5_Sub5_Sub9) Static480.aClass102_51.method1915()) {
			@Pc(23) Class8_Sub1_Sub3_Sub5 local23 = local18.aClass8_Sub1_Sub3_Sub5_1;
			if (local23.aBoolean740) {
				local18.method9327(1);
				local23.method8234(-116);
			} else if (local23.anInt9603 <= Static44.anInt740) {
				local23.method8237((byte) 117, Static315.anInt5591);
				if (local23.aBoolean740) {
					local18.method9327(1);
				} else {
					Static270.method4024(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIB[I)Z")
	public static boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int[] arg5) {
		if (Static5.anInt9541 < arg2) {
			arg2 = Static5.anInt9541;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg3 >= arg2) {
			return true;
		}
		@Pc(38) int local38 = arg2 - arg3 >> 2;
		arg1 += arg3 - 1;
		arg0 += arg4 * arg3;
		@Pc(88) int local88;
		@Pc(85) int local85;
		@Pc(68) int local68;
		if (Static49.anInt6793 == 1) {
			Static224.anInt3656 += local38;
			while (true) {
				local38--;
				if (local38 < 0) {
					local38 = arg2 - arg3 & 0x3;
					while (true) {
						local38--;
						if (local38 < 0) {
							return true;
						}
						arg1++;
						if (arg5[arg1] > arg0) {
							arg5[arg1] = arg0;
						}
						arg0 += arg4;
					}
				}
				local68 = arg1 + 1;
				if (arg5[local68] > arg0) {
					arg5[local68] = arg0;
				}
				local85 = arg0 + arg4;
				local68++;
				if (local85 < arg5[local68]) {
					arg5[local68] = local85;
				}
				local85 += arg4;
				local88 = ~local85;
				local68++;
				if (local88 > ~arg5[local68]) {
					arg5[local68] = local85;
				}
				local85 += arg4;
				arg1 = local68 + 1;
				if (local85 < arg5[arg1]) {
					arg5[arg1] = local85;
				}
				arg0 = local85 + arg4;
			}
		} else {
			arg0 -= 38400;
			while (true) {
				local38--;
				if (local38 < 0) {
					local38 = arg2 - arg3 & 0x3;
					while (true) {
						local38--;
						if (local38 < 0) {
							return true;
						}
						arg1++;
						if (arg0 < arg5[arg1]) {
							return false;
						}
						arg0 += arg4;
					}
				}
				local68 = arg1 + 1;
				if (arg5[local68] > arg0) {
					return false;
				}
				local85 = arg0 + arg4;
				local88 = ~local85;
				local68++;
				if (local88 > ~arg5[local68]) {
					return false;
				}
				local85 += arg4;
				local68++;
				if (local85 < arg5[local68]) {
					return false;
				}
				local85 += arg4;
				local88 = ~local85;
				arg1 = local68 + 1;
				if (local88 > ~arg5[arg1]) {
					return false;
				}
				arg0 = local85 + arg4;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)V")
	public static void method7453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 != 8 && arg5 != 16) {
			@Pc(175) Class174 local175 = Static260.aClass174ArrayArrayArray2[arg0][arg1][arg2];
			if (local175 == null) {
				local175 = new Class174(arg0);
			}
			if (arg5 == 1) {
				local175.aShort52 = (short) arg4;
				local175.aShort53 = (short) arg3;
			} else if (arg5 == 2) {
				local175.aShort50 = (short) arg3;
				local175.aShort51 = (short) arg4;
			}
			if (Static526.aBoolean668) {
				Static374.method5472();
			}
			return;
		}
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(54) int local54;
		@Pc(66) int local66;
		if (arg5 != 8) {
			local33 = (arg1 << Static611.anInt10115) + Static88.anInt7739;
			local38 = local33 - Static88.anInt7739;
			local42 = arg2 << Static611.anInt10115;
			local46 = local42 + Static88.anInt7739;
			local54 = Static220.aClass22Array2[arg0].method8038(arg2, arg1 + 1);
			local66 = Static220.aClass22Array2[arg0].method8038(arg2 + 1, arg1);
			Static265.aClass337Array3[Static603.anInt10076++] = new Class337(arg5, arg0, local33, local38, local38, local33, local54, local66, local66 - arg3, -arg3 + local54, local42, local46, local46, local42);
			return;
		}
		local33 = arg1 << Static611.anInt10115;
		local38 = local33 + Static88.anInt7739;
		local42 = arg2 << Static611.anInt10115;
		local46 = local42 + Static88.anInt7739;
		local54 = Static220.aClass22Array2[arg0].method8038(arg2, arg1);
		local66 = Static220.aClass22Array2[arg0].method8038(arg2 + 1, arg1 + 1);
		Static265.aClass337Array3[Static603.anInt10076++] = new Class337(arg5, arg0, local33, local38, local38, local33, local54, local66, local66 - arg3, local54 + -arg3, local42, local46, local46, local42);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!jk", name = "x", descriptor = "Lclient!la;")
	public static Class196 aClass196_49;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "Z")
	public static boolean aBoolean326 = false;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
	public static void method4420(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub4_Sub5 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class51 local8 = Static559.aClass51Array4[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static293.anInt5181; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static569.anInt9425; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static308.anInt5834;
							@Pc(32) int local32 = local12 << Static308.anInt5834;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class51 local41 = Static559.aClass51Array4[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7835(local15, local12) - local41.method7835(local15, local12);
									@Pc(71) int local71 = local8.method7835(local15 + 1, local12) - local41.method7835(local15 + 1, local12);
									@Pc(91) int local91 = local8.method7835(local15 + 1, local12 + 1) - local41.method7835(local15 + 1, local12 + 1);
									@Pc(107) int local107 = local8.method7835(local15, local12 + 1) - local41.method7835(local15, local12 + 1);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)I")
	public static int method4423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 <= arg2) {
			return arg2 > arg1 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)V")
	public static void method4426(@OriginalArg(1) int arg0) {
		Static312.anInt5904 = arg0;
		Static174.aClass102_21.method2681();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZILjava/lang/String;I)Z")
	public static boolean method4429(@OriginalArg(2) String arg0) {
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = arg0.length();
		for (@Pc(44) int local44 = 0; local44 < local42; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local44 == 0) {
				if (local50 == '-') {
					local35 = true;
					continue;
				}
				if (local50 == '+') {
					continue;
				}
			}
			@Pc(85) int local85;
			if (local50 >= '0' && local50 <= '9') {
				local85 = local50 - '0';
			} else if (local50 >= 'A' && local50 <= 'Z') {
				local85 = local50 - '7';
			} else if (local50 >= 'a' && local50 <= 'z') {
				local85 = local50 - 'W';
			} else {
				return false;
			}
			if (local85 >= 10) {
				return false;
			}
			if (local35) {
				local85 = -local85;
			}
			@Pc(121) int local121 = local85 + local39 * 10;
			if (local39 != local121 / 10) {
				return false;
			}
			local39 = local121;
			local37 = true;
		}
		return local37;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(BI)Lclient!im;")
	public static Class159 method4430(@OriginalArg(1) int arg0) {
		@Pc(15) Class159 local15 = (Class159) Static180.aClass102_23.method2677((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static32.aClass196_87.method5102(0, arg0);
		local15 = new Class159();
		if (local25 != null) {
			local15.method4006(new Class3_Sub3(local25), arg0);
		}
		Static180.aClass102_23.method2674((long) arg0, local15);
		return local15;
	}
}

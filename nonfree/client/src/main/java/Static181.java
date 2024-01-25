import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
	public static int anInt3544;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "Lclient!es;")
	public static Class71 aClass71_1;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "[I")
	public static int[] anIntArray311;

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
	public static int anInt3543 = 100;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIII)V")
	public static void method2904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static440.aClass106ArrayArrayArray3 == null) {
			return;
		}
		@Pc(23) long local23 = (long) (arg0 << 28 | arg1 << 14 | arg2);
		@Pc(29) Class2_Sub14 local29 = (Class2_Sub14) Static132.aClass163_13.method3769(local23);
		if (local29 == null) {
			Static421.method5583(arg0, arg2, arg1);
			return;
		}
		@Pc(43) Class2_Sub31 local43 = (Class2_Sub31) local29.aClass14_22.method309();
		if (local43 == null) {
			Static421.method5583(arg0, arg2, arg1);
			return;
		}
		@Pc(57) Class3_Sub4_Sub1 local57 = (Class3_Sub4_Sub1) Static421.method5583(arg0, arg2, arg1);
		if (local57 == null) {
			local57 = new Class3_Sub4_Sub1();
		} else {
			local57.anInt4307 = local57.anInt4304 = -1;
		}
		local57.anInt4312 = local43.anInt5175;
		local57.anInt4311 = local43.anInt5174;
		label44: while (true) {
			@Pc(85) Class2_Sub31 local85 = (Class2_Sub31) local29.aClass14_22.method311();
			if (local85 == null) {
				break;
			}
			if (local57.anInt4312 != local85.anInt5175) {
				local57.anInt4308 = local85.anInt5174;
				local57.anInt4307 = local85.anInt5175;
				while (true) {
					@Pc(106) Class2_Sub31 local106 = (Class2_Sub31) local29.aClass14_22.method311();
					if (local106 == null) {
						break label44;
					}
					if (local57.anInt4312 != local106.anInt5175 && local106.anInt5175 != local57.anInt4307) {
						local57.anInt4310 = local106.anInt5174;
						local57.anInt4304 = local106.anInt5175;
					}
				}
			}
		}
		@Pc(146) int local146 = Static85.method1695(arg0, (arg1 << 7) + 64, (arg2 << 7) + 64);
		Static284.method4121(arg0, arg2, arg1, local146, local57);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method2905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class106 local7 = Static440.aClass106ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class4 local13 = local7.aClass4_3; local13 != null; local13 = local13.aClass4_1) {
			@Pc(17) Class3_Sub2 local17 = local13.aClass3_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort85 == arg1 && local17.aShort86 == arg2) {
				Static269.method4019(local17);
				return;
			}
		}
	}
}

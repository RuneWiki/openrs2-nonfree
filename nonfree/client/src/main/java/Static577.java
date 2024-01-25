import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_109 = new Class387(46, 2);

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!df;)V")
	public static void method8285(@OriginalArg(0) Class8_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
			@Pc(8) Class8_Sub1 local8 = null;
			for (@Pc(12) Class8_Sub1 local12 = Static494.aClass8_Sub1Array3[local5]; local12 != null; local12 = local12.aClass8_Sub1_23) {
				if (local12 == arg0) {
					if (local8 == null) {
						Static494.aClass8_Sub1Array3[local5] = local12.aClass8_Sub1_23;
					} else {
						local8.aClass8_Sub1_23 = local12.aClass8_Sub1_23;
					}
					Static554.aBoolean714 = true;
					return;
				}
				local8 = local12;
			}
			local8 = null;
			for (@Pc(47) Class8_Sub1 local47 = Static607.aClass8_Sub1Array4[local5]; local47 != null; local47 = local47.aClass8_Sub1_23) {
				if (local47 == arg0) {
					if (local8 == null) {
						Static607.aClass8_Sub1Array4[local5] = local47.aClass8_Sub1_23;
					} else {
						local8.aClass8_Sub1_23 = local47.aClass8_Sub1_23;
					}
					Static554.aBoolean714 = true;
					return;
				}
				local8 = local47;
			}
			local8 = null;
			for (@Pc(82) Class8_Sub1 local82 = Static654.aClass8_Sub1Array5[local5]; local82 != null; local82 = local82.aClass8_Sub1_23) {
				if (local82 == arg0) {
					if (local8 == null) {
						Static654.aClass8_Sub1Array5[local5] = local82.aClass8_Sub1_23;
					} else {
						local8.aClass8_Sub1_23 = local82.aClass8_Sub1_23;
					}
					Static554.aBoolean714 = true;
					return;
				}
				local8 = local82;
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIII)V")
	public static void method8286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class5_Sub5_Sub6 local9 = Static478.method6972((long) arg0, 10);
		local9.method2687();
		local9.anInt3059 = arg2;
		local9.anInt3064 = arg1;
		local9.anInt3058 = arg3;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)V")
	public static void method8287(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub5_Sub6 local9 = Static478.method6972((long) arg0, 1);
		local9.method2686();
	}
}

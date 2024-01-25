import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
	public static int anInt8413 = 0;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[Lclient!vp;I)V")
	public static void method7107(@OriginalArg(0) int arg0, @OriginalArg(1) Class309[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(6) Class309 local6 = arg1[local1];
			if (local6 != null) {
				if (local6.anInt8802 == 0) {
					if (local6.lb != null) {
						method7107(arg0, local6.lb);
					}
					@Pc(30) Class1_Sub5 local30 = (Class1_Sub5) Static484.aClass174_32.method4422((long) local6.anInt8750);
					if (local30 != null) {
						Static16.method808(arg0, local30.anInt1389);
					}
				}
				@Pc(46) Class1_Sub40 local46;
				if (arg0 == 0 && local6.anObjectArray21 != null) {
					local46 = new Class1_Sub40();
					local46.aClass309_10 = local6;
					local46.anObjectArray5 = local6.anObjectArray21;
					Static387.method5838(local46);
				}
				if (arg0 == 1 && local6.anObjectArray34 != null) {
					if (local6.anInt8726 >= 0) {
						@Pc(74) Class309 local74 = Static80.method2005(local6.anInt8750);
						if (local74 == null || local74.lb == null || local74.lb.length <= local6.anInt8726 || local6 != local74.lb[local6.anInt8726]) {
							continue;
						}
					}
					local46 = new Class1_Sub40();
					local46.aClass309_10 = local6;
					local46.anObjectArray5 = local6.anObjectArray34;
					Static387.method5838(local46);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIB[B)Z")
	public static boolean method7108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(14) int local14 = arg0 % 8;
		@Pc(24) int local24;
		if (local14 == 0) {
			local24 = 0;
		} else {
			local24 = 8 - local14;
		}
		@Pc(37) int local37 = -((arg1 + 7) / 8);
		@Pc(47) int local47 = -((arg0 + 8 - 1) / 8);
		for (@Pc(49) int local49 = local37; local49 < 0; local49++) {
			for (@Pc(53) int local53 = local47; local53 < 0; local53++) {
				if (arg4[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local24;
			if (arg4[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BII)Z")
	public static boolean method7109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static489.method7072(arg1, arg0) & Static48.method1462(arg1, arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lclient!nfa;ZZ)V")
	public static void method4828(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean789 = arg1;
		if (Static27.aBoolean27) {
			Static647.aClass119Array1[Static647.aClass119Array1.length - 1].method3564(arg0);
		} else {
			Static244.method9721(arg0, Static218.aClass2_Sub13Array3);
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lclient!nba;IIII)V")
	public static void method4829(@OriginalArg(0) Class2_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg1 << 14 | arg2 << 28 | arg3);
		@Pc(24) Class2_Sub47 local24 = (Class2_Sub47) Static18.aClass335_2.method8357(local16);
		if (local24 == null) {
			local24 = new Class2_Sub47();
			Static18.aClass335_2.method8356(local24, local16);
			local24.aClass271_57.method7174(arg0);
			return;
		}
		@Pc(47) Class351 local47 = Static372.aClass343_1.method8549(arg0.anInt7375);
		@Pc(50) int local50 = local47.anInt10197;
		if (local47.anInt10211 == 1) {
			local50 *= arg0.anInt7377 + 1;
		}
		for (@Pc(69) Class2_Sub41 local69 = (Class2_Sub41) local24.aClass271_57.method7177(); local69 != null; local69 = (Class2_Sub41) local24.aClass271_57.method7175()) {
			local47 = Static372.aClass343_1.method8549(local69.anInt7375);
			@Pc(80) int local80 = local47.anInt10197;
			if (local47.anInt10211 == 1) {
				local80 *= local69.anInt7377 + 1;
			}
			if (local50 > local80) {
				Static183.method3563(local69, arg0);
				return;
			}
		}
		local24.aClass271_57.method7174(arg0);
	}
}

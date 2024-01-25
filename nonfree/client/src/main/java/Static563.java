import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!te", name = "L", descriptor = "J")
	public static long aLong263;

	@OriginalMember(owner = "client!te", name = "u", descriptor = "Z")
	public static boolean aBoolean781 = false;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7755(@OriginalArg(1) String arg0) {
		if (Static243.aClass375Array1 != null) {
			@Pc(22) Class5_Sub21 local22 = Static64.method905(Static263.aClass49_1, Static406.aClass305_61);
			local22.aClass5_Sub41_Sub2_1.method7798(Static314.method4952(arg0));
			local22.aClass5_Sub41_Sub2_1.method7854(arg0);
			Static495.method7092(local22);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!vba;)V")
	public static void method7756(@OriginalArg(1) Class5_Sub3_Sub20 arg0) {
		if (Static493.aBoolean702) {
			return;
		}
		arg0.method9052();
		Static483.anInt8099--;
		if (!arg0.aBoolean871) {
			@Pc(78) long local78 = arg0.aLong290;
			@Pc(84) Class5_Sub3_Sub15 local84;
			for (local84 = (Class5_Sub3_Sub15) Static254.aClass300_18.method7188(local78); local84 != null && !local84.aString76.equals(arg0.aString101); local84 = (Class5_Sub3_Sub15) Static254.aClass300_18.method7187()) {
			}
			if (local84 != null && local84.method6809(arg0)) {
				Static441.method6441(local84);
			}
			return;
		}
		for (@Pc(26) Class5_Sub3_Sub15 local26 = (Class5_Sub3_Sub15) Static609.aClass358_13.method8322(); local26 != null; local26 = (Class5_Sub3_Sub15) Static609.aClass358_13.method8328()) {
			if (local26.aString76.equals(arg0.aString101)) {
				@Pc(35) boolean local35 = false;
				for (@Pc(41) Class5_Sub3_Sub20 local41 = (Class5_Sub3_Sub20) local26.aClass358_7.method8322(); local41 != null; local41 = (Class5_Sub3_Sub20) local26.aClass358_7.method8328()) {
					if (arg0 == local41) {
						local35 = true;
						if (local26.method6809(arg0)) {
							Static441.method6441(local26);
						}
						break;
					}
				}
				if (local35) {
					return;
				}
			}
		}
	}
}

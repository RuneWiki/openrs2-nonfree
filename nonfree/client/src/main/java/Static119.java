import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
	public static int anInt1885 = -1;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZLclient!wu;ILjava/lang/String;)Lclient!ws;")
	public static Class383 method1739(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg1.method8890(arg2);
		if (local10 == -1) {
			return new Class383(0);
		}
		@Pc(23) int[] local23 = arg1.method8881(local10);
		@Pc(29) Class383 local29 = new Class383(local23.length);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		while (true) {
			while (local29.anInt10429 > local31) {
				@Pc(47) Class5_Sub12 local47 = new Class5_Sub12(arg1.method8885(local10, local23[local33++]));
				@Pc(51) int local51 = local47.method8623();
				@Pc(55) int local55 = local47.method8631();
				@Pc(59) int local59 = local47.method8645();
				if (!arg0 && local59 == 1) {
					local29.anInt10429--;
				} else {
					local29.anIntArray839[local31] = local51;
					local29.anIntArray840[local31] = local55;
					local31++;
				}
			}
			return local29;
		}
	}
}

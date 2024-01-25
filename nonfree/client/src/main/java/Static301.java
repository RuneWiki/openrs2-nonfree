import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!jia", name = "o", descriptor = "I")
	public static int anInt10214;

	@OriginalMember(owner = "client!jia", name = "p", descriptor = "Z")
	public static boolean aBoolean883 = true;

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(CB)C")
	public static char method8953(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(ZIBIZ)I")
	public static int method8954(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class2_Sub3 local18 = Static549.method7662(-114, false, arg2);
		if (local18 == null) {
			return 0;
		}
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local18.anIntArray28.length; local27++) {
			if (local18.anIntArray28[local27] >= 0 && local18.anIntArray28[local27] < Static543.aClass37_2.anInt613) {
				@Pc(56) Class203 local56 = Static543.aClass37_2.method605(local18.anIntArray28[local27]);
				@Pc(66) int local66 = local56.method4411(arg1, Static97.aClass328_2.method7810(arg1).anInt376);
				if (arg0) {
					local25 += local18.anIntArray29[local27] * local66;
				} else {
					local25 += local66;
				}
			}
		}
		return local25;
	}
}

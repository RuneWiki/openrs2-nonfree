import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_153 = new Class40("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_98 = new Class236(29, -1);

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_99 = new Class236(5, 7);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(CZ)Z")
	public static boolean method7292(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(29) char[] local29 = Static395.aCharArray7;
			for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
				@Pc(37) char local37 = local29[local31];
				if (local37 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLclient!co;)Lclient!ot;")
	public static Class52_Sub4 method7294(@OriginalArg(1) Class5_Sub3 arg0) {
		return new Class52_Sub4(arg0.method4212(), arg0.method4212(), arg0.method4212(), arg0.method4212(), arg0.method4182(), arg0.method4182(), arg0.method4220());
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static657 {

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V")
	public static void method8944() {
		Static554.anIntArray624 = null;
		Static93.anIntArray460 = null;
		Static220.anIntArray211 = null;
		Static115.anIntArray123 = null;
		Static346.aBoolean393 = false;
		Static217.anIntArray209 = null;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)V")
	public static void method8945(@OriginalArg(0) int arg0) {
		if (!Static506.method7223(arg0)) {
			return;
		}
		@Pc(18) Class321[] local18 = Static109.aClass321ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class321 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt9099 = 1;
				local26.anInt9012 = 0;
				local26.anInt9010 = 0;
			}
		}
	}
}

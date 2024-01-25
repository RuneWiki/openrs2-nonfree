import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class307 {

	@OriginalMember(owner = "client!sfa", name = "q", descriptor = "[Lclient!oe;")
	private static final Class238[] aClass238Array1 = new Class238[32];

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "Lclient!ka;")
	public Class92 aClass92_4;

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "Lclient!r;")
	public Class6_Sub5_Sub10 aClass6_Sub5_Sub10_3;

	static {
		@Pc(77) Class238[] local77 = Static486.method8550();
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass238Array1[local77[local79].anInt7405] = local77[local79];
		}
	}
}

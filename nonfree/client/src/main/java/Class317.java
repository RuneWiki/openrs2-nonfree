import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class317 {

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "[I")
	public static final int[] anIntArray765;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
	public int anInt9352;

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
	public int anInt9354;

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "Z")
	public boolean aBoolean676;

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
	public int anInt9356;

	static {
		new Class202("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
		anIntArray765 = new int[120];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 120; local20++) {
			@Pc(25) int local25 = local20 + 1;
			@Pc(38) int local38 = (int) ((double) local25 + Math.pow(2.0D, (double) local25 / 7.0D) * 300.0D);
			local18 += local38;
			anIntArray765[local20] = local18 / 4;
		}
	}
}
